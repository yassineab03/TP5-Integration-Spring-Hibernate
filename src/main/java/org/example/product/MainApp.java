package org.example.product;


import org.example.product.config.AppConfig;
import org.example.product.entity.Product;
import org.example.product.service.ProductServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductServiceImpl productService = context.getBean(ProductServiceImpl.class);

        Product p = new Product("Microservice Gateway", 149.99);
        productService.addProduct(p);

        System.out.println("Produit ajouté avec succès ! Total en base : " + productService.getAllProducts().size());

        context.close();
    }
}