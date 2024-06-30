package fr.flowsqy.testconomy.economy;

import java.util.List;

import org.bukkit.OfflinePlayer;

import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;

public class EconomyImpl implements Economy {

    private final static String ECONOMY_NAME = "TestConomy";

    // TODO Implement it
    private final EconomyManager economyManager = null;

	@Override
	public boolean isEnabled() {
        return true;
	}

	@Override
	public String getName() {
        return ECONOMY_NAME;
	}

	@Override
	public boolean hasBankSupport() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'hasBankSupport'");
	}

	@Override
	public int fractionalDigits() {
        return -1;
	}

	@Override
	public String format(double amount) {
        return amount + "$";
	}

	@Override
	public String currencyNamePlural() {
        return "";
	}

	@Override
	public String currencyNameSingular() {
        return "";
	}

	@Override
	public boolean hasAccount(String playerName) {
		throw new UnsupportedOperationException("Deprecated");
	}

	@Override
	public boolean hasAccount(OfflinePlayer player) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'hasAccount'");
	}

	@Override
	public boolean hasAccount(String playerName, String worldName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'hasAccount'");
	}

	@Override
	public boolean hasAccount(OfflinePlayer player, String worldName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'hasAccount'");
	}

	@Override
	public double getBalance(String playerName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
	}

	@Override
	public double getBalance(OfflinePlayer player) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
	}

	@Override
	public double getBalance(String playerName, String world) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
	}

	@Override
	public double getBalance(OfflinePlayer player, String world) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
	}

	@Override
	public boolean has(String playerName, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'has'");
	}

	@Override
	public boolean has(OfflinePlayer player, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'has'");
	}

	@Override
	public boolean has(String playerName, String worldName, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'has'");
	}

	@Override
	public boolean has(OfflinePlayer player, String worldName, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'has'");
	}

	@Override
	public EconomyResponse withdrawPlayer(String playerName, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'withdrawPlayer'");
	}

	@Override
	public EconomyResponse withdrawPlayer(OfflinePlayer player, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'withdrawPlayer'");
	}

	@Override
	public EconomyResponse withdrawPlayer(String playerName, String worldName, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'withdrawPlayer'");
	}

	@Override
	public EconomyResponse withdrawPlayer(OfflinePlayer player, String worldName, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'withdrawPlayer'");
	}

	@Override
	public EconomyResponse depositPlayer(String playerName, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'depositPlayer'");
	}

	@Override
	public EconomyResponse depositPlayer(OfflinePlayer player, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'depositPlayer'");
	}

	@Override
	public EconomyResponse depositPlayer(String playerName, String worldName, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'depositPlayer'");
	}

	@Override
	public EconomyResponse depositPlayer(OfflinePlayer player, String worldName, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'depositPlayer'");
	}

	@Override
	public EconomyResponse createBank(String name, String player) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createBank'");
	}

	@Override
	public EconomyResponse createBank(String name, OfflinePlayer player) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createBank'");
	}

	@Override
	public EconomyResponse deleteBank(String name) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'deleteBank'");
	}

	@Override
	public EconomyResponse bankBalance(String name) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'bankBalance'");
	}

	@Override
	public EconomyResponse bankHas(String name, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'bankHas'");
	}

	@Override
	public EconomyResponse bankWithdraw(String name, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'bankWithdraw'");
	}

	@Override
	public EconomyResponse bankDeposit(String name, double amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'bankDeposit'");
	}

	@Override
	public EconomyResponse isBankOwner(String name, String playerName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'isBankOwner'");
	}

	@Override
	public EconomyResponse isBankOwner(String name, OfflinePlayer player) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'isBankOwner'");
	}

	@Override
	public EconomyResponse isBankMember(String name, String playerName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'isBankMember'");
	}

	@Override
	public EconomyResponse isBankMember(String name, OfflinePlayer player) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'isBankMember'");
	}

	@Override
	public List<String> getBanks() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getBanks'");
	}

	@Override
	public boolean createPlayerAccount(String playerName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createPlayerAccount'");
	}

	@Override
	public boolean createPlayerAccount(OfflinePlayer player) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createPlayerAccount'");
	}

	@Override
	public boolean createPlayerAccount(String playerName, String worldName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createPlayerAccount'");
	}

	@Override
	public boolean createPlayerAccount(OfflinePlayer player, String worldName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'createPlayerAccount'");
	}

}
