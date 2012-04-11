// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStrongholdStairs, ComponentStrongholdPortalRoom, StructureStrongholdPieceWeight, ChunkPosition

public class ComponentStrongholdStairs2 extends ComponentStrongholdStairs
{

    public StructureStrongholdPieceWeight field_35038_a;
    public ComponentStrongholdPortalRoom field_40009_b;
    public ArrayList field_35037_b;

    public ComponentStrongholdStairs2(int p_i602_1_, Random p_i602_2_, int p_i602_3_, int p_i602_4_)
    {
        super(0, p_i602_2_, p_i602_3_, p_i602_4_);
        field_35037_b = new ArrayList();
    }

    public ChunkPosition func_40008_a_()
    {
        if(field_40009_b != null)
        {
            return field_40009_b.func_40008_a_();
        } else
        {
            return super.func_40008_a_();
        }
    }
}
