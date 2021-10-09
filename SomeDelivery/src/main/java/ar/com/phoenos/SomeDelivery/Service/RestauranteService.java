package ar.com.phoenos.SomeDelivery.Service;

import ar.com.phoenos.SomeDelivery.Entidades.Restaurante;
import ar.com.phoenos.SomeDelivery.Repositorios.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestauranteService implements CRUD<Restaurante> {
    @Autowired
    RestauranteRepository restauranteRepository;

    @Override
    public void nuevo(Restaurante restaurante) {
        restauranteRepository.save(restaurante);
    }

    @Override
    public void eliminar(Restaurante restaurante) {
        restauranteRepository.delete(restaurante);
    }


}
