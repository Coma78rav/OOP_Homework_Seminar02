package Market;

import Human.Human;

public interface MarketBehaviour {
    void acceptToMarket(Human actor);//входит в магазин

    void releaseFromMarket(Human actor);//выходит из магазина

    void update();//обновление состояния магазина

}
