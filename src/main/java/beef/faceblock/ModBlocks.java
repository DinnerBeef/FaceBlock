package beef.faceblock;

import beef.faceblock.blocks.LatvianModder;
import beef.faceblock.blocks.Loneztar;
import beef.faceblock.blocks.SlowPoke101;
import beef.faceblock.blocks.TFox83;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    @GameRegistry.ObjectHolder("faceblock:slowpoke101")
    public static SlowPoke101 slowPoke101;

    @GameRegistry.ObjectHolder("faceblock:TFox83")
    public static TFox83 tFox83;

    @GameRegistry.ObjectHolder("faceblock:LatvianModder")
    public static LatvianModder latvianModder;

    @GameRegistry.ObjectHolder("faceblock:loneztar")
    public static Loneztar loneztar;
}