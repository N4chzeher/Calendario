import java.util.Scanner;

/**
 * Created by NACHZEHER on 24/02/2017.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESA UNA FECHA VALIDA:");

        System.out.println("Año:");
        int year = sc.nextInt();
        System.out.println("Mes:");
        int month = sc.nextInt();
        System.out.println("Dia:");
        int day = sc.nextInt();

        Calendar calendar1 = new Calendar(year, month, day);

        System.out.println(calendar1);

        System.out.println("DIAS A INCREMENTAR:");

        int incday = sc.nextInt();

        calendar1.incrementarDia(incday);


        System.out.println("MESES A INCREMENTAR:");

        int incmes = sc.nextInt();

        calendar1.incrementarMes(incmes);

        System.out.println("AÑOS A INCREMENTAR:");

        int incanio = sc.nextInt();

        calendar1.incrementarAnio(incanio);

        calendar1.printDate();
        System.out.println("INGRESA UNA NUEVA FECHA VALIDA");

        System.out.println("Año");
        int year2 = sc.nextInt();
        System.out.println("mes");
        int month2 = sc.nextInt();
        System.out.println("dia");
        int day2 = sc.nextInt();

        Calendar calendar2 = new Calendar(year2, month2, day2);
        
        calendar2.printDate();

        if (calendar1.equalsDates(calendar2)) {

            System.out.println("LAS FECHAS SON IGUALES!");
        } else {

            System.out.println("LAS FECHAS SON DIFERENTES!");


        }
    }
}

