package com.solutionary.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.solutionary.models.DashboardPrototypeModel;

@Repository("dashboardPrototypeDao")
@Transactional
public class DashboardPrototypeDao {

    @PersistenceContext
    private EntityManager em;

    // persist
    public void persist(DashboardPrototypeModel dashboardPrototypeModel) {
        em.persist(dashboardPrototypeModel);
    }

    // update
    public void update(DashboardPrototypeModel dashboardPrototypeModel) {
        em.merge(dashboardPrototypeModel);
    }

    // delete
    public void delete(DashboardPrototypeModel dashboardPrototypeModel) {
//        em.createQuery("").setParameter(arg0, arg1).executeUpdate();
    }

    @SuppressWarnings("all")
    // loadAll
    public List<DashboardPrototypeModel> loadAll() {
        return em.createQuery("SELECT m FROM DashboardPrototypeModel m").getResultList();
    }

    // get
    public DashboardPrototypeModel get(long id) {
        return em.find(DashboardPrototypeModel.class,  id);
    }

    // Getters and Setters
    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
}