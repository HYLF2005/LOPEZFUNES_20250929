/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lopezfunes_200929;

/**
 *
 * @author UFG
 */
//Esta clase se convertira en un objeto de memoria RAM en la computadora 
public class BusquedaBinaria {
    //METODO PARA REAlizar una busqueda binaria de un arreglo unidimensional
    
   public int buscarEnteroArray(int[] arreglo, int valorBuscado) {
       //se declara las variaables de inicio y fin 
       int inicio = 0;
       int fin = arreglo.length;
       
       //se realiza  la ejecucion de busqueda mienbtrtas el arreglo tenga al menos 
       //un elemento 
       while(inicio <= fin){
           
           //se optiene la posicion del centro del arreglo 
           int medio = (inicio + fin)/2;
           //se evalua si el elemento en la posicion media es igual al valor buscado 
           if(arreglo[medio] == valorBuscado){
               return medio;
           }else if (arreglo[medio] < valorBuscado){
               //se evalua si el elemento en la posicion media es menor que el valor buscado 
               inicio =medio + 1;
           }else{
               //se deduce que el elemento es mayor, por lo tanto, el fin cambia 
               fin = medio -1;
           }
           
       }
       //se devuelve -1 cuando no hay valores encontrados 
       return -1;
   }
   
   public void buscarEnteroMatriz(int[][] matriz, int objetivo){
       
       int filas = matriz.length;
       int columnas = matriz[0].length;
       
       int inicio = 0;
       int fin = (filas * columnas) -1;
       
       boolean encontrado = false;
       
       while(inicio <= fin){
           
           int medio = (inicio + fin)/2;
           
           int f = medio / columnas;
           int c = medio % columnas;
           
           if(matriz[f][c] == objetivo){
               System.out.println(" En la matriz, el elemento encontrado esta en la posicion [" + f + "][" + c + "]");
               encontrado = true;
               break;
        
           }else if(matriz[f][c] < objetivo){
               inicio = medio + 1;
               
           }else{
               fin = medio -1;
           }
       }
       if(encontrado == false){
           System.out.println(" el ellemento seleccionado no ha sido en contrado en la matriz");
       }
   }
    
}
