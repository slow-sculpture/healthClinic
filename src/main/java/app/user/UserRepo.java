package main.java.app.user;

import main.java.app.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.Optional;

public class UserRepo {
    public static Optional<User> findByEmailAndPassword(String email, String password) {

        Session session = null;
        try {
            session = HibernateUtil.openSession();
            String jpql = "SELECT u FROM User u" + " WHERE u.email = :email AND u.password = :password";
            Query query = session.createQuery(jpql);
            query.setParameter("email", email);
            query.setParameter("password", password);
            return Optional.ofNullable((User) query.getSingleResult());

        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public static void save(User user) {

        Session session = null;
        try {
            session = HibernateUtil.openSession();
            session.getTransaction().begin();
            session.saveOrUpdate(user);
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            if (session.getTransaction().isActive()) {
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }


    }

    public static Optional<User> findByEmail(String email) {

        Session session = null;
        try {
            session = HibernateUtil.openSession();
            String jpql = "SELECT u FROM User u" + " WHERE u.email = :email";
            Query query = session.createQuery(jpql);
            query.setParameter("email", email);

            return Optional.ofNullable((User) query.getSingleResult());

        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
