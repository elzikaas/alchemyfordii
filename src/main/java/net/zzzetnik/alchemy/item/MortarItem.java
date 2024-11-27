
package net.zzzetnik.alchemy.item;

import net.zzzetnik.alchemy.itemgroup.AlchemyItemGroup;
import net.zzzetnik.alchemy.AlchemyDummiesModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import java.util.List;

@AlchemyDummiesModElements.ModElement.Tag
public class MortarItem extends AlchemyDummiesModElements.ModElement {
	@ObjectHolder("alchemy_dummies:mortar")
	public static final Item block = null;

	public MortarItem(AlchemyDummiesModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AlchemyItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("mortar");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("\u0421\u041E\u0441\u0438 \u0445\u0443\u0439 \u043C\u0430\u0442\u0432\u0435\u0439"));
		}
	}
}
