package com.ea.ecommerceshippingandtrackingservicebackend.service.Impl;

import com.ea.ecommerceshippingandtrackingservicebackend.dao.ShippingRepository;
import com.ea.ecommerceshippingandtrackingservicebackend.model.Shipping;
import com.ea.ecommerceshippingandtrackingservicebackend.model.Tracking;
import com.ea.ecommerceshippingandtrackingservicebackend.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class ShippingServiceImpl implements ShippingService {

    @Autowired
    private ShippingRepository shippingRepository;

    @Override
    public Shipping getShippingInformation(Long id) {
        Optional<Shipping> shipping=shippingRepository.findById(id);
        if(shipping.isPresent())
            return shipping.get();

        return new Shipping();
    }

    @Override
    public Shipping startShipping(Shipping shipping, Tracking tracking) {
        shipping.setTracking(tracking);
        return shippingRepository.save(shipping);
    }

    @Override
    public Shipping editShippingInformation(Shipping shipping) {
        return shippingRepository.save(shipping);
    }

    @Override
    public Shipping getShippingInformationForOrder(Long id) {
        return shippingRepository.findByOrderId(id);
    }

}
