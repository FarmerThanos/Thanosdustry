package farmerthanos.thanosdustry.content;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.ctype.ContentList;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.BulletType;
import mindustry.entities.bullet.LaserBoltBulletType;
import mindustry.gen.Sounds;
import mindustry.gen.UnitEntity;
import mindustry.graphics.Pal;
import mindustry.type.AmmoTypes;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

public class ThUnits implements ContentList {
    public static UnitType
            //Bit units, air
            bit; // kilo, giga, peta, exa;

    @Override
    public void load() {

        bit = new UnitType("bit") {{
            flying = true;
            speed = 3.25f;
            accel = 0.15f;
            drag = 0.02f;
            hitSize = 4f;
            health = 50;
            engineOffset = 5f;
            engineSize = 0.1f;
            targetAir = true;
            commandLimit = 12;
            circleTarget = false;
            ammoType = AmmoTypes.power;

            engineSize = 2f;
            engineOffset = 5f;

            weapons.add(new Weapon() {{
                y = 0f;
                x = 2f;
                reload = 20f;
                ejectEffect = Fx.none;
                bullet = new BasicBulletType(3.0f, 3) {{
                    alternate = true;
                    width = 5f;
                    height = 7f;
                    lifetime = 64f;
                    shootEffect = Fx.shootSmall;
                    smokeEffect = Fx.none;
                    ammoMultiplier = 2;
                    backColor = Pal.sapBulletBack;
                    frontColor = Pal.sapBullet;
                    hittable = true;
                }};
                shootSound = ThSounds.bitPew;
            }});
            constructor = UnitEntity::create;
        }};

    }
}
