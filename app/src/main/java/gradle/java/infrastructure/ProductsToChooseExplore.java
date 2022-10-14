package gradle.java.infrastructure;

import java.util.Scanner;

public class ProductsToChooseExplore {
    GlobalVariables variables = new GlobalVariables();
    public void productsToChooseExplore(){
        System.out.println(variables.NEXT_PRODUCT_TO_EXPLORE);
        String option1 = "1 - \uD83D\uDCFA";
        String option2 = "2 - \uD83C\uDFB9";
        System.out.println(option1);
        System.out.println(option2);

        Scanner myObj = new Scanner(System.in);
        String object = myObj.nextLine();

        if(object.equals("1")){
            System.out.println(variables.DESCRIPTION_TV);
        } else if (object.equals("2")) {
            System.out.println(variables.DESCRIPTION_PIANO);
        } else System.out.println(variables.PRODUCT_DOES_NOT_EXIST);
    }
}
