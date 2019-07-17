package com.ea.ecommerceshippingandtrackingservicebackend.dao;

import com.ea.ecommerceshippingandtrackingservicebackend.model.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;


public interface ShippingRepository extends JpaRepository<Shipping, Long> {
//     @Query(nativeQuery = true,value = "SELECT * FROM shipping s WHERE s.orderId=:orderId")
//     Shipping getShipping(@Param("orderId") Long orderId);
     Shipping findByOrderId(Long id);





}
