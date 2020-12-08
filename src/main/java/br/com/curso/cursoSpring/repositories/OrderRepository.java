package br.com.curso.cursoSpring.repositories;

import br.com.curso.cursoSpring.entities.Order;
import br.com.curso.cursoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
