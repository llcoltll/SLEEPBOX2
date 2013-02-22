/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sleepbox;

import Fclinica.Fclinica;
import FclinicaGUI.FclinicaGUI;
import java.util.ArrayList;

/**
 *
 * @author lg
 */
public class SLEEPBOX {
    
    public static ArrayList<Fclinica> Lista = new ArrayList();
    
    public static void main(String[] args) {
       FclinicaGUI random = new FclinicaGUI();
       random.setVisible(true);
    }
}
