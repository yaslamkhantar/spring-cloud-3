package me.elmoukhantar.accountservice;

import me.elmoukhantar.accountservice.entities.Accounttype;
import me.elmoukhantar.accountservice.entities.Bankaccount;
import me.elmoukhantar.accountservice.repository.Accountrepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
@EnableFeignClients
public class AccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }
@Bean
    CommandLineRunner start(Accountrepository accountrepository){
        return args->{
          //  accountrepository.save(new Bankaccount(UUID.randomUUID().toString(),9800, LocalDate.now(),"MAD", Accounttype.CURRENT_ACCOUNT);
            Bankaccount bankaccount1=Bankaccount.builder().
                    accountid("kpokj")
                            .type(Accounttype.CURRENT_ACCOUNT)
                                    .createdAt(LocalDate.now())
                                            .banalnce(12600)
                                                    .customerid(Long.valueOf(1))
                                                            .currency("MAD").



                    build();
            //UUID.randomUUID().toString()
            Bankaccount bankaccount2=Bankaccount.builder().
                    accountid("m5149")
                    .type(Accounttype.CURRENT_ACCOUNT)
                    .createdAt(LocalDate.now())
                    .banalnce(920)
                    .customerid(Long.valueOf(2))
                    .currency("euro").



                    build();
            accountrepository.save(bankaccount1);
            accountrepository.save(bankaccount2);





        };
    }

}
