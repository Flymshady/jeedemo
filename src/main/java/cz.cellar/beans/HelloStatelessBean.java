package cz.cellar.beans;

import cz.cellar.interfaces.LocalHelloName;
import cz.cellar.interfaces.RemoteHelloName;

import javax.ejb.Stateless;

@Stateless
public class HelloStatelessBean implements LocalHelloName, RemoteHelloName {

    public String helloName(String name) {
        return ("Hello "+name);
    }
}
