// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            TileEntitySign, TileEntitySignRenderer, TileEntityMobSpawner, TileEntityMobSpawnerRenderer, 
//            TileEntityPiston, TileEntityRendererPiston, TileEntityChest, TileEntityChestRenderer, 
//            TileEntityEnchantmentTable, RenderEnchantmentTable, TileEntityEndPortal, RenderEndPortal, 
//            TileEntitySpecialRenderer, TileEntity, EntityLiving, World, 
//            OpenGlHelper, FontRenderer, RenderEngine

public class TileEntityRenderer
{

    private Map field_6517_m;
    public static TileEntityRenderer field_1554_a = new TileEntityRenderer();
    private FontRenderer field_1541_n;
    public static double field_1553_b;
    public static double field_1552_c;
    public static double field_1551_d;
    public RenderEngine field_1550_e;
    public World field_1549_f;
    public EntityLiving field_22270_g;
    public float field_22269_h;
    public float field_22268_i;
    public double field_1545_j;
    public double field_1544_k;
    public double field_1543_l;

    private TileEntityRenderer()
    {
        field_6517_m = new HashMap();
        field_6517_m.put(net.minecraft.src.TileEntitySign.class, new TileEntitySignRenderer());
        field_6517_m.put(net.minecraft.src.TileEntityMobSpawner.class, new TileEntityMobSpawnerRenderer());
        field_6517_m.put(net.minecraft.src.TileEntityPiston.class, new TileEntityRendererPiston());
        field_6517_m.put(net.minecraft.src.TileEntityChest.class, new TileEntityChestRenderer());
        field_6517_m.put(net.minecraft.src.TileEntityEnchantmentTable.class, new RenderEnchantmentTable());
        field_6517_m.put(net.minecraft.src.TileEntityEndPortal.class, new RenderEndPortal());
        TileEntitySpecialRenderer tileentityspecialrenderer;
        for(Iterator iterator = field_6517_m.values().iterator(); iterator.hasNext(); tileentityspecialrenderer.func_928_a(this))
        {
            tileentityspecialrenderer = (TileEntitySpecialRenderer)iterator.next();
        }

    }

    public TileEntitySpecialRenderer func_4144_a(Class p_4144_1_)
    {
        TileEntitySpecialRenderer tileentityspecialrenderer = (TileEntitySpecialRenderer)field_6517_m.get(p_4144_1_);
        if(tileentityspecialrenderer == null && p_4144_1_ != (net.minecraft.src.TileEntity.class))
        {
            tileentityspecialrenderer = func_4144_a(p_4144_1_.getSuperclass());
            field_6517_m.put(p_4144_1_, tileentityspecialrenderer);
        }
        return tileentityspecialrenderer;
    }

    public boolean func_1028_a(TileEntity p_1028_1_)
    {
        return func_1031_b(p_1028_1_) != null;
    }

    public TileEntitySpecialRenderer func_1031_b(TileEntity p_1031_1_)
    {
        if(p_1031_1_ == null)
        {
            return null;
        } else
        {
            return func_4144_a(p_1031_1_.getClass());
        }
    }

    public void func_22267_a(World p_22267_1_, RenderEngine p_22267_2_, FontRenderer p_22267_3_, EntityLiving p_22267_4_, float p_22267_5_)
    {
        if(field_1549_f != p_22267_1_)
        {
            func_31072_a(p_22267_1_);
        }
        field_1550_e = p_22267_2_;
        field_22270_g = p_22267_4_;
        field_1541_n = p_22267_3_;
        field_22269_h = p_22267_4_.field_603_as + (p_22267_4_.field_605_aq - p_22267_4_.field_603_as) * p_22267_5_;
        field_22268_i = p_22267_4_.field_602_at + (p_22267_4_.field_604_ar - p_22267_4_.field_602_at) * p_22267_5_;
        field_1545_j = p_22267_4_.field_638_aI + (p_22267_4_.field_611_ak - p_22267_4_.field_638_aI) * (double)p_22267_5_;
        field_1544_k = p_22267_4_.field_637_aJ + (p_22267_4_.field_610_al - p_22267_4_.field_637_aJ) * (double)p_22267_5_;
        field_1543_l = p_22267_4_.field_636_aK + (p_22267_4_.field_609_am - p_22267_4_.field_636_aK) * (double)p_22267_5_;
    }

    public void func_40742_a()
    {
    }

    public void func_1030_a(TileEntity p_1030_1_, float p_1030_2_)
    {
        if(p_1030_1_.func_480_a(field_1545_j, field_1544_k, field_1543_l) < 4096D)
        {
            int i = field_1549_f.func_35451_b(p_1030_1_.field_823_f, p_1030_1_.field_822_g, p_1030_1_.field_821_h, 0);
            int j = i % 0x10000;
            int k = i / 0x10000;
            OpenGlHelper.func_40454_a(OpenGlHelper.field_40455_b, (float)j / 1.0F, (float)k / 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            func_1032_a(p_1030_1_, (double)p_1030_1_.field_823_f - field_1553_b, (double)p_1030_1_.field_822_g - field_1552_c, (double)p_1030_1_.field_821_h - field_1551_d, p_1030_2_);
        }
    }

    public void func_1032_a(TileEntity p_1032_1_, double p_1032_2_, double p_1032_4_, double p_1032_6_, 
            float p_1032_8_)
    {
        TileEntitySpecialRenderer tileentityspecialrenderer = func_1031_b(p_1032_1_);
        if(tileentityspecialrenderer != null)
        {
            tileentityspecialrenderer.func_930_a(p_1032_1_, p_1032_2_, p_1032_4_, p_1032_6_, p_1032_8_);
        }
    }

    public void func_31072_a(World p_31072_1_)
    {
        field_1549_f = p_31072_1_;
        Iterator iterator = field_6517_m.values().iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            TileEntitySpecialRenderer tileentityspecialrenderer = (TileEntitySpecialRenderer)iterator.next();
            if(tileentityspecialrenderer != null)
            {
                tileentityspecialrenderer.func_31069_a(p_31072_1_);
            }
        } while(true);
    }

    public FontRenderer func_6516_a()
    {
        return field_1541_n;
    }

}
