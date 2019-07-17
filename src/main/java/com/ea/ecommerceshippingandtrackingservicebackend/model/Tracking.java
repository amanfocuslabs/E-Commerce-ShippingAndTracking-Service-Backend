package com.ea.ecommerceshippingandtrackingservicebackend.model;

import com.ea.ecommerceshippingandtrackingservicebackend.Utils.ShippingState;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@NoArgsConstructor
@Data
@Embeddable
public class Tracking {

    private ShippingState shippingState;
}
