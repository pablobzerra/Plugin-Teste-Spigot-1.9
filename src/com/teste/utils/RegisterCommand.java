package com.teste.utils;


import com.teste.Main; //classe

//Bukkit imports 
import org.bukkit.command.CommandExecutor;

//Comandos
import com.teste.commands.Comando1;

//Classe para registrar os comandos
public class RegisterCommand {
	public static void setCommands(Main plugin) {
		/* Registrar o comando!
		 * plugin.getCommand(null).setExecutor(plugin);
		*/
		plugin.getCommand("comando1").setExecutor(new Comando1(plugin));
	}
	
}
