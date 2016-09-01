
/**
 * Write a description of class LibroDigital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    private String titulo;
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
        this.ficcion = ficcion;
    }
    
    public int getNumeroPaginas(){
        return numeroDePaginas;
    }
    
    public boolean getFiccion(){
        return ficcion;
    }
    
    @Override
    public float getPrecio(){
        int numeroDeAnnPasados = 2010 - super.getAno();
        if(numeroDeAnnPasados < 0){
            numeroDeAnnPasados = -numeroDeAnnPasados;
        }
        float precioDelLibro = (numeroDePaginas/100) * numeroDeAnnPasados;
        
        return precioDelLibro;
    }
}   
