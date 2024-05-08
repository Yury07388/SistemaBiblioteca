package com.Biblioteca.SistemaBiblioteca.repository;

import com.Biblioteca.SistemaBiblioteca.entity.livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface livrosRepository extends JpaRepository<livros, Long> {
}
