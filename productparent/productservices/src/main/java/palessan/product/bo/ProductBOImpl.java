package palessan.product.bo;

import palessan.product.dao.ProductDAO;
import palessan.product.dto.Product;

public class ProductBOImpl implements ProductBO {

  public ProductDAO getDao() {
    return dao;
  }

  public void setDao(ProductDAO dao) {
    this.dao = dao;
  }

  private ProductDAO dao;

  @Override
  public void createProduct(Product product) {
    dao.create(product);
  }

  @Override
  public Product findProduct(int id) {
    return dao.read(id);
  }
}
