package br.com.senai.service;

import br.com.senai.entity.StoreEntity;

import java.util.List;

public class StoreService {

    public StoreEntity registerProduct (String product, double productValue, int quantity, double totalValue) {
        StoreEntity storeEntity = new StoreEntity();
        storeEntity.setProduct(product);
        storeEntity.setProductValue(productValue);
        storeEntity.setQuantity(quantity);
        storeEntity.setTotalValue(totalValue);
        return storeEntity;
    }

    public void showProducts (List <StoreEntity> storage) {

        StoreEntity storeEntity = new StoreEntity();
        storeEntity.setTotalQuantityProducts(0);
        storeEntity.setTotalValueProducts(0);

        System.out.println("Produtos cadastrados no sistema:");
        System.out.println("---------------");
        int[] index = {0};

        storage.forEach(singleProduct -> {
            System.out.println("ID: " + index[0]);
            System.out.println("Produto: " + singleProduct.getProduct());
            System.out.println("Valor: R$ " + singleProduct.getProductValue());
            System.out.println("Quantidade: " + singleProduct.getQuantity());
            System.out.println("Valor total em estoque: R$ " + singleProduct.getTotalValue());
            System.out.println("---------------");

            storeEntity.setTotalQuantityProducts(storeEntity.getTotalQuantityProducts() + singleProduct.getQuantity());
            storeEntity.setTotalValueProducts(storeEntity.getTotalValueProducts() + (singleProduct.getProductValue() * singleProduct.getQuantity()));
            index[0]++;
        });

        System.out.println("Valor total dos produtos em estoque: R$  " + storeEntity.getTotalValueProducts());
        System.out.println("Quantidade total de produtos em estoque: " + storeEntity.getTotalQuantityProducts());
        System.out.println("---------------");

    }

    public void findItens (StoreEntity storeEntity) {
        System.out.println("---------------");
        System.out.println("Produto: " + storeEntity.getProduct());
        System.out.println("Valor: R$ " + storeEntity.getProductValue());
        System.out.println("Quantidade: " + storeEntity.getQuantity());
        System.out.println("Valor total em estoque: R$ " + storeEntity.getTotalValue());
        System.out.println("---------------");
    }

    public StoreEntity editProduct(String newProduct, double newProductValue, int newQuantity, double newTotalValue) {
        StoreEntity storeEntity = new StoreEntity();
        storeEntity.setProduct(newProduct);
        storeEntity.setProductValue(newProductValue);
        storeEntity.setQuantity(newQuantity);
        storeEntity.setTotalValue(newTotalValue);
        return storeEntity;
   }
}
