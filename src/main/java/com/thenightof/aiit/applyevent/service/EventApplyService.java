package com.thenightof.aiit.applyevent.service;

import com.thenightof.aiit.applyevent.domain.apply.EventApply;
import com.thenightof.aiit.applyevent.dto.EventApplyRequest;
import com.thenightof.aiit.applyevent.repository.EventApplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventApplyService {

    @Autowired
    private EventApplyRepository repository;

    public String applyEvent(EventApplyRequest applyRequest) {
        // 중복 신청 여부 확인
        if (repository.existsByUserid(applyRequest.getUserId())) {
            return "이미 신청된 정보가 있습니다.";
        }

        // 신청 정보 저장
        EventApply eventApply = new EventApply();
        eventApply.setUserid(applyRequest.getUserId());
        eventApply.setName(applyRequest.getName());
        eventApply.setPhonenum(applyRequest.getPhonenum());
        eventApply.setBirthdate(applyRequest.getBirthdate());
        eventApply.setMembership_fee(applyRequest.getMembership_fee());
        eventApply.setIs_vegan(applyRequest.getIs_vegan());
        eventApply.setEmail(applyRequest.getEmail());

        repository.save(eventApply);

        return "신청이 성공적으로 완료되었습니다.";
    }
}
