
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto
{
    private String nombreP;
    private int contador = 0; //atributo que nos permite saber cuántas veces se ha vendido cada artículo
    /**
     * Constructor for objects of class Producto
     */
    public Producto(String nom)
    {
        this.nombreP = nom;
        contador++;
    }
    
    public String getNombre(){
        return nombreP;
    }
    
    public int getVecesQueSeHaVendidoElProducto(){
        return contador;
    }

}
