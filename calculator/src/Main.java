import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal= new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite la operación que desea realizar");
        System.out.println("Suma = 1\n"+"Resta = 2\n"+"Multiplicación = 3\n"+"División = 4\n"+ "Opción: ");
        int op = sc.nextInt();

        System.out.println("Digite el primer valor: ");
        int a = sc.nextInt();

        System.out.println("Digite el segundo valor: ");
        int b = sc.nextInt();

        switch (op){
            case 1:

                cal.suma(a,b);
                break;

            case 2:

                cal.resta(a,b);
                break;

            case 3:

                cal.multi(a,b);
                break;

            case 4:

                cal.div(a,b);
                break;

        }
    }

}
