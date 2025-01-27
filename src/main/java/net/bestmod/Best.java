package net.bestmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Best implements ModInitializer {

    public static final Item Ruby = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item Horn = new Horn(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1).maxDamage(180));
    public static final Item CopperIngot = new Item(new Item.Settings().group(ItemGroup.TOOLS));
    public static final Block RubyOre = new RubyOre();
    public static final Block RubyBlock = new RubyBlock();

    @Override
    public void onInitialize()
    {
        Registry.register(Registry.ITEM, new Identifier("bestmod", "ruby"), Ruby);
        Registry.register(Registry.ITEM, new Identifier("bestmod", "horn"), Horn);
        Registry.register(Registry.ITEM, new Identifier("bestmod", "copper_ingot"), CopperIngot);
        Registry.register(Registry.ITEM, new Identifier("bestmod", "copper_pickaxe"), new CopperPickaxeBase(new ToolMaterialCopper()));
        Registry.register(Registry.BLOCK, new Identifier("bestmod", "ruby_block"), RubyBlock);
        Registry.register(Registry.BLOCK, new Identifier("bestmod", "ruby_ore"), RubyOre);
        Registry.register(Registry.ITEM, new Identifier("bestmod", "ruby_block"), new BlockItem(RubyBlock, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("bestmod", "ruby_ore"), new BlockItem(RubyOre, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
    
}
