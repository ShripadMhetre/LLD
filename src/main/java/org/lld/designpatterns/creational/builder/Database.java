package org.lld.designpatterns.creational.builder;

import lombok.ToString;

@ToString
public class Database {
    private String name;
    private String username;
    private String password;
    private int port;
    private DatabaseType type;
    private boolean isCompressed;

    private Database() {}

    /* Trick 1: Builder method :-
            In main method, we won't need to do -
               Database.Builder builder = new Database.Builder();

               we just do -
               Database.Builder builder = Database.builder();
     */
    public static Builder builder() {
        return new Builder();
    }

    // Step 1: Create a static inner class
    public static class Builder {

        // Step 2: Copy all the fields from the outer class
        private String name;
        private String username;
        private String password;
        private int port;
        private DatabaseType type;
        private boolean isCompressed;


        // Step 3: Create setters for our builder - "Fluent interfaces"
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setType(DatabaseType type) {
            this.type = type;
            return this;
        }

        public Builder setCompressed(boolean compressed) {
            isCompressed = compressed;
            return this;
        }

        public Database build() {
            Database db = new Database();
            db.name = name;
            db.username = username;
            db.password = password;
            db.port = port;
            db.type = type;
            db.isCompressed = isCompressed;

            return db;
        }
    }
}


