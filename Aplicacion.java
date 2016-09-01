import java.util.ArrayList;
/**
 * Write a description of class Aplicaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto 
{
    private float mb; //parámetro que nos indica cuántos MB ocupa la aplicación
    private Categoria cat; //cada aplicación podrá ser de una de estas cuatro categorías : juegos, comunicación, productividad o multimedia.

    /**
     * Constructor for objects of class Aplicaciones
     */
    public Aplicacion(String nombre, float megas, Categoria categoria)
    {
        super(nombre);
        mb = megas;
        cat = categoria;
    }

    public float getTamanoEnMB(){
        return mb;
    }
    
    public String getCategoria(){
        return cat.getString();
    }
    
    @Override
    public float getPrecio(){
        float precioI = 0.99F;
            if(cat.getString().equals("Juego")){ 
                precioI = 5.00F;
            }
            else if(cat.getString().equals("Productividad")){
                precioI = 10.00F;
            }
            else{
                precioI = 2.00F;
            }
        return precioI;
        }
    }
