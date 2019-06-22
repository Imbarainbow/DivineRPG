package naturix.divinerpg.objects.items.arcana;

import java.util.List;
import java.util.Random;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import naturix.divinerpg.objects.items.base.ItemMod;
import naturix.divinerpg.registry.DRPGCreativeTabs;
import naturix.divinerpg.utils.TooltipHelper;
import naturix.divinerpg.utils.TooltipLocalizer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemEnderScepter extends ItemMod {

	private Random rand = new Random();
	
	public ItemEnderScepter(String name) {
		super(name, DRPGCreativeTabs.swords);
		setMaxStackSize(1);
	}

	@Override
	  public @Nonnull ActionResult<ItemStack> onItemRightClick(@Nonnull World world, @Nonnull EntityPlayer player, @Nonnull EnumHand hand) {
		//FIXME - needs to consume arcana
		if(world.isRemote) {
		RayTraceResult pos = player.rayTrace(32, 1);
		int x = pos.getBlockPos().getX(), y = pos.getBlockPos().getY()+1, z = pos.getBlockPos().getZ();
		player.dismountRidingEntity();
        ((EntityPlayer)player).setPosition(x, y, z);
        player.playSound(SoundEvents.BLOCK_PORTAL_TRAVEL, 1, 1);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItemMainhand());
		}
        return new ActionResult<ItemStack>(EnumActionResult.FAIL, player.getHeldItemMainhand());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> list, ITooltipFlag flagIn)
    {	list.add(TooltipLocalizer.arcanaConsumed(75));
		list.add(TooltipHelper.getInfoText("tooltip.ender_scepter"));
		list.add(TooltipLocalizer.infiniteUses());
	}
}