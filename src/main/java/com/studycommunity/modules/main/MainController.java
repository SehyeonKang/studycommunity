package com.studycommunity.modules.main;

import com.studycommunity.modules.account.CurrentAccount;
import com.studycommunity.modules.account.Account;
import com.studycommunity.modules.study.Study;
import com.studycommunity.modules.study.StudyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final StudyRepository studyRepository;

    @GetMapping("/")
    public String home(@CurrentAccount Account account, Model model) {
        if (account != null) {
            model.addAttribute(account);
        }

        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/search/study")
    public String searchStudy(String keyword, Model model) {
        List<Study> studyList = studyRepository.findByKeyword(keyword);
        model.addAttribute(studyList);
        model.addAttribute("keyword", keyword);
        // TODO Account attribute 추가해서 프로필 이미지 받기
        return "search";
    }
}
