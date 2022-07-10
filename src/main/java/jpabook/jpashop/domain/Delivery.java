package jpabook.jpashop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Getter@Setter
public class Delivery {

    @Id@GeneratedValue
    @Column(name = "delivery_id")
    private Long id;
//OneToOne도 fetch를 LAZY로 해줘야 함
    @JsonIgnore
    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING) //무조건 스트링으로
    private DeleiveryStatus status; //READY, COMP
}
