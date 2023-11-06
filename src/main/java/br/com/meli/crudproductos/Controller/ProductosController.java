package br.com.meli.crudproductos.Controller;

import br.com.meli.crudproductos.model.ProductoModel;
import br.com.meli.crudproductos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public Iterable<ProductoModel> obtenerProductos() {
        return productoRepository.findAll();
    }

    @PostMapping
    public ProductoModel agregarProducto(@RequestBody ProductoModel producto) {
        return productoRepository.save(producto);
    }

    @PutMapping("/{id}")
    public ProductoModel actualizarProducto(@PathVariable Long id, @RequestBody ProductoModel producto) {
        producto.setId(id);
        return productoRepository.save(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoRepository.deleteById(id);
    }
}
