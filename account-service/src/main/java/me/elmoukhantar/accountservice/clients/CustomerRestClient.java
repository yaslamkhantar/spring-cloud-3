package me.elmoukhantar.accountservice.clients;

import me.elmoukhantar.accountservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CUSTOMER-SERVIE")
public interface CustomerRestClient {
    @GetMapping("ap1/custom/{id}")
    Customer findbyone(@PathVariable Long id);
}
