package beef.faceblock;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;

public class FBCreativeTab extends CreativeTabs {
    public FBCreativeTab(int id) {
        super(Faceblock.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.SlowPoke101);
    }
    @Override
    public String getTranslatedTabLabel() {
        return I18n.translateToLocal("FaceBlock Tab");
    }
}
