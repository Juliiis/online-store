package gradle.java;

import gradle.java.domain.Product;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneralCatalogue {
  public static ArrayList<Product> AllProducts = new ArrayList<>(Arrays.asList(new Product(
    "\uD83D\uDCFA",
    "Glamorous panoramic television,",
    "13 inches",
    "With this panoramic television, your friday nights will be boring no more",
    300.99,
    "Reference: W2C"), new Product("\uD83C\uDFB9",
    "Off-key musical keyboard",
    "4 octaves",
    "Tired of your noisy neighbour? Play this off-key musical keyboard for two hours at home and your neighbour will be ready to move to a building far away from you.",
    1003.00,
    "Reference: X4A")
  ));

}
