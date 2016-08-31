package ml.polymetric.minecraftdemosystem;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import ml.polymetric.minecraftdemosystem.commands.CommandMDS;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;

@Mod(modid = MinecraftDemoSystem.MODID, version = MinecraftDemoSystem.VERSION)
public class MinecraftDemoSystem {
	public static final String MODID = "MinecraftDemoSystem";
	public static final String VERSION = "1.0";

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// some example code
		System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
	}

	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		
	}
}
