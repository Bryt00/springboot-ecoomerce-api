package com.ravendev.ecomm.service.product;

import com.ravendev.ecomm.model.Product;
import com.ravendev.ecomm.requests.AddProductRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest  product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brandName);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name );
    Long countProductsByBrandAndName(String brand, String name);




}
