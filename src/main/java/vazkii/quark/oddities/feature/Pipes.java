package vazkii.quark.oddities.feature;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import vazkii.quark.base.module.Feature;
import vazkii.quark.oddities.block.BlockPipe;
import vazkii.quark.oddities.tile.TilePipe;

public class Pipes extends Feature {

	public static Block pipe;
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		pipe = new BlockPipe();
		registerTile(TilePipe.class, "pipe");
	}
	
}
