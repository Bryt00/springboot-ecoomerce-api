package com.ravendev.ecomm.service.product;

import com.ravendev.ecomm.exceptions.ProductNotFoundException;
import com.ravendev.ecomm.model.Product;
import com.ravendev.ecomm.repository.ProductRepository;
import com.ravendev.ecomm.requests.AddProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {
    private final ProductRepository productRepository;

    @Override
    public Product addProduct(AddProductRequest request) {
        return null;
        }
private Product createProduct(AddProductRequest){
        return new Product(

        )
}
    /**
     * @param id
     * @return
     */
    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found!"));
    }

    /**
     * @param id
     */
    @Override
    public void deleteProductById(Long id) {
        productRepository.findById(id).ifPresentOrElse(productRepository::delete, () -> {
            throw new ProductNotFoundException("Product not found");
        });
    }

    @Override
    public void updateProduct(Product product, Long productId) {

    }

    /**
     * @return
     */
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * @param category
     * @return
     */
    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategoryName(category);
    }

    /**
     * @param brandName
     * @return
     */
    @Override
    public List<Product> getProductsByBrand(String brandName) {
        return productRepository.findByBrand(brandName );
    }

    /**
     * @param category
     * @param brand
     * @return
     */
    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return productRepository.findByCategoryNameAndBrand(category, brand);
    }

    /**
     * @param name
     * @return
     */
    @Override
    public List<Product> getProductsByName(String name) {
        return productRepository.findProductByName(name);
    }

    /**
     * @param brand
     * @param name
     * @return
     */
    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {
        return productRepository.findByBrandAndName(brand, name);
    }

    /**
     * @param brand
     * @param name
     * @return
     */
    @Override
    public Long countProductsByBrandAndName(String brand, String name) {

        return productRepository.countByBrandAndName(brand, name);
    }
}
