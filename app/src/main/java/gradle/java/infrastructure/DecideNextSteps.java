package gradle.java.infrastructure;


import gradle.java.domain.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class DecideNextSteps {
  GlobalVariables globalVariables = new GlobalVariables();
  ProductWarehouse productWarehouse = new ProductWarehouse();
  CatalogueFormatter catalogueFormatter = new CatalogueFormatter();

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
      ArrayList<Product> catalogue = productWarehouse.findAll();
      String formattedCatalogue = catalogueFormatter.format(catalogue);
      System.out.println(formattedCatalogue);
    } else System.out.println(globalVariables.INVALID_OPTION);
  }

  public void decideProductsToExplore(){
    System.out.println(globalVariables.NEXT_PRODUCT_TO_EXPLORE);
    String option1 = "1 - \uD83D\uDCFA";
    String option2 = "2 - \uD83C\uDFB9";
    System.out.println(option1);
    System.out.println(option2);

    //productWarehouse.displayASpecificProduct();
        /*Scanner myObj = new Scanner(System.in);
        String object = myObj.nextLine();

        if(object.equals("1")){
            System.out.println(productWarehouse.findTheProductByAllReference().showReference());
        } else if (object.equals("2")) {
            System.out.println(productWarehouse.findTheProductByAllReference().showReference());
        } else System.out.println(globalVariables.PRODUCT_DOES_NOT_EXIST);
*/
  }
}
