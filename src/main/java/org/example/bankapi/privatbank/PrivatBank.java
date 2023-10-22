package org.example.bankapi.privatbank;

import org.example.bankapi.Bank;

public class PrivatBank implements Bank {
    private static final String URL = "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5";
    public static final String COMMAND_NAME = "/setPrivatbank";
    protected static final String NAME = "ПриватБанк";

    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void setName(String name) {

    }
}
