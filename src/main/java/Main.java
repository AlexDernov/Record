import record.*;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Max", 26, "22297");
        Species species1 = new Species("cat", 250);
        Species species2 = new Species("dog", 500);

        Owner owner2 = new Owner("lisa", 39, "20987");
        Animal animal1 = new Animal(1, "Tom", species1, 3, owner1);
        Animal animal2 = new Animal(2, "Tim", species2, 6, owner2);
        Animal animal3 = new Animal(2, "Tii", species2, 9, owner1);
        System.out.println(animal3.equals(animal2));
        System.out.println(animal1);
        System.out.println(animal2);

        Client client1 = new Client("Max", "Mustermann", 1);
        Client client2 = new Client("Lise", "Mustermann", 2);
        BankService bankService = new BankService();
        bankService.openAccount(client1);
        bankService.openAccount(client2);
        bankService.transferMoney(client1);

    }
}
