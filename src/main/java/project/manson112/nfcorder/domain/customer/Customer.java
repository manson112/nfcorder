package project.manson112.nfcorder.domain.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import project.manson112.nfcorder.domain.BaseTimeEntity;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Customer extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Column
    private String customerNm;

    @Column
    private Role role;

    public Customer(Long customerId, String customerNm, Role role) {
        this.customerId = customerId;
        this.customerNm = customerNm;
        this.role = role;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }
}
