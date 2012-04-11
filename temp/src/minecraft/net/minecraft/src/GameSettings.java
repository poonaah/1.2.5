// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

// Referenced classes of package net.minecraft.src:
//            KeyBinding, Config, StringTranslate, StatCollector, 
//            EnumOptions, SoundManager, RenderGlobal, Block, 
//            World, IChunkProvider, EmptyChunk, Chunk, 
//            ExtendedBlockStorage, NibbleArray, RenderEngine, RenderBlocks, 
//            EnumOptionsMappingHelper

public class GameSettings
{

    private static final String field_20105_z[] = {
        "options.renderDistance.far", "options.renderDistance.normal", "options.renderDistance.short", "options.renderDistance.tiny"
    };
    private static final String field_20106_A[] = {
        "options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard"
    };
    private static final String field_25147_K[] = {
        "options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"
    };
    private static final String field_41086_T[] = {
        "options.particles.all", "options.particles.decreased", "options.particles.minimal"
    };
    private static final String field_30006_M[] = {
        "performance.max", "performance.balanced", "performance.powersaver"
    };
    public float field_1584_a;
    public float field_1583_b;
    public float field_1582_c;
    public boolean field_1581_d;
    public int field_1580_e;
    public boolean field_1579_f;
    public boolean field_1578_g;
    public boolean field_27342_h;
    public int field_1577_h;
    public boolean field_1576_i;
    public boolean field_22278_j;
    public boolean field_40445_l;
    public int ofRenderDistanceFine;
    public int ofFogType;
    public float ofFogStart;
    public int ofMipmapLevel;
    public boolean ofMipmapLinear;
    public boolean ofLoadFar;
    public int ofPreloadedChunks;
    public boolean ofOcclusionFancy;
    public boolean ofSmoothFps;
    public boolean ofSmoothInput;
    public float ofAoLevel;
    public int ofAaLevel;
    public int ofAfLevel;
    public int ofClouds;
    public float ofCloudsHeight;
    public int ofTrees;
    public int ofGrass;
    public int ofRain;
    public int ofWater;
    public int ofBetterGrass;
    public int ofAutoSaveTicks;
    public boolean ofFastDebugInfo;
    public boolean ofWeather;
    public boolean ofSky;
    public boolean ofStars;
    public boolean ofSunMoon;
    public int ofChunkUpdates;
    public boolean ofChunkUpdatesDynamic;
    public int ofTime;
    public boolean ofClearWater;
    public boolean ofDepthFog;
    public boolean ofProfiler;
    public boolean ofBetterSnow;
    public String ofFullscreenMode;
    public boolean ofSwampColors;
    public boolean ofRandomMobs;
    public boolean ofSmoothBiomes;
    public boolean ofCustomFonts;
    public boolean ofCustomColors;
    public boolean ofShowCapes;
    public int ofConnectedTextures;
    public int ofAnimatedWater;
    public int ofAnimatedLava;
    public boolean ofAnimatedFire;
    public boolean ofAnimatedPortal;
    public boolean ofAnimatedRedstone;
    public boolean ofAnimatedExplosion;
    public boolean ofAnimatedFlame;
    public boolean ofAnimatedSmoke;
    public boolean ofVoidParticles;
    public boolean ofWaterParticles;
    public boolean ofRainSplash;
    public boolean ofPortalParticles;
    public boolean ofDrippingWaterLava;
    public boolean ofAnimatedTerrain;
    public boolean ofAnimatedItems;
    public static final int DEFAULT = 0;
    public static final int FAST = 1;
    public static final int FANCY = 2;
    public static final int OFF = 3;
    public static final int ANIM_ON = 0;
    public static final int ANIM_GENERATED = 1;
    public static final int ANIM_OFF = 2;
    public static final String DEFAULT_STR = "Default";
    public KeyBinding ofKeyBindZoom;
    public String field_6524_j;
    public KeyBinding field_1575_j;
    public KeyBinding field_1574_k;
    public KeyBinding field_1573_l;
    public KeyBinding field_1572_m;
    public KeyBinding field_1571_n;
    public KeyBinding field_1570_o;
    public KeyBinding field_6523_q;
    public KeyBinding field_6521_r;
    public KeyBinding field_1565_s;
    public KeyBinding field_35382_v;
    public KeyBinding field_35381_w;
    public KeyBinding field_35384_x;
    public KeyBinding field_35383_y;
    public KeyBinding field_1564_t[];
    protected Minecraft field_1563_u;
    private File field_6522_B;
    public int field_1561_w;
    public boolean field_22277_y;
    public int field_1560_x;
    public boolean field_22276_A;
    public boolean field_50119_G;
    public String field_12259_z;
    public boolean field_22275_C;
    public boolean field_22274_D;
    public boolean field_22273_E;
    public float field_22272_F;
    public float field_22271_G;
    public float field_35379_L;
    public float field_35380_M;
    public int field_25148_H;
    public int field_41087_P;
    public String field_44018_Q;
    private File optionsFileOF;

    public GameSettings(Minecraft p_i365_1_, File p_i365_2_)
    {
        ofRenderDistanceFine = 0;
        ofFogType = 1;
        ofFogStart = 0.8F;
        ofMipmapLevel = 0;
        ofMipmapLinear = false;
        ofLoadFar = false;
        ofPreloadedChunks = 0;
        ofOcclusionFancy = false;
        ofSmoothFps = false;
        ofSmoothInput = true;
        ofAoLevel = 0.0F;
        ofAaLevel = 0;
        ofAfLevel = 1;
        ofClouds = 0;
        ofCloudsHeight = 0.0F;
        ofTrees = 0;
        ofGrass = 0;
        ofRain = 0;
        ofWater = 0;
        ofBetterGrass = 3;
        ofAutoSaveTicks = 4000;
        ofFastDebugInfo = false;
        ofWeather = true;
        ofSky = true;
        ofStars = true;
        ofSunMoon = true;
        ofChunkUpdates = 1;
        ofChunkUpdatesDynamic = false;
        ofTime = 0;
        ofClearWater = false;
        ofDepthFog = true;
        ofProfiler = false;
        ofBetterSnow = false;
        ofFullscreenMode = "Default";
        ofSwampColors = true;
        ofRandomMobs = true;
        ofSmoothBiomes = true;
        ofCustomFonts = true;
        ofCustomColors = true;
        ofShowCapes = true;
        ofConnectedTextures = 3;
        ofAnimatedWater = 0;
        ofAnimatedLava = 0;
        ofAnimatedFire = true;
        ofAnimatedPortal = true;
        ofAnimatedRedstone = true;
        ofAnimatedExplosion = true;
        ofAnimatedFlame = true;
        ofAnimatedSmoke = true;
        ofVoidParticles = true;
        ofWaterParticles = true;
        ofRainSplash = true;
        ofPortalParticles = true;
        ofDrippingWaterLava = true;
        ofAnimatedTerrain = true;
        ofAnimatedItems = true;
        field_1584_a = 1.0F;
        field_1583_b = 1.0F;
        field_1582_c = 0.5F;
        field_1581_d = false;
        field_1580_e = 0;
        field_1579_f = true;
        field_1578_g = false;
        field_27342_h = false;
        field_1577_h = 1;
        field_1576_i = true;
        field_22278_j = true;
        field_40445_l = true;
        field_6524_j = "Default";
        field_1575_j = new KeyBinding("key.forward", 17);
        field_1574_k = new KeyBinding("key.left", 30);
        field_1573_l = new KeyBinding("key.back", 31);
        field_1572_m = new KeyBinding("key.right", 32);
        field_1571_n = new KeyBinding("key.jump", 57);
        field_1570_o = new KeyBinding("key.inventory", 18);
        field_6523_q = new KeyBinding("key.drop", 16);
        field_6521_r = new KeyBinding("key.chat", 20);
        field_1565_s = new KeyBinding("key.sneak", 42);
        field_35382_v = new KeyBinding("key.attack", -100);
        field_35381_w = new KeyBinding("key.use", -99);
        field_35384_x = new KeyBinding("key.playerlist", 15);
        field_35383_y = new KeyBinding("key.pickItem", -98);
        ofKeyBindZoom = new KeyBinding("Zoom", 29);
        field_1564_t = (new KeyBinding[] {
            field_35382_v, field_35381_w, field_1575_j, field_1574_k, field_1573_l, field_1572_m, field_1571_n, field_1565_s, field_6523_q, field_1570_o, 
            field_6521_r, field_35384_x, field_35383_y, ofKeyBindZoom
        });
        field_1561_w = 2;
        field_22277_y = false;
        field_1560_x = 0;
        field_22276_A = false;
        field_50119_G = false;
        field_12259_z = "";
        field_22275_C = false;
        field_22274_D = false;
        field_22273_E = false;
        field_22272_F = 1.0F;
        field_22271_G = 1.0F;
        field_35379_L = 0.0F;
        field_35380_M = 0.0F;
        field_25148_H = 0;
        field_41087_P = 0;
        field_44018_Q = "en_US";
        field_1563_u = p_i365_1_;
        field_6522_B = new File(p_i365_2_, "options.txt");
        optionsFileOF = new File(p_i365_2_, "optionsof.txt");
        func_6519_a();
        Config.setGameSettings(this);
    }

