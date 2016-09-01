
/**
 * Write a description of class LibroDigital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    private int numeroDePaginas;
    private boolean ficcion; //cuando este atributo vale true significa que el libro es de ficción, si vale false
                             //significa que no es de ficción.
    /**
     * Constructor for objects of class LibroDigital
     */
    public Libro(String titulo, int anni, int numPag, boolean ficcion)
    {
        super(titulo, anni);
        numeroDePaginas = numPag;
        ficcion = this.ficcion;
    }
    
    public int getNumeroPaginas(){
        return numeroDePaginas;
    }
    
    public boolean getFiccion(){
        return ficcion;
    }
}   
