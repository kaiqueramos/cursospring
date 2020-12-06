package br.com.curso.cursoSpring.repositories;

import br.com.curso.cursoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
