package farmerthanos.thanosdustry.content;

import arc.Core;
import arc.assets.AssetDescriptor;
import arc.assets.loaders.SoundLoader;
import arc.audio.Sound;
import mindustry.Vars;

public class ThSounds {
    protected static Sound loadSound(String soundName) {
        if(!Vars.headless) {
            String name = "sounds/" + soundName;
            String path = name + ".ogg";

            Sound sound = new Sound();

            AssetDescriptor<?> desc = Core.assets.load(path, Sound.class, new SoundLoader.SoundParameter(sound));
            desc.errored = Throwable::printStackTrace;

            return sound;
        } else {
            return new Sound();
        }
    }

    protected static Sound disposeSound(String soundName) {
        if(!Vars.headless) {
            String name = "sounds/" + soundName;
            String path = name + ".ogg";

            if(Core.assets.isLoaded(path, Sound.class)) {
                Core.assets.unload(path);
            }
        }

        return null;
    }
    public static Sound
            bitPew;

    public static void load() {
        bitPew = loadSound("bitPew");
    }

    public static void dispose() {
        bitPew = disposeSound("bitPew");
    }
}
