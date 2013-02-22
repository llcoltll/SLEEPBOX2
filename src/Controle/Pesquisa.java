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
        for(Fclinica obj : sleepbox.SLEEPBOX.Lista){
            if(nome.equals(obj.getNome())){
                Pesquisa.add(obj);
            }
        }
    }
}
