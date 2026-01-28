package org.git;

import com.google.gson.Gson;
import org.git.entities.Seller;

import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main( String[] args ) {
        Seller[] sellers = readSellersFromJson("C:\\workspace\\estrutura-dados\\exercises\\arrays\\java\\seller\\src\\main\\resources\\seller.json");
        System.out.println(findHighestSalesValue(sellers));
    }

    public static String findHighestSalesValue(Seller[] sellers) {
        String sellerName = "";
        double highestValue = 0.0;

        for (Seller seller : sellers) {
            if (seller.getAmount() > highestValue) {
                highestValue = seller.getAmount();
                sellerName = seller.getName();
            }
        }

        return sellerName;
    }

    public static Seller[] readSellersFromJson(String filePath) {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, Seller[].class);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler arquivo JSON", e);
        }
    }
}
