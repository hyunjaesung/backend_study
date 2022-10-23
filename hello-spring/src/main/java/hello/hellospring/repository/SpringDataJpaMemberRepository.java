package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 스프링 데이터 jpa에선 인터페이스만 만들면 끝이 나버린다
// JpaRepository 을 상속받으면 자동으로 구현체를 만들어 버리는데 이걸 가져다 쓰면된다
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    @Override
    Optional<Member> findByName(String name);
}
