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
import model.CustoTransporteFacade;
import entities.*;
import javax.faces.context.FacesContext;
import model.VeiculoFacade;

/**
 *
 * @author Danilo
 */
@ManagedBean
@SessionScoped
public class CustoTransporteController {
    @EJB
    private CustoTransporteFacade custoTransporteFacade;
    private CustoTransporte c = new CustoTransporte();
    @EJB
    private VeiculoFacade veiculoFacade;
    private Veiculo v = new Veiculo();
    private double subCusto = 0;
    
    public CustoTransporte getC() {
        return c;
    }

    public void setC(CustoTransporte c) {
        this.c = c;
    }
    
    public Veiculo getV() {
        return v;
    }

    public void setV(Veiculo v) {
        this.v = v;
    }
    
    public CustoTransporteController() {
    }
    
    public List<CustoTransporte> findAll(){
        return this.custoTransporteFacade.findAll();
    }
    
    public String add(){
        double custoTransporte = this.custoTransporte(this.c.getDistanciaRodPav(), this.c.getDistanciaRodNaoPav(), this.c.getVeiculo(), this.c.getCarga());
        
        String total = String.format("%.2f", custoTransporte);
        this.c.custo = Double.parseDouble(total.replace(",","."));
        
        try {
            this.custoTransporteFacade.create(this.c);
            this.c = new CustoTransporte();
            this.clearBean();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        
        return "/index.xhtml?faces-redirect=true";
    }
    
    public double custoDistancia(int distanciaRodPav, int distanciaRodNaoPav) {
        if(distanciaRodPav > 0) {
            subCusto = (distanciaRodPav * 0.54);
        }
        if(distanciaRodNaoPav > 0) {
            subCusto = (distanciaRodNaoPav * 0.62) + subCusto;
        }
        
        return subCusto;
    }
    
    public double custoVeiculo(int veiculo, double subCusto) {
        List<Veiculo> lista = this.veiculoFacade.findAll();
        for (Veiculo v : lista) {
            if (v.getId() == veiculo) {
                subCusto = subCusto * v.getCusto().doubleValue();
            }
        }

        return subCusto;
    }

    public double custoCarga(int carga, int distanciaTotal, double subCusto) {
        if(carga > 5) {
            subCusto = (((carga - 5) * 0.02) * distanciaTotal) + subCusto;
        }
        
        return subCusto;
    }

    public double custoTransporte(int distRodPav, int distRodNaoPav, int veiculo, int carga) {
        int distanciaTotal = distRodPav + distRodNaoPav;
        
        subCusto = this.custoDistancia(distRodPav, distRodNaoPav);
        
        subCusto = this.custoVeiculo(veiculo, subCusto);
        
        subCusto = this.custoCarga(carga, distanciaTotal, subCusto);
        
        return subCusto;
    }

    public void clearBean() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
    
    public void delete(CustoTransporte c){
        this.custoTransporteFacade.remove(c);
    }
}
