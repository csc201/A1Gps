/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author tkanchanawanchai6403
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double randNum =0;
        String direction ="";
        for(int i=0; i<12; i++) {
            randNum = Math.random();            
            System.out.println(randNum);
            if(randNum<0.25) {
                direction = "NORTH";
                System.out.println(direction);
            } else if((randNum>=0.25)&&(randNum<0.5)) {
                direction = "EAST";
                System.out.println(direction);
            } 
        }
    }
    
}
