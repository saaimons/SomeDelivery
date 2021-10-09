package ar.com.phoenos.SomeDelivery.Repositorios;

import ar.com.phoenos.SomeDelivery.Entidades.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, String> {
}