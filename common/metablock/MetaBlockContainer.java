package metablock;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

class MetaBlockContainer extends Block
{
	private MetaBlockContainer[] blocks;
	
	public MetaBlockContainer(int id, Material material) 
	{
		super(id, material);
		blocks = new MetaBlockContainer[16];
	}

}