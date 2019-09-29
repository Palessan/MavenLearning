package palessan.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import palessan.product.bo.ProductBO;
import palessan.product.dto.Product;

@WebServlet
public class DisplayProductDetailsServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
    IOException {



    //    This is how we get from spring
    WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
    ProductBO bo = (ProductBO)context.getBean("productbo");
    Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));

    PrintWriter out = response.getWriter();
    out.print("Product Details:\n");
    out.print("Product id = "+product.getId()+"\n");
    out.print("Product name = "+product.getName()+"\n");
    out.print("Product description = "+product.getDescription()+"\n");
    out.print("Product price = "+product.getPrice()+"\n");
  }

}
