package DAOs;

import Entities.Owner;
import org.hibernate.Session;

public class OwnerDAO extends BaseDAO<Owner> {
    public OwnerDAO(Session session) {
        super(Owner.class, session);
    }
}
