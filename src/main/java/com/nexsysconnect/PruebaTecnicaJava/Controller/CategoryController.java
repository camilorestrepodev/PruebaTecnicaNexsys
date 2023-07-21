package com.nexsysconnect.PruebaTecnicaJava.Controller;

import com.nexsysconnect.PruebaTecnicaJava.Model.Category;
import com.nexsysconnect.PruebaTecnicaJava.Service.ApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/nexsys/v1/")
public class CategoryController {
    private final ApiClient apiClient;

    @Autowired
    public CategoryController(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @GetMapping("categories/")
    public Category[] getAllCategorias() {
        return apiClient.getAllCategorias();
    }
}
