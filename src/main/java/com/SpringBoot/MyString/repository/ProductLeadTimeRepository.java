package com.SpringBoot.MyString.repository;

import com.SpringBoot.MyString.entity.ProductLeadTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductLeadTimeRepository extends JpaRepository<ProductLeadTime,Long> {
}
