package gradle.java.infrastructure;

import java.util.Scanner;

public class ProductsToChooseExplore {
    GlobalVariables globalVariables = new GlobalVariables();
    ProductWarehouse productWarehouse = new ProductWarehouse();
    public void productsToChooseExplore(){
        System.out.println(globalVariables.NEXT_PRODUCT_TO_EXPLORE);
        String option1 = "1 - \uD83D\uDCFA";
        String option2 = "2 - \uD83C\uDFB9";
        System.out.println(option1);
        System.out.println(option2);

        Scanner myObj = new Scanner(System.in);
        String object = myObj.nextLine();

        if(object.equals("1")){
            System.out.println(productWarehouse.findTheProductByAllReference().showReference());
        } else if (object.equals("2")) {
            System.out.println(productWarehouse.findTheProductByAllReference().showReference());
        } else System.out.println(globalVariables.PRODUCT_DOES_NOT_EXIST);

    }
}