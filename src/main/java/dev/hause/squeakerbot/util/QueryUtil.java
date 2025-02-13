package dev.hause.squeakerbot.util;

import org.apache.commons.lang3.StringUtils;
import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.command.CommandManager;

public class QueryUtil {
	
	public String getQuery(String message) {
		String[] query = null;
 		for(Command c : CommandManager.commands) {
			if(StringUtils.containsIgnoreCase(message, c.getCommand())) {
				query = message.split("(?<=" + c.getCommand().toLowerCase() + ")");
				System.out.println(query[0]);
			}
		}
 		
 		if(query.length == 2) {
 			return query[1];
 		}
 		return "You didn't enter a person to geolocate!";
 		
		
	}

}
