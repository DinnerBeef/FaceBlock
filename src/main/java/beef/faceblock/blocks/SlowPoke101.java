package beef.faceblock.blocks;

import beef.faceblock.Faceblock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class SlowPoke101 extends Block {

    public static final ResourceLocation SLOWPOKE101 = new ResourceLocation(Faceblock.MODID, "slowpoke101");

    public SlowPoke101() {
        super(Material.ROCK);
        setRegistryName("slowpoke101");
        setUnlocalizedName("slowpoke101");
        setHardness(2);
        setSoundType(SoundType.STONE);
        setCreativeTab(Faceblock.FBTabs);
    }
}
