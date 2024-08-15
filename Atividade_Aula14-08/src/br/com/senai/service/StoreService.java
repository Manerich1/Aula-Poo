package br.com.senai.service;

import br.com.senai.entity.StoreEntity;

import java.util.List;
import java.util.Scanner;

public class StoreService {
    Scanner input = new Scanner(System.in);

    public StoreEntity registerProduct (String product, double productValue, int quantity, double totalValue) {
        StoreEntity storeEntity = new StoreEntity();

        storeEntity.setProduct(product);
        storeEntity.setProductValue(productValue);
        storeEntity.setQuantity(quantity);
        storeEntity.setTotalValue(totalValue);
        return storeEntity;
    }

    protected int totalQuantityProducts;
    protected double totalValueProducts;
    //tentar criar um ID

    public void showProducts (List <StoreEntity> storage) {
        totalQuantityProducts = 0;
        totalValueProducts = 0;

        System.out.println("Produtos cadastrados no sistema:");
        System.out.println("---------------");

        storage.forEach(singleProduct -> {
            System.out.println("Produto: " + singleProduct.getProduct());
            System.out.println("Valor: R$ " + singleProduct.getProductValue());
            System.out.println("Quantidade: " + singleProduct.getQuantity());
            System.out.println("Valor total em estoque: R$ " + singleProduct.getTotalValue());
            System.out.println("---------------");
            totalQuantityProducts += singleProduct.getQuantity();
            totalValueProducts += singleProduct.getTotalValue();
        });
        System.out.println("Valor total dos produtos em estoque: R$  " + totalValueProducts);
        System.out.println("Quantidade total de produtos em estoque: " + totalQuantityProducts);
    }

    public void findItens (StoreEntity storeEntity) {
        System.out.println("---------------");
        System.out.println("Produto: " + storeEntity.getProduct());
        System.out.println("Valor: R$ " + storeEntity.getProductValue());
        System.out.println("Quantidade: " + storeEntity.getQuantity());
        System.out.println("Valor total em estoque: R$ " + storeEntity.getTotalValue());
        System.out.println("---------------");
    }

    public StoreEntity editProduct(StoreEntity storeEntity) {
        System.out.println("Informe o novo nome do produto");
        String newName = input.nextLine();
        storeEntity.setProduct(newName);

        return storeEntity;
    }
}
