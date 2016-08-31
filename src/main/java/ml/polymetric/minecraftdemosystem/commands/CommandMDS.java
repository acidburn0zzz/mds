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
		
	}
}
