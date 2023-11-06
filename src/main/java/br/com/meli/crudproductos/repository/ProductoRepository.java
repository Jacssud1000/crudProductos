package br.com.meli.crudproductos.repository;

import br.com.meli.crudproductos.model.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoModel, Long> {
}
