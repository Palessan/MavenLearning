package com.palessan.product.dao;

import org.junit.Test;
import com.palessan.product.dto.Product;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class ProductDAOImplTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldCreateAProduct()
    {
        ProductDAO dao= new ProductDAOImpl();
        Product product = new Product();
        product.setId(1);
        product.setName("iPhone1");
        product.setPrice(700);
        product.setDescription("iPhone 1");
        dao.create(product);

        Product result = dao.read(1);

        assertNotNull(result );
        assertEquals("iPhone 1",result.getDescription());
    }
}
