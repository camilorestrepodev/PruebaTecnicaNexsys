package com.nexsysconnect.PruebaTecnicaJava.Service;

import com.nexsysconnect.PruebaTecnicaJava.DtoRequest.ProductRequest;
import com.nexsysconnect.PruebaTecnicaJava.Model.Category;
import com.nexsysconnect.PruebaTecnicaJava.Model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiClient {

    private final RestTemplate restTemplate;

    public ApiClient() {
        this.restTemplate = new RestTemplate();
    }

    public Product[] getAllProductos() {
        String url = "https://api.escuelajs.co/api/v1/products";
        ResponseEntity<Product[]> response = restTemplate.getForEntity(url, Product[].class);
        return response.getBody();
    }

    public Category[] getAllCategorias() {
        String url = "https://api.escuelajs.co/api/v1/categories";
        ResponseEntity<Category[]> response = restTemplate.getForEntity(url, Category[].class);
        return response.getBody();
    }

    public Product createProducto(ProductRequest request) {
        String url = "https://api.escuelajs.co/api/v1/products";
        ResponseEntity<Product> response = restTemplate.postForEntity(url, request, Product.class);
        return response.getBody();
    }
}