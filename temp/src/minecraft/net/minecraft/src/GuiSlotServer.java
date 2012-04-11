// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiSlot, GuiMultiplayer, GuiButton, ServerNBTStorage, 
//            ThreadPollServers, FontRenderer, RenderEngine, Tessellator

class GuiSlotServer extends GuiSlot
{

    final GuiMultiplayer field_35410_a; /* synthetic field */

    public GuiSlotServer(GuiMultiplayer p_i543_1_)
    {
        field_35410_a = p_i543_1_;
        super(p_i543_1_.field_945_b, p_i543_1_.field_951_c, p_i543_1_.field_950_d, 32, p_i543_1_.field_950_d - 64, 36);
    }

    protected int func_22249_a()
    {
        return GuiMultiplayer.func_35320_a(field_35410_a).size();
    }

    protected void func_22247_a(int p_22247_1_, boolean p_22247_2_)
    {
        GuiMultiplayer.func_35326_a(field_35410_a, p_22247_1_);
        boolean flag = GuiMultiplayer.func_35333_b(field_35410_a) >= 0 && GuiMultiplayer.func_35333_b(field_35410_a) < func_22249_a();
        GuiMultiplayer.func_35329_c(field_35410_a).field_937_g = flag;
        GuiMultiplayer.func_35334_d(field_35410_a).field_937_g = flag;
        GuiMultiplayer.func_35339_e(field_35410_a).field_937_g = flag;
        if(p_22247_2_ && flag)
        {
            GuiMultiplayer.func_35332_b(field_35410_a, p_22247_1_);
        }
    }

    protected boolean func_22246_a(int p_22246_1_)
    {
        return p_22246_1_ == GuiMultiplayer.func_35333_b(field_35410_a);
    }

    protected int func_22245_b()
    {
        return GuiMultiplayer.func_35320_a(field_35410_a).size() * 36;
    }

    protected void func_22248_c()
    {
        field_35410_a.func_578_i();
    }

    protected void func_22242_a(int p_22242_1_, int p_22242_2_, int p_22242_3_, int p_22242_4_, Tessellator p_22242_5_)
    {
        ServerNBTStorage servernbtstorage = (ServerNBTStorage)GuiMultiplayer.func_35320_a(field_35410_a).get(p_22242_1_);
        synchronized(GuiMultiplayer.func_35321_g())
        {
            if(GuiMultiplayer.func_35338_m() < 5 && !servernbtstorage.field_35790_f)
            {
                servernbtstorage.field_35790_f = true;
                servernbtstorage.field_35792_e = -2L;
                servernbtstorage.field_35791_d = "";
                servernbtstorage.field_35794_c = "";
                GuiMultiplayer.func_35331_n();
                (new ThreadPollServers(this, servernbtstorage)).start();
            }
        }
        field_35410_a.func_547_b(field_35410_a.field_6451_g, servernbtstorage.field_35795_a, p_22242_2_ + 2, p_22242_3_ + 1, 0xffffff);
        field_35410_a.func_547_b(field_35410_a.field_6451_g, servernbtstorage.field_35791_d, p_22242_2_ + 2, p_22242_3_ + 12, 0x808080);
        field_35410_a.func_547_b(field_35410_a.field_6451_g, servernbtstorage.field_35794_c, (p_22242_2_ + 215) - field_35410_a.field_6451_g.func_871_a(servernbtstorage.field_35794_c), p_22242_3_ + 12, 0x808080);
        field_35410_a.func_547_b(field_35410_a.field_6451_g, servernbtstorage.field_35793_b, p_22242_2_ + 2, p_22242_3_ + 12 + 11, 0x303030);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        field_35410_a.field_945_b.field_6315_n.func_1076_b(field_35410_a.field_945_b.field_6315_n.func_1070_a("/gui/icons.png"));
        String s = "";
        int i;
        int j;
        if(servernbtstorage.field_35790_f && servernbtstorage.field_35792_e != -2L)
        {
            i = 0;
            j = 0;
            if(servernbtstorage.field_35792_e < 0L)
            {
                j = 5;
            } else
            if(servernbtstorage.field_35792_e < 150L)
            {
                j = 0;
            } else
            if(servernbtstorage.field_35792_e < 300L)
            {
                j = 1;
            } else
            if(servernbtstorage.field_35792_e < 600L)
            {
                j = 2;
            } else
            if(servernbtstorage.field_35792_e < 1000L)
            {
                j = 3;
            } else
            {
                j = 4;
            }
            if(servernbtstorage.field_35792_e < 0L)
            {
                s = "(no connection)";
            } else
            {
                s = (new StringBuilder()).append(servernbtstorage.field_35792_e).append("ms").toString();
            }
        } else
        {
            i = 1;
            j = (int)(System.currentTimeMillis() / 100L + (long)(p_22242_1_ * 2) & 7L);
            if(j > 4)
            {
                j = 8 - j;
            }
            s = "Polling..";
        }
        field_35410_a.func_550_b(p_22242_2_ + 205, p_22242_3_, 0 + i * 10, 176 + j * 8, 10, 8);
        byte byte0 = 4;
        if(field_35409_k >= (p_22242_2_ + 205) - byte0 && field_35408_l >= p_22242_3_ - byte0 && field_35409_k <= p_22242_2_ + 205 + 10 + byte0 && field_35408_l <= p_22242_3_ + 8 + byte0)
        {
            GuiMultiplayer.func_35327_a(field_35410_a, s);
        }
    }
}
