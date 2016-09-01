
/**
 * Write a description of class Multimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ProductoMultimedia extends Producto
{
    private int anni;

    /**
     * Constructor for objects of class Multimedia
     */
    public ProductoMultimedia(String titulo, int anni)
    {
        super(titulo);
        this.anni = anni;
    }
    
    public String getTitulo(){
        return super.getNombre();
    }
    
    public int getAno(){
        return anni;
    }
}
