// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.nio.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.*;

// Referenced classes of package net.minecraft.src:
//            GLAllocation, OpenGlHelper, Config, RenderEngine

public class Tessellator
{

    private static boolean field_1511_b = false;
    private static boolean field_1510_c = false;
    private ByteBuffer field_1509_d;
    private IntBuffer field_1508_e;
    private FloatBuffer field_1507_f;
    private ShortBuffer field_35836_g;
    private int field_1506_g[];
    private int field_1505_h;
    private double field_1504_i;
    private double field_1503_j;
    private int field_35837_l;
    private int field_1502_k;
    private boolean field_1501_l;
    private boolean field_1500_m;
    private boolean field_35838_p;
    private boolean field_1499_n;
    private int field_1498_o;
    private int field_1497_p;
    private boolean field_1495_q;
    public int field_1493_r;
    public double field_1492_s;
    public double field_1491_t;
    public double field_1490_u;
    private int field_1489_v;
    public static Tessellator field_1512_a = new Tessellator(0x80000);
    public boolean field_1488_w;
    private boolean field_1487_x;
    private IntBuffer field_1486_y;
    private int field_1485_z;
    private int field_1496_A;
    private int field_1494_B;
    private boolean renderingChunk;
    private static boolean littleEndianByteOrder;
    public static boolean renderingWorldRenderer = false;
    public boolean defaultTexture;
    public boolean autoGrow;
    private Tessellator subTessellators[];
    private int subTextures[];
    private int terrainTexture;
    private long textureUpdateTime;

    public Tessellator()
    {
        this(0x10000);
        defaultTexture = false;
    }

    public Tessellator(int p_i52_1_)
    {
        renderingChunk = false;
        defaultTexture = true;
        autoGrow = true;
        subTessellators = new Tessellator[0];
        subTextures = new int[0];
        terrainTexture = 0;
        textureUpdateTime = 0L;
        field_1505_h = 0;
        field_1501_l = false;
        field_1500_m = false;
        field_35838_p = false;
        field_1499_n = false;
        field_1498_o = 0;
        field_1497_p = 0;
        field_1495_q = false;
        field_1488_w = false;
        field_1487_x = false;
        field_1485_z = 0;
        field_1496_A = 10;
        field_1494_B = p_i52_1_;
        field_1509_d = GLAllocation.func_1127_b(p_i52_1_ * 4);
        field_1508_e = field_1509_d.asIntBuffer();
        field_1507_f = field_1509_d.asFloatBuffer();
        field_35836_g = field_1509_d.asShortBuffer();
        field_1506_g = new int[p_i52_1_];
        field_1487_x = field_1510_c && GLContext.getCapabilities().GL_ARB_vertex_buffer_object;
        if(field_1487_x)
        {
            field_1486_y = GLAllocation.func_1125_c(field_1496_A);
            ARBVertexBufferObject.glGenBuffersARB(field_1486_y);
        }
    }

