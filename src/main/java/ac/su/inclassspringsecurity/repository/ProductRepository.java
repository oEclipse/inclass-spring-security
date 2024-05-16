package ac.su.inclassspringsecurity.repository;

import ac.su.inclassspringsecurity.constant.ProductStatusEnum;
import ac.su.inclassspringsecurity.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // 상품 쿼리 케이스 제어 (1) : 상품 이름에 따른 상품 조회
    List<Product> findByName(String name);
    // 구현부를 전혀 작성하지 않아도 JPA에서 약속된 이름의 메서드를 선언하기만 하면 구체적인 로직은 자동 생성

    // 상품 쿼리 케이스 제어 (2) : 상품 이름에 따른 상품 조회
    List<Product> findByStatus(ProductStatusEnum status);
}
