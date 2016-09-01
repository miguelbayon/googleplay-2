
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Producto
{
    private int contador = 0; //atributo que nos permite saber cuántas veces se ha vendido cada artículo

    /**
     * Constructor for objects of class Producto
     */
    public Producto()
    {
        contador++;
    }
    
    public int getVecesQueSeHaVendidoElProducto(){
        return contador;
    }

}
