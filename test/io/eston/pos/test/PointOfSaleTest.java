package io.eston.pos.test;

import io.eston.pos.Sale;

public class PointOfSaleTest {
    public static void main(String[] args) {
        final Sale sale = new Sale();
        sale.scan("1");
        sale.scan("2");
        sale.scan("3");
    }
}
