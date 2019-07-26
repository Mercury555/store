package net.store.service;

import net.store.domain.Product;
import net.store.exception.ProductNotFoundException;
import net.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Page<Product> getAll(int page, int limit, String orderBy) {
        Sort sort = null;
        sort = new Sort(Sort.Direction.ASC, orderBy);
        Pageable pageable = PageRequest.of(page, limit, sort);
        Page<Product> data = repository.findAll(pageable);
        return data;
    }

    public void create(Product product) {
        repository.save(product);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

    public Long getCount() {
        return repository.count();
    }

    public Product getProductById(long id) {
        return repository.findById(id).orElseThrow(ProductNotFoundException::new);
    }
}
