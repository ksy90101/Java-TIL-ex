package com.sonarqube.ex.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sonarqube.ex.domain.Member;

@Controller
public class MemberController {
    @PostMapping("/api/members")
    public ResponseEntity<Void> create(@RequestBody Member member){

        URI uri = URI.create("/api/members/" + member.getId());
        return ResponseEntity
                .created(uri)
                .build();
    }
}
