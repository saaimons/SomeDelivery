/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.phoenos.SomeDelivery.Entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.*;

/**
 *
 * @author xstone
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sucursales{
    @Id
    @Column(name = "id", nullable = false)
    private String id;
    private String Domicilio;
    private Date apertura;
    private Date cierre;


}
