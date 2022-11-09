package gradle.java.infrastructure;

import gradle.java.domain.Product;
import gradle.java.infrastructure.interfaces.CliInterface;

public class DecideNextSteps {
  GlobalVariables globalVariables = new GlobalVariables();
  ProductWarehouse productWarehouse = new ProductWarehouse();
  PrintCatalogueFormatter printCatalogueFormatter = new PrintCatalogueFormatter();
  Println println = new Println();
  CliInterface cliInterface = new CliInterface();
  OnlineShop onlineShop = new OnlineShop(productWarehouse, printCatalogueFormatter, cliInterface);
  public void decideProductsToExplore(){
      println.printlnDecideProductsToExplore();
  }

  public void decideWhatToDoNext(){
    println.printlnDecideStepWhatToDoNext();
    println.printlnChooseOptionWhatToDoNext();

    String inputClient = cliInterface.getInputFromUser();

    if(inputClient.equals(globalVariables.NUMBER_ONE)){
      System.out.println();
    } else if (inputClient.equals(globalVariables.NUMBER_TWO)) {
      onlineShop.showProducts();
      decideProductsToExplore();
      String inputClientTwo = cliInterface.getInputFromUser();
      Product product = productWarehouse.findProductByReference(inputClientTwo);
      printCatalogueFormatter.printOneProductByReference(product);
      decideWhatToDoNext();

    } else System.out.println(globalVariables.PRODUCT_DOES_NOT_EXIST);
  }

}
