package cz.cellar.models;

import cz.cellar.interfaces.RandomNumber;

import javax.enterprise.inject.Produces;

//Výpis 13
public class RandomNumberFactory {
   private RandomNumberType randomNumberType;

   @Produces
   public RandomNumber getRandomNumber(){
       switch (randomNumberType){
           case BIG:
               return new BigRandomNumber();
           case LOW:
               return new LowRandomNumber();
               default:
                   return new LowRandomNumber();
       }
   }
}
