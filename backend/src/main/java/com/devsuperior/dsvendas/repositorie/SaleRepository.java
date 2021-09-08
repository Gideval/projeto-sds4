package com.devsuperior.dsvendas.repositorie;

import com.devsuperior.dsvendas.entitie.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    
}
