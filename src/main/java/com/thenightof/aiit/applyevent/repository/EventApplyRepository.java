package com.thenightof.aiit.applyevent.repository;

import com.thenightof.aiit.applyevent.domain.apply.EventApply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventApplyRepository extends JpaRepository<EventApply, String> {
    boolean existsByUserid(String userid);
}
