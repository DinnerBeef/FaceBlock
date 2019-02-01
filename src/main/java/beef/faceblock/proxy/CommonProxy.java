package beef.faceblock.proxy;

import beef.faceblock.Faceblock;
import beef.faceblock.ModBlocks;
import beef.faceblock.blocks.SlowPoke101;
import beef.faceblock.blocks.TFox83;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Faceblock.MODID)
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new SlowPoke101());
        event.getRegistry().register(new TFox83());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.slowPoke101).setRegistryName(SlowPoke101.SLOWPOKE101));
        event.getRegistry().register(new ItemBlock(ModBlocks.tFox83).setRegistryName(TFox83.TFOX83));
    }
}

