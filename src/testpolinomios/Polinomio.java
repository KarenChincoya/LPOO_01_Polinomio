package testpolinomios;
import java.util.Scanner;

public class Polinomio {
        //Linked List functions
    private Monomio head;
    private Integer tamanio;
    
    public Polinomio(){
     head = null;
     tamanio = 0;
    }
    
    private boolean isEmpty(){
        return head==null;
    }
    
    public Integer getTamanio(){
        return tamanio;
    }
    
    private void appendMonomio(Integer c, Integer e){ //funcion agregar al final
        Monomio nuevo = new Monomio(c,e);
        if(isEmpty()){
            head = nuevo;
        }else{
            Monomio current = head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            //agrega el nodo al final de la lista
            current.setNext(nuevo);
        }
        tamanio++;
    }
    
    private boolean buscarMonomio(Monomio monomio){
        Monomio current = head;
        boolean encontrado = false;
        while(current!=null && encontrado!=true){
            if(current.getExponente() == monomio.getExponente()){
                encontrado = true;
            }else{
                current = current.getNext();
            }
        }
        return encontrado;        
    }
    
    private void removerPorPosicion(Integer posicion){
        if(posicion>=0 && posicion<tamanio){
            if(posicion==0){
                head = head.getNext();
            }else{
                Monomio current = head;
                for(int i=0;i<posicion-1;i++){
                    current = current.getNext();
                }
                Monomio siguiente = current.getNext();
                current.setNext(siguiente.getNext());
            }
            tamanio--;
        }
    }    
//leer polinomio
    public void leerPolinomio(){ //PRINCIPAL
        Scanner sc = new Scanner(System.in);
        String s;
        Integer m;
        System.out.println("Ingrese la cantidad de monomios: ");
        m = sc.nextInt();
        Integer c;
        Integer e;
        //para cada monomio
        for(int i=0;i<m;i++){
            System.out.println("Coeficiente: ");
            c = sc.nextInt();
            System.out.println("Exponente: ");
            e = sc.nextInt();
            appendMonomio(c,e);
        }
        ordenarPorGrado();
    }
    
    public double evaluarPolinomio(Double n){
        Monomio current = head;
        Double result=0.0;
        while(current != null){
            result+= (current.getCoeficiente() * Math.pow(n, current.getExponente()));
            current = current.getNext();
        }
        return result;
    }
    
    public void simplificar(){//tienes que enviar la posicion del eliminado
        Integer nuevoCoeficiente;
        Integer posicion = 0;
        Monomio current = head;
        
        while(current!=null){
            Monomio movil = current.getNext();//es elq ue se va a mover
            Integer posicionMovil = posicion+1; //desde la que empieza
            while(movil!=null){
                if(movil.getExponente() == current.getExponente()){//si los monomios son del mismo grado
                    nuevoCoeficiente = current.getCoeficiente()+ movil.getCoeficiente();
                    current.setCoeficiente(nuevoCoeficiente);
                    //ahora hay que eliminar el monomio o hacer su coeficiente igual a cero
                    movil = movil.getNext(); //movil sera el siguiente del acutual
                    removerPorPosicion(posicionMovil); //eliminamos el nodo que elegimos 
                    //posicionMovil++; la posicion no cambia porque el siguiente del eliminado toma su lugar, pero hablamos de otros valores                                       
                }else{
                    movil = movil.getNext(); //saltar al siguiente monomio
                    posicionMovil++;
                }
            }
            current = current.getNext();
            posicion++; //aqui si va aumentando uno por uno para lograrlo
        }
    }
        
    //funcion para ordenar 
    private void ordenarPorGrado(){
        Monomio current = head;
        Monomio aux;
        while(current.getNext() != null){
            aux = current.getNext();
            while(aux!=null){
                
            }    
            current = current.getNext();
        }
    }
}
