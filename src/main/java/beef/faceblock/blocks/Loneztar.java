package beef.faceblock.blocks;


import beef.faceblock.Faceblock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class Loneztar extends Block {

    public static final ResourceLocation LONEZTAR = new ResourceLocation(Faceblock.MODID, "loneztar");

    public Loneztar() {
        super(Material.ROCK);
        setRegistryName("loneztar");
        setUnlocalizedName("loneztar");
        setHardness(2);
        setSoundType(SoundType.STONE);
        setCreativeTab(Faceblock.FBTabs);
    }
}
