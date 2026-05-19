package com.spring.spring_app_db.repository;

import com.spring.spring_app_db.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    //public List<Product> findByBand(String)


}
//JPQL