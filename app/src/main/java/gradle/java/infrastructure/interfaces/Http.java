package gradle.java.infrastructure.interfaces;

import gradle.java.domain.UserInterface;

public class Http implements UserInterface {

  @Override
  public void sendMessage(String message) {
    System.out.println(message);
  }

  @Override
  public String getInputFromUser() {
    return null;
  }
}