    public int func_982_a()
    {
        if(!field_1488_w)
        {
            throw new IllegalStateException("Not tesselating!");
        }
        if(renderingChunk && subTessellators.length > 0)
        {
            boolean flag = false;
            for(int j = 0; j < subTessellators.length; j++)
            {
                int k = subTextures[j];
                if(k <= 0)
                {
                    break;
                }
                Tessellator tessellator = subTessellators[j];
                if(tessellator.field_1488_w)
                {
                    GL11.glBindTexture(3553, k);
                    tessellator.func_982_a();
                    flag = true;
                }
            }

            if(flag)
            {
                GL11.glBindTexture(3553, getTerrainTexture());
            }
        }
        field_1488_w = false;
        if(field_1505_h > 0)
        {
            field_1508_e.clear();
            field_1508_e.put(field_1506_g, 0, field_1498_o);
            field_1509_d.position(0);
            field_1509_d.limit(field_1498_o * 4);
            if(field_1487_x)
            {
                field_1485_z = (field_1485_z + 1) % field_1496_A;
                ARBVertexBufferObject.glBindBufferARB(34962, field_1486_y.get(field_1485_z));
                ARBVertexBufferObject.glBufferDataARB(34962, field_1509_d, 35040);
            }
            if(field_1500_m)
            {
                if(field_1487_x)
                {
                    GL11.glTexCoordPointer(2, 5126, 32, 12L);
                } else
                {
                    field_1507_f.position(3);
                    GL11.glTexCoordPointer(2, 32, field_1507_f);
                }
                GL11.glEnableClientState(32888);
            }
            if(field_35838_p)
            {
                OpenGlHelper.func_40451_b(OpenGlHelper.field_40455_b);
                if(field_1487_x)
                {
                    GL11.glTexCoordPointer(2, 5122, 32, 28L);
                } else
                {
                    field_35836_g.position(14);
                    GL11.glTexCoordPointer(2, 32, field_35836_g);
                }
                GL11.glEnableClientState(32888);
                OpenGlHelper.func_40451_b(OpenGlHelper.field_40457_a);
            }
            if(field_1501_l)
            {
                if(field_1487_x)
                {
                    GL11.glColorPointer(4, 5121, 32, 20L);
                } else
                {
                    field_1509_d.position(20);
                    GL11.glColorPointer(4, true, 32, field_1509_d);
                }
                GL11.glEnableClientState(32886);
            }
            if(field_1499_n)
            {
                if(field_1487_x)
                {
                    GL11.glNormalPointer(5121, 32, 24L);
                } else
                {
                    field_1509_d.position(24);
                    GL11.glNormalPointer(32, field_1509_d);
                }
                GL11.glEnableClientState(32885);
            }
            if(field_1487_x)
            {
                GL11.glVertexPointer(3, 5126, 32, 0L);
            } else
            {
                field_1507_f.position(0);
                GL11.glVertexPointer(3, 32, field_1507_f);
            }
            GL11.glEnableClientState(32884);
            if(field_1493_r == 7 && field_1511_b)
            {
                GL11.glDrawArrays(4, 0, field_1505_h);
            } else
            {
                GL11.glDrawArrays(field_1493_r, 0, field_1505_h);
            }
            GL11.glDisableClientState(32884);
            if(field_1500_m)
            {
                GL11.glDisableClientState(32888);
            }
            if(field_35838_p)
            {
                OpenGlHelper.func_40451_b(OpenGlHelper.field_40455_b);
                GL11.glDisableClientState(32888);
                OpenGlHelper.func_40451_b(OpenGlHelper.field_40457_a);
            }
            if(field_1501_l)
            {
                GL11.glDisableClientState(32886);
            }
            if(field_1499_n)
            {
                GL11.glDisableClientState(32885);
            }
        }
        int i = field_1498_o * 4;
        func_985_d();
        return i;
    }

    private void func_985_d()
    {
        field_1505_h = 0;
        field_1509_d.clear();
        field_1498_o = 0;
        field_1497_p = 0;
    }

    public void func_977_b()
    {
        func_992_a(7);
    }

    public void func_992_a(int p_992_1_)
    {
        if(field_1488_w)
        {
            throw new IllegalStateException("Already tesselating!");
        } else
        {
            field_1488_w = true;
            func_985_d();
            field_1493_r = p_992_1_;
            field_1499_n = false;
            field_1501_l = false;
            field_1500_m = false;
            field_35838_p = false;
            field_1495_q = false;
            return;
        }
    }

    public void func_981_a(double p_981_1_, double p_981_3_)
    {
        field_1500_m = true;
        field_1504_i = p_981_1_;
        field_1503_j = p_981_3_;
    }

    public void func_35835_b(int p_35835_1_)
    {
        field_35838_p = true;
        field_35837_l = p_35835_1_;
    }

    public void func_987_a(float p_987_1_, float p_987_2_, float p_987_3_)
    {
        func_979_a((int)(p_987_1_ * 255F), (int)(p_987_2_ * 255F), (int)(p_987_3_ * 255F));
    }

    public void func_986_a(float p_986_1_, float p_986_2_, float p_986_3_, float p_986_4_)
    {
        func_978_a((int)(p_986_1_ * 255F), (int)(p_986_2_ * 255F), (int)(p_986_3_ * 255F), (int)(p_986_4_ * 255F));
    }

    public void func_979_a(int p_979_1_, int p_979_2_, int p_979_3_)
    {
        func_978_a(p_979_1_, p_979_2_, p_979_3_, 255);
    }

