package beef.faceblock.blocks;

import beef.faceblock.Faceblock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class LatvianModder extends Block {

    public static final ResourceLocation LATVIANMODDER = new ResourceLocation(Faceblock.MODID, "latviannodder");

    public LatvianModder() {
        super(Material.ROCK);
        setRegistryName("latvianmodder");
        setUnlocalizedName("latvianmodder");
        setHardness(2);
        setSoundType(SoundType.STONE);
        setCreativeTab(Faceblock.FBTabs);
    }
}
