// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Gui, ScaledResolution, EntityRenderer, EntityPlayerSP, 
//            InventoryPlayer, GameSettings, ItemStack, Block, 
//            Potion, PlayerController, RenderEngine, FoodStats, 
//            World, WorldInfo, Material, RenderHelper, 
//            FontRenderer, MathHelper, Chunk, BiomeGenBase, 
//            EnumSkyBlock, EntityClientPlayerMP, KeyBinding, NetClientHandler, 
//            GuiPlayerInfo, ChatLine, RenderDragon, EntityDragon, 
//            Tessellator, BlockPortal, RenderItem, ChatClickData, 
//            GuiChat, StringTranslate

public class GuiIngame extends Gui
{

    private static RenderItem field_930_d = new RenderItem();
    private java.util.List field_929_e;
    private java.util.List field_50016_f;
    private Random field_9423_f;
    private Minecraft field_9422_g;
    private int field_9421_h;
    private String field_9420_i;
    private int field_9419_j;
    private boolean field_22065_l;
    private int field_50017_n;
    private boolean field_50018_o;
    public float field_6446_b;
    float field_931_c;

    public GuiIngame(Minecraft p_i149_1_)
    {
        field_929_e = new ArrayList();
        field_50016_f = new ArrayList();
        field_9423_f = new Random();
        field_9421_h = 0;
        field_9420_i = "";
        field_9419_j = 0;
        field_22065_l = false;
        field_50017_n = 0;
        field_50018_o = false;
        field_931_c = 1.0F;
        field_9422_g = p_i149_1_;
    }

