
package net.zzzetnik.alchemy.itemgroup;

import net.zzzetnik.alchemy.AlchemyDummiesModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

@AlchemyDummiesModElements.ModElement.Tag
public class AlchemyItemGroup extends AlchemyDummiesModElements.ModElement {
	public AlchemyItemGroup(AlchemyDummiesModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabalchemy") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.JUNGLE_PLANKS);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
