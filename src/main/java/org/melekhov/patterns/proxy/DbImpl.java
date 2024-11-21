package org.melekhov.patterns.proxy;

public class DbImpl implements Db {
    public String dbName = "bubliki";

    @Override
    public String connect() {
        return dbName;
    }
}
