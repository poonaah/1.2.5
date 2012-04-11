// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            TextureOffset, Entity, EntityLiving

public abstract class ModelBase
{

    public float field_1244_k;
    public boolean field_1243_l;
    public List field_35394_j;
    public boolean field_40301_k;
    private Map field_39000_a;
    public int field_40299_l;
    public int field_40300_m;

    public ModelBase()
    {
        field_1243_l = false;
        field_35394_j = new ArrayList();
        field_40301_k = true;
        field_39000_a = new HashMap();
        field_40299_l = 64;
        field_40300_m = 32;
    }

    public void func_864_b(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public void func_863_a(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public void func_25103_a(EntityLiving entityliving, float f, float f1, float f2)
    {
    }

    protected void func_40298_a(String p_40298_1_, int p_40298_2_, int p_40298_3_)
    {
        field_39000_a.put(p_40298_1_, new TextureOffset(p_40298_2_, p_40298_3_));
    }

    public TextureOffset func_40297_a(String p_40297_1_)
    {
        return (TextureOffset)field_39000_a.get(p_40297_1_);
    }
}
