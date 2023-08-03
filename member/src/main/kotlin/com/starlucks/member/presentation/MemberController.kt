package com.starlucks.member.presentation

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class MemberController {

    @PostMapping(name = "회원 가입")
    fun signUp() {

    }

    @PostMapping("/email/check", name = "이메일 중복 확인")
    fun checkEmail() {

    }

    @PostMapping("/login", name = "회원 로그인")
    fun login() {

    }

    @PostMapping("/login", name = "회원 로그아웃")
    fun logout() {

    }

}