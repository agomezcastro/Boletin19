package boletin19;

/**
 *
 * @author agomezcastro
 */
public class Boletin19 {


    public static void main(String[] args) {
        Buzon email = new Buzon();
        
        
        email.numeroDeCorreos();
        email.engade(null);
        email.porLer();
        email.amosarPrimerNonLeido();
        email.amosa(2);
        email.elimina(4);
        email.numeroDeCorreos();
        
        
    }
}