    public void func_4066_a(float p_4066_1_, boolean p_4066_2_, int p_4066_3_, int p_4066_4_)
    {
        ScaledResolution scaledresolution = new ScaledResolution(field_9422_g.field_6304_y, field_9422_g.field_6326_c, field_9422_g.field_6325_d);
        int i = scaledresolution.func_903_a();
        int j = scaledresolution.func_902_b();
        FontRenderer fontrenderer = field_9422_g.field_6314_o;
        field_9422_g.field_9243_r.func_905_b();
        GL11.glEnable(3042);
        if(Minecraft.func_22001_u())
        {
            func_4064_a(field_9422_g.field_6322_g.func_382_a(p_4066_1_), i, j);
        } else
        {
            GL11.glBlendFunc(770, 771);
        }
        ItemStack itemstack = field_9422_g.field_6322_g.field_778_b.func_492_d(3);
        if(field_9422_g.field_6304_y.field_1560_x == 0 && itemstack != null && itemstack.field_1617_c == Block.field_4055_bb.field_376_bc)
        {
            func_4063_a(i, j);
        }
        if(!field_9422_g.field_6322_g.func_35160_a(Potion.field_35684_k))
        {
            float f = field_9422_g.field_6322_g.field_28025_B + (field_9422_g.field_6322_g.field_28026_A - field_9422_g.field_6322_g.field_28025_B) * p_4066_1_;
            if(f > 0.0F)
            {
                func_4065_b(f, i, j);
            }
        }
        if(!field_9422_g.field_6327_b.func_35643_e())
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, field_9422_g.field_6315_n.func_1070_a("/gui/gui.png"));
            InventoryPlayer inventoryplayer = field_9422_g.field_6322_g.field_778_b;
            field_923_k = -90F;
            func_550_b(i / 2 - 91, j - 22, 0, 0, 182, 22);
            func_550_b((i / 2 - 91 - 1) + inventoryplayer.field_847_d * 20, j - 22 - 1, 0, 22, 24, 22);
            GL11.glBindTexture(3553, field_9422_g.field_6315_n.func_1070_a("/gui/icons.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(775, 769);
            func_550_b(i / 2 - 7, j / 2 - 7, 0, 0, 16, 16);
            GL11.glDisable(3042);
            boolean flag = (field_9422_g.field_6322_g.field_9306_bj / 3) % 2 == 1;
            if(field_9422_g.field_6322_g.field_9306_bj < 10)
            {
                flag = false;
            }
            int i1 = field_9422_g.field_6322_g.func_40114_aH();
            int i2 = field_9422_g.field_6322_g.field_9335_K;
            field_9423_f.setSeed(field_9421_h * 0x4c627);
            boolean flag2 = false;
            FoodStats foodstats = field_9422_g.field_6322_g.func_35191_at();
            int j4 = foodstats.func_35765_a();
            int l4 = foodstats.func_35769_b();
            func_41039_c();
            if(field_9422_g.field_6327_b.func_6469_d())
            {
                int j5 = i / 2 - 91;
                int i6 = i / 2 + 91;
                int l6 = field_9422_g.field_6322_g.func_35193_as();
                if(l6 > 0)
                {
                    char c = '\266';
                    int j8 = (int)(field_9422_g.field_6322_g.field_35211_aX * (float)(c + 1));
                    int i9 = (j - 32) + 3;
                    func_550_b(j5, i9, 0, 64, c, 5);
                    if(j8 > 0)
                    {
                        func_550_b(j5, i9, 0, 69, j8, 5);
                    }
                }
                int k7 = j - 39;
                int k8 = k7 - 10;
                int j9 = field_9422_g.field_6322_g.func_40119_ar();
                int i10 = -1;
                if(field_9422_g.field_6322_g.func_35160_a(Potion.field_35681_l))
                {
                    i10 = field_9421_h % 25;
                }
                for(int j10 = 0; j10 < 10; j10++)
                {
                    if(j9 > 0)
                    {
                        int i11 = j5 + j10 * 8;
                        if(j10 * 2 + 1 < j9)
                        {
                            func_550_b(i11, k8, 34, 9, 9, 9);
                        }
                        if(j10 * 2 + 1 == j9)
                        {
                            func_550_b(i11, k8, 25, 9, 9, 9);
                        }
                        if(j10 * 2 + 1 > j9)
                        {
                            func_550_b(i11, k8, 16, 9, 9, 9);
                        }
                    }
                    int j11 = 16;
                    if(field_9422_g.field_6322_g.func_35160_a(Potion.field_35689_u))
                    {
                        j11 += 36;
                    }
                    int i12 = 0;
                    if(flag)
                    {
                        i12 = 1;
                    }
                    int l12 = j5 + j10 * 8;
                    int j13 = k7;
                    if(i1 <= 4)
                    {
                        j13 += field_9423_f.nextInt(2);
                    }
                    if(j10 == i10)
                    {
                        j13 -= 2;
                    }
                    byte byte3 = 0;
                    if(field_9422_g.field_6324_e.func_22144_v().func_40724_s())
                    {
                        byte3 = 5;
                    }
                    func_550_b(l12, j13, 16 + i12 * 9, 9 * byte3, 9, 9);
                    if(flag)
                    {
                        if(j10 * 2 + 1 < i2)
                        {
                            func_550_b(l12, j13, j11 + 54, 9 * byte3, 9, 9);
                        }
                        if(j10 * 2 + 1 == i2)
                        {
                            func_550_b(l12, j13, j11 + 63, 9 * byte3, 9, 9);
                        }
                    }
                    if(j10 * 2 + 1 < i1)
                    {
                        func_550_b(l12, j13, j11 + 36, 9 * byte3, 9, 9);
                    }
                    if(j10 * 2 + 1 == i1)
                    {
                        func_550_b(l12, j13, j11 + 45, 9 * byte3, 9, 9);
                    }
                }

                for(int k10 = 0; k10 < 10; k10++)
                {
                    int k11 = k7;
                    int j12 = 16;
                    byte byte2 = 0;
                    if(field_9422_g.field_6322_g.func_35160_a(Potion.field_35691_s))
                    {
                        j12 += 36;
                        byte2 = 13;
                    }
                    if(field_9422_g.field_6322_g.func_35191_at().func_35760_d() <= 0.0F && field_9421_h % (j4 * 3 + 1) == 0)
                    {
                        k11 += field_9423_f.nextInt(3) - 1;
                    }
                    if(flag2)
                    {
                        byte2 = 1;
                    }
                    int k13 = i6 - k10 * 8 - 9;
                    func_550_b(k13, k11, 16 + byte2 * 9, 27, 9, 9);
                    if(flag2)
                    {
                        if(k10 * 2 + 1 < l4)
                        {
                            func_550_b(k13, k11, j12 + 54, 27, 9, 9);
                        }
                        if(k10 * 2 + 1 == l4)
                        {
                            func_550_b(k13, k11, j12 + 63, 27, 9, 9);
                        }
                    }
                    if(k10 * 2 + 1 < j4)
                    {
                        func_550_b(k13, k11, j12 + 36, 27, 9, 9);
                    }
                    if(k10 * 2 + 1 == j4)
                    {
                        func_550_b(k13, k11, j12 + 45, 27, 9, 9);
                    }
                }

                if(field_9422_g.field_6322_g.func_393_a(Material.field_1332_f))
                {
                    int l10 = field_9422_g.field_6322_g.func_41001_Z();
                    int l11 = (int)Math.ceil(((double)(l10 - 2) * 10D) / 300D);
                    int k12 = (int)Math.ceil(((double)l10 * 10D) / 300D) - l11;
                    for(int i13 = 0; i13 < l11 + k12; i13++)
                    {
                        if(i13 < l11)
                        {
                            func_550_b(i6 - i13 * 8 - 9, k8, 16, 18, 9, 9);
                        } else
                        {
                            func_550_b(i6 - i13 * 8 - 9, k8, 25, 18, 9, 9);
                        }
                    }

                }
            }
            GL11.glDisable(3042);
            GL11.glEnable(32826);
            RenderHelper.func_41089_c();
            for(int k5 = 0; k5 < 9; k5++)
            {
                int j6 = (i / 2 - 90) + k5 * 20 + 2;
                int i7 = j - 16 - 3;
                func_554_a(k5, j6, i7, p_4066_1_);
            }

            RenderHelper.func_1159_a();
            GL11.glDisable(32826);
        }
        if(field_9422_g.field_6322_g.func_22060_M() > 0)
        {
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            int k = field_9422_g.field_6322_g.func_22060_M();
            float f1 = (float)k / 100F;
            if(f1 > 1.0F)
            {
                f1 = 1.0F - (float)(k - 100) / 10F;
            }
            int j1 = (int)(220F * f1) << 24 | 0x101020;
            func_551_a(0, 0, i, j, j1);
            GL11.glEnable(3008);
            GL11.glEnable(2929);
        }
        if(field_9422_g.field_6327_b.func_35642_f() && field_9422_g.field_6322_g.field_35210_aY > 0)
        {
            boolean flag1 = false;
            int k1 = flag1 ? 0xffffff : 0x80ff20;
            String s = (new StringBuilder()).append("").append(field_9422_g.field_6322_g.field_35210_aY).toString();
            int i3 = (i - fontrenderer.func_871_a(s)) / 2;
            int k3 = j - 31 - 4;
            fontrenderer.func_873_b(s, i3 + 1, k3, 0);
            fontrenderer.func_873_b(s, i3 - 1, k3, 0);
            fontrenderer.func_873_b(s, i3, k3 + 1, 0);
            fontrenderer.func_873_b(s, i3, k3 - 1, 0);
            fontrenderer.func_873_b(s, i3, k3, k1);
        }
        if(field_9422_g.field_6304_y.field_22276_A)
        {
            GL11.glPushMatrix();
            if(Minecraft.field_28005_H > 0L)
            {
                GL11.glTranslatef(0.0F, 32F, 0.0F);
            }
            fontrenderer.func_50103_a((new StringBuilder()).append("Minecraft 1.2.5 (").append(field_9422_g.field_6292_I).append(")").toString(), 2, 2, 0xffffff);
            fontrenderer.func_50103_a(field_9422_g.func_6241_m(), 2, 12, 0xffffff);
            fontrenderer.func_50103_a(field_9422_g.func_6262_n(), 2, 22, 0xffffff);
            fontrenderer.func_50103_a(field_9422_g.func_6245_o(), 2, 32, 0xffffff);
            fontrenderer.func_50103_a(field_9422_g.func_21002_o(), 2, 42, 0xffffff);
            long l = Runtime.getRuntime().maxMemory();
            long l2 = Runtime.getRuntime().totalMemory();
            long l3 = Runtime.getRuntime().freeMemory();
            long l5 = l2 - l3;
            String s1 = (new StringBuilder()).append("Used memory: ").append((l5 * 100L) / l).append("% (").append(l5 / 1024L / 1024L).append("MB) of ").append(l / 1024L / 1024L).append("MB").toString();
            func_547_b(fontrenderer, s1, i - fontrenderer.func_871_a(s1) - 2, 2, 0xe0e0e0);
            s1 = (new StringBuilder()).append("Allocated memory: ").append((l2 * 100L) / l).append("% (").append(l2 / 1024L / 1024L).append("MB)").toString();
            func_547_b(fontrenderer, s1, i - fontrenderer.func_871_a(s1) - 2, 12, 0xe0e0e0);
            func_547_b(fontrenderer, (new StringBuilder()).append("x: ").append(field_9422_g.field_6322_g.field_611_ak).toString(), 2, 64, 0xe0e0e0);
            func_547_b(fontrenderer, (new StringBuilder()).append("y: ").append(field_9422_g.field_6322_g.field_610_al).toString(), 2, 72, 0xe0e0e0);
            func_547_b(fontrenderer, (new StringBuilder()).append("z: ").append(field_9422_g.field_6322_g.field_609_am).toString(), 2, 80, 0xe0e0e0);
            func_547_b(fontrenderer, (new StringBuilder()).append("f: ").append(MathHelper.func_1108_b((double)((field_9422_g.field_6322_g.field_605_aq * 4F) / 360F) + 0.5D) & 3).toString(), 2, 88, 0xe0e0e0);
            int l7 = MathHelper.func_1108_b(field_9422_g.field_6322_g.field_611_ak);
            int l8 = MathHelper.func_1108_b(field_9422_g.field_6322_g.field_610_al);
            int k9 = MathHelper.func_1108_b(field_9422_g.field_6322_g.field_609_am);
            if(field_9422_g.field_6324_e != null && field_9422_g.field_6324_e.func_630_d(l7, l8, k9))
            {
                Chunk chunk = field_9422_g.field_6324_e.func_673_a(l7, k9);
                func_547_b(fontrenderer, (new StringBuilder()).append("lc: ").append(chunk.func_48498_h() + 15).append(" b: ").append(chunk.func_48490_a(l7 & 0xf, k9 & 0xf, field_9422_g.field_6324_e.func_4075_a()).field_6504_m).append(" bl: ").append(chunk.func_1025_a(EnumSkyBlock.Block, l7 & 0xf, l8, k9 & 0xf)).append(" sl: ").append(chunk.func_1025_a(EnumSkyBlock.Sky, l7 & 0xf, l8, k9 & 0xf)).append(" rl: ").append(chunk.func_1019_c(l7 & 0xf, l8, k9 & 0xf, 0)).toString(), 2, 96, 0xe0e0e0);
            }
            if(!field_9422_g.field_6324_e.field_1026_y)
            {
                func_547_b(fontrenderer, (new StringBuilder()).append("Seed: ").append(field_9422_g.field_6324_e.func_22138_q()).toString(), 2, 112, 0xe0e0e0);
            }
            GL11.glPopMatrix();
        }
        if(field_9419_j > 0)
        {
            float f2 = (float)field_9419_j - p_4066_1_;
            int l1 = (int)((f2 * 256F) / 20F);
            if(l1 > 255)
            {
                l1 = 255;
            }
            if(l1 > 0)
            {
                GL11.glPushMatrix();
                GL11.glTranslatef(i / 2, j - 48, 0.0F);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                int j2 = 0xffffff;
                if(field_22065_l)
                {
                    j2 = Color.HSBtoRGB(f2 / 50F, 0.7F, 0.6F) & 0xffffff;
                }
                fontrenderer.func_873_b(field_9420_i, -fontrenderer.func_871_a(field_9420_i) / 2, -4, j2 + (l1 << 24));
                GL11.glDisable(3042);
                GL11.glPopMatrix();
            }
        }
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, j - 48, 0.0F);
        func_50010_a(fontrenderer);
        GL11.glPopMatrix();
        if((field_9422_g.field_6322_g instanceof EntityClientPlayerMP) && field_9422_g.field_6304_y.field_35384_x.field_35965_e)
        {
            NetClientHandler netclienthandler = ((EntityClientPlayerMP)field_9422_g.field_6322_g).field_797_bg;
            java.util.List list = netclienthandler.field_35786_c;
            int k2 = netclienthandler.field_35785_d;
            int j3 = k2;
            int i4 = 1;
            for(; j3 > 20; j3 = ((k2 + i4) - 1) / i4)
            {
                i4++;
            }

            int k4 = 300 / i4;
            if(k4 > 150)
            {
                k4 = 150;
            }
            int i5 = (i - i4 * k4) / 2;
            byte byte0 = 10;
            func_551_a(i5 - 1, byte0 - 1, i5 + k4 * i4, byte0 + 9 * j3, 0x80000000);
            for(int k6 = 0; k6 < k2; k6++)
            {
                int j7 = i5 + (k6 % i4) * k4;
                int i8 = byte0 + (k6 / i4) * 9;
                func_551_a(j7, i8, (j7 + k4) - 1, i8 + 8, 0x20ffffff);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glEnable(3008);
                if(k6 >= list.size())
                {
                    continue;
                }
                GuiPlayerInfo guiplayerinfo = (GuiPlayerInfo)list.get(k6);
                fontrenderer.func_50103_a(guiplayerinfo.field_35624_a, j7, i8, 0xffffff);
                field_9422_g.field_6315_n.func_1076_b(field_9422_g.field_6315_n.func_1070_a("/gui/icons.png"));
                int l9 = 0;
                byte byte1 = 0;
                if(guiplayerinfo.field_35623_b < 0)
                {
                    byte1 = 5;
                } else
                if(guiplayerinfo.field_35623_b < 150)
                {
                    byte1 = 0;
                } else
                if(guiplayerinfo.field_35623_b < 300)
                {
                    byte1 = 1;
                } else
                if(guiplayerinfo.field_35623_b < 600)
                {
                    byte1 = 2;
                } else
                if(guiplayerinfo.field_35623_b < 1000)
                {
                    byte1 = 3;
                } else
                {
                    byte1 = 4;
                }
                field_923_k += 100F;
                func_550_b((j7 + k4) - 12, i8, 0 + l9 * 10, 176 + byte1 * 8, 10, 8);
                field_923_k -= 100F;
            }

        }
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
    }

    private void func_50010_a(FontRenderer p_50010_1_)
    {
        byte byte0 = 10;
        boolean flag = false;
        int i = 0;
        int j = field_929_e.size();
        if(j <= 0)
        {
            return;
        }
        if(func_50015_e())
        {
            byte0 = 20;
            flag = true;
        }
        for(int k = 0; k + field_50017_n < field_929_e.size() && k < byte0; k++)
        {
            if(((ChatLine)field_929_e.get(k)).field_1296_b >= 200 && !flag)
            {
                continue;
            }
            ChatLine chatline = (ChatLine)field_929_e.get(k + field_50017_n);
            double d = (double)chatline.field_1296_b / 200D;
            d = 1.0D - d;
            d *= 10D;
            if(d < 0.0D)
            {
                d = 0.0D;
            }
            if(d > 1.0D)
            {
                d = 1.0D;
            }
            d *= d;
            int l1 = (int)(255D * d);
            if(flag)
            {
                l1 = 255;
            }
            i++;
            if(l1 > 2)
            {
                byte byte1 = 3;
                int j2 = -k * 9;
                String s = chatline.field_1297_a;
                func_551_a(byte1, j2 - 1, byte1 + 320 + 4, j2 + 8, l1 / 2 << 24);
                GL11.glEnable(3042);
                p_50010_1_.func_50103_a(s, byte1, j2, 0xffffff + (l1 << 24));
            }
        }

        if(flag)
        {
            GL11.glTranslatef(0.0F, p_50010_1_.field_41063_b, 0.0F);
            int l = j * p_50010_1_.field_41063_b + j;
            int i1 = i * p_50010_1_.field_41063_b + i;
            int j1 = (field_50017_n * i1) / j;
            int k1 = (i1 * i1) / l;
            if(l != i1)
            {
                char c = j1 <= 0 ? '`' : '\252';
                int i2 = field_50018_o ? 0xcc3333 : 0x3333aa;
                func_551_a(0, -j1, 2, -j1 - k1, i2 + (c << 24));
                func_551_a(2, -j1, 1, -j1 - k1, 0xcccccc + (c << 24));
            }
        }
    }

    private void func_41039_c()
    {
        if(RenderDragon.field_41038_a == null)
        {
            return;
        }
        EntityDragon entitydragon = RenderDragon.field_41038_a;
        RenderDragon.field_41038_a = null;
        FontRenderer fontrenderer = field_9422_g.field_6314_o;
        ScaledResolution scaledresolution = new ScaledResolution(field_9422_g.field_6304_y, field_9422_g.field_6326_c, field_9422_g.field_6325_d);
        int i = scaledresolution.func_903_a();
        char c = '\266';
        int j = i / 2 - c / 2;
        int k = (int)(((float)entitydragon.func_41010_ax() / (float)entitydragon.func_40117_c()) * (float)(c + 1));
        byte byte0 = 12;
        func_550_b(j, byte0, 0, 74, c, 5);
        func_550_b(j, byte0, 0, 74, c, 5);
        if(k > 0)
        {
            func_550_b(j, byte0, 0, 79, k, 5);
        }
        String s = "Boss health";
        fontrenderer.func_50103_a(s, i / 2 - fontrenderer.func_871_a(s) / 2, byte0 - 10, 0xff00ff);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glBindTexture(3553, field_9422_g.field_6315_n.func_1070_a("/gui/icons.png"));
    }

    private void func_4063_a(int p_4063_1_, int p_4063_2_)
    {
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3008);
        GL11.glBindTexture(3553, field_9422_g.field_6315_n.func_1070_a("%blur%/misc/pumpkinblur.png"));
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        tessellator.func_983_a(0.0D, p_4063_2_, -90D, 0.0D, 1.0D);
        tessellator.func_983_a(p_4063_1_, p_4063_2_, -90D, 1.0D, 1.0D);
        tessellator.func_983_a(p_4063_1_, 0.0D, -90D, 1.0D, 0.0D);
        tessellator.func_983_a(0.0D, 0.0D, -90D, 0.0D, 0.0D);
        tessellator.func_982_a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void func_4064_a(float p_4064_1_, int p_4064_2_, int p_4064_3_)
    {
        p_4064_1_ = 1.0F - p_4064_1_;
        if(p_4064_1_ < 0.0F)
        {
            p_4064_1_ = 0.0F;
        }
        if(p_4064_1_ > 1.0F)
        {
            p_4064_1_ = 1.0F;
        }
        field_931_c += (double)(p_4064_1_ - field_931_c) * 0.01D;
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(0, 769);
        GL11.glColor4f(field_931_c, field_931_c, field_931_c, 1.0F);
        GL11.glBindTexture(3553, field_9422_g.field_6315_n.func_1070_a("%blur%/misc/vignette.png"));
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        tessellator.func_983_a(0.0D, p_4064_3_, -90D, 0.0D, 1.0D);
        tessellator.func_983_a(p_4064_2_, p_4064_3_, -90D, 1.0D, 1.0D);
        tessellator.func_983_a(p_4064_2_, 0.0D, -90D, 1.0D, 0.0D);
        tessellator.func_983_a(0.0D, 0.0D, -90D, 0.0D, 0.0D);
        tessellator.func_982_a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glBlendFunc(770, 771);
    }

    private void func_4065_b(float p_4065_1_, int p_4065_2_, int p_4065_3_)
    {
        if(p_4065_1_ < 1.0F)
        {
            p_4065_1_ *= p_4065_1_;
            p_4065_1_ *= p_4065_1_;
            p_4065_1_ = p_4065_1_ * 0.8F + 0.2F;
        }
        GL11.glDisable(3008);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, p_4065_1_);
        GL11.glBindTexture(3553, field_9422_g.field_6315_n.func_1070_a("/terrain.png"));
        float f = (float)(Block.field_4047_bf.field_378_bb % 16) / 16F;
        float f1 = (float)(Block.field_4047_bf.field_378_bb / 16) / 16F;
        float f2 = (float)(Block.field_4047_bf.field_378_bb % 16 + 1) / 16F;
        float f3 = (float)(Block.field_4047_bf.field_378_bb / 16 + 1) / 16F;
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        tessellator.func_983_a(0.0D, p_4065_3_, -90D, f, f3);
        tessellator.func_983_a(p_4065_2_, p_4065_3_, -90D, f2, f3);
        tessellator.func_983_a(p_4065_2_, 0.0D, -90D, f2, f1);
        tessellator.func_983_a(0.0D, 0.0D, -90D, f, f1);
        tessellator.func_982_a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void func_554_a(int p_554_1_, int p_554_2_, int p_554_3_, float p_554_4_)
    {
        ItemStack itemstack = field_9422_g.field_6322_g.field_778_b.field_843_a[p_554_1_];
        if(itemstack == null)
        {
            return;
        }
        float f = (float)itemstack.field_1614_b - p_554_4_;
        if(f > 0.0F)
        {
            GL11.glPushMatrix();
            float f1 = 1.0F + f / 5F;
            GL11.glTranslatef(p_554_2_ + 8, p_554_3_ + 12, 0.0F);
            GL11.glScalef(1.0F / f1, (f1 + 1.0F) / 2.0F, 1.0F);
            GL11.glTranslatef(-(p_554_2_ + 8), -(p_554_3_ + 12), 0.0F);
        }
        field_930_d.func_161_a(field_9422_g.field_6314_o, field_9422_g.field_6315_n, itemstack, p_554_2_, p_554_3_);
        if(f > 0.0F)
        {
            GL11.glPopMatrix();
        }
        field_930_d.func_164_b(field_9422_g.field_6314_o, field_9422_g.field_6315_n, itemstack, p_554_2_, p_554_3_);
    }

    public void func_555_a()
    {
        if(field_9419_j > 0)
        {
            field_9419_j--;
        }
        field_9421_h++;
        for(int i = 0; i < field_929_e.size(); i++)
        {
            ((ChatLine)field_929_e.get(i)).field_1296_b++;
        }

    }

    public void func_28097_b()
    {
        field_929_e.clear();
        field_50016_f.clear();
    }

    public void func_552_a(String p_552_1_)
    {
        boolean flag = func_50015_e();
        boolean flag1 = true;
        String s;
        for(Iterator iterator = field_9422_g.field_6314_o.func_50108_c(p_552_1_, 320).iterator(); iterator.hasNext(); field_929_e.add(0, new ChatLine(s)))
        {
            s = (String)iterator.next();
            if(flag && field_50017_n > 0)
            {
                field_50018_o = true;
                func_50011_a(1);
            }
            if(!flag1)
            {
                s = (new StringBuilder()).append(" ").append(s).toString();
            }
            flag1 = false;
        }

        for(; field_929_e.size() > 100; field_929_e.remove(field_929_e.size() - 1)) { }
    }

    public java.util.List func_50013_c()
    {
        return field_50016_f;
    }

    public void func_50014_d()
    {
        field_50017_n = 0;
        field_50018_o = false;
    }

    public void func_50011_a(int p_50011_1_)
    {
        field_50017_n += p_50011_1_;
        int i = field_929_e.size();
        if(field_50017_n > i - 20)
        {
            field_50017_n = i - 20;
        }
        if(field_50017_n <= 0)
        {
            field_50017_n = 0;
            field_50018_o = false;
        }
    }

    public ChatClickData func_50012_a(int p_50012_1_, int p_50012_2_)
    {
        if(!func_50015_e())
        {
            return null;
        }
        ScaledResolution scaledresolution = new ScaledResolution(field_9422_g.field_6304_y, field_9422_g.field_6326_c, field_9422_g.field_6325_d);
        p_50012_2_ = p_50012_2_ / scaledresolution.field_1368_a - 40;
        p_50012_1_ = p_50012_1_ / scaledresolution.field_1368_a - 3;
        if(p_50012_1_ < 0 || p_50012_2_ < 0)
        {
            return null;
        }
        int i = Math.min(20, field_929_e.size());
        if(p_50012_1_ <= 320 && p_50012_2_ < field_9422_g.field_6314_o.field_41063_b * i + i)
        {
            int j = p_50012_2_ / (field_9422_g.field_6314_o.field_41063_b + 1) + field_50017_n;
            return new ChatClickData(field_9422_g.field_6314_o, (ChatLine)field_929_e.get(j), p_50012_1_, (p_50012_2_ - (j - field_50017_n) * field_9422_g.field_6314_o.field_41063_b) + j);
        } else
        {
            return null;
        }
    }

    public void func_553_b(String p_553_1_)
    {
        field_9420_i = (new StringBuilder()).append("Now playing: ").append(p_553_1_).toString();
        field_9419_j = 60;
        field_22065_l = true;
    }

    public boolean func_50015_e()
    {
        return field_9422_g.field_6313_p instanceof GuiChat;
    }

    public void func_22064_c(String p_22064_1_)
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        String s = stringtranslate.func_20163_a(p_22064_1_);
        func_552_a(s);
    }

}
