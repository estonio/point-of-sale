package io.eston.pos;

import java.util.HashMap;
import java.util.Map;

public class Sale {
    private final Map<String, Item> items = new HashMap<>();

    public Sale() {
        items.put("1", new Item("Milk", new Money(399)));
        items.put("2", new Item("Coffee", new Money(295)));
    }

    public void scan(String barcode) {
        final Item item = items.get(barcode);
        if (item != null)
            System.out.println(item.getName() + " " + item.getPrice().asDisplayText());
        else
            System.out.println("Item not found");
    }
}
