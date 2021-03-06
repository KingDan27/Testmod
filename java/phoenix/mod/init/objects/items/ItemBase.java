package phoenix.mod.init.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import phoenix.mod.Main;
import phoenix.mod.init.ItemInit;
import phoenix.mod.util.IHasModel;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.orebushtab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
