
package com.tienda_k.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;
    @Column(unique=true,nullable=false,length=50)
    @NotNull
    @Size(max=50)
  
    private String descripccion;
    @Column(length=1024)
    @NotNull
    @Size(max=1024)
    private String rutaImagen;
    private boolean activo;

}
