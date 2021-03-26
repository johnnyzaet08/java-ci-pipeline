import java.util.Scanner;

public class Calculator {

      int suma(int a, int b){

        int sum = a + b;
        System.out.println("El valor de la suma es: " + sum);

        return sum;
    }
      int resta(int a, int b){

        int rest = a - b;
        System.out.println("El valor de la resta es: " + rest);

        return rest;
    }
      int multi(int a, int b){

        int mult = a * b;
        System.out.println("El valor de la multiplicación es: " + mult);

        return mult;

    }
      int div(int a, int b){
        int divs = 0;

        if(b != 0)
        {
            divs = a/b;
            System.out.println("El valor de la división es: " + divs);
        }
        else
        {

            System.out.println("No se puede dividir por 0");
        }

        return divs;
    }}
