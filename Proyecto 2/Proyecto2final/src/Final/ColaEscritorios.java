/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author FABIO SANCHEZ
 */
public class ColaEscritorios {
    ListaDobleEscritorios escrit =new ListaDobleEscritorios();
    public NodoEscritorio primero;
    public void encolar(NodoEscritorio nuevo){
         NodoEscritorio aux = primero;
        if (primero == null) {
            primero = nuevo;
        } else {
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
        }
    }
   public void descolar() {
        try{
        if (primero.sig == null) {
            System.out.println("");
            primero = primero.sig = null;
            try{
           // escrit.eliminar(0, correlativoo);
            primero = primero.sig = null;
            }catch(NullPointerException e){}
        } else {
            try{
           // mantenimiento.eliminarEstacionLibre(primero);
            primero = primero.sig;
            }catch(NullPointerException e){}
        }
        }catch(NullPointerException e){}
    }
    
}
