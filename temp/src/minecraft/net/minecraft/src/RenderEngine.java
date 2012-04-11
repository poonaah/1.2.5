// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

// Referenced classes of package net.minecraft.src:
//            IntHashMap, GLAllocation, TexturePackList, TexturePackBase, 
//            Tessellator, Config, GameSettings, RandomMobs, 
//            ThreadDownloadImageData, TextureFX, TextureHDFX, CustomColorizer, 
//            Block, BlockPortal, BlockFire, TexturePackDefault, 
//            TextureHDLavaFX, TextureHDWaterFX, TextureHDPortalFX, TextureHDWaterFlowFX, 
//            TextureHDLavaFlowFX, TextureHDFlamesFX, TextureHDCompassFX, TextureHDWatchFX, 
//            TextureHDCustomFX, ImageBuffer

public class RenderEngine
{

    public static boolean field_1609_a = true;
    private HashMap field_6528_b;
    private HashMap field_28151_c;
    private IntHashMap field_1607_c;
    private IntBuffer field_1606_d;
    private ByteBuffer field_1605_e;
    private java.util.List field_1604_f;
    private Map field_1603_g;
    private GameSettings field_1602_h;
    public boolean field_4281_i;
    public boolean field_4280_j;
    public TexturePackList field_6527_k;
    private BufferedImage field_25189_l;
    private int field_48512_n;
    private int terrainTextureId;
    private int guiItemsTextureId;
    private int ctmTextureId;
    private boolean hdTexturesInstalled;
    private Map textureDimensionsMap;
    private Map textureDataMap;
    private int tickCounter;
    private ByteBuffer mipImageDatas[];
    private boolean dynamicTexturesUpdated;
    private Map textureFxMap;
    private Map mipDataBufsMap;

