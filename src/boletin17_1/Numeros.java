/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_1;

/**
 *
 * @author Ara
 */
public class Numeros {
    private int [] numeros=new int [6];
    
    public void cargarArray(){
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int) (Math.random()*50+1); 
        }
           
         
    }
    public void amosar(){
        for(int i=5; i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
}
