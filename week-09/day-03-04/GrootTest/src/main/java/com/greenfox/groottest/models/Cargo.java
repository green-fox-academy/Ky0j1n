package com.greenfox.groottest.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cargo {
   private Double caliber25 = 0.0;
   private Double caliber30 = 0.0;
   private Double caliber50 = 0.0;
   @JsonProperty(value = "shipstatus")
   private String shipStatus = "empty";
   private Boolean ready = false;
   @JsonIgnore
   private Double amountOFAmmo;

   public Cargo(){
      this.amountOFAmmo = caliber25 + caliber30 + caliber50;
   }



   public void isShipReady () {
      if(getShipStatus().equals("full")) {
         setReady(true);
      }
   }

   public void refreshAmountOfAmmo(){
      setAmountOFAmmo(caliber25 + caliber30 + caliber50);
   }

   public void fillGivenCaliber(String caliber, Double amount) {
      switch (caliber) {
         case ".25" -> setCaliber25(amount);
         case ".30" -> setCaliber30(amount);
         case ".50" -> setCaliber50(amount);
      }
   }

   public void getShipstatusStatus() {
      if(getAmountOFAmmo() == 0) {
         setShipStatus("empty");
      }else if(getAmountOFAmmo() / 12500.0 == 0.4 ) {
         setShipStatus("40%");
      }else if (getAmountOFAmmo() / 12500.0 == 1.0) {
            setShipStatus("full");
      }else if (getAmountOFAmmo() / 12500.0 > 1.0){
         setShipStatus("overloaded");
      }
   }





}
