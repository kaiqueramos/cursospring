package br.com.curso.cursoSpring.config;

import br.com.curso.cursoSpring.entities.Category;
import br.com.curso.cursoSpring.entities.Order;
import br.com.curso.cursoSpring.entities.User;
import br.com.curso.cursoSpring.entities.enums.OrderStatus;
import br.com.curso.cursoSpring.repositories.CategoryRepository;
import br.com.curso.cursoSpring.repositories.OrderRepository;
import br.com.curso.cursoSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        User u1 = new User(null, "Maria", "maria@mail.com", "123456", "123123");
        User u2 = new User(null, "Alex", "alex@mail.com", "465897", "123");

        Order o1 = new Order(null, OrderStatus.PAID, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, OrderStatus.SHIPPED , Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, OrderStatus.DELIVERED , Instant.parse("2019-07-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}
