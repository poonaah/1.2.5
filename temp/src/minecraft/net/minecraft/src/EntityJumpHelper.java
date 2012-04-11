// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityLiving

public class EntityJumpHelper
{

    private EntityLiving field_46132_a;
    private boolean field_46131_b;

    public EntityJumpHelper(EntityLiving p_i64_1_)
    {
        field_46131_b = false;
        field_46132_a = p_i64_1_;
    }

    public void func_46129_a()
    {
        field_46131_b = true;
    }

    public void func_46130_b()
    {
        field_46132_a.func_46003_g(field_46131_b);
        field_46131_b = false;
    }
}
