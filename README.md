# Laboratorio 1 AREP


## Empezando

>Para clonar el archivo 

git clone https://github.com/nontoa/LAB1-AREP.git
>
### Prerrequisitos
* Maven
* Java
* Git


## Construido con

* [Maven](https://maven.apache.org/) - Gestión de dependencias

## Descripción del programa:

## Código encargado para operaciones lógicas.

```java

import java.util.ArrayList;
import java.util.Scanner;
import edu.escuelaing.cnyt.app.Complejo;

/**
 * Calculadora de números complejos.
 *
 */
public class App {

    public static int cantidad;
    public static ArrayList<String> reales;
    public static ArrayList<String> imaginarios;

    /**
     * En este método se inicializa las listas de numeros reales e imaginarios.
     * Llama al método menú.
     *
     * @param args
     */
    public static void main(String[] args) {
        reales = new ArrayList<String>();
        imaginarios = new ArrayList<String>();
        menu();
    }

    /**
     * En este método se muestra el menú de las operaciones a realizar con n
     * numeros complejos que ingrese el usuario. Según la operacion que elija
     * llama al método para resolverla.
     */
    public static void menu() {
        Scanner reader = new Scanner(System.in);
        Scanner reader2 = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 9) {
            System.out.println("Digite el numero de la operación a realizar.");            
            System.out.println("1. Suma\n2. Resta\n3. Mutiplicación\n4. División\n5. Modulo\n6. Conjugado\n7. Conversión entre representaciones cartesiano a polar\n8. Fase de un número complejo\n9. Conversión entre representaciones polar a cartesiano\n10. Salir");
            opcion = reader.nextInt();
            if(opcion==10) break;
            System.out.println("Digite la cantidad de numeros complejos.");
            cantidad = reader.nextInt();
            if (opcion==9){
                System.out.println("Escriba la represetacion polar asi r angulo");
            }
            else{
                System.out.println("Escriba los números complejos separando la parte real de la imaginaria con un espacio");                
            }            
            String entry;
            for (int x = 0; x < cantidad; x++) {
                entry = reader2.nextLine();
                String[] parts = entry.split(" ");
                reales.add(parts[0]);
                imaginarios.add(parts[1]);
            }
            switch (opcion) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    Complejo cc = new Complejo(0, 0);
                    for (int x = 0; x < cantidad - 1; x++) {
                        if (x == 0) {
                            Complejo c1 = new Complejo(Double.parseDouble(reales.get(x)), Double.parseDouble(imaginarios.get(x)));
                            Complejo c2 = new Complejo(Double.parseDouble(reales.get(x + 1)), Double.parseDouble(imaginarios.get(x + 1)));
                            cc = multiplicacion(c1, c2);
                        } else {
                            Complejo c3 = new Complejo(Double.parseDouble(reales.get(x + 1)), Double.parseDouble(imaginarios.get(x + 1)));
                            cc = multiplicacion(c3, cc);
                        }
                    }
                    if (cc.imag >= 0) {
                        System.out.println("La multiplicación de los numeros complejos da como resultado " + cc.real + "+" + cc.imag + "i");
                    } else {
                        System.out.println("La multiplicación de los numeros complejos da como resultado " + cc.real + "" + cc.imag + "i");
                    }
                    break;
                case 4:
                    Complejo cd = new Complejo(0, 0);
                    for (int x = 0; x < cantidad - 1; x++) {
                        if (x == 0) {
                            Complejo c1 = new Complejo(Double.parseDouble(reales.get(x)), Double.parseDouble(imaginarios.get(x)));
                            Complejo c2 = new Complejo(Double.parseDouble(reales.get(x + 1)), Double.parseDouble(imaginarios.get(x + 1)));
                            cd = division(c1, c2);
                        } else {
                            Complejo c3 = new Complejo(Double.parseDouble(reales.get(x + 1)), Double.parseDouble(imaginarios.get(x + 1)));
                            cd = division(cd, c3);
                        }
                    }
                    if (cd.imag >= 0) {
                        System.out.println("La división de los numeros complejos da como resultado " + cd.real + "+" + cd.imag + "i");
                    } else {
                        System.out.println("La división de los numeros complejos da como resultado " + cd.real + "" + cd.imag + "i");
                    }
                    break;
                case 5:
                    modulo();
                    break;
                case 6:
                    conjugado();
                    break;
                case 7:
                    conversion();
                    break;
                case 8:
                    fase();
                    break;
                case 9:
                    conversion2();
                    break;
            }
        }

    }

    /**
     * Este método se encarga de realizar la suma de n números complejos.
     */
    public static double[] suma() {
        double sumaR = 0;
        double sumaI = 0;
        double[] res= new double[] {};
        for (String a : reales) {
            sumaR += Double.parseDouble(a);
        }
        for (String b : imaginarios) {
            sumaI += Double.parseDouble(b);
        }        
        if (sumaI >= 0) {
            System.out.println("La suma de los numeros complejos da como resultado " + sumaR + "+" + sumaI + "i");
            
        } else {
            System.out.println("La suma de los numeros complejos da como resultado " + sumaR + "" + sumaI + "i");
        }
        res[0]=sumaR;
        res[1]=sumaI;
        return res;

    }

    /**
     * Este método se encarga de realizar la resta de n números complejos.
     */
    public static void resta() {
        double sumaR = Double.parseDouble(reales.get(0));
        double sumaI = Double.parseDouble(imaginarios.get(0));
        for (int x = 1; x < reales.size(); x++) {
            sumaR -= Double.parseDouble(reales.get(x));
            sumaI -= Double.parseDouble(imaginarios.get(x));
        }
        if (sumaI >= 0) {
            System.out.println("La resta de los numeros complejos da como resultado " + sumaR + "+" + sumaI + "i");
        } else {
            System.out.println("La resta de los numeros complejos da como resultado " + sumaR + "" + sumaI + "i");
        }
    }

    /**
     * Este método se encarga de realizar la multiplicación de dos números
     * complejos.
     *
     * @param c1 Es el primer número complejo.
     * @param c2 Es el segundo número complejo.
     * @return Retorna un número complejo, resultado de la multiplicación.
     */
    public static Complejo multiplicacion(Complejo c1, Complejo c2) {
        double x = c1.real * c2.real - c1.imag * c2.imag;
        double y = c1.real * c2.imag + c1.imag * c2.real;
        return (new Complejo(x, y));

    }

    /**
     * Este método se encarga de realizar la división de dos números complejos.
     *
     * @param c1 Es el primer número complejo.
     * @param c2 Es el segundo número complejo.
     * @return Retorna un número complejo, resultado de la división.
     */
    public static Complejo division(Complejo c1, Complejo c2) {
        double aux, x, y;
        aux = c2.real * c2.real + c2.imag * c2.imag;
        x = (c1.real * c2.real + c1.imag * c2.imag) / aux;
        y = (c1.imag * c2.real - c1.real * c2.imag) / aux;
        return new Complejo(x, y);

    }

    /**
     * Este método se encarga de realizar el modulo de n números complejos.
     */
    public static void modulo() {
        for (int x = 0; x < cantidad; x++) {
            double res = Math.sqrt(Double.parseDouble(reales.get(x)) * Double.parseDouble(reales.get(x)) + Double.parseDouble(imaginarios.get(x)) * Double.parseDouble(imaginarios.get(x)));
            if (Double.parseDouble(imaginarios.get(x)) > 0) {
                System.out.println("El modulo del numero complejo " + reales.get(x) + "+" + imaginarios.get(x) + "i" + " es " + res);
            } else {
                System.out.println("El modulo del numero complejo " + reales.get(x) + "" + imaginarios.get(x) + "i" + " es " + res);
            }
        }

    }

    /**
     * Este método se encarga de realizar el conjugado de n números complejos.
     */
    public static void conjugado() {
        for (int x = 0; x < cantidad; x++) {
            if (Double.parseDouble(imaginarios.get(x)) > 0) {
                System.out.println("El conjugado del numero complejo " + reales.get(x) + "+" + imaginarios.get(x) + "i" + " es " + reales.get(x) + "-" + imaginarios.get(x) + "i");

            } else {
                System.out.println("El conjugado del numero complejo " + reales.get(x) + "" + imaginarios.get(x) + "i" + " es " + reales.get(x) + "+" + (Double.parseDouble(imaginarios.get(x))) * -1 + "i");
            }

        }
    }

    /**
     * Este método se encarga de realizar la conversión de representacion
     * cartesiana a polar de n números complejos.
     */
    public static void conversion() {
        for (int x = 0; x < cantidad; x++) {
            double res = Math.sqrt(Double.parseDouble(reales.get(x)) * Double.parseDouble(reales.get(x)) + Double.parseDouble(imaginarios.get(x)) * Double.parseDouble(imaginarios.get(x)));
            Complejo c = new Complejo(0, 0);
            double a, b;
            c = new Complejo(Double.parseDouble(reales.get(x)), Double.parseDouble(imaginarios.get(x)));
            a = c.imag;
            b = c.real;
            if (a < 0) {
                a = a * -1;
            }
            if (b < 0) {
                b = b * -1;
            }
            double fase = Math.atan2(a, b);
            if (fase < 0) {
                fase = 2 * Math.PI + fase;
            }
            double angulo = fase * 180 / Math.PI;
            if (Double.parseDouble(imaginarios.get(x)) > 0) {
                System.out.println("La representación polar del numero complejo " + reales.get(x) + "+" + imaginarios.get(x) + "i" + " es " + res + "(cos" + angulo + "+ sen" + angulo + "i)");

            } else {
                System.out.println("La representación polar del numero complejo " + reales.get(x) + "" + imaginarios.get(x) + "i" + " es " + res + "(cos " + angulo + " + sen " + angulo + "i)");
            }
        }
    }

    /**
     * Este método se encarga de calcular la fase de n números complejos.
     */
    public static void fase() {
        Complejo c = new Complejo(0, 0);
        double a, b;
        for (int x = 0; x < cantidad; x++) {
            c = new Complejo(Double.parseDouble(reales.get(x)), Double.parseDouble(imaginarios.get(x)));
            a = c.imag;
            b = c.real;
            if (a < 0) {
                a = a * -1;
            }
            if (b < 0) {
                b = b * -1;
            }
            double fase = Math.atan2(a, b);
            if (Double.parseDouble(imaginarios.get(x)) > 0) {
                System.out.println("La fase del numero complejo " + reales.get(x) + "+" + imaginarios.get(x) + "i" + " es " + fase);

            } else {
                System.out.println("La fase del numero complejo " + reales.get(x) + "" + imaginarios.get(x) + "i" + " es " + fase);
            }
        }
    }
    
    public static void conversion2(){
        double a=0;
        double b=0;
        for(int x=0;x<cantidad;x++){
            a= Double.parseDouble(reales.get(x))*Math.cos(Double.parseDouble(imaginarios.get(x)));
            b= Double.parseDouble(reales.get(x))*Math.cos(Double.parseDouble(imaginarios.get(x)));
            if(b>0) System.out.println("La representacion cartesiana equivale a " + a + "+" + imaginarios.get(x) + "i" );
            else System.out.println("La representacion cartesiana equivale a " + a + "+" + imaginarios.get(x) + "i" );
        }
    
    }
}


```


## Autor


* **Juan Nicolas Nontoa Caballero**  LAB1-AREP - [nontoa] (https://github.com/nontoa)

## licencia

Este proyecto está licenciado bajo la Licencia GNU - vea el archivo [LICENSE](LICENSE) para más detalles.

