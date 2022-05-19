package hello.hellospring.repository;
import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore(); // 테스트 한번 하면 클리어를 해야된다
    }

    @Test // 이걸 적어주자 그냥 돌리면 실행된다
    public void save() {
        //given
        Member member = new Member();
        member.setName("spring");

        //when
        repository.save(member);
        //then
        Member result = repository.findById(member.getId()).get();
        assertThat(result).isEqualTo(member);
        // 옵션 + 엔터 눌러서 스태틱임포트로 바꿔자
    }

    @Test
    public void findByName() {
        //given
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member(); // 복붙하고 쉬프트 + F6하면 리네임된다
        member2.setName("spring2");
        repository.save(member2);

        //when
        Member result = repository.findByName("spring1").get();
        //then
        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        //given
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring1");
        repository.save(member2);


        //when
        List<Member> result = repository.findAll();
        //then
        assertThat(result.size()).isEqualTo(2);
    }
}
