/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaCortaII;

/**
 *
 * @author AlbertoJosé
 */
public class NodoBinario <T> {
    protected T info;
    protected NodoBinario <T> left;
    protected NodoBinario <T> right;

    public NodoBinario(T info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }
    
}
