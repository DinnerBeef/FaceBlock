package beef.faceblock;

import beef.faceblock.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = Faceblock.MODID, name = Faceblock.MODNAME, version = Faceblock.MODVERSION, dependencies = "required-after:forge@[14.23.5.2808,)", useMetadata = true) public class Faceblock {

    public static final String MODID = "faceblock";
    public static final String MODNAME = "faceblock";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "beef.faceblock.proxy.ClientProxy", serverSide = "beef.faceblock.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs FBTabs = new FBCreativeTab(CreativeTabs.getNextID());

    @Instance
    public static Faceblock instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
