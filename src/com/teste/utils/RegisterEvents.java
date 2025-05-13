package com.teste.utils;

import com.teste.Main;

//Eventos
import com.teste.events.EventJoinPlayer; //evento do player entrar no servidor :)

//Classe para registrar eventos
public class RegisterEvents {
	public static void register(Main plugin) {
		plugin.getServer().getPluginManager().registerEvents(new EventJoinPlayer(), plugin);
	}
}
