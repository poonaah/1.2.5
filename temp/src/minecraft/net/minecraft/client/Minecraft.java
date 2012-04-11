// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.client;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.File;
import java.io.PrintStream;
import java.text.DecimalFormat;
import net.minecraft.src.Achievement;
import net.minecraft.src.AchievementList;
import net.minecraft.src.AnvilSaveConverter;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.BlockGrass;
import net.minecraft.src.ChunkCoordinates;
import net.minecraft.src.ChunkProviderLoadOrGenerate;
import net.minecraft.src.ColorizerFoliage;
import net.minecraft.src.ColorizerGrass;
import net.minecraft.src.ColorizerWater;
import net.minecraft.src.Container;
import net.minecraft.src.EffectRenderer;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.EntityRenderer;
import net.minecraft.src.EnumMovingObjectType;
import net.minecraft.src.EnumOS2;
import net.minecraft.src.EnumOSMappingHelper;
import net.minecraft.src.EnumOptions;
import net.minecraft.src.FontRenderer;
import net.minecraft.src.GLAllocation;
import net.minecraft.src.GameSettings;
import net.minecraft.src.GameWindowListener;
import net.minecraft.src.GuiAchievement;
import net.minecraft.src.GuiChat;
import net.minecraft.src.GuiConflictWarning;
import net.minecraft.src.GuiConnecting;
import net.minecraft.src.GuiErrorScreen;
import net.minecraft.src.GuiGameOver;
import net.minecraft.src.GuiIngame;
import net.minecraft.src.GuiIngameMenu;
import net.minecraft.src.GuiInventory;
import net.minecraft.src.GuiMainMenu;
import net.minecraft.src.GuiMemoryErrorScreen;
import net.minecraft.src.GuiParticle;
import net.minecraft.src.GuiScreen;
import net.minecraft.src.GuiSleepMP;
import net.minecraft.src.ISaveFormat;
import net.minecraft.src.InventoryPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemRenderer;
import net.minecraft.src.ItemStack;
import net.minecraft.src.KeyBinding;
import net.minecraft.src.LoadingScreenRenderer;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MinecraftError;
import net.minecraft.src.MinecraftException;
import net.minecraft.src.MinecraftImpl;
import net.minecraft.src.ModelBiped;
import net.minecraft.src.MouseHelper;
import net.minecraft.src.MovementInputFromOptions;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.NetClientHandler;
import net.minecraft.src.OpenGlCapsChecker;
import net.minecraft.src.OpenGlHelper;
import net.minecraft.src.Packet3Chat;
import net.minecraft.src.PlayerCapabilities;
import net.minecraft.src.PlayerController;
import net.minecraft.src.PlayerUsageSnooper;
import net.minecraft.src.Profiler;
import net.minecraft.src.ProfilerResult;
import net.minecraft.src.RenderBlocks;
import net.minecraft.src.RenderEngine;
import net.minecraft.src.RenderGlobal;
import net.minecraft.src.RenderManager;
import net.minecraft.src.ScaledResolution;
import net.minecraft.src.ScreenShotHelper;
import net.minecraft.src.Session;
import net.minecraft.src.SoundManager;
import net.minecraft.src.StatCollector;
import net.minecraft.src.StatFileWriter;
import net.minecraft.src.StatList;
import net.minecraft.src.StatStringFormatKeyInv;
import net.minecraft.src.StringTranslate;
import net.minecraft.src.Teleporter;
import net.minecraft.src.Tessellator;
import net.minecraft.src.TextureCompassFX;
import net.minecraft.src.TextureFlamesFX;
import net.minecraft.src.TextureLavaFX;
import net.minecraft.src.TextureLavaFlowFX;
import net.minecraft.src.TexturePackList;
import net.minecraft.src.TexturePortalFX;
import net.minecraft.src.TextureWatchFX;
import net.minecraft.src.TextureWaterFX;
import net.minecraft.src.TextureWaterFlowFX;
import net.minecraft.src.ThreadCheckHasPaid;
import net.minecraft.src.ThreadClientSleep;
import net.minecraft.src.ThreadDownloadResources;
import net.minecraft.src.Timer;
import net.minecraft.src.UnexpectedThrowable;
import net.minecraft.src.Vec3D;
import net.minecraft.src.World;
import net.minecraft.src.WorldInfo;
import net.minecraft.src.WorldProvider;
import net.minecraft.src.WorldRenderer;
import net.minecraft.src.WorldSettings;
import net.minecraft.src.WorldType;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Controllers;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

// Referenced classes of package net.minecraft.client:
//            MinecraftApplet

