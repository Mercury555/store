package net.store.controller;

import net.store.domain.Product;
import net.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping()

//    public Page<Product> getAll(@RequestParam(value = "pageNumber", defaultValue = "0") int page,
//                                @RequestParam(value = "pageSize", defaultValue = "10") int limit,
//                                @RequestParam(value = "order", defaultValue = "id") String orderBy) {
//
//        Page<Product> list = service.getAll(page, limit, orderBy);
//
//        return (Page) list.getContent();
//    }
    public List<Product> getAll() {



        return service.getAll();
    }
    @GetMapping("/count")
    public Long getCount() {
        return service.getCount();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable long id) {
        return service.getProductById(id);
    }

    @PostMapping("/{id}")
    public void save(@RequestBody Product product) {
        service.create(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        service.delete(id);
    }

    @PostMapping("/{id}")
    public void update(@RequestBody Product product, @PathVariable long id) {
        product.setId(id);
        service.create(product);
    }
}
