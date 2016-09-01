import java.util.ArrayList;
/**
 * Write a description of class GooglePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;
    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {
        usuarios = new ArrayList<>();
        productos = new ArrayList<>();
    }
    
    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void addProducto(Producto product){
        productos.add(product);
    }
    
    public int comprar(String correo, String nombre){
        int importe;
        for(Usuario usu : usuarios){
            if(usu.getNombreCuenta() != correo){
                importe = -1;
            }
            else{
                for(Producto prod : productos){
                    if(prod.getNombre() != nombre){
                        importe = -1;
                    }
                    else{
                        importe = prod.
                    }
                }
            }
        }
    }

    public int getNumeroUsuarios(){
        return usuarios.size();
    }
    
    public int getNumeroProductos(){
        return productos.size();
    }
}