    public void func_978_a(int p_978_1_, int p_978_2_, int p_978_3_, int p_978_4_)
    {
        if(field_1495_q)
        {
            return;
        }
        if(p_978_1_ > 255)
        {
            p_978_1_ = 255;
        }
        if(p_978_2_ > 255)
        {
            p_978_2_ = 255;
        }
        if(p_978_3_ > 255)
        {
            p_978_3_ = 255;
        }
        if(p_978_4_ > 255)
        {
            p_978_4_ = 255;
        }
        if(p_978_1_ < 0)
        {
            p_978_1_ = 0;
        }
        if(p_978_2_ < 0)
        {
            p_978_2_ = 0;
        }
        if(p_978_3_ < 0)
        {
            p_978_3_ = 0;
        }
        if(p_978_4_ < 0)
        {
            p_978_4_ = 0;
        }
        field_1501_l = true;
        if(littleEndianByteOrder)
        {
            field_1502_k = p_978_4_ << 24 | p_978_3_ << 16 | p_978_2_ << 8 | p_978_1_;
        } else
        {
            field_1502_k = p_978_1_ << 24 | p_978_2_ << 16 | p_978_3_ << 8 | p_978_4_;
        }
    }

    public void func_983_a(double p_983_1_, double p_983_3_, double p_983_5_, double p_983_7_, double p_983_9_)
    {
        func_981_a(p_983_7_, p_983_9_);
        func_991_a(p_983_1_, p_983_3_, p_983_5_);
    }

    public void func_991_a(double p_991_1_, double p_991_3_, double p_991_5_)
    {
        if(autoGrow && field_1498_o >= field_1494_B - 32)
        {
            Config.dbg((new StringBuilder()).append("Expand tessellator buffer, old: ").append(field_1494_B).append(", new: ").append(field_1494_B * 2).toString());
            field_1494_B *= 2;
            int ai[] = new int[field_1494_B];
            System.arraycopy(field_1506_g, 0, ai, 0, field_1506_g.length);
            field_1506_g = ai;
            field_1509_d = GLAllocation.func_1127_b(field_1494_B * 4);
            field_1508_e = field_1509_d.asIntBuffer();
            field_1507_f = field_1509_d.asFloatBuffer();
            field_35836_g = field_1509_d.asShortBuffer();
        }
        field_1497_p++;
        if(field_1493_r == 7 && field_1511_b && field_1497_p % 4 == 0)
        {
            for(int i = 0; i < 2; i++)
            {
                int j = 8 * (3 - i);
                if(field_1500_m)
                {
                    field_1506_g[field_1498_o + 3] = field_1506_g[(field_1498_o - j) + 3];
                    field_1506_g[field_1498_o + 4] = field_1506_g[(field_1498_o - j) + 4];
                }
                if(field_35838_p)
                {
                    field_1506_g[field_1498_o + 7] = field_1506_g[(field_1498_o - j) + 7];
                }
                if(field_1501_l)
                {
                    field_1506_g[field_1498_o + 5] = field_1506_g[(field_1498_o - j) + 5];
                }
                field_1506_g[field_1498_o + 0] = field_1506_g[(field_1498_o - j) + 0];
                field_1506_g[field_1498_o + 1] = field_1506_g[(field_1498_o - j) + 1];
                field_1506_g[field_1498_o + 2] = field_1506_g[(field_1498_o - j) + 2];
                field_1505_h++;
                field_1498_o += 8;
            }

        }
        if(field_1500_m)
        {
            field_1506_g[field_1498_o + 3] = Float.floatToRawIntBits((float)field_1504_i);
            field_1506_g[field_1498_o + 4] = Float.floatToRawIntBits((float)field_1503_j);
        }
        if(field_35838_p)
        {
            field_1506_g[field_1498_o + 7] = field_35837_l;
        }
        if(field_1501_l)
        {
            field_1506_g[field_1498_o + 5] = field_1502_k;
        }
        if(field_1499_n)
        {
            field_1506_g[field_1498_o + 6] = field_1489_v;
        }
        field_1506_g[field_1498_o + 0] = Float.floatToRawIntBits((float)(p_991_1_ + field_1492_s));
        field_1506_g[field_1498_o + 1] = Float.floatToRawIntBits((float)(p_991_3_ + field_1491_t));
        field_1506_g[field_1498_o + 2] = Float.floatToRawIntBits((float)(p_991_5_ + field_1490_u));
        field_1498_o += 8;
        field_1505_h++;
        if(!autoGrow && field_1497_p % 4 == 0 && field_1498_o >= field_1494_B - 32)
        {
            func_982_a();
            field_1488_w = true;
        }
    }

