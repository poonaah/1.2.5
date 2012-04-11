// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, ModelBiped, EntityPlayer, InventoryPlayer, 
//            ItemStack, ItemArmor, ModelRenderer, EnumAction, 
//            EntityPlayerSP, RenderManager, Tessellator, FontRenderer, 
//            Item, Block, RenderBlocks, ItemRenderer, 
//            MathHelper, EntityLiving, Entity

public class RenderPlayer extends RenderLiving
{

    private ModelBiped field_209_f;
    private ModelBiped field_208_g;
    private ModelBiped field_207_h;
    private static final String field_206_i[] = {
        "cloth", "chain", "iron", "diamond", "gold"
    };

    public RenderPlayer()
    {
        super(new ModelBiped(0.0F), 0.5F);
        field_209_f = (ModelBiped)field_20920_e;
        field_208_g = new ModelBiped(1.0F);
        field_207_h = new ModelBiped(0.5F);
    }

    protected int func_187_a(EntityPlayer p_187_1_, int p_187_2_, float p_187_3_)
    {
        ItemStack itemstack = p_187_1_.field_778_b.func_492_d(3 - p_187_2_);
        if(itemstack != null)
        {
            Item item = itemstack.func_1091_a();
            if(item instanceof ItemArmor)
            {
                ItemArmor itemarmor = (ItemArmor)item;
                func_151_a((new StringBuilder()).append("/armor/").append(field_206_i[itemarmor.field_311_aZ]).append("_").append(p_187_2_ != 2 ? 1 : 2).append(".png").toString());
                ModelBiped modelbiped = p_187_2_ != 2 ? field_208_g : field_207_h;
                modelbiped.field_1286_a.field_1403_h = p_187_2_ == 0;
                modelbiped.field_1285_b.field_1403_h = p_187_2_ == 0;
                modelbiped.field_1284_c.field_1403_h = p_187_2_ == 1 || p_187_2_ == 2;
                modelbiped.field_1283_d.field_1403_h = p_187_2_ == 1;
                modelbiped.field_1282_e.field_1403_h = p_187_2_ == 1;
                modelbiped.field_1281_f.field_1403_h = p_187_2_ == 2 || p_187_2_ == 3;
                modelbiped.field_1280_g.field_1403_h = p_187_2_ == 2 || p_187_2_ == 3;
                func_4013_a(modelbiped);
                return !itemstack.func_40711_u() ? 1 : 15;
            }
        }
        return -1;
    }

    public void func_188_a(EntityPlayer p_188_1_, double p_188_2_, double p_188_4_, double p_188_6_, 
            float p_188_8_, float p_188_9_)
    {
        ItemStack itemstack = p_188_1_.field_778_b.func_494_a();
        field_208_g.field_1278_i = field_207_h.field_1278_i = field_209_f.field_1278_i = itemstack == null ? 0 : 1;
        if(itemstack != null && p_188_1_.func_35205_Y() > 0)
        {
            EnumAction enumaction = itemstack.func_35865_n();
            if(enumaction == EnumAction.block)
            {
                field_208_g.field_1278_i = field_207_h.field_1278_i = field_209_f.field_1278_i = 3;
            } else
            if(enumaction == EnumAction.bow)
            {
                field_208_g.field_40333_u = field_207_h.field_40333_u = field_209_f.field_40333_u = true;
            }
        }
        field_208_g.field_1277_j = field_207_h.field_1277_j = field_209_f.field_1277_j = p_188_1_.func_381_o();
        double d = p_188_4_ - (double)p_188_1_.field_9292_aO;
        if(p_188_1_.func_381_o() && !(p_188_1_ instanceof EntityPlayerSP))
        {
            d -= 0.125D;
        }
        super.func_171_a(p_188_1_, p_188_2_, d, p_188_6_, p_188_8_, p_188_9_);
        field_208_g.field_40333_u = field_207_h.field_40333_u = field_209_f.field_40333_u = false;
        field_208_g.field_1277_j = field_207_h.field_1277_j = field_209_f.field_1277_j = false;
        field_208_g.field_1278_i = field_207_h.field_1278_i = field_209_f.field_1278_i = 0;
    }

