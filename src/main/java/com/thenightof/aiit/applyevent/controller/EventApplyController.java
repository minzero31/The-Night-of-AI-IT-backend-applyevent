package com.thenightof.aiit.applyevent.controller;

import com.thenightof.aiit.applyevent.dto.EventApplyRequest;
import com.thenightof.aiit.applyevent.dto.ApiResponse;
import com.thenightof.aiit.applyevent.dto.EventApplyResponse;
import com.thenightof.aiit.applyevent.service.EventApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/applyevent")
public class EventApplyController {

    @Autowired
    private EventApplyService eventApplyService;

    @PostMapping
    public ResponseEntity<?> applyEvent(@Valid @RequestBody EventApplyRequest applyRequest) {
        try {
            String result = eventApplyService.applyEvent(applyRequest);

            if ("이미 신청된 정보가 있습니다.".equals(result)) {
                return ResponseEntity.status(HttpStatus.CONFLICT).body(
                        new ApiResponse(result)
                );
            }

            return ResponseEntity.status(HttpStatus.CREATED).body(
                    new ApiResponse(result, new EventApplyResponse(applyRequest.getName(), applyRequest.getUserId()))
            );

        } catch (Exception e) {
            // 예외 메시지를 더 구체적으로 출력
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("입력 데이터가 유효하지 않습니다: " + e.getMessage()));
        }
    }
}
