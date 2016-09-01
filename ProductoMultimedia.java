
/**
 * Write a description of class Multimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductoMultimedia extends Producto
{
    private String titulo;
    private int anni;

    /**
     * Constructor for objects of class Multimedia
     */
    public ProductoMultimedia(String titulo, int anni)
    {
        titulo = this.titulo;
        anni = this.anni;
    }

    public String getTitulo(){
        return titulo;
    }
    
    public int getAno(){
        return anni;
    }
}
