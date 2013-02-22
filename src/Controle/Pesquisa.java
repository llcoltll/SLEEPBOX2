/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Fclinica.Fclinica;
import java.util.ArrayList;

/**
 *
 * @author lg
 */
public class Pesquisa {
    public static ArrayList<Fclinica> Pesquisa = new ArrayList();
    
    public static void buscaNome(String nome){
        Pesquisa.clear();
        for(Fclinica obj : sleepbox.SLEEPBOX.Lista){
            if(nome.equals(obj.getNome())){
                Pesquisa.add(obj);
            }
        }
    }
    public static void buscaPeso(int peso){
        Pesquisa.clear();
        for(Fclinica obj : sleepbox.SLEEPBOX.Lista){
            if(peso == obj.getPeso()){
                Pesquisa.add(obj);
            }
        }
    }
    public static void buscaAltura(int altura){
        Pesquisa.clear();
        for(Fclinica obj : sleepbox.SLEEPBOX.Lista){
            if(altura == obj.getAltura()){
                Pesquisa.add(obj);
            }
        }
    }
    public static void buscaNomePeso(String nome, int peso){
        Pesquisa.clear();
        for(Fclinica obj : sleepbox.SLEEPBOX.Lista){
            if((peso == obj.getPeso())&&(nome.equals(obj.getNome()))){
                Pesquisa.add(obj);
            }
        }
    }
    public static void buscaNomeAltura(String nome, int altura){
        Pesquisa.clear();
        for(Fclinica obj : sleepbox.SLEEPBOX.Lista){
            if((altura == obj.getAltura())&&(nome.equals(obj.getNome()))){
                Pesquisa.add(obj);
            }
        }
    }
    public static void buscaAlturaPeso(int altura, int peso){
        Pesquisa.clear();
        for(Fclinica obj : sleepbox.SLEEPBOX.Lista){
            if((peso == obj.getPeso())&&(altura == obj.getAltura())){
                Pesquisa.add(obj);
            }
        }
    }
   
    public static void buscaNomePesoAltura(String nome, int peso, int altura){
        Pesquisa.clear();
        for(Fclinica obj : sleepbox.SLEEPBOX.Lista){
            if((peso == obj.getPeso())&&(nome.equals(obj.getNome()))&&(altura == obj.getAltura())){
                Pesquisa.add(obj);
            }
        }
    }
    public static void imprimePesquisa(){
        for(Fclinica obj : Pesquisa){
            System.out.print(obj.getNome()+" "+obj.getAltura()+" "+obj.getPeso()+"\n");
        }
    }
}
