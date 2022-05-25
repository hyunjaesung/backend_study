package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
// 어노테이션을 보고 스프링이 컨트롤러를 생성하고 이걸 스프링 빈이 관리된다고 한다
public class MemberController {
//    private final MemberService = new MemberService();
    // 애는 이렇게 여기서 생성하는게 아니라 다른 곳에서 하나 만들고 돌려써야 한다

    private final MemberService memberService;

    @Autowired
    // 관리하는 서비스를 딱 연결 시켜주는 데 등록이 필요하다
    // MemberService 보면 그냥 순수한 자바 Class라서 스프링이 뭘 알 방법이 없다 -> @Service 로 등록
    // Repository도 @Autowired와 @Repository로 등록해주자
    public MemberController(MemberService memberService) { // 의존성 주입
        this.memberService = memberService;
    }
}
