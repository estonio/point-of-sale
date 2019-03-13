package io.eston.pos;

final class Item {
    private final String name;
    private final Money price;

    Item(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    Money getPrice() {
        return price;
    }
}
