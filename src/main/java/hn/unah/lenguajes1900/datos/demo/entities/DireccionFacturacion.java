package hn.unah.lenguajes1900.datos.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity //Anotación de entidad
@Table(name = "direccionfacturacion")
@Data
public class DireccionFacturacion {
    
    @Id //declaracion de llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Que el campo será auto incremental
    @Column(name = "iddireccion")
    private long idDireccion;

    private String pais;

    private String estado;

    private String ciudad;

    @JsonIgnore
    @OneToOne(mappedBy = "direccionFacturacion")
    private Usuario usuario;

}
