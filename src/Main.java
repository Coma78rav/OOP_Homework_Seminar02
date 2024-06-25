import Human.Human;
import Market.Market;
import Product.EProduct;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Human andrey = new Human("Иван Степанович");
        Human juliya = new Human("Валюха");
        Human anya = new Human("Ольга Николаевна");
        Human kirill = new Human("Юрий Анатольевич");
        Human stas = new Human("Митяй");
        Human pavel = new Human("Женя");
        Human sergey = new Human("Беркович");

        Market semerochka = new Market();

        semerochka.acceptToMarket(List.of(andrey, juliya, anya, kirill, pavel, stas));

        semerochka.giveOrders(andrey, List.of(EProduct.SUGAR, EProduct.JUICE, EProduct.VODKA));
        semerochka.giveOrders(juliya, List.of(EProduct.APPLE, EProduct.FILE, EProduct.POTATO, EProduct.MEAT));
        semerochka.giveOrder(anya, EProduct.APPLE);
        semerochka.giveOrder(kirill, EProduct.APPLE);

        semerochka.update();

        semerochka.releaseFromMarket(juliya);
        semerochka.releaseFromMarket(anya);

        semerochka.acceptToMarket(sergey);
        semerochka.giveOrder(sergey, EProduct.VODKA);

        semerochka.update();

        semerochka.releaseFromMarket();

        semerochka.update();

    }
}