package common.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * EntityManagerの機能を提供するクラスです。
 * Initialization-on-demand holder idiom を採用して
 * 可能な限りロードされるタイミングを遅延させています。
 *
 * @author Hiroshi HASEGAWA
 */
public final class EntityService {

    public static EntityService getInstance() {
        return LazyHolder.INSTANCE;
    }

    private EntityService() {
    }

    public EntityManager getEntityManager() {
        // TODO 対象のデータソースをプロパティファイルから取得するように
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("jersey-app");
        return fac.createEntityManager();
    }

    private static class LazyHolder  {
        private static final EntityService INSTANCE = new EntityService();
    }
}