public abstract class Minecraft
    implements Runnable
{

    public static byte field_28006_b[] = new byte[0xa00000];
    private static Minecraft field_21900_a;
    public PlayerController field_6327_b;
    private boolean field_185_a;
    private boolean field_28004_R;
    public int field_6326_c;
    public int field_6325_d;
    private OpenGlCapsChecker field_6286_O;
    private Timer field_9237_P;
    public World field_6324_e;
    public RenderGlobal field_6323_f;
    public EntityPlayerSP field_6322_g;
    public EntityLiving field_22009_h;
    public EffectRenderer field_6321_h;
    public Session field_6320_i;
    public String field_6319_j;
    public Canvas field_9244_k;
    public boolean field_6317_l;
    public volatile boolean field_6316_m;
    public RenderEngine field_6315_n;
    public FontRenderer field_6314_o;
    public FontRenderer field_40007_r;
    public GuiScreen field_6313_p;
    public LoadingScreenRenderer field_6312_q;
    public EntityRenderer field_9243_r;
    private ThreadDownloadResources field_6284_Q;
    private int field_6283_R;
    private int field_6282_S;
    private int field_9236_T;
    private int field_9235_U;
    public GuiAchievement field_25002_t;
    public GuiIngame field_6308_u;
    public boolean field_6307_v;
    public ModelBiped field_9242_w;
    public MovingObjectPosition field_6305_x;
    public GameSettings field_6304_y;
    protected MinecraftApplet field_9241_z;
    public SoundManager field_6301_A;
    public MouseHelper field_6299_B;
    public TexturePackList field_6298_C;
    public File field_6297_D;
    private ISaveFormat field_22008_V;
    public static long field_9240_E[] = new long[512];
    public static long field_9239_F[] = new long[512];
    public static int field_9238_G = 0;
    public static long field_28005_H = 0L;
    private int field_35001_ab;
    public StatFileWriter field_25001_G;
    private String field_9234_V;
    private int field_9233_W;
    private TextureWaterFX field_9232_X;
    private TextureLavaFX field_9231_Y;
    private static File field_6275_Z = null;
    public volatile boolean field_6293_H;
    public String field_6292_I;
    long field_40004_N;
    int field_40005_O;
    boolean field_6291_J;
    long field_6290_K;
    private String field_40006_ak;
    public boolean field_6289_L;
    public boolean field_6288_M;
    long field_6287_N;
    private int field_6300_ab;

    public Minecraft(Component p_i777_1_, Canvas p_i777_2_, MinecraftApplet p_i777_3_, int p_i777_4_, int p_i777_5_, boolean p_i777_6_)
    {
        field_185_a = false;
        field_28004_R = false;
        field_9237_P = new Timer(20F);
        field_6320_i = null;
        field_6317_l = false;
        field_6316_m = false;
        field_6313_p = null;
        field_6283_R = 0;
        field_6282_S = 0;
        field_25002_t = new GuiAchievement(this);
        field_6307_v = false;
        field_9242_w = new ModelBiped(0.0F);
        field_6305_x = null;
        field_6301_A = new SoundManager();
        field_35001_ab = 0;
        field_9232_X = new TextureWaterFX();
        field_9231_Y = new TextureLavaFX();
        field_6293_H = true;
        field_6292_I = "";
        field_40004_N = System.currentTimeMillis();
        field_40005_O = 0;
        field_6291_J = false;
        field_6290_K = -1L;
        field_40006_ak = "root";
        field_6289_L = false;
        field_6288_M = false;
        field_6287_N = System.currentTimeMillis();
        field_6300_ab = 0;
        StatList.func_27360_a();
        field_9235_U = p_i777_5_;
        field_185_a = p_i777_6_;
        field_9241_z = p_i777_3_;
        Packet3Chat.field_52010_b = 32767;
        new ThreadClientSleep(this, "Timer hack thread");
        field_9244_k = p_i777_2_;
        field_6326_c = p_i777_4_;
        field_6325_d = p_i777_5_;
        field_185_a = p_i777_6_;
        if(p_i777_3_ == null || "true".equals(p_i777_3_.getParameter("stand-alone")))
        {
            field_6317_l = false;
        }
        field_21900_a = this;
    }

    public void func_28003_b(UnexpectedThrowable p_28003_1_)
    {
        field_28004_R = true;
        func_4007_a(p_28003_1_);
    }

    public abstract void func_4007_a(UnexpectedThrowable unexpectedthrowable);

    public void func_6258_a(String p_6258_1_, int p_6258_2_)
    {
        field_9234_V = p_6258_1_;
        field_9233_W = p_6258_2_;
    }

    public void func_6271_a()
        throws LWJGLException
    {
        if(field_9244_k != null)
        {
            Graphics g = field_9244_k.getGraphics();
            if(g != null)
            {
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, field_6326_c, field_6325_d);
                g.dispose();
            }
            Display.setParent(field_9244_k);
        } else
        if(field_185_a)
        {
            Display.setFullscreen(true);
            field_6326_c = Display.getDisplayMode().getWidth();
            field_6325_d = Display.getDisplayMode().getHeight();
            if(field_6326_c <= 0)
            {
                field_6326_c = 1;
            }
            if(field_6325_d <= 0)
            {
                field_6325_d = 1;
            }
        } else
        {
            Display.setDisplayMode(new DisplayMode(field_6326_c, field_6325_d));
        }
        Display.setTitle("Minecraft Minecraft 1.2.5");
        System.out.println((new StringBuilder()).append("LWJGL Version: ").append(Sys.getVersion()).toString());
        try
        {
            PixelFormat pixelformat = new PixelFormat();
            pixelformat = pixelformat.withDepthBits(24);
            Display.create(pixelformat);
        }
        catch(LWJGLException lwjglexception)
        {
            lwjglexception.printStackTrace();
            try
            {
                Thread.sleep(1000L);
            }
            catch(InterruptedException interruptedexception) { }
            Display.create();
        }
        OpenGlHelper.func_40453_a();
        field_6297_D = func_6240_b();
        field_22008_V = new AnvilSaveConverter(new File(field_6297_D, "saves"));
        field_6304_y = new GameSettings(this, field_6297_D);
        field_6298_C = new TexturePackList(this, field_6297_D);
        field_6315_n = new RenderEngine(field_6298_C, field_6304_y);
        func_6257_q();
        field_6314_o = new FontRenderer(field_6304_y, "/font/default.png", field_6315_n, false);
        field_40007_r = new FontRenderer(field_6304_y, "/font/alternate.png", field_6315_n, false);
        if(field_6304_y.field_44018_Q != null)
        {
            StringTranslate.func_20162_a().func_44023_a(field_6304_y.field_44018_Q);
            field_6314_o.func_44032_a(StringTranslate.func_20162_a().func_46110_d());
            field_6314_o.func_46123_b(StringTranslate.func_46109_d(field_6304_y.field_44018_Q));
        }
        ColorizerWater.func_28182_a(field_6315_n.func_28149_a("/misc/watercolor.png"));
        ColorizerGrass.func_28181_a(field_6315_n.func_28149_a("/misc/grasscolor.png"));
        ColorizerFoliage.func_28152_a(field_6315_n.func_28149_a("/misc/foliagecolor.png"));
        field_9243_r = new EntityRenderer(this);
        RenderManager.field_1233_a.field_4236_f = new ItemRenderer(this);
        field_25001_G = new StatFileWriter(field_6320_i, field_6297_D);
        AchievementList.field_25195_b.func_27092_a(new StatStringFormatKeyInv(this));
        func_6257_q();
        Mouse.create();
        field_6299_B = new MouseHelper(field_9244_k);
        try
        {
            Controllers.create();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        func_52004_D();
        func_6250_c("Pre startup");
        GL11.glEnable(3553);
        GL11.glShadeModel(7425);
        GL11.glClearDepth(1.0D);
        GL11.glEnable(2929);
        GL11.glDepthFunc(515);
        GL11.glEnable(3008);
        GL11.glAlphaFunc(516, 0.1F);
        GL11.glCullFace(1029);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glMatrixMode(5888);
        func_6250_c("Startup");
        field_6286_O = new OpenGlCapsChecker();
        field_6301_A.func_340_a(field_6304_y);
        field_6315_n.func_1066_a(field_9231_Y);
        field_6315_n.func_1066_a(field_9232_X);
        field_6315_n.func_1066_a(new TexturePortalFX());
        field_6315_n.func_1066_a(new TextureCompassFX(this));
        field_6315_n.func_1066_a(new TextureWatchFX(this));
        field_6315_n.func_1066_a(new TextureWaterFlowFX());
        field_6315_n.func_1066_a(new TextureLavaFlowFX());
        field_6315_n.func_1066_a(new TextureFlamesFX(0));
        field_6315_n.func_1066_a(new TextureFlamesFX(1));
        field_6323_f = new RenderGlobal(this, field_6315_n);
        GL11.glViewport(0, 0, field_6326_c, field_6325_d);
        field_6321_h = new EffectRenderer(field_6324_e, field_6315_n);
        try
        {
            field_6284_Q = new ThreadDownloadResources(field_6297_D, this);
            field_6284_Q.start();
        }
        catch(Exception exception1) { }
        func_6250_c("Post startup");
        field_6308_u = new GuiIngame(this);
        if(field_9234_V != null)
        {
            func_6272_a(new GuiConnecting(this, field_9234_V, field_9233_W));
        } else
        {
            func_6272_a(new GuiMainMenu());
        }
        field_6312_q = new LoadingScreenRenderer(this);
    }

    private void func_6257_q()
        throws LWJGLException
    {
        ScaledResolution scaledresolution = new ScaledResolution(field_6304_y, field_6326_c, field_6325_d);
        GL11.glClear(16640);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, scaledresolution.field_25121_a, scaledresolution.field_25120_b, 0.0D, 1000D, 3000D);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -2000F);
        GL11.glViewport(0, 0, field_6326_c, field_6325_d);
        GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glDisable(2912);
        GL11.glBindTexture(3553, field_6315_n.func_1070_a("/title/mojang.png"));
        tessellator.func_977_b();
        tessellator.func_990_b(0xffffff);
        tessellator.func_983_a(0.0D, field_6325_d, 0.0D, 0.0D, 0.0D);
        tessellator.func_983_a(field_6326_c, field_6325_d, 0.0D, 0.0D, 0.0D);
        tessellator.func_983_a(field_6326_c, 0.0D, 0.0D, 0.0D, 0.0D);
        tessellator.func_983_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
        tessellator.func_982_a();
        char c = '\u0100';
        char c1 = '\u0100';
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        tessellator.func_990_b(0xffffff);
        func_6274_a((scaledresolution.func_903_a() - c) / 2, (scaledresolution.func_902_b() - c1) / 2, 0, 0, c, c1);
        GL11.glDisable(2896);
        GL11.glDisable(2912);
        GL11.glEnable(3008);
        GL11.glAlphaFunc(516, 0.1F);
        Display.swapBuffers();
    }

    public void func_6274_a(int p_6274_1_, int p_6274_2_, int p_6274_3_, int p_6274_4_, int p_6274_5_, int p_6274_6_)
    {
        float f = 0.00390625F;
        float f1 = 0.00390625F;
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        tessellator.func_983_a(p_6274_1_ + 0, p_6274_2_ + p_6274_6_, 0.0D, (float)(p_6274_3_ + 0) * f, (float)(p_6274_4_ + p_6274_6_) * f1);
        tessellator.func_983_a(p_6274_1_ + p_6274_5_, p_6274_2_ + p_6274_6_, 0.0D, (float)(p_6274_3_ + p_6274_5_) * f, (float)(p_6274_4_ + p_6274_6_) * f1);
        tessellator.func_983_a(p_6274_1_ + p_6274_5_, p_6274_2_ + 0, 0.0D, (float)(p_6274_3_ + p_6274_5_) * f, (float)(p_6274_4_ + 0) * f1);
        tessellator.func_983_a(p_6274_1_ + 0, p_6274_2_ + 0, 0.0D, (float)(p_6274_3_ + 0) * f, (float)(p_6274_4_ + 0) * f1);
        tessellator.func_982_a();
    }

    public static File func_6240_b()
    {
        if(field_6275_Z == null)
        {
            field_6275_Z = func_6264_a("minecraft");
        }
        return field_6275_Z;
    }

    public static File func_6264_a(String p_6264_0_)
    {
        String s = System.getProperty("user.home", ".");
        File file;
        switch(EnumOSMappingHelper.field_1585_a[func_6267_r().ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
            file = new File(s, (new StringBuilder()).append('.').append(p_6264_0_).append('/').toString());
            break;

        case 3: // '\003'
            String s1 = System.getenv("APPDATA");
            if(s1 != null)
            {
                file = new File(s1, (new StringBuilder()).append(".").append(p_6264_0_).append('/').toString());
            } else
            {
                file = new File(s, (new StringBuilder()).append('.').append(p_6264_0_).append('/').toString());
            }
            break;

        case 4: // '\004'
            file = new File(s, (new StringBuilder()).append("Library/Application Support/").append(p_6264_0_).toString());
            break;

        default:
            file = new File(s, (new StringBuilder()).append(p_6264_0_).append('/').toString());
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

    private static EnumOS2 func_6267_r()
    {
        String s = System.getProperty("os.name").toLowerCase();
        if(s.contains("win"))
        {
            return EnumOS2.windows;
        }
        if(s.contains("mac"))
        {
            return EnumOS2.macos;
        }
        if(s.contains("solaris"))
        {
            return EnumOS2.solaris;
        }
        if(s.contains("sunos"))
        {
            return EnumOS2.solaris;
        }
        if(s.contains("linux"))
        {
            return EnumOS2.linux;
        }
        if(s.contains("unix"))
        {
            return EnumOS2.linux;
        } else
        {
            return EnumOS2.unknown;
        }
    }

    public ISaveFormat func_22004_c()
    {
        return field_22008_V;
    }

    public void func_6272_a(GuiScreen p_6272_1_)
    {
        if(field_6313_p instanceof GuiErrorScreen)
        {
            return;
        }
        if(field_6313_p != null)
        {
            field_6313_p.func_6449_h();
        }
        if(p_6272_1_ instanceof GuiMainMenu)
        {
            field_25001_G.func_27175_b();
        }
        field_25001_G.func_27182_c();
        if(p_6272_1_ == null && field_6324_e == null)
        {
            p_6272_1_ = new GuiMainMenu();
        } else
        if(p_6272_1_ == null && field_6322_g.func_40114_aH() <= 0)
        {
            p_6272_1_ = new GuiGameOver();
        }
        if(p_6272_1_ instanceof GuiMainMenu)
        {
            field_6304_y.field_22276_A = false;
            field_6308_u.func_28097_b();
        }
        field_6313_p = p_6272_1_;
        if(p_6272_1_ != null)
        {
            func_6273_f();
            ScaledResolution scaledresolution = new ScaledResolution(field_6304_y, field_6326_c, field_6325_d);
            int i = scaledresolution.func_903_a();
            int j = scaledresolution.func_902_b();
            p_6272_1_.func_6447_a(this, i, j);
            field_6307_v = false;
        } else
        {
            func_6259_e();
        }
    }

    private void func_6250_c(String p_6250_1_)
    {
        int i = GL11.glGetError();
        if(i != 0)
        {
            String s = GLU.gluErrorString(i);
            System.out.println("########## GL ERROR ##########");
            System.out.println((new StringBuilder()).append("@ ").append(p_6250_1_).toString());
            System.out.println((new StringBuilder()).append(i).append(": ").append(s).toString());
        }
    }

    public void func_6266_c()
    {
        try
        {
            field_25001_G.func_27175_b();
            field_25001_G.func_27182_c();
            if(field_9241_z != null)
            {
                field_9241_z.func_6231_c();
            }
            try
            {
                if(field_6284_Q != null)
                {
                    field_6284_Q.func_1208_b();
                }
            }
            catch(Exception exception) { }
            System.out.println("Stopping!");
            try
            {
                func_6261_a(null);
            }
            catch(Throwable throwable) { }
            try
            {
                GLAllocation.func_1126_a();
            }
            catch(Throwable throwable1) { }
            field_6301_A.func_330_b();
            Mouse.destroy();
            Keyboard.destroy();
        }
        finally
        {
            Display.destroy();
            if(!field_28004_R)
            {
                System.exit(0);
            }
        }
        System.gc();
    }

    public void run()
    {
        field_6293_H = true;
        try
        {
            func_6271_a();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            func_28003_b(new UnexpectedThrowable("Failed to start game", exception));
            return;
        }
        try
        {
            while(field_6293_H) 
            {
                try
                {
                    func_40001_x();
                }
                catch(MinecraftException minecraftexception)
                {
                    field_6324_e = null;
                    func_6261_a(null);
                    func_6272_a(new GuiConflictWarning());
                }
                catch(OutOfMemoryError outofmemoryerror)
                {
                    func_28002_e();
                    func_6272_a(new GuiMemoryErrorScreen());
                    System.gc();
                }
            }
        }
        catch(MinecraftError minecrafterror) { }
        catch(Throwable throwable)
        {
            func_28002_e();
            throwable.printStackTrace();
            func_28003_b(new UnexpectedThrowable("Unexpected error", throwable));
        }
        finally
        {
            func_6266_c();
        }
    }

    private void func_40001_x()
    {
        if(field_9241_z != null && !field_9241_z.isActive())
        {
            field_6293_H = false;
            return;
        }
        AxisAlignedBB.func_4149_a();
        Vec3D.func_1259_a();
        Profiler.func_40663_a("root");
        if(field_9244_k == null && Display.isCloseRequested())
        {
            func_6244_d();
        }
        if(field_6316_m && field_6324_e != null)
        {
            float f = field_9237_P.field_1378_c;
            field_9237_P.func_904_a();
            field_9237_P.field_1378_c = f;
        } else
        {
            field_9237_P.func_904_a();
        }
        long l = System.nanoTime();
        Profiler.func_40663_a("tick");
        for(int i = 0; i < field_9237_P.field_1379_b; i++)
        {
            field_6283_R++;
            try
            {
                func_6246_i();
                continue;
            }
            catch(MinecraftException minecraftexception)
            {
                field_6324_e = null;
            }
            func_6261_a(null);
            func_6272_a(new GuiConflictWarning());
        }

        Profiler.func_40662_b();
        long l1 = System.nanoTime() - l;
        func_6250_c("Pre render");
        RenderBlocks.field_27406_a = field_6304_y.field_1576_i;
        Profiler.func_40663_a("sound");
        field_6301_A.func_338_a(field_6322_g, field_9237_P.field_1378_c);
        Profiler.func_40661_c("updatelights");
        if(field_6324_e != null)
        {
            field_6324_e.func_6465_g();
        }
        Profiler.func_40662_b();
        Profiler.func_40663_a("render");
        Profiler.func_40663_a("display");
        GL11.glEnable(3553);
        if(!Keyboard.isKeyDown(65))
        {
            Display.update();
        }
        if(field_6322_g != null && field_6322_g.func_345_I())
        {
            field_6304_y.field_1560_x = 0;
        }
        Profiler.func_40662_b();
        if(!field_6307_v)
        {
            Profiler.func_40663_a("gameMode");
            if(field_6327_b != null)
            {
                field_6327_b.func_6467_a(field_9237_P.field_1378_c);
            }
            Profiler.func_40661_c("gameRenderer");
            field_9243_r.func_4136_b(field_9237_P.field_1378_c);
            Profiler.func_40662_b();
        }
        GL11.glFlush();
        Profiler.func_40662_b();
        if(!Display.isActive() && field_185_a)
        {
            func_6270_h();
        }
        Profiler.func_40662_b();
        if(field_6304_y.field_22276_A && field_6304_y.field_50119_G)
        {
            if(!Profiler.field_40669_a)
            {
                Profiler.func_40660_a();
            }
            Profiler.field_40669_a = true;
            func_6238_a(l1);
        } else
        {
            Profiler.field_40669_a = false;
            field_6290_K = System.nanoTime();
        }
        field_25002_t.func_25080_a();
        Profiler.func_40663_a("root");
        Thread.yield();
        if(Keyboard.isKeyDown(65))
        {
            Display.update();
        }
        func_6248_s();
        if(field_9244_k != null && !field_185_a && (field_9244_k.getWidth() != field_6326_c || field_9244_k.getHeight() != field_6325_d))
        {
            field_6326_c = field_9244_k.getWidth();
            field_6325_d = field_9244_k.getHeight();
            if(field_6326_c <= 0)
            {
                field_6326_c = 1;
            }
            if(field_6325_d <= 0)
            {
                field_6325_d = 1;
            }
            func_6249_a(field_6326_c, field_6325_d);
        }
        func_6250_c("Post render");
        field_40005_O++;
        field_6316_m = !func_6260_j() && field_6313_p != null && field_6313_p.func_6450_b();
        while(System.currentTimeMillis() >= field_40004_N + 1000L) 
        {
            field_6292_I = (new StringBuilder()).append(field_40005_O).append(" fps, ").append(WorldRenderer.field_1762_b).append(" chunk updates").toString();
            WorldRenderer.field_1762_b = 0;
            field_40004_N += 1000L;
            field_40005_O = 0;
        }
        Profiler.func_40662_b();
    }

    public void func_28002_e()
    {
        try
        {
            field_28006_b = new byte[0];
            field_6323_f.func_28137_f();
        }
        catch(Throwable throwable) { }
        try
        {
            System.gc();
            AxisAlignedBB.func_28196_a();
            Vec3D.func_28215_a();
        }
        catch(Throwable throwable1) { }
        try
        {
            System.gc();
            func_6261_a(null);
        }
        catch(Throwable throwable2) { }
        System.gc();
    }

    private void func_6248_s()
    {
        if(Keyboard.isKeyDown(60))
        {
            if(!field_6291_J)
            {
                field_6291_J = true;
                field_6308_u.func_552_a(ScreenShotHelper.func_4148_a(field_6275_Z, field_6326_c, field_6325_d));
            }
        } else
        {
            field_6291_J = false;
        }
    }

    private void func_40003_b(int p_40003_1_)
    {
        java.util.List list;
        ProfilerResult profilerresult;
        list = Profiler.func_40664_b(field_40006_ak);
        if(list == null || list.size() == 0)
        {
            return;
        }
        profilerresult = (ProfilerResult)list.remove(0);
        if(p_40003_1_ != 0) goto _L2; else goto _L1
_L1:
        if(profilerresult.field_40703_c.length() > 0)
        {
            int i = field_40006_ak.lastIndexOf(".");
            if(i >= 0)
            {
                field_40006_ak = field_40006_ak.substring(0, i);
            }
        }
          goto _L3
_L2:
        if(--p_40003_1_ >= list.size() || ((ProfilerResult)list.get(p_40003_1_)).field_40703_c.equals("unspecified")) goto _L3; else goto _L4
_L4:
        if(field_40006_ak.length() <= 0) goto _L6; else goto _L5
_L5:
        new StringBuilder();
        this;
        JVM INSTR dup_x1 ;
        field_40006_ak;
        append();
        ".";
        append();
        toString();
        field_40006_ak;
_L6:
        new StringBuilder();
        this;
        JVM INSTR dup_x1 ;
        field_40006_ak;
        append();
        ((ProfilerResult)list.get(p_40003_1_)).field_40703_c;
        append();
        toString();
        field_40006_ak;
_L3:
    }

    private void func_6238_a(long p_6238_1_)
    {
        java.util.List list = Profiler.func_40664_b(field_40006_ak);
        ProfilerResult profilerresult = (ProfilerResult)list.remove(0);
        long l = 0xfe502aL;
        if(field_6290_K == -1L)
        {
            field_6290_K = System.nanoTime();
        }
        long l1 = System.nanoTime();
        field_9239_F[field_9238_G & field_9240_E.length - 1] = p_6238_1_;
        field_9240_E[field_9238_G++ & field_9240_E.length - 1] = l1 - field_6290_K;
        field_6290_K = l1;
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glEnable(2903);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, field_6326_c, field_6325_d, 0.0D, 1000D, 3000D);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -2000F);
        GL11.glLineWidth(1.0F);
        GL11.glDisable(3553);
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_992_a(7);
        int i = (int)(l / 0x30d40L);
        tessellator.func_990_b(0x20000000);
        tessellator.func_991_a(0.0D, field_6325_d - i, 0.0D);
        tessellator.func_991_a(0.0D, field_6325_d, 0.0D);
        tessellator.func_991_a(field_9240_E.length, field_6325_d, 0.0D);
        tessellator.func_991_a(field_9240_E.length, field_6325_d - i, 0.0D);
        tessellator.func_990_b(0x20200000);
        tessellator.func_991_a(0.0D, field_6325_d - i * 2, 0.0D);
        tessellator.func_991_a(0.0D, field_6325_d - i, 0.0D);
        tessellator.func_991_a(field_9240_E.length, field_6325_d - i, 0.0D);
        tessellator.func_991_a(field_9240_E.length, field_6325_d - i * 2, 0.0D);
        tessellator.func_982_a();
        long l2 = 0L;
        for(int j = 0; j < field_9240_E.length; j++)
        {
            l2 += field_9240_E[j];
        }

        int k = (int)(l2 / 0x30d40L / (long)field_9240_E.length);
        tessellator.func_992_a(7);
        tessellator.func_990_b(0x20400000);
        tessellator.func_991_a(0.0D, field_6325_d - k, 0.0D);
        tessellator.func_991_a(0.0D, field_6325_d, 0.0D);
        tessellator.func_991_a(field_9240_E.length, field_6325_d, 0.0D);
        tessellator.func_991_a(field_9240_E.length, field_6325_d - k, 0.0D);
        tessellator.func_982_a();
        tessellator.func_992_a(1);
        for(int i1 = 0; i1 < field_9240_E.length; i1++)
        {
            int k1 = ((i1 - field_9238_G & field_9240_E.length - 1) * 255) / field_9240_E.length;
            int j2 = (k1 * k1) / 255;
            j2 = (j2 * j2) / 255;
            int i3 = (j2 * j2) / 255;
            i3 = (i3 * i3) / 255;
            if(field_9240_E[i1] > l)
            {
                tessellator.func_990_b(0xff000000 + j2 * 0x10000);
            } else
            {
                tessellator.func_990_b(0xff000000 + j2 * 256);
            }
            long l3 = field_9240_E[i1] / 0x30d40L;
            long l4 = field_9239_F[i1] / 0x30d40L;
            tessellator.func_991_a((float)i1 + 0.5F, (float)((long)field_6325_d - l3) + 0.5F, 0.0D);
            tessellator.func_991_a((float)i1 + 0.5F, (float)field_6325_d + 0.5F, 0.0D);
            tessellator.func_990_b(0xff000000 + j2 * 0x10000 + j2 * 256 + j2 * 1);
            tessellator.func_991_a((float)i1 + 0.5F, (float)((long)field_6325_d - l3) + 0.5F, 0.0D);
            tessellator.func_991_a((float)i1 + 0.5F, (float)((long)field_6325_d - (l3 - l4)) + 0.5F, 0.0D);
        }

        tessellator.func_982_a();
        int j1 = 160;
        int i2 = field_6326_c - j1 - 10;
        int k2 = field_6325_d - j1 * 2;
        GL11.glEnable(3042);
        tessellator.func_977_b();
        tessellator.func_6513_a(0, 200);
        tessellator.func_991_a((float)i2 - (float)j1 * 1.1F, (float)k2 - (float)j1 * 0.6F - 16F, 0.0D);
        tessellator.func_991_a((float)i2 - (float)j1 * 1.1F, k2 + j1 * 2, 0.0D);
        tessellator.func_991_a((float)i2 + (float)j1 * 1.1F, k2 + j1 * 2, 0.0D);
        tessellator.func_991_a((float)i2 + (float)j1 * 1.1F, (float)k2 - (float)j1 * 0.6F - 16F, 0.0D);
        tessellator.func_982_a();
        GL11.glDisable(3042);
        double d = 0.0D;
        for(int j3 = 0; j3 < list.size(); j3++)
        {
            ProfilerResult profilerresult1 = (ProfilerResult)list.get(j3);
            int i4 = MathHelper.func_1108_b(profilerresult1.field_40704_a / 4D) + 1;
            tessellator.func_992_a(6);
            tessellator.func_990_b(profilerresult1.func_40700_a());
            tessellator.func_991_a(i2, k2, 0.0D);
            for(int k4 = i4; k4 >= 0; k4--)
            {
                float f = (float)(((d + (profilerresult1.field_40704_a * (double)k4) / (double)i4) * 3.1415927410125732D * 2D) / 100D);
                float f2 = MathHelper.func_1106_a(f) * (float)j1;
                float f4 = MathHelper.func_1114_b(f) * (float)j1 * 0.5F;
                tessellator.func_991_a((float)i2 + f2, (float)k2 - f4, 0.0D);
            }

            tessellator.func_982_a();
            tessellator.func_992_a(5);
            tessellator.func_990_b((profilerresult1.func_40700_a() & 0xfefefe) >> 1);
            for(int i5 = i4; i5 >= 0; i5--)
            {
                float f1 = (float)(((d + (profilerresult1.field_40704_a * (double)i5) / (double)i4) * 3.1415927410125732D * 2D) / 100D);
                float f3 = MathHelper.func_1106_a(f1) * (float)j1;
                float f5 = MathHelper.func_1114_b(f1) * (float)j1 * 0.5F;
                tessellator.func_991_a((float)i2 + f3, (float)k2 - f5, 0.0D);
                tessellator.func_991_a((float)i2 + f3, ((float)k2 - f5) + 10F, 0.0D);
            }

            tessellator.func_982_a();
            d += profilerresult1.field_40704_a;
        }

        DecimalFormat decimalformat = new DecimalFormat("##0.00");
        GL11.glEnable(3553);
        String s = "";
        if(!profilerresult.field_40703_c.equals("unspecified"))
        {
            s = (new StringBuilder()).append(s).append("[0] ").toString();
        }
        if(profilerresult.field_40703_c.length() == 0)
        {
            s = (new StringBuilder()).append(s).append("ROOT ").toString();
        } else
        {
            s = (new StringBuilder()).append(s).append(profilerresult.field_40703_c).append(" ").toString();
        }
        int j4 = 0xffffff;
        field_6314_o.func_50103_a(s, i2 - j1, k2 - j1 / 2 - 16, j4);
        field_6314_o.func_50103_a(s = (new StringBuilder()).append(decimalformat.format(profilerresult.field_40702_b)).append("%").toString(), (i2 + j1) - field_6314_o.func_871_a(s), k2 - j1 / 2 - 16, j4);
        for(int k3 = 0; k3 < list.size(); k3++)
        {
            ProfilerResult profilerresult2 = (ProfilerResult)list.get(k3);
            String s1 = "";
            if(!profilerresult2.field_40703_c.equals("unspecified"))
            {
                s1 = (new StringBuilder()).append(s1).append("[").append(k3 + 1).append("] ").toString();
            } else
            {
                s1 = (new StringBuilder()).append(s1).append("[?] ").toString();
            }
            s1 = (new StringBuilder()).append(s1).append(profilerresult2.field_40703_c).toString();
            field_6314_o.func_50103_a(s1, i2 - j1, k2 + j1 / 2 + k3 * 8 + 20, profilerresult2.func_40700_a());
            field_6314_o.func_50103_a(s1 = (new StringBuilder()).append(decimalformat.format(profilerresult2.field_40704_a)).append("%").toString(), (i2 + j1) - 50 - field_6314_o.func_871_a(s1), k2 + j1 / 2 + k3 * 8 + 20, profilerresult2.func_40700_a());
            field_6314_o.func_50103_a(s1 = (new StringBuilder()).append(decimalformat.format(profilerresult2.field_40702_b)).append("%").toString(), (i2 + j1) - field_6314_o.func_871_a(s1), k2 + j1 / 2 + k3 * 8 + 20, profilerresult2.func_40700_a());
        }

    }

    public void func_6244_d()
    {
        field_6293_H = false;
    }

    public void func_6259_e()
    {
        if(!Display.isActive())
        {
            return;
        }
        if(field_6289_L)
        {
            return;
        } else
        {
            field_6289_L = true;
            field_6299_B.func_774_a();
            func_6272_a(null);
            field_6282_S = 10000;
            return;
        }
    }

    public void func_6273_f()
    {
        if(!field_6289_L)
        {
            return;
        } else
        {
            KeyBinding.func_35959_a();
            field_6289_L = false;
            field_6299_B.func_773_b();
            return;
        }
    }

    public void func_6252_g()
    {
        if(field_6313_p != null)
        {
            return;
        } else
        {
            func_6272_a(new GuiIngameMenu());
            return;
        }
    }

    private void func_6254_a(int p_6254_1_, boolean p_6254_2_)
    {
        if(!p_6254_2_)
        {
            field_6282_S = 0;
        }
        if(p_6254_1_ == 0 && field_6282_S > 0)
        {
            return;
        }
        if(p_6254_2_ && field_6305_x != null && field_6305_x.field_1167_a == EnumMovingObjectType.TILE && p_6254_1_ == 0)
        {
            int i = field_6305_x.field_1166_b;
            int j = field_6305_x.field_1172_c;
            int k = field_6305_x.field_1171_d;
            field_6327_b.func_6470_c(i, j, k, field_6305_x.field_1170_e);
            if(field_6322_g.func_35190_e(i, j, k))
            {
                field_6321_h.func_1191_a(i, j, k, field_6305_x.field_1170_e);
                field_6322_g.func_457_w();
            }
        } else
        {
            field_6327_b.func_6468_a();
        }
    }

    private void func_6243_a(int p_6243_1_)
    {
        if(p_6243_1_ == 0 && field_6282_S > 0)
        {
            return;
        }
        if(p_6243_1_ == 0)
        {
            field_6322_g.func_457_w();
        }
        if(p_6243_1_ == 1)
        {
            field_35001_ab = 4;
        }
        boolean flag = true;
        ItemStack itemstack = field_6322_g.field_778_b.func_494_a();
        if(field_6305_x == null)
        {
            if(p_6243_1_ == 0 && field_6327_b.func_35641_g())
            {
                field_6282_S = 10;
            }
        } else
        if(field_6305_x.field_1167_a == EnumMovingObjectType.ENTITY)
        {
            if(p_6243_1_ == 0)
            {
                field_6327_b.func_6472_b(field_6322_g, field_6305_x.field_1168_g);
            }
            if(p_6243_1_ == 1)
            {
                field_6327_b.func_6475_a(field_6322_g, field_6305_x.field_1168_g);
            }
        } else
        if(field_6305_x.field_1167_a == EnumMovingObjectType.TILE)
        {
            int i = field_6305_x.field_1166_b;
            int j = field_6305_x.field_1172_c;
            int k = field_6305_x.field_1171_d;
            int l = field_6305_x.field_1170_e;
            if(p_6243_1_ == 0)
            {
                field_6327_b.func_719_a(i, j, k, field_6305_x.field_1170_e);
            } else
            {
                ItemStack itemstack2 = itemstack;
                int i1 = itemstack2 == null ? 0 : itemstack2.field_1615_a;
                if(field_6327_b.func_722_a(field_6322_g, field_6324_e, itemstack2, i, j, k, l))
                {
                    flag = false;
                    field_6322_g.func_457_w();
                }
                if(itemstack2 == null)
                {
                    return;
                }
                if(itemstack2.field_1615_a == 0)
                {
                    field_6322_g.field_778_b.field_843_a[field_6322_g.field_778_b.field_847_d] = null;
                } else
                if(itemstack2.field_1615_a != i1 || field_6327_b.func_35640_h())
                {
                    field_9243_r.field_1395_a.func_9449_b();
                }
            }
        }
        if(flag && p_6243_1_ == 1)
        {
            ItemStack itemstack1 = field_6322_g.field_778_b.func_494_a();
            if(itemstack1 != null && field_6327_b.func_6471_a(field_6322_g, field_6324_e, itemstack1))
            {
                field_9243_r.field_1395_a.func_9450_c();
            }
        }
    }

    public void func_6270_h()
    {
        try
        {
            field_185_a = !field_185_a;
            if(field_185_a)
            {
                Display.setDisplayMode(Display.getDesktopDisplayMode());
                field_6326_c = Display.getDisplayMode().getWidth();
                field_6325_d = Display.getDisplayMode().getHeight();
                if(field_6326_c <= 0)
                {
                    field_6326_c = 1;
                }
                if(field_6325_d <= 0)
                {
                    field_6325_d = 1;
                }
            } else
            {
                if(field_9244_k != null)
                {
                    field_6326_c = field_9244_k.getWidth();
                    field_6325_d = field_9244_k.getHeight();
                } else
                {
                    field_6326_c = field_9236_T;
                    field_6325_d = field_9235_U;
                }
                if(field_6326_c <= 0)
                {
                    field_6326_c = 1;
                }
                if(field_6325_d <= 0)
                {
                    field_6325_d = 1;
                }
            }
            if(field_6313_p != null)
            {
                func_6249_a(field_6326_c, field_6325_d);
            }
            Display.setFullscreen(field_185_a);
            Display.update();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void func_6249_a(int p_6249_1_, int p_6249_2_)
    {
        if(p_6249_1_ <= 0)
        {
            p_6249_1_ = 1;
        }
        if(p_6249_2_ <= 0)
        {
            p_6249_2_ = 1;
        }
        field_6326_c = p_6249_1_;
        field_6325_d = p_6249_2_;
        if(field_6313_p != null)
        {
            ScaledResolution scaledresolution = new ScaledResolution(field_6304_y, p_6249_1_, p_6249_2_);
            int i = scaledresolution.func_903_a();
            int j = scaledresolution.func_902_b();
            field_6313_p.func_6447_a(this, i, j);
        }
    }

    private void func_28001_B()
    {
        (new ThreadCheckHasPaid(this)).start();
    }

    public void func_6246_i()
    {
        if(field_35001_ab > 0)
        {
            field_35001_ab--;
        }
        if(field_6283_R == 6000)
        {
            func_28001_B();
        }
        Profiler.func_40663_a("stats");
        field_25001_G.func_27178_d();
        Profiler.func_40661_c("gui");
        if(!field_6316_m)
        {
            field_6308_u.func_555_a();
        }
        Profiler.func_40661_c("pick");
        field_9243_r.func_910_a(1.0F);
        Profiler.func_40661_c("centerChunkSource");
        if(field_6322_g != null)
        {
            net.minecraft.src.IChunkProvider ichunkprovider = field_6324_e.func_21118_q();
            if(ichunkprovider instanceof ChunkProviderLoadOrGenerate)
            {
                ChunkProviderLoadOrGenerate chunkproviderloadorgenerate = (ChunkProviderLoadOrGenerate)ichunkprovider;
                int k = MathHelper.func_1110_d((int)field_6322_g.field_611_ak) >> 4;
                int j1 = MathHelper.func_1110_d((int)field_6322_g.field_609_am) >> 4;
                chunkproviderloadorgenerate.func_21110_c(k, j1);
            }
        }
        Profiler.func_40661_c("gameMode");
        if(!field_6316_m && field_6324_e != null)
        {
            field_6327_b.func_6474_c();
        }
        GL11.glBindTexture(3553, field_6315_n.func_1070_a("/terrain.png"));
        Profiler.func_40661_c("textures");
        if(!field_6316_m)
        {
            field_6315_n.func_1067_a();
        }
        if(field_6313_p == null && field_6322_g != null)
        {
            if(field_6322_g.func_40114_aH() <= 0)
            {
                func_6272_a(null);
            } else
            if(field_6322_g.func_22051_K() && field_6324_e != null && field_6324_e.field_1026_y)
            {
                func_6272_a(new GuiSleepMP());
            }
        } else
        if(field_6313_p != null && (field_6313_p instanceof GuiSleepMP) && !field_6322_g.func_22051_K())
        {
            func_6272_a(null);
        }
        if(field_6313_p != null)
        {
            field_6282_S = 10000;
        }
        if(field_6313_p != null)
        {
            field_6313_p.func_564_d();
            if(field_6313_p != null)
            {
                field_6313_p.field_25091_h.func_25088_a();
                field_6313_p.func_570_g();
            }
        }
        if(field_6313_p == null || field_6313_p.field_948_f)
        {
            Profiler.func_40661_c("mouse");
            do
            {
                if(!Mouse.next())
                {
                    break;
                }
                KeyBinding.func_35963_a(Mouse.getEventButton() - 100, Mouse.getEventButtonState());
                if(Mouse.getEventButtonState())
                {
                    KeyBinding.func_35960_a(Mouse.getEventButton() - 100);
                }
                long l = System.currentTimeMillis() - field_6287_N;
                if(l <= 200L)
                {
                    int i1 = Mouse.getEventDWheel();
                    if(i1 != 0)
                    {
                        field_6322_g.field_778_b.func_498_a(i1);
                        if(field_6304_y.field_22275_C)
                        {
                            if(i1 > 0)
                            {
                                i1 = 1;
                            }
                            if(i1 < 0)
                            {
                                i1 = -1;
                            }
                            field_6304_y.field_22272_F += (float)i1 * 0.25F;
                        }
                    }
                    if(field_6313_p == null)
                    {
                        if(!field_6289_L && Mouse.getEventButtonState())
                        {
                            func_6259_e();
                        }
                    } else
                    if(field_6313_p != null)
                    {
                        field_6313_p.func_566_e();
                    }
                }
            } while(true);
            if(field_6282_S > 0)
            {
                field_6282_S--;
            }
            Profiler.func_40661_c("keyboard");
            do
            {
                if(!Keyboard.next())
                {
                    break;
                }
                KeyBinding.func_35963_a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
                if(Keyboard.getEventKeyState())
                {
                    KeyBinding.func_35960_a(Keyboard.getEventKey());
                }
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.getEventKey() == 87)
                    {
                        func_6270_h();
                    } else
                    {
                        if(field_6313_p != null)
                        {
                            field_6313_p.func_569_f();
                        } else
                        {
                            if(Keyboard.getEventKey() == 1)
                            {
                                func_6252_g();
                            }
                            if(Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61))
                            {
                                func_6242_u();
                            }
                            if(Keyboard.getEventKey() == 20 && Keyboard.isKeyDown(61))
                            {
                                field_6315_n.func_1065_b();
                            }
                            if(Keyboard.getEventKey() == 33 && Keyboard.isKeyDown(61))
                            {
                                boolean flag = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
                                field_6304_y.func_1045_b(EnumOptions.RENDER_DISTANCE, flag ? -1 : 1);
                            }
                            if(Keyboard.getEventKey() == 30 && Keyboard.isKeyDown(61))
                            {
                                field_6323_f.func_958_a();
                            }
                            if(Keyboard.getEventKey() == 59)
                            {
                                field_6304_y.field_22277_y = !field_6304_y.field_22277_y;
                            }
                            if(Keyboard.getEventKey() == 61)
                            {
                                field_6304_y.field_22276_A = !field_6304_y.field_22276_A;
                                field_6304_y.field_50119_G = !GuiScreen.func_50049_m();
                            }
                            if(Keyboard.getEventKey() == 63)
                            {
                                field_6304_y.field_1560_x++;
                                if(field_6304_y.field_1560_x > 2)
                                {
                                    field_6304_y.field_1560_x = 0;
                                }
                            }
                            if(Keyboard.getEventKey() == 66)
                            {
                                field_6304_y.field_22274_D = !field_6304_y.field_22274_D;
                            }
                        }
                        for(int i = 0; i < 9; i++)
                        {
                            if(Keyboard.getEventKey() == 2 + i)
                            {
                                field_6322_g.field_778_b.field_847_d = i;
                            }
                        }

                        if(field_6304_y.field_22276_A && field_6304_y.field_50119_G)
                        {
                            if(Keyboard.getEventKey() == 11)
                            {
                                func_40003_b(0);
                            }
                            int j = 0;
                            while(j < 9) 
                            {
                                if(Keyboard.getEventKey() == 2 + j)
                                {
                                    func_40003_b(j + 1);
                                }
                                j++;
                            }
                        }
                    }
                }
            } while(true);
            for(; field_6304_y.field_1570_o.func_35962_c(); func_6272_a(new GuiInventory(field_6322_g))) { }
            for(; field_6304_y.field_6523_q.func_35962_c(); field_6322_g.func_48152_as()) { }
            for(; func_6260_j() && field_6304_y.field_6521_r.func_35962_c(); func_6272_a(new GuiChat())) { }
            if(func_6260_j() && field_6313_p == null && (Keyboard.isKeyDown(53) || Keyboard.isKeyDown(181)))
            {
                func_6272_a(new GuiChat("/"));
            }
            if(field_6322_g.func_35196_Z())
            {
                if(!field_6304_y.field_35381_w.field_35965_e)
                {
                    field_6327_b.func_35638_c(field_6322_g);
                }
                while(field_6304_y.field_35382_v.func_35962_c()) ;
                while(field_6304_y.field_35381_w.func_35962_c()) ;
                while(field_6304_y.field_35383_y.func_35962_c()) ;
            } else
            {
                for(; field_6304_y.field_35382_v.func_35962_c(); func_6243_a(0)) { }
                for(; field_6304_y.field_35381_w.func_35962_c(); func_6243_a(1)) { }
                for(; field_6304_y.field_35383_y.func_35962_c(); func_6265_t()) { }
            }
            if(field_6304_y.field_35381_w.field_35965_e && field_35001_ab == 0 && !field_6322_g.func_35196_Z())
            {
                func_6243_a(1);
            }
            func_6254_a(0, field_6313_p == null && field_6304_y.field_35382_v.field_35965_e && field_6289_L);
        }
        if(field_6324_e != null)
        {
            if(field_6322_g != null)
            {
                field_6300_ab++;
                if(field_6300_ab == 30)
                {
                    field_6300_ab = 0;
                    field_6324_e.func_705_f(field_6322_g);
                }
            }
            if(field_6324_e.func_22144_v().func_40724_s())
            {
                field_6324_e.field_1039_l = 3;
            } else
            {
                field_6324_e.field_1039_l = field_6304_y.field_1561_w;
            }
            if(field_6324_e.field_1026_y)
            {
                field_6324_e.field_1039_l = 1;
            }
            Profiler.func_40661_c("gameRenderer");
            if(!field_6316_m)
            {
                field_9243_r.func_911_a();
            }
            Profiler.func_40661_c("levelRenderer");
            if(!field_6316_m)
            {
                field_6323_f.func_945_d();
            }
            Profiler.func_40661_c("level");
            if(!field_6316_m)
            {
                if(field_6324_e.field_27172_i > 0)
                {
                    field_6324_e.field_27172_i--;
                }
                field_6324_e.func_633_c();
            }
            if(!field_6316_m || func_6260_j())
            {
                field_6324_e.func_21114_a(field_6324_e.field_1039_l > 0, true);
                field_6324_e.func_649_g();
            }
            Profiler.func_40661_c("animateTick");
            if(!field_6316_m && field_6324_e != null)
            {
                field_6324_e.func_677_m(MathHelper.func_1108_b(field_6322_g.field_611_ak), MathHelper.func_1108_b(field_6322_g.field_610_al), MathHelper.func_1108_b(field_6322_g.field_609_am));
            }
            Profiler.func_40661_c("particles");
            if(!field_6316_m)
            {
                field_6321_h.func_1193_a();
            }
        }
        Profiler.func_40662_b();
        field_6287_N = System.currentTimeMillis();
    }

    private void func_6242_u()
    {
        System.out.println("FORCING RELOAD!");
        field_6301_A = new SoundManager();
        field_6301_A.func_340_a(field_6304_y);
        field_6284_Q.func_1210_a();
    }

    public boolean func_6260_j()
    {
        return field_6324_e != null && field_6324_e.field_1026_y;
    }

    public void func_6247_b(String p_6247_1_, String p_6247_2_, WorldSettings p_6247_3_)
    {
        func_6261_a(null);
        System.gc();
        if(field_22008_V.func_22175_a(p_6247_1_))
        {
            func_22002_b(p_6247_1_, p_6247_2_);
        } else
        {
            if(field_6312_q != null)
            {
                field_6312_q.func_596_a(StatCollector.func_25200_a("menu.switchingLevel"));
                field_6312_q.func_595_d("");
            }
            net.minecraft.src.ISaveHandler isavehandler = field_22008_V.func_22174_a(p_6247_1_, false);
            World world = null;
            world = new World(isavehandler, p_6247_2_, p_6247_3_);
            if(world.field_1033_r)
            {
                field_25001_G.func_25100_a(StatList.field_25183_f, 1);
                field_25001_G.func_25100_a(StatList.field_25184_e, 1);
                func_6263_a(world, StatCollector.func_25200_a("menu.generatingLevel"));
            } else
            {
                field_25001_G.func_25100_a(StatList.field_25182_g, 1);
                field_25001_G.func_25100_a(StatList.field_25184_e, 1);
                func_6263_a(world, StatCollector.func_25200_a("menu.loadingLevel"));
            }
        }
    }

    public void func_6237_k(int p_6237_1_)
    {
        int i = field_6322_g.field_4129_m;
        field_6322_g.field_4129_m = p_6237_1_;
        field_6324_e.func_607_d(field_6322_g);
        field_6322_g.field_646_aA = false;
        double d = field_6322_g.field_611_ak;
        double d1 = field_6322_g.field_609_am;
        double d2 = 1.0D;
        if(i > -1 && field_6322_g.field_4129_m == -1)
        {
            d2 = 0.125D;
        } else
        if(i == -1 && field_6322_g.field_4129_m > -1)
        {
            d2 = 8D;
        }
        d *= d2;
        d1 *= d2;
        if(field_6322_g.field_4129_m == -1)
        {
            field_6322_g.func_365_c(d, field_6322_g.field_610_al, d1, field_6322_g.field_605_aq, field_6322_g.field_604_ar);
            if(field_6322_g.func_354_B())
            {
                field_6324_e.func_4084_a(field_6322_g, false);
            }
            World world = null;
            world = new World(field_6324_e, WorldProvider.func_4101_a(field_6322_g.field_4129_m));
            func_6256_a(world, "Entering the Nether", field_6322_g);
        } else
        if(field_6322_g.field_4129_m == 0)
        {
            if(field_6322_g.func_354_B())
            {
                field_6322_g.func_365_c(d, field_6322_g.field_610_al, d1, field_6322_g.field_605_aq, field_6322_g.field_604_ar);
                field_6324_e.func_4084_a(field_6322_g, false);
            }
            World world1 = null;
            world1 = new World(field_6324_e, WorldProvider.func_4101_a(field_6322_g.field_4129_m));
            if(i == -1)
            {
                func_6256_a(world1, "Leaving the Nether", field_6322_g);
            } else
            {
                func_6256_a(world1, "Leaving the End", field_6322_g);
            }
        } else
        {
            World world2 = null;
            world2 = new World(field_6324_e, WorldProvider.func_4101_a(field_6322_g.field_4129_m));
            ChunkCoordinates chunkcoordinates = world2.func_40472_j();
            d = chunkcoordinates.field_22395_a;
            field_6322_g.field_610_al = chunkcoordinates.field_22394_b;
            d1 = chunkcoordinates.field_22396_c;
            field_6322_g.func_365_c(d, field_6322_g.field_610_al, d1, 90F, 0.0F);
            if(field_6322_g.func_354_B())
            {
                world2.func_4084_a(field_6322_g, false);
            }
            func_6256_a(world2, "Entering the End", field_6322_g);
        }
        field_6322_g.field_615_ag = field_6324_e;
        System.out.println((new StringBuilder()).append("Teleported to ").append(field_6324_e.field_4209_q.field_4218_e).toString());
        if(field_6322_g.func_354_B() && i < 1)
        {
            field_6322_g.func_365_c(d, field_6322_g.field_610_al, d1, field_6322_g.field_605_aq, field_6322_g.field_604_ar);
            field_6324_e.func_4084_a(field_6322_g, false);
            (new Teleporter()).func_4107_a(field_6324_e, field_6322_g);
        }
    }

    public void func_40002_b(String p_40002_1_)
    {
        field_6324_e = null;
        func_6263_a(null, p_40002_1_);
    }

    public void func_6261_a(World p_6261_1_)
    {
        func_6263_a(p_6261_1_, "");
    }

    public void func_6263_a(World p_6263_1_, String p_6263_2_)
    {
        func_6256_a(p_6263_1_, p_6263_2_, null);
    }

    public void func_6256_a(World p_6256_1_, String p_6256_2_, EntityPlayer p_6256_3_)
    {
        field_25001_G.func_27175_b();
        field_25001_G.func_27182_c();
        field_22009_h = null;
        if(field_6312_q != null)
        {
            field_6312_q.func_596_a(p_6256_2_);
            field_6312_q.func_595_d("");
        }
        field_6301_A.func_331_a(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        if(field_6324_e != null)
        {
            field_6324_e.func_651_a(field_6312_q);
        }
        field_6324_e = p_6256_1_;
        if(p_6256_1_ != null)
        {
            if(field_6327_b != null)
            {
                field_6327_b.func_717_a(p_6256_1_);
            }
            if(!func_6260_j())
            {
                if(p_6256_3_ == null)
                {
                    field_6322_g = (EntityPlayerSP)p_6256_1_.func_4085_a(net.minecraft.src.EntityPlayerSP.class);
                }
            } else
            if(field_6322_g != null)
            {
                field_6322_g.func_374_q();
                if(p_6256_1_ != null)
                {
                    p_6256_1_.func_674_a(field_6322_g);
                }
            }
            if(!p_6256_1_.field_1026_y)
            {
                func_6255_d(p_6256_2_);
            }
            if(field_6322_g == null)
            {
                field_6322_g = (EntityPlayerSP)field_6327_b.func_4087_b(p_6256_1_);
                field_6322_g.func_374_q();
                field_6327_b.func_6476_a(field_6322_g);
            }
            field_6322_g.field_787_a = new MovementInputFromOptions(field_6304_y);
            if(field_6323_f != null)
            {
                field_6323_f.func_946_a(p_6256_1_);
            }
            if(field_6321_h != null)
            {
                field_6321_h.func_1188_a(p_6256_1_);
            }
            if(p_6256_3_ != null)
            {
                p_6256_1_.func_6464_c();
            }
            net.minecraft.src.IChunkProvider ichunkprovider = p_6256_1_.func_21118_q();
            if(ichunkprovider instanceof ChunkProviderLoadOrGenerate)
            {
                ChunkProviderLoadOrGenerate chunkproviderloadorgenerate = (ChunkProviderLoadOrGenerate)ichunkprovider;
                int i = MathHelper.func_1110_d((int)field_6322_g.field_611_ak) >> 4;
                int j = MathHelper.func_1110_d((int)field_6322_g.field_609_am) >> 4;
                chunkproviderloadorgenerate.func_21110_c(i, j);
            }
            p_6256_1_.func_608_a(field_6322_g);
            field_6327_b.func_6473_b(field_6322_g);
            if(p_6256_1_.field_1033_r)
            {
                p_6256_1_.func_651_a(field_6312_q);
            }
            field_22009_h = field_6322_g;
        } else
        {
            field_22008_V.func_22177_c();
            field_6322_g = null;
        }
        System.gc();
        field_6287_N = 0L;
    }

    private void func_22002_b(String p_22002_1_, String p_22002_2_)
    {
        field_6312_q.func_596_a((new StringBuilder()).append("Converting World to ").append(field_22008_V.func_22178_a()).toString());
        field_6312_q.func_595_d("This may take a while :)");
        field_22008_V.func_22171_a(p_22002_1_, field_6312_q);
        func_6247_b(p_22002_1_, p_22002_2_, new WorldSettings(0L, 0, true, false, WorldType.field_48635_b));
    }

    private void func_6255_d(String p_6255_1_)
    {
        if(field_6312_q != null)
        {
            field_6312_q.func_596_a(p_6255_1_);
            field_6312_q.func_595_d(StatCollector.func_25200_a("menu.generatingTerrain"));
        }
        char c = '\200';
        if(field_6327_b.func_35643_e())
        {
            c = '@';
        }
        int i = 0;
        int j = (c * 2) / 16 + 1;
        j *= j;
        net.minecraft.src.IChunkProvider ichunkprovider = field_6324_e.func_21118_q();
        ChunkCoordinates chunkcoordinates = field_6324_e.func_22137_s();
        if(field_6322_g != null)
        {
            chunkcoordinates.field_22395_a = (int)field_6322_g.field_611_ak;
            chunkcoordinates.field_22396_c = (int)field_6322_g.field_609_am;
        }
        if(ichunkprovider instanceof ChunkProviderLoadOrGenerate)
        {
            ChunkProviderLoadOrGenerate chunkproviderloadorgenerate = (ChunkProviderLoadOrGenerate)ichunkprovider;
            chunkproviderloadorgenerate.func_21110_c(chunkcoordinates.field_22395_a >> 4, chunkcoordinates.field_22396_c >> 4);
        }
        for(int k = -c; k <= c; k += 16)
        {
            for(int l = -c; l <= c; l += 16)
            {
                if(field_6312_q != null)
                {
                    field_6312_q.func_593_a((i++ * 100) / j);
                }
                field_6324_e.func_600_a(chunkcoordinates.field_22395_a + k, 64, chunkcoordinates.field_22396_c + l);
                if(field_6327_b.func_35643_e())
                {
                    continue;
                }
                while(field_6324_e.func_6465_g()) ;
            }

        }

        if(!field_6327_b.func_35643_e())
        {
            if(field_6312_q != null)
            {
                field_6312_q.func_595_d(StatCollector.func_25200_a("menu.simulating"));
            }
            char c1 = '\u07D0';
            field_6324_e.func_656_j();
        }
    }

    public void func_6268_a(String p_6268_1_, File p_6268_2_)
    {
        int i = p_6268_1_.indexOf("/");
        String s = p_6268_1_.substring(0, i);
        p_6268_1_ = p_6268_1_.substring(i + 1);
        if(s.equalsIgnoreCase("sound"))
        {
            field_6301_A.func_6372_a(p_6268_1_, p_6268_2_);
        } else
        if(s.equalsIgnoreCase("newsound"))
        {
            field_6301_A.func_6372_a(p_6268_1_, p_6268_2_);
        } else
        if(s.equalsIgnoreCase("streaming"))
        {
            field_6301_A.func_6373_b(p_6268_1_, p_6268_2_);
        } else
        if(s.equalsIgnoreCase("music"))
        {
            field_6301_A.func_6374_c(p_6268_1_, p_6268_2_);
        } else
        if(s.equalsIgnoreCase("newmusic"))
        {
            field_6301_A.func_6374_c(p_6268_1_, p_6268_2_);
        }
    }

    public String func_6241_m()
    {
        return field_6323_f.func_953_b();
    }

    public String func_6262_n()
    {
        return field_6323_f.func_957_c();
    }

    public String func_21002_o()
    {
        return field_6324_e.func_21119_g();
    }

    public String func_6245_o()
    {
        return (new StringBuilder()).append("P: ").append(field_6321_h.func_1190_b()).append(". T: ").append(field_6324_e.func_687_d()).toString();
    }

    public void func_6239_p(boolean p_6239_1_, int p_6239_2_, boolean p_6239_3_)
    {
        if(!field_6324_e.field_1026_y && !field_6324_e.field_4209_q.func_6477_d())
        {
            func_6237_k(0);
        }
        ChunkCoordinates chunkcoordinates = null;
        ChunkCoordinates chunkcoordinates1 = null;
        boolean flag = true;
        if(field_6322_g != null && !p_6239_1_)
        {
            chunkcoordinates = field_6322_g.func_25059_P();
            if(chunkcoordinates != null)
            {
                chunkcoordinates1 = EntityPlayer.func_25060_a(field_6324_e, chunkcoordinates);
                if(chunkcoordinates1 == null)
                {
                    field_6322_g.func_22055_b("tile.bed.notValid");
                }
            }
        }
        if(chunkcoordinates1 == null)
        {
            chunkcoordinates1 = field_6324_e.func_22137_s();
            flag = false;
        }
        net.minecraft.src.IChunkProvider ichunkprovider = field_6324_e.func_21118_q();
        if(ichunkprovider instanceof ChunkProviderLoadOrGenerate)
        {
            ChunkProviderLoadOrGenerate chunkproviderloadorgenerate = (ChunkProviderLoadOrGenerate)ichunkprovider;
            chunkproviderloadorgenerate.func_21110_c(chunkcoordinates1.field_22395_a >> 4, chunkcoordinates1.field_22396_c >> 4);
        }
        field_6324_e.func_4076_b();
        field_6324_e.func_9424_o();
        int i = 0;
        if(field_6322_g != null)
        {
            i = field_6322_g.field_620_ab;
            field_6324_e.func_607_d(field_6322_g);
        }
        EntityPlayerSP entityplayersp = field_6322_g;
        field_22009_h = null;
        field_6322_g = (EntityPlayerSP)field_6327_b.func_4087_b(field_6324_e);
        if(p_6239_3_)
        {
            field_6322_g.func_41014_d(entityplayersp);
        }
        field_6322_g.field_4129_m = p_6239_2_;
        field_22009_h = field_6322_g;
        field_6322_g.func_374_q();
        if(flag)
        {
            field_6322_g.func_25061_a(chunkcoordinates);
            field_6322_g.func_365_c((float)chunkcoordinates1.field_22395_a + 0.5F, (float)chunkcoordinates1.field_22394_b + 0.1F, (float)chunkcoordinates1.field_22396_c + 0.5F, 0.0F, 0.0F);
        }
        field_6327_b.func_6476_a(field_6322_g);
        field_6324_e.func_608_a(field_6322_g);
        field_6322_g.field_787_a = new MovementInputFromOptions(field_6304_y);
        field_6322_g.field_620_ab = i;
        field_6322_g.func_6420_o();
        field_6327_b.func_6473_b(field_6322_g);
        func_6255_d(StatCollector.func_25200_a("menu.respawning"));
        if(field_6313_p instanceof GuiGameOver)
        {
            func_6272_a(null);
        }
    }

    public static void func_6269_a(String p_6269_0_, String p_6269_1_)
    {
        func_6253_a(p_6269_0_, p_6269_1_, null);
    }

    public static void func_6253_a(String p_6253_0_, String p_6253_1_, String p_6253_2_)
    {
        boolean flag = false;
        String s = p_6253_0_;
        Frame frame = new Frame("Minecraft");
        Canvas canvas = new Canvas();
        frame.setLayout(new BorderLayout());
        frame.add(canvas, "Center");
        canvas.setPreferredSize(new Dimension(854, 480));
        frame.pack();
        frame.setLocationRelativeTo(null);
        MinecraftImpl minecraftimpl = new MinecraftImpl(frame, canvas, null, 854, 480, flag, frame);
        Thread thread = new Thread(minecraftimpl, "Minecraft main thread");
        thread.setPriority(10);
        minecraftimpl.field_6319_j = "www.minecraft.net";
        if(s != null && p_6253_1_ != null)
        {
            minecraftimpl.field_6320_i = new Session(s, p_6253_1_);
        } else
        {
            minecraftimpl.field_6320_i = new Session((new StringBuilder()).append("Player").append(System.currentTimeMillis() % 1000L).toString(), "");
        }
        if(p_6253_2_ != null)
        {
            String as[] = p_6253_2_.split(":");
            minecraftimpl.func_6258_a(as[0], Integer.parseInt(as[1]));
        }
        frame.setVisible(true);
        frame.addWindowListener(new GameWindowListener(minecraftimpl, thread));
        thread.start();
    }

    public NetClientHandler func_20001_q()
    {
        if(field_6322_g instanceof EntityClientPlayerMP)
        {
            return ((EntityClientPlayerMP)field_6322_g).field_797_bg;
        } else
        {
            return null;
        }
    }

    public static void main(String p_main_0_[])
    {
        String s = null;
        String s1 = null;
        s = (new StringBuilder()).append("Player").append(System.currentTimeMillis() % 1000L).toString();
        if(p_main_0_.length > 0)
        {
            s = p_main_0_[0];
        }
        s1 = "-";
        if(p_main_0_.length > 1)
        {
            s1 = p_main_0_[1];
        }
        func_6269_a(s, s1);
    }

    public static boolean func_22006_t()
    {
        return field_21900_a == null || !field_21900_a.field_6304_y.field_22277_y;
    }

    public static boolean func_22001_u()
    {
        return field_21900_a != null && field_21900_a.field_6304_y.field_1576_i;
    }

    public static boolean func_22005_v()
    {
        return field_21900_a != null && field_21900_a.field_6304_y.field_22278_j;
    }

    public static boolean func_22007_w()
    {
        return field_21900_a != null && field_21900_a.field_6304_y.field_22276_A;
    }

    public boolean func_22003_b(String p_22003_1_)
    {
        if(!p_22003_1_.startsWith("/"));
        return false;
    }

    private void func_6265_t()
    {
        if(field_6305_x != null)
        {
            boolean flag = field_6322_g.field_35212_aW.field_35756_d;
            int i = field_6324_e.func_600_a(field_6305_x.field_1166_b, field_6305_x.field_1172_c, field_6305_x.field_1171_d);
            if(!flag)
            {
                if(i == Block.field_337_v.field_376_bc)
                {
                    i = Block.field_336_w.field_376_bc;
                }
                if(i == Block.field_411_ak.field_376_bc)
                {
                    i = Block.field_410_al.field_376_bc;
                }
                if(i == Block.field_403_A.field_376_bc)
                {
                    i = Block.field_338_u.field_376_bc;
                }
            }
            int j = 0;
            boolean flag1 = false;
            if(Item.field_233_c[i] != null && Item.field_233_c[i].func_21010_e())
            {
                j = field_6324_e.func_602_e(field_6305_x.field_1166_b, field_6305_x.field_1172_c, field_6305_x.field_1171_d);
                flag1 = true;
            }
            if(Item.field_233_c[i] != null && (Item.field_233_c[i] instanceof ItemBlock))
            {
                Block block = Block.field_345_n[i];
                int l = block.func_240_a(j, field_6322_g.field_615_ag.field_1037_n, 0);
                if(l > 0)
                {
                    i = l;
                }
            }
            field_6322_g.field_778_b.func_496_a(i, j, flag1, flag);
            if(flag)
            {
                int k = (field_6322_g.field_20069_g.field_20122_e.size() - 9) + field_6322_g.field_778_b.field_847_d;
                field_6327_b.func_35637_a(field_6322_g.field_778_b.func_468_c(field_6322_g.field_778_b.field_847_d), k);
            }
        }
    }

    public static String func_52003_C()
    {
        return "1.2.5";
    }

    public static void func_52004_D()
    {
        PlayerUsageSnooper playerusagesnooper = new PlayerUsageSnooper("client");
        playerusagesnooper.func_52022_a("version", func_52003_C());
        playerusagesnooper.func_52022_a("os_name", System.getProperty("os.name"));
        playerusagesnooper.func_52022_a("os_version", System.getProperty("os.version"));
        playerusagesnooper.func_52022_a("os_architecture", System.getProperty("os.arch"));
        playerusagesnooper.func_52022_a("memory_total", Long.valueOf(Runtime.getRuntime().totalMemory()));
        playerusagesnooper.func_52022_a("memory_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
        playerusagesnooper.func_52022_a("java_version", System.getProperty("java.version"));
        playerusagesnooper.func_52022_a("opengl_version", GL11.glGetString(7938));
        playerusagesnooper.func_52022_a("opengl_vendor", GL11.glGetString(7936));
        playerusagesnooper.func_52021_a();
    }

}
