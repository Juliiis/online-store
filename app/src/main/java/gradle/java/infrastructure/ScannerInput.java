package gradle.java.infrastructure;

import java.util.Scanner;

public class ScannerInput {
  public String getInputFromUser() {
    Scanner myObj = new Scanner(System.in);
    String object = myObj.nextLine();
    return object;
  }

}