    public RenderEngine(TexturePackList p_i754_1_, GameSettings p_i754_2_)
    {
        terrainTextureId = -1;
        guiItemsTextureId = -1;
        ctmTextureId = -1;
        hdTexturesInstalled = false;
        textureDimensionsMap = new HashMap();
        textureDataMap = new HashMap();
        tickCounter = 0;
        dynamicTexturesUpdated = false;
        textureFxMap = new IdentityHashMap();
        mipDataBufsMap = new HashMap();
        field_6528_b = new HashMap();
        field_28151_c = new HashMap();
        field_1607_c = new IntHashMap();
        field_1606_d = GLAllocation.func_1125_c(1);
        allocateImageData(256);
        field_1604_f = new ArrayList();
        field_1603_g = new HashMap();
        field_4281_i = false;
        field_4280_j = false;
        field_25189_l = new BufferedImage(64, 64, 2);
        field_48512_n = 16;
        field_6527_k = p_i754_1_;
        field_1602_h = p_i754_2_;
        Graphics g = field_25189_l.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 64, 64);
        g.setColor(Color.BLACK);
        g.drawString("missingtex", 1, 10);
        g.dispose();
    }

    public int[] func_28149_a(String p_28149_1_)
    {
        TexturePackBase texturepackbase = field_6527_k.field_6534_a;
        int ai[] = (int[])field_28151_c.get(p_28149_1_);
        if(ai != null)
        {
            return ai;
        }
        try
        {
            int ai1[] = null;
            if(p_28149_1_.startsWith("##"))
            {
                ai1 = func_28148_b(func_1069_b(func_6526_a(texturepackbase.func_6481_a(p_28149_1_.substring(2)))));
            } else
            if(p_28149_1_.startsWith("%clamp%"))
            {
                field_4281_i = true;
                ai1 = func_28148_b(func_6526_a(texturepackbase.func_6481_a(p_28149_1_.substring(7))));
                field_4281_i = false;
            } else
            if(p_28149_1_.startsWith("%blur%"))
            {
                field_4280_j = true;
                field_4281_i = true;
                ai1 = func_28148_b(func_6526_a(texturepackbase.func_6481_a(p_28149_1_.substring(6))));
                field_4281_i = false;
                field_4280_j = false;
            } else
            {
                InputStream inputstream = texturepackbase.func_6481_a(p_28149_1_);
                if(inputstream == null)
                {
                    ai1 = func_28148_b(field_25189_l);
                } else
                {
                    ai1 = func_28148_b(func_6526_a(inputstream));
                }
            }
            field_28151_c.put(p_28149_1_, ai1);
            return ai1;
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        int ai2[] = func_28148_b(field_25189_l);
        field_28151_c.put(p_28149_1_, ai2);
        return ai2;
    }

    private int[] func_28148_b(BufferedImage p_28148_1_)
    {
        int i = p_28148_1_.getWidth();
        int j = p_28148_1_.getHeight();
        int ai[] = new int[i * j];
        p_28148_1_.getRGB(0, 0, i, j, ai, 0, i);
        return ai;
    }

    private int[] func_28147_a(BufferedImage p_28147_1_, int p_28147_2_[])
    {
        int i = p_28147_1_.getWidth();
        int j = p_28147_1_.getHeight();
        p_28147_1_.getRGB(0, 0, i, j, p_28147_2_, 0, i);
        return p_28147_2_;
    }

    public int func_1070_a(String p_1070_1_)
    {
        TexturePackBase texturepackbase = field_6527_k.field_6534_a;
        Integer integer = (Integer)field_6528_b.get(p_1070_1_);
        if(integer != null)
        {
            return integer.intValue();
        }
        try
        {
            field_1606_d.clear();
            GLAllocation.func_1128_a(field_1606_d);
            if(Tessellator.renderingWorldRenderer)
            {
                System.out.printf("Warning: Texture %s not preloaded, will cause render glitches!\n", new Object[] {
                    p_1070_1_
                });
            }
            int i = field_1606_d.get(0);
            Config.dbg((new StringBuilder()).append("setupTexture: \"").append(p_1070_1_).append("\", id: ").append(i).toString());
            if(p_1070_1_.startsWith("##"))
            {
                func_1068_a(func_1069_b(func_6526_a(texturepackbase.func_6481_a(p_1070_1_.substring(2)))), i);
            } else
            if(p_1070_1_.startsWith("%clamp%"))
            {
                field_4281_i = true;
                func_1068_a(func_6526_a(texturepackbase.func_6481_a(p_1070_1_.substring(7))), i);
                field_4281_i = false;
            } else
            if(p_1070_1_.startsWith("%blur%"))
            {
                field_4280_j = true;
                func_1068_a(func_6526_a(texturepackbase.func_6481_a(p_1070_1_.substring(6))), i);
                field_4280_j = false;
            } else
            if(p_1070_1_.startsWith("%blurclamp%"))
            {
                field_4280_j = true;
                field_4281_i = true;
                func_1068_a(func_6526_a(texturepackbase.func_6481_a(p_1070_1_.substring(11))), i);
                field_4280_j = false;
                field_4281_i = false;
            } else
            {
                InputStream inputstream = texturepackbase.func_6481_a(p_1070_1_);
                if(inputstream == null)
                {
                    func_1068_a(field_25189_l, i);
                } else
                {
                    if(p_1070_1_.equals("/terrain.png"))
                    {
                        terrainTextureId = i;
                    }
                    if(p_1070_1_.equals("/gui/items.png"))
                    {
                        guiItemsTextureId = i;
                    }
                    if(p_1070_1_.equals("/ctm.png"))
                    {
                        ctmTextureId = i;
                    }
                    func_1068_a(func_6526_a(inputstream), i);
                }
            }
            field_6528_b.put(p_1070_1_, Integer.valueOf(i));
            return i;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        GLAllocation.func_1128_a(field_1606_d);
        int j = field_1606_d.get(0);
        func_1068_a(field_25189_l, j);
        field_6528_b.put(p_1070_1_, Integer.valueOf(j));
        return j;
    }

    private BufferedImage func_1069_b(BufferedImage p_1069_1_)
    {
        int i = p_1069_1_.getWidth() / 16;
        BufferedImage bufferedimage = new BufferedImage(16, p_1069_1_.getHeight() * i, 2);
        Graphics g = bufferedimage.getGraphics();
        for(int j = 0; j < i; j++)
        {
            g.drawImage(p_1069_1_, -j * 16, j * p_1069_1_.getHeight(), null);
        }

        g.dispose();
        return bufferedimage;
    }

    public int func_1074_a(BufferedImage p_1074_1_)
    {
        field_1606_d.clear();
        GLAllocation.func_1128_a(field_1606_d);
        int i = field_1606_d.get(0);
        func_1068_a(p_1074_1_, i);
        field_1607_c.func_1061_a(i, p_1074_1_);
        return i;
    }

    public void func_1068_a(BufferedImage p_1068_1_, int p_1068_2_)
    {
        GL11.glBindTexture(3553, p_1068_2_);
        boolean flag = field_1609_a && Config.isUseMipmaps();
        if(flag && p_1068_2_ != guiItemsTextureId)
        {
            int i = Config.getMipmapType();
            GL11.glTexParameteri(3553, 10241, i);
            GL11.glTexParameteri(3553, 10240, 9728);
            if(GLContext.getCapabilities().OpenGL12)
            {
                GL11.glTexParameteri(3553, 33084, 0);
                int k = Config.getMipmapLevel();
                if(k >= 4)
                {
                    int i1 = Math.min(p_1068_1_.getWidth(), p_1068_1_.getHeight());
                    k = getMaxMipmapLevel(i1) - 4;
                    if(k < 0)
                    {
                        k = 0;
                    }
                }
                GL11.glTexParameteri(3553, 33085, k);
            }
        } else
        {
            GL11.glTexParameteri(3553, 10241, 9728);
            GL11.glTexParameteri(3553, 10240, 9728);
        }
        if(field_4280_j)
        {
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
        }
        if(field_4281_i)
        {
            GL11.glTexParameteri(3553, 10242, 10496);
            GL11.glTexParameteri(3553, 10243, 10496);
        } else
        {
            GL11.glTexParameteri(3553, 10242, 10497);
            GL11.glTexParameteri(3553, 10243, 10497);
        }
        int j = p_1068_1_.getWidth();
        int l = p_1068_1_.getHeight();
        setTextureDimension(p_1068_2_, new Dimension(j, l));
        int ai[] = new int[j * l];
        byte abyte0[] = new byte[j * l * 4];
        p_1068_1_.getRGB(0, 0, j, l, ai, 0, j);
        for(int j1 = 0; j1 < ai.length; j1++)
        {
            int k1 = ai[j1] >> 24 & 0xff;
            int l1 = ai[j1] >> 16 & 0xff;
            int i2 = ai[j1] >> 8 & 0xff;
            int j2 = ai[j1] & 0xff;
            if(field_1602_h != null && field_1602_h.field_1578_g)
            {
                int k2 = (l1 * 30 + i2 * 59 + j2 * 11) / 100;
                int l2 = (l1 * 30 + i2 * 70) / 100;
                int i3 = (l1 * 30 + j2 * 70) / 100;
                l1 = k2;
                i2 = l2;
                j2 = i3;
            }
            if(k1 == 0)
            {
                if(isTerrainTexture(p_1068_2_))
                {
                    l1 = 255;
                    i2 = 255;
                    j2 = 255;
                } else
                {
                    l1 = 0;
                    i2 = 0;
                    j2 = 0;
                }
            }
            abyte0[j1 * 4 + 0] = (byte)l1;
            abyte0[j1 * 4 + 1] = (byte)i2;
            abyte0[j1 * 4 + 2] = (byte)j2;
            abyte0[j1 * 4 + 3] = (byte)k1;
        }

        checkImageDataSize(j);
        field_1605_e.clear();
        field_1605_e.put(abyte0);
        field_1605_e.position(0).limit(abyte0.length);
        GL11.glTexImage2D(3553, 0, 6408, j, l, 0, 6408, 5121, field_1605_e);
        if(field_1609_a)
        {
            generateMipMaps(field_1605_e, j, l);
        }
    }

    private boolean isTerrainTexture(int i)
    {
        if(i == terrainTextureId)
        {
            return true;
        }
        return i == ctmTextureId;
    }

    private void generateMipMaps(ByteBuffer bytebuffer, int i, int j)
    {
        ByteBuffer bytebuffer1 = bytebuffer;
        int k = 1;
        do
        {
            if(k > 16)
            {
                break;
            }
            int l = i >> k - 1;
            int i1 = i >> k;
            int j1 = j >> k;
            if(i1 <= 0 || j1 <= 0)
            {
                break;
            }
            ByteBuffer bytebuffer2 = mipImageDatas[k - 1];
            bytebuffer2.limit(i1 * j1 * 4);
            for(int k1 = 0; k1 < i1; k1++)
            {
                for(int l1 = 0; l1 < j1; l1++)
                {
                    int i2 = bytebuffer1.getInt((k1 * 2 + 0 + (l1 * 2 + 0) * l) * 4);
                    int j2 = bytebuffer1.getInt((k1 * 2 + 1 + (l1 * 2 + 0) * l) * 4);
                    int k2 = bytebuffer1.getInt((k1 * 2 + 1 + (l1 * 2 + 1) * l) * 4);
                    int l2 = bytebuffer1.getInt((k1 * 2 + 0 + (l1 * 2 + 1) * l) * 4);
                    int i3 = alphaBlend(i2, j2, k2, l2);
                    bytebuffer2.putInt((k1 + l1 * i1) * 4, i3);
                }

            }

            bytebuffer2.rewind();
            GL11.glTexImage2D(3553, k, 6408, i1, j1, 0, 6408, 5121, bytebuffer2);
            bytebuffer1 = bytebuffer2;
            k++;
        } while(true);
    }

    public void func_28150_a(int p_28150_1_[], int p_28150_2_, int p_28150_3_, int p_28150_4_)
    {
        GL11.glBindTexture(3553, p_28150_4_);
        if(field_1609_a && Config.isUseMipmaps())
        {
            GL11.glTexParameteri(3553, 10241, 9986);
            GL11.glTexParameteri(3553, 10240, 9728);
        } else
        {
            GL11.glTexParameteri(3553, 10241, 9728);
            GL11.glTexParameteri(3553, 10240, 9728);
        }
        if(field_4280_j)
        {
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
        }
        if(field_4281_i)
        {
            GL11.glTexParameteri(3553, 10242, 10496);
            GL11.glTexParameteri(3553, 10243, 10496);
        } else
        {
            GL11.glTexParameteri(3553, 10242, 10497);
            GL11.glTexParameteri(3553, 10243, 10497);
        }
        byte abyte0[] = new byte[p_28150_2_ * p_28150_3_ * 4];
        for(int i = 0; i < p_28150_1_.length; i++)
        {
            int j = p_28150_1_[i] >> 24 & 0xff;
            int k = p_28150_1_[i] >> 16 & 0xff;
            int l = p_28150_1_[i] >> 8 & 0xff;
            int i1 = p_28150_1_[i] & 0xff;
            if(field_1602_h != null && field_1602_h.field_1578_g)
            {
                int j1 = (k * 30 + l * 59 + i1 * 11) / 100;
                int k1 = (k * 30 + l * 70) / 100;
                int l1 = (k * 30 + i1 * 70) / 100;
                k = j1;
                l = k1;
                i1 = l1;
            }
            abyte0[i * 4 + 0] = (byte)k;
            abyte0[i * 4 + 1] = (byte)l;
            abyte0[i * 4 + 2] = (byte)i1;
            abyte0[i * 4 + 3] = (byte)j;
        }

        field_1605_e.clear();
        field_1605_e.put(abyte0);
        field_1605_e.position(0).limit(abyte0.length);
        GL11.glTexSubImage2D(3553, 0, 0, 0, p_28150_2_, p_28150_3_, 6408, 5121, field_1605_e);
    }

    public void func_1078_a(int p_1078_1_)
    {
        field_1607_c.func_1052_b(p_1078_1_);
        field_1606_d.clear();
        field_1606_d.put(p_1078_1_);
        field_1606_d.flip();
        GL11.glDeleteTextures(field_1606_d);
    }

    public int func_1071_a(String p_1071_1_, String p_1071_2_)
    {
        if(Config.isRandomMobs())
        {
            int i = RandomMobs.getTexture(p_1071_1_, p_1071_2_);
            if(i >= 0)
            {
                return i;
            }
        }
        ThreadDownloadImageData threaddownloadimagedata = (ThreadDownloadImageData)field_1603_g.get(p_1071_1_);
        if(threaddownloadimagedata != null && threaddownloadimagedata.field_1706_a != null && !threaddownloadimagedata.field_1707_d)
        {
            if(threaddownloadimagedata.field_1708_c < 0)
            {
                threaddownloadimagedata.field_1708_c = func_1074_a(threaddownloadimagedata.field_1706_a);
            } else
            {
                func_1068_a(threaddownloadimagedata.field_1706_a, threaddownloadimagedata.field_1708_c);
            }
            threaddownloadimagedata.field_1707_d = true;
        }
        if(threaddownloadimagedata == null || threaddownloadimagedata.field_1708_c < 0)
        {
            if(p_1071_2_ == null)
            {
                return -1;
            } else
            {
                return func_1070_a(p_1071_2_);
            }
        } else
        {
            return threaddownloadimagedata.field_1708_c;
        }
    }

    public ThreadDownloadImageData func_1075_a(String p_1075_1_, ImageBuffer p_1075_2_)
    {
        ThreadDownloadImageData threaddownloadimagedata = (ThreadDownloadImageData)field_1603_g.get(p_1075_1_);
        if(threaddownloadimagedata == null)
        {
            field_1603_g.put(p_1075_1_, new ThreadDownloadImageData(p_1075_1_, p_1075_2_));
        } else
        {
            threaddownloadimagedata.field_1705_b++;
        }
        return threaddownloadimagedata;
    }

    public void func_1073_b(String p_1073_1_)
    {
        ThreadDownloadImageData threaddownloadimagedata = (ThreadDownloadImageData)field_1603_g.get(p_1073_1_);
        if(threaddownloadimagedata != null)
        {
            threaddownloadimagedata.field_1705_b--;
            if(threaddownloadimagedata.field_1705_b == 0)
            {
                if(threaddownloadimagedata.field_1708_c >= 0)
                {
                    func_1078_a(threaddownloadimagedata.field_1708_c);
                }
                field_1603_g.remove(p_1073_1_);
            }
        }
    }

    public void func_1066_a(TextureFX p_1066_1_)
    {
        int i = getTextureId(p_1066_1_);
        for(int j = 0; j < field_1604_f.size(); j++)
        {
            TextureFX texturefx = (TextureFX)field_1604_f.get(j);
            int k = getTextureId(texturefx);
            if(k == i && texturefx.field_1126_b == p_1066_1_.field_1126_b)
            {
                field_1604_f.remove(j);
                j--;
                Config.log((new StringBuilder()).append("TextureFX removed: ").append(texturefx).append(", texId: ").append(k).append(", index: ").append(texturefx.field_1126_b).toString());
            }
        }

        if(p_1066_1_ instanceof TextureHDFX)
        {
            TextureHDFX texturehdfx = (TextureHDFX)p_1066_1_;
            texturehdfx.setTexturePackBase(field_6527_k.field_6534_a);
            Dimension dimension = getTextureDimensions(i);
            if(dimension != null)
            {
                texturehdfx.setTileWidth(dimension.width / 16);
            }
        }
        field_1604_f.add(p_1066_1_);
        p_1066_1_.func_783_a();
        Config.log((new StringBuilder()).append("TextureFX registered: ").append(p_1066_1_).append(", texId: ").append(i).append(", index: ").append(p_1066_1_.field_1126_b).toString());
        dynamicTexturesUpdated = false;
    }

    private int getTextureId(TextureFX texturefx)
    {
        Integer integer = (Integer)textureFxMap.get(texturefx);
        if(integer != null)
        {
            return integer.intValue();
        } else
        {
            int i = getBoundTexture();
            texturefx.func_782_a(this);
            int j = getBoundTexture();
            func_1076_b(i);
            textureFxMap.put(texturefx, new Integer(j));
            return j;
        }
    }

    private int getBoundTexture()
    {
        int i = GL11.glGetInteger(32873);
        return i;
    }

    private void generateMipMapsSub(int i, int j, int k, int l, ByteBuffer bytebuffer, int i1, boolean flag, 
            String s)
    {
        ByteBuffer bytebuffer1 = bytebuffer;
        byte abyte0[][] = (byte[][])null;
        if(s.length() > 0)
        {
            abyte0 = (byte[][])mipDataBufsMap.get(s);
            if(abyte0 == null)
            {
                abyte0 = new byte[17][];
                mipDataBufsMap.put(s, abyte0);
            }
        }
        int j1 = 1;
        do
        {
            if(j1 > 16)
            {
                break;
            }
            int k1 = k >> j1 - 1;
            int l1 = k >> j1;
            int i2 = l >> j1;
            int j2 = i >> j1;
            int k2 = j >> j1;
            if(l1 <= 0 || i2 <= 0)
            {
                break;
            }
            ByteBuffer bytebuffer2 = mipImageDatas[j1 - 1];
            bytebuffer2.limit(l1 * i2 * 4);
            byte abyte1[] = null;
            if(abyte0 != null)
            {
                abyte1 = abyte0[j1];
            }
            if(abyte1 != null && abyte1.length != l1 * i2 * 4)
            {
                abyte1 = null;
            }
            if(abyte1 == null)
            {
                if(abyte0 != null)
                {
                    abyte1 = new byte[l1 * i2 * 4];
                }
                for(int l2 = 0; l2 < l1; l2++)
                {
                    for(int j3 = 0; j3 < i2; j3++)
                    {
                        int l3 = bytebuffer1.getInt((l2 * 2 + 0 + (j3 * 2 + 0) * k1) * 4);
                        int j4 = bytebuffer1.getInt((l2 * 2 + 1 + (j3 * 2 + 0) * k1) * 4);
                        int l4 = bytebuffer1.getInt((l2 * 2 + 1 + (j3 * 2 + 1) * k1) * 4);
                        int i5 = bytebuffer1.getInt((l2 * 2 + 0 + (j3 * 2 + 1) * k1) * 4);
                        int j5;
                        if(flag)
                        {
                            j5 = averageColor(averageColor(l3, j4), averageColor(l4, i5));
                        } else
                        {
                            j5 = alphaBlend(l3, j4, l4, i5);
                        }
                        bytebuffer2.putInt((l2 + j3 * l1) * 4, j5);
                    }

                }

                if(abyte0 != null)
                {
                    bytebuffer2.rewind();
                    bytebuffer2.get(abyte1);
                    abyte0[j1] = abyte1;
                }
            }
            if(abyte1 != null)
            {
                bytebuffer2.rewind();
                bytebuffer2.put(abyte1);
            }
            bytebuffer2.rewind();
            for(int i3 = 0; i3 < i1; i3++)
            {
                for(int k3 = 0; k3 < i1; k3++)
                {
                    int i4 = i3 * l1;
                    int k4 = k3 * i2;
                    GL11.glTexSubImage2D(3553, j1, j2 + i4, k2 + k4, l1, i2, 6408, 5121, bytebuffer2);
                }

            }

            bytebuffer1 = bytebuffer2;
            j1++;
        } while(true);
    }

    public void func_1067_a()
    {
        boolean flag = field_1609_a && Config.isUseMipmaps();
        checkHdTextures();
        tickCounter++;
        terrainTextureId = func_1070_a("/terrain.png");
        guiItemsTextureId = func_1070_a("/gui/items.png");
        ctmTextureId = func_1070_a("/ctm.png");
        StringBuffer stringbuffer = new StringBuffer();
        int i = -1;
label0:
        for(int j = 0; j < field_1604_f.size(); j++)
        {
            TextureFX texturefx = (TextureFX)field_1604_f.get(j);
            texturefx.field_1131_c = field_1602_h.field_1578_g;
            if(texturefx.getClass().getName().equals("ModTextureStatic") && dynamicTexturesUpdated)
            {
                continue;
            }
            int k = getTextureId(texturefx);
            Dimension dimension = getTextureDimensions(k);
            if(dimension == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unknown dimensions for texture id: ").append(k).toString());
            }
            int l = dimension.width / 16;
            int i1 = dimension.height / 16;
            checkImageDataSize(dimension.width);
            field_1605_e.limit(0);
            stringbuffer.setLength(0);
            boolean flag1 = updateCustomTexture(texturefx, k, field_1605_e, dimension.width / 16, stringbuffer);
            if(flag1 && field_1605_e.limit() <= 0)
            {
                continue;
            }
            if(field_1605_e.limit() <= 0)
            {
                boolean flag2 = updateDefaultTexture(texturefx, k, field_1605_e, dimension.width / 16, stringbuffer);
                if(flag2 && field_1605_e.limit() <= 0)
                {
                    continue;
                }
            }
            if(field_1605_e.limit() <= 0)
            {
                texturefx.func_783_a();
                if(texturefx.field_1127_a == null)
                {
                    continue;
                }
                int j1 = l * i1 * 4;
                if(texturefx.field_1127_a.length == j1)
                {
                    field_1605_e.clear();
                    field_1605_e.put(texturefx.field_1127_a);
                    field_1605_e.position(0).limit(texturefx.field_1127_a.length);
                } else
                {
                    copyScaled(texturefx.field_1127_a, field_1605_e, l);
                }
            }
            if(k != i)
            {
                texturefx.func_782_a(this);
                i = k;
            }
            boolean flag3 = scalesWithFastColor(texturefx);
            int k1 = 0;
            do
            {
                if(k1 >= texturefx.field_1129_e)
                {
                    continue label0;
                }
                for(int l1 = 0; l1 < texturefx.field_1129_e; l1++)
                {
                    int i2 = (texturefx.field_1126_b % 16) * l + k1 * l;
                    int j2 = (texturefx.field_1126_b / 16) * i1 + l1 * i1;
                    GL11.glTexSubImage2D(3553, 0, i2, j2, l, i1, 6408, 5121, field_1605_e);
                    if(!flag || k == guiItemsTextureId)
                    {
                        continue;
                    }
                    String s = stringbuffer.toString();
                    if(k1 == 0 && l1 == 0)
                    {
                        generateMipMapsSub(i2, j2, l, i1, field_1605_e, texturefx.field_1129_e, flag3, s);
                    }
                }

                k1++;
            } while(true);
        }

        dynamicTexturesUpdated = true;
    }

    private int averageColor(int i, int j)
    {
        int k = (i & 0xff000000) >> 24 & 0xff;
        int l = (j & 0xff000000) >> 24 & 0xff;
        return ((k + l >> 1) << 24) + ((i & 0xfefefe) + (j & 0xfefefe) >> 1);
    }

    private int alphaBlend(int i, int j, int k, int l)
    {
        int i1 = func_1077_b(i, j);
        int j1 = func_1077_b(k, l);
        int k1 = func_1077_b(i1, j1);
        return k1;
    }

    private int func_1077_b(int p_1077_1_, int p_1077_2_)
    {
        int i = (p_1077_1_ & 0xff000000) >> 24 & 0xff;
        int j = (p_1077_2_ & 0xff000000) >> 24 & 0xff;
        int k = (i + j) / 2;
        if(i == 0 && j == 0)
        {
            i = 1;
            j = 1;
        } else
        {
            if(i == 0)
            {
                p_1077_1_ = p_1077_2_;
                k /= 2;
            }
            if(j == 0)
            {
                p_1077_2_ = p_1077_1_;
                k /= 2;
            }
        }
        int l = (p_1077_1_ >> 16 & 0xff) * i;
        int i1 = (p_1077_1_ >> 8 & 0xff) * i;
        int j1 = (p_1077_1_ & 0xff) * i;
        int k1 = (p_1077_2_ >> 16 & 0xff) * j;
        int l1 = (p_1077_2_ >> 8 & 0xff) * j;
        int i2 = (p_1077_2_ & 0xff) * j;
        int j2 = (l + k1) / (i + j);
        int k2 = (i1 + l1) / (i + j);
        int l2 = (j1 + i2) / (i + j);
        return k << 24 | j2 << 16 | k2 << 8 | l2;
    }

    public void func_1065_b()
    {
        textureDataMap.clear();
        textureFxMap.clear();
        dynamicTexturesUpdated = false;
        Config.setTextureUpdateTime(System.currentTimeMillis());
        RandomMobs.resetTextures();
        mipDataBufsMap.clear();
        TexturePackBase texturepackbase = field_6527_k.field_6534_a;
        int i;
        BufferedImage bufferedimage;
        for(Iterator iterator = field_1607_c.func_35860_b().iterator(); iterator.hasNext(); func_1068_a(bufferedimage, i))
        {
            i = ((Integer)iterator.next()).intValue();
            bufferedimage = (BufferedImage)field_1607_c.func_1057_a(i);
        }

        for(Iterator iterator1 = field_1603_g.values().iterator(); iterator1.hasNext();)
        {
            ThreadDownloadImageData threaddownloadimagedata = (ThreadDownloadImageData)iterator1.next();
            threaddownloadimagedata.field_1707_d = false;
        }

        Iterator iterator2 = field_6528_b.keySet().iterator();
        do
        {
            if(!iterator2.hasNext())
            {
                break;
            }
            String s = (String)iterator2.next();
            try
            {
                BufferedImage bufferedimage1;
                if(s.startsWith("##"))
                {
                    bufferedimage1 = func_1069_b(func_6526_a(texturepackbase.func_6481_a(s.substring(2))));
                } else
                if(s.startsWith("%clamp%"))
                {
                    field_4281_i = true;
                    bufferedimage1 = func_6526_a(texturepackbase.func_6481_a(s.substring(7)));
                } else
                if(s.startsWith("%blur%"))
                {
                    field_4280_j = true;
                    bufferedimage1 = func_6526_a(texturepackbase.func_6481_a(s.substring(6)));
                } else
                if(s.startsWith("%blurclamp%"))
                {
                    field_4280_j = true;
                    field_4281_i = true;
                    bufferedimage1 = func_6526_a(texturepackbase.func_6481_a(s.substring(11)));
                } else
                {
                    bufferedimage1 = func_6526_a(texturepackbase.func_6481_a(s));
                }
                int j = ((Integer)field_6528_b.get(s)).intValue();
                func_1068_a(bufferedimage1, j);
                field_4280_j = false;
                field_4281_i = false;
            }
            catch(Exception exception)
            {
                if(!"input == null!".equals(exception.getMessage()))
                {
                    exception.printStackTrace();
                }
            }
        } while(true);
        iterator2 = field_28151_c.keySet().iterator();
        do
        {
            if(!iterator2.hasNext())
            {
                break;
            }
            String s1 = (String)iterator2.next();
            try
            {
                BufferedImage bufferedimage2;
                if(s1.startsWith("##"))
                {
                    bufferedimage2 = func_1069_b(func_6526_a(texturepackbase.func_6481_a(s1.substring(2))));
                } else
                if(s1.startsWith("%clamp%"))
                {
                    field_4281_i = true;
                    bufferedimage2 = func_6526_a(texturepackbase.func_6481_a(s1.substring(7)));
                } else
                if(s1.startsWith("%blur%"))
                {
                    field_4280_j = true;
                    bufferedimage2 = func_6526_a(texturepackbase.func_6481_a(s1.substring(6)));
                } else
                {
                    bufferedimage2 = func_6526_a(texturepackbase.func_6481_a(s1));
                }
                func_28147_a(bufferedimage2, (int[])field_28151_c.get(s1));
                field_4280_j = false;
                field_4281_i = false;
            }
            catch(Exception exception1)
            {
                if(!"input == null!".equals(exception1.getMessage()))
                {
                    exception1.printStackTrace();
                }
            }
        } while(true);
        registerCustomTexturesFX();
        CustomColorizer.update(this);
        func_1067_a();
    }

    private BufferedImage func_6526_a(InputStream p_6526_1_)
        throws IOException
    {
        BufferedImage bufferedimage = ImageIO.read(p_6526_1_);
        p_6526_1_.close();
        return bufferedimage;
    }

    public void func_1076_b(int p_1076_1_)
    {
        if(p_1076_1_ < 0)
        {
            return;
        } else
        {
            GL11.glBindTexture(3553, p_1076_1_);
            return;
        }
    }

    private void setTextureDimension(int i, Dimension dimension)
    {
        textureDimensionsMap.put(new Integer(i), dimension);
        if(i == terrainTextureId)
        {
            Config.setIconWidthTerrain(dimension.width / 16);
        }
        if(i == guiItemsTextureId)
        {
            Config.setIconWidthItems(dimension.width / 16);
        }
        updateDinamicTextures(i, dimension);
    }

    private Dimension getTextureDimensions(int i)
    {
        Dimension dimension = (Dimension)textureDimensionsMap.get(new Integer(i));
        return dimension;
    }

    private void updateDinamicTextures(int i, Dimension dimension)
    {
        for(int j = 0; j < field_1604_f.size(); j++)
        {
            TextureFX texturefx = (TextureFX)field_1604_f.get(j);
            int k = getTextureId(texturefx);
            if(k == i && (texturefx instanceof TextureHDFX))
            {
                TextureHDFX texturehdfx = (TextureHDFX)texturefx;
                texturehdfx.setTexturePackBase(field_6527_k.field_6534_a);
                texturehdfx.setTileWidth(dimension.width / 16);
                texturehdfx.func_783_a();
            }
        }

    }

    public boolean updateCustomTexture(TextureFX texturefx, int i, ByteBuffer bytebuffer, int j, StringBuffer stringbuffer)
    {
        if(i == terrainTextureId)
        {
            if(texturefx.field_1126_b == Block.field_399_C.field_378_bb)
            {
                if(Config.isGeneratedWater())
                {
                    return false;
                } else
                {
                    return updateCustomTexture(texturefx, "/custom_water_still.png", bytebuffer, j, Config.isAnimatedWater(), 1, stringbuffer);
                }
            }
            if(texturefx.field_1126_b == Block.field_399_C.field_378_bb + 1)
            {
                if(Config.isGeneratedWater())
                {
                    return false;
                } else
                {
                    return updateCustomTexture(texturefx, "/custom_water_flowing.png", bytebuffer, j, Config.isAnimatedWater(), 1, stringbuffer);
                }
            }
            if(texturefx.field_1126_b == Block.field_395_E.field_378_bb)
            {
                if(Config.isGeneratedLava())
                {
                    return false;
                } else
                {
                    return updateCustomTexture(texturefx, "/custom_lava_still.png", bytebuffer, j, Config.isAnimatedLava(), 1, stringbuffer);
                }
            }
            if(texturefx.field_1126_b == Block.field_395_E.field_378_bb + 1)
            {
                if(Config.isGeneratedLava())
                {
                    return false;
                } else
                {
                    return updateCustomTexture(texturefx, "/custom_lava_flowing.png", bytebuffer, j, Config.isAnimatedLava(), 1, stringbuffer);
                }
            }
            if(texturefx.field_1126_b == Block.field_4047_bf.field_378_bb)
            {
                return updateCustomTexture(texturefx, "/custom_portal.png", bytebuffer, j, Config.isAnimatedPortal(), 1, stringbuffer);
            }
            if(texturefx.field_1126_b == Block.field_402_as.field_378_bb)
            {
                return updateCustomTexture(texturefx, "/custom_fire_n_s.png", bytebuffer, j, Config.isAnimatedFire(), 1, stringbuffer);
            }
            if(texturefx.field_1126_b == Block.field_402_as.field_378_bb + 16)
            {
                return updateCustomTexture(texturefx, "/custom_fire_e_w.png", bytebuffer, j, Config.isAnimatedFire(), 1, stringbuffer);
            }
            if(Config.isAnimatedTerrain())
            {
                return updateCustomTexture(texturefx, (new StringBuilder()).append("/custom_terrain_").append(texturefx.field_1126_b).append(".png").toString(), bytebuffer, j, Config.isAnimatedTerrain(), 1, stringbuffer);
            }
        }
        if(i == guiItemsTextureId && Config.isAnimatedItems())
        {
            return updateCustomTexture(texturefx, (new StringBuilder()).append("/custom_item_").append(texturefx.field_1126_b).append(".png").toString(), bytebuffer, j, Config.isAnimatedTerrain(), 1, stringbuffer);
        } else
        {
            return false;
        }
    }

    private boolean updateDefaultTexture(TextureFX texturefx, int i, ByteBuffer bytebuffer, int j, StringBuffer stringbuffer)
    {
        if(i != terrainTextureId)
        {
            return false;
        }
        if(field_6527_k.field_6534_a instanceof TexturePackDefault)
        {
            return false;
        }
        if(texturefx.field_1126_b == Block.field_399_C.field_378_bb)
        {
            if(Config.isGeneratedWater())
            {
                return false;
            } else
            {
                return updateDefaultTexture(texturefx, bytebuffer, j, false, 1, stringbuffer);
            }
        }
        if(texturefx.field_1126_b == Block.field_399_C.field_378_bb + 1)
        {
            if(Config.isGeneratedWater())
            {
                return false;
            } else
            {
                return updateDefaultTexture(texturefx, bytebuffer, j, Config.isAnimatedWater(), 1, stringbuffer);
            }
        }
        if(texturefx.field_1126_b == Block.field_395_E.field_378_bb)
        {
            if(Config.isGeneratedLava())
            {
                return false;
            } else
            {
                return updateDefaultTexture(texturefx, bytebuffer, j, false, 1, stringbuffer);
            }
        }
        if(texturefx.field_1126_b == Block.field_395_E.field_378_bb + 1)
        {
            if(Config.isGeneratedLava())
            {
                return false;
            } else
            {
                return updateDefaultTexture(texturefx, bytebuffer, j, Config.isAnimatedLava(), 3, stringbuffer);
            }
        } else
        {
            return false;
        }
    }

    private boolean updateDefaultTexture(TextureFX texturefx, ByteBuffer bytebuffer, int i, boolean flag, int j, StringBuffer stringbuffer)
    {
        int k = texturefx.field_1126_b;
        if(!flag && dynamicTexturesUpdated)
        {
            return true;
        }
        byte abyte0[] = getTerrainIconData(k, i, stringbuffer);
        if(abyte0 == null)
        {
            return false;
        }
        bytebuffer.clear();
        int l = abyte0.length;
        if(flag)
        {
            int i1 = i - (tickCounter / j) % i;
            int j1 = i1 * i * 4;
            bytebuffer.put(abyte0, j1, l - j1);
            bytebuffer.put(abyte0, 0, j1);
            stringbuffer.append(":");
            stringbuffer.append(i1);
        } else
        {
            bytebuffer.put(abyte0, 0, l);
        }
        bytebuffer.position(0).limit(l);
        return true;
    }

    private boolean updateCustomTexture(TextureFX texturefx, String s, ByteBuffer bytebuffer, int i, boolean flag, int j, StringBuffer stringbuffer)
    {
        byte abyte0[] = getCustomTextureData(s, i);
        if(abyte0 == null)
        {
            return false;
        }
        if(!flag && dynamicTexturesUpdated)
        {
            return true;
        }
        int k = i * i * 4;
        if(abyte0.length < k)
        {
            return false;
        }
        int l = abyte0.length / k;
        int i1 = (tickCounter / j) % l;
        int j1 = 0;
        if(flag)
        {
            j1 = k * i1;
        }
        bytebuffer.clear();
        bytebuffer.put(abyte0, j1, k);
        bytebuffer.position(0).limit(k);
        stringbuffer.append(s);
        stringbuffer.append(":");
        stringbuffer.append(i1);
        return true;
    }

    private byte[] getTerrainIconData(int i, int j, StringBuffer stringbuffer)
    {
        String s = (new StringBuilder()).append("Tile-").append(i).toString();
        byte abyte0[] = getCustomTextureData(s, j);
        if(abyte0 != null)
        {
            stringbuffer.append(s);
            return abyte0;
        }
        byte abyte1[] = getCustomTextureData("/terrain.png", j * 16);
        if(abyte1 == null)
        {
            return null;
        }
        abyte0 = new byte[j * j * 4];
        int k = i % 16;
        int l = i / 16;
        int i1 = k * j;
        int j1 = l * j;
        int k1 = i1 + j;
        int l1 = j1 + j;
        for(int i2 = 0; i2 < j; i2++)
        {
            int j2 = j1 + i2;
            for(int k2 = 0; k2 < j; k2++)
            {
                int l2 = i1 + k2;
                int i3 = 4 * (l2 + j2 * j * 16);
                int j3 = 4 * (k2 + i2 * j);
                abyte0[j3 + 0] = abyte1[i3 + 0];
                abyte0[j3 + 1] = abyte1[i3 + 1];
                abyte0[j3 + 2] = abyte1[i3 + 2];
                abyte0[j3 + 3] = abyte1[i3 + 3];
            }

        }

        setCustomTextureData(s, abyte0);
        stringbuffer.append(s);
        return abyte0;
    }

    public byte[] getCustomTextureData(String s, int i)
    {
        byte abyte0[] = (byte[])textureDataMap.get(s);
        if(abyte0 == null)
        {
            if(textureDataMap.containsKey(s))
            {
                return null;
            }
            abyte0 = loadImage(s, i);
            if(abyte0 == null)
            {
                abyte0 = loadImage((new StringBuilder()).append("/anim").append(s).toString(), i);
            }
            textureDataMap.put(s, abyte0);
        }
        return abyte0;
    }

    private void setCustomTextureData(String s, byte abyte0[])
    {
        textureDataMap.put(s, abyte0);
    }

    private byte[] loadImage(String s, int i)
    {
        try
        {
            TexturePackBase texturepackbase = field_6527_k.field_6534_a;
            if(texturepackbase == null)
            {
                return null;
            }
            InputStream inputstream = texturepackbase.func_6481_a(s);
            if(inputstream == null)
            {
                return null;
            }
            BufferedImage bufferedimage = func_6526_a(inputstream);
            if(bufferedimage == null)
            {
                return null;
            }
            if(i > 0 && bufferedimage.getWidth() != i)
            {
                double d = bufferedimage.getHeight() / bufferedimage.getWidth();
                int l = (int)((double)i * d);
                bufferedimage = scaleBufferedImage(bufferedimage, i, l);
            }
            int j = bufferedimage.getWidth();
            int k = bufferedimage.getHeight();
            int ai[] = new int[j * k];
            byte abyte0[] = new byte[j * k * 4];
            bufferedimage.getRGB(0, 0, j, k, ai, 0, j);
            for(int i1 = 0; i1 < ai.length; i1++)
            {
                int j1 = ai[i1] >> 24 & 0xff;
                int k1 = ai[i1] >> 16 & 0xff;
                int l1 = ai[i1] >> 8 & 0xff;
                int i2 = ai[i1] & 0xff;
                if(field_1602_h != null && field_1602_h.field_1578_g)
                {
                    int j2 = (k1 * 30 + l1 * 59 + i2 * 11) / 100;
                    int k2 = (k1 * 30 + l1 * 70) / 100;
                    int l2 = (k1 * 30 + i2 * 70) / 100;
                    k1 = j2;
                    l1 = k2;
                    i2 = l2;
                }
                abyte0[i1 * 4 + 0] = (byte)k1;
                abyte0[i1 * 4 + 1] = (byte)l1;
                abyte0[i1 * 4 + 2] = (byte)i2;
                abyte0[i1 * 4 + 3] = (byte)j1;
            }

            return abyte0;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }

    public static BufferedImage scaleBufferedImage(BufferedImage bufferedimage, int i, int j)
    {
        BufferedImage bufferedimage1 = new BufferedImage(i, j, 2);
        Graphics2D graphics2d = bufferedimage1.createGraphics();
        graphics2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2d.drawImage(bufferedimage, 0, 0, i, j, null);
        return bufferedimage1;
    }

    private void checkImageDataSize(int i)
    {
        if(field_1605_e != null)
        {
            int j = i * i * 4;
            if(field_1605_e.capacity() >= j)
            {
                return;
            }
        }
        allocateImageData(i);
    }

    private void allocateImageData(int i)
    {
        int j = i * i * 4;
        field_1605_e = GLAllocation.func_1127_b(j);
        ArrayList arraylist = new ArrayList();
        for(int k = i / 2; k > 0; k /= 2)
        {
            int l = k * k * 4;
            ByteBuffer bytebuffer = GLAllocation.func_1127_b(l);
            arraylist.add(bytebuffer);
        }

        mipImageDatas = (ByteBuffer[])arraylist.toArray(new ByteBuffer[arraylist.size()]);
    }

    public void checkHdTextures()
    {
        if(hdTexturesInstalled)
        {
            return;
        }
        net.minecraft.client.Minecraft minecraft = Config.getMinecraft();
        if(minecraft == null)
        {
            return;
        } else
        {
            hdTexturesInstalled = true;
            func_1066_a(new TextureHDLavaFX());
            func_1066_a(new TextureHDWaterFX());
            func_1066_a(new TextureHDPortalFX());
            func_1066_a(new TextureHDWaterFlowFX());
            func_1066_a(new TextureHDLavaFlowFX());
            func_1066_a(new TextureHDFlamesFX(0));
            func_1066_a(new TextureHDFlamesFX(1));
            func_1066_a(new TextureHDCompassFX(minecraft));
            func_1066_a(new TextureHDWatchFX(minecraft));
            registerCustomTexturesFX();
            CustomColorizer.update(this);
            return;
        }
    }

    private void registerCustomTexturesFX()
    {
        TextureFX atexturefx[] = getRegisteredTexturesFX(net.minecraft.src.TextureHDCustomFX.class);
        for(int i = 0; i < atexturefx.length; i++)
        {
            TextureFX texturefx = atexturefx[i];
            unregisterTextureFX(texturefx);
        }

        if(Config.isAnimatedTerrain())
        {
            for(int j = 0; j < 256; j++)
            {
                registerCustomTextureFX((new StringBuilder()).append("/custom_terrain_").append(j).append(".png").toString(), j, 0);
            }

        }
        if(Config.isAnimatedItems())
        {
            for(int k = 0; k < 256; k++)
            {
                registerCustomTextureFX((new StringBuilder()).append("/custom_item_").append(k).append(".png").toString(), k, 1);
            }

        }
    }

    private void unregisterTextureFX(TextureFX texturefx)
    {
        for(int i = 0; i < field_1604_f.size(); i++)
        {
            TextureFX texturefx1 = (TextureFX)field_1604_f.get(i);
            if(texturefx1 == texturefx)
            {
                field_1604_f.remove(i);
                i--;
            }
        }

    }

    private TextureFX[] getRegisteredTexturesFX(Class class1)
    {
        ArrayList arraylist = new ArrayList();
        for(int i = 0; i < field_1604_f.size(); i++)
        {
            TextureFX texturefx = (TextureFX)field_1604_f.get(i);
            if(class1.isAssignableFrom(texturefx.getClass()))
            {
                arraylist.add(texturefx);
            }
        }

        TextureFX atexturefx[] = (TextureFX[])arraylist.toArray(new TextureFX[arraylist.size()]);
        return atexturefx;
    }

    private void registerCustomTextureFX(String s, int i, int j)
    {
        byte abyte0[] = null;
        if(j == 0)
        {
            abyte0 = getCustomTextureData(s, Config.getIconWidthTerrain());
        } else
        {
            abyte0 = getCustomTextureData(s, Config.getIconWidthItems());
        }
        if(abyte0 == null)
        {
            return;
        } else
        {
            func_1066_a(new TextureHDCustomFX(i, j));
            return;
        }
    }

    private int getMaxMipmapLevel(int i)
    {
        int j;
        for(j = 0; i > 0; j++)
        {
            i /= 2;
        }

        return j - 1;
    }

    private void copyScaled(byte abyte0[], ByteBuffer bytebuffer, int i)
    {
        int j = (int)Math.sqrt(abyte0.length / 4);
        int k = i / j;
        byte abyte1[] = new byte[4];
        int l = i * i;
        bytebuffer.clear();
        if(k > 1)
        {
            for(int i1 = 0; i1 < j; i1++)
            {
                int j1 = i1 * j;
                int k1 = i1 * k;
                int l1 = k1 * i;
                for(int i2 = 0; i2 < j; i2++)
                {
                    int j2 = (i2 + j1) * 4;
                    abyte1[0] = abyte0[j2];
                    abyte1[1] = abyte0[j2 + 1];
                    abyte1[2] = abyte0[j2 + 2];
                    abyte1[3] = abyte0[j2 + 3];
                    int k2 = i2 * k;
                    int l2 = k2 + l1;
                    for(int i3 = 0; i3 < k; i3++)
                    {
                        int j3 = l2 + i3 * i;
                        bytebuffer.position(j3 * 4);
                        for(int k3 = 0; k3 < k; k3++)
                        {
                            bytebuffer.put(abyte1);
                        }

                    }

                }

            }

        }
        bytebuffer.position(0).limit(i * i * 4);
    }

    private boolean scalesWithFastColor(TextureFX texturefx)
    {
        return !texturefx.getClass().getName().equals("ModTextureStatic");
    }

    public TexturePackList getTexturePack()
    {
        return field_6527_k;
    }

}
