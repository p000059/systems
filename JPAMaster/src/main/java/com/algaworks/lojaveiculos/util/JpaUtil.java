package com.algaworks.lojaveiculos.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    private static EntityManagerFactory factory;
    private static String PERSISTENCE_UNIT = "dbcodes";

    static {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void close() {
        factory.close();
    }
}