/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lopezfunes_200929;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BusquedaBinaria buscar = new BusquedaBinaria();
        
        int[] arreglo = {17,19,21,23,25,27,29,31};
        
        int[][] matriz = {
            { 1, 3, 5 },
            { 7, 9, 11 },
            {  13,  15, 17 }
        };
        
        int a_buscar = 21;
        
        int posicion = buscar.buscarEnteroArray(arreglo, a_buscar);
        //se evalua  el resultado  devuelto por el metodo.
        if(posicion != -1){
            //se encontro  el valor 
            System.out.println("El valor: "+a_buscar+" esta en la posicion: "+posicion);
        }else{
            // no encontro el valor
            System.out.println("Nose encontro el valor de "+a_buscar);
        }
        
       buscar.buscarEnteroMatriz(matriz, a_buscar);
        
    }
    
}
