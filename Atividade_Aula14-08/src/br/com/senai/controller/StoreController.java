package br.com.senai.controller;

import br.com.senai.entity.StoreEntity;
import br.com.senai.service.StoreService;

import java.util.List;

public class StoreController {

    StoreService storeService = new StoreService();

    public StoreEntity registerProduct (String product, double productValue, int quantity, double totalValue) {
        return storeService.registerProduct(product, productValue, quantity, totalValue);
    }

    public void showProdutcs(List<StoreEntity> storage) {
        storeService.showProducts(storage);
    }

    public void findItens(StoreEntity storeEntity) {
        storeService.findItens(storeEntity);
    }

    public StoreEntity editProduct(String newProduct, double newProductValue, int newQuantity, double newTotalValue) {
        return storeService.editProduct(newProduct, newProductValue, newQuantity, newTotalValue);
    }
}