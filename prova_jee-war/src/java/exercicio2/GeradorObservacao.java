package exercicio2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GeradorObservacao {

    //Identificador da entidade
    private String texto = "";
    private String codigos = "";
    
    public static void main (String [] args) {
        //Teste
        GeradorObservacao g = new GeradorObservacao();
        String obs = g.geraObservacao(Arrays.asList(1, 2, 3, 4, 5));
        //Imprimir dados no console
        System.out.println(obs);
    }
    
    //Gera a observação com os números das notas fiscais, recebidos no parametro
    public String geraObservacao(List lista) {
        //Cria os textos pré-definidos
        if (!lista.isEmpty()) {
            if (lista.size() >= 2) 
                texto = "Fatura das notas fiscais de simples remessa: ";
            else
                texto = "Fatura da nota fiscal de simples remessa: ";

            codigos = retornaCodigos(lista) + ".";
        }
        
        return texto + codigos;
    }
    
    private StringBuilder retornaCodigos(List lista) {
        StringBuilder cod = new StringBuilder();
        //Adiciona os separadores
        for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext();) {
            Integer c = iterator.next();
            String s = "";
            if (cod.toString() == null || cod.toString().length() <= 0) {
                s = "";
            } else if (iterator.hasNext()) {
                s = ", ";
            } else {
                s = " e ";
            }
            cod.append(s + c);
        }
        
        return cod;
    }
}
