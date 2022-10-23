package gradle.java.infrastructure;

import gradle.java.domain.Product;

public class DecideNextSteps {
  GlobalVariables globalVariables = new GlobalVariables();
  OnlineShop onlineShop = new OnlineShop();
  ProductWarehouse productWarehouse = new ProductWarehouse();
  PrintCatalogueFormatter printCatalogueFormatter = new PrintCatalogueFormatter();
  ScannerInput scannerInput = new ScannerInput();
  Println println = new Println();
  public void decideProductsToExplore(){
    println.printlnDecideProductsToExplore();
  }

  public void decideWhatToDoNext(){
    println.printlnDecideStepWhatToDoNext();
    println.printlnChooseOptionWhatToDoNext();

    String inputClientOne = scannerInput.getInputFromUser();

    if(inputClientOne.equals(globalVariables.NUMBER_ONE)){
      System.out.println();
    } else if (inputClientOne.equals(globalVariables.NUMBER_TWO)) {
      onlineShop.showProducts();
      decideProductsToExplore();
      String inputClientTwo = scannerInput.getInputFromUser();
      Product product = productWarehouse.findProductByReference(inputClientTwo);
      printCatalogueFormatter.printOneProductByReference(product);
      decideWhatToDoNext();

    } else System.out.println(globalVariables.PRODUCT_DOES_NOT_EXIST);
  }

}
