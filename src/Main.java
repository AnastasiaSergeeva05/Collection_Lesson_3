

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Product vinograd = new Product("Виноград", 150, 5);
        Product hleb = new Product("Хлеб", 20, 2);
        ProductList productList = new ProductList();
        productList.addNewProduct(vinograd, 3);
        productList.addNewProduct(hleb, 2);


        System.out.println(productList.food);
        System.out.println(productList.food.size());

        Recipe recipe1 = new Recipe(productList.food, Recipe.sumProduct(productList.food), "Кукукруза");
        System.out.println(recipe1);
    }
}