// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureBoundingBox, StructureVillagePieces, World, 
//            WorldProvider, EntityVillager, ComponentVillageStartPiece

abstract class ComponentVillage extends StructureComponent
{

    private int field_39009_a;

    protected ComponentVillage(int p_i142_1_)
    {
        super(p_i142_1_);
    }

    protected StructureComponent func_35077_a(ComponentVillageStartPiece p_35077_1_, List p_35077_2_, Random p_35077_3_, int p_35077_4_, int p_35077_5_)
    {
        switch(field_35025_h)
        {
        case 2: // '\002'
            return StructureVillagePieces.func_35704_a(p_35077_1_, p_35077_2_, p_35077_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b + p_35077_4_, field_35024_g.field_35752_c + p_35077_5_, 1, func_35012_c());

        case 0: // '\0'
            return StructureVillagePieces.func_35704_a(p_35077_1_, p_35077_2_, p_35077_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b + p_35077_4_, field_35024_g.field_35752_c + p_35077_5_, 1, func_35012_c());

        case 1: // '\001'
            return StructureVillagePieces.func_35704_a(p_35077_1_, p_35077_2_, p_35077_3_, field_35024_g.field_35753_a + p_35077_5_, field_35024_g.field_35751_b + p_35077_4_, field_35024_g.field_35752_c - 1, 2, func_35012_c());

        case 3: // '\003'
            return StructureVillagePieces.func_35704_a(p_35077_1_, p_35077_2_, p_35077_3_, field_35024_g.field_35753_a + p_35077_5_, field_35024_g.field_35751_b + p_35077_4_, field_35024_g.field_35752_c - 1, 2, func_35012_c());
        }
        return null;
    }

    protected StructureComponent func_35076_b(ComponentVillageStartPiece p_35076_1_, List p_35076_2_, Random p_35076_3_, int p_35076_4_, int p_35076_5_)
    {
        switch(field_35025_h)
        {
        case 2: // '\002'
            return StructureVillagePieces.func_35704_a(p_35076_1_, p_35076_2_, p_35076_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b + p_35076_4_, field_35024_g.field_35752_c + p_35076_5_, 3, func_35012_c());

        case 0: // '\0'
            return StructureVillagePieces.func_35704_a(p_35076_1_, p_35076_2_, p_35076_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b + p_35076_4_, field_35024_g.field_35752_c + p_35076_5_, 3, func_35012_c());

        case 1: // '\001'
            return StructureVillagePieces.func_35704_a(p_35076_1_, p_35076_2_, p_35076_3_, field_35024_g.field_35753_a + p_35076_5_, field_35024_g.field_35751_b + p_35076_4_, field_35024_g.field_35748_f + 1, 0, func_35012_c());

        case 3: // '\003'
            return StructureVillagePieces.func_35704_a(p_35076_1_, p_35076_2_, p_35076_3_, field_35024_g.field_35753_a + p_35076_5_, field_35024_g.field_35751_b + p_35076_4_, field_35024_g.field_35748_f + 1, 0, func_35012_c());
        }
        return null;
    }

    protected int func_35075_b(World p_35075_1_, StructureBoundingBox p_35075_2_)
    {
        int i = 0;
        int j = 0;
        for(int k = field_35024_g.field_35752_c; k <= field_35024_g.field_35748_f; k++)
        {
            for(int l = field_35024_g.field_35753_a; l <= field_35024_g.field_35749_d; l++)
            {
                if(p_35075_2_.func_35742_b(l, 64, k))
                {
                    i += Math.max(p_35075_1_.func_4083_e(l, k), p_35075_1_.field_4209_q.func_46066_g());
                    j++;
                }
            }

        }

        if(j == 0)
        {
            return -1;
        } else
        {
            return i / j;
        }
    }

    protected static boolean func_35074_a(StructureBoundingBox p_35074_0_)
    {
        return p_35074_0_ != null && p_35074_0_.field_35751_b > 10;
    }

    protected void func_40044_a(World p_40044_1_, StructureBoundingBox p_40044_2_, int p_40044_3_, int p_40044_4_, int p_40044_5_, int p_40044_6_)
    {
        if(field_39009_a >= p_40044_6_)
        {
            return;
        }
        int i = field_39009_a;
        do
        {
            if(i >= p_40044_6_)
            {
                break;
            }
            int j = func_35017_a(p_40044_3_ + i, p_40044_5_);
            int k = func_35008_a(p_40044_4_);
            int l = func_35006_b(p_40044_3_ + i, p_40044_5_);
            if(!p_40044_2_.func_35742_b(j, k, l))
            {
                break;
            }
            field_39009_a++;
            EntityVillager entityvillager = new EntityVillager(p_40044_1_, func_40043_a(i));
            entityvillager.func_365_c((double)j + 0.5D, k, (double)l + 0.5D, 0.0F, 0.0F);
            p_40044_1_.func_674_a(entityvillager);
            i++;
        } while(true);
    }

    protected int func_40043_a(int p_40043_1_)
    {
        return 0;
    }
}
