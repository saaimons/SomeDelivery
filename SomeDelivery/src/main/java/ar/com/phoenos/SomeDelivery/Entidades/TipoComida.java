package ar.com.phoenos.SomeDelivery.Entidades;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoComida {
    @Id
    @Column(name = "id", nullable = false)
    private String id;
    private String nombre;
}
