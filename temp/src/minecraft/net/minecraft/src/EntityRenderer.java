// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.nio.FloatBuffer;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;

// Referenced classes of package net.minecraft.src:
//            MouseFilter, GLAllocation, ItemRenderer, RenderEngine, 
//            GameSettings, EntityLiving, MathHelper, World, 
//            PlayerController, MovingObjectPosition, Vec3D, AxisAlignedBB, 
//            Entity, EntityPlayerSP, EntityPlayer, KeyBinding, 
//            ActiveRenderInfo, Block, Material, RenderGlobal, 
//            Config, Potion, OpenGlHelper, WorldProvider, 
//            Profiler, RandomMobs, TexturePackList, TexturePackBase, 
//            RenderBlocks, BlockLeaves, ItemRendererHD, RenderManager, 
//            WorldInfo, MouseHelper, ScaledResolution, GuiIngame, 
//            GuiScreen, GuiParticle, ChunkProviderLoadOrGenerate, ClippingHelperImpl, 
//            Frustrum, RenderHelper, Reflector, EffectRenderer, 
//            InventoryPlayer, BiomeGenBase, EntitySmokeFX, EntityRainFX, 
//            CustomColorizer, Tessellator, WorldChunkManager, PotionEffect, 
//            PlayerCapabilities

public class EntityRenderer
{

    public static boolean field_28135_a = false;
    public static int field_28134_b;
    private Minecraft field_1388_h;
    private float field_1387_i;
    public ItemRenderer field_1395_a;
    private int field_1386_j;
    private Entity field_1385_k;
    private MouseFilter field_22235_l;
    private MouseFilter field_22234_m;
    private MouseFilter field_22233_n;
    private MouseFilter field_22232_o;
    private MouseFilter field_22231_p;
    private MouseFilter field_22229_q;
    private float field_22228_r;
    private float field_22227_s;
    private float field_22226_t;
    private float field_22225_u;
    private float field_22224_v;
    private float field_22223_w;
    private float field_40682_H;
    private float field_40683_I;
    private float field_40684_J;
    private float field_40685_K;
    private float field_40681_L;
    private float field_22222_x;
    private float field_22221_y;
    private float field_22220_z;
    private float field_22230_A;
    public int field_35818_d;
    private int field_35811_L[];
    private float field_35812_M;
    private float field_35813_N;
    private float field_35814_O;
    private boolean field_27288_B;
    private double field_21155_l;
    private double field_21154_m;
    private double field_21153_n;
    private long field_1384_l;
    private long field_28133_I;
    private boolean field_35815_V;
    float field_35819_e;
    float field_35816_f;
    float field_35817_g;
    float field_35821_h;
    private Random field_1383_m;
    private int field_27287_H;
    float field_35822_i[];
    float field_35820_j[];
    volatile int field_1394_b;
    volatile int field_1393_c;
    FloatBuffer field_1392_d;
    float field_4270_e;
    float field_4269_f;
    float field_4268_g;
    private float field_1382_n;
    private float field_1381_o;
    public int field_35823_q;
    private World updatedWorld;
    private boolean showDebugInfo;
    private boolean zoomMode;
    private boolean fullscreenModeChecked;
    private boolean desktopModeChecked;
    private String lastTexturePack;

    public EntityRenderer(Minecraft p_i436_1_)
    {
        updatedWorld = null;
        showDebugInfo = false;
        zoomMode = false;
        fullscreenModeChecked = false;
        desktopModeChecked = false;
        lastTexturePack = null;
        field_1387_i = 0.0F;
        field_1385_k = null;
        field_22235_l = new MouseFilter();
        field_22234_m = new MouseFilter();
        field_22233_n = new MouseFilter();
        field_22232_o = new MouseFilter();
        field_22231_p = new MouseFilter();
        field_22229_q = new MouseFilter();
        field_22228_r = 4F;
        field_22227_s = 4F;
        field_22226_t = 0.0F;
        field_22225_u = 0.0F;
        field_22224_v = 0.0F;
        field_22223_w = 0.0F;
        field_22222_x = 0.0F;
        field_22221_y = 0.0F;
        field_22220_z = 0.0F;
        field_22230_A = 0.0F;
        field_27288_B = false;
        field_21155_l = 1.0D;
        field_21154_m = 0.0D;
        field_21153_n = 0.0D;
        field_1384_l = System.currentTimeMillis();
        field_28133_I = 0L;
        field_35815_V = false;
        field_35819_e = 0.0F;
        field_35816_f = 0.0F;
        field_35817_g = 0.0F;
        field_35821_h = 0.0F;
        field_1383_m = new Random();
        field_27287_H = 0;
        field_1394_b = 0;
        field_1393_c = 0;
        field_1392_d = GLAllocation.func_1123_d(16);
        field_1388_h = p_i436_1_;
        field_1395_a = new ItemRenderer(p_i436_1_);
        field_35818_d = p_i436_1_.field_6315_n.func_1074_a(new BufferedImage(16, 16, 1));
        field_35811_L = new int[256];
    }

    public void func_911_a()
    {
        func_35809_c();
        func_35807_d();
        field_1382_n = field_1381_o;
        field_22227_s = field_22228_r;
        field_22225_u = field_22226_t;
        field_22223_w = field_22224_v;
        field_22221_y = field_22222_x;
        field_22230_A = field_22220_z;
        if(field_1388_h.field_6304_y.field_22274_D)
        {
            float f = field_1388_h.field_6304_y.field_1582_c * 0.6F + 0.2F;
            float f2 = f * f * f * 8F;
            field_40684_J = field_22235_l.func_22386_a(field_40682_H, 0.05F * f2);
            field_40685_K = field_22234_m.func_22386_a(field_40683_I, 0.05F * f2);
            field_40681_L = 0.0F;
            field_40682_H = 0.0F;
            field_40683_I = 0.0F;
        }
        if(field_1388_h.field_22009_h == null)
        {
            field_1388_h.field_22009_h = field_1388_h.field_6322_g;
        }
        float f1 = field_1388_h.field_6324_e.func_598_c(MathHelper.func_1108_b(field_1388_h.field_22009_h.field_611_ak), MathHelper.func_1108_b(field_1388_h.field_22009_h.field_610_al), MathHelper.func_1108_b(field_1388_h.field_22009_h.field_609_am));
        float f3 = (float)(3 - field_1388_h.field_6304_y.field_1580_e) / 3F;
        float f4 = f1 * (1.0F - f3) + f3;
        field_1381_o += (f4 - field_1381_o) * 0.1F;
        field_1386_j++;
        field_1395_a.func_895_a();
        func_916_c();
    }

    public void func_910_a(float p_910_1_)
    {
        if(field_1388_h.field_22009_h == null)
        {
            return;
        }
        if(field_1388_h.field_6324_e == null)
        {
            return;
        }
        double d = field_1388_h.field_6327_b.func_727_b();
        field_1388_h.field_6305_x = field_1388_h.field_22009_h.func_416_a(d, p_910_1_);
        double d1 = d;
        Vec3D vec3d = field_1388_h.field_22009_h.func_427_e(p_910_1_);
        if(field_1388_h.field_6327_b.func_35636_i())
        {
            d1 = d = 6D;
        } else
        {
            if(d1 > 3D)
            {
                d1 = 3D;
            }
            d = d1;
        }
        if(field_1388_h.field_6305_x != null)
        {
            d1 = field_1388_h.field_6305_x.field_1169_f.func_1251_c(vec3d);
        }
        Vec3D vec3d1 = field_1388_h.field_22009_h.func_430_f(p_910_1_);
        Vec3D vec3d2 = vec3d.func_1257_c(vec3d1.field_1776_a * d, vec3d1.field_1775_b * d, vec3d1.field_1779_c * d);
        field_1385_k = null;
        float f = 1.0F;
        java.util.List list = field_1388_h.field_6324_e.func_659_b(field_1388_h.field_22009_h, field_1388_h.field_22009_h.field_601_au.func_1170_a(vec3d1.field_1776_a * d, vec3d1.field_1775_b * d, vec3d1.field_1779_c * d).func_1177_b(f, f, f));
        double d2 = d1;
        for(int i = 0; i < list.size(); i++)
        {
            Entity entity = (Entity)list.get(i);
            if(!entity.func_401_c_())
            {
                continue;
            }
            float f1 = entity.func_4035_j_();
            AxisAlignedBB axisalignedbb = entity.field_601_au.func_1177_b(f1, f1, f1);
            MovingObjectPosition movingobjectposition = axisalignedbb.func_1169_a(vec3d, vec3d2);
            if(axisalignedbb.func_4150_a(vec3d))
            {
                if(0.0D < d2 || d2 == 0.0D)
                {
                    field_1385_k = entity;
                    d2 = 0.0D;
                }
                continue;
            }
            if(movingobjectposition == null)
            {
                continue;
            }
            double d3 = vec3d.func_1251_c(movingobjectposition.field_1169_f);
            if(d3 < d2 || d2 == 0.0D)
            {
                field_1385_k = entity;
                d2 = d3;
            }
        }

        if(field_1385_k != null && (d2 < d1 || field_1388_h.field_6305_x == null))
        {
            field_1388_h.field_6305_x = new MovingObjectPosition(field_1385_k);
        }
    }

