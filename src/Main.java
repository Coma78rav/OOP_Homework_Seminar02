import Human.Human;
import Market.Market;
import Product.EProduct;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Human andrey = new Human("Андрей");
        Human juliya = new Human("Юля");
        Human anya = new Human("Аня");
        Human kirill = new Human("Кирилл");
        Human stas = new Human("Стас");
        Human pavel = new Human("Павел");
        Human sergey = new Human("Сергей");

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