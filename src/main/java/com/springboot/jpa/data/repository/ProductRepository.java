package com.springboot.jpa.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.data.entity.Product;

// repository는 spring data jpa가 제공하는 인터페이스
// 레포지토리는 엔티티가 생성한 db에 접근
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
