package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.Scanner;

public class DecideNextSteps {
  GlobalVariables globalVariables = new GlobalVariables();
  OnlineShop onlineShop = new OnlineShop();
  ProductWarehouse productWarehouse = new ProductWarehouse();
  PrintCatalogueFormatter printCatalogueFormatter = new PrintCatalogueFormatter();
  public void decideProductsToExplore(){
    System.out.println(globalVariables.NEXT_PRODUCT_TO_EXPLORE);
    System.out.println(globalVariables.PRODUCT_REFERENCE);
  }

  public void decideWhatToDoNext(){
    System.out.println(globalVariables.DECIDE_NEXT_STEP);
    String nextOption1 = globalVariables.OPTION_ONE;
    String nextOption2 = globalVariables.OPTION_TWO;
    System.out.println(nextOption1);
    System.out.println(nextOption2);

    Scanner myObj = new Scanner(System.in);
    String opcionChoosed = myObj.nextLine();

    if(opcionChoosed.equals(globalVariables.NUMBER_ONE)){
      System.out.println();
    } else if (opcionChoosed.equals(globalVariables.NUMBER_TWO)) {
      onlineShop.showProducts();
      decideProductsToExplore();

      Scanner object = new Scanner(System.in);
      String test = object.nextLine();

      Product product = productWarehouse.findProductByReference(test);
      printCatalogueFormatter.printByReference(product);
      decideWhatToDoNext();

    } else System.out.println(globalVariables.INVALID_OPTION);

  }

}
