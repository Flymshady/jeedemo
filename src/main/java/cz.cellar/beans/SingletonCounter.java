package cz.cellar.beans;

import cz.cellar.interfaces.MySingletonCounter;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

//Výpis 3
@Singleton
@Startup
public class SingletonCounter implements MySingletonCounter {
    int sum;

    @Lock(LockType.WRITE)
    public void add(int i) {
        sum+=i;
    }

    @Lock(LockType.READ)
    public int getCount() {
        return sum;
    }
}
