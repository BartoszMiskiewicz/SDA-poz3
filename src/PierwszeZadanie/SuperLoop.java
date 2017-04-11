package PierwszeZadanie;

/**
 * Created by bartosz on 10.04.2017.
 */
public class SuperLoop {

    public static void main(String[] args) {
//        tree(5);
        treeS(1);


    }

    // for (int i = 0; i < a; i++) {
    //spacja
//            for (int j = 0; j < a - i - 1; j++) {


//    public static void tree(int a) {
//
//        for (int i = 0; i < a; i++) {
//
//            for (int j = 0; j < a - i - 1; j++) {
//
//                System.out.print("  ");
//            }
//
//            for (int j = 0; j < 2 * (i + 2) * (i + 1); j++) {
//
//                System.out.print("* ");
//            }for (int j = 0; j < 1 ; j++){
//                System.out.println("|");
//            }
//            System.out.println();
//        }


//    }

    public static void treeS(int a) {

        for (int i = 1; i < 19 ; i=i+1) // i=i+1
        {
            System.out.print(" *");
        }

        for (int i = 1; i < 2 ; i=i+1) // i=i+1
        {
            System.out.println("");
        }

        for (int j = 0; j < 1 ; j++) // i=i+1
        {
            System.out.println(" * " + "  " + "" + "" + " " + " " + "  ****  *" + "  **  " + "* " + "*  ** " + " *  *" + "* ");
        }

        for (int i = 1; i < 1 ; i=i+1) // i=i+1
        {
            System.out.println("");
        }

        for (int j = 0; j < 1 ; j++) // i=i+1
        {
            System.out.println(" * " + " * " + "* " + " *" + "**  * " + "* " + " * " + " * * " + " * " + " * *  *   " );
        }

        for (int i = 1; i < 1 ; i=i+1) // i=i+1
        {
            System.out.println("");
        }

        for (int j = 0; j < 1 ; j++) // i=i+1
        {
            System.out.println(" * " + " *" + " * " + " **" + "*  *" + " * " + " * " + " * *" + "  * " + " " + "*" + " * " + " * " + "   ");
        }

        for (int i = 1; i < 1 ; i=i+1) // i=i+1
        {
            System.out.println("");
        }

        for (int j = 0; j < 1 ; j++) // i=i+1
        {
            System.out.println(" * " + " *" + " * " + " **" + "* "+ "  " + "  " + "  * " + " * * " + " *  " + " " + " " + "  " + " * " + "   ");
        }

        for (int i = 1; i < 1 ; i=i+1) // i=i+1
        {
            System.out.println("");
        }

        for (int j = 0; j < 1 ; j++) // i=i+1
        {
            System.out.println(" * " + " *" + " *  *" + "**  " + "* " +"*" +"  * " + " * " + "* " + " * " + " * *" + " " + " *  ");
        }

        for (int i = 1; i < 1 ; i=i+1) // i=i+1
        {
            System.out.println("");
        }



        for (int j = 0; j < 1 ; j++) // i=i+1
        {
            System.out.println(" * " + " *" + "*   **" + "*  " + "* *  *   *   " + "*  * * "  + " * ");
        }

        for (int i = 1; i < 1 ; i=i+1) // i=i+1
        {
            System.out.println("");
        }

        for (int j = 0; j < 1 ; j++) // i=i+1
        {
            System.out.println(" * " + "  " +" " + " " +  " *" + "* *  *" + " * " + " **  " + "   "  + "**  *" + " * " + " *");
        }



        for (int k = 1 ; k < 19; k++)
        {
            System.out.print( " *" ) ;
        }


    }


}