package farmerthanos.thanosdustry.content.world.blocks.units;

import arc.Core;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.TextureRegion;
import arc.util.Time;
import mindustry.gen.Building;
import mindustry.world.Block;
import mindustry.world.meta.BlockGroup;

public class PylonBlock extends Block {
    public TextureRegion baseSprite;
    public TextureRegion rotor;

    public PylonBlock(String name) {
        super(name);
        solid = true;
        configurable = false;
        group = BlockGroup.units;
    }

    @Override
    public void load() {
        super.load();
        baseSprite = Core.atlas.find(name);
        rotor = Core.atlas.find(name + "-rotor");
    }

    public class PylonBlockBuild extends Building {

        @Override
        public void draw() {
            Draw.rect(baseSprite, x, y);
            Draw.rect(rotor, x, y, Time.time * 1);
        }
    }
}
