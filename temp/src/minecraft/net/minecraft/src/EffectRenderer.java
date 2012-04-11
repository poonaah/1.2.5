// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            EntityFX, ActiveRenderInfo, Entity, RenderEngine, 
//            Tessellator, MathHelper, Block, EntityDiggingFX, 
//            World

public class EffectRenderer
{

    protected World field_1729_a;
    private List field_1728_b[];
    private RenderEngine field_1731_c;
    private Random field_1730_d;

    public EffectRenderer(World p_i275_1_, RenderEngine p_i275_2_)
    {
        field_1728_b = new List[4];
        field_1730_d = new Random();
        if(p_i275_1_ != null)
        {
            field_1729_a = p_i275_1_;
        }
        field_1731_c = p_i275_2_;
        for(int i = 0; i < 4; i++)
        {
            field_1728_b[i] = new ArrayList();
        }

    }

    public void func_1192_a(EntityFX p_1192_1_)
    {
        int i = p_1192_1_.func_404_c();
        if(field_1728_b[i].size() >= 4000)
        {
            field_1728_b[i].remove(0);
        }
        field_1728_b[i].add(p_1192_1_);
    }

    public void func_1193_a()
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < field_1728_b[i].size(); j++)
            {
                EntityFX entityfx = (EntityFX)field_1728_b[i].get(j);
                entityfx.func_370_e_();
                if(entityfx.field_646_aA)
                {
                    field_1728_b[i].remove(j--);
                }
            }

        }

    }

    public void func_1189_a(Entity p_1189_1_, float p_1189_2_)
    {
        float f = ActiveRenderInfo.field_41070_d;
        float f1 = ActiveRenderInfo.field_41068_f;
        float f2 = ActiveRenderInfo.field_41069_g;
        float f3 = ActiveRenderInfo.field_41078_h;
        float f4 = ActiveRenderInfo.field_41071_e;
        EntityFX.field_660_l = p_1189_1_.field_638_aI + (p_1189_1_.field_611_ak - p_1189_1_.field_638_aI) * (double)p_1189_2_;
        EntityFX.field_659_m = p_1189_1_.field_637_aJ + (p_1189_1_.field_610_al - p_1189_1_.field_637_aJ) * (double)p_1189_2_;
        EntityFX.field_658_n = p_1189_1_.field_636_aK + (p_1189_1_.field_609_am - p_1189_1_.field_636_aK) * (double)p_1189_2_;
        for(int i = 0; i < 3; i++)
        {
            if(field_1728_b[i].size() == 0)
            {
                continue;
            }
            int j = 0;
            if(i == 0)
            {
                j = field_1731_c.func_1070_a("/particles.png");
            }
            if(i == 1)
            {
                j = field_1731_c.func_1070_a("/terrain.png");
            }
            if(i == 2)
            {
                j = field_1731_c.func_1070_a("/gui/items.png");
            }
            GL11.glBindTexture(3553, j);
            Tessellator tessellator = Tessellator.field_1512_a;
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            tessellator.func_977_b();
            for(int k = 0; k < field_1728_b[i].size(); k++)
            {
                EntityFX entityfx = (EntityFX)field_1728_b[i].get(k);
                tessellator.func_35835_b(entityfx.func_35115_a(p_1189_2_));
                entityfx.func_406_a(tessellator, p_1189_2_, f, f4, f1, f2, f3);
            }

            tessellator.func_982_a();
        }

    }

    public void func_1187_b(Entity p_1187_1_, float p_1187_2_)
    {
        float f = MathHelper.func_1114_b(p_1187_1_.field_605_aq * 0.01745329F);
        float f1 = MathHelper.func_1106_a(p_1187_1_.field_605_aq * 0.01745329F);
        float f2 = -f1 * MathHelper.func_1106_a(p_1187_1_.field_604_ar * 0.01745329F);
        float f3 = f * MathHelper.func_1106_a(p_1187_1_.field_604_ar * 0.01745329F);
        float f4 = MathHelper.func_1114_b(p_1187_1_.field_604_ar * 0.01745329F);
        byte byte0 = 3;
        if(field_1728_b[byte0].size() == 0)
        {
            return;
        }
        Tessellator tessellator = Tessellator.field_1512_a;
        for(int i = 0; i < field_1728_b[byte0].size(); i++)
        {
            EntityFX entityfx = (EntityFX)field_1728_b[byte0].get(i);
            tessellator.func_35835_b(entityfx.func_35115_a(p_1187_2_));
            entityfx.func_406_a(tessellator, p_1187_2_, f, f4, f1, f2, f3);
        }

    }

    public void func_1188_a(World p_1188_1_)
    {
        field_1729_a = p_1188_1_;
        for(int i = 0; i < 4; i++)
        {
            field_1728_b[i].clear();
        }

    }

    public void func_1186_a(int p_1186_1_, int p_1186_2_, int p_1186_3_, int p_1186_4_, int p_1186_5_)
    {
        if(p_1186_4_ == 0)
        {
            return;
        }
        Block block = Block.field_345_n[p_1186_4_];
        int i = 4;
        for(int j = 0; j < i; j++)
        {
            for(int k = 0; k < i; k++)
            {
                for(int l = 0; l < i; l++)
                {
                    double d = (double)p_1186_1_ + ((double)j + 0.5D) / (double)i;
                    double d1 = (double)p_1186_2_ + ((double)k + 0.5D) / (double)i;
                    double d2 = (double)p_1186_3_ + ((double)l + 0.5D) / (double)i;
                    int i1 = field_1730_d.nextInt(6);
                    func_1192_a((new EntityDiggingFX(field_1729_a, d, d1, d2, d - (double)p_1186_1_ - 0.5D, d1 - (double)p_1186_2_ - 0.5D, d2 - (double)p_1186_3_ - 0.5D, block, i1, p_1186_5_)).func_4041_a(p_1186_1_, p_1186_2_, p_1186_3_));
                }

            }

        }

    }

    public void func_1191_a(int p_1191_1_, int p_1191_2_, int p_1191_3_, int p_1191_4_)
    {
        int i = field_1729_a.func_600_a(p_1191_1_, p_1191_2_, p_1191_3_);
        if(i == 0)
        {
            return;
        }
        Block block = Block.field_345_n[i];
        float f = 0.1F;
        double d = (double)p_1191_1_ + field_1730_d.nextDouble() * (block.field_364_bi - block.field_370_bf - (double)(f * 2.0F)) + (double)f + block.field_370_bf;
        double d1 = (double)p_1191_2_ + field_1730_d.nextDouble() * (block.field_362_bj - block.field_368_bg - (double)(f * 2.0F)) + (double)f + block.field_368_bg;
        double d2 = (double)p_1191_3_ + field_1730_d.nextDouble() * (block.field_360_bk - block.field_366_bh - (double)(f * 2.0F)) + (double)f + block.field_366_bh;
        if(p_1191_4_ == 0)
        {
            d1 = ((double)p_1191_2_ + block.field_368_bg) - (double)f;
        }
        if(p_1191_4_ == 1)
        {
            d1 = (double)p_1191_2_ + block.field_362_bj + (double)f;
        }
        if(p_1191_4_ == 2)
        {
            d2 = ((double)p_1191_3_ + block.field_366_bh) - (double)f;
        }
        if(p_1191_4_ == 3)
        {
            d2 = (double)p_1191_3_ + block.field_360_bk + (double)f;
        }
        if(p_1191_4_ == 4)
        {
            d = ((double)p_1191_1_ + block.field_370_bf) - (double)f;
        }
        if(p_1191_4_ == 5)
        {
            d = (double)p_1191_1_ + block.field_364_bi + (double)f;
        }
        func_1192_a((new EntityDiggingFX(field_1729_a, d, d1, d2, 0.0D, 0.0D, 0.0D, block, p_1191_4_, field_1729_a.func_602_e(p_1191_1_, p_1191_2_, p_1191_3_))).func_4041_a(p_1191_1_, p_1191_2_, p_1191_3_).func_407_b(0.2F).func_405_d(0.6F));
    }

    public String func_1190_b()
    {
        return (new StringBuilder()).append("").append(field_1728_b[0].size() + field_1728_b[1].size() + field_1728_b[2].size()).toString();
    }
}