    protected void func_22015_a(EntityPlayer p_22015_1_, double p_22015_2_, double p_22015_4_, double p_22015_6_)
    {
        if(Minecraft.func_22006_t() && p_22015_1_ != field_191_a.field_22188_h)
        {
            float f = 1.6F;
            float f1 = 0.01666667F * f;
            float f2 = p_22015_1_.func_379_d(field_191_a.field_22188_h);
            float f3 = p_22015_1_.func_381_o() ? 32F : 64F;
            if(f2 < f3)
            {
                String s = p_22015_1_.field_771_i;
                if(!p_22015_1_.func_381_o())
                {
                    if(p_22015_1_.func_22051_K())
                    {
                        func_22013_a(p_22015_1_, s, p_22015_2_, p_22015_4_ - 1.5D, p_22015_6_, 64);
                    } else
                    {
                        func_22013_a(p_22015_1_, s, p_22015_2_, p_22015_4_, p_22015_6_, 64);
                    }
                } else
                {
                    FontRenderer fontrenderer = func_6329_a();
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float)p_22015_2_ + 0.0F, (float)p_22015_4_ + 2.3F, (float)p_22015_6_);
                    GL11.glNormal3f(0.0F, 1.0F, 0.0F);
                    GL11.glRotatef(-field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
                    GL11.glRotatef(field_191_a.field_1224_j, 1.0F, 0.0F, 0.0F);
                    GL11.glScalef(-f1, -f1, f1);
                    GL11.glDisable(2896);
                    GL11.glTranslatef(0.0F, 0.25F / f1, 0.0F);
                    GL11.glDepthMask(false);
                    GL11.glEnable(3042);
                    GL11.glBlendFunc(770, 771);
                    Tessellator tessellator = Tessellator.field_1512_a;
                    GL11.glDisable(3553);
                    tessellator.func_977_b();
                    int i = fontrenderer.func_871_a(s) / 2;
                    tessellator.func_986_a(0.0F, 0.0F, 0.0F, 0.25F);
                    tessellator.func_991_a(-i - 1, -1D, 0.0D);
                    tessellator.func_991_a(-i - 1, 8D, 0.0D);
                    tessellator.func_991_a(i + 1, 8D, 0.0D);
                    tessellator.func_991_a(i + 1, -1D, 0.0D);
                    tessellator.func_982_a();
                    GL11.glEnable(3553);
                    GL11.glDepthMask(true);
                    fontrenderer.func_873_b(s, -fontrenderer.func_871_a(s) / 2, 0, 0x20ffffff);
                    GL11.glEnable(2896);
                    GL11.glDisable(3042);
                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                    GL11.glPopMatrix();
                }
            }
        }
    }

    protected void func_4015_a(EntityPlayer p_4015_1_, float p_4015_2_)
    {
        super.func_6331_b(p_4015_1_, p_4015_2_);
        ItemStack itemstack = p_4015_1_.field_778_b.func_492_d(3);
        if(itemstack != null && itemstack.func_1091_a().field_291_aS < 256)
        {
            GL11.glPushMatrix();
            field_209_f.field_1286_a.func_926_b(0.0625F);
            if(RenderBlocks.func_1219_a(Block.field_345_n[itemstack.field_1617_c].func_210_f()))
            {
                float f = 0.625F;
                GL11.glTranslatef(0.0F, -0.25F, 0.0F);
                GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(f, -f, f);
            }
            field_191_a.field_4236_f.func_4132_a(p_4015_1_, itemstack, 0);
            GL11.glPopMatrix();
        }
        if(p_4015_1_.field_771_i.equals("deadmau5") && func_140_a(p_4015_1_.field_20047_bv, null))
        {
            for(int i = 0; i < 2; i++)
            {
                float f1 = (p_4015_1_.field_603_as + (p_4015_1_.field_605_aq - p_4015_1_.field_603_as) * p_4015_2_) - (p_4015_1_.field_734_o + (p_4015_1_.field_735_n - p_4015_1_.field_734_o) * p_4015_2_);
                float f2 = p_4015_1_.field_602_at + (p_4015_1_.field_604_ar - p_4015_1_.field_602_at) * p_4015_2_;
                GL11.glPushMatrix();
                GL11.glRotatef(f1, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(f2, 1.0F, 0.0F, 0.0F);
                GL11.glTranslatef(0.375F * (float)(i * 2 - 1), 0.0F, 0.0F);
                GL11.glTranslatef(0.0F, -0.375F, 0.0F);
                GL11.glRotatef(-f2, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(-f1, 0.0F, 1.0F, 0.0F);
                float f7 = 1.333333F;
                GL11.glScalef(f7, f7, f7);
                field_209_f.func_20095_a(0.0625F);
                GL11.glPopMatrix();
            }

        }
        if(func_140_a(p_4015_1_.field_20067_q, null))
        {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 0.0F, 0.125F);
            double d = (p_4015_1_.field_20066_r + (p_4015_1_.field_20063_u - p_4015_1_.field_20066_r) * (double)p_4015_2_) - (p_4015_1_.field_9285_at + (p_4015_1_.field_611_ak - p_4015_1_.field_9285_at) * (double)p_4015_2_);
            double d1 = (p_4015_1_.field_20065_s + (p_4015_1_.field_20062_v - p_4015_1_.field_20065_s) * (double)p_4015_2_) - (p_4015_1_.field_9284_au + (p_4015_1_.field_610_al - p_4015_1_.field_9284_au) * (double)p_4015_2_);
            double d2 = (p_4015_1_.field_20064_t + (p_4015_1_.field_20061_w - p_4015_1_.field_20064_t) * (double)p_4015_2_) - (p_4015_1_.field_9283_av + (p_4015_1_.field_609_am - p_4015_1_.field_9283_av) * (double)p_4015_2_);
            float f10 = p_4015_1_.field_734_o + (p_4015_1_.field_735_n - p_4015_1_.field_734_o) * p_4015_2_;
            double d3 = MathHelper.func_1106_a((f10 * 3.141593F) / 180F);
            double d4 = -MathHelper.func_1114_b((f10 * 3.141593F) / 180F);
            float f12 = (float)d1 * 10F;
            if(f12 < -6F)
            {
                f12 = -6F;
            }
            if(f12 > 32F)
            {
                f12 = 32F;
            }
            float f13 = (float)(d * d3 + d2 * d4) * 100F;
            float f14 = (float)(d * d4 - d2 * d3) * 100F;
            if(f13 < 0.0F)
            {
                f13 = 0.0F;
            }
            float f15 = p_4015_1_.field_775_e + (p_4015_1_.field_774_f - p_4015_1_.field_775_e) * p_4015_2_;
            f12 += MathHelper.func_1106_a((p_4015_1_.field_9291_aR + (p_4015_1_.field_9290_aS - p_4015_1_.field_9291_aR) * p_4015_2_) * 6F) * 32F * f15;
            if(p_4015_1_.func_381_o())
            {
                f12 += 25F;
            }
            GL11.glRotatef(6F + f13 / 2.0F + f12, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(f14 / 2.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-f14 / 2.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
            field_209_f.func_20096_b(0.0625F);
            GL11.glPopMatrix();
        }
        ItemStack itemstack1 = p_4015_1_.field_778_b.func_494_a();
        if(itemstack1 != null)
        {
            GL11.glPushMatrix();
            field_209_f.field_1283_d.func_926_b(0.0625F);
            GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
            if(p_4015_1_.field_4128_n != null)
            {
                itemstack1 = new ItemStack(Item.field_266_B);
            }
            EnumAction enumaction = null;
            if(p_4015_1_.func_35205_Y() > 0)
            {
                enumaction = itemstack1.func_35865_n();
            }
            if(itemstack1.field_1617_c < 256 && RenderBlocks.func_1219_a(Block.field_345_n[itemstack1.field_1617_c].func_210_f()))
            {
                float f3 = 0.5F;
                GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
                f3 *= 0.75F;
                GL11.glRotatef(20F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(f3, -f3, f3);
            } else
            if(itemstack1.field_1617_c == Item.field_227_i.field_291_aS)
            {
                float f4 = 0.625F;
                GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
                GL11.glRotatef(-20F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(f4, -f4, f4);
                GL11.glRotatef(-100F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            } else
            if(Item.field_233_c[itemstack1.field_1617_c].func_4017_a())
            {
                float f5 = 0.625F;
                if(Item.field_233_c[itemstack1.field_1617_c].func_4023_b())
                {
                    GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
                    GL11.glTranslatef(0.0F, -0.125F, 0.0F);
                }
                if(p_4015_1_.func_35205_Y() > 0 && enumaction == EnumAction.block)
                {
                    GL11.glTranslatef(0.05F, 0.0F, -0.1F);
                    GL11.glRotatef(-50F, 0.0F, 1.0F, 0.0F);
                    GL11.glRotatef(-10F, 1.0F, 0.0F, 0.0F);
                    GL11.glRotatef(-60F, 0.0F, 0.0F, 1.0F);
                }
                GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
                GL11.glScalef(f5, -f5, f5);
                GL11.glRotatef(-100F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            } else
            {
                float f6 = 0.375F;
                GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
                GL11.glScalef(f6, f6, f6);
                GL11.glRotatef(60F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-90F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(20F, 0.0F, 0.0F, 1.0F);
            }
            if(itemstack1.func_1091_a().func_46058_c())
            {
                for(int j = 0; j <= 1; j++)
                {
                    int k = itemstack1.func_1091_a().func_27010_f(itemstack1.func_21181_i(), j);
                    float f8 = (float)(k >> 16 & 0xff) / 255F;
                    float f9 = (float)(k >> 8 & 0xff) / 255F;
                    float f11 = (float)(k & 0xff) / 255F;
                    GL11.glColor4f(f8, f9, f11, 1.0F);
                    field_191_a.field_4236_f.func_4132_a(p_4015_1_, itemstack1, j);
                }

            } else
            {
                field_191_a.field_4236_f.func_4132_a(p_4015_1_, itemstack1, 0);
            }
            GL11.glPopMatrix();
        }
    }

    protected void func_186_b(EntityPlayer p_186_1_, float p_186_2_)
    {
        float f = 0.9375F;
        GL11.glScalef(f, f, f);
    }

    public void func_185_b()
    {
        field_209_f.field_1244_k = 0.0F;
        field_209_f.func_863_a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        field_209_f.field_1283_d.func_922_a(0.0625F);
    }

    protected void func_22016_b(EntityPlayer p_22016_1_, double p_22016_2_, double p_22016_4_, double p_22016_6_)
    {
        if(p_22016_1_.func_354_B() && p_22016_1_.func_22051_K())
        {
            super.func_22012_b(p_22016_1_, p_22016_2_ + (double)p_22016_1_.field_22063_x, p_22016_4_ + (double)p_22016_1_.field_22062_y, p_22016_6_ + (double)p_22016_1_.field_22061_z);
        } else
        {
            super.func_22012_b(p_22016_1_, p_22016_2_, p_22016_4_, p_22016_6_);
        }
    }

    protected void func_22017_a(EntityPlayer p_22017_1_, float p_22017_2_, float p_22017_3_, float p_22017_4_)
    {
        if(p_22017_1_.func_354_B() && p_22017_1_.func_22051_K())
        {
            GL11.glRotatef(p_22017_1_.func_22059_J(), 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(func_172_a(p_22017_1_), 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(270F, 0.0F, 1.0F, 0.0F);
        } else
        {
            super.func_21004_a(p_22017_1_, p_22017_2_, p_22017_3_, p_22017_4_);
        }
    }

    protected void func_22014_a(EntityLiving p_22014_1_, double p_22014_2_, double p_22014_4_, double p_22014_6_)
    {
        func_22015_a((EntityPlayer)p_22014_1_, p_22014_2_, p_22014_4_, p_22014_6_);
    }

    protected void func_6330_a(EntityLiving p_6330_1_, float p_6330_2_)
    {
        func_186_b((EntityPlayer)p_6330_1_, p_6330_2_);
    }

    protected int func_166_a(EntityLiving p_166_1_, int p_166_2_, float p_166_3_)
    {
        return func_187_a((EntityPlayer)p_166_1_, p_166_2_, p_166_3_);
    }

    protected void func_6331_b(EntityLiving p_6331_1_, float p_6331_2_)
    {
        func_4015_a((EntityPlayer)p_6331_1_, p_6331_2_);
    }

    protected void func_21004_a(EntityLiving p_21004_1_, float p_21004_2_, float p_21004_3_, float p_21004_4_)
    {
        func_22017_a((EntityPlayer)p_21004_1_, p_21004_2_, p_21004_3_, p_21004_4_);
    }

    protected void func_22012_b(EntityLiving p_22012_1_, double p_22012_2_, double p_22012_4_, double p_22012_6_)
    {
        func_22016_b((EntityPlayer)p_22012_1_, p_22012_2_, p_22012_4_, p_22012_6_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_188_a((EntityPlayer)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_188_a((EntityPlayer)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }

}
