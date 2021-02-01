package farmerthanos.thanosdustry;

import arc.util.Log;
import farmerthanos.thanosdustry.content.ThBlocks;
import farmerthanos.thanosdustry.content.ThItems;
import farmerthanos.thanosdustry.content.ThUnits;
import mindustry.mod.Mod;

public class Thanosdustry extends Mod{

    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        Log.info("Loading Thanosdustry content");

        new ThBlocks().load();
        new ThItems().load();
        new ThUnits().load();

        Log.info("Loaded Thanosdustry content");
    }
}
