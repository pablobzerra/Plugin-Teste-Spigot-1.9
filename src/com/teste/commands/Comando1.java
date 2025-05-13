package com.teste.commands;
import com.teste.Main;

//Este é um comando de teste :)

//Bukkit Imports command
import org.bukkit.command.Command; //<-- comando executado!, obter informacoes sobre o comando
import org.bukkit.command.CommandExecutor; //uma interface, responsavel por lidar com a execucao do comando
import org.bukkit.command.CommandSender; //quem enviou o comando!

//Bukkit  Import Player
import org.bukkit.entity.Player; //Classe player Objeto



public class Comando1 implements CommandExecutor {
	private Main plugin;

	public Comando1(Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		boolean checkplayer = sender instanceof Player; //verificar se é um player
		
		if (checkplayer) {
			Player player = (Player) sender; //instanciar um player
			player.sendMessage("Hello World!"); //enviar a msg ao player
		}
		
		
		
		return true;
	}
	
	
}
