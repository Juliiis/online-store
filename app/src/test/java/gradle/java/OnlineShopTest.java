package gradle.java;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import gradle.java.domain.Product;
import gradle.java.infrastructure.OnlineShop;
import gradle.java.infrastructure.PrintCatalogueFormatter;
import gradle.java.infrastructure.ProductWarehouse;
import gradle.java.infrastructure.interfaces.CliInterface;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;


public class OnlineShopTest {
  private final ProductWarehouse productWarehouse = mock(ProductWarehouse.class);
  private final PrintCatalogueFormatter printCatalogueFormatter = mock(PrintCatalogueFormatter.class);
  private final CliInterface cliInterface = mock(CliInterface.class);
  private final OnlineShop onlineShop = new OnlineShop(productWarehouse, printCatalogueFormatter, cliInterface);

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }
  @Captor
  ArgumentCaptor<ArrayList<Product>> catalogueCaptor;
  @Captor
  ArgumentCaptor<Product> productCaptor;
  @Test
  public void showProductsOnlineStoreTest(){

    ArrayList<Product> productsCatalogue = GeneralCatalogue.AllProducts;

    when(productWarehouse.findAll()).thenReturn(productsCatalogue);
    onlineShop.showProducts();

    verify(printCatalogueFormatter).printCatalogueAllProducts(catalogueCaptor.capture());
    assertThat(productsCatalogue).usingRecursiveComparison().isEqualTo(catalogueCaptor.getValue());
  }

  @Test
  public void showProductByReferenceTest(){
    Product product = GeneralCatalogue.OneProduct;

    when(cliInterface.getInputFromUser()).thenReturn("W2C");
    when(productWarehouse.findProductByReference("W2C")).thenReturn(product);
    onlineShop.showProductByReference();

    verify(printCatalogueFormatter).printOneProductByReference(productCaptor.capture());
    assertThat(product).usingRecursiveComparison().isEqualTo(productCaptor.getValue());
  }

}
