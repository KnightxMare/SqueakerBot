package dev.hause.squeakerbot.command.commands;

import java.util.Random;
import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.listener.ChatListener;
import dev.hause.squeakerbot.util.ChatUtil;
import dev.hause.squeakerbot.util.QueryUtil;

@Command.Register(name = "Geolocate", aliases = {"Find", "Locate"})
public class Geolocate extends Command {
	
	private static QueryUtil queryUtil = new QueryUtil();
	
	@Override
	public void onRun() {
		Random random = new Random();
		ChatUtil.sendChatMessage(queryUtil.getQuery(ChatListener.parsedCommand) + "'s exact coordinates are " + "X: " + 1 + (20 - 1) * + random.nextDouble() + " Y: " + + 1 + (20 - 1) * + random.nextDouble());
	}

}
