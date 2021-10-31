package com.company;

public class Active implements MobileOperator {
    public String tariffs;

    @Override
    public void tariffs(String listOfTariffs) {
        tariffs = "Active center has tariffs: " + listOfTariffs;
    }

    @Override
    public String chooseTariff() {
        return tariffs;
    }
}
