package com.greenfox.groottest.services;

import com.greenfox.groottest.error.NoInputException;
import com.greenfox.groottest.models.Cargo;
import com.greenfox.groottest.models.RecivedAmmoAndShipStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RocketService {

    Cargo cargo = new Cargo();

    public Cargo getCargoOfTheShip() {
        return cargo;
    }

    public RecivedAmmoAndShipStatus fillAmmo(String caliber, Double amount) throws NoInputException {
        if(!caliber.equals(".50") || !caliber.equals(".30") || !caliber.equals(".25") || caliber == null){
            throw new NoInputException();
        }
        cargo.fillGivenCaliber(caliber, amount);
        cargo.refreshAmountOfAmmo();
        cargo.getShipstatusStatus();
        cargo.isShipReady();
        return new RecivedAmmoAndShipStatus(caliber, amount, cargo.getShipStatus(), cargo.getReady());
    }
}
