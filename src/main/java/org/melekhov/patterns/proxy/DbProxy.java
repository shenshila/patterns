package org.melekhov.patterns.proxy;

public class DbProxy implements Db {
    private final Db db;

    public DbProxy(Db db) {
        this.db = db;
    }

    @Override
    public String connect() {
        return "localhost:port/" + db.connect();
    }
}
