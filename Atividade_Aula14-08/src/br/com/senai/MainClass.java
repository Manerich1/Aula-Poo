package br.com.senai;

import br.com.senai.controller.StoreController;
import br.com.senai.entity.StoreEntity;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        List <StoreEntity> storage = new ArrayList<>();

        StoreController storeController = new StoreController();

        String product;
        double productValue;
        int quantity;
        double totalValue;

        String newProduct;
        double newProductValue;
        int newQuantity;
        double newTotalValue;

        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("Bem vindo ao sistema da verdureira BigBom");

        do {
            System.out.print("""
                    ----------MENU----------
                    1 - Cadastrar produtos
                    2 - Listar produtos
                    3 - Buscar produto
                    4 - Editar produto
                    5 - Excluir produto
                    6 - Sair
                    Digite o valor desejado:\s""");

            int inputValue = input.nextInt();
            switch (inputValue) {
                case 1:

                    input.nextLine();
                    System.out.println();
                    System.out.println("Cadastrar Produto");

                    System.out.print("Digite o nome do produto a ser cadastrado: ");
                    product = input.nextLine();

                    System.out.print("Digite o valor do produto: ");
                    productValue = input.nextInt();

                    System.out.print("Digite a quantidade de produtos a serem registrados: ");
                    quantity = input.nextInt();
                    totalValue = productValue * quantity;

                    StoreEntity storeEntity = storeController.registerProduct(product, productValue, quantity, totalValue);
                    storage.add(storeEntity);

                    break;
                case 2:

                    System.out.println("Listar Produtos");
                    storeController.showProdutcs(storage);
                    System.out.println();

                    break;
                case 3:

                    input.nextLine();
                    System.out.println("Edição de Produtos cadastrados");

                    System.out.print("Informe o ID do produto a ser BUSCADO pelo sistema: ");
                    int IDfind = input.nextInt();
                    if (IDfind > storage.size() || IDfind < 0) {System.out.println("Cadastro não localizado");}

                    StoreEntity storageEntinyFoundItens = storage.get(IDfind);
                    storeController.findItens(storageEntinyFoundItens);

                    break;
                case 4:

                    input.nextLine();
                    System.out.println("Edição de Produtos cadastrados");

                    System.out.print("Informe o ID do produto a ser EDITADO pelo sistema: ");
                    int IdEdit = input.nextInt();
                    if (IdEdit > storage.size() || IdEdit < 0) {System.out.println("Cadastro não localizado");}

                    input.nextLine();
                    System.out.print("Digite o novo nome do produto a ser cadastrado: ");
                    newProduct = input.nextLine();

                    System.out.print("Digite o novo valor do produto: ");
                    newProductValue = input.nextInt();

                    System.out.print("Digite a nova quantidade de produtos a serem registrados: ");
                    newQuantity = input.nextInt();
                    newTotalValue = newProductValue * newQuantity;

                    StoreEntity newStoreEntity = storeController.editProduct(newProduct, newProductValue, newQuantity, newTotalValue);
                    storage.set(IdEdit, newStoreEntity);

                    break;
                case 5:

                    input.nextLine();
                    System.out.println("Remover Produto do sistema");

                    System.out.print("Informe o ID do produto a ser REMOVIDO do sistema: ");
                    int IdRemove = input.nextInt();
                    if (IdRemove > storage.size() || IdRemove< 0) {System.out.println("Cadastro não localizado");}
                    storage.remove(IdRemove);
                    System.out.println("Produto removido com sucesso!");
                    System.out.println();

                    break;
                case 6:

                    input.close();
                    System.out.println("Sistema finalizado com sucesso!");
                    System.exit(0);

                    break;
                default: System.out.println("Valor digitado é incorreto, voltando ao menu principal");
            }
        } while(true);
    }
}