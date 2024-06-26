package start_spring.hello_spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import start_spring.hello_spring.domain.Member;
import start_spring.hello_spring.service.MemberService;

@Controller
public class MemberController {

    public final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
