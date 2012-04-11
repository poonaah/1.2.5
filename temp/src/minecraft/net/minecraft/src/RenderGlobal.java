// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.nio.IntBuffer;
import java.util.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            IWorldAccess, GLAllocation, OpenGlCapsChecker, Tessellator, 
//            RenderEngine, World, RenderManager, RenderBlocks, 
//            Block, Config, BlockLeaves, GameSettings, 
//            WorldRenderer, Entity, MathHelper, EntitySorter, 
//            Profiler, TileEntityRenderer, EntityRenderer, ICamera, 
//            EntityLiving, RenderHelper, TileEntity, WorldProvider, 
//            CustomColorizer, Vec3D, EntityPlayerSP, MovingObjectPosition, 
//            EntityPlayer, EnumMovingObjectType, AxisAlignedBB, GuiIngame, 
//            SoundManager, EntityHugeExplodeFX, EntityFX, EffectRenderer, 
//            EntityLargeExplodeFX, EntityBubbleFX, EntitySuspendFX, EntityAuraFX, 
//            EntityCritFX, EntitySmokeFX, EntitySpellParticleFX, EntityNoteFX, 
//            EntityPortalFX, EntityEnchantmentTableParticleFX, EntityExplodeFX, EntityFlameFX, 
//            EntityLavaFX, EntityFootStepFX, EntitySplashFX, EntityCloudFX, 
//            EntityReddustFX, EntityBreakingFX, Item, EntityDropParticleFX, 
//            Material, EntitySnowShovelFX, EntityHeartFX, EntityDiggingFX, 
//            ImageBufferDownload, ThreadDownloadImage, RandomMobs, ItemPotion, 
//            StepSound, ItemRecord, MouseHelper, ItemStack

