package main.java.app.service;

import main.java.app.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ServiceRepo {
    public static void save(Service service) {
        Session session = null;
        try {
            session = HibernateUtil.openSession();
            session.getTransaction().begin();
            session.saveOrUpdate(service);
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

    public static void delete(Long id) {

        Session session = null;
        try {
            session = HibernateUtil.openSession();
            session.getTransaction().begin();
            Optional<Service> oneById = findOneById(id);
            if (oneById.isPresent()) {
                session.delete(oneById.get());
            }
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


    public static Optional<Service> findOneById(Long id) {
        Session session = null;
        try {
            session = HibernateUtil.openSession();
            Service service = session.find(Service.class, id);
            return Optional.ofNullable(service);

        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public static List<Service> findAllById(Long id) {
        Session session = null;
        try {
            session = HibernateUtil.openSession();
            String jpql = "SELECT s FROM Service s WHERE s.id=:serviceId";
            Query query = session.createQuery(jpql);
            query.setParameter("serviceId", id);
            return query.getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
            return Collections.emptyList();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }


    public static List<Service> findAllByName(String name) {

        Session session = null;
        try {
            session = HibernateUtil.openSession();
            String jpql = "SELECT s FROM Service s WHERE UPPER(s.name) like :name";
            Query query = session.createQuery(jpql);
            query.setParameter("name", "%" + name.toUpperCase() + "%");
            return query.getResultList();

        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }


    }

    public static List<Service> findAll() {

        Session session = null;
        try {
            session = HibernateUtil.openSession();
            String jpql = "SELECT p FROM Service s";
            Query query = session.createQuery(jpql);
            return query.getResultList();

        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }


    }


}
