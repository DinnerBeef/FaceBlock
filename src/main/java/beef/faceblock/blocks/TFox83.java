package beef.faceblock.blocks;

import beef.faceblock.Faceblock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class TFox83 extends Block {

    public static final ResourceLocation TFOX83 = new ResourceLocation(Faceblock.MODID, "tfox83");

    public TFox83() {
        super(Material.ROCK);
        setRegistryName("tfox83");
        setUnlocalizedName("tfox83");
        setHardness(2);
        setSoundType(SoundType.STONE);
        setCreativeTab(Faceblock.FBTabs);
    }
}