    public void func_990_b(int p_990_1_)
    {
        int i = p_990_1_ >> 16 & 0xff;
        int j = p_990_1_ >> 8 & 0xff;
        int k = p_990_1_ & 0xff;
        func_979_a(i, j, k);
    }

    public void func_6513_a(int p_6513_1_, int p_6513_2_)
    {
        int i = p_6513_1_ >> 16 & 0xff;
        int j = p_6513_1_ >> 8 & 0xff;
        int k = p_6513_1_ & 0xff;
        func_978_a(i, j, k, p_6513_2_);
    }

    public void func_989_c()
    {
        field_1495_q = true;
    }

    public void func_980_b(float p_980_1_, float p_980_2_, float p_980_3_)
    {
        field_1499_n = true;
        byte byte0 = (byte)(int)(p_980_1_ * 127F);
        byte byte1 = (byte)(int)(p_980_2_ * 127F);
        byte byte2 = (byte)(int)(p_980_3_ * 127F);
        field_1489_v = byte0 & 0xff | (byte1 & 0xff) << 8 | (byte2 & 0xff) << 16;
    }

    public void func_984_b(double p_984_1_, double p_984_3_, double p_984_5_)
    {
        field_1492_s = p_984_1_;
        field_1491_t = p_984_3_;
        field_1490_u = p_984_5_;
    }

    public void func_988_c(float p_988_1_, float p_988_2_, float p_988_3_)
    {
        field_1492_s += p_988_1_;
        field_1491_t += p_988_2_;
        field_1490_u += p_988_3_;
    }

    public boolean isRenderingChunk()
    {
        return renderingChunk;
    }

    public void setRenderingChunk(boolean flag)
    {
        if(renderingChunk != flag)
        {
            for(int i = 0; i < subTextures.length; i++)
            {
                subTextures[i] = 0;
            }

        }
        renderingChunk = flag;
        if(textureUpdateTime != Config.getTextureUpdateTime())
        {
            terrainTexture = 0;
            textureUpdateTime = Config.getTextureUpdateTime();
        }
    }

    public Tessellator getSubTessellator(int i)
    {
        Tessellator tessellator = getSubTessellatorImpl(i);
        if(!tessellator.field_1488_w)
        {
            tessellator.func_992_a(field_1493_r);
        }
        tessellator.field_35837_l = field_35837_l;
        tessellator.field_35838_p = field_35838_p;
        tessellator.field_1502_k = field_1502_k;
        tessellator.field_1501_l = field_1501_l;
        tessellator.field_1489_v = field_1489_v;
        tessellator.field_1499_n = field_1499_n;
        tessellator.renderingChunk = renderingChunk;
        tessellator.defaultTexture = false;
        tessellator.field_1492_s = field_1492_s;
        tessellator.field_1491_t = field_1491_t;
        tessellator.field_1490_u = field_1490_u;
        return tessellator;
    }

    public Tessellator getSubTessellatorImpl(int i)
    {
        for(int j = 0; j < subTextures.length; j++)
        {
            int l = subTextures[j];
            if(l == i)
            {
                Tessellator tessellator1 = subTessellators[j];
                return tessellator1;
            }
        }

        for(int k = 0; k < subTextures.length; k++)
        {
            int i1 = subTextures[k];
            if(i1 <= 0)
            {
                Tessellator tessellator2 = subTessellators[k];
                subTextures[k] = i;
                return tessellator2;
            }
        }

        Tessellator tessellator = new Tessellator();
        Tessellator atessellator[] = subTessellators;
        int ai[] = subTextures;
        subTessellators = new Tessellator[atessellator.length + 1];
        subTextures = new int[ai.length + 1];
        System.arraycopy(atessellator, 0, subTessellators, 0, atessellator.length);
        System.arraycopy(ai, 0, subTextures, 0, ai.length);
        subTessellators[atessellator.length] = tessellator;
        subTextures[ai.length] = i;
        Config.dbg((new StringBuilder()).append("Allocated subtessellator, count: ").append(subTessellators.length).toString());
        return tessellator;
    }

    private int getTerrainTexture()
    {
        if(terrainTexture == 0)
        {
            terrainTexture = Config.getMinecraft().field_6315_n.func_1070_a("/terrain.png");
        }
        return terrainTexture;
    }

    static 
    {
        littleEndianByteOrder = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
    }
}
