package com.between.ecommerce.repository;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.between.ecommerce.entity.Prices;

@Repository("pricesRepository")
public interface PricesRepository extends JpaRepository<Prices, Serializable> {
	
	public List<Prices> findAllByProductIdProduct(Integer productId);
	
    @Query("select p from Prices p where p.brand.idBrand=:brandId and p.product.idProduct=:productId and p.startDate <= :nowDateTime and p.endDate >= :nowDateTime order by p.priority desc, p.price asc")
    public List<Prices> getPrice(@Param("brandId") Integer brandId, @Param("productId") Integer productId, @Param("nowDateTime") LocalDateTime nowDateTime);

}