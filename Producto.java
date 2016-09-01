
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Producto
{
    private String nombreP;
    private float precio;
    /**
     * Constructor for objects of class Producto
     */
    public Producto(String nom)
    {
        this.nombreP = nom;
        precio = 0;
    }
    
    public String getNombre(){
        return nombreP;
    }
    
    public abstract float getPrecio();
}
