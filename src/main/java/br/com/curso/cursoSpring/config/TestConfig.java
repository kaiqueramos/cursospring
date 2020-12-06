package br.com.curso.cursoSpring.config;

import br.com.curso.cursoSpring.entities.User;
import br.com.curso.cursoSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "maria@mail.com", "123456", "123123");
        User u2 = new User(null, "Alex", "alex@mail.com", "465897", "123");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
