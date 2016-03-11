package boletin19;

import java.util.ArrayList;

/**
 *
 * @author agomezcastro
 */
public class Buzon {
    ArrayList <Correo> cartas= new ArrayList<Correo>();
    
    public void listaCorreo(){
        Correo mail1=new Correo();
        Correo mail2=new Correo();
        Correo mail3=new Correo();
        Correo mail4=new Correo();
        Correo mail5=new Correo();
        
        cartas.add(mail1);
        cartas.add(mail2);
        cartas.add(mail3);
        cartas.add(mail4);
        cartas.add(mail5);
        
    }
    
    public void verLista(){
        System.out.println(cartas);
    }
    
    public int numeroDeCorreos(){
        int x= cartas.size();
        System.out.println("Nº de correos: "+x);
        return x;
    }
    
    public void engade(Correo c){
        cartas.add(c);
        System.out.println("Se ha añadido un correo");
    }
    
    public boolean porLer(){
        int acumulador=0;
        for (int i=0; i<cartas.size(); i++){
        if (cartas.get(i).isLeido()==false){
            acumulador++;
        }
        }
        if (acumulador==0){
            System.out.println("Has leido todos los correos");
            return true;
    }
        else
            System.out.println("Hay "+acumulador+ " correo sin leer");
            return false;
    }
        
    public String amosarPrimerNonLeido(){
        String texto="";
        for (int i=0; i<cartas.size(); i++){
            if (cartas.get(i).isLeido()==false){
                texto= texto+cartas.get(i).getContenido();
                i=cartas.size();
        }
    }
        System.out.println(texto);
        return texto;
    }
    
    public String amosa(int k){
        String y=cartas.get(k).getContenido();
        System.out.println(y);
        return y;
    }
    
    public void elimina(int k){
        cartas.remove(k);
        System.out.println("Se ha eliminado un correo");
    }
    
    
}
