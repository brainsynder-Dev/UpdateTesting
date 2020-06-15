package lib.brainsynder.sounds;

import lib.brainsynder.EnumVersion;
import lib.brainsynder.ServerVersion;
import lib.brainsynder.apache.EnumUtils;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.lang.annotation.Annotation;

/**
 * This class translates sounds to and from 1.8 and 1.9 spigot versions depending on what the server is running.
 */
public enum SoundMaker {
    @EnumVersion(version = ServerVersion.v1_8_R3) AMBIENT_CAVE("AMBIENCE_CAVE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_ANVIL_BREAK("ANVIL_BREAK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_ANVIL_DESTROY("ANVIL_BREAK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_ANVIL_FALL("ANVIL_BREAK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_ANVIL_HIT("ANVIL_BREAK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_ANVIL_LAND("ANVIL_LAND"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_ANVIL_PLACE("ANVIL_BREAK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_ANVIL_STEP("ANVIL_BREAK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_ANVIL_USE("ANVIL_USE"),
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_BREWING_STAND_BREW,
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_CHEST_CLOSE("CHEST_CLOSE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_CHEST_LOCKED("CHEST_CLOSE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_CHEST_OPEN("CHEST_OPEN"),
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_CHORUS_FLOWER_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_CHORUS_FLOWER_GROW,
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_CLOTH_BREAK("DIG_WOOL", name -> name.replace("CLOTH", "WOOL")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_FIRE_AMBIENT("FIRE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_GLASS_BREAK("GLASS"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_GLASS_FALL("GLASS"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_GLASS_HIT("GLASS"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_GLASS_PLACE("GLASS"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_GLASS_STEP("GLASS"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_GRASS_BREAK("DIG_GRASS"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_GRASS_STEP("STEP_GRASS"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_GRAVEL_BREAK("DIG_GRAVEL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_GRAVEL_STEP("STEP_GRAVEL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_IRON_DOOR_CLOSE("DOOR_CLOSE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_IRON_DOOR_OPEN("DOOR_OPEN"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_IRON_TRAPDOOR_CLOSE("DOOR_CLOSE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_IRON_TRAPDOOR_OPEN("DOOR_OPEN"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_LADDER_STEP("STEP_LADDER"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_LAVA_AMBIENT("LAVA"),
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_LAVA_EXTINGUISH,
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_LAVA_POP("LAVA_POP"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_LEVER_CLICK("CLICK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_METAL_PRESSUREPLATE_CLICK_OFF("CLICK", name -> name.replace("PRESSUREPLATE", "PRESSURE_PLATE")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_METAL_PRESSUREPLATE_CLICK_ON("CLICK", name -> name.replace("PRESSUREPLATE", "PRESSURE_PLATE")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_NOTE_BASEDRUM("NOTE_BASS_DRUM", name -> name.replace("NOTE", "NOTE_BLOCK")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_NOTE_BASS("NOTE_BASS", name -> name.replace("NOTE", "NOTE_BLOCK")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_NOTE_HARP("NOTE_PIANO", name -> name.replace("NOTE", "NOTE_BLOCK")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_NOTE_HAT("NOTE_STICKS", name -> name.replace("NOTE", "NOTE_BLOCK")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_NOTE_PLING("NOTE_PLING", name -> name.replace("NOTE", "NOTE_BLOCK")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_NOTE_SNARE("NOTE_SNARE_DRUM", name -> name.replace("NOTE", "NOTE_BLOCK")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_PISTON_CONTRACT("PISTON_RETRACT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_PISTON_EXTEND("PISTON_EXTEND"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_PORTAL_AMBIENT("PORTAL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_PORTAL_TRAVEL("PORTAL_TRAVEL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_PORTAL_TRIGGER("PORTAL_TRIGGER"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_SAND_BREAK("DIG_SAND"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_SAND_STEP("STEP_SAND"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_SNOW_BREAK("DIG_SNOW"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_SNOW_STEP("STEP_SNOW"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_STONE_BREAK("DIG_STONE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_STONE_BUTTON_CLICK_OFF("CLICK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_STONE_BUTTON_CLICK_ON("CLICK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_STONE_PRESSUREPLATE_CLICK_OFF("CLICK", name -> name.replace("PRESSUREPLATE", "PRESSURE_PLATE")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_STONE_PRESSUREPLATE_CLICK_ON("CLICK", name -> name.replace("PRESSUREPLATE", "PRESSURE_PLATE")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_STONE_STEP("STEP_STONE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_WATER_AMBIENT("WATER"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_WOOD_BREAK("DIG_WOOD"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_WOOD_BUTTON_CLICK_OFF("WOOD_CLICK", name -> name.replace("WOOD", "WOODEN")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_WOOD_BUTTON_CLICK_ON("WOOD_CLICK", name -> name.replace("WOOD", "WOODEN")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_WOOD_PRESSUREPLATE_CLICK_OFF("WOOD_CLICK", name -> name.replace("PRESSUREPLATE", "PRESSURE_PLATE")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_WOOD_PRESSUREPLATE_CLICK_ON("WOOD_CLICK", name -> name.replace("PRESSUREPLATE", "PRESSURE_PLATE")),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_WOOD_STEP("STEP_WOOD"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_WOODEN_DOOR_CLOSE("DOOR_CLOSE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_WOODEN_DOOR_OPEN("DOOR_OPEN"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_WOODEN_TRAPDOOR_CLOSE("DOOR_CLOSE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) BLOCK_WOODEN_TRAPDOOR_OPEN("DOOR_OPEN"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ARROW_HIT("ARROW_HIT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ARROW_HIT_PLAYER("ARROW_HIT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ARROW_SHOOT("SHOOT_ARROW"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_BAT_AMBIENT("BAT_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_BAT_DEATH("BAT_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_BAT_HURT("BAT_HURT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_BAT_LOOP("BAT_LOOP"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_BAT_TAKEOFF("BAT_TAKEOFF"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_BLAZE_DEATH("BLAZE_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_CAT_AMBIENT("CAT_MEOW"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_CAT_HISS("CAT_HISS"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_CAT_HURT("CAT_HIT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_CAT_PURR("CAT_PURR"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_CAT_PURREOW("CAT_PURREOW"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_CHICKEN_AMBIENT("CHICKEN_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_CHICKEN_EGG("CHICKEN_EGG_POP"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_CHICKEN_HURT("CHICKEN_HURT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_CHICKEN_STEP("CHICKEN_WALK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_COW_AMBIENT("COW_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_COW_HURT("COW_HURT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_COW_STEP("COW_WALK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_CREEPER_DEATH("CREEPER_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_DONKEY_AMBIENT("DONKEY_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_DONKEY_ANGRY("DONKEY_ANGRY"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_DONKEY_DEATH("DONKEY_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_DONKEY_HURT("DONKEY_HIT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERDRAGON_DEATH("ENDERDRAGON_DEATH", name -> name.replace("ENDERDRAGON", "ENDER_DRAGON")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERDRAGON_FLAP("ENDERDRAGON_WINGS", name -> name.replace("ENDERDRAGON", "ENDER_DRAGON")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERDRAGON_GROWL("ENDERDRAGON_GROWL", name -> name.replace("ENDERDRAGON", "ENDER_DRAGON")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERDRAGON_HURT("ENDERDRAGON_HIT", name -> name.replace("ENDERDRAGON", "ENDER_DRAGON")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERMEN_AMBIENT("ENDERMAN_IDLE", name -> name.replace("ENDERMEN", "ENDERMAN")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERMEN_DEATH("ENDERMAN_DEATH", name -> name.replace("ENDERMEN", "ENDERMAN")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERMEN_HURT("ENDERMAN_HIT", name -> name.replace("ENDERMEN", "ENDERMAN")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERMEN_SCREAM("ENDERMAN_SCREAM", name -> name.replace("ENDERMEN", "ENDERMAN")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERMEN_STARE("ENDERMAN_STARE", name -> name.replace("ENDERMEN", "ENDERMAN")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERMEN_TELEPORT("ENDERMAN_TELEPORT", name -> name.replace("ENDERMEN", "ENDERMAN")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERMITE_AMBIENT("SILVERFISH_IDLE", name -> name.replace("ENDERMEN", "ENDERMAN")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERMITE_DEATH("SILVERFISH_KILL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERMITE_HURT("SILVERFISH_HIT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ENDERMITE_STEP("SILVERFISH_WALK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_EXPERIENCE_ORB_PICKUP("ORB_PICKUP"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_FIREWORK_BLAST("FIREWORK_BLAST", name -> name.replace("FIREWORK", "FIREWORK_ROCKET")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_FIREWORK_BLAST_FAR("FIREWORK_BLAST2", name -> name.replace("FIREWORK", "FIREWORK_ROCKET")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_FIREWORK_LARGE_BLAST("FIREWORK_LARGE_BLAST", name -> name.replace("FIREWORK", "FIREWORK_ROCKET")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_FIREWORK_LARGE_BLAST_FAR("FIREWORK_LARGE_BLAST2", name -> name.replace("FIREWORK", "FIREWORK_ROCKET")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_FIREWORK_LAUNCH("FIREWORK_LAUNCH", name -> name.replace("FIREWORK", "FIREWORK_ROCKET")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_FIREWORK_SHOOT("FIRE_IGNITE", name -> name.replace("FIREWORK", "FIREWORK_ROCKET")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_FIREWORK_TWINKLE("FIREWORK_TWINKLE", name -> name.replace("FIREWORK", "FIREWORK_ROCKET")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_FIREWORK_TWINKLE_FAR("FIREWORK_TWINKLE2", name -> name.replace("FIREWORK", "FIREWORK_ROCKET")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_GENERIC_BIG_FALL("FALL_BIG"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_GENERIC_DRINK("DRINK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_GENERIC_EAT("EAT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_GENERIC_EXPLODE("EXPLODE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_GENERIC_SMALL_FALL("FALL_SMALL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_GENERIC_SPLASH("SPLASH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_GENERIC_SWIM("SWIM"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_GHAST_DEATH("GHAST_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_GHAST_SCREAM("GHAST_SCREAM"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_GHAST_SHOOT("GHAST_FIREBALL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_GHAST_WARN("GHAST_MOAN"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HORSE_AMBIENT("HORSE_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HORSE_ANGRY("HORSE_ANGRY"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HORSE_ARMOR("HORSE_ARMOR"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HORSE_BREATHE("HORSE_BREATHE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HORSE_DEATH("HORSE_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HORSE_GALLOP("HORSE_GALLOP"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HORSE_HURT("HORSE_HIT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HORSE_JUMP("HORSE_JUMP"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HORSE_LAND("HORSE_LAND"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HORSE_SADDLE("HORSE_SADDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HORSE_STEP("HORSE_SOFT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HORSE_STEP_WOOD("HORSE_WOOD"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HOSTILE_BIG_FALL("FALL_BIG"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HOSTILE_SMALL_FALL("FALL_SMALL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HOSTILE_SPLASH("SPLASH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_HOSTILE_SWIM("SWIM"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_IRONGOLEM_ATTACK("IRONGOLEM_THROW", name -> name.replace("IRONGOLEM", "IRON_GOLEM")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_IRONGOLEM_DEATH("IRONGOLEM_DEATH", name -> name.replace("IRONGOLEM", "IRON_GOLEM")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_IRONGOLEM_HURT("IRONGOLEM_HIT", name -> name.replace("IRONGOLEM", "IRON_GOLEM")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_IRONGOLEM_STEP("IRONGOLEM_WALK", name -> name.replace("IRONGOLEM", "IRON_GOLEM")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ITEM_BREAK("ITEM_BREAK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ITEM_PICKUP("ITEM_PICKUP"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_MAGMACUBE_JUMP("MAGMACUBE_JUMP", name -> name.replace("MAGMACUBE", "MAGMA_CUBE")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_MAGMACUBE_SQUISH("MAGMACUBE_WALK", name -> name.replace("MAGMACUBE", "MAGMA_CUBE")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_MINECART_INSIDE("MINECART_INSIDE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_MINECART_RIDING("MINECART_BASE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_PIG_AMBIENT("PIG_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_PIG_DEATH("PIG_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_PIG_STEP("PIG_WALK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_PLAYER_BIG_FALL("FALL_BIG"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_PLAYER_BURP("BURP"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_PLAYER_LEVELUP("LEVEL_UP"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_PLAYER_SMALL_FALL("FALL_SMALL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_PLAYER_SPLASH("SPLASH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_PLAYER_SWIM("SWIM"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SHEEP_AMBIENT("SHEEP_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SHEEP_SHEAR("SHEEP_SHEAR"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SHEEP_STEP("SHEEP_WALK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SILVERFISH_AMBIENT("SILVERFISH_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SILVERFISH_DEATH("SILVERFISH_KILL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SILVERFISH_HURT("SILVERFISH_HIT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SILVERFISH_STEP("SILVERFISH_WALK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SKELETON_AMBIENT("SKELETON_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SKELETON_DEATH("SKELETON_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SKELETON_HORSE_AMBIENT("HORSE_SKELETON_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SKELETON_HORSE_DEATH("HORSE_SKELETON_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SKELETON_HORSE_HURT("HORSE_SKELETON_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SKELETON_HURT("SKELETON_HURT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SLIME_SQUISH("SLIME_WALK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SMALL_MAGMACUBE_DEATH(name -> "ENTITY_SLIME_DEATH_SMALL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SMALL_MAGMACUBE_HURT(name -> "ENTITY_SLIME_HURT_SMALL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SMALL_MAGMACUBE_SQUISH(name -> "ENTITY_SLIME_SQUISH_SMALL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SMALL_SLIME_DEATH(name -> "ENTITY_SLIME_DEATH_SMALL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SMALL_SLIME_HURT(name -> "ENTITY_SLIME_HURT_SMALL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SMALL_SLIME_JUMP(name -> "ENTITY_SLIME_JUMP_SMALL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SMALL_SLIME_SQUISH("SLIME_WALK", name -> "ENTITY_SLIME_SQUISH_SMALL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SNOWMAN_AMBIENT(name -> name.replace("SNOWMAN", "SNOW_GOLEM")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SNOWMAN_DEATH(name -> name.replace("SNOWMAN", "SNOW_GOLEM")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SNOWMAN_HURT(name -> name.replace("SNOWMAN", "SNOW_GOLEM")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SNOWMAN_SHOOT(name -> name.replace("SNOWMAN", "SNOW_GOLEM")),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SPIDER_DEATH("SPIDER_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_SPIDER_STEP("SPIDER_WALK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_VILLAGER_AMBIENT("VILLAGER_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_VILLAGER_DEATH("VILLAGER_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_VILLAGER_HURT("VILLAGER_HIT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_VILLAGER_NO("VILLAGER_NO"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_VILLAGER_TRADING("VILLAGER_HAGGLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_VILLAGER_YES("VILLAGER_YES"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_WITHER_DEATH("WITHER_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_WITHER_HURT("WITHER_HURT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_WITHER_SHOOT("WITHER_SHOOT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_WITHER_SPAWN("WITHER_SPAWN"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_WOLF_DEATH("WOLF_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_WOLF_GROWL("WOLF_GROWL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_WOLF_HOWL("WOLF_HOWL"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_WOLF_HURT("WOLF_HURT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_WOLF_PANT("WOLF_PANT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_WOLF_SHAKE("WOLF_SHAKE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_WOLF_STEP("WOLF_WALK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_WOLF_WHINE("WOLF_WHINE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_AMBIENT("ZOMBIE_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_ATTACK_IRON_DOOR("ZOMBIE_WOOD"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_BREAK_DOOR_WOOD("ZOMBIE_WOODBREAK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_DEATH("ZOMBIE_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_HORSE_AMBIENT("HORSE_ZOMBIE_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_HORSE_DEATH("HORSE_ZOMBIE_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_HORSE_HURT("HORSE_ZOMBIE_HIT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_HURT("ZOMBIE_HURT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_INFECT("ZOMBIE_INFECT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_PIG_AMBIENT("ZOMBIE_PIG_IDLE"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_PIG_ANGRY("ZOMBIE_PIG_ANGRY"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_PIG_DEATH("ZOMBIE_PIG_DEATH"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_PIG_HURT("ZOMBIE_PIG_HURT"),
    @EnumVersion(version = ServerVersion.v1_8_R3) ENTITY_ZOMBIE_STEP("ZOMBIE_WALK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) UI_BUTTON_CLICK("CLICK"),
    @EnumVersion(version = ServerVersion.v1_8_R3) WEATHER_RAIN("AMBIENCE_RAIN"),
    @EnumVersion(version = ServerVersion.v1_8_R3) WEATHER_RAIN_ABOVE("AMBIENCE_THUNDER");

    private String soundname = name();
    private String v1_8_SoundName = "";

    interface Return<T> {
        T fetch(T name);
    }

    SoundMaker() {}
    SoundMaker(String V1_8_Name) {
        this.v1_8_SoundName = V1_8_Name;
        soundname = name();
    }

    SoundMaker(String V1_8_Name, Return<String> value) {
        this(V1_8_Name);
        this.soundname = value.fetch(name());
    }

    SoundMaker(Return<String> value) {
        this("");
        this.soundname = value.fetch(soundname);
    }

    public static SoundMaker fromString(String soundName) {
        for (SoundMaker maker : SoundMaker.values()) {
            if (maker.v1_8_SoundName.equals(soundName)) {
                return maker;
            } else if (maker.soundname.equalsIgnoreCase(soundName)) {
                return maker;
            } else if (maker.name().equalsIgnoreCase(soundName)) {
                return maker;
            }
        }
        return SoundMaker.UI_BUTTON_CLICK;
    }

    public String getSound() {
        if (EnumUtils.isValidEnum(Sound.class, name())) return name();
        if (EnumUtils.isValidEnum(Sound.class, soundname)) return soundname;
        if (EnumUtils.isValidEnum(Sound.class, v1_8_SoundName)) return v1_8_SoundName;
        return null;
    }

    @Deprecated
    public String getOldSound() {
        return this.v1_8_SoundName;
    }

    public void playSound(Location loc) {
        playSound(loc, 1.0F, 1.0F);
    }

    public void playSound(Location loc, float v, float v1) {
        playSound(loc.getWorld(), loc, v, v1);
    }

    private void playSound(World world, Location location, float v, float v1) {
        if (!isSupported()) return;
        String name = getSound();
        if (name == null) return;
        try {
            Sound sound = Sound.valueOf(name);
            world.playSound(location, sound, v, v1);
        } catch (Exception ignored) {}
    }

    public void playSound(Player player) {
        playSound(player.getLocation());
    }

    public void playSound(Player player, Location loc) {
        playSound(player.getWorld(), loc, 1.0F, 1.0F);
    }

    public void playSound(Entity entity) {
        playSound(entity.getLocation());
    }

    public void playSound(Entity entity, Location loc) {
        playSound(entity.getWorld(), loc, 1.0F, 1.0F);
    }

    public boolean isSupported () {
        try {
            Annotation[] annotations = getClass().getField(name()).getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof EnumVersion) {
                    EnumVersion support = (EnumVersion) annotation;
                    if (support.maxVersion() != ServerVersion.UNKNOWN)
                        return (ServerVersion.isEqualOld(support.maxVersion()) && (ServerVersion.isEqualNew(support.version())));
                    return ServerVersion.isEqualNew(support.version());
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return true;
    }
}
