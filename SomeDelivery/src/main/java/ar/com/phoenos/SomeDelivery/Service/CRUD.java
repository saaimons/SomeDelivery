package ar.com.phoenos.SomeDelivery.Service;

import java.util.List;

public interface CRUD<T> {
    void nuevo(T t);
    void eliminar(T t);
}