    public GameSettings()
    {
        ofRenderDistanceFine = 0;
        ofFogType = 1;
        ofFogStart = 0.8F;
        ofMipmapLevel = 0;
        ofMipmapLinear = false;
        ofLoadFar = false;
        ofPreloadedChunks = 0;
        ofOcclusionFancy = false;
        ofSmoothFps = false;
        ofSmoothInput = true;
        ofAoLevel = 0.0F;
        ofAaLevel = 0;
        ofAfLevel = 1;
        ofClouds = 0;
        ofCloudsHeight = 0.0F;
        ofTrees = 0;
        ofGrass = 0;
        ofRain = 0;
        ofWater = 0;
        ofBetterGrass = 3;
        ofAutoSaveTicks = 4000;
        ofFastDebugInfo = false;
        ofWeather = true;
        ofSky = true;
        ofStars = true;
        ofSunMoon = true;
        ofChunkUpdates = 1;
        ofChunkUpdatesDynamic = false;
        ofTime = 0;
        ofClearWater = false;
        ofDepthFog = true;
        ofProfiler = false;
        ofBetterSnow = false;
        ofFullscreenMode = "Default";
        ofSwampColors = true;
        ofRandomMobs = true;
        ofSmoothBiomes = true;
        ofCustomFonts = true;
        ofCustomColors = true;
        ofShowCapes = true;
        ofConnectedTextures = 3;
        ofAnimatedWater = 0;
        ofAnimatedLava = 0;
        ofAnimatedFire = true;
        ofAnimatedPortal = true;
        ofAnimatedRedstone = true;
        ofAnimatedExplosion = true;
        ofAnimatedFlame = true;
        ofAnimatedSmoke = true;
        ofVoidParticles = true;
        ofWaterParticles = true;
        ofRainSplash = true;
        ofPortalParticles = true;
        ofDrippingWaterLava = true;
        ofAnimatedTerrain = true;
        ofAnimatedItems = true;
        field_1584_a = 1.0F;
        field_1583_b = 1.0F;
        field_1582_c = 0.5F;
        field_1581_d = false;
        field_1580_e = 0;
        field_1579_f = true;
        field_1578_g = false;
        field_27342_h = false;
        field_1577_h = 1;
        field_1576_i = true;
        field_22278_j = true;
        field_40445_l = true;
        field_6524_j = "Default";
        field_1575_j = new KeyBinding("key.forward", 17);
        field_1574_k = new KeyBinding("key.left", 30);
        field_1573_l = new KeyBinding("key.back", 31);
        field_1572_m = new KeyBinding("key.right", 32);
        field_1571_n = new KeyBinding("key.jump", 57);
        field_1570_o = new KeyBinding("key.inventory", 18);
        field_6523_q = new KeyBinding("key.drop", 16);
        field_6521_r = new KeyBinding("key.chat", 20);
        field_1565_s = new KeyBinding("key.sneak", 42);
        field_35382_v = new KeyBinding("key.attack", -100);
        field_35381_w = new KeyBinding("key.use", -99);
        field_35384_x = new KeyBinding("key.playerlist", 15);
        field_35383_y = new KeyBinding("key.pickItem", -98);
        field_1564_t = (new KeyBinding[] {
            field_35382_v, field_35381_w, field_1575_j, field_1574_k, field_1573_l, field_1572_m, field_1571_n, field_1565_s, field_6523_q, field_1570_o, 
            field_6521_r, field_35384_x, field_35383_y
        });
        field_1561_w = 2;
        field_22277_y = false;
        field_1560_x = 0;
        field_22276_A = false;
        field_50119_G = false;
        field_12259_z = "";
        field_22275_C = false;
        field_22274_D = false;
        field_22273_E = false;
        field_22272_F = 1.0F;
        field_22271_G = 1.0F;
        field_35379_L = 0.0F;
        field_35380_M = 0.0F;
        field_25148_H = 0;
        field_41087_P = 0;
        field_44018_Q = "en_US";
        Config.setGameSettings(this);
    }

