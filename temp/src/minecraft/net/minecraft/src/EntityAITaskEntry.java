// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityAITasks

class EntityAITaskEntry
{

    public EntityAIBase field_46114_a;
    public int field_46112_b;
    final EntityAITasks field_46113_c; /* synthetic field */

    public EntityAITaskEntry(EntityAITasks p_i533_1_, int p_i533_2_, EntityAIBase p_i533_3_)
    {
        field_46113_c = p_i533_1_;
        super();
        field_46112_b = p_i533_2_;
        field_46114_a = p_i533_3_;
    }
}
