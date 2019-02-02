package beef.faceblock.blocks;

import beef.faceblock.Faceblock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class DinnerBeef extends Block {

    public static final ResourceLocation DINNERBEEF = new ResourceLocation(Faceblock.MODID, "dinnerbeef");

    public DinnerBeef() {
        super(Material.ROCK);
        setRegistryName("dinnerbeef");
        setUnlocalizedName("dinnerbeef");
        setHardness(2);
        setSoundType(SoundType.STONE);
        setCreativeTab(Faceblock.FBTabs);
    }
}


