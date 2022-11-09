package gradle.java.infrastructure.interfaces;

import gradle.java.domain.UserInterface;
import java.util.Scanner;

public class Cli implements UserInterface {

  @Override
  public void sendMessage(String message) {
    System.out.println(message);
  }

  @Override
  public String getInputFromUser() {
    Scanner myObj = new Scanner(System.in);
    String object = myObj.nextLine();
    return object;
  }
}
