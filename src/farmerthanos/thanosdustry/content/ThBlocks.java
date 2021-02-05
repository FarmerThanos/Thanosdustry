package farmerthanos.thanosdustry.content;

import farmerthanos.thanosdustry.content.world.blocks.units.PylonBlock;
import mindustry.content.Items;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.meta.BuildVisibility;

import static mindustry.type.ItemStack.with;

public class ThBlocks implements ContentList {
    public static Block
    pylonEpsilon;

    @Override
    public void load() {
        pylonEpsilon = new PylonBlock("pylon-epsilon"){{
            requirements(Category.units, BuildVisibility.shown, with(Items.copper, 2000, Items.lead, 1250, Items.silicon, 1000));
            health = 360;
            size = 3;
            hasItems = false;
            hasLiquids = false;
            hasPower = false;

            unitCapModifier = 1;
        }};

    }
    };
