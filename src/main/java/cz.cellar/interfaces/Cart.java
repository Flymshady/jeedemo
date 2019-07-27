package cz.cellar.interfaces;

import cz.cellar.models.Item;

public interface Cart {

    void addItem(Item item);
    void goToOrder();
}
