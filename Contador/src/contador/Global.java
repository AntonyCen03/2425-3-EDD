/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contador;

/**
 *
 * @author anton
 */
public class Global {
    private static Contador counter= new Contador();

    /**
     * @return the counter
     */
    public static Contador getCounter() {
        return counter;
    }

    /**
     * @param aCounter the counter to set
     */
    public static void setCounter(Contador aCounter) {
        counter = aCounter;
    }
    

}
