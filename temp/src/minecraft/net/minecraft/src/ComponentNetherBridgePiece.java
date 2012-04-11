// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureNetherBridgePieceWeight, ComponentNetherBridgeStartPiece, StructureNetherBridgePieces, 
//            ComponentNetherBridgeEnd, StructureBoundingBox

abstract class ComponentNetherBridgePiece extends StructureComponent
{

    protected ComponentNetherBridgePiece(int p_i752_1_)
    {
        super(p_i752_1_);
    }

    private int func_40017_a(List p_40017_1_)
    {
        boolean flag = false;
        int i = 0;
        for(Iterator iterator = p_40017_1_.iterator(); iterator.hasNext();)
        {
            StructureNetherBridgePieceWeight structurenetherbridgepieceweight = (StructureNetherBridgePieceWeight)iterator.next();
            if(structurenetherbridgepieceweight.field_40695_d > 0 && structurenetherbridgepieceweight.field_40698_c < structurenetherbridgepieceweight.field_40695_d)
            {
                flag = true;
            }
            i += structurenetherbridgepieceweight.field_40697_b;
        }

        return flag ? i : -1;
    }

    private ComponentNetherBridgePiece func_40020_a(ComponentNetherBridgeStartPiece p_40020_1_, List p_40020_2_, List p_40020_3_, Random p_40020_4_, int p_40020_5_, int p_40020_6_, int p_40020_7_, 
            int p_40020_8_, int p_40020_9_)
    {
        int i;
        boolean flag;
        int j;
        i = func_40017_a(p_40020_2_);
        flag = i > 0 && p_40020_9_ <= 30;
        j = 0;
_L2:
        int k;
        Iterator iterator;
        if(j >= 5 || !flag)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        j++;
        k = p_40020_4_.nextInt(i);
        iterator = p_40020_2_.iterator();
_L4:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        StructureNetherBridgePieceWeight structurenetherbridgepieceweight;
        structurenetherbridgepieceweight = (StructureNetherBridgePieceWeight)iterator.next();
        k -= structurenetherbridgepieceweight.field_40697_b;
        if(k >= 0) goto _L4; else goto _L3
_L3:
        if(structurenetherbridgepieceweight.func_40693_a(p_40020_9_) && (structurenetherbridgepieceweight != p_40020_1_.field_40037_a || structurenetherbridgepieceweight.field_40696_e)) goto _L5; else goto _L2
_L5:
        ComponentNetherBridgePiece componentnetherbridgepiece = StructureNetherBridgePieces.func_40688_a(structurenetherbridgepieceweight, p_40020_3_, p_40020_4_, p_40020_5_, p_40020_6_, p_40020_7_, p_40020_8_, p_40020_9_);
        if(componentnetherbridgepiece == null) goto _L4; else goto _L6
_L6:
        structurenetherbridgepieceweight.field_40698_c++;
        p_40020_1_.field_40037_a = structurenetherbridgepieceweight;
        if(!structurenetherbridgepieceweight.func_40694_a())
        {
            p_40020_2_.remove(structurenetherbridgepieceweight);
        }
        return componentnetherbridgepiece;
        ComponentNetherBridgeEnd componentnetherbridgeend = ComponentNetherBridgeEnd.func_40023_a(p_40020_3_, p_40020_4_, p_40020_5_, p_40020_6_, p_40020_7_, p_40020_8_, p_40020_9_);
        return componentnetherbridgeend;
    }

    private StructureComponent func_40018_a(ComponentNetherBridgeStartPiece p_40018_1_, List p_40018_2_, Random p_40018_3_, int p_40018_4_, int p_40018_5_, int p_40018_6_, int p_40018_7_, 
            int p_40018_8_, boolean p_40018_9_)
    {
        if(Math.abs(p_40018_4_ - p_40018_1_.func_35021_b().field_35753_a) > 112 || Math.abs(p_40018_6_ - p_40018_1_.func_35021_b().field_35752_c) > 112)
        {
            ComponentNetherBridgeEnd componentnetherbridgeend = ComponentNetherBridgeEnd.func_40023_a(p_40018_2_, p_40018_3_, p_40018_4_, p_40018_5_, p_40018_6_, p_40018_7_, p_40018_8_);
            return componentnetherbridgeend;
        }
        List list = p_40018_1_.field_40035_b;
        if(p_40018_9_)
        {
            list = p_40018_1_.field_40036_c;
        }
        ComponentNetherBridgePiece componentnetherbridgepiece = func_40020_a(p_40018_1_, list, p_40018_2_, p_40018_3_, p_40018_4_, p_40018_5_, p_40018_6_, p_40018_7_, p_40018_8_ + 1);
        if(componentnetherbridgepiece != null)
        {
            p_40018_2_.add(componentnetherbridgepiece);
            p_40018_1_.field_40034_d.add(componentnetherbridgepiece);
        }
        return componentnetherbridgepiece;
    }

