// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public final class EnumOptions extends Enum
{

    public static final EnumOptions MUSIC;
    public static final EnumOptions SOUND;
    public static final EnumOptions INVERT_MOUSE;
    public static final EnumOptions SENSITIVITY;
    public static final EnumOptions FOV;
    public static final EnumOptions GAMMA;
    public static final EnumOptions RENDER_DISTANCE;
    public static final EnumOptions VIEW_BOBBING;
    public static final EnumOptions ANAGLYPH;
    public static final EnumOptions ADVANCED_OPENGL;
    public static final EnumOptions FRAMERATE_LIMIT;
    public static final EnumOptions DIFFICULTY;
    public static final EnumOptions GRAPHICS;
    public static final EnumOptions AMBIENT_OCCLUSION;
    public static final EnumOptions GUI_SCALE;
    public static final EnumOptions RENDER_CLOUDS;
    public static final EnumOptions PARTICLES;
    public static final EnumOptions FOG_FANCY;
    public static final EnumOptions FOG_START;
    public static final EnumOptions MIPMAP_LEVEL;
    public static final EnumOptions MIPMAP_TYPE;
    public static final EnumOptions LOAD_FAR;
    public static final EnumOptions PRELOADED_CHUNKS;
    public static final EnumOptions SMOOTH_FPS;
    public static final EnumOptions CLOUDS;
    public static final EnumOptions CLOUD_HEIGHT;
    public static final EnumOptions TREES;
    public static final EnumOptions GRASS;
    public static final EnumOptions RAIN;
    public static final EnumOptions WATER;
    public static final EnumOptions ANIMATED_WATER;
    public static final EnumOptions ANIMATED_LAVA;
    public static final EnumOptions ANIMATED_FIRE;
    public static final EnumOptions ANIMATED_PORTAL;
    public static final EnumOptions AO_LEVEL;
    public static final EnumOptions FAST_DEBUG_INFO;
    public static final EnumOptions AUTOSAVE_TICKS;
    public static final EnumOptions BETTER_GRASS;
    public static final EnumOptions ANIMATED_REDSTONE;
    public static final EnumOptions ANIMATED_EXPLOSION;
    public static final EnumOptions ANIMATED_FLAME;
    public static final EnumOptions ANIMATED_SMOKE;
    public static final EnumOptions WEATHER;
    public static final EnumOptions SKY;
    public static final EnumOptions STARS;
    public static final EnumOptions SUN_MOON;
    public static final EnumOptions CHUNK_UPDATES;
    public static final EnumOptions CHUNK_UPDATES_DYNAMIC;
    public static final EnumOptions TIME;
    public static final EnumOptions CLEAR_WATER;
    public static final EnumOptions SMOOTH_INPUT;
    public static final EnumOptions DEPTH_FOG;
    public static final EnumOptions VOID_PARTICLES;
    public static final EnumOptions WATER_PARTICLES;
    public static final EnumOptions RAIN_SPLASH;
    public static final EnumOptions PORTAL_PARTICLES;
    public static final EnumOptions PROFILER;
    public static final EnumOptions DRIPPING_WATER_LAVA;
    public static final EnumOptions BETTER_SNOW;
    public static final EnumOptions FULLSCREEN_MODE;
    public static final EnumOptions ANIMATED_TERRAIN;
    public static final EnumOptions ANIMATED_ITEMS;
    public static final EnumOptions SWAMP_COLORS;
    public static final EnumOptions RANDOM_MOBS;
    public static final EnumOptions SMOOTH_BIOMES;
    public static final EnumOptions CUSTOM_FONTS;
    public static final EnumOptions CUSTOM_COLORS;
    public static final EnumOptions SHOW_CAPES;
    public static final EnumOptions CONNECTED_TEXTURES;
    public static final EnumOptions AA_LEVEL;
    public static final EnumOptions AF_LEVEL;
    public static final EnumOptions RENDER_DISTANCE_FINE;
    private final boolean field_20144_k;
    private final boolean field_20143_l;
    private final String field_20142_m;
    private static final EnumOptions $VALUES[]; /* synthetic field */

    public static EnumOptions[] values()
    {
        return (EnumOptions[])$VALUES.clone();
    }

    public static EnumOptions valueOf(String p_valueOf_0_)
    {
        return (EnumOptions)Enum.valueOf(net.minecraft.src.EnumOptions.class, p_valueOf_0_);
    }

    public static EnumOptions func_20137_a(int p_20137_0_)
    {
        EnumOptions aenumoptions[] = values();
        int i = aenumoptions.length;
        for(int j = 0; j < i; j++)
        {
            EnumOptions enumoptions = aenumoptions[j];
            if(enumoptions.func_20135_c() == p_20137_0_)
            {
                return enumoptions;
            }
        }

        return null;
    }

    private EnumOptions(String p_i722_1_, int p_i722_2_, String p_i722_3_, boolean p_i722_4_, boolean p_i722_5_)
    {
        super(p_i722_1_, p_i722_2_);
        field_20142_m = p_i722_3_;
        field_20144_k = p_i722_4_;
        field_20143_l = p_i722_5_;
    }

    public boolean func_20136_a()
    {
        return field_20144_k;
    }

    public boolean func_20140_b()
    {
        return field_20143_l;
    }

    public int func_20135_c()
    {
        return ordinal();
    }

    public String func_20138_d()
    {
        return field_20142_m;
    }

    static 
    {
        MUSIC = new EnumOptions("MUSIC", 0, "options.music", true, false);
        SOUND = new EnumOptions("SOUND", 1, "options.sound", true, false);
        INVERT_MOUSE = new EnumOptions("INVERT_MOUSE", 2, "options.invertMouse", false, true);
        SENSITIVITY = new EnumOptions("SENSITIVITY", 3, "options.sensitivity", true, false);
        FOV = new EnumOptions("FOV", 4, "options.fov", true, false);
        GAMMA = new EnumOptions("GAMMA", 5, "options.gamma", true, false);
        RENDER_DISTANCE = new EnumOptions("RENDER_DISTANCE", 6, "options.renderDistance", false, false);
        VIEW_BOBBING = new EnumOptions("VIEW_BOBBING", 7, "options.viewBobbing", false, true);
        ANAGLYPH = new EnumOptions("ANAGLYPH", 8, "options.anaglyph", false, true);
        ADVANCED_OPENGL = new EnumOptions("ADVANCED_OPENGL", 9, "options.advancedOpengl", false, true);
        FRAMERATE_LIMIT = new EnumOptions("FRAMERATE_LIMIT", 10, "options.framerateLimit", false, false);
        DIFFICULTY = new EnumOptions("DIFFICULTY", 11, "options.difficulty", false, false);
        GRAPHICS = new EnumOptions("GRAPHICS", 12, "options.graphics", false, false);
        AMBIENT_OCCLUSION = new EnumOptions("AMBIENT_OCCLUSION", 13, "options.ao", false, true);
        GUI_SCALE = new EnumOptions("GUI_SCALE", 14, "options.guiScale", false, false);
        RENDER_CLOUDS = new EnumOptions("RENDER_CLOUDS", 15, "options.renderClouds", false, true);
        PARTICLES = new EnumOptions("PARTICLES", 16, "options.particles", false, false);
        FOG_FANCY = new EnumOptions("FOG_FANCY", 17, "Fog", false, false);
        FOG_START = new EnumOptions("FOG_START", 18, "Fog Start", false, false);
        MIPMAP_LEVEL = new EnumOptions("MIPMAP_LEVEL", 19, "Mipmap Level", false, false);
        MIPMAP_TYPE = new EnumOptions("MIPMAP_TYPE", 20, "Mipmap Type", false, false);
        LOAD_FAR = new EnumOptions("LOAD_FAR", 21, "Load Far", false, false);
        PRELOADED_CHUNKS = new EnumOptions("PRELOADED_CHUNKS", 22, "Preloaded Chunks", false, false);
        SMOOTH_FPS = new EnumOptions("SMOOTH_FPS", 23, "Smooth FPS", false, false);
        CLOUDS = new EnumOptions("CLOUDS", 24, "Clouds", false, false);
        CLOUD_HEIGHT = new EnumOptions("CLOUD_HEIGHT", 25, "Cloud Height", true, false);
        TREES = new EnumOptions("TREES", 26, "Trees", false, false);
        GRASS = new EnumOptions("GRASS", 27, "Grass", false, false);
        RAIN = new EnumOptions("RAIN", 28, "Rain & Snow", false, false);
        WATER = new EnumOptions("WATER", 29, "Water", false, false);
        ANIMATED_WATER = new EnumOptions("ANIMATED_WATER", 30, "Water Animated", false, false);
        ANIMATED_LAVA = new EnumOptions("ANIMATED_LAVA", 31, "Lava Animated", false, false);
        ANIMATED_FIRE = new EnumOptions("ANIMATED_FIRE", 32, "Fire Animated", false, false);
        ANIMATED_PORTAL = new EnumOptions("ANIMATED_PORTAL", 33, "Portal Animated", false, false);
        AO_LEVEL = new EnumOptions("AO_LEVEL", 34, "Smooth Lighting", true, false);
        FAST_DEBUG_INFO = new EnumOptions("FAST_DEBUG_INFO", 35, "Fast Debug Info", false, false);
        AUTOSAVE_TICKS = new EnumOptions("AUTOSAVE_TICKS", 36, "Autosave", false, false);
        BETTER_GRASS = new EnumOptions("BETTER_GRASS", 37, "Better Grass", false, false);
        ANIMATED_REDSTONE = new EnumOptions("ANIMATED_REDSTONE", 38, "Redstone Animated", false, false);
        ANIMATED_EXPLOSION = new EnumOptions("ANIMATED_EXPLOSION", 39, "Explosion Animated", false, false);
        ANIMATED_FLAME = new EnumOptions("ANIMATED_FLAME", 40, "Flame Animated", false, false);
        ANIMATED_SMOKE = new EnumOptions("ANIMATED_SMOKE", 41, "Smoke Animated", false, false);
        WEATHER = new EnumOptions("WEATHER", 42, "Weather", false, false);
        SKY = new EnumOptions("SKY", 43, "Sky", false, false);
        STARS = new EnumOptions("STARS", 44, "Stars", false, false);
        SUN_MOON = new EnumOptions("SUN_MOON", 45, "Sun & Moon", false, false);
        CHUNK_UPDATES = new EnumOptions("CHUNK_UPDATES", 46, "Chunk Updates", false, false);
        CHUNK_UPDATES_DYNAMIC = new EnumOptions("CHUNK_UPDATES_DYNAMIC", 47, "Dynamic Updates", false, false);
        TIME = new EnumOptions("TIME", 48, "Time", false, false);
        CLEAR_WATER = new EnumOptions("CLEAR_WATER", 49, "Clear Water", false, false);
        SMOOTH_INPUT = new EnumOptions("SMOOTH_INPUT", 50, "Smooth Input", false, false);
        DEPTH_FOG = new EnumOptions("DEPTH_FOG", 51, "Depth Fog", false, false);
        VOID_PARTICLES = new EnumOptions("VOID_PARTICLES", 52, "Void Particles", false, false);
        WATER_PARTICLES = new EnumOptions("WATER_PARTICLES", 53, "Water Particles", false, false);
        RAIN_SPLASH = new EnumOptions("RAIN_SPLASH", 54, "Rain Splash", false, false);
        PORTAL_PARTICLES = new EnumOptions("PORTAL_PARTICLES", 55, "Portal Particles", false, false);
        PROFILER = new EnumOptions("PROFILER", 56, "Debug Profiler", false, false);
        DRIPPING_WATER_LAVA = new EnumOptions("DRIPPING_WATER_LAVA", 57, "Dripping Water/Lava", false, false);
        BETTER_SNOW = new EnumOptions("BETTER_SNOW", 58, "Better Snow", false, false);
        FULLSCREEN_MODE = new EnumOptions("FULLSCREEN_MODE", 59, "Fullscreen", false, false);
        ANIMATED_TERRAIN = new EnumOptions("ANIMATED_TERRAIN", 60, "Terrain Animated", false, false);
        ANIMATED_ITEMS = new EnumOptions("ANIMATED_ITEMS", 61, "Items Animated", false, false);
        SWAMP_COLORS = new EnumOptions("SWAMP_COLORS", 62, "Swamp Colors", false, false);
        RANDOM_MOBS = new EnumOptions("RANDOM_MOBS", 63, "Random Mobs", false, false);
        SMOOTH_BIOMES = new EnumOptions("SMOOTH_BIOMES", 64, "Smooth Biomes", false, false);
        CUSTOM_FONTS = new EnumOptions("CUSTOM_FONTS", 65, "Custom Fonts", false, false);
        CUSTOM_COLORS = new EnumOptions("CUSTOM_COLORS", 66, "Custom Colors", false, false);
        SHOW_CAPES = new EnumOptions("SHOW_CAPES", 67, "Show Capes", false, false);
        CONNECTED_TEXTURES = new EnumOptions("CONNECTED_TEXTURES", 68, "Connected Textures", false, false);
        AA_LEVEL = new EnumOptions("AA_LEVEL", 69, "Antialiasing", false, false);
        AF_LEVEL = new EnumOptions("AF_LEVEL", 70, "Anisotropic Filtering", false, false);
        RENDER_DISTANCE_FINE = new EnumOptions("RENDER_DISTANCE_FINE", 71, "Render Distance", true, false);
        $VALUES = (new EnumOptions[] {
            MUSIC, SOUND, INVERT_MOUSE, SENSITIVITY, FOV, GAMMA, RENDER_DISTANCE, VIEW_BOBBING, ANAGLYPH, ADVANCED_OPENGL, 
            FRAMERATE_LIMIT, DIFFICULTY, GRAPHICS, AMBIENT_OCCLUSION, GUI_SCALE, RENDER_CLOUDS, PARTICLES, FOG_FANCY, FOG_START, MIPMAP_LEVEL, 
            MIPMAP_TYPE, LOAD_FAR, PRELOADED_CHUNKS, SMOOTH_FPS, CLOUDS, CLOUD_HEIGHT, TREES, GRASS, RAIN, WATER, 
            ANIMATED_WATER, ANIMATED_LAVA, ANIMATED_FIRE, ANIMATED_PORTAL, AO_LEVEL, FAST_DEBUG_INFO, AUTOSAVE_TICKS, BETTER_GRASS, ANIMATED_REDSTONE, ANIMATED_EXPLOSION, 
            ANIMATED_FLAME, ANIMATED_SMOKE, WEATHER, SKY, STARS, SUN_MOON, CHUNK_UPDATES, CHUNK_UPDATES_DYNAMIC, TIME, CLEAR_WATER, 
            SMOOTH_INPUT, DEPTH_FOG, VOID_PARTICLES, WATER_PARTICLES, RAIN_SPLASH, PORTAL_PARTICLES, PROFILER, DRIPPING_WATER_LAVA, BETTER_SNOW, FULLSCREEN_MODE, 
            ANIMATED_TERRAIN, ANIMATED_ITEMS, SWAMP_COLORS, RANDOM_MOBS, SMOOTH_BIOMES, CUSTOM_FONTS, CUSTOM_COLORS, SHOW_CAPES, CONNECTED_TEXTURES, AA_LEVEL, 
            AF_LEVEL, RENDER_DISTANCE_FINE
        });
    }
}
