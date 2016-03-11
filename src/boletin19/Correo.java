package boletin19;

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Correo {
    private String contenido;
    private boolean leido;

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public Correo() {
    }

    public Correo(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }


    @Override
    public String toString() {
        return "Correo{" + "contenido=" + contenido + '}';
    }
    
    public String contenidoCorreo(){
        contenido= JOptionPane.showInputDialog("Escribe:");
        return contenido;
    }
    
    
}
