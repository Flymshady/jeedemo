package cz.cellar.models;

import cz.cellar.interfaces.Message;
import javax.enterprise.inject.Default;
import javax.inject.Named;

//Výpis 9
@Default
@Named("FirstMessage")
public class FirstMessage implements Message {
    @Override
    public String getMessage() {
        return "first message";
    }
}