    private void func_35809_c()
    {
        EntityPlayerSP entityplayersp = (EntityPlayerSP)field_1388_h.field_22009_h;
        field_35814_O = entityplayersp.func_35220_u_();
        field_35813_N = field_35812_M;
        field_35812_M += (field_35814_O - field_35812_M) * 0.5F;
    }

    private float func_914_d(float p_914_1_, boolean p_914_2_)
    {
        if(field_35823_q > 0)
        {
            return 90F;
        }
        EntityPlayer entityplayer = (EntityPlayer)field_1388_h.field_22009_h;
        float f = 70F;
        if(p_914_2_)
        {
            f += field_1388_h.field_6304_y.field_35379_L * 40F;
            f *= field_35813_N + (field_35812_M - field_35813_N) * p_914_1_;
        }
        boolean flag = false;
        if(field_1388_h.field_6304_y.ofKeyBindZoom.field_1370_b < 0)
        {
            flag = Mouse.isButtonDown(field_1388_h.field_6304_y.ofKeyBindZoom.field_1370_b + 100);
        } else
        {
            flag = Keyboard.isKeyDown(field_1388_h.field_6304_y.ofKeyBindZoom.field_1370_b);
        }
        if(flag)
        {
            if(!zoomMode)
            {
                zoomMode = true;
                field_1388_h.field_6304_y.field_22274_D = true;
            }
            if(zoomMode)
            {
                f /= 4F;
            }
        } else
        if(zoomMode)
        {
            zoomMode = false;
            field_1388_h.field_6304_y.field_22274_D = false;
            field_22235_l = new MouseFilter();
            field_22234_m = new MouseFilter();
        }
        if(entityplayer.func_40114_aH() <= 0)
        {
            float f1 = (float)entityplayer.field_712_J + p_914_1_;
            f /= (1.0F - 500F / (f1 + 500F)) * 2.0F + 1.0F;
        }
        int i = ActiveRenderInfo.func_41066_a(field_1388_h.field_6324_e, entityplayer, p_914_1_);
        if(i != 0 && Block.field_345_n[i].field_356_bn == Material.field_1332_f)
        {
            f = (f * 60F) / 70F;
        }
        return f + field_22221_y + (field_22222_x - field_22221_y) * p_914_1_;
    }

