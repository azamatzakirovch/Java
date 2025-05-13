package org.example;

public enum ENUM_TASK2 {
    ADMIN(3), MODERATOR(2), USER(1);

    private final int permissionLevel;

    ENUM_TASK2(int permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public int getPermissionLevel() {
        return permissionLevel;
    }
}