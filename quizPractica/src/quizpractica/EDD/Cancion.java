/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizpractica.EDD;

/**
 *
 * @author valeriazampetti
 */
public class Cancion {
    private int numeroDeCancion;
    private String nombre;
    private String artista;
    private int numeroReproducciones;
    private int ano;
    private String idioma;

    public Cancion() {
    }

    public Cancion(int numeroDeCancion, String nombre, String artista, int numeroReproducciones, int ano, String idioma) {
        this.numeroDeCancion = numeroDeCancion;
        this.nombre = nombre;
        this.artista = artista;
        this.numeroReproducciones = numeroReproducciones;
        this.ano = ano;
        this.idioma = idioma;
    }
    
    
    
    public Cancion(String[] cancion) {
        this.numeroDeCancion = Integer.parseInt(cancion[0]);
        this.nombre = cancion[1];
        this.artista = cancion[2];
        this.numeroReproducciones = Integer.parseInt(cancion[3]);
        this.ano = Integer.parseInt(cancion[4]);
        this.idioma =  cancion[5];
    }
    
    public String ImprimirCancion(){
        String cancion= Integer.toString(this.getNumeroDeCancion())+ ","+ this.getNombre()+ ","+ this.getArtista()+ ","+ Integer.toString(this.getNumeroReproducciones())+ ","+Integer.toString(this.getAno())+","+this.getIdioma();
        return cancion;
    }

    /**
     * @return the numeroDeCancion
     */
    public int getNumeroDeCancion() {
        return numeroDeCancion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @return the numeroReproducciones
     */
    public int getNumeroReproducciones() {
        return numeroReproducciones;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    public void setNumeroDeCancion(int numeroDeCancion) {
        this.numeroDeCancion = numeroDeCancion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setNumeroReproducciones(int numeroReproducciones) {
        this.numeroReproducciones = numeroReproducciones;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    
    
    
   
    
  
    
}
