package gradle.java.infrastructure;

import gradle.java.domain.Product;
import gradle.java.infrastructure.interfaces.Cli;

public class DecideNextSteps {
  GlobalVariables globalVariables = new GlobalVariables();
  ProductWarehouse productWarehouse = new ProductWarehouse();
  PrintCatalogueFormatter printCatalogueFormatter = new PrintCatalogueFormatter();
  Println println = new Println();
  Cli cli = new Cli();
  OnlineShop onlineShop = new OnlineShop(productWarehouse, printCatalogueFormatter, cli);
  public void decideProductsToExplore(){
      println.printlnDecideProductsToExplore();
  }

  public void decideWhatToDoNext(){
    println.printlnDecideStepWhatToDoNext();
    println.printlnChooseOptionWhatToDoNext();

    String inputClient = cli.getInputFromUser();

    if(inputClient.equals(globalVariables.NUMBER_ONE)){
      System.out.println();
    } else if (inputClient.equals(globalVariables.NUMBER_TWO)) {
      onlineShop.showProducts();
      decideProductsToExplore();
      String inputClientTwo = cli.getInputFromUser();
      Product product = productWarehouse.findProductByReference(inputClientTwo);
      printCatalogueFormatter.printOneProductByReference(product);
      decideWhatToDoNext();

    } else System.out.println(globalVariables.PRODUCT_DOES_NOT_EXIST);
  }

}
