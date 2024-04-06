package DAOs;

import Entities.Cat;
import org.hibernate.Session;

public class CatDAO extends BaseDAO<Cat> {
    public CatDAO(Session session) {
        super(Cat.class, session);
    }
}
