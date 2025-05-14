package com.mycompany.mavenproject3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
    private final Map<Integer, Product> productMap = new HashMap<>();
    private int nextId = 1;

    public List<Product> getAll() {
        return new ArrayList<>(productMap.values());
    }

    public Product get(int id) {
        return productMap.get(id);
    }

    public Product add(Product product) {
        product.setId(nextId);
        productMap.put(product.getId(), product);
        return product;
    }

    public Product update(int id, Product product) {
        product.setId(id);
        productMap.put(id, product);
        return product;
    }

    public boolean delete(int id) {
        return productMap.remove(id) != null;
    }
}