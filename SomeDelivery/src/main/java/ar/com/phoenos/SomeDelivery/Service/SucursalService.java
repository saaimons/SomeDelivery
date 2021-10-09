package ar.com.phoenos.SomeDelivery.Service;

import ar.com.phoenos.SomeDelivery.Entidades.Sucursal;
import ar.com.phoenos.SomeDelivery.Repositorios.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalService implements CRUD<Sucursal> {
    @Autowired
    SucursalRepository sucursalRepository;


    @Override
    public void nuevo(Sucursal sucursal) {

    }

    @Override
    public void eliminar(Sucursal sucursal) {

    }
}
