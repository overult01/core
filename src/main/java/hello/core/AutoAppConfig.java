package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

// 보통 설정 정보(AppConfig)를 컴포넌트 스캔 대상에서 제외하지는 않지만, 기존 예제 코드를 최대한 유지하기 위해서 제외해줌
@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {


}
