// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TileEntityRenderer, RenderEngine, TileEntity, World, 
//            FontRenderer

public abstract class TileEntitySpecialRenderer
{

    protected TileEntityRenderer field_6509_a;

    public TileEntitySpecialRenderer()
    {
    }

    public abstract void func_930_a(TileEntity tileentity, double d, double d1, double d2, 
            float f);

    protected void func_6507_a(String p_6507_1_)
    {
        RenderEngine renderengine = field_6509_a.field_1550_e;
        if(renderengine != null)
        {
            renderengine.func_1076_b(renderengine.func_1070_a(p_6507_1_));
        }
    }

    public void func_928_a(TileEntityRenderer p_928_1_)
    {
        field_6509_a = p_928_1_;
    }

    public void func_31069_a(World world)
    {
    }

    public FontRenderer func_6508_a()
    {
        return field_6509_a.func_6516_a();
    }
}
