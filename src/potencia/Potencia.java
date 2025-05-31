
package potencia;


public class Potencia {


    public static void main(String[] args) {
        int resultado = 1;
        int numeroBase = 2;
        
        int potencia = 22;
        
        for (int i = 1; i <= potencia; i++) {
            resultado *= numeroBase;
        }
        
        System.out.println("Resultado: " + resultado);
    }
    
}
