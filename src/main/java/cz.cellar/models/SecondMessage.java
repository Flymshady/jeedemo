package cz.cellar.models;

import cz.cellar.interfaces.Message;

import javax.enterprise.inject.Alternative;
import javax.inject.Named;

//Výpis 10, 11
@Alternative
@Named("SecondMessage")
public class SecondMessage implements Message {
    @Override
    public String getMessage() {
        return "second message";
    }
}
