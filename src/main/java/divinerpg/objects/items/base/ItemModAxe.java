package divinerpg.objects.items.base;

import divinerpg.DivineRPG;
import divinerpg.registry.DivineRPGTabs;
import divinerpg.utils.LocalizeUtils;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemModAxe extends ItemAxe {

	public ItemModAxe(ToolMaterial material, String name) {
		// Eskl decided the speed multiplier (the / 5 thing)
		super(material, material.getAttackDamage(), (material.getAttackDamage() / material.getEfficiency()) / 5);
		setRegistryName(DivineRPG.MODID, name);
		setUnlocalizedName(name);
		setCreativeTab(DivineRPGTabs.TOOLS);

	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return this.getItemStackLimit(stack) == 1
				&& (stack.getMaxDamage() < 0 || this.getItemStackLimit(stack) == 1);
	}
}