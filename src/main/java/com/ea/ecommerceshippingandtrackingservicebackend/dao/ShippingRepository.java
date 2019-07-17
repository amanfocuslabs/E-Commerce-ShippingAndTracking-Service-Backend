package com.ea.ecommerceshippingandtrackingservicebackend.dao;

import com.ea.ecommerceshippingandtrackingservicebackend.model.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {
}
