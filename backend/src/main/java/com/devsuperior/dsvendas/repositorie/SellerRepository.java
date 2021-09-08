package com.devsuperior.dsvendas.repositorie;

import com.devsuperior.dsvendas.entitie.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long>{
    
}
