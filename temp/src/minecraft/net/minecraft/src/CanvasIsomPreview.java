// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;
import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            OsMap, EnumOS1, IsoImageBuffer, World, 
//            SaveHandler, WorldSettings, WorldType, ThreadRunIsoClient, 
//            TerrainTextureManager, ChunkCoordinates

public class CanvasIsomPreview extends Canvas
    implements KeyListener, MouseListener, MouseMotionListener, Runnable
{

    private int field_1793_a;
    private int field_1792_b;
    private boolean field_1791_c;
    private World field_1790_d;
    private File field_1789_e;
    private boolean field_1788_f;
    private java.util.List field_1787_g;
    private IsoImageBuffer field_1786_h[][];
    private int field_1785_i;
    private int field_1784_j;
    private int field_1783_k;
    private int field_1782_l;

    public File func_1263_a()
    {
        if(field_1789_e == null)
        {
            field_1789_e = func_1264_a("minecraft");
        }
        return field_1789_e;
    }

    public File func_1264_a(String p_1264_1_)
    {
        String s = System.getProperty("user.home", ".");
        File file;
        switch(OsMap.field_1193_a[func_1269_e().ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
            file = new File(s, (new StringBuilder()).append('.').append(p_1264_1_).append('/').toString());
            break;

        case 3: // '\003'
            String s1 = System.getenv("APPDATA");
            if(s1 != null)
            {
                file = new File(s1, (new StringBuilder()).append(".").append(p_1264_1_).append('/').toString());
            } else
            {
                file = new File(s, (new StringBuilder()).append('.').append(p_1264_1_).append('/').toString());
            }
            break;

        case 4: // '\004'
            file = new File(s, (new StringBuilder()).append("Library/Application Support/").append(p_1264_1_).toString());
            break;

        default:
            file = new File(s, (new StringBuilder()).append(p_1264_1_).append('/').toString());
            break;
        }
        if(!file.exists() && !file.mkdirs())
        {
            throw new RuntimeException((new StringBuilder()).append("The working directory could not be created: ").append(file).toString());
        } else
        {
            return file;
        }
    }

    private static EnumOS1 func_1269_e()
    {
        String s = System.getProperty("os.name").toLowerCase();
        if(s.contains("win"))
        {
            return EnumOS1.windows;
        }
        if(s.contains("mac"))
        {
            return EnumOS1.macos;
        }
        if(s.contains("solaris"))
        {
            return EnumOS1.solaris;
        }
        if(s.contains("sunos"))
        {
            return EnumOS1.solaris;
        }
        if(s.contains("linux"))
        {
            return EnumOS1.linux;
        }
        if(s.contains("unix"))
        {
            return EnumOS1.linux;
        } else
        {
            return EnumOS1.unknown;
        }
    }

    public CanvasIsomPreview()
    {
        field_1793_a = 0;
        field_1792_b = 2;
        field_1791_c = true;
        field_1788_f = true;
        field_1787_g = Collections.synchronizedList(new LinkedList());
        field_1786_h = new IsoImageBuffer[64][64];
        field_1789_e = func_1263_a();
        for(int i = 0; i < 64; i++)
        {
            for(int j = 0; j < 64; j++)
            {
                field_1786_h[i][j] = new IsoImageBuffer(null, i, j);
            }

        }

        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        setFocusable(true);
        requestFocus();
        setBackground(Color.red);
    }

    public void func_1270_b(String p_1270_1_)
    {
        field_1785_i = field_1784_j = 0;
        field_1790_d = new World(new SaveHandler(new File(field_1789_e, "saves"), p_1270_1_, false), p_1270_1_, new WorldSettings((new Random()).nextLong(), 0, true, false, WorldType.field_48635_b));
        field_1790_d.field_1046_e = 0;
        synchronized(field_1787_g)
        {
            field_1787_g.clear();
            for(int i = 0; i < 64; i++)
            {
                for(int j = 0; j < 64; j++)
                {
                    field_1786_h[i][j].func_888_a(field_1790_d, i, j);
                }

            }

        }
    }

    private void func_1266_a(int p_1266_1_)
    {
        synchronized(field_1787_g)
        {
            field_1790_d.field_1046_e = p_1266_1_;
            field_1787_g.clear();
            for(int i = 0; i < 64; i++)
            {
                for(int j = 0; j < 64; j++)
                {
                    field_1786_h[i][j].func_888_a(field_1790_d, i, j);
                }

            }

        }
    }

    public void func_1272_b()
    {
        (new ThreadRunIsoClient(this)).start();
        for(int i = 0; i < 8; i++)
        {
            (new Thread(this)).start();
        }

    }

    public void func_1273_c()
    {
        field_1788_f = false;
    }

    private IsoImageBuffer func_1267_a(int p_1267_1_, int p_1267_2_)
    {
        int i = p_1267_1_ & 0x3f;
        int j = p_1267_2_ & 0x3f;
        IsoImageBuffer isoimagebuffer = field_1786_h[i][j];
        if(isoimagebuffer.field_1354_c == p_1267_1_ && isoimagebuffer.field_1353_d == p_1267_2_)
        {
            return isoimagebuffer;
        }
        synchronized(field_1787_g)
        {
            field_1787_g.remove(isoimagebuffer);
        }
        isoimagebuffer.func_889_a(p_1267_1_, p_1267_2_);
        return isoimagebuffer;
    }

    public void run()
    {
        TerrainTextureManager terraintexturemanager = new TerrainTextureManager();
        while(field_1788_f) 
        {
            IsoImageBuffer isoimagebuffer = null;
            synchronized(field_1787_g)
            {
                if(field_1787_g.size() > 0)
                {
                    isoimagebuffer = (IsoImageBuffer)field_1787_g.remove(0);
                }
            }
            if(isoimagebuffer != null)
            {
                if(field_1793_a - isoimagebuffer.field_1350_g < 2)
                {
                    terraintexturemanager.func_799_a(isoimagebuffer);
                    repaint();
                } else
                {
                    isoimagebuffer.field_1349_h = false;
                }
            }
            try
            {
                Thread.sleep(2L);
            }
            catch(InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
        }
    }

    public void update(Graphics g)
    {
    }

    public void paint(Graphics g)
    {
    }

    public void func_1265_d()
    {
        BufferStrategy bufferstrategy = getBufferStrategy();
        if(bufferstrategy == null)
        {
            createBufferStrategy(2);
            return;
        } else
        {
            func_1268_a((Graphics2D)bufferstrategy.getDrawGraphics());
            bufferstrategy.show();
            return;
        }
    }

    public void func_1268_a(Graphics2D p_1268_1_)
    {
        field_1793_a++;
        java.awt.geom.AffineTransform affinetransform = p_1268_1_.getTransform();
        p_1268_1_.setClip(0, 0, getWidth(), getHeight());
        p_1268_1_.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
        p_1268_1_.translate(getWidth() / 2, getHeight() / 2);
        p_1268_1_.scale(field_1792_b, field_1792_b);
        p_1268_1_.translate(field_1785_i, field_1784_j);
        if(field_1790_d != null)
        {
            ChunkCoordinates chunkcoordinates = field_1790_d.func_22137_s();
            p_1268_1_.translate(-(chunkcoordinates.field_22395_a + chunkcoordinates.field_22396_c), -(-chunkcoordinates.field_22395_a + chunkcoordinates.field_22396_c) + 64);
        }
        Rectangle rectangle = p_1268_1_.getClipBounds();
        p_1268_1_.setColor(new Color(0xff101020));
        p_1268_1_.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
        byte byte0 = 16;
        byte byte1 = 3;
        int i = rectangle.x / byte0 / 2 - 2 - byte1;
        int j = (rectangle.x + rectangle.width) / byte0 / 2 + 1 + byte1;
        int k = rectangle.y / byte0 - 1 - byte1 * 2;
        int l = (rectangle.y + rectangle.height + 16 + 128) / byte0 + 1 + byte1 * 2;
        for(int i1 = k; i1 <= l; i1++)
        {
            for(int k1 = i; k1 <= j; k1++)
            {
                int l1 = k1 - (i1 >> 1);
                int i2 = k1 + (i1 + 1 >> 1);
                IsoImageBuffer isoimagebuffer = func_1267_a(l1, i2);
                isoimagebuffer.field_1350_g = field_1793_a;
                if(!isoimagebuffer.field_1352_e)
                {
                    if(!isoimagebuffer.field_1349_h)
                    {
                        isoimagebuffer.field_1349_h = true;
                        field_1787_g.add(isoimagebuffer);
                    }
                    continue;
                }
                isoimagebuffer.field_1349_h = false;
                if(!isoimagebuffer.field_1351_f)
                {
                    int j2 = k1 * byte0 * 2 + (i1 & 1) * byte0;
                    int k2 = i1 * byte0 - 128 - 16;
                    p_1268_1_.drawImage(isoimagebuffer.field_1348_a, j2, k2, null);
                }
            }

        }

        if(field_1791_c)
        {
            p_1268_1_.setTransform(affinetransform);
            int j1 = getHeight() - 32 - 4;
            p_1268_1_.setColor(new Color(0x80000000, true));
            p_1268_1_.fillRect(4, getHeight() - 32 - 4, getWidth() - 8, 32);
            p_1268_1_.setColor(Color.WHITE);
            String s = "F1 - F5: load levels   |   0-9: Set time of day   |   Space: return to spawn   |   Double click: zoom   |   Escape: hide this text";
            p_1268_1_.drawString(s, getWidth() / 2 - p_1268_1_.getFontMetrics().stringWidth(s) / 2, j1 + 20);
        }
        p_1268_1_.dispose();
    }

    public void mouseDragged(MouseEvent p_mouseDragged_1_)
    {
        int i = p_mouseDragged_1_.getX() / field_1792_b;
        int j = p_mouseDragged_1_.getY() / field_1792_b;
        field_1785_i += i - field_1783_k;
        field_1784_j += j - field_1782_l;
        field_1783_k = i;
        field_1782_l = j;
        repaint();
    }

    public void mouseMoved(MouseEvent mouseevent)
    {
    }

    public void mouseClicked(MouseEvent p_mouseClicked_1_)
    {
        if(p_mouseClicked_1_.getClickCount() == 2)
        {
            field_1792_b = 3 - field_1792_b;
            repaint();
        }
    }

    public void mouseEntered(MouseEvent mouseevent)
    {
    }

    public void mouseExited(MouseEvent mouseevent)
    {
    }

    public void mousePressed(MouseEvent p_mousePressed_1_)
    {
        int i = p_mousePressed_1_.getX() / field_1792_b;
        int j = p_mousePressed_1_.getY() / field_1792_b;
        field_1783_k = i;
        field_1782_l = j;
    }

    public void mouseReleased(MouseEvent mouseevent)
    {
    }

    public void keyPressed(KeyEvent p_keyPressed_1_)
    {
        if(p_keyPressed_1_.getKeyCode() == 48)
        {
            func_1266_a(11);
        }
        if(p_keyPressed_1_.getKeyCode() == 49)
        {
            func_1266_a(10);
        }
        if(p_keyPressed_1_.getKeyCode() == 50)
        {
            func_1266_a(9);
        }
        if(p_keyPressed_1_.getKeyCode() == 51)
        {
            func_1266_a(7);
        }
        if(p_keyPressed_1_.getKeyCode() == 52)
        {
            func_1266_a(6);
        }
        if(p_keyPressed_1_.getKeyCode() == 53)
        {
            func_1266_a(5);
        }
        if(p_keyPressed_1_.getKeyCode() == 54)
        {
            func_1266_a(3);
        }
        if(p_keyPressed_1_.getKeyCode() == 55)
        {
            func_1266_a(2);
        }
        if(p_keyPressed_1_.getKeyCode() == 56)
        {
            func_1266_a(1);
        }
        if(p_keyPressed_1_.getKeyCode() == 57)
        {
            func_1266_a(0);
        }
        if(p_keyPressed_1_.getKeyCode() == 112)
        {
            func_1270_b("World1");
        }
        if(p_keyPressed_1_.getKeyCode() == 113)
        {
            func_1270_b("World2");
        }
        if(p_keyPressed_1_.getKeyCode() == 114)
        {
            func_1270_b("World3");
        }
        if(p_keyPressed_1_.getKeyCode() == 115)
        {
            func_1270_b("World4");
        }
        if(p_keyPressed_1_.getKeyCode() == 116)
        {
            func_1270_b("World5");
        }
        if(p_keyPressed_1_.getKeyCode() == 32)
        {
            field_1785_i = field_1784_j = 0;
        }
        if(p_keyPressed_1_.getKeyCode() == 27)
        {
            field_1791_c = !field_1791_c;
        }
        repaint();
    }

    public void keyReleased(KeyEvent keyevent)
    {
    }

    public void keyTyped(KeyEvent keyevent)
    {
    }

    static boolean func_1271_a(CanvasIsomPreview p_1271_0_)
    {
        return p_1271_0_.field_1788_f;
    }
}
