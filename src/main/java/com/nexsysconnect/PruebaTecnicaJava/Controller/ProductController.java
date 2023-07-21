package com.nexsysconnect.PruebaTecnicaJava.Controller;

import com.nexsysconnect.PruebaTecnicaJava.Model.ProductRequest;
import com.nexsysconnect.PruebaTecnicaJava.Model.Product;
import com.nexsysconnect.PruebaTecnicaJava.Service.ApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/nexsys/v1/")
public class ProductController {
    private final ApiClient apiClient;

    @Autowired
    public ProductController(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @GetMapping("products/")
    public Product[] getAllProductos() {
        return apiClient.getAllProductos();
    }

    @PostMapping("categories/")
    public Product createProducto(@RequestBody ProductRequest request) {
        return apiClient.createProducto(request);
    }
}
