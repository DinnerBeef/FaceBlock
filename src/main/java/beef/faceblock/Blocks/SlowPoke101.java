package beef.faceblock.Blocks;

import beef.faceblock.Faceblock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class SlowPoke101 extends Block {

    public static final ResourceLocation SLOWPOKE101 = new ResourceLocation(Faceblock.MODID, "slowpoke101");

    public SlowPoke101() {
        super(Material.CLAY);
        setRegistryName(SLOWPOKE101);
        setUnlocalizedName(Faceblock.MODID + ".slowpoke101");
        setHarvestLevel( "pickaxe", 0);
        setCreativeTab(Faceblock.FBTabs);
    }
}
