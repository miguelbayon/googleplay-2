
/**
 * Enumeration class Categoria - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Categoria
{
    JUEGOS("Juegos"), COMUNICACIONES("Comunicaciones"), PRODUCTIVIDAD("Productividad"), MULTIMEDIA("Multimedia");
    
    private String categoriaString;
    
    Categoria(String cadena){
        categoriaString = cadena;
    }
    
    public String getString(){
        return categoriaString;
    }
}
