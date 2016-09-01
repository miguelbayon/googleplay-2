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
    
    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public int getNumeroUsuarios(){
        return usuarios.size();
    }
    
    public int getNumeroProductos(){
        return productos.size();
    }
}
