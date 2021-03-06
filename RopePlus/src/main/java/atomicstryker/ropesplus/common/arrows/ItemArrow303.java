package atomicstryker.ropesplus.common.arrows;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemArrow303 extends Item
{
    
	public EntityArrow303 arrow;

    public ItemArrow303(EntityArrow303 entityarrow303)
    {
        super();
        arrow = entityarrow303;
    }
    
    @Override
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(arrow.getIcon());
    }
    
    @Override
    public String getItemStackDisplayName(ItemStack itemStack)
    {
        return EnumChatFormatting.AQUA+super.getItemStackDisplayName(itemStack);
    }
    
}
