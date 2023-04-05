package com.springboot.blog.repository;

import com.springboot.blog.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class QueryMethodsTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void findByNameMethod() {

        Product product = productRepository.findByName("product 1");

        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());
    }

    @Test
    void findByNameOrDescriptionMethod() {

        List<Product> products = productRepository.findByNameOrDescription("product 1",
                "Product 1 description");

        products.forEach((p) -> {
            System.out.println(p.getId());
            System.out.println(p.getName());
        });
    }

    @Test
    void findByNameAndDescriptionMethod() {

        List<Product> products = productRepository.findByNameAndDescription("product 1",
                "Product 1 description");

        products.forEach((p) -> {
            System.out.println(p.getId());
            System.out.println(p.getName());
        });
    }

    @Test
    void findDistrictByNameMethod() {

        Product product = productRepository.findDistrictByName("product 1");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());
    }

    @Test
    void findByNameContainingMethod() {

        List<Product> products = productRepository.findByNameContaining("product 1");
        products.forEach((p) -> {
            System.out.println(p.getId());
            System.out.println(p.getName());
        });
    }

    @Test
    void findByNameLikeMethod() {

        List<Product> products = productRepository.findByNameLike("product 1");
        products.forEach((p) -> {
            System.out.println(p.getId());
            System.out.println(p.getName());
        });
    }

    @Test
    void findByNameInMethod() {

        List<Product> products = productRepository.findByNameIn(List.of("product 1", "product 2", "product3"));
        products.forEach((p) -> {
            System.out.println(p.getId());
            System.out.println(p.getName());
        });
    }

    @Test
    void findFirst2ByOrderByNameAscMethod() {

        List<Product> products = productRepository.findFirst2ByOrderByNameAsc();
        products.forEach((p) -> {
            System.out.println(p.getId());
            System.out.println(p.getName());
        });
    }
}
