// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.LinkedList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureStart, ComponentMineshaftRoom, World

public class StructureMineshaftStart extends StructureStart
{

    public StructureMineshaftStart(World p_i178_1_, Random p_i178_2_, int p_i178_3_, int p_i178_4_)
    {
        ComponentMineshaftRoom componentmineshaftroom = new ComponentMineshaftRoom(0, p_i178_2_, (p_i178_3_ << 4) + 2, (p_i178_4_ << 4) + 2);
        field_35717_a.add(componentmineshaftroom);
        componentmineshaftroom.func_35004_a(componentmineshaftroom, field_35717_a, p_i178_2_);
        func_35714_b();
        func_35713_a(p_i178_1_, p_i178_2_, 10);
    }
}
