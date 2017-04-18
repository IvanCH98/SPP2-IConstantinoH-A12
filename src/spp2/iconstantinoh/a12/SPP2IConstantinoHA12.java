/* Iván Constantino Hernández A01411529 IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.iconstantinoh.a12;
import javax.swing.JOptionPane;
       
/**
 *
 * @author ivana
 */
public class SPP2IConstantinoHA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double e, p, imc;
    e= metodillo("Introduce la estatura");
    p= metodillo ("Introduce el peso");
    imc= p/ Math.pow (e,2);
    JOptionPane.showMessageDialog (null, "Tu imc es"+ imc);
    
    
    }
 public static double metodillo (String mensaje){
     boolean flag;
     double dato=0;
     do{
         try{
             String usuario= JOptionPane.showInputDialog (null, mensaje);
             dato= Double.parseDouble (usuario);
             flag=false;
            } catch (Exception Ex){
             JOptionPane.showMessageDialog (null, "error");
             flag=true;
         }
     } while (flag);
      return dato;
 }

}
