/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Edd;

/**
 *
 * @author anton
 */
public class Cancion {
    private int numeroDeCancion;
    private String nombre;
    private String artista;
    private int numeroReproduccion;
    private int ano;
    private String idioma;

    public Cancion(int numeroDeCancion, String nombre, String artista, int numeroReproduccion, int ano, String idioma) {
        this.numeroDeCancion = numeroDeCancion;
        this.nombre = nombre;
        this.artista = artista;
        this.numeroReproduccion = numeroReproduccion;
        this.ano = ano;
        this.idioma = idioma;
    }
    
    public Cancion(String[] cancion) {
        this.numeroDeCancion = Integer.parseInt(cancion[0]);
        this.nombre = cancion[1];
        this.artista = cancion[2];
        this.numeroReproduccion = Integer.parseInt(cancion[4]);
        this.ano = Integer.parseInt(cancion[5]);
        this.idioma = cancion[5];
    }
    
    public String ImprimirCancion(){
        String cancion= Integer.toString(this.getNumeroDeCancion())+" "+this.getNombre()+" "+this.artista;
    }
    
    /**
     * @return the numeroDeCancion
     */
    public int getNumeroDeCancion() {
        return numeroDeCancion;
    }

    /**
     * @param numeroDeCancion the numeroDeCancion to set
     */
    public void setNumeroDeCancion(int numeroDeCancion) {
        this.numeroDeCancion = numeroDeCancion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @return the numeroReproduccion
     */
    public int getNumeroReproduccion() {
        return numeroReproduccion;
    }

    /**
     * @param numeroReproduccion the numeroReproduccion to set
     */
    public void setNumeroReproduccion(int numeroReproduccion) {
        this.numeroReproduccion = numeroReproduccion;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    
}
