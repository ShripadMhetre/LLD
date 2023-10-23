package org.lld.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Database.Builder builder = Database.builder();

        Database db = builder
                .setName("db1")
                .setUsername("user1")
                .setPassword("pass1")
                .setPort(9000)
                .setType(DatabaseType.MYSQL)
                .setCompressed(false)
                .build();

        System.out.println(db);
    }
}