    public String func_20102_a(int p_20102_1_)
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        return stringtranslate.func_20163_a(field_1564_t[p_20102_1_].field_1371_a);
    }

    public String func_1047_d(int p_1047_1_)
    {
        int i = field_1564_t[p_1047_1_].field_1370_b;
        return func_41085_c(i);
    }

    public static String func_41085_c(int p_41085_0_)
    {
        if(p_41085_0_ < 0)
        {
            return StatCollector.func_25199_a("key.mouseButton", new Object[] {
                Integer.valueOf(p_41085_0_ + 101)
            });
        } else
        {
            return Keyboard.getKeyName(p_41085_0_);
        }
    }

    public void func_1042_a(int p_1042_1_, int p_1042_2_)
    {
        field_1564_t[p_1042_1_].field_1370_b = p_1042_2_;
        func_1041_b();
    }

    public void func_1048_a(EnumOptions p_1048_1_, float p_1048_2_)
    {
        if(p_1048_1_ == EnumOptions.MUSIC)
        {
            field_1584_a = p_1048_2_;
            field_1563_u.field_6301_A.func_335_a();
        }
        if(p_1048_1_ == EnumOptions.SOUND)
        {
            field_1583_b = p_1048_2_;
            field_1563_u.field_6301_A.func_335_a();
        }
        if(p_1048_1_ == EnumOptions.SENSITIVITY)
        {
            field_1582_c = p_1048_2_;
        }
        if(p_1048_1_ == EnumOptions.FOV)
        {
            field_35379_L = p_1048_2_;
        }
        if(p_1048_1_ == EnumOptions.GAMMA)
        {
            field_35380_M = p_1048_2_;
        }
        if(p_1048_1_ == EnumOptions.CLOUD_HEIGHT)
        {
            ofCloudsHeight = p_1048_2_;
        }
        if(p_1048_1_ == EnumOptions.AO_LEVEL)
        {
            ofAoLevel = p_1048_2_;
            field_22278_j = ofAoLevel > 0.0F;
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1048_1_ == EnumOptions.RENDER_DISTANCE_FINE)
        {
            ofRenderDistanceFine = 32 + (int)(p_1048_2_ * 480F);
            ofRenderDistanceFine = (ofRenderDistanceFine >> 4) << 4;
            ofRenderDistanceFine = Config.limit(ofRenderDistanceFine, 32, 512);
            field_1580_e = 3;
            if(ofRenderDistanceFine > 32)
            {
                field_1580_e = 2;
            }
            if(ofRenderDistanceFine > 64)
            {
                field_1580_e = 1;
            }
            if(ofRenderDistanceFine > 128)
            {
                field_1580_e = 0;
            }
            field_1563_u.field_6323_f.func_958_a();
        }
    }

    private void updateWaterOpacity()
    {
        byte byte0 = 3;
        if(ofClearWater)
        {
            byte0 = 1;
        }
        Block.field_399_C.func_256_d(byte0);
        Block.field_401_B.func_256_d(byte0);
        if(field_1563_u.field_6324_e == null)
        {
            return;
        }
        IChunkProvider ichunkprovider = field_1563_u.field_6324_e.field_1017_H;
        if(ichunkprovider == null)
        {
            return;
        }
        for(int i = -512; i < 512; i++)
        {
            for(int j = -512; j < 512; j++)
            {
                if(!ichunkprovider.func_537_a(i, j))
                {
                    continue;
                }
                Chunk chunk = ichunkprovider.func_533_b(i, j);
                if(chunk == null || (chunk instanceof EmptyChunk))
                {
                    continue;
                }
                ExtendedBlockStorage aextendedblockstorage[] = chunk.func_48495_i();
                for(int k = 0; k < aextendedblockstorage.length; k++)
                {
                    ExtendedBlockStorage extendedblockstorage = aextendedblockstorage[k];
                    if(extendedblockstorage == null)
                    {
                        continue;
                    }
                    NibbleArray nibblearray = extendedblockstorage.func_48714_l();
                    if(nibblearray == null)
                    {
                        continue;
                    }
                    byte abyte0[] = nibblearray.field_1109_a;
                    for(int l = 0; l < abyte0.length; l++)
                    {
                        abyte0[l] = 0;
                    }

                }

                chunk.func_1024_c();
            }

        }

        field_1563_u.field_6323_f.func_958_a();
    }

    public void func_1045_b(EnumOptions p_1045_1_, int p_1045_2_)
    {
        if(p_1045_1_ == EnumOptions.INVERT_MOUSE)
        {
            field_1581_d = !field_1581_d;
        }
        if(p_1045_1_ == EnumOptions.RENDER_DISTANCE)
        {
            field_1580_e = field_1580_e + p_1045_2_ & 3;
            ofRenderDistanceFine = 32 << 3 - field_1580_e;
        }
        if(p_1045_1_ == EnumOptions.GUI_SCALE)
        {
            field_25148_H = field_25148_H + p_1045_2_ & 3;
        }
        if(p_1045_1_ == EnumOptions.PARTICLES)
        {
            field_41087_P = (field_41087_P + p_1045_2_) % 3;
        }
        if(p_1045_1_ == EnumOptions.VIEW_BOBBING)
        {
            field_1579_f = !field_1579_f;
        }
        if(p_1045_1_ == EnumOptions.RENDER_CLOUDS)
        {
            field_40445_l = !field_40445_l;
        }
        if(p_1045_1_ == EnumOptions.ADVANCED_OPENGL)
        {
            if(!Config.isOcclusionAvailable())
            {
                ofOcclusionFancy = false;
                field_27342_h = false;
            } else
            if(!field_27342_h)
            {
                field_27342_h = true;
                ofOcclusionFancy = false;
            } else
            if(!ofOcclusionFancy)
            {
                ofOcclusionFancy = true;
            } else
            {
                ofOcclusionFancy = false;
                field_27342_h = false;
            }
            field_1563_u.field_6323_f.setAllRenderesVisible();
        }
        if(p_1045_1_ == EnumOptions.ANAGLYPH)
        {
            field_1578_g = !field_1578_g;
            field_1563_u.field_6315_n.func_1065_b();
        }
        if(p_1045_1_ == EnumOptions.FRAMERATE_LIMIT)
        {
            field_1577_h = (field_1577_h + p_1045_2_) % 4;
            Display.setVSyncEnabled(field_1577_h == 3);
        }
        if(p_1045_1_ == EnumOptions.DIFFICULTY)
        {
            field_1561_w = field_1561_w + p_1045_2_ & 3;
        }
        if(p_1045_1_ == EnumOptions.GRAPHICS)
        {
            field_1576_i = !field_1576_i;
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1045_1_ == EnumOptions.AMBIENT_OCCLUSION)
        {
            field_22278_j = !field_22278_j;
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1045_1_ == EnumOptions.FOG_FANCY)
        {
            switch(ofFogType)
            {
            case 1: // '\001'
                ofFogType = 2;
                if(!Config.isFancyFogAvailable())
                {
                    ofFogType = 3;
                }
                break;

            case 2: // '\002'
                ofFogType = 3;
                break;

            case 3: // '\003'
                ofFogType = 1;
                break;

            default:
                ofFogType = 1;
                break;
            }
        }
        if(p_1045_1_ == EnumOptions.FOG_START)
        {
            ofFogStart += 0.2F;
            if(ofFogStart > 0.81F)
            {
                ofFogStart = 0.2F;
            }
        }
        if(p_1045_1_ == EnumOptions.MIPMAP_LEVEL)
        {
            ofMipmapLevel++;
            if(ofMipmapLevel > 4)
            {
                ofMipmapLevel = 0;
            }
            field_1563_u.field_6315_n.func_1065_b();
        }
        if(p_1045_1_ == EnumOptions.MIPMAP_TYPE)
        {
            ofMipmapLinear = !ofMipmapLinear;
            field_1563_u.field_6315_n.func_1065_b();
        }
        if(p_1045_1_ == EnumOptions.LOAD_FAR)
        {
            ofLoadFar = !ofLoadFar;
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1045_1_ == EnumOptions.PRELOADED_CHUNKS)
        {
            ofPreloadedChunks += 2;
            if(ofPreloadedChunks > 8)
            {
                ofPreloadedChunks = 0;
            }
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1045_1_ == EnumOptions.SMOOTH_FPS)
        {
            ofSmoothFps = !ofSmoothFps;
        }
        if(p_1045_1_ == EnumOptions.SMOOTH_INPUT)
        {
            ofSmoothInput = !ofSmoothInput;
        }
        if(p_1045_1_ == EnumOptions.CLOUDS)
        {
            ofClouds++;
            if(ofClouds > 3)
            {
                ofClouds = 0;
            }
        }
        if(p_1045_1_ == EnumOptions.TREES)
        {
            ofTrees++;
            if(ofTrees > 2)
            {
                ofTrees = 0;
            }
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1045_1_ == EnumOptions.GRASS)
        {
            ofGrass++;
            if(ofGrass > 2)
            {
                ofGrass = 0;
            }
            RenderBlocks.field_27406_a = Config.isGrassFancy();
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1045_1_ == EnumOptions.RAIN)
        {
            ofRain++;
            if(ofRain > 3)
            {
                ofRain = 0;
            }
        }
        if(p_1045_1_ == EnumOptions.WATER)
        {
            ofWater++;
            if(ofWater > 2)
            {
                ofWater = 0;
            }
        }
        if(p_1045_1_ == EnumOptions.ANIMATED_WATER)
        {
            ofAnimatedWater++;
            if(ofAnimatedWater > 2)
            {
                ofAnimatedWater = 0;
            }
            field_1563_u.field_6315_n.func_1065_b();
        }
        if(p_1045_1_ == EnumOptions.ANIMATED_LAVA)
        {
            ofAnimatedLava++;
            if(ofAnimatedLava > 2)
            {
                ofAnimatedLava = 0;
            }
            field_1563_u.field_6315_n.func_1065_b();
        }
        if(p_1045_1_ == EnumOptions.ANIMATED_FIRE)
        {
            ofAnimatedFire = !ofAnimatedFire;
            field_1563_u.field_6315_n.func_1065_b();
        }
        if(p_1045_1_ == EnumOptions.ANIMATED_PORTAL)
        {
            ofAnimatedPortal = !ofAnimatedPortal;
            field_1563_u.field_6315_n.func_1065_b();
        }
        if(p_1045_1_ == EnumOptions.ANIMATED_REDSTONE)
        {
            ofAnimatedRedstone = !ofAnimatedRedstone;
        }
        if(p_1045_1_ == EnumOptions.ANIMATED_EXPLOSION)
        {
            ofAnimatedExplosion = !ofAnimatedExplosion;
        }
        if(p_1045_1_ == EnumOptions.ANIMATED_FLAME)
        {
            ofAnimatedFlame = !ofAnimatedFlame;
        }
        if(p_1045_1_ == EnumOptions.ANIMATED_SMOKE)
        {
            ofAnimatedSmoke = !ofAnimatedSmoke;
        }
        if(p_1045_1_ == EnumOptions.VOID_PARTICLES)
        {
            ofVoidParticles = !ofVoidParticles;
        }
        if(p_1045_1_ == EnumOptions.WATER_PARTICLES)
        {
            ofWaterParticles = !ofWaterParticles;
        }
        if(p_1045_1_ == EnumOptions.PORTAL_PARTICLES)
        {
            ofPortalParticles = !ofPortalParticles;
        }
        if(p_1045_1_ == EnumOptions.DRIPPING_WATER_LAVA)
        {
            ofDrippingWaterLava = !ofDrippingWaterLava;
        }
        if(p_1045_1_ == EnumOptions.ANIMATED_TERRAIN)
        {
            ofAnimatedTerrain = !ofAnimatedTerrain;
            field_1563_u.field_6315_n.func_1065_b();
        }
        if(p_1045_1_ == EnumOptions.ANIMATED_ITEMS)
        {
            ofAnimatedItems = !ofAnimatedItems;
            field_1563_u.field_6315_n.func_1065_b();
        }
        if(p_1045_1_ == EnumOptions.RAIN_SPLASH)
        {
            ofRainSplash = !ofRainSplash;
        }
        if(p_1045_1_ == EnumOptions.FAST_DEBUG_INFO)
        {
            ofFastDebugInfo = !ofFastDebugInfo;
        }
        if(p_1045_1_ == EnumOptions.AUTOSAVE_TICKS)
        {
            ofAutoSaveTicks *= 10;
            if(ofAutoSaveTicks > 40000)
            {
                ofAutoSaveTicks = 40;
            }
        }
        if(p_1045_1_ == EnumOptions.BETTER_GRASS)
        {
            ofBetterGrass++;
            if(ofBetterGrass > 3)
            {
                ofBetterGrass = 1;
            }
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1045_1_ == EnumOptions.CONNECTED_TEXTURES)
        {
            ofConnectedTextures++;
            if(ofConnectedTextures > 3)
            {
                ofConnectedTextures = 1;
            }
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1045_1_ == EnumOptions.WEATHER)
        {
            ofWeather = !ofWeather;
        }
        if(p_1045_1_ == EnumOptions.SKY)
        {
            ofSky = !ofSky;
        }
        if(p_1045_1_ == EnumOptions.STARS)
        {
            ofStars = !ofStars;
        }
        if(p_1045_1_ == EnumOptions.SUN_MOON)
        {
            ofSunMoon = !ofSunMoon;
        }
        if(p_1045_1_ == EnumOptions.CHUNK_UPDATES)
        {
            ofChunkUpdates++;
            if(ofChunkUpdates > 5)
            {
                ofChunkUpdates = 1;
            }
        }
        if(p_1045_1_ == EnumOptions.CHUNK_UPDATES_DYNAMIC)
        {
            ofChunkUpdatesDynamic = !ofChunkUpdatesDynamic;
        }
        if(p_1045_1_ == EnumOptions.TIME)
        {
            ofTime++;
            if(ofTime > 3)
            {
                ofTime = 0;
            }
        }
        if(p_1045_1_ == EnumOptions.CLEAR_WATER)
        {
            ofClearWater = !ofClearWater;
            updateWaterOpacity();
        }
        if(p_1045_1_ == EnumOptions.DEPTH_FOG)
        {
            ofDepthFog = !ofDepthFog;
        }
        if(p_1045_1_ == EnumOptions.PROFILER)
        {
            ofProfiler = !ofProfiler;
        }
        if(p_1045_1_ == EnumOptions.BETTER_SNOW)
        {
            ofBetterSnow = !ofBetterSnow;
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1045_1_ == EnumOptions.SWAMP_COLORS)
        {
            ofSwampColors = !ofSwampColors;
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1045_1_ == EnumOptions.RANDOM_MOBS)
        {
            ofRandomMobs = !ofRandomMobs;
            field_1563_u.field_6315_n.func_1065_b();
        }
        if(p_1045_1_ == EnumOptions.SMOOTH_BIOMES)
        {
            ofSmoothBiomes = !ofSmoothBiomes;
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1045_1_ == EnumOptions.CUSTOM_FONTS)
        {
            ofCustomFonts = !ofCustomFonts;
            field_1563_u.field_6315_n.func_1065_b();
        }
        if(p_1045_1_ == EnumOptions.CUSTOM_COLORS)
        {
            ofCustomColors = !ofCustomColors;
            field_1563_u.field_6315_n.func_1065_b();
            field_1563_u.field_6323_f.func_958_a();
        }
        if(p_1045_1_ == EnumOptions.SHOW_CAPES)
        {
            ofShowCapes = !ofShowCapes;
            field_1563_u.field_6323_f.updateCapes();
        }
        if(p_1045_1_ == EnumOptions.FULLSCREEN_MODE)
        {
            List list = Arrays.asList(Config.getFullscreenModes());
            if(ofFullscreenMode.equals("Default"))
            {
                ofFullscreenMode = (String)list.get(0);
            } else
            {
                int i = list.indexOf(ofFullscreenMode);
                if(i < 0)
                {
                    ofFullscreenMode = "Default";
                } else
                if(++i >= list.size())
                {
                    ofFullscreenMode = "Default";
                } else
                {
                    ofFullscreenMode = (String)list.get(i);
                }
            }
        }
        func_1041_b();
    }

    public float func_20104_a(EnumOptions p_20104_1_)
    {
        if(p_20104_1_ == EnumOptions.FOV)
        {
            return field_35379_L;
        }
        if(p_20104_1_ == EnumOptions.GAMMA)
        {
            return field_35380_M;
        }
        if(p_20104_1_ == EnumOptions.MUSIC)
        {
            return field_1584_a;
        }
        if(p_20104_1_ == EnumOptions.SOUND)
        {
            return field_1583_b;
        }
        if(p_20104_1_ == EnumOptions.SENSITIVITY)
        {
            return field_1582_c;
        }
        if(p_20104_1_ == EnumOptions.CLOUD_HEIGHT)
        {
            return ofCloudsHeight;
        }
        if(p_20104_1_ == EnumOptions.AO_LEVEL)
        {
            return ofAoLevel;
        }
        if(p_20104_1_ == EnumOptions.RENDER_DISTANCE_FINE)
        {
            return (float)(ofRenderDistanceFine - 32) / 480F;
        } else
        {
            return 0.0F;
        }
    }

    public boolean func_20103_b(EnumOptions p_20103_1_)
    {
        switch(EnumOptionsMappingHelper.field_20155_a[p_20103_1_.ordinal()])
        {
        case 1: // '\001'
            return field_1581_d;

        case 2: // '\002'
            return field_1579_f;

        case 3: // '\003'
            return field_1578_g;

        case 4: // '\004'
            return field_27342_h;

        case 5: // '\005'
            return field_22278_j;

        case 6: // '\006'
            return field_40445_l;
        }
        return false;
    }

    private static String func_48571_a(String p_48571_0_[], int p_48571_1_)
    {
        if(p_48571_1_ < 0 || p_48571_1_ >= p_48571_0_.length)
        {
            p_48571_1_ = 0;
        }
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        return stringtranslate.func_20163_a(p_48571_0_[p_48571_1_]);
    }

    public String func_1043_a(EnumOptions p_1043_1_)
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        String s = stringtranslate.func_20163_a(p_1043_1_.func_20138_d());
        if(s == null)
        {
            s = p_1043_1_.func_20138_d();
        }
        String s1 = (new StringBuilder()).append(s).append(": ").toString();
        if(p_1043_1_.func_20136_a())
        {
            float f = func_20104_a(p_1043_1_);
            if(p_1043_1_ == EnumOptions.SENSITIVITY)
            {
                if(f == 0.0F)
                {
                    return (new StringBuilder()).append(s1).append(stringtranslate.func_20163_a("options.sensitivity.min")).toString();
                }
                if(f == 1.0F)
                {
                    return (new StringBuilder()).append(s1).append(stringtranslate.func_20163_a("options.sensitivity.max")).toString();
                } else
                {
                    return (new StringBuilder()).append(s1).append((int)(f * 200F)).append("%").toString();
                }
            }
            if(p_1043_1_ == EnumOptions.FOV)
            {
                if(f == 0.0F)
                {
                    return (new StringBuilder()).append(s1).append(stringtranslate.func_20163_a("options.fov.min")).toString();
                }
                if(f == 1.0F)
                {
                    return (new StringBuilder()).append(s1).append(stringtranslate.func_20163_a("options.fov.max")).toString();
                } else
                {
                    return (new StringBuilder()).append(s1).append((int)(70F + f * 40F)).toString();
                }
            }
            if(p_1043_1_ == EnumOptions.GAMMA)
            {
                if(f == 0.0F)
                {
                    return (new StringBuilder()).append(s1).append(stringtranslate.func_20163_a("options.gamma.min")).toString();
                }
                if(f == 1.0F)
                {
                    return (new StringBuilder()).append(s1).append(stringtranslate.func_20163_a("options.gamma.max")).toString();
                } else
                {
                    return (new StringBuilder()).append(s1).append("+").append((int)(f * 100F)).append("%").toString();
                }
            }
            if(p_1043_1_ == EnumOptions.RENDER_DISTANCE_FINE)
            {
                String s2 = "Tiny";
                char c = ' ';
                if(ofRenderDistanceFine >= 64)
                {
                    s2 = "Short";
                    c = '@';
                }
                if(ofRenderDistanceFine >= 128)
                {
                    s2 = "Normal";
                    c = '\200';
                }
                if(ofRenderDistanceFine >= 256)
                {
                    s2 = "Far";
                    c = '\u0100';
                }
                if(ofRenderDistanceFine >= 512)
                {
                    s2 = "Extreme";
                    c = '\u0200';
                }
                int i = ofRenderDistanceFine - c;
                if(i == 0)
                {
                    return (new StringBuilder()).append(s1).append(s2).toString();
                } else
                {
                    return (new StringBuilder()).append(s1).append(s2).append(" +").append(i).toString();
                }
            }
            if(f == 0.0F)
            {
                return (new StringBuilder()).append(s1).append(stringtranslate.func_20163_a("options.off")).toString();
            } else
            {
                return (new StringBuilder()).append(s1).append((int)(f * 100F)).append("%").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.ADVANCED_OPENGL)
        {
            if(!field_27342_h)
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
            if(ofOcclusionFancy)
            {
                return (new StringBuilder()).append(s1).append("Fancy").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("Fast").toString();
            }
        }
        if(p_1043_1_.func_20140_b())
        {
            boolean flag = func_20103_b(p_1043_1_);
            if(flag)
            {
                return (new StringBuilder()).append(s1).append(stringtranslate.func_20163_a("options.on")).toString();
            } else
            {
                return (new StringBuilder()).append(s1).append(stringtranslate.func_20163_a("options.off")).toString();
            }
        }
        if(p_1043_1_ == EnumOptions.RENDER_DISTANCE)
        {
            return (new StringBuilder()).append(s1).append(func_48571_a(field_20105_z, field_1580_e)).toString();
        }
        if(p_1043_1_ == EnumOptions.DIFFICULTY)
        {
            return (new StringBuilder()).append(s1).append(func_48571_a(field_20106_A, field_1561_w)).toString();
        }
        if(p_1043_1_ == EnumOptions.GUI_SCALE)
        {
            return (new StringBuilder()).append(s1).append(func_48571_a(field_25147_K, field_25148_H)).toString();
        }
        if(p_1043_1_ == EnumOptions.PARTICLES)
        {
            return (new StringBuilder()).append(s1).append(func_48571_a(field_41086_T, field_41087_P)).toString();
        }
        if(p_1043_1_ == EnumOptions.FRAMERATE_LIMIT)
        {
            if(field_1577_h == 3)
            {
                return (new StringBuilder()).append(s1).append("VSync").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append(func_48571_a(field_30006_M, field_1577_h)).toString();
            }
        }
        if(p_1043_1_ == EnumOptions.FOG_FANCY)
        {
            switch(ofFogType)
            {
            case 1: // '\001'
                return (new StringBuilder()).append(s1).append("Fast").toString();

            case 2: // '\002'
                return (new StringBuilder()).append(s1).append("Fancy").toString();

            case 3: // '\003'
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
            return (new StringBuilder()).append(s1).append("OFF").toString();
        }
        if(p_1043_1_ == EnumOptions.FOG_START)
        {
            return (new StringBuilder()).append(s1).append(ofFogStart).toString();
        }
        if(p_1043_1_ == EnumOptions.MIPMAP_LEVEL)
        {
            if(ofMipmapLevel == 0)
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
            if(ofMipmapLevel == 4)
            {
                return (new StringBuilder()).append(s1).append("Max").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append(ofMipmapLevel).toString();
            }
        }
        if(p_1043_1_ == EnumOptions.MIPMAP_TYPE)
        {
            if(ofMipmapLinear)
            {
                return (new StringBuilder()).append(s1).append("Linear").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("Nearest").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.LOAD_FAR)
        {
            if(ofLoadFar)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.PRELOADED_CHUNKS)
        {
            if(ofPreloadedChunks == 0)
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append(ofPreloadedChunks).toString();
            }
        }
        if(p_1043_1_ == EnumOptions.SMOOTH_FPS)
        {
            if(ofSmoothFps)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.SMOOTH_INPUT)
        {
            if(ofSmoothInput)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.CLOUDS)
        {
            switch(ofClouds)
            {
            case 1: // '\001'
                return (new StringBuilder()).append(s1).append("Fast").toString();

            case 2: // '\002'
                return (new StringBuilder()).append(s1).append("Fancy").toString();

            case 3: // '\003'
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
            return (new StringBuilder()).append(s1).append("Default").toString();
        }
        if(p_1043_1_ == EnumOptions.TREES)
        {
            switch(ofTrees)
            {
            case 1: // '\001'
                return (new StringBuilder()).append(s1).append("Fast").toString();

            case 2: // '\002'
                return (new StringBuilder()).append(s1).append("Fancy").toString();
            }
            return (new StringBuilder()).append(s1).append("Default").toString();
        }
        if(p_1043_1_ == EnumOptions.GRASS)
        {
            switch(ofGrass)
            {
            case 1: // '\001'
                return (new StringBuilder()).append(s1).append("Fast").toString();

            case 2: // '\002'
                return (new StringBuilder()).append(s1).append("Fancy").toString();
            }
            return (new StringBuilder()).append(s1).append("Default").toString();
        }
        if(p_1043_1_ == EnumOptions.RAIN)
        {
            switch(ofRain)
            {
            case 1: // '\001'
                return (new StringBuilder()).append(s1).append("Fast").toString();

            case 2: // '\002'
                return (new StringBuilder()).append(s1).append("Fancy").toString();

            case 3: // '\003'
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
            return (new StringBuilder()).append(s1).append("Default").toString();
        }
        if(p_1043_1_ == EnumOptions.WATER)
        {
            switch(ofWater)
            {
            case 1: // '\001'
                return (new StringBuilder()).append(s1).append("Fast").toString();

            case 2: // '\002'
                return (new StringBuilder()).append(s1).append("Fancy").toString();

            case 3: // '\003'
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
            return (new StringBuilder()).append(s1).append("Default").toString();
        }
        if(p_1043_1_ == EnumOptions.ANIMATED_WATER)
        {
            switch(ofAnimatedWater)
            {
            case 1: // '\001'
                return (new StringBuilder()).append(s1).append("Dynamic").toString();

            case 2: // '\002'
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
            return (new StringBuilder()).append(s1).append("ON").toString();
        }
        if(p_1043_1_ == EnumOptions.ANIMATED_LAVA)
        {
            switch(ofAnimatedLava)
            {
            case 1: // '\001'
                return (new StringBuilder()).append(s1).append("Dynamic").toString();

            case 2: // '\002'
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
            return (new StringBuilder()).append(s1).append("ON").toString();
        }
        if(p_1043_1_ == EnumOptions.ANIMATED_FIRE)
        {
            if(ofAnimatedFire)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.ANIMATED_PORTAL)
        {
            if(ofAnimatedPortal)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.ANIMATED_REDSTONE)
        {
            if(ofAnimatedRedstone)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.ANIMATED_EXPLOSION)
        {
            if(ofAnimatedExplosion)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.ANIMATED_FLAME)
        {
            if(ofAnimatedFlame)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.ANIMATED_SMOKE)
        {
            if(ofAnimatedSmoke)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.VOID_PARTICLES)
        {
            if(ofVoidParticles)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.WATER_PARTICLES)
        {
            if(ofWaterParticles)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.PORTAL_PARTICLES)
        {
            if(ofPortalParticles)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.DRIPPING_WATER_LAVA)
        {
            if(ofDrippingWaterLava)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.ANIMATED_TERRAIN)
        {
            if(ofAnimatedTerrain)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.ANIMATED_ITEMS)
        {
            if(ofAnimatedItems)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.RAIN_SPLASH)
        {
            if(ofRainSplash)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.FAST_DEBUG_INFO)
        {
            if(ofFastDebugInfo)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.AUTOSAVE_TICKS)
        {
            if(ofAutoSaveTicks <= 40)
            {
                return (new StringBuilder()).append(s1).append("Default (2s)").toString();
            }
            if(ofAutoSaveTicks <= 400)
            {
                return (new StringBuilder()).append(s1).append("20s").toString();
            }
            if(ofAutoSaveTicks <= 4000)
            {
                return (new StringBuilder()).append(s1).append("3min").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("30min").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.BETTER_GRASS)
        {
            switch(ofBetterGrass)
            {
            case 1: // '\001'
                return (new StringBuilder()).append(s1).append("Fast").toString();

            case 2: // '\002'
                return (new StringBuilder()).append(s1).append("Fancy").toString();
            }
            return (new StringBuilder()).append(s1).append("OFF").toString();
        }
        if(p_1043_1_ == EnumOptions.CONNECTED_TEXTURES)
        {
            switch(ofConnectedTextures)
            {
            case 1: // '\001'
                return (new StringBuilder()).append(s1).append("Fast").toString();

            case 2: // '\002'
                return (new StringBuilder()).append(s1).append("Fancy").toString();
            }
            return (new StringBuilder()).append(s1).append("OFF").toString();
        }
        if(p_1043_1_ == EnumOptions.WEATHER)
        {
            if(ofWeather)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.SKY)
        {
            if(ofSky)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.STARS)
        {
            if(ofStars)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.SUN_MOON)
        {
            if(ofSunMoon)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.CHUNK_UPDATES)
        {
            return (new StringBuilder()).append(s1).append(ofChunkUpdates).toString();
        }
        if(p_1043_1_ == EnumOptions.CHUNK_UPDATES_DYNAMIC)
        {
            if(ofChunkUpdatesDynamic)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.TIME)
        {
            if(ofTime == 1)
            {
                return (new StringBuilder()).append(s1).append("Day Only").toString();
            }
            if(ofTime == 3)
            {
                return (new StringBuilder()).append(s1).append("Night Only").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("Default").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.CLEAR_WATER)
        {
            if(ofClearWater)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.DEPTH_FOG)
        {
            if(ofDepthFog)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.PROFILER)
        {
            if(ofProfiler)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.BETTER_SNOW)
        {
            if(ofBetterSnow)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.SWAMP_COLORS)
        {
            if(ofSwampColors)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.RANDOM_MOBS)
        {
            if(ofRandomMobs)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.SMOOTH_BIOMES)
        {
            if(ofSmoothBiomes)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.CUSTOM_FONTS)
        {
            if(ofCustomFonts)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.CUSTOM_COLORS)
        {
            if(ofCustomColors)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.SHOW_CAPES)
        {
            if(ofShowCapes)
            {
                return (new StringBuilder()).append(s1).append("ON").toString();
            } else
            {
                return (new StringBuilder()).append(s1).append("OFF").toString();
            }
        }
        if(p_1043_1_ == EnumOptions.FULLSCREEN_MODE)
        {
            return (new StringBuilder()).append(s1).append(ofFullscreenMode).toString();
        }
        if(p_1043_1_ == EnumOptions.GRAPHICS)
        {
            if(field_1576_i)
            {
                return (new StringBuilder()).append(s1).append(stringtranslate.func_20163_a("options.graphics.fancy")).toString();
            } else
            {
                return (new StringBuilder()).append(s1).append(stringtranslate.func_20163_a("options.graphics.fast")).toString();
            }
        } else
        {
            return s1;
        }
    }

    public void func_6519_a()
    {
        try
        {
            if(!field_6522_B.exists())
            {
                return;
            }
            BufferedReader bufferedreader = new BufferedReader(new FileReader(field_6522_B));
            for(String s = ""; (s = bufferedreader.readLine()) != null;)
            {
                try
                {
                    String as[] = s.split(":");
                    if(as[0].equals("music"))
                    {
                        field_1584_a = func_1050_a(as[1]);
                    }
                    if(as[0].equals("sound"))
                    {
                        field_1583_b = func_1050_a(as[1]);
                    }
                    if(as[0].equals("mouseSensitivity"))
                    {
                        field_1582_c = func_1050_a(as[1]);
                    }
                    if(as[0].equals("fov"))
                    {
                        field_35379_L = func_1050_a(as[1]);
                    }
                    if(as[0].equals("gamma"))
                    {
                        field_35380_M = func_1050_a(as[1]);
                    }
                    if(as[0].equals("invertYMouse"))
                    {
                        field_1581_d = as[1].equals("true");
                    }
                    if(as[0].equals("viewDistance"))
                    {
                        field_1580_e = Integer.parseInt(as[1]);
                        ofRenderDistanceFine = 32 << 3 - field_1580_e;
                    }
                    if(as[0].equals("guiScale"))
                    {
                        field_25148_H = Integer.parseInt(as[1]);
                    }
                    if(as[0].equals("particles"))
                    {
                        field_41087_P = Integer.parseInt(as[1]);
                    }
                    if(as[0].equals("bobView"))
                    {
                        field_1579_f = as[1].equals("true");
                    }
                    if(as[0].equals("anaglyph3d"))
                    {
                        field_1578_g = as[1].equals("true");
                    }
                    if(as[0].equals("advancedOpengl"))
                    {
                        field_27342_h = as[1].equals("true");
                    }
                    if(as[0].equals("fpsLimit"))
                    {
                        field_1577_h = Integer.parseInt(as[1]);
                        Display.setVSyncEnabled(field_1577_h == 3);
                    }
                    if(as[0].equals("difficulty"))
                    {
                        field_1561_w = Integer.parseInt(as[1]);
                    }
                    if(as[0].equals("fancyGraphics"))
                    {
                        field_1576_i = as[1].equals("true");
                    }
                    if(as[0].equals("ao"))
                    {
                        field_22278_j = as[1].equals("true");
                        if(field_22278_j)
                        {
                            ofAoLevel = 1.0F;
                        } else
                        {
                            ofAoLevel = 0.0F;
                        }
                    }
                    if(as[0].equals("clouds"))
                    {
                        field_40445_l = as[1].equals("true");
                    }
                    if(as[0].equals("skin"))
                    {
                        field_6524_j = as[1];
                    }
                    if(as[0].equals("lastServer") && as.length >= 2)
                    {
                        field_12259_z = as[1];
                    }
                    if(as[0].equals("lang") && as.length >= 2)
                    {
                        field_44018_Q = as[1];
                    }
                    int i = 0;
                    while(i < field_1564_t.length) 
                    {
                        if(as[0].equals((new StringBuilder()).append("key_").append(field_1564_t[i].field_1371_a).toString()))
                        {
                            field_1564_t[i].field_1370_b = Integer.parseInt(as[1]);
                        }
                        i++;
                    }
                }
                catch(Exception exception2)
                {
                    System.out.println((new StringBuilder()).append("Skipping bad option: ").append(s).toString());
                }
            }

            KeyBinding.func_35961_b();
            bufferedreader.close();
        }
        catch(Exception exception)
        {
            System.out.println("Failed to load options");
            exception.printStackTrace();
        }
        try
        {
            File file = optionsFileOF;
            if(!file.exists())
            {
                file = field_6522_B;
            }
            if(!file.exists())
            {
                return;
            }
            BufferedReader bufferedreader1 = new BufferedReader(new FileReader(file));
            String s1 = "";
            do
            {
                String s2;
                if((s2 = bufferedreader1.readLine()) == null)
                {
                    break;
                }
                try
                {
                    String as1[] = s2.split(":");
                    if(as1[0].equals("ofRenderDistanceFine") && as1.length >= 2)
                    {
                        ofRenderDistanceFine = Integer.valueOf(as1[1]).intValue();
                        ofRenderDistanceFine = Config.limit(ofRenderDistanceFine, 32, 512);
                    }
                    if(as1[0].equals("ofFogType") && as1.length >= 2)
                    {
                        ofFogType = Integer.valueOf(as1[1]).intValue();
                        ofFogType = Config.limit(ofFogType, 1, 3);
                    }
                    if(as1[0].equals("ofFogStart") && as1.length >= 2)
                    {
                        ofFogStart = Float.valueOf(as1[1]).floatValue();
                        if(ofFogStart < 0.2F)
                        {
                            ofFogStart = 0.2F;
                        }
                        if(ofFogStart > 0.81F)
                        {
                            ofFogStart = 0.8F;
                        }
                    }
                    if(as1[0].equals("ofMipmapLevel") && as1.length >= 2)
                    {
                        ofMipmapLevel = Integer.valueOf(as1[1]).intValue();
                        if(ofMipmapLevel < 0)
                        {
                            ofMipmapLevel = 0;
                        }
                        if(ofMipmapLevel > 4)
                        {
                            ofMipmapLevel = 4;
                        }
                    }
                    if(as1[0].equals("ofMipmapLinear") && as1.length >= 2)
                    {
                        ofMipmapLinear = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofLoadFar") && as1.length >= 2)
                    {
                        ofLoadFar = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofPreloadedChunks") && as1.length >= 2)
                    {
                        ofPreloadedChunks = Integer.valueOf(as1[1]).intValue();
                        if(ofPreloadedChunks < 0)
                        {
                            ofPreloadedChunks = 0;
                        }
                        if(ofPreloadedChunks > 8)
                        {
                            ofPreloadedChunks = 8;
                        }
                    }
                    if(as1[0].equals("ofOcclusionFancy") && as1.length >= 2)
                    {
                        ofOcclusionFancy = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofSmoothFps") && as1.length >= 2)
                    {
                        ofSmoothFps = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofSmoothInput") && as1.length >= 2)
                    {
                        ofSmoothInput = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofAoLevel") && as1.length >= 2)
                    {
                        ofAoLevel = Float.valueOf(as1[1]).floatValue();
                        ofAoLevel = Config.limit(ofAoLevel, 0.0F, 1.0F);
                        field_22278_j = ofAoLevel > 0.0F;
                    }
                    if(as1[0].equals("ofClouds") && as1.length >= 2)
                    {
                        ofClouds = Integer.valueOf(as1[1]).intValue();
                        ofClouds = Config.limit(ofClouds, 0, 3);
                    }
                    if(as1[0].equals("ofCloudsHeight") && as1.length >= 2)
                    {
                        ofCloudsHeight = Float.valueOf(as1[1]).floatValue();
                        ofCloudsHeight = Config.limit(ofCloudsHeight, 0.0F, 1.0F);
                    }
                    if(as1[0].equals("ofTrees") && as1.length >= 2)
                    {
                        ofTrees = Integer.valueOf(as1[1]).intValue();
                        ofTrees = Config.limit(ofTrees, 0, 2);
                    }
                    if(as1[0].equals("ofGrass") && as1.length >= 2)
                    {
                        ofGrass = Integer.valueOf(as1[1]).intValue();
                        ofGrass = Config.limit(ofGrass, 0, 2);
                    }
                    if(as1[0].equals("ofRain") && as1.length >= 2)
                    {
                        ofRain = Integer.valueOf(as1[1]).intValue();
                        ofRain = Config.limit(ofRain, 0, 3);
                    }
                    if(as1[0].equals("ofWater") && as1.length >= 2)
                    {
                        ofWater = Integer.valueOf(as1[1]).intValue();
                        ofWater = Config.limit(ofWater, 0, 3);
                    }
                    if(as1[0].equals("ofAnimatedWater") && as1.length >= 2)
                    {
                        ofAnimatedWater = Integer.valueOf(as1[1]).intValue();
                        ofAnimatedWater = Config.limit(ofAnimatedWater, 0, 2);
                    }
                    if(as1[0].equals("ofAnimatedLava") && as1.length >= 2)
                    {
                        ofAnimatedLava = Integer.valueOf(as1[1]).intValue();
                        ofAnimatedLava = Config.limit(ofAnimatedLava, 0, 2);
                    }
                    if(as1[0].equals("ofAnimatedFire") && as1.length >= 2)
                    {
                        ofAnimatedFire = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofAnimatedPortal") && as1.length >= 2)
                    {
                        ofAnimatedPortal = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofAnimatedRedstone") && as1.length >= 2)
                    {
                        ofAnimatedRedstone = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofAnimatedExplosion") && as1.length >= 2)
                    {
                        ofAnimatedExplosion = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofAnimatedFlame") && as1.length >= 2)
                    {
                        ofAnimatedFlame = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofAnimatedSmoke") && as1.length >= 2)
                    {
                        ofAnimatedSmoke = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofVoidParticles") && as1.length >= 2)
                    {
                        ofVoidParticles = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofWaterParticles") && as1.length >= 2)
                    {
                        ofWaterParticles = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofPortalParticles") && as1.length >= 2)
                    {
                        ofPortalParticles = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofDrippingWaterLava") && as1.length >= 2)
                    {
                        ofDrippingWaterLava = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofAnimatedTerrain") && as1.length >= 2)
                    {
                        ofAnimatedTerrain = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofAnimatedItems") && as1.length >= 2)
                    {
                        ofAnimatedItems = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofRainSplash") && as1.length >= 2)
                    {
                        ofRainSplash = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofFastDebugInfo") && as1.length >= 2)
                    {
                        ofFastDebugInfo = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofAutoSaveTicks") && as1.length >= 2)
                    {
                        ofAutoSaveTicks = Integer.valueOf(as1[1]).intValue();
                        ofAutoSaveTicks = Config.limit(ofAutoSaveTicks, 40, 40000);
                    }
                    if(as1[0].equals("ofBetterGrass") && as1.length >= 2)
                    {
                        ofBetterGrass = Integer.valueOf(as1[1]).intValue();
                        ofBetterGrass = Config.limit(ofBetterGrass, 1, 3);
                    }
                    if(as1[0].equals("ofConnectedTextures") && as1.length >= 2)
                    {
                        ofConnectedTextures = Integer.valueOf(as1[1]).intValue();
                        ofConnectedTextures = Config.limit(ofConnectedTextures, 1, 3);
                    }
                    if(as1[0].equals("ofWeather") && as1.length >= 2)
                    {
                        ofWeather = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofSky") && as1.length >= 2)
                    {
                        ofSky = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofStars") && as1.length >= 2)
                    {
                        ofStars = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofSunMoon") && as1.length >= 2)
                    {
                        ofSunMoon = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofChunkUpdates") && as1.length >= 2)
                    {
                        ofChunkUpdates = Integer.valueOf(as1[1]).intValue();
                        ofChunkUpdates = Config.limit(ofChunkUpdates, 1, 5);
                    }
                    if(as1[0].equals("ofChunkUpdatesDynamic") && as1.length >= 2)
                    {
                        ofChunkUpdatesDynamic = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofTime") && as1.length >= 2)
                    {
                        ofTime = Integer.valueOf(as1[1]).intValue();
                        ofTime = Config.limit(ofTime, 0, 3);
                    }
                    if(as1[0].equals("ofClearWater") && as1.length >= 2)
                    {
                        ofClearWater = Boolean.valueOf(as1[1]).booleanValue();
                        updateWaterOpacity();
                    }
                    if(as1[0].equals("ofDepthFog") && as1.length >= 2)
                    {
                        ofDepthFog = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofAaLevel") && as1.length >= 2)
                    {
                        ofAaLevel = Integer.valueOf(as1[1]).intValue();
                        ofAaLevel = Config.limit(ofAaLevel, 0, 16);
                    }
                    if(as1[0].equals("ofAfLevel") && as1.length >= 2)
                    {
                        ofAfLevel = Integer.valueOf(as1[1]).intValue();
                        ofAfLevel = Config.limit(ofAfLevel, 1, 16);
                    }
                    if(as1[0].equals("ofProfiler") && as1.length >= 2)
                    {
                        ofProfiler = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofBetterSnow") && as1.length >= 2)
                    {
                        ofBetterSnow = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofSwampColors") && as1.length >= 2)
                    {
                        ofSwampColors = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofRandomMobs") && as1.length >= 2)
                    {
                        ofRandomMobs = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofSmoothBiomes") && as1.length >= 2)
                    {
                        ofSmoothBiomes = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofCustomFonts") && as1.length >= 2)
                    {
                        ofCustomFonts = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofCustomColors") && as1.length >= 2)
                    {
                        ofCustomColors = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofShowCapes") && as1.length >= 2)
                    {
                        ofShowCapes = Boolean.valueOf(as1[1]).booleanValue();
                    }
                    if(as1[0].equals("ofFullscreenMode") && as1.length >= 2)
                    {
                        ofFullscreenMode = as1[1];
                    }
                }
                catch(Exception exception3)
                {
                    System.out.println((new StringBuilder()).append("Skipping bad option: ").append(s2).toString());
                }
            } while(true);
            KeyBinding.func_35961_b();
            bufferedreader1.close();
        }
        catch(Exception exception1)
        {
            System.out.println("Failed to load options");
            exception1.printStackTrace();
        }
    }

    private float func_1050_a(String p_1050_1_)
    {
        if(p_1050_1_.equals("true"))
        {
            return 1.0F;
        }
        if(p_1050_1_.equals("false"))
        {
            return 0.0F;
        } else
        {
            return Float.parseFloat(p_1050_1_);
        }
    }

    public void func_1041_b()
    {
        try
        {
            PrintWriter printwriter = new PrintWriter(new FileWriter(field_6522_B));
            printwriter.println((new StringBuilder()).append("music:").append(field_1584_a).toString());
            printwriter.println((new StringBuilder()).append("sound:").append(field_1583_b).toString());
            printwriter.println((new StringBuilder()).append("invertYMouse:").append(field_1581_d).toString());
            printwriter.println((new StringBuilder()).append("mouseSensitivity:").append(field_1582_c).toString());
            printwriter.println((new StringBuilder()).append("fov:").append(field_35379_L).toString());
            printwriter.println((new StringBuilder()).append("gamma:").append(field_35380_M).toString());
            printwriter.println((new StringBuilder()).append("viewDistance:").append(field_1580_e).toString());
            printwriter.println((new StringBuilder()).append("guiScale:").append(field_25148_H).toString());
            printwriter.println((new StringBuilder()).append("particles:").append(field_41087_P).toString());
            printwriter.println((new StringBuilder()).append("bobView:").append(field_1579_f).toString());
            printwriter.println((new StringBuilder()).append("anaglyph3d:").append(field_1578_g).toString());
            printwriter.println((new StringBuilder()).append("advancedOpengl:").append(field_27342_h).toString());
            printwriter.println((new StringBuilder()).append("fpsLimit:").append(field_1577_h).toString());
            printwriter.println((new StringBuilder()).append("difficulty:").append(field_1561_w).toString());
            printwriter.println((new StringBuilder()).append("fancyGraphics:").append(field_1576_i).toString());
            printwriter.println((new StringBuilder()).append("ao:").append(field_22278_j).toString());
            printwriter.println((new StringBuilder()).append("clouds:").append(field_40445_l).toString());
            printwriter.println((new StringBuilder()).append("skin:").append(field_6524_j).toString());
            printwriter.println((new StringBuilder()).append("lastServer:").append(field_12259_z).toString());
            printwriter.println((new StringBuilder()).append("lang:").append(field_44018_Q).toString());
            for(int i = 0; i < field_1564_t.length; i++)
            {
                printwriter.println((new StringBuilder()).append("key_").append(field_1564_t[i].field_1371_a).append(":").append(field_1564_t[i].field_1370_b).toString());
            }

            printwriter.close();
        }
        catch(Exception exception)
        {
            System.out.println("Failed to save options");
            exception.printStackTrace();
        }
        try
        {
            PrintWriter printwriter1 = new PrintWriter(new FileWriter(optionsFileOF));
            printwriter1.println((new StringBuilder()).append("ofRenderDistanceFine:").append(ofRenderDistanceFine).toString());
            printwriter1.println((new StringBuilder()).append("ofFogType:").append(ofFogType).toString());
            printwriter1.println((new StringBuilder()).append("ofFogStart:").append(ofFogStart).toString());
            printwriter1.println((new StringBuilder()).append("ofMipmapLevel:").append(ofMipmapLevel).toString());
            printwriter1.println((new StringBuilder()).append("ofMipmapLinear:").append(ofMipmapLinear).toString());
            printwriter1.println((new StringBuilder()).append("ofLoadFar:").append(ofLoadFar).toString());
            printwriter1.println((new StringBuilder()).append("ofPreloadedChunks:").append(ofPreloadedChunks).toString());
            printwriter1.println((new StringBuilder()).append("ofOcclusionFancy:").append(ofOcclusionFancy).toString());
            printwriter1.println((new StringBuilder()).append("ofSmoothFps:").append(ofSmoothFps).toString());
            printwriter1.println((new StringBuilder()).append("ofSmoothInput:").append(ofSmoothInput).toString());
            printwriter1.println((new StringBuilder()).append("ofAoLevel:").append(ofAoLevel).toString());
            printwriter1.println((new StringBuilder()).append("ofClouds:").append(ofClouds).toString());
            printwriter1.println((new StringBuilder()).append("ofCloudsHeight:").append(ofCloudsHeight).toString());
            printwriter1.println((new StringBuilder()).append("ofTrees:").append(ofTrees).toString());
            printwriter1.println((new StringBuilder()).append("ofGrass:").append(ofGrass).toString());
            printwriter1.println((new StringBuilder()).append("ofRain:").append(ofRain).toString());
            printwriter1.println((new StringBuilder()).append("ofWater:").append(ofWater).toString());
            printwriter1.println((new StringBuilder()).append("ofAnimatedWater:").append(ofAnimatedWater).toString());
            printwriter1.println((new StringBuilder()).append("ofAnimatedLava:").append(ofAnimatedLava).toString());
            printwriter1.println((new StringBuilder()).append("ofAnimatedFire:").append(ofAnimatedFire).toString());
            printwriter1.println((new StringBuilder()).append("ofAnimatedPortal:").append(ofAnimatedPortal).toString());
            printwriter1.println((new StringBuilder()).append("ofAnimatedRedstone:").append(ofAnimatedRedstone).toString());
            printwriter1.println((new StringBuilder()).append("ofAnimatedExplosion:").append(ofAnimatedExplosion).toString());
            printwriter1.println((new StringBuilder()).append("ofAnimatedFlame:").append(ofAnimatedFlame).toString());
            printwriter1.println((new StringBuilder()).append("ofAnimatedSmoke:").append(ofAnimatedSmoke).toString());
            printwriter1.println((new StringBuilder()).append("ofVoidParticles:").append(ofVoidParticles).toString());
            printwriter1.println((new StringBuilder()).append("ofWaterParticles:").append(ofWaterParticles).toString());
            printwriter1.println((new StringBuilder()).append("ofPortalParticles:").append(ofPortalParticles).toString());
            printwriter1.println((new StringBuilder()).append("ofDrippingWaterLava:").append(ofDrippingWaterLava).toString());
            printwriter1.println((new StringBuilder()).append("ofAnimatedTerrain:").append(ofAnimatedTerrain).toString());
            printwriter1.println((new StringBuilder()).append("ofAnimatedItems:").append(ofAnimatedItems).toString());
            printwriter1.println((new StringBuilder()).append("ofRainSplash:").append(ofRainSplash).toString());
            printwriter1.println((new StringBuilder()).append("ofFastDebugInfo:").append(ofFastDebugInfo).toString());
            printwriter1.println((new StringBuilder()).append("ofAutoSaveTicks:").append(ofAutoSaveTicks).toString());
            printwriter1.println((new StringBuilder()).append("ofBetterGrass:").append(ofBetterGrass).toString());
            printwriter1.println((new StringBuilder()).append("ofConnectedTextures:").append(ofConnectedTextures).toString());
            printwriter1.println((new StringBuilder()).append("ofWeather:").append(ofWeather).toString());
            printwriter1.println((new StringBuilder()).append("ofSky:").append(ofSky).toString());
            printwriter1.println((new StringBuilder()).append("ofStars:").append(ofStars).toString());
            printwriter1.println((new StringBuilder()).append("ofSunMoon:").append(ofSunMoon).toString());
            printwriter1.println((new StringBuilder()).append("ofChunkUpdates:").append(ofChunkUpdates).toString());
            printwriter1.println((new StringBuilder()).append("ofChunkUpdatesDynamic:").append(ofChunkUpdatesDynamic).toString());
            printwriter1.println((new StringBuilder()).append("ofTime:").append(ofTime).toString());
            printwriter1.println((new StringBuilder()).append("ofClearWater:").append(ofClearWater).toString());
            printwriter1.println((new StringBuilder()).append("ofDepthFog:").append(ofDepthFog).toString());
            printwriter1.println((new StringBuilder()).append("ofAaLevel:").append(ofAaLevel).toString());
            printwriter1.println((new StringBuilder()).append("ofAfLevel:").append(ofAfLevel).toString());
            printwriter1.println((new StringBuilder()).append("ofProfiler:").append(ofProfiler).toString());
            printwriter1.println((new StringBuilder()).append("ofBetterSnow:").append(ofBetterSnow).toString());
            printwriter1.println((new StringBuilder()).append("ofSwampColors:").append(ofSwampColors).toString());
            printwriter1.println((new StringBuilder()).append("ofRandomMobs:").append(ofRandomMobs).toString());
            printwriter1.println((new StringBuilder()).append("ofSmoothBiomes:").append(ofSmoothBiomes).toString());
            printwriter1.println((new StringBuilder()).append("ofCustomFonts:").append(ofCustomFonts).toString());
            printwriter1.println((new StringBuilder()).append("ofCustomColors:").append(ofCustomColors).toString());
            printwriter1.println((new StringBuilder()).append("ofShowCapes:").append(ofShowCapes).toString());
            printwriter1.println((new StringBuilder()).append("ofFullscreenMode:").append(ofFullscreenMode).toString());
            printwriter1.close();
        }
        catch(Exception exception1)
        {
            System.out.println("Failed to save options");
            exception1.printStackTrace();
        }
    }

    public boolean func_40444_c()
    {
        return ofRenderDistanceFine > 64 && field_40445_l;
    }

}
