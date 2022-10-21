package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.Scanner;

public class DecideNextSteps {
  GlobalVariables globalVariables = new GlobalVariables();
  OnlineShop onlineShop = new OnlineShop();

  public void decideProductsToExplore(){
    System.out.println(globalVariables.NEXT_PRODUCT_TO_EXPLORE);
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
