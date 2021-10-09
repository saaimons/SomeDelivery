package ar.com.phoenos.SomeDelivery.Repositorios;

import ar.com.phoenos.SomeDelivery.Entidades.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, String> {
}