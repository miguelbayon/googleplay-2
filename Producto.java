
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Producto
{
    private String nombreP;
    private int contador = 0; //atributo que nos permite saber cuántas veces se ha vendido cada artículo
    private float precio;
    /**
     * Constructor for objects of class Producto
     */
    public Producto(String nom)
    {
        this.nombreP = nom;
        precio = 0;
        contador = contador + 1;
    }
    
    public String getNombre(){
        return nombreP;
    }
    
    public int getVecesQueSeHaVendidoElProducto(){
        return contador;
    }
    
    public abstract float getPrecio();
}
