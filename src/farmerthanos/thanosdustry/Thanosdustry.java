package farmerthanos.thanosdustry;

import arc.util.Log;
import farmerthanos.thanosdustry.content.TBlocks;
import farmerthanos.thanosdustry.content.TItems;
import mindustry.mod.Mod;

public class Thanosdustry extends Mod{

    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        Log.info("Loading Thanosdustry content");

        new TBlocks().load();
        new TItems().load();

        Log.info("Loaded Thanosdustry content");
    }
}
