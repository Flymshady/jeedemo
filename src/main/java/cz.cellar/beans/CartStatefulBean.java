package cz.cellar.beans;

import cz.cellar.interfaces.LocalCart;
import cz.cellar.interfaces.RemoteCart;
import cz.cellar.models.Item;
import cz.cellar.models.Order;

import javax.annotation.PostConstruct;
import javax.annotation.security.DeclareRoles;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

@Stateful
public class CartStatefulBean implements LocalCart, RemoteCart {

    private List<Item> items;

    @PostConstruct
    private void initialize(){
        items = new ArrayList<>();
    }
    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    @Remove
    public void goToOrder() {
        Order order = new Order();
        order.setItems(items);
        //uložení Order
        items.clear();
    }
}
