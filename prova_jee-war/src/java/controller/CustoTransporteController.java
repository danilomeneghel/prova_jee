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
    
    public double custoDistancia(Integer distanciaRodPav, Integer distanciaRodNaoPav) {
        if(distanciaRodPav > 0) {
            subCusto = (distanciaRodPav * 0.54);
        }
        if(distanciaRodNaoPav > 0) {
            subCusto = (distanciaRodNaoPav * 0.62) + subCusto;
        }
        
        return subCusto;
    }
    
    public double custoVeiculo(Integer veiculo, Double subCusto) {
        if (veiculo != null) {
            List<Veiculo> lista = this.veiculoFacade.findAll();
            for (Veiculo vv : lista) {
                if (Objects.equals(vv.getId(), veiculo)) {
                    subCusto = subCusto * vv.getCusto().doubleValue();
                }
            }
        }
        
        return subCusto;
    }

    public double custoCarga(Integer carga, Integer distanciaTotal, Double subCusto) {
        if(carga > 5) {
            subCusto = (((carga - 5) * 0.02) * distanciaTotal) + subCusto;
        }
        
        return subCusto;
    }

    public double custoTransporte(Integer distRodPav, Integer distRodNaoPav, Integer veiculo, Integer carga) {
        int distanciaTotal = distRodPav + distRodNaoPav;
        
        if (distanciaTotal > 0) {
            subCusto = this.custoDistancia(distRodPav, distRodNaoPav);        
            subCusto = this.custoVeiculo(veiculo, subCusto);        
            subCusto = this.custoCarga(carga, distanciaTotal, subCusto);
        }
        
        return subCusto;
    }

    public void clearBean() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
    
    public void delete(CustoTransporte c){
        this.custoTransporteFacade.remove(c);
    }
}
