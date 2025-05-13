package org.example;

public class Second {

    public static void main(String[] args) {
        System.out.println("==============================TASK1==============================");
        ENUM_TASK2 role = ENUM_TASK2.MODERATOR;
        System.out.println(role.getPermissionLevel());
    }
}
