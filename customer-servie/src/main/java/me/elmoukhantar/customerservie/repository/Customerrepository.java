package me.elmoukhantar.customerservie.repository;

import me.elmoukhantar.customerservie.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customerrepository extends JpaRepository<Customer,Long> {
}
