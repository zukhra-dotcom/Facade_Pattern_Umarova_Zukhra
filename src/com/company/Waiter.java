package com.company;

public class Waiter {
    public static String tariffInfo(TariffType tariffType){
        Tariffs listOfTariffs = new Tariffs();

        switch (tariffType){
            case BEELINE:
                MobileOperator beeline = new Beeline();
                String beelineTariffs = listOfTariffs.getBeelineTariffs();
                beeline.tariffs(beelineTariffs);
                return (beeline.chooseTariff());

            case ACTIVE:
                MobileOperator active = new Active();
                String activeTariffs = listOfTariffs.getActiveTariffs();
                active.tariffs(activeTariffs);
                return (active.chooseTariff());
        }
        return null;

    }
}
