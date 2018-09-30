package phoenix.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import phoenix.mod.init.objects.blocks.BlockBase;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_COPPER = new BlockBase ("block_copper", Material.IRON);

}