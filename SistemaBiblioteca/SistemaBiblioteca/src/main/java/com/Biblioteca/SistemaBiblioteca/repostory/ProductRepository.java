package com.Biblioteca.SistemaBiblioteca.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface ProductRepository extends JpaRepository<ProductRepository, UUID> {

}
