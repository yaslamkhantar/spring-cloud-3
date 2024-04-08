package me.elmoukhantar.accountservice.clients;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import me.elmoukhantar.accountservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CUSTOMER-SERVIE")
public interface CustomerRestClient {
    @GetMapping("ap1/custom/{id}")
   // @CircuitBreaker(name = "customeservi" ,fallbackMethod = "getmessage")
    Customer findbyone(@PathVariable Long id);

   /* default Customer getmessage(Long id){
        Customer customer=new Customer();
        customer.setId(id);
        customer.setFirstname("server busy");
        customer.setLastname("--- busy");
        customer.setEmail("not available");
        return customer;
    }*/


}
