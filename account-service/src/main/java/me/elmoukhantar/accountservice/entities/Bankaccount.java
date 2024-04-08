package me.elmoukhantar.accountservice.entities;

import jakarta.persistence.*;
import lombok.*;
import me.elmoukhantar.accountservice.model.Customer;

import java.time.LocalDate;
@Entity
@NoArgsConstructor @AllArgsConstructor @ToString @Getter @Setter @Builder
public class Bankaccount {
    @Id
    private String accountid;
    private double banalnce;
    private LocalDate createdAt;
    private String currency;
@Enumerated(EnumType.STRING)
    private Accounttype type;
@Transient
private Customer customer;

private Long customerid;
}
