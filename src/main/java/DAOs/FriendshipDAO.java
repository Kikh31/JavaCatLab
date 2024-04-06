package DAOs;

import Entities.Friendship;
import org.hibernate.Session;

public class FriendshipDAO extends BaseDAO<Friendship> {
    public FriendshipDAO(Session session) {
        super(Friendship.class, session);
    }
}
