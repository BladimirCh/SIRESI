/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import ventanas.formlogin;

/**
 *
 * @author Bladimr Chavez
 */
public class Proyectosiresi {
      public int validar_usuario(){
     String id = formlogin.usuario.getText();
     String pass =  String.valueOf(formlogin.contrasenia.getPassword());
     int resultados =0;
     String SSQL ="select *from ACCESO where cedula_identidad='"+id+"'and contrasenia=sha1('"+pass+"')"; 
     
     
          return 0;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    }
  
}
