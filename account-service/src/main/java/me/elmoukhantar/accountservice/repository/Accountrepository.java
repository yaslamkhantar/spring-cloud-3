package me.elmoukhantar.accountservice.repository;

import me.elmoukhantar.accountservice.entities.Bankaccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Accountrepository extends JpaRepository<Bankaccount,String> {
}
