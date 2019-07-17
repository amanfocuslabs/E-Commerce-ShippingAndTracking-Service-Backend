package com.ea.ecommerceshippingandtrackingservicebackend.service;

import com.ea.ecommerceshippingandtrackingservicebackend.model.Shipping;
import com.ea.ecommerceshippingandtrackingservicebackend.model.Tracking;

public interface ShippingService {
    Shipping getShippingInformation(Long id);
    Shipping startShipping(Shipping shipping, Tracking tracking);
    Shipping editShippingInformation(Shipping shipping);
    Shipping getShippingInformationForOrder(Long id);
}
