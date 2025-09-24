package com.tienda_k.repository;

import com.tienda_k.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    public List<Categoria>findByActivoTrue();

    public List<Categoria> findByActivoTure();
    
}
