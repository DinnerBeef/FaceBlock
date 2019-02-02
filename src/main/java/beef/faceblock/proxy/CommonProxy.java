package beef.faceblock.proxy;

import beef.faceblock.Faceblock;
import beef.faceblock.ModBlocks;
import beef.faceblock.blocks.*;
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
        event.getRegistry().register(new DinnerBeef());
        event.getRegistry().register(new LatvianModder());
        event.getRegistry().register(new Loneztar());
//        event.getRegistry().register(new SlowPoke101());
//       event.getRegistry().register(new TFox83());

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(ModBlocks.dinnerBeef).setRegistryName(DinnerBeef.DINNERBEEF));
        event.getRegistry().register(new ItemBlock(ModBlocks.latvianModder).setRegistryName(LatvianModder.LATVIANMODDER));
        event.getRegistry().register(new ItemBlock(ModBlocks.loneztar).setRegistryName(Loneztar.LONEZTAR));
//        event.getRegistry().register(new ItemBlock(ModBlocks.slowPoke101).setRegistryName(SlowPoke101.SLOWPOKE101));
//        event.getRegistry().register(new ItemBlock(ModBlocks.tFox83).setRegistryName(TFox83.TFOX83));
    }
}

