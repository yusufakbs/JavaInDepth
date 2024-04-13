package composition;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Category[] categoryC = new Category[4];
        categoryC[0].setCategoryId(1);
        Category categoryA = new Category(321,"Beyaz Esya");
        categoryA.setProductList(new ArrayList<Product>());

        Product productA = new Product(1,"Buzdolabı",3000);
        productA.setCategory(categoryA);
        categoryA.getProductList().add(productA);

        Product productB = new Product(2,"Camasir Makinesi",4500);
        productB.setCategory(categoryA);
        categoryA.getProductList().add(productB);

        Product productC = new Product(3,"Bulasik Makinesi",6000);
        productC.setCategory(categoryA);
        categoryA.getProductList().add(productC);

        for (Product product : categoryA.getProductList()){
            System.out.println(product.getProductId()+" "
                    +product.getProductName()
                    +product.getSalesPrice()
                    +product.getCategory().getCategoryName());
        }

    }
}
