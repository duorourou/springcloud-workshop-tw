package com.example.twworkshopserviceorder;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderRepository  extends JpaRepository<VehicleOrder, String> {
    List<VehicleOrder> findByShopId(String shop_id);
}

