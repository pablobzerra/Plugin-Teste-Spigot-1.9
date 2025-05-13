package com.teste;

import com.teste.utils.RegisterCommand;
import com.teste.utils.RegisterEvents;
//Bukkit Imoorts
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override //<-- Sobresvecrer o metodo 
	public void onEnable() {
		
		RegisterCommand.setCommands(this); //Registrar os comandos :)
		RegisterEvents.register(this); //registrar eventos
		
		getLogger().info("Ativado!!");
	}
	
	@Override //<-- Sobresvecrer o metodo 
	public void onDisable() {
		getLogger().info("Desativado!!");
	}
	
}
