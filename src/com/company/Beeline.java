package com.company;

public class Beeline implements MobileOperator {
    public String tariffs;

    @Override
    public void tariffs(String listOfTariffs) {
        tariffs = "Beeline center has tariffs: " + listOfTariffs;
    }

    @Override
    public String chooseTariff() {
        return tariffs;
    }
}
