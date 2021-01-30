package farmerthanos.thanosdustry.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.ai.types.*;
import mindustry.content.Fx;
import mindustry.ctype.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;

public class TUnitTypes implements ContentList {
    public static UnitType
            //Bit units
            bit; // kilo, giga, peta, exa;

    @Override
    public void load(){

        bit = new UnitType("bit"){{
            flying = true;
            speed = 1f;
            accel = 0.1f;
            drag = 0.02f;
            hitSize = 4f;
            health = 50;
            engineOffset = 5f;
            engineSize = 0.1f;
            targetAir = true;
            commandLimit = 12;
            circleTarget = false;
            ammoType = AmmoTypes.power;


            weapons.add(new Weapon(){{
                y = 0f;
                x = 2f;
                reload = 13f;
                ejectEffect = Fx.none;
                bullet = new LaserBoltBulletType(3.0f, 3){{
                    width = 4f;
                    height = 7f;
                    lifetime = 64f;
                    shootEffect = Fx.shootHeal;
                    smokeEffect = Fx.none;
                    ammoMultiplier = 2;
                    backColor = Pal.heal;
                    frontColor = Color.white;
                }};
                shootSound = Sounds.pew;
            }});
        }};

    }
}
