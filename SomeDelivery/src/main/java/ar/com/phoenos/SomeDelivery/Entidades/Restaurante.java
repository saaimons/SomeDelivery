/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.phoenos.SomeDelivery.Entidades;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author xstone
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Restaurante {
    @Id
    @Column(name = "id", nullable = false)
    @GenericGenerator(strategy = "uuid2",name = "uuid")
    @GeneratedValue(generator = "uuid")
    private String id;
    private String nombre;
    private String descripcion;
    private String moneda;
    private boolean estacionamiento;
    private String website;
    @OneToMany
    List<TipoComida> comida;
    @OneToMany
    List<Sucursal> sucursales;


}
