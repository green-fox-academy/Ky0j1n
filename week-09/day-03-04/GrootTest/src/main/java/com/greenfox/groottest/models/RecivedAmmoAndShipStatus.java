package com.greenfox.groottest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class RecivedAmmoAndShipStatus {

    String received;
    Double amount;
    @JsonProperty(value = "shipstatus")
    String shipStatus;
    Boolean ready = false;

    public RecivedAmmoAndShipStatus(String caliber, Double amount, String shipStatus, Boolean ready){
        this.received = caliber;
        this.amount = amount;
        this.shipStatus = shipStatus;
        this.ready = ready;
    }


}
