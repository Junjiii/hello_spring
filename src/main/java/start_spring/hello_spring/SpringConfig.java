package start_spring.hello_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import start_spring.hello_spring.repository.JdbcMemberRepository;
import start_spring.hello_spring.repository.JdbcTemplateMemberRepository;
import start_spring.hello_spring.repository.MemberRepository;
import start_spring.hello_spring.repository.MemoryMemberRepository;
import start_spring.hello_spring.service.MemberService;

import javax.sql.DataSource;


@Configuration
public class SpringConfig {

    private final DataSource dataSource;
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
