package io.eston.pos;

final class Money {
    private final long cents;

    Money(long cents) {
        this.cents = cents;
    }

    String asDisplayText() {
        return String.format("$%d.%02d", cents / 100, cents % 100);
    }
}
