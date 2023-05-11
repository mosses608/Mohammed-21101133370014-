package com.SpringBoot.MyString.serviceImpl;


import com.SpringBoot.MyString.entity.ProductLeadTime;
import com.SpringBoot.MyString.repository.ProductLeadTimeRepository;
import com.SpringBoot.MyString.service.ProductLeadTimeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProductLeadTimeServiceImpl implements ProductLeadTimeService {
    private ProductLeadTimeRepository productLeadTimeRepository;
    @Override
    public ProductLeadTime createProductLeadTime(ProductLeadTime productLeadTime) {
        return productLeadTimeRepository.save(productLeadTime);
    }

    @Override
    public ProductLeadTime getProductLeadTimeById(Long product_lead_timeId) {
        Optional<ProductLeadTime> optionalProductLeadTime=productLeadTimeRepository.findById(product_lead_timeId);
        return optionalProductLeadTime.get();
    }

    @Override
    public List<ProductLeadTime> getAllProductsLeadTime() {
        return productLeadTimeRepository.findAll();
    }

    @Override
    public ProductLeadTime updateProductLeadTime(ProductLeadTime productLeadTime) {
        ProductLeadTime productLeadTime1=productLeadTimeRepository.findById(productLeadTime.getProductId()).get();
        productLeadTime1.setProduct_name(productLeadTime.getProduct_name());
        productLeadTime1.setProduct_quantity(productLeadTime.getProduct_quantity());
        productLeadTime1.setTime_taken(productLeadTime.getTime_taken());
        ProductLeadTime updatedProductLeadTime=productLeadTimeRepository.save(productLeadTime);
        return updatedProductLeadTime;
    }

    @Override
    public void deleteProductLeadTime(Long product_lead_timeId) {

    }
}
