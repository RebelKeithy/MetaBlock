package metablock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class MetaBlock extends Block
{
	int metadata;
	
	public MetaBlock(int id, int metadata, Material material)
	{
		super(id, material);
		
		if(Block.blocksList[id] == null)
		{
			Block block = new Block(id, material);
			GameRegistry.registerBlock(block, ItemMetaBlock.class);
		}
	}
}
