/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.*;
import javax.ejb.EJB;
import model.VeiculoFacade;
import entities.*;
import javax.faces.context.FacesContext;

/**
 *
 * @author Danilo
 */
@ManagedBean
@SessionScoped
public class VeiculoController {
    @EJB
    private VeiculoFacade veiculoFacade;
    private Veiculo v = new Veiculo();
    
    public Veiculo getV() {
        return v;
    }

    public void setV(Veiculo v) {
        this.v = v;
    }
    
    public VeiculoController() {
        
    }
    
    public List<Veiculo> getListaVeiculos() {
        List<Veiculo> lista = this.veiculoFacade.findAll();
        List<Veiculo> veiculos = new ArrayList<>();
        for (Veiculo v : lista) {
            veiculos.add(new Veiculo(v.getId(), v.getNome()));
        }
        return veiculos;
    }
    
    public String getVeiculo(int id) {
        Veiculo veiculo = this.veiculoFacade.find(id);
        
        return veiculo.getNome();
    }
    
    public List<Veiculo> findAll(){
        return this.veiculoFacade.findAll();
    }
    
    public String add(){
        try {
            if (this.v.getCusto().doubleValue() != 0) {
                this.veiculoFacade.create(this.v);
                this.clearBean();
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        
        return "/veiculo.xhtml?faces-redirect=true";
    }
    
    public void clearBean() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

    public void delete(Veiculo v){
        this.veiculoFacade.remove(v);
    }
}
