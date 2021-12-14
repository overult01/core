package hello.core.scan;

import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.AutoAppConfig;
import hello.core.order.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class AutoAppConfigTest {

    @Test
    void basicScan() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);

        // 필드 주입 방법(의존관계를 필드에 바로 넣어주는 방법, private 인데도 가능!)
//        OrderServiceImpl bean = ac.getBean(OrderServiceImpl.class);
//        MemberRepository memberRepository = bean.getMemberRepository();
//        System.out.println("memberRepository = " + memberRepository);
    }
}
