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
    private String id;
    private String nombre;
    private String descripcion;
    private String telefono;
    @OneToMany
    List<TipoComida> comida;


}
