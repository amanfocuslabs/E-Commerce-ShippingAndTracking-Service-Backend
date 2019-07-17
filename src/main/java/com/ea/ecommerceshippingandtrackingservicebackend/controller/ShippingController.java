package com.ea.ecommerceshippingandtrackingservicebackend.controller;

import com.ea.ecommerceshippingandtrackingservicebackend.model.Shipping;
import com.ea.ecommerceshippingandtrackingservicebackend.model.Tracking;
import com.ea.ecommerceshippingandtrackingservicebackend.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/shipping")
public class ShippingController {

    @Autowired
    private ShippingService shippingService;

    @GetMapping("/{id}")
    public Shipping getShippingInformation(@PathVariable Long id){
        System.out.println("ghgghgh");
        return shippingService.getShippingInformation(id);
    }

    @PostMapping("/create")
    public Shipping createShipping(Shipping shipping, Tracking tracking){
        return shippingService.startShipping(shipping, tracking);
    }
    @GetMapping("order/{id}")
    public Shipping getShippingInformationForOrder(@PathVariable Long id){
        return shippingService.getShippingInformationForOrder(id);
    }

}
