package cz.cellar.models;

import cz.cellar.interfaces.RandomNumber;

import java.util.Random;

public class LowRandomNumber implements RandomNumber {
    Random random = new Random();
    public LowRandomNumber() {
    }
    public int get(){
        return random.nextInt(10);
    }
}
