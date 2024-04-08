package me.elmoukhantar.accountservice.web;

import lombok.AllArgsConstructor;
import me.elmoukhantar.accountservice.clients.CustomerRestClient;
import me.elmoukhantar.accountservice.entities.Bankaccount;
import me.elmoukhantar.accountservice.repository.Accountrepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import me.elmoukhantar.accountservice.model.Customer;

import java.util.List;

@RestController

public class BankAccountweb {

    private Accountrepository accountrepository;

    private CustomerRestClient customerRestClient;

    public BankAccountweb(Accountrepository accountrepository,CustomerRestClient customerRestClient){
        this.customerRestClient=customerRestClient;
        this.accountrepository=accountrepository;
    }
    @GetMapping("/bankaccountts")
    public List<Bankaccount> findalll(){

        return accountrepository.findAll();
    }

    @GetMapping("/acc1/{id}")
    public Bankaccount findaccount(@PathVariable String id){
        Bankaccount bankaccount=accountrepository.findById(id).get();
        Customer customer=customerRestClient.findbyone(bankaccount.getCustomerid());
        bankaccount.setCustomer(customer);
        return bankaccount;


    }
}
