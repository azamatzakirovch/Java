package org.example.ENUM;

public enum ATM_OPTIONS {
    BALANCE(1, "BALANCE"),
    CASH(2, "GET CASH"),
    CONNECT(3, "CONNECTION WITH PHONE"),
    CREATE(4, "GET A NEW CARD"),
    CLOSE(5, "CLOSE");

    private final int value;
    private final String description;

    ATM_OPTIONS(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
