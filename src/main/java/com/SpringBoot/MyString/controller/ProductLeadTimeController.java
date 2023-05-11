package com.SpringBoot.MyString.controller;

import com.SpringBoot.MyString.entity.ProductLeadTime;
import com.SpringBoot.MyString.service.ProductLeadTimeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/va/product_lead_time/1")
public class ProductLeadTimeController {
    private ProductLeadTimeService productLeadTimeService;

    //create product lead time rest api
    //Http://localhost:8080/api/1/product_lead_time/1
    @PostMapping
    public ResponseEntity<ProductLeadTime> createProductLeadTime(@RequestBody ProductLeadTime productLeadTime){
        ProductLeadTime my_product_lead_time_1=productLeadTimeService.createProductLeadTime(productLeadTime);
        return new ResponseEntity<>(my_product_lead_time_1, HttpStatus.CREATED);
    }
    //create get product lead time by id rest api
    //Http://localhost:8080/api/v1/product_lead_time/1
    @GetMapping
    public ResponseEntity<ProductLeadTime> getProductLeadTimeById(@PathVariable("id") Long product_lead_timeId){
        ProductLeadTime my_product_lead_time_2=productLeadTimeService.getProductLeadTimeById(product_lead_timeId);
        return new ResponseEntity<>(my_product_lead_time_2,HttpStatus.OK);
    }
    //create get all product lead time rest api
    //Http://localhost:8080/api/v1/prooduct_leadt_time/1
    @GetMapping
    public ResponseEntity<List<ProductLeadTime>> getAllProductsLeadTime(){
        List<ProductLeadTime> my_product_lead_time_3=productLeadTimeService.getAllProductsLeadTime();
        return new ResponseEntity<>(my_product_lead_time_3,HttpStatus.OK);
    }
    //create update product leadt time rest api
    //Http://localhost:8080/api/v1/product_lead_time/1
    @PutMapping
    public ResponseEntity<ProductLeadTime> updateProductLeadTime(@RequestBody ProductLeadTime productLeadTime,@PathVariable("id") Long product_lead_timeId){
        productLeadTime.setProductId(product_lead_timeId);
        ProductLeadTime my_product_lead_time_4=productLeadTimeService.updateProductLeadTime(productLeadTime);
        return new ResponseEntity<>(my_product_lead_time_4,HttpStatus.OK);
    }
    //create delete product lead time rest api
    //Http://localhost:8080/api/v1/product_leadt_time/1
    @DeleteMapping
    public ResponseEntity<String> deleteProductLeadTime(@PathVariable("id") Long product_lead_timeId){
        productLeadTimeService.deleteProductLeadTime(product_lead_timeId);
        return new ResponseEntity<>("ProductLeadTime deleted successfullu!",HttpStatus.OK);
    }
}
