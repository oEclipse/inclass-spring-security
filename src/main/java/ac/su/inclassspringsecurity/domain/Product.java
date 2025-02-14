package ac.su.inclassspringsecurity.domain;

import ac.su.inclassspringsecurity.constant.ProductStatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private int stockCount;
    @Column(nullable = false)
    private ProductStatusEnum status;
    // 등록 및 수정 시각
    @Column(nullable = false)
    private String createdAt;
    @Column(nullable = false)
    private String updatedAt;

    // 추가 데이터 컬럼


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockCount=" + stockCount +
                ", status=" + status +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
