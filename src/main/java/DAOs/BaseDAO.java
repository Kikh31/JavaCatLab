package DAOs;

import org.hibernate.Session;

import java.util.List;

public abstract class BaseDAO<T> {
    private final Class<T> tClass;
    private final Session session;

    public BaseDAO(Class<T> _tClass, Session _session) {
        tClass = _tClass;
        session = _session;
    }

    public T getById(Integer id) {
        return session.get(tClass, id);
    }

    public List<T> getAll() {
        return session.createQuery("FROM " + tClass.getSimpleName(), tClass).list();
    }

    public Long getCount() {
        return (Long) session.createQuery("SELECT COUNT(*) FROM " + tClass.getSimpleName()).uniqueResult();
    }

    public void save(T entity) {
        session.beginTransaction();
        session.persist(entity);
        session.getTransaction().commit();
    }

    public void update(T entity) {
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
    }

    public void delete(T entity) {
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }
}
