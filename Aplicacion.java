import java.util.ArrayList;
/**
 * Write a description of class Aplicaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto 
{
    private String nombre;
    private float mb; //parámetro que nos indica cuántos MB ocupa la aplicación
    private Categoria cat; //cada aplicación podrá ser de una de estas cuatro categorías : juegos, comunicación, productividad o multimedia.

    /**
     * Constructor for objects of class Aplicaciones
     */
    public Aplicacion(String nombre, float megas, Categoria categoria)
    {
        nombre = this.nombre;
        mb = megas;
        cat = categoria;
    }
    
    public String getNombre(){
        return nombre;
    }

    public float getTamanoEnMB(){
        return mb;
    }
    
    public Categoria getCategoria(){
        return cat;
    }
}
