
//  Tarea correspondiente a la lección de Funciones 
//  Nota: Este programa incluye la dos partes del ejercicio según el enunciado

public class Tarea_funciones {

    public static void main(String[] args) {

        int resultado = 0;

//  Llamada a la función suma en el main con sus respectivos valores

        resultado = suma(2, 4, 6);

//  Salida de la suma de los tres valores        

        System.out.println(resultado);

//  Creación de una instancia del objeto coche llamada miCoche          

        Coche miCoche = new Coche();

//  Función que incrementa el número de puertas que tiene el coche

        miCoche.ponerPuertas();

//  Salida del número de puertas que tiene el objeto (coche)

        System.out.println(miCoche.numeroPuertas);        

    }

//  Función con tres parámetros que devuelve la suma de tres valores

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

   
}

//  Creación de una clase llamada coche

class Coche {

    //  Variable numérica que almacena el número de puertas
        
        public int numeroPuertas = 4;

        
    
    //  Función que incrementa el número de puertas    
    
        public void ponerPuertas() {
    
            this.numeroPuertas++;
            
        
        }
    }