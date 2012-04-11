// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.net.ConnectException;
import java.net.UnknownHostException;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            NetClientHandler, GuiConnecting, Packet2Handshake, Session, 
//            GuiDisconnected

class ThreadConnectToServer extends Thread
{

    final Minecraft field_1102_a; /* synthetic field */
    final String field_48479_b; /* synthetic field */
    final int field_1104_c; /* synthetic field */
    final GuiConnecting field_1103_d; /* synthetic field */

    ThreadConnectToServer(GuiConnecting p_i190_1_, Minecraft p_i190_2_, String p_i190_3_, int p_i190_4_)
    {
        field_1103_d = p_i190_1_;
        field_1102_a = p_i190_2_;
        field_48479_b = p_i190_3_;
        field_1104_c = p_i190_4_;
        super();
    }

    public void run()
    {
        try
        {
            GuiConnecting.func_582_a(field_1103_d, new NetClientHandler(field_1102_a, field_48479_b, field_1104_c));
            if(GuiConnecting.func_581_a(field_1103_d))
            {
                return;
            }
            GuiConnecting.func_583_b(field_1103_d).func_847_a(new Packet2Handshake(field_1102_a.field_6320_i.field_1666_b, field_48479_b, field_1104_c));
        }
        catch(UnknownHostException unknownhostexception)
        {
            if(GuiConnecting.func_581_a(field_1103_d))
            {
                return;
            }
            field_1102_a.func_6272_a(new GuiDisconnected("connect.failed", "disconnect.genericReason", new Object[] {
                (new StringBuilder()).append("Unknown host '").append(field_48479_b).append("'").toString()
            }));
        }
        catch(ConnectException connectexception)
        {
            if(GuiConnecting.func_581_a(field_1103_d))
            {
                return;
            }
            field_1102_a.func_6272_a(new GuiDisconnected("connect.failed", "disconnect.genericReason", new Object[] {
                connectexception.getMessage()
            }));
        }
        catch(Exception exception)
        {
            if(GuiConnecting.func_581_a(field_1103_d))
            {
                return;
            }
            exception.printStackTrace();
            field_1102_a.func_6272_a(new GuiDisconnected("connect.failed", "disconnect.genericReason", new Object[] {
                exception.toString()
            }));
        }
    }
}
