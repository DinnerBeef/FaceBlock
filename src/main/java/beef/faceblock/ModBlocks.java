package beef.faceblock;

import beef.faceblock.blocks.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("faceblock:dinnerbeef")
    public static DinnerBeef dinnerBeef;

    @GameRegistry.ObjectHolder("faceblock:latvianmodder")
    public static LatvianModder latvianModder;


    @GameRegistry.ObjectHolder("faceblock:loneztar")
    public static Loneztar loneztar;

//    @GameRegistry.ObjectHolder("faceblock:slowpoke101")
//    public static SlowPoke101 slowPoke101;
//
//    @GameRegistry.ObjectHolder("faceblock:TFox83")
//    public static TFox83 tFox83;


    @SideOnly(Side.CLIENT) public static void initModels() {
        dinnerBeef.initModel();
        latvianModder.initModel();
        loneztar.initModel();
    }
}