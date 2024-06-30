package fr.flowsqy.testconomy;

import org.bukkit.Bukkit;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;

import fr.flowsqy.testconomy.economy.EconomyImpl;
import net.milkbowl.vault.economy.Economy;

public class TestConomyPlugin extends JavaPlugin {

	@Override
	public void onLoad() {
        Bukkit.getServicesManager().register(Economy.class, new EconomyImpl(), this, ServicePriority.High);
	} 

}
