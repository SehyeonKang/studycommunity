package com.studycommunity.modules.study.event;

import com.studycommunity.modules.study.Study;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEvent;

@Getter
@RequiredArgsConstructor
public class StudyCreatedEvent {

    private final Study study;

}