    protected StructureComponent func_40022_a(ComponentNetherBridgeStartPiece p_40022_1_, List p_40022_2_, Random p_40022_3_, int p_40022_4_, int p_40022_5_, boolean p_40022_6_)
    {
        switch(field_35025_h)
        {
        case 2: // '\002'
            return func_40018_a(p_40022_1_, p_40022_2_, p_40022_3_, field_35024_g.field_35753_a + p_40022_4_, field_35024_g.field_35751_b + p_40022_5_, field_35024_g.field_35752_c - 1, field_35025_h, func_35012_c(), p_40022_6_);

        case 0: // '\0'
            return func_40018_a(p_40022_1_, p_40022_2_, p_40022_3_, field_35024_g.field_35753_a + p_40022_4_, field_35024_g.field_35751_b + p_40022_5_, field_35024_g.field_35748_f + 1, field_35025_h, func_35012_c(), p_40022_6_);

        case 1: // '\001'
            return func_40018_a(p_40022_1_, p_40022_2_, p_40022_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b + p_40022_5_, field_35024_g.field_35752_c + p_40022_4_, field_35025_h, func_35012_c(), p_40022_6_);

        case 3: // '\003'
            return func_40018_a(p_40022_1_, p_40022_2_, p_40022_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b + p_40022_5_, field_35024_g.field_35752_c + p_40022_4_, field_35025_h, func_35012_c(), p_40022_6_);
        }
        return null;
    }

    protected StructureComponent func_40019_b(ComponentNetherBridgeStartPiece p_40019_1_, List p_40019_2_, Random p_40019_3_, int p_40019_4_, int p_40019_5_, boolean p_40019_6_)
    {
        switch(field_35025_h)
        {
        case 2: // '\002'
            return func_40018_a(p_40019_1_, p_40019_2_, p_40019_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b + p_40019_4_, field_35024_g.field_35752_c + p_40019_5_, 1, func_35012_c(), p_40019_6_);

        case 0: // '\0'
            return func_40018_a(p_40019_1_, p_40019_2_, p_40019_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b + p_40019_4_, field_35024_g.field_35752_c + p_40019_5_, 1, func_35012_c(), p_40019_6_);

        case 1: // '\001'
            return func_40018_a(p_40019_1_, p_40019_2_, p_40019_3_, field_35024_g.field_35753_a + p_40019_5_, field_35024_g.field_35751_b + p_40019_4_, field_35024_g.field_35752_c - 1, 2, func_35012_c(), p_40019_6_);

        case 3: // '\003'
            return func_40018_a(p_40019_1_, p_40019_2_, p_40019_3_, field_35024_g.field_35753_a + p_40019_5_, field_35024_g.field_35751_b + p_40019_4_, field_35024_g.field_35752_c - 1, 2, func_35012_c(), p_40019_6_);
        }
        return null;
    }

    protected StructureComponent func_40016_c(ComponentNetherBridgeStartPiece p_40016_1_, List p_40016_2_, Random p_40016_3_, int p_40016_4_, int p_40016_5_, boolean p_40016_6_)
    {
        switch(field_35025_h)
        {
        case 2: // '\002'
            return func_40018_a(p_40016_1_, p_40016_2_, p_40016_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b + p_40016_4_, field_35024_g.field_35752_c + p_40016_5_, 3, func_35012_c(), p_40016_6_);

        case 0: // '\0'
            return func_40018_a(p_40016_1_, p_40016_2_, p_40016_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b + p_40016_4_, field_35024_g.field_35752_c + p_40016_5_, 3, func_35012_c(), p_40016_6_);

        case 1: // '\001'
            return func_40018_a(p_40016_1_, p_40016_2_, p_40016_3_, field_35024_g.field_35753_a + p_40016_5_, field_35024_g.field_35751_b + p_40016_4_, field_35024_g.field_35748_f + 1, 0, func_35012_c(), p_40016_6_);

        case 3: // '\003'
            return func_40018_a(p_40016_1_, p_40016_2_, p_40016_3_, field_35024_g.field_35753_a + p_40016_5_, field_35024_g.field_35751_b + p_40016_4_, field_35024_g.field_35748_f + 1, 0, func_35012_c(), p_40016_6_);
        }
        return null;
    }

    protected static boolean func_40021_a(StructureBoundingBox p_40021_0_)
    {
        return p_40021_0_ != null && p_40021_0_.field_35751_b > 10;
    }
}
