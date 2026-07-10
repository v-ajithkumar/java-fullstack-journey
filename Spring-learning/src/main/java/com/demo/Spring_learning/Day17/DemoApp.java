//package com.demo.Spring_learning.Day17;
//
//import com.demo.Spring_learning.Day17.entity.User;
//import com.demo.Spring_learning.Day17.repository.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@SpringBootApplication
//public class DemoApp {
//    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(DemoApp.class, args);
//    }
//    @Bean
//    CommandLineRunner init(UserRepository repository,
//                           PasswordEncoder encoder) {
//
//        return args -> {
//
//            if (repository.findByUsername("ajith").isEmpty()) {
//
//                User user = new User();
//
//                user.setUsername("ajith");
//                user.setUserPassword(encoder.encode("admin123"));
//                user.setUserRole("ADMIN");
//
//                repository.save(user);
//            }
//        };
//    }
//}
