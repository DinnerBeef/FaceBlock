package beef.faceblock.blocks;

import beef.faceblock.Faceblock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LatvianModder extends Block {

    public static final ResourceLocation LATVIANMODDER = new ResourceLocation(Faceblock.MODID, "latvianmodder");

    public LatvianModder() {
        super(Material.ROCK);
        setRegistryName("latvianmodder");
        setUnlocalizedName("latvianmodder");
        setHardness(2);
        setSoundType(SoundType.STONE);
        setCreativeTab(Faceblock.FBTabs);
    }

    @SideOnly(Side.CLIENT) public void initModel() { ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory")); }
}
