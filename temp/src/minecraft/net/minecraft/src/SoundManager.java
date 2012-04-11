// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.File;
import java.io.PrintStream;
import java.util.Random;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.codecs.CodecWav;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

// Referenced classes of package net.minecraft.src:
//            SoundPool, GameSettings, CodecMus, SoundPoolEntry, 
//            EntityLiving, MathHelper

public class SoundManager
{

    private static SoundSystem field_591_a;
    private SoundPool field_590_b;
    private SoundPool field_589_c;
    private SoundPool field_588_d;
    private int field_587_e;
    private GameSettings field_586_f;
    private static boolean field_585_g = false;
    private Random field_584_h;
    private int field_583_i;

    public SoundManager()
    {
        field_590_b = new SoundPool();
        field_589_c = new SoundPool();
        field_588_d = new SoundPool();
        field_587_e = 0;
        field_584_h = new Random();
        field_583_i = field_584_h.nextInt(12000);
    }

    public void func_340_a(GameSettings p_340_1_)
    {
        field_589_c.field_1657_b = false;
        field_586_f = p_340_1_;
        if(!field_585_g && (p_340_1_ == null || p_340_1_.field_1583_b != 0.0F || p_340_1_.field_1584_a != 0.0F))
        {
            func_339_d();
        }
    }

    private void func_339_d()
    {
        try
        {
            float f = field_586_f.field_1583_b;
            float f1 = field_586_f.field_1584_a;
            field_586_f.field_1583_b = 0.0F;
            field_586_f.field_1584_a = 0.0F;
            field_586_f.func_1041_b();
            SoundSystemConfig.addLibrary(paulscode.sound.libraries.LibraryLWJGLOpenAL.class);
            SoundSystemConfig.setCodec("ogg", paulscode.sound.codecs.CodecJOrbis.class);
            SoundSystemConfig.setCodec("mus", net.minecraft.src.CodecMus.class);
            SoundSystemConfig.setCodec("wav", paulscode.sound.codecs.CodecWav.class);
            field_591_a = new SoundSystem();
            field_586_f.field_1583_b = f;
            field_586_f.field_1584_a = f1;
            field_586_f.func_1041_b();
        }
        catch(Throwable throwable)
        {
            throwable.printStackTrace();
            System.err.println("error linking with the LibraryJavaSound plug-in");
        }
        field_585_g = true;
    }

    public void func_335_a()
    {
        if(!field_585_g && (field_586_f.field_1583_b != 0.0F || field_586_f.field_1584_a != 0.0F))
        {
            func_339_d();
        }
        if(field_585_g)
        {
            if(field_586_f.field_1584_a == 0.0F)
            {
                field_591_a.stop("BgMusic");
            } else
            {
                field_591_a.setVolume("BgMusic", field_586_f.field_1584_a);
            }
        }
    }

    public void func_330_b()
    {
        if(field_585_g)
        {
            field_591_a.cleanup();
        }
    }

    public void func_6372_a(String p_6372_1_, File p_6372_2_)
    {
        field_590_b.func_1117_a(p_6372_1_, p_6372_2_);
    }

    public void func_6373_b(String p_6373_1_, File p_6373_2_)
    {
        field_589_c.func_1117_a(p_6373_1_, p_6373_2_);
    }

    public void func_6374_c(String p_6374_1_, File p_6374_2_)
    {
        field_588_d.func_1117_a(p_6374_1_, p_6374_2_);
    }

    public void func_4033_c()
    {
        if(!field_585_g || field_586_f.field_1584_a == 0.0F)
        {
            return;
        }
        if(!field_591_a.playing("BgMusic") && !field_591_a.playing("streaming"))
        {
            if(field_583_i > 0)
            {
                field_583_i--;
                return;
            }
            SoundPoolEntry soundpoolentry = field_588_d.func_1116_a();
            if(soundpoolentry != null)
            {
                field_583_i = field_584_h.nextInt(12000) + 12000;
                field_591_a.backgroundMusic("BgMusic", soundpoolentry.field_1780_b, soundpoolentry.field_1781_a, false);
                field_591_a.setVolume("BgMusic", field_586_f.field_1584_a);
                field_591_a.play("BgMusic");
            }
        }
    }

