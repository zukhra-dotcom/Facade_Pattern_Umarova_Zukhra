package com.company;

public class Main {  //https://github.com/zukhra-dotcom/Facade_Pattern_Umarova_Zukhra.git

    public static void main(String[] args) {

        System.out.println(Waiter.tariffInfo(TariffType.BEELINE));
        System.out.println(Waiter.tariffInfo(TariffType.ACTIVE));

    }
}
