package com.palessan.product.bo;

import com.palessan.product.dto.Product;

public interface ProductBO {

  public void createProduct(Product product);

  public Product findProduct(int id);

}
