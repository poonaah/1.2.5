// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureBoundingBox, StructureMineshaftPieces, Block, 
//            World

public class ComponentMineshaftRoom extends StructureComponent
{

    private LinkedList field_35065_a;

    public ComponentMineshaftRoom(int p_i596_1_, Random p_i596_2_, int p_i596_3_, int p_i596_4_)
    {
        super(p_i596_1_);
        field_35065_a = new LinkedList();
        field_35024_g = new StructureBoundingBox(p_i596_3_, 50, p_i596_4_, p_i596_3_ + 7 + p_i596_2_.nextInt(6), 54 + p_i596_2_.nextInt(6), p_i596_4_ + 7 + p_i596_2_.nextInt(6));
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        int i = func_35012_c();
        int j1 = field_35024_g.func_35743_c() - 3 - 1;
        if(j1 <= 0)
        {
            j1 = 1;
        }
        for(int j = 0; j < field_35024_g.func_35744_b(); j += 4)
        {
            j += p_35004_3_.nextInt(field_35024_g.func_35744_b());
            if(j + 3 > field_35024_g.func_35744_b())
            {
                break;
            }
            StructureComponent structurecomponent = StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a + j, field_35024_g.field_35751_b + p_35004_3_.nextInt(j1) + 1, field_35024_g.field_35752_c - 1, 2, i);
            if(structurecomponent != null)
            {
                StructureBoundingBox structureboundingbox = structurecomponent.func_35021_b();
                field_35065_a.add(new StructureBoundingBox(structureboundingbox.field_35753_a, structureboundingbox.field_35751_b, field_35024_g.field_35752_c, structureboundingbox.field_35749_d, structureboundingbox.field_35750_e, field_35024_g.field_35752_c + 1));
            }
        }

        for(int k = 0; k < field_35024_g.func_35744_b(); k += 4)
        {
            k += p_35004_3_.nextInt(field_35024_g.func_35744_b());
            if(k + 3 > field_35024_g.func_35744_b())
            {
                break;
            }
            StructureComponent structurecomponent1 = StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a + k, field_35024_g.field_35751_b + p_35004_3_.nextInt(j1) + 1, field_35024_g.field_35748_f + 1, 0, i);
            if(structurecomponent1 != null)
            {
                StructureBoundingBox structureboundingbox1 = structurecomponent1.func_35021_b();
                field_35065_a.add(new StructureBoundingBox(structureboundingbox1.field_35753_a, structureboundingbox1.field_35751_b, field_35024_g.field_35748_f - 1, structureboundingbox1.field_35749_d, structureboundingbox1.field_35750_e, field_35024_g.field_35748_f));
            }
        }

        for(int l = 0; l < field_35024_g.func_35739_d(); l += 4)
        {
            l += p_35004_3_.nextInt(field_35024_g.func_35739_d());
            if(l + 3 > field_35024_g.func_35739_d())
            {
                break;
            }
            StructureComponent structurecomponent2 = StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b + p_35004_3_.nextInt(j1) + 1, field_35024_g.field_35752_c + l, 1, i);
            if(structurecomponent2 != null)
            {
                StructureBoundingBox structureboundingbox2 = structurecomponent2.func_35021_b();
                field_35065_a.add(new StructureBoundingBox(field_35024_g.field_35753_a, structureboundingbox2.field_35751_b, structureboundingbox2.field_35752_c, field_35024_g.field_35753_a + 1, structureboundingbox2.field_35750_e, structureboundingbox2.field_35748_f));
            }
        }

        for(int i1 = 0; i1 < field_35024_g.func_35739_d(); i1 += 4)
        {
            i1 += p_35004_3_.nextInt(field_35024_g.func_35739_d());
            if(i1 + 3 > field_35024_g.func_35739_d())
            {
                break;
            }
            StructureComponent structurecomponent3 = StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b + p_35004_3_.nextInt(j1) + 1, field_35024_g.field_35752_c + i1, 3, i);
            if(structurecomponent3 != null)
            {
                StructureBoundingBox structureboundingbox3 = structurecomponent3.func_35021_b();
                field_35065_a.add(new StructureBoundingBox(field_35024_g.field_35749_d - 1, structureboundingbox3.field_35751_b, structureboundingbox3.field_35752_c, field_35024_g.field_35749_d, structureboundingbox3.field_35750_e, structureboundingbox3.field_35748_f));
            }
        }

    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(func_35013_a(p_35023_1_, p_35023_3_))
        {
            return false;
        }
        func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35753_a, field_35024_g.field_35751_b, field_35024_g.field_35752_c, field_35024_g.field_35749_d, field_35024_g.field_35751_b, field_35024_g.field_35748_f, Block.field_336_w.field_376_bc, 0, true);
        func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35753_a, field_35024_g.field_35751_b + 1, field_35024_g.field_35752_c, field_35024_g.field_35749_d, Math.min(field_35024_g.field_35751_b + 3, field_35024_g.field_35750_e), field_35024_g.field_35748_f, 0, 0, false);
        StructureBoundingBox structureboundingbox;
        for(Iterator iterator = field_35065_a.iterator(); iterator.hasNext(); func_35011_a(p_35023_1_, p_35023_3_, structureboundingbox.field_35753_a, structureboundingbox.field_35750_e - 2, structureboundingbox.field_35752_c, structureboundingbox.field_35749_d, structureboundingbox.field_35750_e, structureboundingbox.field_35748_f, 0, 0, false))
        {
            structureboundingbox = (StructureBoundingBox)iterator.next();
        }

        func_35015_a(p_35023_1_, p_35023_3_, field_35024_g.field_35753_a, field_35024_g.field_35751_b + 4, field_35024_g.field_35752_c, field_35024_g.field_35749_d, field_35024_g.field_35750_e, field_35024_g.field_35748_f, 0, false);
        return true;
    }
}
