package com.SpringBoot.MyString.service;

import com.SpringBoot.MyString.entity.ProductLeadTime;

import java.util.List;

public interface ProductLeadTimeService {
    ProductLeadTime createProductLeadTime(ProductLeadTime productLeadTime);
    ProductLeadTime getProductLeadTimeById(Long product_lead_timeId);
    List<ProductLeadTime> getAllProductsLeadTime();
    ProductLeadTime updateProductLeadTime(ProductLeadTime productLeadTime);
    void deleteProductLeadTime(Long product_lead_timeId);
}
