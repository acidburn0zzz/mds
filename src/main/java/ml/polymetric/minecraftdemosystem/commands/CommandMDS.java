package ml.polymetric.minecraftdemosystem.commands;

import ml.polymetric.minecraftdemosystem.MinecraftDemoSystem;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

public class CommandMDS extends CommandBase {
	@Override
	public String getCommandName() {
		return "mds";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/mds <start|stop> <rec|play|render> <filename>\n/mds set <key> <value>";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		if (!(sender instanceof EntityPlayer)) {
			System.out.println("You must use this command as a player!");
			return;
		}
		
		EntityPlayer player = (EntityPlayer) sender;
		
		if (args[0].equals("start") || args[0].equals("stop")) {
			if(args[1].equals("rec")) {
				
			} else if (args[1].equals("play")) {
				
			} else if (args[2].equals("render")) {
				
			}
		} else if (args[0].equals("set")){
			for (int i = 0; i < MinecraftDemoSystem.demoSystem.keys; i++) {
				
			}
		}
	}
}
