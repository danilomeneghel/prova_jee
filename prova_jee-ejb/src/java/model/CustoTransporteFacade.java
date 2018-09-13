/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.CustoTransporte;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Danilo
 */
@Stateless
public class CustoTransporteFacade extends AbstractFacade<CustoTransporte> {

    @PersistenceContext(unitName = "prova_jee-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustoTransporteFacade() {
        super(CustoTransporte.class);
    }
    
}
