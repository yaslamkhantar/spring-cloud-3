package me.elmoukhantar.customerservie.web;

import lombok.AllArgsConstructor;
import me.elmoukhantar.customerservie.entities.Customer;
import me.elmoukhantar.customerservie.repository.Customerrepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Customerweb {
    private Customerrepository customerrepository;

    @GetMapping("/ap1/customers")
    public List<Customer> findalll(){

        return customerrepository.findAll();
    }

    @GetMapping("ap1/custom/{id}")
    public Customer findbyone(@PathVariable Long id){

        return customerrepository.findById(id).get();
    }

}