    private void func_920_e(float p_920_1_)
    {
        EntityLiving entityliving = field_1388_h.field_22009_h;
        float f = (float)entityliving.field_715_G - p_920_1_;
        if(entityliving.func_40114_aH() <= 0)
        {
            float f1 = (float)entityliving.field_712_J + p_920_1_;
            GL11.glRotatef(40F - 8000F / (f1 + 200F), 0.0F, 0.0F, 1.0F);
        }
        if(f < 0.0F)
        {
            return;
        } else
        {
            f /= entityliving.field_9332_M;
            f = MathHelper.func_1106_a(f * f * f * f * 3.141593F);
            float f2 = entityliving.field_9331_N;
            GL11.glRotatef(-f2, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-f * 14F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
            return;
        }
    }

    private void func_917_f(float p_917_1_)
    {
        if(!(field_1388_h.field_22009_h instanceof EntityPlayer))
        {
            return;
        } else
        {
            EntityPlayer entityplayer = (EntityPlayer)field_1388_h.field_22009_h;
            float f = entityplayer.field_9290_aS - entityplayer.field_9291_aR;
            float f1 = -(entityplayer.field_9290_aS + f * p_917_1_);
            float f2 = entityplayer.field_775_e + (entityplayer.field_774_f - entityplayer.field_775_e) * p_917_1_;
            float f3 = entityplayer.field_9329_Q + (entityplayer.field_9328_R - entityplayer.field_9329_Q) * p_917_1_;
            GL11.glTranslatef(MathHelper.func_1106_a(f1 * 3.141593F) * f2 * 0.5F, -Math.abs(MathHelper.func_1114_b(f1 * 3.141593F) * f2), 0.0F);
            GL11.glRotatef(MathHelper.func_1106_a(f1 * 3.141593F) * f2 * 3F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(Math.abs(MathHelper.func_1114_b(f1 * 3.141593F - 0.2F) * f2) * 5F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(f3, 1.0F, 0.0F, 0.0F);
            return;
        }
    }

    private void func_4138_g(float p_4138_1_)
    {
        EntityLiving entityliving = field_1388_h.field_22009_h;
        float f = entityliving.field_9292_aO - 1.62F;
        double d = entityliving.field_9285_at + (entityliving.field_611_ak - entityliving.field_9285_at) * (double)p_4138_1_;
        double d1 = (entityliving.field_9284_au + (entityliving.field_610_al - entityliving.field_9284_au) * (double)p_4138_1_) - (double)f;
        double d2 = entityliving.field_9283_av + (entityliving.field_609_am - entityliving.field_9283_av) * (double)p_4138_1_;
        GL11.glRotatef(field_22230_A + (field_22220_z - field_22230_A) * p_4138_1_, 0.0F, 0.0F, 1.0F);
        if(entityliving.func_22051_K())
        {
            f = (float)((double)f + 1.0D);
            GL11.glTranslatef(0.0F, 0.3F, 0.0F);
            if(!field_1388_h.field_6304_y.field_22273_E)
            {
                int i = field_1388_h.field_6324_e.func_600_a(MathHelper.func_1108_b(entityliving.field_611_ak), MathHelper.func_1108_b(entityliving.field_610_al), MathHelper.func_1108_b(entityliving.field_609_am));
                if(i == Block.field_9262_S.field_376_bc)
                {
                    int j = field_1388_h.field_6324_e.func_602_e(MathHelper.func_1108_b(entityliving.field_611_ak), MathHelper.func_1108_b(entityliving.field_610_al), MathHelper.func_1108_b(entityliving.field_609_am));
                    int k = j & 3;
                    GL11.glRotatef(k * 90, 0.0F, 1.0F, 0.0F);
                }
                GL11.glRotatef(entityliving.field_603_as + (entityliving.field_605_aq - entityliving.field_603_as) * p_4138_1_ + 180F, 0.0F, -1F, 0.0F);
                GL11.glRotatef(entityliving.field_602_at + (entityliving.field_604_ar - entityliving.field_602_at) * p_4138_1_, -1F, 0.0F, 0.0F);
            }
        } else
        if(field_1388_h.field_6304_y.field_1560_x > 0)
        {
            double d3 = field_22227_s + (field_22228_r - field_22227_s) * p_4138_1_;
            if(field_1388_h.field_6304_y.field_22273_E)
            {
                float f1 = field_22225_u + (field_22226_t - field_22225_u) * p_4138_1_;
                float f3 = field_22223_w + (field_22224_v - field_22223_w) * p_4138_1_;
                GL11.glTranslatef(0.0F, 0.0F, (float)(-d3));
                GL11.glRotatef(f3, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(f1, 0.0F, 1.0F, 0.0F);
            } else
            {
                float f2 = entityliving.field_605_aq;
                float f4 = entityliving.field_604_ar;
                if(field_1388_h.field_6304_y.field_1560_x == 2)
                {
                    f4 += 180F;
                }
                double d4 = (double)(-MathHelper.func_1106_a((f2 / 180F) * 3.141593F) * MathHelper.func_1114_b((f4 / 180F) * 3.141593F)) * d3;
                double d5 = (double)(MathHelper.func_1114_b((f2 / 180F) * 3.141593F) * MathHelper.func_1114_b((f4 / 180F) * 3.141593F)) * d3;
                double d6 = (double)(-MathHelper.func_1106_a((f4 / 180F) * 3.141593F)) * d3;
                for(int l = 0; l < 8; l++)
                {
                    float f5 = (l & 1) * 2 - 1;
                    float f6 = (l >> 1 & 1) * 2 - 1;
                    float f7 = (l >> 2 & 1) * 2 - 1;
                    f5 *= 0.1F;
                    f6 *= 0.1F;
                    f7 *= 0.1F;
                    MovingObjectPosition movingobjectposition = field_1388_h.field_6324_e.func_645_a(Vec3D.func_1248_b(d + (double)f5, d1 + (double)f6, d2 + (double)f7), Vec3D.func_1248_b((d - d4) + (double)f5 + (double)f7, (d1 - d6) + (double)f6, (d2 - d5) + (double)f7));
                    if(movingobjectposition == null)
                    {
                        continue;
                    }
                    double d7 = movingobjectposition.field_1169_f.func_1251_c(Vec3D.func_1248_b(d, d1, d2));
                    if(d7 < d3)
                    {
                        d3 = d7;
                    }
                }

                if(field_1388_h.field_6304_y.field_1560_x == 2)
                {
                    GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
                }
                GL11.glRotatef(entityliving.field_604_ar - f4, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(entityliving.field_605_aq - f2, 0.0F, 1.0F, 0.0F);
                GL11.glTranslatef(0.0F, 0.0F, (float)(-d3));
                GL11.glRotatef(f2 - entityliving.field_605_aq, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(f4 - entityliving.field_604_ar, 1.0F, 0.0F, 0.0F);
            }
        } else
        {
            GL11.glTranslatef(0.0F, 0.0F, -0.1F);
        }
        if(!field_1388_h.field_6304_y.field_22273_E)
        {
            GL11.glRotatef(entityliving.field_602_at + (entityliving.field_604_ar - entityliving.field_602_at) * p_4138_1_, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(entityliving.field_603_as + (entityliving.field_605_aq - entityliving.field_603_as) * p_4138_1_ + 180F, 0.0F, 1.0F, 0.0F);
        }
        GL11.glTranslatef(0.0F, f, 0.0F);
        d = entityliving.field_9285_at + (entityliving.field_611_ak - entityliving.field_9285_at) * (double)p_4138_1_;
        d1 = (entityliving.field_9284_au + (entityliving.field_610_al - entityliving.field_9284_au) * (double)p_4138_1_) - (double)f;
        d2 = entityliving.field_9283_av + (entityliving.field_609_am - entityliving.field_9283_av) * (double)p_4138_1_;
        field_27288_B = field_1388_h.field_6323_f.func_27307_a(d, d1, d2, p_4138_1_);
    }

    private void func_4139_a(float p_4139_1_, int p_4139_2_)
    {
        field_1387_i = 32 << 3 - field_1388_h.field_6304_y.field_1580_e;
        field_1387_i = field_1388_h.field_6304_y.ofRenderDistanceFine;
        if(Config.isFogFancy())
        {
            field_1387_i = field_1387_i * 0.95F;
        }
        if(Config.isFogFast())
        {
            field_1387_i = field_1387_i * 0.83F;
        }
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        float f = 0.07F;
        if(field_1388_h.field_6304_y.field_1578_g)
        {
            GL11.glTranslatef((float)(-(p_4139_2_ * 2 - 1)) * f, 0.0F, 0.0F);
        }
        float f1 = field_1387_i * 2.0F;
        if(f1 < 128F)
        {
            f1 = 128F;
        }
        if(field_21155_l != 1.0D)
        {
            GL11.glTranslatef((float)field_21154_m, (float)(-field_21153_n), 0.0F);
            GL11.glScaled(field_21155_l, field_21155_l, 1.0D);
        }
        GLU.gluPerspective(func_914_d(p_4139_1_, true), (float)field_1388_h.field_6326_c / (float)field_1388_h.field_6325_d, 0.05F, f1);
        if(field_1388_h.field_6327_b.func_35643_e())
        {
            float f2 = 0.6666667F;
            GL11.glScalef(1.0F, f2, 1.0F);
        }
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        if(field_1388_h.field_6304_y.field_1578_g)
        {
            GL11.glTranslatef((float)(p_4139_2_ * 2 - 1) * 0.1F, 0.0F, 0.0F);
        }
        func_920_e(p_4139_1_);
        if(field_1388_h.field_6304_y.field_1579_f)
        {
            func_917_f(p_4139_1_);
        }
        float f3 = field_1388_h.field_6322_g.field_28025_B + (field_1388_h.field_6322_g.field_28026_A - field_1388_h.field_6322_g.field_28025_B) * p_4139_1_;
        if(f3 > 0.0F)
        {
            int i = 20;
            if(field_1388_h.field_6322_g.func_35160_a(Potion.field_35684_k))
            {
                i = 7;
            }
            float f4 = 5F / (f3 * f3 + 5F) - f3 * 0.04F;
            f4 *= f4;
            GL11.glRotatef(((float)field_1386_j + p_4139_1_) * (float)i, 0.0F, 1.0F, 1.0F);
            GL11.glScalef(1.0F / f4, 1.0F, 1.0F);
            GL11.glRotatef(-((float)field_1386_j + p_4139_1_) * (float)i, 0.0F, 1.0F, 1.0F);
        }
        func_4138_g(p_4139_1_);
        if(field_35823_q > 0)
        {
            int j = field_35823_q - 1;
            if(j == 1)
            {
                GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);
            }
            if(j == 2)
            {
                GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
            }
            if(j == 3)
            {
                GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);
            }
            if(j == 4)
            {
                GL11.glRotatef(90F, 1.0F, 0.0F, 0.0F);
            }
            if(j == 5)
            {
                GL11.glRotatef(-90F, 1.0F, 0.0F, 0.0F);
            }
        }
    }

    private void func_4135_b(float p_4135_1_, int p_4135_2_)
    {
        if(field_35823_q > 0)
        {
            return;
        }
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        float f = 0.07F;
        if(field_1388_h.field_6304_y.field_1578_g)
        {
            GL11.glTranslatef((float)(-(p_4135_2_ * 2 - 1)) * f, 0.0F, 0.0F);
        }
        if(field_21155_l != 1.0D)
        {
            GL11.glTranslatef((float)field_21154_m, (float)(-field_21153_n), 0.0F);
            GL11.glScaled(field_21155_l, field_21155_l, 1.0D);
        }
        GLU.gluPerspective(func_914_d(p_4135_1_, false), (float)field_1388_h.field_6326_c / (float)field_1388_h.field_6325_d, 0.05F, field_1387_i * 2.0F);
        if(field_1388_h.field_6327_b.func_35643_e())
        {
            float f1 = 0.6666667F;
            GL11.glScalef(1.0F, f1, 1.0F);
        }
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        if(field_1388_h.field_6304_y.field_1578_g)
        {
            GL11.glTranslatef((float)(p_4135_2_ * 2 - 1) * 0.1F, 0.0F, 0.0F);
        }
        GL11.glPushMatrix();
        func_920_e(p_4135_1_);
        if(field_1388_h.field_6304_y.field_1579_f)
        {
            func_917_f(p_4135_1_);
        }
        if(field_1388_h.field_6304_y.field_1560_x == 0 && !field_1388_h.field_22009_h.func_22051_K() && !field_1388_h.field_6304_y.field_22277_y && !field_1388_h.field_6327_b.func_35643_e())
        {
            func_35806_b(p_4135_1_);
            field_1395_a.func_4133_a(p_4135_1_);
            func_35810_a(p_4135_1_);
        }
        GL11.glPopMatrix();
        if(field_1388_h.field_6304_y.field_1560_x == 0 && !field_1388_h.field_22009_h.func_22051_K())
        {
            field_1395_a.func_893_b(p_4135_1_);
            func_920_e(p_4135_1_);
        }
        if(field_1388_h.field_6304_y.field_1579_f)
        {
            func_917_f(p_4135_1_);
        }
    }

    public void func_35810_a(double p_35810_1_)
    {
        OpenGlHelper.func_40452_a(OpenGlHelper.field_40455_b);
        GL11.glDisable(3553);
        OpenGlHelper.func_40452_a(OpenGlHelper.field_40457_a);
    }

    public void func_35806_b(double p_35806_1_)
    {
        OpenGlHelper.func_40452_a(OpenGlHelper.field_40455_b);
        GL11.glMatrixMode(5890);
        GL11.glLoadIdentity();
        float f = 0.00390625F;
        GL11.glScalef(f, f, f);
        GL11.glTranslatef(8F, 8F, 8F);
        GL11.glMatrixMode(5888);
        field_1388_h.field_6315_n.func_1076_b(field_35818_d);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10242, 10496);
        GL11.glTexParameteri(3553, 10243, 10496);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(3553);
        OpenGlHelper.func_40452_a(OpenGlHelper.field_40457_a);
    }

    private void func_35807_d()
    {
        field_35816_f += (Math.random() - Math.random()) * Math.random() * Math.random();
        field_35821_h += (Math.random() - Math.random()) * Math.random() * Math.random();
        field_35816_f *= 0.90000000000000002D;
        field_35821_h *= 0.90000000000000002D;
        field_35819_e += (field_35816_f - field_35819_e) * 1.0F;
        field_35817_g += (field_35821_h - field_35817_g) * 1.0F;
        field_35815_V = true;
    }

    private void func_35808_e()
    {
        World world = field_1388_h.field_6324_e;
        if(world == null)
        {
            return;
        }
        for(int i = 0; i < 256; i++)
        {
            float f = world.func_35464_b(1.0F) * 0.95F + 0.05F;
            float f1 = world.field_4209_q.field_4219_d[i / 16] * f;
            float f2 = world.field_4209_q.field_4219_d[i % 16] * (field_35819_e * 0.1F + 1.5F);
            if(world.field_27172_i > 0)
            {
                f1 = world.field_4209_q.field_4219_d[i / 16];
            }
            float f3 = f1 * (world.func_35464_b(1.0F) * 0.65F + 0.35F);
            float f4 = f1 * (world.func_35464_b(1.0F) * 0.65F + 0.35F);
            float f5 = f1;
            float f6 = f2;
            float f7 = f2 * ((f2 * 0.6F + 0.4F) * 0.6F + 0.4F);
            float f8 = f2 * (f2 * f2 * 0.6F + 0.4F);
            float f9 = f3 + f6;
            float f10 = f4 + f7;
            float f11 = f5 + f8;
            f9 = f9 * 0.96F + 0.03F;
            f10 = f10 * 0.96F + 0.03F;
            f11 = f11 * 0.96F + 0.03F;
            if(world.field_4209_q.field_4218_e == 1)
            {
                f9 = 0.22F + f6 * 0.75F;
                f10 = 0.28F + f7 * 0.75F;
                f11 = 0.25F + f8 * 0.75F;
            }
            float f12 = field_1388_h.field_6304_y.field_35380_M;
            if(f9 > 1.0F)
            {
                f9 = 1.0F;
            }
            if(f10 > 1.0F)
            {
                f10 = 1.0F;
            }
            if(f11 > 1.0F)
            {
                f11 = 1.0F;
            }
            float f13 = 1.0F - f9;
            float f14 = 1.0F - f10;
            float f15 = 1.0F - f11;
            f13 = 1.0F - f13 * f13 * f13 * f13;
            f14 = 1.0F - f14 * f14 * f14 * f14;
            f15 = 1.0F - f15 * f15 * f15 * f15;
            f9 = f9 * (1.0F - f12) + f13 * f12;
            f10 = f10 * (1.0F - f12) + f14 * f12;
            f11 = f11 * (1.0F - f12) + f15 * f12;
            f9 = f9 * 0.96F + 0.03F;
            f10 = f10 * 0.96F + 0.03F;
            f11 = f11 * 0.96F + 0.03F;
            if(f9 > 1.0F)
            {
                f9 = 1.0F;
            }
            if(f10 > 1.0F)
            {
                f10 = 1.0F;
            }
            if(f11 > 1.0F)
            {
                f11 = 1.0F;
            }
            if(f9 < 0.0F)
            {
                f9 = 0.0F;
            }
            if(f10 < 0.0F)
            {
                f10 = 0.0F;
            }
            if(f11 < 0.0F)
            {
                f11 = 0.0F;
            }
            char c = '\377';
            int j = (int)(f9 * 255F);
            int k = (int)(f10 * 255F);
            int l = (int)(f11 * 255F);
            field_35811_L[i] = c << 24 | j << 16 | k << 8 | l;
        }

        field_1388_h.field_6315_n.func_28150_a(field_35811_L, 16, 16, field_35818_d);
    }

    public void func_4136_b(float p_4136_1_)
    {
        Profiler.func_40663_a("lightTex");
        World world = field_1388_h.field_6324_e;
        checkDisplayMode();
        if(updatedWorld != world)
        {
            RandomMobs.worldChanged(updatedWorld, world);
            updatedWorld = world;
        }
        Profiler.profilerGlobalEnabled = field_1388_h.field_6304_y.ofProfiler;
        byte byte0 = 10;
        if(field_1388_h.field_6304_y.ofSmoothInput)
        {
            byte0 = 5;
        }
        if(Thread.currentThread().getPriority() != byte0)
        {
            Thread.currentThread().setPriority(byte0);
        }
        Minecraft.field_28005_H = 0L;
        if(lastTexturePack == null)
        {
            lastTexturePack = field_1388_h.field_6298_C.field_6534_a.field_6487_a;
        }
        if(!lastTexturePack.equals(field_1388_h.field_6298_C.field_6534_a.field_6487_a))
        {
            field_1388_h.field_6323_f.func_958_a();
            lastTexturePack = field_1388_h.field_6298_C.field_6534_a.field_6487_a;
        }
        RenderBlocks.field_27406_a = Config.isGrassFancy();
        if(Config.isBetterGrassFancy())
        {
            RenderBlocks.field_27406_a = true;
        }
        Block.field_384_L.func_310_a(Config.isTreesFancy());
        if(Config.getIconWidthTerrain() > 16 && !(field_1395_a instanceof ItemRendererHD))
        {
            field_1395_a = new ItemRendererHD(field_1388_h);
            RenderManager.field_1233_a.field_4236_f = field_1395_a;
        }
        if(world != null)
        {
            world.field_9435_j = field_1388_h.field_6304_y.ofAutoSaveTicks;
        }
        if(!Config.isWeatherEnabled() && world != null && world.field_22145_q != null)
        {
            world.field_22145_q.func_27394_b(false);
        }
        if(world != null && !world.field_1026_y && world.field_22145_q != null && world.field_22145_q.func_35918_q() == 1)
        {
            long l = world.func_22139_r();
            long l1 = l % 24000L;
            if(Config.isTimeDayOnly())
            {
                if(l1 <= 1000L)
                {
                    world.func_648_a((l - l1) + 1001L);
                }
                if(l1 >= 11000L)
                {
                    world.func_648_a((l - l1) + 24001L);
                }
            }
            if(Config.isTimeNightOnly())
            {
                if(l1 <= 14000L)
                {
                    world.func_648_a((l - l1) + 14001L);
                }
                if(l1 >= 22000L)
                {
                    world.func_648_a((l - l1) + 24000L + 14001L);
                }
            }
        }
        if(field_35815_V)
        {
            func_35808_e();
        }
        Profiler.func_40662_b();
        if(!Display.isActive())
        {
            if(System.currentTimeMillis() - field_1384_l > 500L)
            {
                field_1388_h.func_6252_g();
            }
        } else
        {
            field_1384_l = System.currentTimeMillis();
        }
        Profiler.func_40663_a("mouse");
        if(field_1388_h.field_6289_L)
        {
            field_1388_h.field_6299_B.func_772_c();
            float f = field_1388_h.field_6304_y.field_1582_c * 0.6F + 0.2F;
            float f1 = f * f * f * 8F;
            float f2 = (float)field_1388_h.field_6299_B.field_1114_a * f1;
            float f3 = (float)field_1388_h.field_6299_B.field_1113_b * f1;
            int i1 = 1;
            if(field_1388_h.field_6304_y.field_1581_d)
            {
                i1 = -1;
            }
            if(field_1388_h.field_6304_y.field_22274_D)
            {
                field_40682_H += f2;
                field_40683_I += f3;
                float f4 = p_4136_1_ - field_40681_L;
                field_40681_L = p_4136_1_;
                f2 = field_40684_J * f4;
                f3 = field_40685_K * f4;
                field_1388_h.field_6322_g.func_346_d(f2, f3 * (float)i1);
            } else
            {
                field_1388_h.field_6322_g.func_346_d(f2, f3 * (float)i1);
            }
        }
        Profiler.func_40662_b();
        if(field_1388_h.field_6307_v)
        {
            return;
        }
        field_28135_a = field_1388_h.field_6304_y.field_1578_g;
        ScaledResolution scaledresolution = new ScaledResolution(field_1388_h.field_6304_y, field_1388_h.field_6326_c, field_1388_h.field_6325_d);
        int i = scaledresolution.func_903_a();
        int j = scaledresolution.func_902_b();
        int k = (Mouse.getX() * i) / field_1388_h.field_6326_c;
        int j1 = j - (Mouse.getY() * j) / field_1388_h.field_6325_d - 1;
        int k1 = 200;
        if(field_1388_h.field_6304_y.field_1577_h == 1)
        {
            k1 = 120;
        }
        if(field_1388_h.field_6304_y.field_1577_h == 2)
        {
            k1 = 40;
        }
        if(field_1388_h.field_6324_e != null)
        {
            Profiler.func_40663_a("level");
            if(field_1388_h.field_6304_y.field_1577_h == 0)
            {
                func_4134_c(p_4136_1_, 0L);
            } else
            {
                func_4134_c(p_4136_1_, field_28133_I + (long)(1000000000D / (double)k1));
            }
            Profiler.func_40661_c("sleep");
            if(field_1388_h.field_6304_y.field_1577_h == 2)
            {
                long l2 = ((field_28133_I + (long)(1000000000D / (double)k1)) - System.nanoTime()) / 0xf4240L;
                if(l2 > 0L && l2 < 500L)
                {
                    try
                    {
                        Thread.sleep(l2);
                    }
                    catch(InterruptedException interruptedexception)
                    {
                        interruptedexception.printStackTrace();
                    }
                }
            }
            field_28133_I = System.nanoTime();
            Profiler.func_40661_c("gui");
            if(!field_1388_h.field_6304_y.field_22277_y || field_1388_h.field_6313_p != null)
            {
                if(field_1388_h.field_6304_y.ofFastDebugInfo)
                {
                    Minecraft _tmp = field_1388_h;
                    if(Minecraft.func_22007_w())
                    {
                        showDebugInfo = !showDebugInfo;
                    }
                    if(showDebugInfo)
                    {
                        field_1388_h.field_6304_y.field_22276_A = true;
                    }
                }
                field_1388_h.field_6308_u.func_4066_a(p_4136_1_, field_1388_h.field_6313_p != null, k, j1);
                if(field_1388_h.field_6304_y.ofFastDebugInfo)
                {
                    field_1388_h.field_6304_y.field_22276_A = false;
                }
            }
            Profiler.func_40662_b();
        } else
        {
            GL11.glViewport(0, 0, field_1388_h.field_6326_c, field_1388_h.field_6325_d);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            func_905_b();
            long l3 = ((field_28133_I + (long)(0x3b9aca00 / k1)) - System.nanoTime()) / 0xf4240L;
            if(l3 < 0L)
            {
                l3 += 10L;
            }
            if(l3 > 0L && l3 < 500L)
            {
                try
                {
                    Thread.sleep(l3);
                }
                catch(InterruptedException interruptedexception1)
                {
                    interruptedexception1.printStackTrace();
                }
            }
            field_28133_I = System.nanoTime();
        }
        if(field_1388_h.field_6313_p != null)
        {
            GL11.glClear(256);
            field_1388_h.field_6313_p.func_571_a(k, j1, p_4136_1_);
            if(field_1388_h.field_6313_p != null && field_1388_h.field_6313_p.field_25091_h != null)
            {
                field_1388_h.field_6313_p.field_25091_h.func_25087_a(p_4136_1_);
            }
        }
    }

    private void checkDisplayMode()
    {
        try
        {
            if(Display.isFullscreen())
            {
                if(fullscreenModeChecked)
                {
                    return;
                }
                fullscreenModeChecked = true;
                desktopModeChecked = false;
                DisplayMode displaymode = Display.getDisplayMode();
                Dimension dimension = Config.getFullscreenDimension();
                if(displaymode.getWidth() == dimension.width && displaymode.getHeight() == dimension.height)
                {
                    return;
                }
                DisplayMode displaymode2 = Config.getDisplayMode(dimension);
                Display.setDisplayMode(displaymode2);
                field_1388_h.field_6326_c = Display.getDisplayMode().getWidth();
                field_1388_h.field_6325_d = Display.getDisplayMode().getHeight();
                if(field_1388_h.field_6326_c <= 0)
                {
                    field_1388_h.field_6326_c = 1;
                }
                if(field_1388_h.field_6325_d <= 0)
                {
                    field_1388_h.field_6325_d = 1;
                }
                Display.setFullscreen(true);
                Display.update();
                GL11.glEnable(3553);
            } else
            {
                if(desktopModeChecked)
                {
                    return;
                }
                desktopModeChecked = true;
                fullscreenModeChecked = false;
                if(Config.getDesktopDisplayMode() == null)
                {
                    Config.setDesktopDisplayMode(Display.getDesktopDisplayMode());
                }
                DisplayMode displaymode1 = Display.getDisplayMode();
                if(displaymode1.equals(Config.getDesktopDisplayMode()))
                {
                    return;
                }
                Display.setDisplayMode(Config.getDesktopDisplayMode());
                if(field_1388_h.field_9244_k != null)
                {
                    field_1388_h.field_6326_c = field_1388_h.field_9244_k.getWidth();
                    field_1388_h.field_6325_d = field_1388_h.field_9244_k.getHeight();
                }
                if(field_1388_h.field_6326_c <= 0)
                {
                    field_1388_h.field_6326_c = 1;
                }
                if(field_1388_h.field_6325_d <= 0)
                {
                    field_1388_h.field_6325_d = 1;
                }
                Display.setFullscreen(false);
                Display.update();
                GL11.glEnable(3553);
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void func_4134_c(float p_4134_1_, long p_4134_2_)
    {
        Profiler.func_40663_a("lightTex");
        if(field_35815_V)
        {
            func_35808_e();
        }
        GL11.glEnable(2884);
        GL11.glEnable(2929);
        if(field_1388_h.field_22009_h == null)
        {
            field_1388_h.field_22009_h = field_1388_h.field_6322_g;
        }
        Profiler.func_40661_c("pick");
        func_910_a(p_4134_1_);
        EntityLiving entityliving = field_1388_h.field_22009_h;
        RenderGlobal renderglobal = field_1388_h.field_6323_f;
        EffectRenderer effectrenderer = field_1388_h.field_6321_h;
        double d = entityliving.field_638_aI + (entityliving.field_611_ak - entityliving.field_638_aI) * (double)p_4134_1_;
        double d1 = entityliving.field_637_aJ + (entityliving.field_610_al - entityliving.field_637_aJ) * (double)p_4134_1_;
        double d2 = entityliving.field_636_aK + (entityliving.field_609_am - entityliving.field_636_aK) * (double)p_4134_1_;
        Profiler.func_40661_c("center");
        IChunkProvider ichunkprovider = field_1388_h.field_6324_e.func_21118_q();
        if(ichunkprovider instanceof ChunkProviderLoadOrGenerate)
        {
            ChunkProviderLoadOrGenerate chunkproviderloadorgenerate = (ChunkProviderLoadOrGenerate)ichunkprovider;
            int j = MathHelper.func_1110_d((int)d) >> 4;
            int k = MathHelper.func_1110_d((int)d2) >> 4;
            chunkproviderloadorgenerate.func_21110_c(j, k);
        }
        for(int i = 0; i < 2; i++)
        {
            if(field_1388_h.field_6304_y.field_1578_g)
            {
                field_28134_b = i;
                if(field_28134_b == 0)
                {
                    GL11.glColorMask(false, true, true, false);
                } else
                {
                    GL11.glColorMask(true, false, false, false);
                }
            }
            Profiler.func_40661_c("clear");
            GL11.glViewport(0, 0, field_1388_h.field_6326_c, field_1388_h.field_6325_d);
            func_4137_h(p_4134_1_);
            GL11.glClear(16640);
            GL11.glEnable(2884);
            Profiler.func_40661_c("camera");
            func_4139_a(p_4134_1_, i);
            ActiveRenderInfo.func_41067_a(field_1388_h.field_6322_g, field_1388_h.field_6304_y.field_1560_x == 2);
            Profiler.func_40661_c("frustrum");
            ClippingHelperImpl.func_1155_a();
            if(Config.isSkyEnabled() || Config.isSunMoonEnabled() || Config.isStarsEnabled())
            {
                func_4140_a(-1, p_4134_1_);
                Profiler.func_40661_c("sky");
                renderglobal.func_4142_a(p_4134_1_);
            } else
            {
                GL11.glDisable(3042);
            }
            GL11.glEnable(2912);
            func_4140_a(1, p_4134_1_);
            if(field_1388_h.field_6304_y.field_22278_j)
            {
                GL11.glShadeModel(7425);
            }
            Profiler.func_40661_c("culling");
            Frustrum frustrum = new Frustrum();
            frustrum.func_343_a(d, d1, d2);
            field_1388_h.field_6323_f.func_960_a(frustrum, p_4134_1_);
            if(i == 0)
            {
                Profiler.func_40661_c("updatechunks");
                long l;
                do
                {
                    if(field_1388_h.field_6323_f.func_948_a(entityliving, false) || p_4134_2_ == 0L)
                    {
                        break;
                    }
                    l = p_4134_2_ - System.nanoTime();
                } while(l >= 0L && (double)l <= 1000000000D);
            }
            func_4140_a(0, p_4134_1_);
            GL11.glEnable(2912);
            GL11.glBindTexture(3553, field_1388_h.field_6315_n.func_1070_a("/terrain.png"));
            RenderHelper.func_1159_a();
            if(Config.isUseAlphaFunc())
            {
                GL11.glAlphaFunc(516, Config.getAlphaFuncLevel());
            }
            Profiler.func_40661_c("terrain");
            renderglobal.func_943_a(entityliving, 0, p_4134_1_);
            GL11.glShadeModel(7424);
            boolean flag = Reflector.hasClass(1);
            if(field_35823_q == 0)
            {
                RenderHelper.func_1158_b();
                Profiler.func_40661_c("entities");
                renderglobal.func_951_a(entityliving.func_427_e(p_4134_1_), frustrum, p_4134_1_);
                func_35806_b(p_4134_1_);
                Profiler.func_40661_c("litParticles");
                effectrenderer.func_1187_b(entityliving, p_4134_1_);
                RenderHelper.func_1159_a();
                func_4140_a(0, p_4134_1_);
                Profiler.func_40661_c("particles");
                effectrenderer.func_1189_a(entityliving, p_4134_1_);
                func_35810_a(p_4134_1_);
                if(field_1388_h.field_6305_x != null && entityliving.func_393_a(Material.field_1332_f) && (entityliving instanceof EntityPlayer) && !field_1388_h.field_6304_y.field_22277_y)
                {
                    EntityPlayer entityplayer = (EntityPlayer)entityliving;
                    GL11.glDisable(3008);
                    Profiler.func_40661_c("outline");
                    if(!flag || !Reflector.callBoolean(10, new Object[] {
    renderglobal, entityplayer, field_1388_h.field_6305_x, Integer.valueOf(0), entityplayer.field_778_b.func_494_a(), Float.valueOf(p_4134_1_)
}))
                    {
                        renderglobal.func_959_a(entityplayer, field_1388_h.field_6305_x, 0, entityplayer.field_778_b.func_494_a(), p_4134_1_);
                        if(!field_1388_h.field_6304_y.field_22277_y)
                        {
                            renderglobal.func_955_b(entityplayer, field_1388_h.field_6305_x, 0, entityplayer.field_778_b.func_494_a(), p_4134_1_);
                        }
                    }
                    GL11.glEnable(3008);
                }
            }
            GL11.glDisable(3042);
            GL11.glEnable(2884);
            GL11.glBlendFunc(770, 771);
            GL11.glDepthMask(true);
            func_4140_a(0, p_4134_1_);
            GL11.glEnable(3042);
            GL11.glDisable(2884);
            GL11.glBindTexture(3553, field_1388_h.field_6315_n.func_1070_a("/terrain.png"));
            if(Config.isWaterFancy())
            {
                Profiler.func_40661_c("water");
                if(field_1388_h.field_6304_y.field_22278_j)
                {
                    GL11.glShadeModel(7425);
                }
                GL11.glColorMask(false, false, false, false);
                int i1 = renderglobal.renderAllSortedRenderers(1, p_4134_1_);
                if(field_1388_h.field_6304_y.field_1578_g)
                {
                    if(field_28134_b == 0)
                    {
                        GL11.glColorMask(false, true, true, true);
                    } else
                    {
                        GL11.glColorMask(true, false, false, true);
                    }
                } else
                {
                    GL11.glColorMask(true, true, true, true);
                }
                if(i1 > 0)
                {
                    renderglobal.renderAllSortedRenderers(1, p_4134_1_);
                }
                GL11.glShadeModel(7424);
            } else
            {
                Profiler.func_40661_c("water");
                renderglobal.renderAllSortedRenderers(1, p_4134_1_);
            }
            GL11.glDepthMask(true);
            GL11.glEnable(2884);
            GL11.glDisable(3042);
            if(field_21155_l == 1.0D && (entityliving instanceof EntityPlayer) && !field_1388_h.field_6304_y.field_22277_y && field_1388_h.field_6305_x != null && !entityliving.func_393_a(Material.field_1332_f))
            {
                EntityPlayer entityplayer1 = (EntityPlayer)entityliving;
                GL11.glDisable(3008);
                Profiler.func_40661_c("outline");
                if(!flag || !Reflector.callBoolean(10, new Object[] {
    renderglobal, entityplayer1, field_1388_h.field_6305_x, Integer.valueOf(0), entityplayer1.field_778_b.func_494_a(), Float.valueOf(p_4134_1_)
}))
                {
                    renderglobal.func_959_a(entityplayer1, field_1388_h.field_6305_x, 0, entityplayer1.field_778_b.func_494_a(), p_4134_1_);
                    if(!field_1388_h.field_6304_y.field_22277_y)
                    {
                        renderglobal.func_955_b(entityplayer1, field_1388_h.field_6305_x, 0, entityplayer1.field_778_b.func_494_a(), p_4134_1_);
                    }
                }
                GL11.glEnable(3008);
            }
            Profiler.func_40661_c("weather");
            func_27286_d(p_4134_1_);
            GL11.glDisable(2912);
            if(field_1385_k != null);
            if(field_1388_h.field_6304_y.func_40444_c())
            {
                Profiler.func_40661_c("clouds");
                GL11.glPushMatrix();
                func_4140_a(0, p_4134_1_);
                GL11.glEnable(2912);
                renderglobal.func_4141_b(p_4134_1_);
                GL11.glDisable(2912);
                func_4140_a(1, p_4134_1_);
                GL11.glPopMatrix();
            }
            Profiler.func_40661_c("hand");
            if(field_21155_l == 1.0D)
            {
                GL11.glClear(256);
                func_4135_b(p_4134_1_, i);
            }
            if(!field_1388_h.field_6304_y.field_1578_g)
            {
                Profiler.func_40662_b();
                return;
            }
        }

        GL11.glColorMask(true, true, true, false);
        Profiler.func_40662_b();
    }

    private void func_916_c()
    {
        float f = field_1388_h.field_6324_e.func_27162_g(1.0F);
        if(!Config.isRainFancy())
        {
            f /= 2.0F;
        }
        if(f == 0.0F)
        {
            return;
        }
        if(!Config.isRainSplash())
        {
            return;
        }
        field_1383_m.setSeed((long)field_1386_j * 0x12a7ce5fL);
        EntityLiving entityliving = field_1388_h.field_22009_h;
        World world = field_1388_h.field_6324_e;
        int i = MathHelper.func_1108_b(entityliving.field_611_ak);
        int j = MathHelper.func_1108_b(entityliving.field_610_al);
        int k = MathHelper.func_1108_b(entityliving.field_609_am);
        byte byte0 = 10;
        double d = 0.0D;
        double d1 = 0.0D;
        double d2 = 0.0D;
        int l = 0;
        int i1 = (int)(100F * f * f);
        if(field_1388_h.field_6304_y.field_41087_P == 1)
        {
            i1 >>= 1;
        } else
        if(field_1388_h.field_6304_y.field_41087_P == 2)
        {
            i1 = 0;
        }
        for(int j1 = 0; j1 < i1; j1++)
        {
            int k1 = (i + field_1383_m.nextInt(byte0)) - field_1383_m.nextInt(byte0);
            int l1 = (k + field_1383_m.nextInt(byte0)) - field_1383_m.nextInt(byte0);
            int i2 = world.func_35461_e(k1, l1);
            int j2 = world.func_600_a(k1, i2 - 1, l1);
            BiomeGenBase biomegenbase = world.func_48454_a(k1, l1);
            if(i2 > j + byte0 || i2 < j - byte0 || !biomegenbase.func_27077_d() || biomegenbase.func_48411_i() <= 0.2F)
            {
                continue;
            }
            float f1 = field_1383_m.nextFloat();
            float f2 = field_1383_m.nextFloat();
            if(j2 <= 0)
            {
                continue;
            }
            if(Block.field_345_n[j2].field_356_bn == Material.field_1331_g)
            {
                field_1388_h.field_6321_h.func_1192_a(new EntitySmokeFX(world, (float)k1 + f1, (double)((float)i2 + 0.1F) - Block.field_345_n[j2].field_368_bg, (float)l1 + f2, 0.0D, 0.0D, 0.0D));
                continue;
            }
            if(field_1383_m.nextInt(++l) == 0)
            {
                d = (float)k1 + f1;
                d1 = (double)((float)i2 + 0.1F) - Block.field_345_n[j2].field_368_bg;
                d2 = (float)l1 + f2;
            }
            EntityRainFX entityrainfx = new EntityRainFX(world, (float)k1 + f1, (double)((float)i2 + 0.1F) - Block.field_345_n[j2].field_368_bg, (float)l1 + f2);
            CustomColorizer.updateWaterFX(entityrainfx, world);
            field_1388_h.field_6321_h.func_1192_a(entityrainfx);
        }

        if(l > 0 && field_1383_m.nextInt(3) < field_27287_H++)
        {
            field_27287_H = 0;
            if(d1 > entityliving.field_610_al + 1.0D && world.func_35461_e(MathHelper.func_1108_b(entityliving.field_611_ak), MathHelper.func_1108_b(entityliving.field_609_am)) > MathHelper.func_1108_b(entityliving.field_610_al))
            {
                field_1388_h.field_6324_e.func_684_a(d, d1, d2, "ambient.weather.rain", 0.1F, 0.5F);
            } else
            {
                field_1388_h.field_6324_e.func_684_a(d, d1, d2, "ambient.weather.rain", 0.2F, 1.0F);
            }
        }
    }

    protected void func_27286_d(float p_27286_1_)
    {
        float f = field_1388_h.field_6324_e.func_27162_g(p_27286_1_);
        if(f <= 0.0F)
        {
            return;
        }
        func_35806_b(p_27286_1_);
        if(field_35822_i == null)
        {
            field_35822_i = new float[1024];
            field_35820_j = new float[1024];
            for(int i = 0; i < 32; i++)
            {
                for(int j = 0; j < 32; j++)
                {
                    float f1 = j - 16;
                    float f2 = i - 16;
                    float f3 = MathHelper.func_1113_c(f1 * f1 + f2 * f2);
                    field_35822_i[i << 5 | j] = -f2 / f3;
                    field_35820_j[i << 5 | j] = f1 / f3;
                }

            }

        }
        if(Config.isRainOff())
        {
            return;
        }
        EntityLiving entityliving = field_1388_h.field_22009_h;
        World world = field_1388_h.field_6324_e;
        int k = MathHelper.func_1108_b(entityliving.field_611_ak);
        int l = MathHelper.func_1108_b(entityliving.field_610_al);
        int i1 = MathHelper.func_1108_b(entityliving.field_609_am);
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glDisable(2884);
        GL11.glNormal3f(0.0F, 1.0F, 0.0F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glAlphaFunc(516, 0.01F);
        GL11.glBindTexture(3553, field_1388_h.field_6315_n.func_1070_a("/environment/snow.png"));
        double d = entityliving.field_638_aI + (entityliving.field_611_ak - entityliving.field_638_aI) * (double)p_27286_1_;
        double d1 = entityliving.field_637_aJ + (entityliving.field_610_al - entityliving.field_637_aJ) * (double)p_27286_1_;
        double d2 = entityliving.field_636_aK + (entityliving.field_609_am - entityliving.field_636_aK) * (double)p_27286_1_;
        int j1 = MathHelper.func_1108_b(d1);
        int k1 = 5;
        if(Config.isRainFancy())
        {
            k1 = 10;
        }
        boolean flag = false;
        byte byte0 = -1;
        float f4 = (float)field_1386_j + p_27286_1_;
        if(Config.isRainFancy())
        {
            k1 = 10;
        }
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        flag = false;
        for(int l1 = i1 - k1; l1 <= i1 + k1; l1++)
        {
            for(int i2 = k - k1; i2 <= k + k1; i2++)
            {
                int j2 = ((l1 - i1) + 16) * 32 + ((i2 - k) + 16);
                float f5 = field_35822_i[j2] * 0.5F;
                float f6 = field_35820_j[j2] * 0.5F;
                BiomeGenBase biomegenbase = world.func_48454_a(i2, l1);
                if(!biomegenbase.func_27077_d() && !biomegenbase.func_27078_c())
                {
                    continue;
                }
                int k2 = world.func_35461_e(i2, l1);
                int l2 = l - k1;
                int i3 = l + k1;
                if(l2 < k2)
                {
                    l2 = k2;
                }
                if(i3 < k2)
                {
                    i3 = k2;
                }
                float f7 = 1.0F;
                int j3 = k2;
                if(j3 < j1)
                {
                    j3 = j1;
                }
                if(l2 == i3)
                {
                    continue;
                }
                field_1383_m.setSeed(i2 * i2 * 3121 + i2 * 0x2b24abb ^ l1 * l1 * 0x66397 + l1 * 13761);
                float f8 = biomegenbase.func_48411_i();
                if(world.func_4075_a().func_40540_a(f8, k2) >= 0.15F)
                {
                    if(byte0 != 0)
                    {
                        if(byte0 >= 0)
                        {
                            tessellator.func_982_a();
                        }
                        byte0 = 0;
                        GL11.glBindTexture(3553, field_1388_h.field_6315_n.func_1070_a("/environment/rain.png"));
                        tessellator.func_977_b();
                    }
                    float f9 = (((float)(field_1386_j + i2 * i2 * 3121 + i2 * 0x2b24abb + l1 * l1 * 0x66397 + l1 * 13761 & 0x1f) + p_27286_1_) / 32F) * (3F + field_1383_m.nextFloat());
                    double d3 = (double)((float)i2 + 0.5F) - entityliving.field_611_ak;
                    double d4 = (double)((float)l1 + 0.5F) - entityliving.field_609_am;
                    float f13 = MathHelper.func_1109_a(d3 * d3 + d4 * d4) / (float)k1;
                    float f14 = 1.0F;
                    tessellator.func_35835_b(world.func_35451_b(i2, j3, l1, 0));
                    tessellator.func_986_a(f14, f14, f14, ((1.0F - f13 * f13) * 0.5F + 0.5F) * f);
                    tessellator.func_984_b(-d * 1.0D, -d1 * 1.0D, -d2 * 1.0D);
                    tessellator.func_983_a((double)((float)i2 - f5) + 0.5D, l2, (double)((float)l1 - f6) + 0.5D, 0.0F * f7, ((float)l2 * f7) / 4F + f9 * f7);
                    tessellator.func_983_a((double)((float)i2 + f5) + 0.5D, l2, (double)((float)l1 + f6) + 0.5D, 1.0F * f7, ((float)l2 * f7) / 4F + f9 * f7);
                    tessellator.func_983_a((double)((float)i2 + f5) + 0.5D, i3, (double)((float)l1 + f6) + 0.5D, 1.0F * f7, ((float)i3 * f7) / 4F + f9 * f7);
                    tessellator.func_983_a((double)((float)i2 - f5) + 0.5D, i3, (double)((float)l1 - f6) + 0.5D, 0.0F * f7, ((float)i3 * f7) / 4F + f9 * f7);
                    tessellator.func_984_b(0.0D, 0.0D, 0.0D);
                    continue;
                }
                if(byte0 != 1)
                {
                    if(byte0 >= 0)
                    {
                        tessellator.func_982_a();
                    }
                    byte0 = 1;
                    GL11.glBindTexture(3553, field_1388_h.field_6315_n.func_1070_a("/environment/snow.png"));
                    tessellator.func_977_b();
                }
                float f10 = ((float)(field_1386_j & 0x1ff) + p_27286_1_) / 512F;
                float f11 = field_1383_m.nextFloat() + f4 * 0.01F * (float)field_1383_m.nextGaussian();
                float f12 = field_1383_m.nextFloat() + f4 * (float)field_1383_m.nextGaussian() * 0.001F;
                double d5 = (double)((float)i2 + 0.5F) - entityliving.field_611_ak;
                double d6 = (double)((float)l1 + 0.5F) - entityliving.field_609_am;
                float f15 = MathHelper.func_1109_a(d5 * d5 + d6 * d6) / (float)k1;
                float f16 = 1.0F;
                tessellator.func_35835_b((world.func_35451_b(i2, j3, l1, 0) * 3 + 0xf000f0) / 4);
                tessellator.func_986_a(f16, f16, f16, ((1.0F - f15 * f15) * 0.3F + 0.5F) * f);
                tessellator.func_984_b(-d * 1.0D, -d1 * 1.0D, -d2 * 1.0D);
                tessellator.func_983_a((double)((float)i2 - f5) + 0.5D, l2, (double)((float)l1 - f6) + 0.5D, 0.0F * f7 + f11, ((float)l2 * f7) / 4F + f10 * f7 + f12);
                tessellator.func_983_a((double)((float)i2 + f5) + 0.5D, l2, (double)((float)l1 + f6) + 0.5D, 1.0F * f7 + f11, ((float)l2 * f7) / 4F + f10 * f7 + f12);
                tessellator.func_983_a((double)((float)i2 + f5) + 0.5D, i3, (double)((float)l1 + f6) + 0.5D, 1.0F * f7 + f11, ((float)i3 * f7) / 4F + f10 * f7 + f12);
                tessellator.func_983_a((double)((float)i2 - f5) + 0.5D, i3, (double)((float)l1 - f6) + 0.5D, 0.0F * f7 + f11, ((float)i3 * f7) / 4F + f10 * f7 + f12);
                tessellator.func_984_b(0.0D, 0.0D, 0.0D);
            }

        }

        if(byte0 >= 0)
        {
            tessellator.func_982_a();
        }
        GL11.glEnable(2884);
        GL11.glDisable(3042);
        GL11.glAlphaFunc(516, 0.1F);
        func_35810_a(p_27286_1_);
    }

    public void func_905_b()
    {
        ScaledResolution scaledresolution = new ScaledResolution(field_1388_h.field_6304_y, field_1388_h.field_6326_c, field_1388_h.field_6325_d);
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, scaledresolution.field_25121_a, scaledresolution.field_25120_b, 0.0D, 1000D, 3000D);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -2000F);
    }

    private void func_4137_h(float p_4137_1_)
    {
        World world = field_1388_h.field_6324_e;
        EntityLiving entityliving = field_1388_h.field_22009_h;
        float f = 1.0F / (float)(4 - field_1388_h.field_6304_y.field_1580_e);
        f = 1.0F - (float)Math.pow(f, 0.25D);
        Vec3D vec3d = world.func_4079_a(field_1388_h.field_22009_h, p_4137_1_);
        if(field_1388_h.field_6324_e.field_4209_q.func_48217_e())
        {
            vec3d = CustomColorizer.getSkyColor(vec3d, field_1388_h.field_6324_e, field_1388_h.field_22009_h.field_611_ak, field_1388_h.field_22009_h.field_610_al + 1.0D, field_1388_h.field_22009_h.field_609_am);
        }
        float f1 = (float)vec3d.field_1776_a;
        float f2 = (float)vec3d.field_1775_b;
        float f3 = (float)vec3d.field_1779_c;
        Vec3D vec3d1 = world.func_4082_d(p_4137_1_);
        if(field_1388_h.field_6324_e.field_4209_q.func_48217_e())
        {
            vec3d1 = CustomColorizer.getFogColor(vec3d1, field_1388_h.field_6324_e, field_1388_h.field_22009_h.field_611_ak, field_1388_h.field_22009_h.field_610_al + 1.0D, field_1388_h.field_22009_h.field_609_am);
        }
        field_4270_e = (float)vec3d1.field_1776_a;
        field_4269_f = (float)vec3d1.field_1775_b;
        field_4268_g = (float)vec3d1.field_1779_c;
        if(field_1388_h.field_6304_y.field_1580_e < 2)
        {
            Vec3D vec3d2 = MathHelper.func_1106_a(world.func_35456_d(p_4137_1_)) > 0.0F ? Vec3D.func_1248_b(-1D, 0.0D, 0.0D) : Vec3D.func_1248_b(1.0D, 0.0D, 0.0D);
            float f5 = (float)entityliving.func_430_f(p_4137_1_).func_35612_b(vec3d2);
            if(f5 < 0.0F)
            {
                f5 = 0.0F;
            }
            if(f5 > 0.0F)
            {
                float af[] = world.field_4209_q.func_4097_b(world.func_619_c(p_4137_1_), p_4137_1_);
                if(af != null)
                {
                    f5 *= af[3];
                    field_4270_e = field_4270_e * (1.0F - f5) + af[0] * f5;
                    field_4269_f = field_4269_f * (1.0F - f5) + af[1] * f5;
                    field_4268_g = field_4268_g * (1.0F - f5) + af[2] * f5;
                }
            }
        }
        field_4270_e += (f1 - field_4270_e) * f;
        field_4269_f += (f2 - field_4269_f) * f;
        field_4268_g += (f3 - field_4268_g) * f;
        float f4 = world.func_27162_g(p_4137_1_);
        if(f4 > 0.0F)
        {
            float f6 = 1.0F - f4 * 0.5F;
            float f8 = 1.0F - f4 * 0.4F;
            field_4270_e *= f6;
            field_4269_f *= f6;
            field_4268_g *= f8;
        }
        float f7 = world.func_27166_f(p_4137_1_);
        if(f7 > 0.0F)
        {
            float f9 = 1.0F - f7 * 0.5F;
            field_4270_e *= f9;
            field_4269_f *= f9;
            field_4268_g *= f9;
        }
        int i = ActiveRenderInfo.func_41066_a(field_1388_h.field_6324_e, entityliving, p_4137_1_);
        if(field_27288_B)
        {
            Vec3D vec3d3 = world.func_628_d(p_4137_1_);
            field_4270_e = (float)vec3d3.field_1776_a;
            field_4269_f = (float)vec3d3.field_1775_b;
            field_4268_g = (float)vec3d3.field_1779_c;
        } else
        if(i != 0 && Block.field_345_n[i].field_356_bn == Material.field_1332_f)
        {
            field_4270_e = 0.02F;
            field_4269_f = 0.02F;
            field_4268_g = 0.2F;
        } else
        if(i != 0 && Block.field_345_n[i].field_356_bn == Material.field_1331_g)
        {
            field_4270_e = 0.6F;
            field_4269_f = 0.1F;
            field_4268_g = 0.0F;
        }
        float f10 = field_1382_n + (field_1381_o - field_1382_n) * p_4137_1_;
        field_4270_e *= f10;
        field_4269_f *= f10;
        field_4268_g *= f10;
        double d = (entityliving.field_637_aJ + (entityliving.field_610_al - entityliving.field_637_aJ) * (double)p_4137_1_) * world.field_4209_q.func_46065_j();
        if(entityliving.func_35160_a(Potion.field_35693_q))
        {
            int j = entityliving.func_35167_b(Potion.field_35693_q).func_35802_b();
            if(j < 20)
            {
                d *= 1.0F - (float)j / 20F;
            } else
            {
                d = 0.0D;
            }
        }
        if(d < 1.0D)
        {
            if(d < 0.0D)
            {
                d = 0.0D;
            }
            d *= d;
            field_4270_e *= d;
            field_4269_f *= d;
            field_4268_g *= d;
        }
        if(field_1388_h.field_6304_y.field_1578_g)
        {
            float f11 = (field_4270_e * 30F + field_4269_f * 59F + field_4268_g * 11F) / 100F;
            float f12 = (field_4270_e * 30F + field_4269_f * 70F) / 100F;
            float f13 = (field_4270_e * 30F + field_4268_g * 70F) / 100F;
            field_4270_e = f11;
            field_4269_f = f12;
            field_4268_g = f13;
        }
        GL11.glClearColor(field_4270_e, field_4269_f, field_4268_g, 0.0F);
    }

    private void func_4140_a(int p_4140_1_, float p_4140_2_)
    {
        EntityLiving entityliving = field_1388_h.field_22009_h;
        boolean flag = false;
        if(entityliving instanceof EntityPlayer)
        {
            flag = ((EntityPlayer)entityliving).field_35212_aW.field_35756_d;
        }
        if(p_4140_1_ == 999)
        {
            GL11.glFog(2918, func_908_a(0.0F, 0.0F, 0.0F, 1.0F));
            GL11.glFogi(2917, 9729);
            GL11.glFogf(2915, 0.0F);
            GL11.glFogf(2916, 8F);
            if(GLContext.getCapabilities().GL_NV_fog_distance)
            {
                GL11.glFogi(34138, 34139);
            }
            GL11.glFogf(2915, 0.0F);
            return;
        }
        GL11.glFog(2918, func_908_a(field_4270_e, field_4269_f, field_4268_g, 1.0F));
        GL11.glNormal3f(0.0F, -1F, 0.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        int i = ActiveRenderInfo.func_41066_a(field_1388_h.field_6324_e, entityliving, p_4140_2_);
        if(entityliving.func_35160_a(Potion.field_35693_q))
        {
            float f = 5F;
            int j = entityliving.func_35167_b(Potion.field_35693_q).func_35802_b();
            if(j < 20)
            {
                f = 5F + (field_1387_i - 5F) * (1.0F - (float)j / 20F);
            }
            GL11.glFogi(2917, 9729);
            if(p_4140_1_ < 0)
            {
                GL11.glFogf(2915, 0.0F);
                GL11.glFogf(2916, f * 0.8F);
            } else
            {
                GL11.glFogf(2915, f * 0.25F);
                GL11.glFogf(2916, f);
            }
            if(GLContext.getCapabilities().GL_NV_fog_distance)
            {
                GL11.glFogi(34138, 34139);
            }
        } else
        if(field_27288_B)
        {
            GL11.glFogi(2917, 2048);
            GL11.glFogf(2914, 0.1F);
            float f1 = 1.0F;
            float f5 = 1.0F;
            float f9 = 1.0F;
            if(field_1388_h.field_6304_y.field_1578_g)
            {
                float f13 = (f1 * 30F + f5 * 59F + f9 * 11F) / 100F;
                float f17 = (f1 * 30F + f5 * 70F) / 100F;
                float f20 = (f1 * 30F + f9 * 70F) / 100F;
                f1 = f13;
                f5 = f17;
                f9 = f20;
            }
        } else
        if(i > 0 && Block.field_345_n[i].field_356_bn == Material.field_1332_f)
        {
            GL11.glFogi(2917, 2048);
            float f2 = 0.1F;
            if(!entityliving.func_35160_a(Potion.field_35680_o))
            {
                f2 = 0.1F;
            } else
            {
                f2 = 0.05F;
            }
            if(Config.isClearWater())
            {
                f2 /= 5F;
            }
            GL11.glFogf(2914, f2);
            float f6 = 0.4F;
            float f10 = 0.4F;
            float f14 = 0.9F;
            if(field_1388_h.field_6304_y.field_1578_g)
            {
                float f18 = (f6 * 30F + f10 * 59F + f14 * 11F) / 100F;
                float f21 = (f6 * 30F + f10 * 70F) / 100F;
                float f23 = (f6 * 30F + f14 * 70F) / 100F;
                f6 = f18;
                f10 = f21;
                f14 = f23;
            }
        } else
        if(i > 0 && Block.field_345_n[i].field_356_bn == Material.field_1331_g)
        {
            GL11.glFogi(2917, 2048);
            GL11.glFogf(2914, 2.0F);
            float f3 = 0.4F;
            float f7 = 0.3F;
            float f11 = 0.3F;
            if(field_1388_h.field_6304_y.field_1578_g)
            {
                float f15 = (f3 * 30F + f7 * 59F + f11 * 11F) / 100F;
                float f19 = (f3 * 30F + f7 * 70F) / 100F;
                float f22 = (f3 * 30F + f11 * 70F) / 100F;
                f3 = f15;
                f7 = f19;
                f11 = f22;
            }
        } else
        {
            float f4 = field_1387_i;
            if(Config.isDepthFog() && field_1388_h.field_6324_e.field_4209_q.func_46064_i() && !flag)
            {
                double d = (double)((entityliving.func_35115_a(p_4140_2_) & 0xf00000) >> 20) / 16D + (entityliving.field_637_aJ + (entityliving.field_610_al - entityliving.field_637_aJ) * (double)p_4140_2_ + 4D) / 32D;
                if(d < 1.0D)
                {
                    if(d < 0.0D)
                    {
                        d = 0.0D;
                    }
                    d *= d;
                    float f16 = 100F * (float)d;
                    if(f16 < 5F)
                    {
                        f16 = 5F;
                    }
                    if(f4 > f16)
                    {
                        f4 = f16;
                    }
                }
            }
            GL11.glFogi(2917, 9729);
            if(GLContext.getCapabilities().GL_NV_fog_distance)
            {
                if(Config.isFogFancy())
                {
                    GL11.glFogi(34138, 34139);
                }
                if(Config.isFogFast())
                {
                    GL11.glFogi(34138, 34140);
                }
            }
            float f8 = Config.getFogStart();
            float f12 = 1.0F;
            if(p_4140_1_ < 0)
            {
                f8 = 0.0F;
                f12 = 0.8F;
            }
            if(field_1388_h.field_6324_e.field_4209_q.func_48218_b((int)entityliving.field_611_ak, (int)entityliving.field_609_am))
            {
                f8 = 0.05F;
                f12 = 1.0F;
                f4 = field_1387_i;
            }
            GL11.glFogf(2915, f4 * f8);
            GL11.glFogf(2916, f4 * f12);
        }
        GL11.glEnable(2903);
        GL11.glColorMaterial(1028, 4608);
    }

    private FloatBuffer func_908_a(float p_908_1_, float p_908_2_, float p_908_3_, float p_908_4_)
    {
        field_1392_d.clear();
        field_1392_d.put(p_908_1_).put(p_908_2_).put(p_908_3_).put(p_908_4_);
        field_1392_d.flip();
        return field_1392_d;
    }

}
