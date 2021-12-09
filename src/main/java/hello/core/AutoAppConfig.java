package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

// 보통 설정 정보(AppConfig)를 컴포넌트 스캔 대상에서 제외하지는 않지만, 기존 예제 코드를 최대한 유지하기 위해서 제외해줌
@Configuration
@ComponentScan(
//        basePackages = "hello.core.member", -> 탐색할 패키지의 시작 위치를 지정
//        basePackageClasses = AutoAppConfig.class, -> 지정한 클래스의 패키지를 탐색 시작 위치로 지정
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    // 수동 빈 등록으로 자동 빈 등록과 충돌이 나게끔
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }

}
