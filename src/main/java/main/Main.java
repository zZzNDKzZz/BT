package main;

import config.JPAConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.AccountService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JPAConfig.class);
        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.transferMoney(1, 2, 100);
    }
}
