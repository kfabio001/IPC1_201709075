/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble;

/**
 *
 * @author FABIO SANCHEZ
 */
public class ListaCirMalestas {

    private NodoMaletas primero;
    private NodoMaletas ultimo;

    public void insertarMalestasInicio(int Maletas) {
        NodoMaletas nuevo = new NodoMaletas(Maletas);
        primero = primero;
        ultimo = ultimo;

        if (primero == null) {
            primero = nuevo;
            primero.siguiente = nuevo;
            primero.anterior = primero;
        } else {
            NodoMaletas aux = primero;
            while (aux.siguiente != primero) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            nuevo.anterior = aux;
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        }

    
}
     public void insertarFinal(NodoMaletas nuevo){
         if(primero==null){
                   primero=nuevo;
                   primero.siguiente=nuevo;
                   primero.anterior=primero;
        } else{
                   NodoMaletas aux=primero;
                   while(aux.siguiente!=primero)
                            aux=aux.siguiente;
                            aux.siguiente=nuevo;
                            nuevo.anterior=aux;
                            nuevo.siguiente=primero;
                            primero.anterior=nuevo;
         }
       }
      public void recorrerMaletas(){
         if(primero==null)
                   System.out.println("<-->NULL<-->");
         else{
                   NodoMaletas aux=primero;
                  
                   do{
                            System.out.print(" Maleta: "+aux.getDato());
                            aux=aux.siguiente;
                   }while(aux!=primero);
                   System.out.println(" <-->NULL<-->");
         }
       }
    }
