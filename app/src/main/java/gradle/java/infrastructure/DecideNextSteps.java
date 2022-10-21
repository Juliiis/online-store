package gradle.java.infrastructure;

import java.util.Scanner;

public class DecideNextSteps {
  GlobalVariables globalVariables = new GlobalVariables();
  ProductWarehouse productWarehouse = new ProductWarehouse();

  public void decideProductsToExplore(){
    System.out.println(globalVariables.NEXT_PRODUCT_TO_EXPLORE);
    String option1 = "\uD83D\uDCFA Reference: W2C";
    String option2 = "\uD83C\uDFB9 Reference: X4A";
    System.out.println(option1);
    System.out.println(option2);

    Scanner myObj = new Scanner(System.in);
    String object = myObj.nextLine();

    if(object.equals("W2C")){

;   } else if (object.equals("X4A")) {
       System.out.println("QUE TAL");
    } else System.out.println(globalVariables.PRODUCT_DOES_NOT_EXIST);

  }

  public void decideWhatToDoNext(){
    System.out.println("\n");
    System.out.println(globalVariables.DECIDE_NEXT_STEP);
    String nextOption1 = globalVariables.OPTION_ONE;
    String nextOption2 = globalVariables.OPTION_TWO;
    System.out.println(nextOption1);
    System.out.println(nextOption2);

    Scanner myObj = new Scanner(System.in);
    String opcionChoosed = myObj.nextLine();

    if(opcionChoosed.equals("1")){
      System.out.println();
    } else if (opcionChoosed.equals("2")) {
      System.out.println();
    } else System.out.println(globalVariables.INVALID_OPTION);

  }

}
