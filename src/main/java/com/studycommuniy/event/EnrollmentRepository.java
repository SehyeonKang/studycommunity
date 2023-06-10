package com.studycommuniy.event;

import com.studycommuniy.domain.Account;
import com.studycommuniy.domain.Enrollment;
import com.studycommuniy.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    boolean existsByEventAndAccount(Event event, Account account);

    Enrollment findByEventAndAccount(Event event, Account account);
}
