
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    private int duracion;
    private int hd; 

    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String titulo, int ann, int dura, int hd)
    {
        super(titulo, ann);
        duracion = dura;
        hd = this.hd;
    }

    public int getDuracion(){
        return duracion;
    }
    
    public int getCalidad(){
        return hd;
    }
}
