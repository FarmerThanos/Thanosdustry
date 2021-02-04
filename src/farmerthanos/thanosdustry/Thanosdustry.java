package farmerthanos.thanosdustry;

import arc.Events;
import arc.util.Log;
import farmerthanos.thanosdustry.content.ThBlocks;
import farmerthanos.thanosdustry.content.ThItems;
import farmerthanos.thanosdustry.content.ThSounds;
import farmerthanos.thanosdustry.content.ThUnits;
import mindustry.game.EventType;
import mindustry.mod.Mod;

public class Thanosdustry extends Mod{
    public Thanosdustry() {
        ThSounds.load();

        Events.on(EventType.DisposeEvent.class, e -> {
            ThSounds.dispose();
        });
    }

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
