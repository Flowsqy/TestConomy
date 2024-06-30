package fr.flowsqy.testconomy.economy;

import java.util.HashMap;
import java.util.Map;

public class Account {

    private double globalAccount;
    private final Map<String, Double> worldAccounts;

    public Account() {
        globalAccount = 0.0d;
        worldAccounts = new HashMap<>();
    }

}