public class RenderGlobal
    implements IWorldAccess
{

    public List field_1458_a;
    public World field_1448_k;
    public RenderEngine field_1447_l;
    private List field_1446_m;
    private WorldRenderer field_1445_n[];
    private WorldRenderer field_1444_o[];
    private int field_1443_p;
    private int field_1442_q;
    private int field_1441_r;
    private int field_1440_s;
    public Minecraft field_1439_t;
    public RenderBlocks field_1438_u;
    private IntBuffer field_1437_v;
    private boolean field_1436_w;
    private int field_1435_x;
    private int field_1434_y;
    private int field_1433_z;
    private int field_1432_A;
    private int field_1431_B;
    private int field_1430_C;
    private int field_1429_D;
    private int field_1428_E;
    private int field_1427_F;
    private int field_1426_G;
    private int field_1425_H;
    private int field_1424_I;
    private int field_1423_J;
    private int field_1422_K;
    private int field_1421_L;
    int field_1457_b[];
    IntBuffer field_1456_c;
    private int field_1420_M;
    private int field_1419_N;
    private int field_1418_O;
    private int field_1417_P;
    private int field_1416_Q;
    private int field_40194_P;
    private int field_21156_R;
    private IntBuffer glListBuffer;
    double field_1453_f;
    double field_1452_g;
    double field_1451_h;
    public float field_1450_i;
    int field_1449_j;
    double prevReposX;
    double prevReposY;
    double prevReposZ;
    private long lastMovedTime;

    public RenderGlobal(Minecraft p_i437_1_, RenderEngine p_i437_2_)
    {
        lastMovedTime = System.currentTimeMillis();
        field_1458_a = new ArrayList();
        field_1446_m = new ArrayList();
        field_1436_w = false;
        field_1435_x = 0;
        field_1425_H = -1;
        field_1424_I = 2;
        field_1457_b = new int[50000];
        field_1456_c = GLAllocation.func_1125_c(64);
        glListBuffer = BufferUtils.createIntBuffer(0x10000);
        field_1453_f = -9999D;
        field_1452_g = -9999D;
        field_1451_h = -9999D;
        field_1449_j = 0;
        field_1439_t = p_i437_1_;
        field_1447_l = p_i437_2_;
        byte byte0 = 65;
        byte byte1 = 16;
        field_1440_s = GLAllocation.func_1124_a(byte0 * byte0 * byte1 * 3);
        field_1436_w = OpenGlCapsChecker.func_1213_a();
        if(field_1436_w)
        {
            field_1456_c.clear();
            field_1437_v = GLAllocation.func_1125_c(byte0 * byte0 * byte1);
            field_1437_v.clear();
            field_1437_v.position(0);
            field_1437_v.limit(byte0 * byte0 * byte1);
            ARBOcclusionQuery.glGenQueriesARB(field_1437_v);
        }
        field_1434_y = GLAllocation.func_1124_a(3);
        GL11.glPushMatrix();
        GL11.glNewList(field_1434_y, 4864);
        func_950_f();
        GL11.glEndList();
        GL11.glPopMatrix();
        Tessellator tessellator = Tessellator.field_1512_a;
        field_1433_z = field_1434_y + 1;
        GL11.glNewList(field_1433_z, 4864);
        byte byte2 = 64;
        int i = 256 / byte2 + 2;
        float f = 16F;
        for(int j = -byte2 * i; j <= byte2 * i; j += byte2)
        {
            for(int l = -byte2 * i; l <= byte2 * i; l += byte2)
            {
                tessellator.func_977_b();
                tessellator.func_991_a(j + 0, f, l + 0);
                tessellator.func_991_a(j + byte2, f, l + 0);
                tessellator.func_991_a(j + byte2, f, l + byte2);
                tessellator.func_991_a(j + 0, f, l + byte2);
                tessellator.func_982_a();
            }

        }

        GL11.glEndList();
        field_1432_A = field_1434_y + 2;
        GL11.glNewList(field_1432_A, 4864);
        f = -16F;
        tessellator.func_977_b();
        for(int k = -byte2 * i; k <= byte2 * i; k += byte2)
        {
            for(int i1 = -byte2 * i; i1 <= byte2 * i; i1 += byte2)
            {
                tessellator.func_991_a(k + byte2, f, i1 + 0);
                tessellator.func_991_a(k + 0, f, i1 + 0);
                tessellator.func_991_a(k + 0, f, i1 + byte2);
                tessellator.func_991_a(k + byte2, f, i1 + byte2);
            }

        }

        tessellator.func_982_a();
        GL11.glEndList();
        field_1447_l.func_1067_a();
    }

    private void func_950_f()
    {
        Random random = new Random(10842L);
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        for(int i = 0; i < 1500; i++)
        {
            double d = random.nextFloat() * 2.0F - 1.0F;
            double d1 = random.nextFloat() * 2.0F - 1.0F;
            double d2 = random.nextFloat() * 2.0F - 1.0F;
            double d3 = 0.25F + random.nextFloat() * 0.25F;
            double d4 = d * d + d1 * d1 + d2 * d2;
            if(d4 >= 1.0D || d4 <= 0.01D)
            {
                continue;
            }
            d4 = 1.0D / Math.sqrt(d4);
            d *= d4;
            d1 *= d4;
            d2 *= d4;
            double d5 = d * 100D;
            double d6 = d1 * 100D;
            double d7 = d2 * 100D;
            double d8 = Math.atan2(d, d2);
            double d9 = Math.sin(d8);
            double d10 = Math.cos(d8);
            double d11 = Math.atan2(Math.sqrt(d * d + d2 * d2), d1);
            double d12 = Math.sin(d11);
            double d13 = Math.cos(d11);
            double d14 = random.nextDouble() * 3.1415926535897931D * 2D;
            double d15 = Math.sin(d14);
            double d16 = Math.cos(d14);
            for(int j = 0; j < 4; j++)
            {
                double d17 = 0.0D;
                double d18 = (double)((j & 2) - 1) * d3;
                double d19 = (double)((j + 1 & 2) - 1) * d3;
                double d20 = d17;
                double d21 = d18 * d16 - d19 * d15;
                double d22 = d19 * d16 + d18 * d15;
                double d23 = d22;
                double d24 = d21 * d12 + d20 * d13;
                double d25 = d20 * d12 - d21 * d13;
                double d26 = d25 * d9 - d23 * d10;
                double d27 = d24;
                double d28 = d23 * d9 + d25 * d10;
                tessellator.func_991_a(d5 + d26, d6 + d27, d7 + d28);
            }

        }

        tessellator.func_982_a();
    }

    public void func_946_a(World p_946_1_)
    {
        if(field_1448_k != null)
        {
            field_1448_k.func_672_b(this);
        }
        field_1453_f = -9999D;
        field_1452_g = -9999D;
        field_1451_h = -9999D;
        RenderManager.field_1233_a.func_852_a(p_946_1_);
        field_1448_k = p_946_1_;
        field_1438_u = new RenderBlocks(p_946_1_);
        if(p_946_1_ != null)
        {
            p_946_1_.func_613_a(this);
            func_958_a();
        }
    }

    public void func_958_a()
    {
        if(field_1448_k == null)
        {
            return;
        }
        Block.field_384_L.func_310_a(Config.isTreesFancy());
        field_1425_H = field_1439_t.field_6304_y.field_1580_e;
        if(field_1444_o != null)
        {
            for(int i = 0; i < field_1444_o.length; i++)
            {
                field_1444_o[i].func_1204_c();
            }

        }
        int j = 64 << 3 - field_1425_H;
        char c = '\u0200';
        j = 2 * field_1439_t.field_6304_y.ofRenderDistanceFine;
        if(Config.isLoadChunksFar() && j < c)
        {
            j = c;
        }
        j += Config.getPreloadedChunks() * 2 * 16;
        char c1 = '\u0190';
        if(field_1439_t.field_6304_y.ofRenderDistanceFine > 256)
        {
            c1 = '\u0400';
        }
        if(j > c1)
        {
            j = c1;
        }
        prevReposX = -9999D;
        prevReposY = -9999D;
        prevReposZ = -9999D;
        field_1443_p = j / 16 + 1;
        field_1442_q = 16;
        field_1441_r = j / 16 + 1;
        field_1444_o = new WorldRenderer[field_1443_p * field_1442_q * field_1441_r];
        field_1445_n = new WorldRenderer[field_1443_p * field_1442_q * field_1441_r];
        int k = 0;
        int l = 0;
        field_1431_B = 0;
        field_1430_C = 0;
        field_1429_D = 0;
        field_1428_E = field_1443_p;
        field_1427_F = field_1442_q;
        field_1426_G = field_1441_r;
        for(int i1 = 0; i1 < field_1446_m.size(); i1++)
        {
            WorldRenderer worldrenderer = (WorldRenderer)field_1446_m.get(i1);
            if(worldrenderer != null)
            {
                worldrenderer.field_1738_u = false;
            }
        }

        field_1446_m.clear();
        field_1458_a.clear();
        for(int j1 = 0; j1 < field_1443_p; j1++)
        {
            for(int k1 = 0; k1 < field_1442_q; k1++)
            {
                for(int l1 = 0; l1 < field_1441_r; l1++)
                {
                    int i2 = (l1 * field_1442_q + k1) * field_1443_p + j1;
                    field_1444_o[i2] = new WorldRenderer(field_1448_k, field_1458_a, j1 * 16, k1 * 16, l1 * 16, field_1440_s + k);
                    if(field_1436_w)
                    {
                        field_1444_o[i2].field_1732_z = field_1437_v.get(l);
                    }
                    field_1444_o[i2].field_1733_y = false;
                    field_1444_o[i2].field_1734_x = true;
                    field_1444_o[i2].field_1749_o = false;
                    field_1444_o[i2].field_1735_w = l++;
                    field_1444_o[i2].func_1194_f();
                    field_1445_n[i2] = field_1444_o[i2];
                    field_1446_m.add(field_1444_o[i2]);
                    k += 3;
                }

            }

        }

        if(field_1448_k != null)
        {
            Object obj = field_1439_t.field_22009_h;
            if(obj == null)
            {
                obj = field_1439_t.field_6322_g;
            }
            if(obj != null)
            {
                func_956_b(MathHelper.func_1108_b(((Entity) (obj)).field_611_ak), MathHelper.func_1108_b(((Entity) (obj)).field_610_al), MathHelper.func_1108_b(((Entity) (obj)).field_609_am));
                Arrays.sort(field_1445_n, new EntitySorter(((Entity) (obj))));
            }
        }
        field_1424_I = 2;
    }

    public void func_951_a(Vec3D p_951_1_, ICamera p_951_2_, float p_951_3_)
    {
        if(field_1424_I > 0)
        {
            field_1424_I--;
            return;
        }
        Profiler.func_40663_a("prepare");
        TileEntityRenderer.field_1554_a.func_22267_a(field_1448_k, field_1447_l, field_1439_t.field_6314_o, field_1439_t.field_22009_h, p_951_3_);
        RenderManager.field_1233_a.func_22187_a(field_1448_k, field_1447_l, field_1439_t.field_6314_o, field_1439_t.field_22009_h, field_1439_t.field_6304_y, p_951_3_);
        TileEntityRenderer.field_1554_a.func_40742_a();
        field_1423_J = 0;
        field_1422_K = 0;
        field_1421_L = 0;
        EntityLiving entityliving = field_1439_t.field_22009_h;
        RenderManager.field_1232_b = ((Entity) (entityliving)).field_638_aI + (((Entity) (entityliving)).field_611_ak - ((Entity) (entityliving)).field_638_aI) * (double)p_951_3_;
        RenderManager.field_1231_c = ((Entity) (entityliving)).field_637_aJ + (((Entity) (entityliving)).field_610_al - ((Entity) (entityliving)).field_637_aJ) * (double)p_951_3_;
        RenderManager.field_1230_d = ((Entity) (entityliving)).field_636_aK + (((Entity) (entityliving)).field_609_am - ((Entity) (entityliving)).field_636_aK) * (double)p_951_3_;
        TileEntityRenderer.field_1553_b = ((Entity) (entityliving)).field_638_aI + (((Entity) (entityliving)).field_611_ak - ((Entity) (entityliving)).field_638_aI) * (double)p_951_3_;
        TileEntityRenderer.field_1552_c = ((Entity) (entityliving)).field_637_aJ + (((Entity) (entityliving)).field_610_al - ((Entity) (entityliving)).field_637_aJ) * (double)p_951_3_;
        TileEntityRenderer.field_1551_d = ((Entity) (entityliving)).field_636_aK + (((Entity) (entityliving)).field_609_am - ((Entity) (entityliving)).field_636_aK) * (double)p_951_3_;
        field_1439_t.field_9243_r.func_35806_b(p_951_3_);
        Profiler.func_40661_c("global");
        List list = field_1448_k.func_658_i();
        field_1423_J = list.size();
        for(int i = 0; i < field_1448_k.field_27173_e.size(); i++)
        {
            Entity entity = (Entity)field_1448_k.field_27173_e.get(i);
            field_1422_K++;
            if(entity.func_390_a(p_951_1_))
            {
                RenderManager.field_1233_a.func_854_a(entity, p_951_3_);
            }
        }

        Profiler.func_40661_c("entities");
        for(int j = 0; j < list.size(); j++)
        {
            Entity entity1 = (Entity)list.get(j);
            if(entity1.func_390_a(p_951_1_) && (entity1.field_28016_bK || p_951_2_.func_342_a(entity1.field_601_au)) && (entity1 != field_1439_t.field_22009_h || field_1439_t.field_6304_y.field_1560_x != 0 || field_1439_t.field_22009_h.func_22051_K()) && field_1448_k.func_630_d(MathHelper.func_1108_b(entity1.field_611_ak), 0, MathHelper.func_1108_b(entity1.field_609_am)))
            {
                field_1422_K++;
                RenderManager.field_1233_a.func_854_a(entity1, p_951_3_);
            }
        }

        Profiler.func_40661_c("tileentities");
        RenderHelper.func_1158_b();
        for(int k = 0; k < field_1458_a.size(); k++)
        {
            TileEntityRenderer.field_1554_a.func_1030_a((TileEntity)field_1458_a.get(k), p_951_3_);
        }

        field_1439_t.field_9243_r.func_35810_a(p_951_3_);
        Profiler.func_40662_b();
    }

    public String func_953_b()
    {
        return (new StringBuilder()).append("C: ").append(field_1417_P).append("/").append(field_1420_M).append(". F: ").append(field_1419_N).append(", O: ").append(field_1418_O).append(", E: ").append(field_1416_Q).toString();
    }

    public String func_957_c()
    {
        return (new StringBuilder()).append((new StringBuilder()).append("E: ").append(field_1422_K).append("/").append(field_1423_J).append(". B: ").append(field_1421_L).append(", I: ").append(field_1423_J - field_1421_L - field_1422_K).toString()).append(", ").append(Config.getVersion()).toString();
    }

    private void func_956_b(int p_956_1_, int p_956_2_, int p_956_3_)
    {
        p_956_1_ -= 8;
        p_956_2_ -= 8;
        p_956_3_ -= 8;
        field_1431_B = 0x7fffffff;
        field_1430_C = 0x7fffffff;
        field_1429_D = 0x7fffffff;
        field_1428_E = 0x80000000;
        field_1427_F = 0x80000000;
        field_1426_G = 0x80000000;
        int i = field_1443_p * 16;
        int j = i / 2;
        for(int k = 0; k < field_1443_p; k++)
        {
            int l = k * 16;
            int i1 = (l + j) - p_956_1_;
            if(i1 < 0)
            {
                i1 -= i - 1;
            }
            i1 /= i;
            l -= i1 * i;
            if(l < field_1431_B)
            {
                field_1431_B = l;
            }
            if(l > field_1428_E)
            {
                field_1428_E = l;
            }
            for(int j1 = 0; j1 < field_1441_r; j1++)
            {
                int k1 = j1 * 16;
                int l1 = (k1 + j) - p_956_3_;
                if(l1 < 0)
                {
                    l1 -= i - 1;
                }
                l1 /= i;
                k1 -= l1 * i;
                if(k1 < field_1429_D)
                {
                    field_1429_D = k1;
                }
                if(k1 > field_1426_G)
                {
                    field_1426_G = k1;
                }
                for(int i2 = 0; i2 < field_1442_q; i2++)
                {
                    int j2 = i2 * 16;
                    if(j2 < field_1430_C)
                    {
                        field_1430_C = j2;
                    }
                    if(j2 > field_1427_F)
                    {
                        field_1427_F = j2;
                    }
                    WorldRenderer worldrenderer = field_1444_o[(j1 * field_1442_q + i2) * field_1443_p + k];
                    boolean flag = worldrenderer.field_1738_u;
                    worldrenderer.func_1197_a(l, j2, k1);
                    if(!flag && worldrenderer.field_1738_u)
                    {
                        field_1446_m.add(worldrenderer);
                    }
                }

            }

        }

    }

    public int func_943_a(EntityLiving p_943_1_, int p_943_2_, double p_943_3_)
    {
        Profiler.func_40663_a("sortchunks");
        if(field_1446_m.size() < 10)
        {
            byte byte0 = 10;
            for(int i = 0; i < byte0; i++)
            {
                field_21156_R = (field_21156_R + 1) % field_1444_o.length;
                WorldRenderer worldrenderer = field_1444_o[field_21156_R];
                if(worldrenderer.field_1738_u && !field_1446_m.contains(worldrenderer))
                {
                    field_1446_m.add(worldrenderer);
                }
            }

        }
        if(field_1439_t.field_6304_y.field_1580_e != field_1425_H && !Config.isLoadChunksFar())
        {
            func_958_a();
        }
        if(p_943_2_ == 0)
        {
            field_1420_M = 0;
            field_40194_P = 0;
            field_1419_N = 0;
            field_1418_O = 0;
            field_1417_P = 0;
            field_1416_Q = 0;
        }
        double d = p_943_1_.field_638_aI + (p_943_1_.field_611_ak - p_943_1_.field_638_aI) * p_943_3_;
        double d1 = p_943_1_.field_637_aJ + (p_943_1_.field_610_al - p_943_1_.field_637_aJ) * p_943_3_;
        double d2 = p_943_1_.field_636_aK + (p_943_1_.field_609_am - p_943_1_.field_636_aK) * p_943_3_;
        double d3 = p_943_1_.field_611_ak - field_1453_f;
        double d4 = p_943_1_.field_610_al - field_1452_g;
        double d5 = p_943_1_.field_609_am - field_1451_h;
        double d6 = d3 * d3 + d4 * d4 + d5 * d5;
        if(d6 > 16D)
        {
            field_1453_f = p_943_1_.field_611_ak;
            field_1452_g = p_943_1_.field_610_al;
            field_1451_h = p_943_1_.field_609_am;
            int j = Config.getPreloadedChunks() * 16;
            double d7 = p_943_1_.field_611_ak - prevReposX;
            double d8 = p_943_1_.field_610_al - prevReposY;
            double d9 = p_943_1_.field_609_am - prevReposZ;
            double d10 = d7 * d7 + d8 * d8 + d9 * d9;
            if(d10 > (double)(j * j) + 16D)
            {
                prevReposX = p_943_1_.field_611_ak;
                prevReposY = p_943_1_.field_610_al;
                prevReposZ = p_943_1_.field_609_am;
                func_956_b(MathHelper.func_1108_b(p_943_1_.field_611_ak), MathHelper.func_1108_b(p_943_1_.field_610_al), MathHelper.func_1108_b(p_943_1_.field_609_am));
            }
            Arrays.sort(field_1445_n, new EntitySorter(p_943_1_));
            int j2 = (int)p_943_1_.field_611_ak;
            int k2 = (int)p_943_1_.field_609_am;
            char c = '\u07D0';
            if(Math.abs(j2 - WorldRenderer.globalChunkOffsetX) > c || Math.abs(k2 - WorldRenderer.globalChunkOffsetZ) > c)
            {
                WorldRenderer.globalChunkOffsetX = j2;
                WorldRenderer.globalChunkOffsetZ = k2;
                func_958_a();
            }
        }
        RenderHelper.func_1159_a();
        if(field_1439_t.field_6304_y.ofSmoothFps && p_943_2_ == 0)
        {
            GL11.glFinish();
        }
        int k = 0;
        int l = 0;
        if(field_1436_w && field_1439_t.field_6304_y.field_27342_h && !field_1439_t.field_6304_y.field_1578_g && p_943_2_ == 0)
        {
            int i1 = 0;
            byte byte1 = 20;
            checkOcclusionQueryResult(i1, byte1, p_943_1_.field_611_ak, p_943_1_.field_610_al, p_943_1_.field_609_am);
            for(int j1 = i1; j1 < byte1; j1++)
            {
                field_1445_n[j1].field_1734_x = true;
            }

            Profiler.func_40661_c("render");
            k += func_952_a(i1, byte1, p_943_2_, p_943_3_);
            int k1 = byte1;
            int l1 = 0;
            byte byte2 = 30;
            int i2 = field_1443_p / 2;
            while(k1 < field_1445_n.length) 
            {
                Profiler.func_40661_c("occ");
                byte byte3 = k1;
                if(l1 < i2)
                {
                    l1++;
                } else
                {
                    l1--;
                }
                k1 = byte3 + l1 * byte2;
                if(k1 <= byte3)
                {
                    k1 = byte3 + 10;
                }
                if(k1 > field_1445_n.length)
                {
                    k1 = field_1445_n.length;
                }
                GL11.glDisable(3553);
                GL11.glDisable(2896);
                GL11.glDisable(3008);
                GL11.glDisable(2912);
                GL11.glColorMask(false, false, false, false);
                GL11.glDepthMask(false);
                Profiler.func_40663_a("check");
                checkOcclusionQueryResult(byte3, k1, p_943_1_.field_611_ak, p_943_1_.field_610_al, p_943_1_.field_609_am);
                Profiler.func_40662_b();
                GL11.glPushMatrix();
                float f = 0.0F;
                float f1 = 0.0F;
                float f2 = 0.0F;
                for(int l2 = byte3; l2 < k1; l2++)
                {
                    WorldRenderer worldrenderer1 = field_1445_n[l2];
                    if(worldrenderer1.func_1196_e())
                    {
                        worldrenderer1.field_1749_o = false;
                        continue;
                    }
                    if(!worldrenderer1.field_1749_o)
                    {
                        continue;
                    }
                    if(Config.isOcclusionFancy() && !worldrenderer1.isInFrustrumFully)
                    {
                        worldrenderer1.field_1734_x = true;
                        continue;
                    }
                    if(!worldrenderer1.field_1749_o || worldrenderer1.field_1733_y)
                    {
                        continue;
                    }
                    if(worldrenderer1.isVisibleFromPosition)
                    {
                        float f3 = Math.abs((float)(worldrenderer1.visibleFromX - p_943_1_.field_611_ak));
                        float f5 = Math.abs((float)(worldrenderer1.visibleFromY - p_943_1_.field_610_al));
                        float f7 = Math.abs((float)(worldrenderer1.visibleFromZ - p_943_1_.field_609_am));
                        float f9 = f3 + f5 + f7;
                        if((double)f9 < 10D + (double)l2 / 1000D)
                        {
                            worldrenderer1.field_1734_x = true;
                            continue;
                        }
                        worldrenderer1.isVisibleFromPosition = false;
                    }
                    float f4 = (float)((double)worldrenderer1.field_1755_i - d);
                    float f6 = (float)((double)worldrenderer1.field_1754_j - d1);
                    float f8 = (float)((double)worldrenderer1.field_1753_k - d2);
                    float f10 = f4 - f;
                    float f11 = f6 - f1;
                    float f12 = f8 - f2;
                    if(f10 != 0.0F || f11 != 0.0F || f12 != 0.0F)
                    {
                        GL11.glTranslatef(f10, f11, f12);
                        f += f10;
                        f1 += f11;
                        f2 += f12;
                    }
                    Profiler.func_40663_a("bb");
                    ARBOcclusionQuery.glBeginQueryARB(35092, worldrenderer1.field_1732_z);
                    worldrenderer1.func_1201_d();
                    ARBOcclusionQuery.glEndQueryARB(35092);
                    Profiler.func_40662_b();
                    worldrenderer1.field_1733_y = true;
                    l++;
                }

                GL11.glPopMatrix();
                if(field_1439_t.field_6304_y.field_1578_g)
                {
                    if(EntityRenderer.field_28134_b == 0)
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
                GL11.glDepthMask(true);
                GL11.glEnable(3553);
                GL11.glEnable(3008);
                GL11.glEnable(2912);
                Profiler.func_40661_c("render");
                k += func_952_a(byte3, k1, p_943_2_, p_943_3_);
            }
        } else
        {
            Profiler.func_40661_c("render");
            k += func_952_a(0, field_1445_n.length, p_943_2_, p_943_3_);
        }
        Profiler.func_40662_b();
        return k;
    }

    private void checkOcclusionQueryResult(int i, int j, double d, double d1, double d2)
    {
        for(int k = i; k < j; k++)
        {
            WorldRenderer worldrenderer = field_1445_n[k];
            if(!worldrenderer.field_1733_y)
            {
                continue;
            }
            field_1456_c.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB(worldrenderer.field_1732_z, 34919, field_1456_c);
            if(field_1456_c.get(0) == 0)
            {
                continue;
            }
            worldrenderer.field_1733_y = false;
            field_1456_c.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB(worldrenderer.field_1732_z, 34918, field_1456_c);
            boolean flag = worldrenderer.field_1734_x;
            worldrenderer.field_1734_x = field_1456_c.get(0) > 0;
            if(flag && worldrenderer.field_1734_x)
            {
                worldrenderer.isVisibleFromPosition = true;
                worldrenderer.visibleFromX = d;
                worldrenderer.visibleFromY = d1;
                worldrenderer.visibleFromZ = d2;
            }
        }

    }

    private int func_952_a(int p_952_1_, int p_952_2_, int p_952_3_, double p_952_4_)
    {
        if(Config.isFogOff())
        {
            GL11.glDisable(2912);
        }
        glListBuffer.clear();
        int i = 0;
        for(int j = p_952_1_; j < p_952_2_; j++)
        {
            WorldRenderer worldrenderer = field_1445_n[j];
            if(p_952_3_ == 0)
            {
                field_1420_M++;
                if(worldrenderer.field_1748_p[p_952_3_])
                {
                    field_1416_Q++;
                } else
                if(!worldrenderer.field_1749_o)
                {
                    field_1419_N++;
                } else
                if(field_1436_w && !worldrenderer.field_1734_x)
                {
                    field_1418_O++;
                } else
                {
                    field_1417_P++;
                }
            }
            if(worldrenderer.field_1748_p[p_952_3_] || !worldrenderer.field_1749_o || field_1436_w && !worldrenderer.field_1734_x)
            {
                continue;
            }
            int k = worldrenderer.func_1200_a(p_952_3_);
            if(k >= 0)
            {
                glListBuffer.put(k);
                i++;
            }
        }

        glListBuffer.flip();
        EntityLiving entityliving = field_1439_t.field_22009_h;
        double d = (entityliving.field_638_aI + (entityliving.field_611_ak - entityliving.field_638_aI) * p_952_4_) - (double)WorldRenderer.globalChunkOffsetX;
        double d1 = entityliving.field_637_aJ + (entityliving.field_610_al - entityliving.field_637_aJ) * p_952_4_;
        double d2 = (entityliving.field_636_aK + (entityliving.field_609_am - entityliving.field_636_aK) * p_952_4_) - (double)WorldRenderer.globalChunkOffsetZ;
        field_1439_t.field_9243_r.func_35806_b(p_952_4_);
        GL11.glTranslatef((float)(-d), (float)(-d1), (float)(-d2));
        GL11.glCallLists(glListBuffer);
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        field_1439_t.field_9243_r.func_35810_a(p_952_4_);
        return i;
    }

    public void func_944_a(int i, double d)
    {
    }

    public void func_945_d()
    {
        field_1435_x++;
    }

    public void func_4142_a(float p_4142_1_)
    {
        if(field_1439_t.field_6324_e.field_4209_q.field_4218_e == 1)
        {
            if(!Config.isSkyEnabled())
            {
                return;
            }
            GL11.glDisable(2912);
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            RenderHelper.func_1159_a();
            GL11.glDepthMask(false);
            field_1447_l.func_1076_b(field_1447_l.func_1070_a("/misc/tunnel.png"));
            Tessellator tessellator = Tessellator.field_1512_a;
            for(int i = 0; i < 6; i++)
            {
                GL11.glPushMatrix();
                if(i == 1)
                {
                    GL11.glRotatef(90F, 1.0F, 0.0F, 0.0F);
                }
                if(i == 2)
                {
                    GL11.glRotatef(-90F, 1.0F, 0.0F, 0.0F);
                }
                if(i == 3)
                {
                    GL11.glRotatef(180F, 1.0F, 0.0F, 0.0F);
                }
                if(i == 4)
                {
                    GL11.glRotatef(90F, 0.0F, 0.0F, 1.0F);
                }
                if(i == 5)
                {
                    GL11.glRotatef(-90F, 0.0F, 0.0F, 1.0F);
                }
                tessellator.func_977_b();
                tessellator.func_990_b(0x181818);
                tessellator.func_983_a(-100D, -100D, -100D, 0.0D, 0.0D);
                tessellator.func_983_a(-100D, -100D, 100D, 0.0D, 16D);
                tessellator.func_983_a(100D, -100D, 100D, 16D, 16D);
                tessellator.func_983_a(100D, -100D, -100D, 16D, 0.0D);
                tessellator.func_982_a();
                GL11.glPopMatrix();
            }

            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glEnable(3008);
            return;
        }
        if(!field_1439_t.field_6324_e.field_4209_q.func_48217_e())
        {
            return;
        }
        GL11.glDisable(3553);
        Vec3D vec3d = field_1448_k.func_4079_a(field_1439_t.field_22009_h, p_4142_1_);
        vec3d = CustomColorizer.getSkyColor(vec3d, field_1439_t.field_6324_e, field_1439_t.field_22009_h.field_611_ak, field_1439_t.field_22009_h.field_610_al + 1.0D, field_1439_t.field_22009_h.field_609_am);
        float f = (float)vec3d.field_1776_a;
        float f1 = (float)vec3d.field_1775_b;
        float f2 = (float)vec3d.field_1779_c;
        if(field_1439_t.field_6304_y.field_1578_g)
        {
            float f3 = (f * 30F + f1 * 59F + f2 * 11F) / 100F;
            float f4 = (f * 30F + f1 * 70F) / 100F;
            float f5 = (f * 30F + f2 * 70F) / 100F;
            f = f3;
            f1 = f4;
            f2 = f5;
        }
        GL11.glColor3f(f, f1, f2);
        Tessellator tessellator1 = Tessellator.field_1512_a;
        GL11.glDepthMask(false);
        GL11.glEnable(2912);
        GL11.glColor3f(f, f1, f2);
        if(Config.isSkyEnabled())
        {
            GL11.glCallList(field_1433_z);
        }
        GL11.glDisable(2912);
        GL11.glDisable(3008);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        RenderHelper.func_1159_a();
        float af[] = field_1448_k.field_4209_q.func_4097_b(field_1448_k.func_619_c(p_4142_1_), p_4142_1_);
        if(af != null && Config.isSunMoonEnabled())
        {
            GL11.glDisable(3553);
            GL11.glShadeModel(7425);
            GL11.glPushMatrix();
            GL11.glRotatef(90F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(MathHelper.func_1106_a(field_1448_k.func_35456_d(p_4142_1_)) < 0.0F ? 180F : 0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(90F, 0.0F, 0.0F, 1.0F);
            float f6 = af[0];
            float f7 = af[1];
            float f8 = af[2];
            if(field_1439_t.field_6304_y.field_1578_g)
            {
                float f10 = (f6 * 30F + f7 * 59F + f8 * 11F) / 100F;
                float f12 = (f6 * 30F + f7 * 70F) / 100F;
                float f14 = (f6 * 30F + f8 * 70F) / 100F;
                f6 = f10;
                f7 = f12;
                f8 = f14;
            }
            tessellator1.func_992_a(6);
            tessellator1.func_986_a(f6, f7, f8, af[3]);
            tessellator1.func_991_a(0.0D, 100D, 0.0D);
            int j = 16;
            tessellator1.func_986_a(af[0], af[1], af[2], 0.0F);
            for(int k = 0; k <= j; k++)
            {
                float f15 = ((float)k * 3.141593F * 2.0F) / (float)j;
                float f18 = MathHelper.func_1106_a(f15);
                float f20 = MathHelper.func_1114_b(f15);
                tessellator1.func_991_a(f18 * 120F, f20 * 120F, -f20 * 40F * af[3]);
            }

            tessellator1.func_982_a();
            GL11.glPopMatrix();
            GL11.glShadeModel(7424);
        }
        GL11.glEnable(3553);
        GL11.glBlendFunc(770, 1);
        GL11.glPushMatrix();
        double d = 1.0F - field_1448_k.func_27162_g(p_4142_1_);
        float f9 = 0.0F;
        float f11 = 0.0F;
        float f13 = 0.0F;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, (float)d);
        GL11.glTranslatef(f9, f11, f13);
        GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(field_1448_k.func_619_c(p_4142_1_) * 360F, 1.0F, 0.0F, 0.0F);
        if(Config.isSunMoonEnabled())
        {
            float f16 = 30F;
            GL11.glBindTexture(3553, field_1447_l.func_1070_a("/terrain/sun.png"));
            tessellator1.func_977_b();
            tessellator1.func_983_a(-f16, 100D, -f16, 0.0D, 0.0D);
            tessellator1.func_983_a(f16, 100D, -f16, 1.0D, 0.0D);
            tessellator1.func_983_a(f16, 100D, f16, 1.0D, 1.0D);
            tessellator1.func_983_a(-f16, 100D, f16, 0.0D, 1.0D);
            tessellator1.func_982_a();
            f16 = 20F;
            GL11.glBindTexture(3553, field_1447_l.func_1070_a("/terrain/moon_phases.png"));
            int l = field_1448_k.func_40475_d(p_4142_1_);
            int i1 = l % 4;
            int j1 = (l / 4) % 2;
            float f23 = (float)(i1 + 0) / 4F;
            float f25 = (float)(j1 + 0) / 2.0F;
            float f26 = (float)(i1 + 1) / 4F;
            float f27 = (float)(j1 + 1) / 2.0F;
            tessellator1.func_977_b();
            tessellator1.func_983_a(-f16, -100D, f16, f26, f27);
            tessellator1.func_983_a(f16, -100D, f16, f23, f27);
            tessellator1.func_983_a(f16, -100D, -f16, f23, f25);
            tessellator1.func_983_a(-f16, -100D, -f16, f26, f25);
            tessellator1.func_982_a();
        }
        GL11.glDisable(3553);
        float f17 = (float)((double)field_1448_k.func_679_f(p_4142_1_) * d);
        if(f17 > 0.0F && Config.isStarsEnabled())
        {
            GL11.glColor4f(f17, f17, f17, f17);
            GL11.glCallList(field_1434_y);
        }
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glEnable(2912);
        GL11.glPopMatrix();
        GL11.glDisable(3553);
        GL11.glColor3f(0.0F, 0.0F, 0.0F);
        d = field_1439_t.field_6322_g.func_427_e(p_4142_1_).field_1775_b - field_1448_k.func_46068_G();
        if(d < 0.0D && Config.isSkyEnabled())
        {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 12F, 0.0F);
            GL11.glCallList(field_1432_A);
            GL11.glPopMatrix();
            float f19 = 1.0F;
            float f21 = -(float)(d + 65D);
            float f22 = -f19;
            float f24 = f21;
            tessellator1.func_977_b();
            tessellator1.func_6513_a(0, 255);
            tessellator1.func_991_a(-f19, f24, f19);
            tessellator1.func_991_a(f19, f24, f19);
            tessellator1.func_991_a(f19, f22, f19);
            tessellator1.func_991_a(-f19, f22, f19);
            tessellator1.func_991_a(-f19, f22, -f19);
            tessellator1.func_991_a(f19, f22, -f19);
            tessellator1.func_991_a(f19, f24, -f19);
            tessellator1.func_991_a(-f19, f24, -f19);
            tessellator1.func_991_a(f19, f22, -f19);
            tessellator1.func_991_a(f19, f22, f19);
            tessellator1.func_991_a(f19, f24, f19);
            tessellator1.func_991_a(f19, f24, -f19);
            tessellator1.func_991_a(-f19, f24, -f19);
            tessellator1.func_991_a(-f19, f24, f19);
            tessellator1.func_991_a(-f19, f22, f19);
            tessellator1.func_991_a(-f19, f22, -f19);
            tessellator1.func_991_a(-f19, f22, -f19);
            tessellator1.func_991_a(-f19, f22, f19);
            tessellator1.func_991_a(f19, f22, f19);
            tessellator1.func_991_a(f19, f22, -f19);
            tessellator1.func_982_a();
        }
        if(field_1448_k.field_4209_q.func_28112_c())
        {
            GL11.glColor3f(f * 0.2F + 0.04F, f1 * 0.2F + 0.04F, f2 * 0.6F + 0.1F);
        } else
        {
            GL11.glColor3f(f, f1, f2);
        }
        if(field_1439_t.field_6304_y.ofRenderDistanceFine <= 64)
        {
            GL11.glColor3f(field_1439_t.field_9243_r.field_4270_e, field_1439_t.field_9243_r.field_4269_f, field_1439_t.field_9243_r.field_4268_g);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, -(float)(d - 16D), 0.0F);
        if(Config.isSkyEnabled())
        {
            GL11.glCallList(field_1432_A);
        }
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glDepthMask(true);
    }

    public void func_4141_b(float p_4141_1_)
    {
        if(!field_1439_t.field_6324_e.field_4209_q.func_48217_e())
        {
            return;
        }
        if(field_1439_t.field_6304_y.ofClouds == 3)
        {
            return;
        }
        if(Config.isCloudsFancy())
        {
            func_6510_c(p_4141_1_);
            return;
        }
        GL11.glDisable(2884);
        float f = (float)(field_1439_t.field_22009_h.field_637_aJ + (field_1439_t.field_22009_h.field_610_al - field_1439_t.field_22009_h.field_637_aJ) * (double)p_4141_1_);
        byte byte0 = 32;
        int i = 256 / byte0;
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glBindTexture(3553, field_1447_l.func_1070_a("/environment/clouds.png"));
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        Vec3D vec3d = field_1448_k.func_628_d(p_4141_1_);
        float f1 = (float)vec3d.field_1776_a;
        float f2 = (float)vec3d.field_1775_b;
        float f3 = (float)vec3d.field_1779_c;
        if(field_1439_t.field_6304_y.field_1578_g)
        {
            float f4 = (f1 * 30F + f2 * 59F + f3 * 11F) / 100F;
            float f6 = (f1 * 30F + f2 * 70F) / 100F;
            float f7 = (f1 * 30F + f3 * 70F) / 100F;
            f1 = f4;
            f2 = f6;
            f3 = f7;
        }
        float f5 = 0.0004882813F;
        double d = (float)field_1435_x + p_4141_1_;
        double d1 = field_1439_t.field_22009_h.field_9285_at + (field_1439_t.field_22009_h.field_611_ak - field_1439_t.field_22009_h.field_9285_at) * (double)p_4141_1_ + d * 0.029999999329447746D;
        double d2 = field_1439_t.field_22009_h.field_9283_av + (field_1439_t.field_22009_h.field_609_am - field_1439_t.field_22009_h.field_9283_av) * (double)p_4141_1_;
        int j = MathHelper.func_1108_b(d1 / 2048D);
        int k = MathHelper.func_1108_b(d2 / 2048D);
        d1 -= j * 2048;
        d2 -= k * 2048;
        float f8 = (field_1448_k.field_4209_q.func_28111_d() - f) + 0.33F;
        f8 += field_1439_t.field_6304_y.ofCloudsHeight * 128F;
        float f9 = (float)(d1 * (double)f5);
        float f10 = (float)(d2 * (double)f5);
        tessellator.func_977_b();
        tessellator.func_986_a(f1, f2, f3, 0.8F);
        for(int l = -byte0 * i; l < byte0 * i; l += byte0)
        {
            for(int i1 = -byte0 * i; i1 < byte0 * i; i1 += byte0)
            {
                tessellator.func_983_a(l + 0, f8, i1 + byte0, (float)(l + 0) * f5 + f9, (float)(i1 + byte0) * f5 + f10);
                tessellator.func_983_a(l + byte0, f8, i1 + byte0, (float)(l + byte0) * f5 + f9, (float)(i1 + byte0) * f5 + f10);
                tessellator.func_983_a(l + byte0, f8, i1 + 0, (float)(l + byte0) * f5 + f9, (float)(i1 + 0) * f5 + f10);
                tessellator.func_983_a(l + 0, f8, i1 + 0, (float)(l + 0) * f5 + f9, (float)(i1 + 0) * f5 + f10);
            }

        }

        tessellator.func_982_a();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
        GL11.glEnable(2884);
    }

    public boolean func_27307_a(double p_27307_1_, double p_27307_3_, double d, float f)
    {
        return false;
    }

    public void func_6510_c(float p_6510_1_)
    {
        GL11.glDisable(2884);
        float f = (float)(field_1439_t.field_22009_h.field_637_aJ + (field_1439_t.field_22009_h.field_610_al - field_1439_t.field_22009_h.field_637_aJ) * (double)p_6510_1_);
        Tessellator tessellator = Tessellator.field_1512_a;
        float f1 = 12F;
        float f2 = 4F;
        double d = (float)field_1435_x + p_6510_1_;
        double d1 = (field_1439_t.field_22009_h.field_9285_at + (field_1439_t.field_22009_h.field_611_ak - field_1439_t.field_22009_h.field_9285_at) * (double)p_6510_1_ + d * 0.029999999329447746D) / (double)f1;
        double d2 = (field_1439_t.field_22009_h.field_9283_av + (field_1439_t.field_22009_h.field_609_am - field_1439_t.field_22009_h.field_9283_av) * (double)p_6510_1_) / (double)f1 + 0.33000001311302185D;
        float f3 = (field_1448_k.field_4209_q.func_28111_d() - f) + 0.33F;
        f3 += field_1439_t.field_6304_y.ofCloudsHeight * 128F;
        int i = MathHelper.func_1108_b(d1 / 2048D);
        int j = MathHelper.func_1108_b(d2 / 2048D);
        d1 -= i * 2048;
        d2 -= j * 2048;
        GL11.glBindTexture(3553, field_1447_l.func_1070_a("/environment/clouds.png"));
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        Vec3D vec3d = field_1448_k.func_628_d(p_6510_1_);
        float f4 = (float)vec3d.field_1776_a;
        float f5 = (float)vec3d.field_1775_b;
        float f6 = (float)vec3d.field_1779_c;
        if(field_1439_t.field_6304_y.field_1578_g)
        {
            float f7 = (f4 * 30F + f5 * 59F + f6 * 11F) / 100F;
            float f9 = (f4 * 30F + f5 * 70F) / 100F;
            float f11 = (f4 * 30F + f6 * 70F) / 100F;
            f4 = f7;
            f5 = f9;
            f6 = f11;
        }
        float f8 = (float)(d1 * 0.0D);
        float f10 = (float)(d2 * 0.0D);
        float f12 = 0.00390625F;
        f8 = (float)MathHelper.func_1108_b(d1) * f12;
        f10 = (float)MathHelper.func_1108_b(d2) * f12;
        float f13 = (float)(d1 - (double)MathHelper.func_1108_b(d1));
        float f14 = (float)(d2 - (double)MathHelper.func_1108_b(d2));
        int k = 8;
        byte byte0 = 4;
        float f15 = 0.0009765625F;
        GL11.glScalef(f1, 1.0F, f1);
        for(int l = 0; l < 2; l++)
        {
            if(l == 0)
            {
                GL11.glColorMask(false, false, false, false);
            } else
            if(field_1439_t.field_6304_y.field_1578_g)
            {
                if(EntityRenderer.field_28134_b == 0)
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
            for(int i1 = -byte0 + 1; i1 <= byte0; i1++)
            {
                for(int j1 = -byte0 + 1; j1 <= byte0; j1++)
                {
                    tessellator.func_977_b();
                    float f16 = i1 * k;
                    float f17 = j1 * k;
                    float f18 = f16 - f13;
                    float f19 = f17 - f14;
                    if(f3 > -f2 - 1.0F)
                    {
                        tessellator.func_986_a(f4 * 0.7F, f5 * 0.7F, f6 * 0.7F, 0.8F);
                        tessellator.func_980_b(0.0F, -1F, 0.0F);
                        tessellator.func_983_a(f18 + 0.0F, f3 + 0.0F, f19 + (float)k, (f16 + 0.0F) * f12 + f8, (f17 + (float)k) * f12 + f10);
                        tessellator.func_983_a(f18 + (float)k, f3 + 0.0F, f19 + (float)k, (f16 + (float)k) * f12 + f8, (f17 + (float)k) * f12 + f10);
                        tessellator.func_983_a(f18 + (float)k, f3 + 0.0F, f19 + 0.0F, (f16 + (float)k) * f12 + f8, (f17 + 0.0F) * f12 + f10);
                        tessellator.func_983_a(f18 + 0.0F, f3 + 0.0F, f19 + 0.0F, (f16 + 0.0F) * f12 + f8, (f17 + 0.0F) * f12 + f10);
                    }
                    if(f3 <= f2 + 1.0F)
                    {
                        tessellator.func_986_a(f4, f5, f6, 0.8F);
                        tessellator.func_980_b(0.0F, 1.0F, 0.0F);
                        tessellator.func_983_a(f18 + 0.0F, (f3 + f2) - f15, f19 + (float)k, (f16 + 0.0F) * f12 + f8, (f17 + (float)k) * f12 + f10);
                        tessellator.func_983_a(f18 + (float)k, (f3 + f2) - f15, f19 + (float)k, (f16 + (float)k) * f12 + f8, (f17 + (float)k) * f12 + f10);
                        tessellator.func_983_a(f18 + (float)k, (f3 + f2) - f15, f19 + 0.0F, (f16 + (float)k) * f12 + f8, (f17 + 0.0F) * f12 + f10);
                        tessellator.func_983_a(f18 + 0.0F, (f3 + f2) - f15, f19 + 0.0F, (f16 + 0.0F) * f12 + f8, (f17 + 0.0F) * f12 + f10);
                    }
                    tessellator.func_986_a(f4 * 0.9F, f5 * 0.9F, f6 * 0.9F, 0.8F);
                    if(i1 > -1)
                    {
                        tessellator.func_980_b(-1F, 0.0F, 0.0F);
                        for(int k1 = 0; k1 < k; k1++)
                        {
                            tessellator.func_983_a(f18 + (float)k1 + 0.0F, f3 + 0.0F, f19 + (float)k, (f16 + (float)k1 + 0.5F) * f12 + f8, (f17 + (float)k) * f12 + f10);
                            tessellator.func_983_a(f18 + (float)k1 + 0.0F, f3 + f2, f19 + (float)k, (f16 + (float)k1 + 0.5F) * f12 + f8, (f17 + (float)k) * f12 + f10);
                            tessellator.func_983_a(f18 + (float)k1 + 0.0F, f3 + f2, f19 + 0.0F, (f16 + (float)k1 + 0.5F) * f12 + f8, (f17 + 0.0F) * f12 + f10);
                            tessellator.func_983_a(f18 + (float)k1 + 0.0F, f3 + 0.0F, f19 + 0.0F, (f16 + (float)k1 + 0.5F) * f12 + f8, (f17 + 0.0F) * f12 + f10);
                        }

                    }
                    if(i1 <= 1)
                    {
                        tessellator.func_980_b(1.0F, 0.0F, 0.0F);
                        for(int l1 = 0; l1 < k; l1++)
                        {
                            tessellator.func_983_a((f18 + (float)l1 + 1.0F) - f15, f3 + 0.0F, f19 + (float)k, (f16 + (float)l1 + 0.5F) * f12 + f8, (f17 + (float)k) * f12 + f10);
                            tessellator.func_983_a((f18 + (float)l1 + 1.0F) - f15, f3 + f2, f19 + (float)k, (f16 + (float)l1 + 0.5F) * f12 + f8, (f17 + (float)k) * f12 + f10);
                            tessellator.func_983_a((f18 + (float)l1 + 1.0F) - f15, f3 + f2, f19 + 0.0F, (f16 + (float)l1 + 0.5F) * f12 + f8, (f17 + 0.0F) * f12 + f10);
                            tessellator.func_983_a((f18 + (float)l1 + 1.0F) - f15, f3 + 0.0F, f19 + 0.0F, (f16 + (float)l1 + 0.5F) * f12 + f8, (f17 + 0.0F) * f12 + f10);
                        }

                    }
                    tessellator.func_986_a(f4 * 0.8F, f5 * 0.8F, f6 * 0.8F, 0.8F);
                    if(j1 > -1)
                    {
                        tessellator.func_980_b(0.0F, 0.0F, -1F);
                        for(int i2 = 0; i2 < k; i2++)
                        {
                            tessellator.func_983_a(f18 + 0.0F, f3 + f2, f19 + (float)i2 + 0.0F, (f16 + 0.0F) * f12 + f8, (f17 + (float)i2 + 0.5F) * f12 + f10);
                            tessellator.func_983_a(f18 + (float)k, f3 + f2, f19 + (float)i2 + 0.0F, (f16 + (float)k) * f12 + f8, (f17 + (float)i2 + 0.5F) * f12 + f10);
                            tessellator.func_983_a(f18 + (float)k, f3 + 0.0F, f19 + (float)i2 + 0.0F, (f16 + (float)k) * f12 + f8, (f17 + (float)i2 + 0.5F) * f12 + f10);
                            tessellator.func_983_a(f18 + 0.0F, f3 + 0.0F, f19 + (float)i2 + 0.0F, (f16 + 0.0F) * f12 + f8, (f17 + (float)i2 + 0.5F) * f12 + f10);
                        }

                    }
                    if(j1 <= 1)
                    {
                        tessellator.func_980_b(0.0F, 0.0F, 1.0F);
                        for(int j2 = 0; j2 < k; j2++)
                        {
                            tessellator.func_983_a(f18 + 0.0F, f3 + f2, (f19 + (float)j2 + 1.0F) - f15, (f16 + 0.0F) * f12 + f8, (f17 + (float)j2 + 0.5F) * f12 + f10);
                            tessellator.func_983_a(f18 + (float)k, f3 + f2, (f19 + (float)j2 + 1.0F) - f15, (f16 + (float)k) * f12 + f8, (f17 + (float)j2 + 0.5F) * f12 + f10);
                            tessellator.func_983_a(f18 + (float)k, f3 + 0.0F, (f19 + (float)j2 + 1.0F) - f15, (f16 + (float)k) * f12 + f8, (f17 + (float)j2 + 0.5F) * f12 + f10);
                            tessellator.func_983_a(f18 + 0.0F, f3 + 0.0F, (f19 + (float)j2 + 1.0F) - f15, (f16 + 0.0F) * f12 + f8, (f17 + (float)j2 + 0.5F) * f12 + f10);
                        }

                    }
                    tessellator.func_982_a();
                }

            }

        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
        GL11.glEnable(2884);
    }

    public boolean func_948_a(EntityLiving p_948_1_, boolean p_948_2_)
    {
        if(field_1446_m.size() <= 0)
        {
            return false;
        }
        int i = 0;
        int j = Config.getUpdatesPerFrame();
        if(Config.isDynamicUpdates() && !isMoving(p_948_1_))
        {
            j *= 3;
        }
        int k = 4;
        int l = 0;
        WorldRenderer worldrenderer = null;
        float f = 3.402823E+038F;
        int i1 = -1;
        for(int j1 = 0; j1 < field_1446_m.size(); j1++)
        {
            WorldRenderer worldrenderer1 = (WorldRenderer)field_1446_m.get(j1);
            if(worldrenderer1 == null)
            {
                continue;
            }
            l++;
            if(!worldrenderer1.field_1738_u)
            {
                field_1446_m.set(j1, null);
                continue;
            }
            float f2 = worldrenderer1.func_1202_a(p_948_1_);
            if(f2 <= 256F && isActingNow())
            {
                worldrenderer1.func_1198_a();
                worldrenderer1.field_1738_u = false;
                field_1446_m.set(j1, null);
                i++;
                continue;
            }
            if(f2 > 256F && i >= j)
            {
                break;
            }
            if(!worldrenderer1.field_1749_o)
            {
                f2 *= k;
            }
            if(worldrenderer == null)
            {
                worldrenderer = worldrenderer1;
                f = f2;
                i1 = j1;
                continue;
            }
            if(f2 < f)
            {
                worldrenderer = worldrenderer1;
                f = f2;
                i1 = j1;
            }
        }

        if(worldrenderer != null)
        {
            worldrenderer.func_1198_a();
            worldrenderer.field_1738_u = false;
            field_1446_m.set(i1, null);
            i++;
            float f1 = f / 5F;
            for(int l1 = 0; l1 < field_1446_m.size() && i < j; l1++)
            {
                WorldRenderer worldrenderer2 = (WorldRenderer)field_1446_m.get(l1);
                if(worldrenderer2 == null)
                {
                    continue;
                }
                float f3 = worldrenderer2.func_1202_a(p_948_1_);
                if(!worldrenderer2.field_1749_o)
                {
                    f3 *= k;
                }
                float f4 = Math.abs(f3 - f);
                if(f4 < f1)
                {
                    worldrenderer2.func_1198_a();
                    worldrenderer2.field_1738_u = false;
                    field_1446_m.set(l1, null);
                    i++;
                }
            }

        }
        if(l == 0)
        {
            field_1446_m.clear();
        }
        if(field_1446_m.size() > 100 && l < (field_1446_m.size() * 4) / 5)
        {
            int k1 = 0;
            for(int i2 = 0; i2 < field_1446_m.size(); i2++)
            {
                Object obj = field_1446_m.get(i2);
                if(obj != null && i2 != k1)
                {
                    field_1446_m.set(k1, obj);
                    k1++;
                }
            }

            for(int j2 = field_1446_m.size() - 1; j2 >= k1; j2--)
            {
                field_1446_m.remove(j2);
            }

        }
        return true;
    }

    public void func_959_a(EntityPlayer p_959_1_, MovingObjectPosition p_959_2_, int p_959_3_, ItemStack p_959_4_, float p_959_5_)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glEnable(3042);
        GL11.glEnable(3008);
        GL11.glBlendFunc(770, 1);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, (MathHelper.func_1106_a((float)System.currentTimeMillis() / 100F) * 0.2F + 0.4F) * 0.5F);
        if(p_959_3_ == 0)
        {
            if(field_1450_i > 0.0F)
            {
                GL11.glBlendFunc(774, 768);
                int i = field_1447_l.func_1070_a("/terrain.png");
                GL11.glBindTexture(3553, i);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
                GL11.glPushMatrix();
                int j = field_1448_k.func_600_a(p_959_2_.field_1166_b, p_959_2_.field_1172_c, p_959_2_.field_1171_d);
                Block block = j > 0 ? Block.field_345_n[j] : null;
                GL11.glDisable(3008);
                GL11.glPolygonOffset(-3F, -3F);
                GL11.glEnable(32823);
                double d = p_959_1_.field_638_aI + (p_959_1_.field_611_ak - p_959_1_.field_638_aI) * (double)p_959_5_;
                double d1 = p_959_1_.field_637_aJ + (p_959_1_.field_610_al - p_959_1_.field_637_aJ) * (double)p_959_5_;
                double d2 = p_959_1_.field_636_aK + (p_959_1_.field_609_am - p_959_1_.field_636_aK) * (double)p_959_5_;
                if(block == null)
                {
                    block = Block.field_338_u;
                }
                GL11.glEnable(3008);
                tessellator.func_977_b();
                tessellator.func_984_b(-d, -d1, -d2);
                tessellator.func_989_c();
                field_1438_u.func_1223_a(block, p_959_2_.field_1166_b, p_959_2_.field_1172_c, p_959_2_.field_1171_d, 240 + (int)(field_1450_i * 10F));
                tessellator.func_982_a();
                tessellator.func_984_b(0.0D, 0.0D, 0.0D);
                GL11.glDisable(3008);
                GL11.glPolygonOffset(0.0F, 0.0F);
                GL11.glDisable(32823);
                GL11.glEnable(3008);
                GL11.glDepthMask(true);
                GL11.glPopMatrix();
            }
        } else
        if(p_959_4_ != null)
        {
            GL11.glBlendFunc(770, 771);
            float f = MathHelper.func_1106_a((float)System.currentTimeMillis() / 100F) * 0.2F + 0.8F;
            GL11.glColor4f(f, f, f, MathHelper.func_1106_a((float)System.currentTimeMillis() / 200F) * 0.2F + 0.5F);
            int k = field_1447_l.func_1070_a("/terrain.png");
            GL11.glBindTexture(3553, k);
            int l = p_959_2_.field_1166_b;
            int i1 = p_959_2_.field_1172_c;
            int j1 = p_959_2_.field_1171_d;
            if(p_959_2_.field_1170_e == 0)
            {
                i1--;
            }
            if(p_959_2_.field_1170_e == 1)
            {
                i1++;
            }
            if(p_959_2_.field_1170_e == 2)
            {
                j1--;
            }
            if(p_959_2_.field_1170_e == 3)
            {
                j1++;
            }
            if(p_959_2_.field_1170_e == 4)
            {
                l--;
            }
            if(p_959_2_.field_1170_e == 5)
            {
                l++;
            }
        }
        GL11.glDisable(3042);
        GL11.glDisable(3008);
    }

    public void func_955_b(EntityPlayer p_955_1_, MovingObjectPosition p_955_2_, int p_955_3_, ItemStack p_955_4_, float p_955_5_)
    {
        if(p_955_3_ == 0 && p_955_2_.field_1167_a == EnumMovingObjectType.TILE)
        {
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
            GL11.glLineWidth(2.0F);
            GL11.glDisable(3553);
            GL11.glDepthMask(false);
            float f = 0.002F;
            int i = field_1448_k.func_600_a(p_955_2_.field_1166_b, p_955_2_.field_1172_c, p_955_2_.field_1171_d);
            if(i > 0)
            {
                Block.field_345_n[i].func_238_a(field_1448_k, p_955_2_.field_1166_b, p_955_2_.field_1172_c, p_955_2_.field_1171_d);
                double d = p_955_1_.field_638_aI + (p_955_1_.field_611_ak - p_955_1_.field_638_aI) * (double)p_955_5_;
                double d1 = p_955_1_.field_637_aJ + (p_955_1_.field_610_al - p_955_1_.field_637_aJ) * (double)p_955_5_;
                double d2 = p_955_1_.field_636_aK + (p_955_1_.field_609_am - p_955_1_.field_636_aK) * (double)p_955_5_;
                func_942_a(Block.field_345_n[i].func_246_f(field_1448_k, p_955_2_.field_1166_b, p_955_2_.field_1172_c, p_955_2_.field_1171_d).func_1177_b(f, f, f).func_1166_c(-d, -d1, -d2));
            }
            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glDisable(3042);
        }
    }

    private void func_942_a(AxisAlignedBB p_942_1_)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_992_a(3);
        tessellator.func_991_a(p_942_1_.field_1698_a, p_942_1_.field_1697_b, p_942_1_.field_1704_c);
        tessellator.func_991_a(p_942_1_.field_1703_d, p_942_1_.field_1697_b, p_942_1_.field_1704_c);
        tessellator.func_991_a(p_942_1_.field_1703_d, p_942_1_.field_1697_b, p_942_1_.field_1701_f);
        tessellator.func_991_a(p_942_1_.field_1698_a, p_942_1_.field_1697_b, p_942_1_.field_1701_f);
        tessellator.func_991_a(p_942_1_.field_1698_a, p_942_1_.field_1697_b, p_942_1_.field_1704_c);
        tessellator.func_982_a();
        tessellator.func_992_a(3);
        tessellator.func_991_a(p_942_1_.field_1698_a, p_942_1_.field_1702_e, p_942_1_.field_1704_c);
        tessellator.func_991_a(p_942_1_.field_1703_d, p_942_1_.field_1702_e, p_942_1_.field_1704_c);
        tessellator.func_991_a(p_942_1_.field_1703_d, p_942_1_.field_1702_e, p_942_1_.field_1701_f);
        tessellator.func_991_a(p_942_1_.field_1698_a, p_942_1_.field_1702_e, p_942_1_.field_1701_f);
        tessellator.func_991_a(p_942_1_.field_1698_a, p_942_1_.field_1702_e, p_942_1_.field_1704_c);
        tessellator.func_982_a();
        tessellator.func_992_a(1);
        tessellator.func_991_a(p_942_1_.field_1698_a, p_942_1_.field_1697_b, p_942_1_.field_1704_c);
        tessellator.func_991_a(p_942_1_.field_1698_a, p_942_1_.field_1702_e, p_942_1_.field_1704_c);
        tessellator.func_991_a(p_942_1_.field_1703_d, p_942_1_.field_1697_b, p_942_1_.field_1704_c);
        tessellator.func_991_a(p_942_1_.field_1703_d, p_942_1_.field_1702_e, p_942_1_.field_1704_c);
        tessellator.func_991_a(p_942_1_.field_1703_d, p_942_1_.field_1697_b, p_942_1_.field_1701_f);
        tessellator.func_991_a(p_942_1_.field_1703_d, p_942_1_.field_1702_e, p_942_1_.field_1701_f);
        tessellator.func_991_a(p_942_1_.field_1698_a, p_942_1_.field_1697_b, p_942_1_.field_1701_f);
        tessellator.func_991_a(p_942_1_.field_1698_a, p_942_1_.field_1702_e, p_942_1_.field_1701_f);
        tessellator.func_982_a();
    }

    public void func_949_a(int p_949_1_, int p_949_2_, int p_949_3_, int p_949_4_, int p_949_5_, int p_949_6_)
    {
        int i = MathHelper.func_1111_a(p_949_1_, 16);
        int j = MathHelper.func_1111_a(p_949_2_, 16);
        int k = MathHelper.func_1111_a(p_949_3_, 16);
        int l = MathHelper.func_1111_a(p_949_4_, 16);
        int i1 = MathHelper.func_1111_a(p_949_5_, 16);
        int j1 = MathHelper.func_1111_a(p_949_6_, 16);
        for(int k1 = i; k1 <= l; k1++)
        {
            int l1 = k1 % field_1443_p;
            if(l1 < 0)
            {
                l1 += field_1443_p;
            }
            for(int i2 = j; i2 <= i1; i2++)
            {
                int j2 = i2 % field_1442_q;
                if(j2 < 0)
                {
                    j2 += field_1442_q;
                }
                for(int k2 = k; k2 <= j1; k2++)
                {
                    int l2 = k2 % field_1441_r;
                    if(l2 < 0)
                    {
                        l2 += field_1441_r;
                    }
                    int i3 = (l2 * field_1442_q + j2) * field_1443_p + l1;
                    WorldRenderer worldrenderer = field_1444_o[i3];
                    if(!worldrenderer.field_1738_u)
                    {
                        field_1446_m.add(worldrenderer);
                        worldrenderer.func_1194_f();
                    }
                }

            }

        }

    }

    public void func_934_a(int p_934_1_, int p_934_2_, int p_934_3_)
    {
        func_949_a(p_934_1_ - 1, p_934_2_ - 1, p_934_3_ - 1, p_934_1_ + 1, p_934_2_ + 1, p_934_3_ + 1);
    }

    public void func_48180_b(int p_48180_1_, int p_48180_2_, int p_48180_3_)
    {
        func_949_a(p_48180_1_ - 1, p_48180_2_ - 1, p_48180_3_ - 1, p_48180_1_ + 1, p_48180_2_ + 1, p_48180_3_ + 1);
    }

    public void func_937_b(int p_937_1_, int p_937_2_, int p_937_3_, int p_937_4_, int p_937_5_, int p_937_6_)
    {
        func_949_a(p_937_1_ - 1, p_937_2_ - 1, p_937_3_ - 1, p_937_4_ + 1, p_937_5_ + 1, p_937_6_ + 1);
    }

    public void func_960_a(ICamera p_960_1_, float p_960_2_)
    {
        for(int i = 0; i < field_1444_o.length; i++)
        {
            if(!field_1444_o[i].func_1196_e())
            {
                field_1444_o[i].func_1199_a(p_960_1_);
            }
        }

        field_1449_j++;
    }

    public void func_933_a(String p_933_1_, int p_933_2_, int p_933_3_, int p_933_4_)
    {
        if(p_933_1_ != null)
        {
            field_1439_t.field_6308_u.func_553_b((new StringBuilder()).append("C418 - ").append(p_933_1_).toString());
        }
        field_1439_t.field_6301_A.func_331_a(p_933_1_, p_933_2_, p_933_3_, p_933_4_, 1.0F, 1.0F);
    }

    public void func_940_a(String p_940_1_, double p_940_2_, double p_940_4_, double p_940_6_, 
            float p_940_8_, float p_940_9_)
    {
        float f = 16F;
        if(p_940_8_ > 1.0F)
        {
            f *= p_940_8_;
        }
        if(field_1439_t.field_22009_h.func_360_d(p_940_2_, p_940_4_, p_940_6_) < (double)(f * f))
        {
            field_1439_t.field_6301_A.func_336_b(p_940_1_, (float)p_940_2_, (float)p_940_4_, (float)p_940_6_, p_940_8_, p_940_9_);
        }
    }

    public void func_939_a(String p_939_1_, double p_939_2_, double p_939_4_, double p_939_6_, 
            double p_939_8_, double p_939_10_, double p_939_12_)
    {
        func_40193_b(p_939_1_, p_939_2_, p_939_4_, p_939_6_, p_939_8_, p_939_10_, p_939_12_);
    }

    public EntityFX func_40193_b(String p_40193_1_, double p_40193_2_, double p_40193_4_, double p_40193_6_, 
            double p_40193_8_, double p_40193_10_, double p_40193_12_)
    {
        if(field_1439_t == null || field_1439_t.field_22009_h == null || field_1439_t.field_6321_h == null)
        {
            return null;
        }
        int i = field_1439_t.field_6304_y.field_41087_P;
        if(i == 1 && field_1448_k.field_1037_n.nextInt(3) == 0)
        {
            i = 2;
        }
        double d = field_1439_t.field_22009_h.field_611_ak - p_40193_2_;
        double d1 = field_1439_t.field_22009_h.field_610_al - p_40193_4_;
        double d2 = field_1439_t.field_22009_h.field_609_am - p_40193_6_;
        Object obj = null;
        if(p_40193_1_.equals("hugeexplosion"))
        {
            if(Config.isAnimatedExplosion())
            {
                field_1439_t.field_6321_h.func_1192_a((EntityFX)(obj = new EntityHugeExplodeFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_)));
            }
        } else
        if(p_40193_1_.equals("largeexplode") && Config.isAnimatedExplosion())
        {
            field_1439_t.field_6321_h.func_1192_a((EntityFX)(obj = new EntityLargeExplodeFX(field_1447_l, field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_)));
        }
        if(obj != null)
        {
            return (EntityFX)obj;
        }
        double d3 = 16D;
        if(p_40193_1_.equals("crit"))
        {
            d3 = 196D;
        }
        if(d * d + d1 * d1 + d2 * d2 > d3 * d3)
        {
            return null;
        }
        if(i > 1)
        {
            return null;
        }
        if(p_40193_1_.equals("bubble"))
        {
            obj = new EntityBubbleFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
            CustomColorizer.updateWaterFX((EntityFX)obj, field_1448_k);
        } else
        if(p_40193_1_.equals("suspended"))
        {
            if(Config.isWaterParticles())
            {
                obj = new EntitySuspendFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
            }
        } else
        if(p_40193_1_.equals("depthsuspend"))
        {
            if(Config.isVoidParticles())
            {
                obj = new EntityAuraFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
            }
        } else
        if(p_40193_1_.equals("townaura"))
        {
            obj = new EntityAuraFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
        } else
        if(p_40193_1_.equals("crit"))
        {
            obj = new EntityCritFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
        } else
        if(p_40193_1_.equals("magicCrit"))
        {
            obj = new EntityCritFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
            ((EntityFX)obj).func_40097_b(((EntityFX)obj).func_40098_n() * 0.3F, ((EntityFX)obj).func_40101_o() * 0.8F, ((EntityFX)obj).func_40102_p());
            ((EntityFX)obj).func_40099_c(((EntityFX)obj).func_40100_q() + 1);
        } else
        if(p_40193_1_.equals("smoke"))
        {
            if(Config.isAnimatedSmoke())
            {
                obj = new EntitySmokeFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
            }
        } else
        if(p_40193_1_.equals("mobSpell"))
        {
            obj = new EntitySpellParticleFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, 0.0D, 0.0D, 0.0D);
            ((EntityFX)obj).func_40097_b((float)p_40193_8_, (float)p_40193_10_, (float)p_40193_12_);
        } else
        if(p_40193_1_.equals("spell"))
        {
            obj = new EntitySpellParticleFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
        } else
        if(p_40193_1_.equals("instantSpell"))
        {
            obj = new EntitySpellParticleFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
            ((EntitySpellParticleFX)obj).func_40110_b(144);
        } else
        if(p_40193_1_.equals("note"))
        {
            obj = new EntityNoteFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
        } else
        if(p_40193_1_.equals("portal"))
        {
            if(Config.isPortalParticles())
            {
                obj = new EntityPortalFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
                CustomColorizer.updatePortalFX((EntityFX)obj);
            }
        } else
        if(p_40193_1_.equals("enchantmenttable"))
        {
            obj = new EntityEnchantmentTableParticleFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
        } else
        if(p_40193_1_.equals("explode"))
        {
            if(Config.isAnimatedExplosion())
            {
                obj = new EntityExplodeFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
            }
        } else
        if(p_40193_1_.equals("flame"))
        {
            if(Config.isAnimatedFlame())
            {
                obj = new EntityFlameFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
            }
        } else
        if(p_40193_1_.equals("lava"))
        {
            obj = new EntityLavaFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_);
        } else
        if(p_40193_1_.equals("footstep"))
        {
            obj = new EntityFootStepFX(field_1447_l, field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_);
        } else
        if(p_40193_1_.equals("splash"))
        {
            obj = new EntitySplashFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
            CustomColorizer.updateWaterFX((EntityFX)obj, field_1448_k);
        } else
        if(p_40193_1_.equals("largesmoke"))
        {
            if(Config.isAnimatedSmoke())
            {
                obj = new EntitySmokeFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_, 2.5F);
            }
        } else
        if(p_40193_1_.equals("cloud"))
        {
            obj = new EntityCloudFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
        } else
        if(p_40193_1_.equals("reddust"))
        {
            if(Config.isAnimatedRedstone())
            {
                obj = new EntityReddustFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, (float)p_40193_8_, (float)p_40193_10_, (float)p_40193_12_);
                CustomColorizer.updateReddustFX((EntityFX)obj, field_1448_k, d, d1, d2);
            }
        } else
        if(p_40193_1_.equals("snowballpoof"))
        {
            obj = new EntityBreakingFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, Item.field_308_aB);
        } else
        if(p_40193_1_.equals("dripWater"))
        {
            if(Config.isDrippingWaterLava())
            {
                obj = new EntityDropParticleFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, Material.field_1332_f);
            }
        } else
        if(p_40193_1_.equals("dripLava"))
        {
            if(Config.isDrippingWaterLava())
            {
                obj = new EntityDropParticleFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, Material.field_1331_g);
            }
        } else
        if(p_40193_1_.equals("snowshovel"))
        {
            obj = new EntitySnowShovelFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
        } else
        if(p_40193_1_.equals("slime"))
        {
            obj = new EntityBreakingFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, Item.field_299_aK);
        } else
        if(p_40193_1_.equals("heart"))
        {
            obj = new EntityHeartFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_);
        } else
        if(p_40193_1_.startsWith("iconcrack_"))
        {
            int j = Integer.parseInt(p_40193_1_.substring(p_40193_1_.indexOf("_") + 1));
            obj = new EntityBreakingFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_, Item.field_233_c[j]);
        } else
        if(p_40193_1_.startsWith("tilecrack_"))
        {
            int k = Integer.parseInt(p_40193_1_.substring(p_40193_1_.indexOf("_") + 1));
            obj = new EntityDiggingFX(field_1448_k, p_40193_2_, p_40193_4_, p_40193_6_, p_40193_8_, p_40193_10_, p_40193_12_, Block.field_345_n[k], 0, 0);
        }
        if(obj != null)
        {
            field_1439_t.field_6321_h.func_1192_a((EntityFX)obj);
        }
        return (EntityFX)obj;
    }

    public void func_941_a(Entity p_941_1_)
    {
        p_941_1_.func_20046_s();
        if(p_941_1_.field_20047_bv != null)
        {
            field_1447_l.func_1075_a(p_941_1_.field_20047_bv, new ImageBufferDownload());
        }
        if(p_941_1_.field_622_aY != null)
        {
            field_1447_l.func_1075_a(p_941_1_.field_622_aY, new ImageBufferDownload());
            if(p_941_1_ instanceof EntityPlayer)
            {
                EntityPlayer entityplayer = (EntityPlayer)p_941_1_;
                ThreadDownloadImageData threaddownloadimagedata = field_1447_l.func_1075_a(entityplayer.field_622_aY, new ImageBufferDownload());
                field_1447_l.func_1073_b(entityplayer.field_622_aY);
                String s = (new StringBuilder()).append("http://optifine.net/capes/").append(entityplayer.field_771_i).append(".png").toString();
                ThreadDownloadImage threaddownloadimage = new ThreadDownloadImage(threaddownloadimagedata, s, new ImageBufferDownload());
                threaddownloadimage.start();
                if(!Config.isShowCapes())
                {
                    entityplayer.field_20067_q = "";
                }
            }
        }
        if(Config.isRandomMobs())
        {
            RandomMobs.entityLoaded(p_941_1_);
        }
    }

    public void func_938_b(Entity p_938_1_)
    {
        if(p_938_1_.field_20047_bv != null)
        {
            field_1447_l.func_1073_b(p_938_1_.field_20047_bv);
        }
        if(p_938_1_.field_622_aY != null)
        {
            field_1447_l.func_1073_b(p_938_1_.field_622_aY);
        }
    }

    public void setAllRenderesVisible()
    {
        if(field_1444_o == null)
        {
            return;
        }
        for(int i = 0; i < field_1444_o.length; i++)
        {
            field_1444_o[i].field_1734_x = true;
        }

    }

    public void func_935_a(int i, int j, int k, TileEntity tileentity)
    {
    }

    public void func_28137_f()
    {
        GLAllocation.func_28194_b(field_1440_s);
    }

    public void func_28136_a(EntityPlayer p_28136_1_, int p_28136_2_, int p_28136_3_, int p_28136_4_, int p_28136_5_, int p_28136_6_)
    {
        Random random = field_1448_k.field_1037_n;
        switch(p_28136_2_)
        {
        default:
            break;

        case 1001: 
            field_1448_k.func_684_a(p_28136_3_, p_28136_4_, p_28136_5_, "random.click", 1.0F, 1.2F);
            break;

        case 1000: 
            field_1448_k.func_684_a(p_28136_3_, p_28136_4_, p_28136_5_, "random.click", 1.0F, 1.0F);
            break;

        case 1002: 
            field_1448_k.func_684_a(p_28136_3_, p_28136_4_, p_28136_5_, "random.bow", 1.0F, 1.2F);
            break;

        case 2000: 
            int i = p_28136_6_ % 3 - 1;
            int j = (p_28136_6_ / 3) % 3 - 1;
            double d = (double)p_28136_3_ + (double)i * 0.59999999999999998D + 0.5D;
            double d1 = (double)p_28136_4_ + 0.5D;
            double d2 = (double)p_28136_5_ + (double)j * 0.59999999999999998D + 0.5D;
            for(int k = 0; k < 10; k++)
            {
                double d4 = random.nextDouble() * 0.20000000000000001D + 0.01D;
                double d6 = d + (double)i * 0.01D + (random.nextDouble() - 0.5D) * (double)j * 0.5D;
                double d8 = d1 + (random.nextDouble() - 0.5D) * 0.5D;
                double d9 = d2 + (double)j * 0.01D + (random.nextDouble() - 0.5D) * (double)i * 0.5D;
                double d12 = (double)i * d4 + random.nextGaussian() * 0.01D;
                double d14 = -0.029999999999999999D + random.nextGaussian() * 0.01D;
                double d16 = (double)j * d4 + random.nextGaussian() * 0.01D;
                func_939_a("smoke", d6, d8, d9, d12, d14, d16);
            }

            break;

        case 2003: 
            double d3 = (double)p_28136_3_ + 0.5D;
            double d5 = p_28136_4_;
            double d7 = (double)p_28136_5_ + 0.5D;
            String s = (new StringBuilder()).append("iconcrack_").append(Item.field_40420_bA.field_291_aS).toString();
            for(int l = 0; l < 8; l++)
            {
                func_939_a(s, d3, d5, d7, random.nextGaussian() * 0.14999999999999999D, random.nextDouble() * 0.20000000000000001D, random.nextGaussian() * 0.14999999999999999D);
            }

            for(double d10 = 0.0D; d10 < 6.2831853071795862D; d10 += 0.15707963267948966D)
            {
                func_939_a("portal", d3 + Math.cos(d10) * 5D, d5 - 0.40000000000000002D, d7 + Math.sin(d10) * 5D, Math.cos(d10) * -5D, 0.0D, Math.sin(d10) * -5D);
                func_939_a("portal", d3 + Math.cos(d10) * 5D, d5 - 0.40000000000000002D, d7 + Math.sin(d10) * 5D, Math.cos(d10) * -7D, 0.0D, Math.sin(d10) * -7D);
            }

            break;

        case 2002: 
            double d11 = p_28136_3_;
            double d13 = p_28136_4_;
            double d15 = p_28136_5_;
            String s1 = (new StringBuilder()).append("iconcrack_").append(Item.field_40413_bs.field_291_aS).toString();
            for(int i1 = 0; i1 < 8; i1++)
            {
                func_939_a(s1, d11, d13, d15, random.nextGaussian() * 0.14999999999999999D, random.nextDouble() * 0.20000000000000001D, random.nextGaussian() * 0.14999999999999999D);
            }

            int j1 = Item.field_40413_bs.func_27010_f(p_28136_6_, 0);
            float f = (float)(j1 >> 16 & 0xff) / 255F;
            float f1 = (float)(j1 >> 8 & 0xff) / 255F;
            float f2 = (float)(j1 >> 0 & 0xff) / 255F;
            String s2 = "spell";
            if(Item.field_40413_bs.func_40432_e(p_28136_6_))
            {
                s2 = "instantSpell";
            }
            for(int k1 = 0; k1 < 100; k1++)
            {
                double d17 = random.nextDouble() * 4D;
                double d19 = random.nextDouble() * 3.1415926535897931D * 2D;
                double d21 = Math.cos(d19) * d17;
                double d23 = 0.01D + random.nextDouble() * 0.5D;
                double d24 = Math.sin(d19) * d17;
                EntityFX entityfx = func_40193_b(s2, d11 + d21 * 0.10000000000000001D, d13 + 0.29999999999999999D, d15 + d24 * 0.10000000000000001D, d21, d23, d24);
                if(entityfx != null)
                {
                    float f3 = 0.75F + random.nextFloat() * 0.25F;
                    entityfx.func_40097_b(f * f3, f1 * f3, f2 * f3);
                    entityfx.func_407_b((float)d17);
                }
            }

            field_1448_k.func_684_a((double)p_28136_3_ + 0.5D, (double)p_28136_4_ + 0.5D, (double)p_28136_5_ + 0.5D, "random.glass", 1.0F, field_1448_k.field_1037_n.nextFloat() * 0.1F + 0.9F);
            break;

        case 2001: 
            int l1 = p_28136_6_ & 0xfff;
            if(l1 > 0)
            {
                Block block = Block.field_345_n[l1];
                field_1439_t.field_6301_A.func_336_b(block.field_358_bl.func_1146_a(), (float)p_28136_3_ + 0.5F, (float)p_28136_4_ + 0.5F, (float)p_28136_5_ + 0.5F, (block.field_358_bl.func_1147_b() + 1.0F) / 2.0F, block.field_358_bl.func_1144_c() * 0.8F);
            }
            field_1439_t.field_6321_h.func_1186_a(p_28136_3_, p_28136_4_, p_28136_5_, p_28136_6_ & 0xfff, p_28136_6_ >> 12 & 0xff);
            break;

        case 2004: 
            for(int i2 = 0; i2 < 20; i2++)
            {
                double d18 = (double)p_28136_3_ + 0.5D + ((double)field_1448_k.field_1037_n.nextFloat() - 0.5D) * 2D;
                double d20 = (double)p_28136_4_ + 0.5D + ((double)field_1448_k.field_1037_n.nextFloat() - 0.5D) * 2D;
                double d22 = (double)p_28136_5_ + 0.5D + ((double)field_1448_k.field_1037_n.nextFloat() - 0.5D) * 2D;
                field_1448_k.func_694_a("smoke", d18, d20, d22, 0.0D, 0.0D, 0.0D);
                field_1448_k.func_694_a("flame", d18, d20, d22, 0.0D, 0.0D, 0.0D);
            }

            break;

        case 1003: 
            if(Math.random() < 0.5D)
            {
                field_1448_k.func_684_a((double)p_28136_3_ + 0.5D, (double)p_28136_4_ + 0.5D, (double)p_28136_5_ + 0.5D, "random.door_open", 1.0F, field_1448_k.field_1037_n.nextFloat() * 0.1F + 0.9F);
            } else
            {
                field_1448_k.func_684_a((double)p_28136_3_ + 0.5D, (double)p_28136_4_ + 0.5D, (double)p_28136_5_ + 0.5D, "random.door_close", 1.0F, field_1448_k.field_1037_n.nextFloat() * 0.1F + 0.9F);
            }
            break;

        case 1004: 
            field_1448_k.func_684_a((float)p_28136_3_ + 0.5F, (float)p_28136_4_ + 0.5F, (float)p_28136_5_ + 0.5F, "random.fizz", 0.5F, 2.6F + (random.nextFloat() - random.nextFloat()) * 0.8F);
            break;

        case 1005: 
            if(Item.field_233_c[p_28136_6_] instanceof ItemRecord)
            {
                field_1448_k.func_670_a(((ItemRecord)Item.field_233_c[p_28136_6_]).field_316_a, p_28136_3_, p_28136_4_, p_28136_5_);
            } else
            {
                field_1448_k.func_670_a(null, p_28136_3_, p_28136_4_, p_28136_5_);
            }
            break;

        case 1007: 
            field_1448_k.func_684_a((double)p_28136_3_ + 0.5D, (double)p_28136_4_ + 0.5D, (double)p_28136_5_ + 0.5D, "mob.ghast.charge", 10F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
            break;

        case 1008: 
            field_1448_k.func_684_a((double)p_28136_3_ + 0.5D, (double)p_28136_4_ + 0.5D, (double)p_28136_5_ + 0.5D, "mob.ghast.fireball", 10F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
            break;

        case 1010: 
            field_1448_k.func_684_a((double)p_28136_3_ + 0.5D, (double)p_28136_4_ + 0.5D, (double)p_28136_5_ + 0.5D, "mob.zombie.wood", 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
            break;

        case 1012: 
            field_1448_k.func_684_a((double)p_28136_3_ + 0.5D, (double)p_28136_4_ + 0.5D, (double)p_28136_5_ + 0.5D, "mob.zombie.woodbreak", 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
            break;

        case 1011: 
            field_1448_k.func_684_a((double)p_28136_3_ + 0.5D, (double)p_28136_4_ + 0.5D, (double)p_28136_5_ + 0.5D, "mob.zombie.metal", 2.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
            break;
        }
    }

    private boolean isMoving(EntityLiving entityliving)
    {
        boolean flag = isMovingNow(entityliving);
        if(flag)
        {
            lastMovedTime = System.currentTimeMillis();
            return true;
        } else
        {
            return System.currentTimeMillis() - lastMovedTime < 2000L;
        }
    }

    private boolean isMovingNow(EntityLiving entityliving)
    {
        double d = 0.001D;
        if(entityliving.field_9336_ak)
        {
            return true;
        }
        if(entityliving.func_381_o())
        {
            return true;
        }
        if((double)entityliving.field_9341_H > d)
        {
            return true;
        }
        if(field_1439_t.field_6299_B.field_1114_a != 0)
        {
            return true;
        }
        if(field_1439_t.field_6299_B.field_1113_b != 0)
        {
            return true;
        }
        if(Math.abs(entityliving.field_611_ak - entityliving.field_9285_at) > d)
        {
            return true;
        }
        if(Math.abs(entityliving.field_610_al - entityliving.field_9284_au) > d)
        {
            return true;
        }
        return Math.abs(entityliving.field_609_am - entityliving.field_9283_av) > d;
    }

    private boolean isActingNow()
    {
        if(Mouse.isButtonDown(0))
        {
            return true;
        }
        return Mouse.isButtonDown(1);
    }

    public int renderAllSortedRenderers(int i, double d)
    {
        return func_952_a(0, field_1445_n.length, i, d);
    }

    public void updateCapes()
    {
        if(field_1448_k == null)
        {
            return;
        }
        boolean flag = Config.isShowCapes();
        List list = field_1448_k.field_1040_k;
        for(int i = 0; i < list.size(); i++)
        {
            Entity entity = (Entity)list.get(i);
            if(!(entity instanceof EntityPlayer))
            {
                continue;
            }
            EntityPlayer entityplayer = (EntityPlayer)entity;
            if(flag)
            {
                entityplayer.field_20067_q = entityplayer.field_622_aY;
            } else
            {
                entityplayer.field_20067_q = "";
            }
        }

    }
}
