package hello.hellospring;

import hello.hellospring.repository.JdbcMemberRepository;
import hello.hellospring.repository.MemberRepository;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Bean
    public MemberService memberService(){
        // MemberRepository 도 Bean 만들어서 등록해주자
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        // 바꿔치기!!
        //        return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
    }

    // Controller 는 원래 스프링이 관리하는거라서 따로 등록 필요 없다
    // Autowire 쓰면된다
}
