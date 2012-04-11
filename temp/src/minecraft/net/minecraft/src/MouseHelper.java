// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.Component;
import java.nio.IntBuffer;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Cursor;
import org.lwjgl.input.Mouse;

// Referenced classes of package net.minecraft.src:
//            GLAllocation

public class MouseHelper
{

    private Component field_1117_c;
    private Cursor field_1116_d;
    public int field_1114_a;
    public int field_1113_b;
    private int field_1115_e;

    public MouseHelper(Component p_i174_1_)
    {
        field_1115_e = 10;
        field_1117_c = p_i174_1_;
        IntBuffer intbuffer = GLAllocation.func_1125_c(1);
        intbuffer.put(0);
        intbuffer.flip();
        IntBuffer intbuffer1 = GLAllocation.func_1125_c(1024);
        try
        {
            field_1116_d = new Cursor(32, 32, 16, 16, 1, intbuffer1, intbuffer);
        }
        catch(LWJGLException lwjglexception)
        {
            lwjglexception.printStackTrace();
        }
    }

    public void func_774_a()
    {
        Mouse.setGrabbed(true);
        field_1114_a = 0;
        field_1113_b = 0;
    }

    public void func_773_b()
    {
        Mouse.setCursorPosition(field_1117_c.getWidth() / 2, field_1117_c.getHeight() / 2);
        Mouse.setGrabbed(false);
    }

    public void func_772_c()
    {
        field_1114_a = Mouse.getDX();
        field_1113_b = Mouse.getDY();
    }
}
