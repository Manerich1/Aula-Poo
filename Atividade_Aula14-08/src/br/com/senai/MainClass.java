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

        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema da verdureira BigBom");
        do {
            System.out.print("""
                    Digite a opção desejada:
                    1 - Cadastrar produtos;
                    2 - Listar produtos;
                    3 - Buscar produtos;
                    4 - Editar um produto;
                    5 - Excluir um produto;
                    6 - Sair;
                    Digite o valor desejado ->""");
            int inputValue = input.nextInt();

            switch (inputValue) {
                case 1:
                    input.nextLine();
                    System.out.println();
                    System.out.println("Cadastrastramento de produtos!!!");
                    System.out.println("Digite o nome do produto a ser cadastrado");
                    product = input.nextLine();

                    System.out.println("Digite o valor do produto!");
                    productValue = input.nextInt();

                    System.out.println("Digite a quantidade de produtos a serem registrados");
                    quantity = input.nextInt();
                    totalValue = productValue * quantity;

                    StoreEntity storeEntity = storeController.registerProduct(product, productValue, quantity, totalValue);
                    storage.add(storeEntity);
                    break;
                case 2:
                    System.out.println("Listar produtos");
                    storeController.showProdutcs(storage);
                    System.out.println();
                    break;
                case 3: // buscar

                    input.nextLine();
                    System.out.println("Edição de produtos cadastrados");
                    System.out.print("Informe o ID do produto a ser removido do sistema: ");
                    int IDfind = input.nextInt();
                    if (IDfind > storage.size() || IDfind < 0) {
                        System.out.println("Cadastro não localizado");
                    }
                    StoreEntity storageEntinyFoundItens = storage.get(IDfind);
                    storeController.findItens(storageEntinyFoundItens);
                    break;

                case 4: // editar
                    input.nextLine();
                    System.out.println("Edição de produtos cadastrados");
                    System.out.print("Informe o ID do produto a ser removido do sistema: ");
                    int IDedit = input.nextInt();
                    if (IDedit > storage.size() || IDedit < 0) {
                        System.out.println("Cadastro não localizado");
                    }
                    StoreEntity storageEntinyNew = storage.get(IDedit);
                    StoreEntity newProduct = storeController.editProduct(storageEntinyNew);
                    storage.set(IDedit, newProduct);
                    break;
                case 5: // excluir
                    System.out.println("Remover produtos do sistema");
                    System.out.println("Edição de produtos cadastrados");
                    System.out.print("Informe o ID do produto a ser removido do sistema: ");
                    int IDremove = input.nextInt();
                    if (IDremove > storage.size() || IDremove< 0) {
                        System.out.println("Cadastro não localizado");
                    }
                    storage.remove(IDremove);
                    System.out.println("Produto removido com sucesso!");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Sistema finalizado!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Valor digitado é incorreto, voltando ao menu principal");
            }
        } while (true);

    }
}
