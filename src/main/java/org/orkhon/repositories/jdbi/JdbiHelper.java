package org.orkhon.repositories.jdbi;

import com.zaxxer.hikari.HikariDataSource;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

import java.io.*;
import java.util.Properties;

public class JdbiHelper {
    private static Jdbi jdbi;
    private JdbiHelper() {}

    private static void create() throws IOException {
        if(jdbi == null) {
            var input = new FileInputStream("./config.properties");
            var prop = new Properties();
            prop.load(input);
            var ds = new HikariDataSource();
            ds.setMaximumPoolSize(10);
            ds.setDriverClassName("org.mariadb.jdbc.Driver");
            ds.setJdbcUrl(prop.getProperty("db.url"));
            ds.setAutoCommit(false);
            jdbi = Jdbi.create(ds);
            jdbi.installPlugin(new SqlObjectPlugin());
        }
    }

    public static Jdbi jdbi() throws IOException {
        create();
        return jdbi;
    }

    public static Handle handle() throws IOException {
        return jdbi().open();
    }

    public static <T extends Class<T>> T createDao(T dao) throws IOException {
        return handle().attach(dao);
    }
}
