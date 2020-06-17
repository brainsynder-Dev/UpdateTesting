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
    // ---- START ---- //
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
    @EnumVersion(version = ServerVersion.v1_8_R3) WEATHER_RAIN_ABOVE("AMBIENCE_THUNDER"),


    // ---- Sounds added in v1_9_R1 ---- //
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_CLOTH_FALL,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_CLOTH_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_CLOTH_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_CLOTH_STEP,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_COMPARATOR_CLICK,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_DISPENSER_DISPENSE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_DISPENSER_FAIL,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_DISPENSER_LAUNCH,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_ENDERCHEST_CLOSE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_ENDERCHEST_OPEN,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_END_GATEWAY_SPAWN,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_FENCE_GATE_CLOSE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_FENCE_GATE_OPEN,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_FIRE_EXTINGUISH,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_FURNACE_FIRE_CRACKLE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_GRASS_FALL,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_GRASS_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_GRASS_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_GRAVEL_FALL,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_GRAVEL_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_GRAVEL_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_LADDER_BREAK,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_LADDER_FALL,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_LADDER_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_LADDER_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_METAL_BREAK,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_METAL_FALL,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_METAL_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_METAL_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_METAL_STEP,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_REDSTONE_TORCH_BURNOUT,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_SAND_FALL,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_SAND_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_SAND_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_SLIME_BREAK,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_SLIME_FALL,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_SLIME_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_SLIME_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_SLIME_STEP,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_SNOW_FALL,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_SNOW_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_SNOW_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_STONE_FALL,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_STONE_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_STONE_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_TRIPWIRE_ATTACH,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_TRIPWIRE_CLICK_OFF,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_TRIPWIRE_CLICK_ON,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_TRIPWIRE_DETACH,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_WATERLILY_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_WOOD_FALL,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_WOOD_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) BLOCK_WOOD_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENCHANT_THORNS_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ARMORSTAND_BREAK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ARMORSTAND_FALL,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ARMORSTAND_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ARMORSTAND_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_BLAZE_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_BLAZE_BURN,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_BLAZE_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_BLAZE_SHOOT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_BOBBER_SPLASH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_BOBBER_THROW,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_CAT_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_CHICKEN_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_COW_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_COW_MILK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_CREEPER_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_CREEPER_PRIMED,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_DONKEY_CHEST,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_EGG_THROW,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ELDER_GUARDIAN_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ELDER_GUARDIAN_AMBIENT_LAND,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ELDER_GUARDIAN_CURSE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ELDER_GUARDIAN_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ELDER_GUARDIAN_DEATH_LAND,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ELDER_GUARDIAN_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ELDER_GUARDIAN_HURT_LAND,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ENDERDRAGON_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ENDERDRAGON_FIREBALL_EXPLODE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ENDERDRAGON_SHOOT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ENDEREYE_LAUNCH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ENDERPEARL_THROW,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_EXPERIENCE_BOTTLE_THROW,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_EXPERIENCE_ORB_TOUCH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GENERIC_BURN,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GENERIC_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GENERIC_EXTINGUISH_FIRE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GENERIC_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GHAST_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GHAST_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GUARDIAN_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GUARDIAN_AMBIENT_LAND,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GUARDIAN_ATTACK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GUARDIAN_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GUARDIAN_DEATH_LAND,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GUARDIAN_FLOP,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GUARDIAN_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_GUARDIAN_HURT_LAND,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_HORSE_EAT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_HOSTILE_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_HOSTILE_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ITEMFRAME_ADD_ITEM,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ITEMFRAME_BREAK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ITEMFRAME_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ITEMFRAME_REMOVE_ITEM,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ITEMFRAME_ROTATE_ITEM,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_LEASHKNOT_BREAK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_LEASHKNOT_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_LIGHTNING_IMPACT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_LIGHTNING_THUNDER,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_LINGERINGPOTION_THROW,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_MAGMACUBE_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_MAGMACUBE_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_MOOSHROOM_SHEAR,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_MULE_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_MULE_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_MULE_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PAINTING_BREAK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PAINTING_PLACE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PIG_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PIG_SADDLE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PLAYER_ATTACK_CRIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PLAYER_ATTACK_KNOCKBACK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PLAYER_ATTACK_NODAMAGE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PLAYER_ATTACK_STRONG,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PLAYER_ATTACK_SWEEP,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PLAYER_ATTACK_WEAK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PLAYER_BREATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PLAYER_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_PLAYER_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_RABBIT_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_RABBIT_ATTACK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_RABBIT_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_RABBIT_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_RABBIT_JUMP,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SHEEP_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SHEEP_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SHULKER_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SHULKER_BULLET_HIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SHULKER_BULLET_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SHULKER_CLOSE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SHULKER_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SHULKER_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SHULKER_HURT_CLOSED,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SHULKER_OPEN,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SHULKER_SHOOT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SHULKER_TELEPORT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SKELETON_SHOOT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SKELETON_STEP,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SLIME_ATTACK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SLIME_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SLIME_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SLIME_JUMP,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SNOWBALL_THROW,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SPIDER_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SPIDER_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SPLASH_POTION_BREAK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SPLASH_POTION_THROW,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SQUID_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SQUID_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_SQUID_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_TNT_PRIMED,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_WITCH_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_WITCH_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_WITCH_DRINK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_WITCH_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_WITCH_THROW,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_WITHER_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_WITHER_BREAK_BLOCK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_WOLF_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ZOMBIE_ATTACK_DOOR_WOOD,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ZOMBIE_VILLAGER_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ZOMBIE_VILLAGER_CONVERTED,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ZOMBIE_VILLAGER_CURE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ZOMBIE_VILLAGER_DEATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ZOMBIE_VILLAGER_HURT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ENTITY_ZOMBIE_VILLAGER_STEP,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_ARMOR_EQUIP_CHAIN,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_ARMOR_EQUIP_DIAMOND,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_ARMOR_EQUIP_GENERIC,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_ARMOR_EQUIP_GOLD,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_ARMOR_EQUIP_IRON,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_ARMOR_EQUIP_LEATHER,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_BOTTLE_FILL,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_BOTTLE_FILL_DRAGONBREATH,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_BUCKET_EMPTY,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_BUCKET_EMPTY_LAVA,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_BUCKET_FILL,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_BUCKET_FILL_LAVA,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_CHORUS_FRUIT_TELEPORT,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_FIRECHARGE_USE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_FLINTANDSTEEL_USE,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_HOE_TILL,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_SHIELD_BLOCK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_SHIELD_BREAK,
    @EnumVersion(version = ServerVersion.v1_9_R1) ITEM_SHOVEL_FLATTEN,
    @EnumVersion(version = ServerVersion.v1_9_R1) MUSIC_CREATIVE,
    @EnumVersion(version = ServerVersion.v1_9_R1) MUSIC_CREDITS,
    @EnumVersion(version = ServerVersion.v1_9_R1) MUSIC_DRAGON,
    @EnumVersion(version = ServerVersion.v1_9_R1) MUSIC_END,
    @EnumVersion(version = ServerVersion.v1_9_R1) MUSIC_GAME,
    @EnumVersion(version = ServerVersion.v1_9_R1) MUSIC_MENU,
    @EnumVersion(version = ServerVersion.v1_9_R1) MUSIC_NETHER,
    @EnumVersion(version = ServerVersion.v1_9_R1) RECORD_11,
    @EnumVersion(version = ServerVersion.v1_9_R1) RECORD_13,
    @EnumVersion(version = ServerVersion.v1_9_R1) RECORD_BLOCKS,
    @EnumVersion(version = ServerVersion.v1_9_R1) RECORD_CAT,
    @EnumVersion(version = ServerVersion.v1_9_R1) RECORD_CHIRP,
    @EnumVersion(version = ServerVersion.v1_9_R1) RECORD_FAR,
    @EnumVersion(version = ServerVersion.v1_9_R1) RECORD_MALL,
    @EnumVersion(version = ServerVersion.v1_9_R1) RECORD_MELLOHI,
    @EnumVersion(version = ServerVersion.v1_9_R1) RECORD_STAL,
    @EnumVersion(version = ServerVersion.v1_9_R1) RECORD_STRAD,
    @EnumVersion(version = ServerVersion.v1_9_R1) RECORD_WAIT,
    @EnumVersion(version = ServerVersion.v1_9_R1) RECORD_WARD,


    // ---- Sounds added in v1_11_R1 ---- //
    @EnumVersion(version = ServerVersion.v1_11_R1) BLOCK_ENCHANTMENT_TABLE_USE,
    @EnumVersion(version = ServerVersion.v1_11_R1) BLOCK_SHULKER_BOX_CLOSE,
    @EnumVersion(version = ServerVersion.v1_11_R1) BLOCK_SHULKER_BOX_OPEN,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_ELDER_GUARDIAN_FLOP,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_EVOCATION_FANGS_ATTACK,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_EVOCATION_ILLAGER_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_EVOCATION_ILLAGER_CAST_SPELL,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_EVOCATION_ILLAGER_DEATH,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_EVOCATION_ILLAGER_HURT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_EVOCATION_ILLAGER_PREPARE_ATTACK,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_EVOCATION_ILLAGER_PREPARE_SUMMON,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_EVOCATION_ILLAGER_PREPARE_WOLOLO,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_HUSK_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_HUSK_DEATH,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_HUSK_HURT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_HUSK_STEP,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_LLAMA_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_LLAMA_ANGRY,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_LLAMA_CHEST,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_LLAMA_DEATH,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_LLAMA_EAT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_LLAMA_HURT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_LLAMA_SPIT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_LLAMA_STEP,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_LLAMA_SWAG,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_MULE_CHEST,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_POLAR_BEAR_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_POLAR_BEAR_BABY_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_POLAR_BEAR_DEATH,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_POLAR_BEAR_HURT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_POLAR_BEAR_STEP,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_POLAR_BEAR_WARNING,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_STRAY_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_STRAY_DEATH,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_STRAY_HURT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_STRAY_STEP,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_VEX_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_VEX_CHARGE,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_VEX_DEATH,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_VEX_HURT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_VINDICATION_ILLAGER_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_VINDICATION_ILLAGER_DEATH,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_VINDICATION_ILLAGER_HURT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_WITHER_SKELETON_AMBIENT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_WITHER_SKELETON_DEATH,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_WITHER_SKELETON_HURT,
    @EnumVersion(version = ServerVersion.v1_11_R1) ENTITY_WITHER_SKELETON_STEP,
    @EnumVersion(version = ServerVersion.v1_11_R1) ITEM_ARMOR_EQUIP_ELYTRA,
    @EnumVersion(version = ServerVersion.v1_11_R1) ITEM_BOTTLE_EMPTY,
    @EnumVersion(version = ServerVersion.v1_11_R1) ITEM_ELYTRA_FLYING,
    @EnumVersion(version = ServerVersion.v1_11_R1) ITEM_TOTEM_USE
    ; // ---- END ---- //

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
