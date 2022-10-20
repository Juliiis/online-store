package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;
import java.util.Scanner;


public class CatalogueFormater {
    ProductsToChooseExplore productsToChooseExplore = new ProductsToChooseExplore();
    ProductWarehouse productWarehouse = new ProductWarehouse();
    GlobalVariables globalVariables = new GlobalVariables();
    public String format(ArrayList<Product> catalogue){
        StringBuilder formattedProduct = new StringBuilder();
        for (Product product : catalogue){
            formattedProduct.append(product.showImage());
            formattedProduct.append("\n");
            formattedProduct.append(product.showDescription());
            formattedProduct.append("\n");
            formattedProduct.append(product.showFeaturedAttribute());
            formattedProduct.append("\n");
            formattedProduct.append(product.showPrice());
            formattedProduct.append("\n");
            formattedProduct.append(product.showReference());
            formattedProduct.append("\n");
            formattedProduct.append("\n");
        }
        //productsToChooseExplore.productsToChooseExplore();
        //decideWhatToDoNext();
        return formattedProduct.toString();
    }



   /* public void decideWhatToDoNext(){
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
            String formattedCatalogue = format(catalogue);
            System.out.println(formattedCatalogue);
        } else System.out.println(globalVariables.INVALID_OPTION);
    } */

}
