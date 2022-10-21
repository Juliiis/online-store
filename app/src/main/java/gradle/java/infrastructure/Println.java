package gradle.java.infrastructure;

public class Println {
  GlobalVariables globalVariables = new GlobalVariables();

  void printlnDecideProductsToExplore() {
    System.out.println(globalVariables.NEXT_PRODUCT_TO_EXPLORE);
    System.out.println(globalVariables.PRODUCT_REFERENCE);
  }
  void printlnDecideStepWhatToDoNext(){
    System.out.println(globalVariables.DECIDE_NEXT_STEP);
  }

  void printlnChooseOptionWhatToDoNext(){
    String nextOption1 = globalVariables.OPTION_ONE;
    String nextOption2 = globalVariables.OPTION_TWO;
    System.out.println(nextOption1);
    System.out.println(nextOption2);
  }
}
