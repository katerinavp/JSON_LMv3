import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String, TreeMap<String, String>> stocks = new HashMap<>();
        String numberRegion = "34";
        TreeMap<String, String> numberShopAndCountProduct = new TreeMap<>();
        numberShopAndCountProduct.put("2", "35");
        numberShopAndCountProduct.put("3", "42");
        numberShopAndCountProduct.put("4", "58");
        numberShopAndCountProduct.put("5", "57");
        numberShopAndCountProduct.put("6", "112");
        numberShopAndCountProduct.put("20", "51");
        numberShopAndCountProduct.put("22", "78");
        numberShopAndCountProduct.put("26", "34");
        numberShopAndCountProduct.put("32", "22");
        numberShopAndCountProduct.put("35", "358");
        numberShopAndCountProduct.put("40", "28");
        numberShopAndCountProduct.put("43", "68");
        numberShopAndCountProduct.put("45", "58");
        numberShopAndCountProduct.put("49", "31");
        numberShopAndCountProduct.put("51", "29");
        numberShopAndCountProduct.put("56", "42");
        numberShopAndCountProduct.put("62", "26");
        numberShopAndCountProduct.put("64", "0");
        numberShopAndCountProduct.put("65", "57");
        numberShopAndCountProduct.put("86", "15");
        numberShopAndCountProduct.put("114", "41");
        numberShopAndCountProduct.put("117", "46");
        numberShopAndCountProduct.put("143", "46");
        numberShopAndCountProduct.put("162", "4");
        numberShopAndCountProduct.put("171", "0");
        numberShopAndCountProduct.put("176", "12");
        stocks.put(numberRegion, numberShopAndCountProduct);

        Product product = new Product(new DisplayedName(new Value(new String[]{"Профиль маячковый ПВХ 10 мм L3м"}, "Полное наименование товара для клиента")),
                new Stock(stocks));

        Gson gson = new Gson();
        String turns = gson.toJson(product);

        System.out.println("сериализация + $turns");
        String fileName = "./product.json";
        FileWriter writer = new FileWriter(fileName);
        writer.write(turns);
        writer.close();
    }
}
