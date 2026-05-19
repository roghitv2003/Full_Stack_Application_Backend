package com.spring.spring_app_db.service;

import com.spring.spring_app_db.model.Product;
import com.spring.spring_app_db.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImgName(imageFile.getOriginalFilename());
        product.setImgType(imageFile.getContentType());
        product.setImgData(imageFile.getBytes());
        return repo.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
        product.setImgName(imageFile.getOriginalFilename());
        product.setImgType(imageFile.getContentType());
        product.setImgData(imageFile.getBytes());
        return repo.save(product);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
