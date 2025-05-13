package com.teste.events;

//Bukkit import events
import org.bukkit.event.Listener; //Classe que escuta eventos
import org.bukkit.event.EventHandler; //marca o metodo que vai reagir ao evento
import org.bukkit.event.player.PlayerJoinEvent; //nome ja diz, player entrar

//Bukkit import entity
import org.bukkit.entity.Player;

public class EventJoinPlayer implements Listener {
	
	//Nome do metodo pode ser qualquer
	@EventHandler //esse método deve reagir a um evento PlayerJoinEvent
	public void onJoinPlayer(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		String nickname = player.getDisplayName();
		
		player.sendMessage(nickname + " Bem Vindo :)");
		
	}
	
}
