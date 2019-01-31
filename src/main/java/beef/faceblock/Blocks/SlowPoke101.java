package beef.faceblock.Blocks;

import beef.faceblock.Faceblock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class SlowPoke101 extends Block {
    public SlowPoke101() {
        super(Material.CLAY);
        setRegistryName(new ResourceLocation(Faceblock.MODID, "slowpoke101"));
        setUnlocalizedName(Faceblock.MODID + ".SlowPoke101");
        setHarvestLevel( "pickaxe", 0);
        setCreativeTab(Faceblock.FBTabs);

    }
}
