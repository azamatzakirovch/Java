package org.example.ENUM;

public enum CARD_INFO {
    CARD_NUMBER(0),
    PIN(1),
    BALANCE(2),
    PASSPORT(3),
    PINFL(4),
    CARDEXPIRATIONDATE(5),
    PHONENUMBER(6),
    STATUS(7);

    private final int index;

    CARD_INFO(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
