package palessan.product.bo;

import palessan.product.dto.Product;

public interface ProductBO {

  public void createProduct(Product product);

  public Product findProduct(int id);

}
