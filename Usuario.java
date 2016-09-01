import java.util.ArrayList;
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    private ArrayList<Producto> productosComprados;
    private String correoElectronico;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String correo)
    {
        correoElectronico = correo;
        productosComprados = new ArrayList<>();
    }
    
    public String getNombreCuenta(){
        return correoElectronico;
    }
    
    public void comprarProducto(Producto product){
        productosComprados.add(product);
    }
    
    public int numeroDeProductosComprados(){
        return productosComprados.size();
    }

   
}
