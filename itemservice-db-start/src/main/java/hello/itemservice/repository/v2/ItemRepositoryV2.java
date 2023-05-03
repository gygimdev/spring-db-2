package hello.itemservice.repository.v2;

import hello.itemservice.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

// JPA 상속 받으면 스프링에서 자동으로 빈으로 자동으로 주입시킨다.
public interface ItemRepositoryV2 extends JpaRepository<Item, Long> { }
