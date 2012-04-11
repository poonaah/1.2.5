// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureStart, ComponentNetherBridgeStartPiece, StructureComponent, World

class StructureNetherBridgeStart extends StructureStart
{

    public StructureNetherBridgeStart(World p_i237_1_, Random p_i237_2_, int p_i237_3_, int p_i237_4_)
    {
        ComponentNetherBridgeStartPiece componentnetherbridgestartpiece = new ComponentNetherBridgeStartPiece(p_i237_2_, (p_i237_3_ << 4) + 2, (p_i237_4_ << 4) + 2);
        field_35717_a.add(componentnetherbridgestartpiece);
        componentnetherbridgestartpiece.func_35004_a(componentnetherbridgestartpiece, field_35717_a, p_i237_2_);
        StructureComponent structurecomponent;
        for(ArrayList arraylist = componentnetherbridgestartpiece.field_40034_d; !arraylist.isEmpty(); structurecomponent.func_35004_a(componentnetherbridgestartpiece, field_35717_a, p_i237_2_))
        {
            int i = p_i237_2_.nextInt(arraylist.size());
            structurecomponent = (StructureComponent)arraylist.remove(i);
        }

        func_35714_b();
        func_40559_a(p_i237_1_, p_i237_2_, 48, 70);
    }
}
