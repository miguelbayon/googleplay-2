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
    private ArrayList<Producto> productosRepetidos;
    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {
        usuarios = new ArrayList<>();
        productos = new ArrayList<>();
        productosRepetidos = new ArrayList<>();
    }
    
    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void addProducto(Producto product){
        productos.add(product);
        for(Producto produc : productos){
            if(produc.getNombre().equals(product.getNombre())){
                productosRepetidos.add(produc);
            }
        }
    }
    
    public float comprar(String correo, String nombre){
        float importe = 0;
        for(int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).getNombreCuenta().equals(correo)){
                for(int x = 0; x < productos.size(); x++){
                    if(productos.get(x).getNombre().equals(nombre)){
                        importe = productos.get(x).getPrecio();
                    }
                    else if(productosRepetidos != null){
                        importe = productos.get(x).getPrecio();
                    }
                    else{ 
                        importe = -1;
                    }
                }
            }
            else{
                 importe = -1;
            }
        }
        return importe;
    }

    public int getNumeroUsuarios(){
        return usuarios.size();
    }
    
    public int getNumeroProductos(){
        return productos.size();
    }
}
