package switchstatement;

import java.util.Scanner;

public class switchstatement {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        while (true) {
            String day = in.next();

        switch (day) {
          //  case "mango" -> System.out.println("the king of  fruit");
           // case "apple" -> System.out.println("a sweet red fruit");
           // case "grape" -> System.out.println("a small  fruit");
           // case "banana" -> System.out.println("mhu me lega");
           // default -> System.out.println("please enter a valid fruit name:");

                case "1" -> System.out.println("Monday");
                case "2" -> System.out.println("tuesday");
                case "3" -> System.out.println("wednesday");
                case "4" -> System.out.println("thursday");
                case "5" -> System.out.println("fryday");
                case "6" -> System.out.println("saturday");
                case "7" -> System.out.println("sunday");
                default -> System.out.println(" Sorry There are Only Seven Days in a Week:");

        }}


    }


}