    public void func_338_a(EntityLiving p_338_1_, float p_338_2_)
    {
        if(!field_585_g || field_586_f.field_1583_b == 0.0F)
        {
            return;
        }
        if(p_338_1_ == null)
        {
            return;
        } else
        {
            float f = p_338_1_.field_603_as + (p_338_1_.field_605_aq - p_338_1_.field_603_as) * p_338_2_;
            double d = p_338_1_.field_9285_at + (p_338_1_.field_611_ak - p_338_1_.field_9285_at) * (double)p_338_2_;
            double d1 = p_338_1_.field_9284_au + (p_338_1_.field_610_al - p_338_1_.field_9284_au) * (double)p_338_2_;
            double d2 = p_338_1_.field_9283_av + (p_338_1_.field_609_am - p_338_1_.field_9283_av) * (double)p_338_2_;
            float f1 = MathHelper.func_1114_b(-f * 0.01745329F - 3.141593F);
            float f2 = MathHelper.func_1106_a(-f * 0.01745329F - 3.141593F);
            float f3 = -f2;
            float f4 = 0.0F;
            float f5 = -f1;
            float f6 = 0.0F;
            float f7 = 1.0F;
            float f8 = 0.0F;
            field_591_a.setListenerPosition((float)d, (float)d1, (float)d2);
            field_591_a.setListenerOrientation(f3, f4, f5, f6, f7, f8);
            return;
        }
    }

    public void func_331_a(String p_331_1_, float p_331_2_, float p_331_3_, float p_331_4_, float p_331_5_, float p_331_6_)
    {
        if(!field_585_g || field_586_f.field_1583_b == 0.0F && p_331_1_ != null)
        {
            return;
        }
        String s = "streaming";
        if(field_591_a.playing("streaming"))
        {
            field_591_a.stop("streaming");
        }
        if(p_331_1_ == null)
        {
            return;
        }
        SoundPoolEntry soundpoolentry = field_589_c.func_1118_a(p_331_1_);
        if(soundpoolentry != null && p_331_5_ > 0.0F)
        {
            if(field_591_a.playing("BgMusic"))
            {
                field_591_a.stop("BgMusic");
            }
            float f = 16F;
            field_591_a.newStreamingSource(true, s, soundpoolentry.field_1780_b, soundpoolentry.field_1781_a, false, p_331_2_, p_331_3_, p_331_4_, 2, f * 4F);
            field_591_a.setVolume(s, 0.5F * field_586_f.field_1583_b);
            field_591_a.play(s);
        }
    }

    public void func_336_b(String p_336_1_, float p_336_2_, float p_336_3_, float p_336_4_, float p_336_5_, float p_336_6_)
    {
        if(!field_585_g || field_586_f.field_1583_b == 0.0F)
        {
            return;
        }
        SoundPoolEntry soundpoolentry = field_590_b.func_1118_a(p_336_1_);
        if(soundpoolentry != null && p_336_5_ > 0.0F)
        {
            field_587_e = (field_587_e + 1) % 256;
            String s = (new StringBuilder()).append("sound_").append(field_587_e).toString();
            float f = 16F;
            if(p_336_5_ > 1.0F)
            {
                f *= p_336_5_;
            }
            field_591_a.newSource(p_336_5_ > 1.0F, s, soundpoolentry.field_1780_b, soundpoolentry.field_1781_a, false, p_336_2_, p_336_3_, p_336_4_, 2, f);
            field_591_a.setPitch(s, p_336_6_);
            if(p_336_5_ > 1.0F)
            {
                p_336_5_ = 1.0F;
            }
            field_591_a.setVolume(s, p_336_5_ * field_586_f.field_1583_b);
            field_591_a.play(s);
        }
    }

    public void func_337_a(String p_337_1_, float p_337_2_, float p_337_3_)
    {
        if(!field_585_g || field_586_f.field_1583_b == 0.0F)
        {
            return;
        }
        SoundPoolEntry soundpoolentry = field_590_b.func_1118_a(p_337_1_);
        if(soundpoolentry != null)
        {
            field_587_e = (field_587_e + 1) % 256;
            String s = (new StringBuilder()).append("sound_").append(field_587_e).toString();
            field_591_a.newSource(false, s, soundpoolentry.field_1780_b, soundpoolentry.field_1781_a, false, 0.0F, 0.0F, 0.0F, 0, 0.0F);
            if(p_337_2_ > 1.0F)
            {
                p_337_2_ = 1.0F;
            }
            p_337_2_ *= 0.25F;
            field_591_a.setPitch(s, p_337_3_);
            field_591_a.setVolume(s, p_337_2_ * field_586_f.field_1583_b);
            field_591_a.play(s);
        }
    }

}
