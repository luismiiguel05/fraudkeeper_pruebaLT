package com.fraudkeeper.ejercicioLT.dao;

import com.fraudkeeper.ejercicioLT.entity.DatosDePersonas;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class DatosDePersonasDaoImpl implements DatosDePersonasDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void grabar(DatosDePersonas datosDePersonas) {
        Session currentSession = entityManager.unwrap(Session.class);
        try {
            currentSession.getTransaction().begin();
            currentSession.saveOrUpdate(datosDePersonas);
            currentSession.getTransaction().commit();
        } catch (Exception e) {
            currentSession.getTransaction().rollback();
        }
    }
}
