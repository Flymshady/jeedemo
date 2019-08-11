package cz.cellar.models;

import cz.cellar.interfaces.RandomNumber;

import java.util.Random;

public class BigRandomNumber implements RandomNumber {
    Random random = new Random();

    public BigRandomNumber() {
    }
    public int get(){
        return random.nextInt(1000);
    }
}
