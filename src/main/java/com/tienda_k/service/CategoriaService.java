package com.tienda_k.service;

import com.tienda_k.domain.Categoria;
import com.tienda_k.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaService {
    //lo que sigue hace que el objeto se cree automaticamente
    //y solo una.. vez no hay dos en memoria
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Transactional(readOnly=true)
    public List<Categoria>getCategoria(boolean activo){
    if (activo){
    return categoriaRepository.findByActivoTure();
    }
    return categoriaRepository.findAll();
    }
}
