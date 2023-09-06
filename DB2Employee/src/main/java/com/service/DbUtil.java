package com.service;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DbUtil {

    private static DataSource dataSource = null;

    static {
        try {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            dataSource = (DataSource) envContext.lookup("jdbc/sample");
        } catch (NamingException e) {
            throw new RuntimeException("Failed to initialize DataSource.", e);
        }
    }

    public static DataSource getDataSource() {
        return dataSource;
    }
}
