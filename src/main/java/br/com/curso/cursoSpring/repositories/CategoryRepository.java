package br.com.curso.cursoSpring.repositories;

import br.com.curso.cursoSpring.entities.Category;
import br.com.curso.cursoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
