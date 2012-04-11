// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureNetherBridgePieceWeight, ComponentNetherBridgeStraight, ComponentNetherBridgeCrossing3, ComponentNetherBridgeCrossing, 
//            ComponentNetherBridgeStairs, ComponentNetherBridgeThrone, ComponentNetherBridgeEntrance, ComponentNetherBridgeCorridor5, 
//            ComponentNetherBridgeCorridor2, ComponentNetherBridgeCorridor, ComponentNetherBridgeCorridor3, ComponentNetherBridgeCorridor4, 
//            ComponentNetherBridgeCrossing2, ComponentNetherBridgeNetherStalkRoom, ComponentNetherBridgePiece

public class StructureNetherBridgePieces
{

    private static final StructureNetherBridgePieceWeight field_40692_a[];
    private static final StructureNetherBridgePieceWeight field_40691_b[];

    public StructureNetherBridgePieces()
    {
    }

    private static ComponentNetherBridgePiece func_40690_b(StructureNetherBridgePieceWeight p_40690_0_, List p_40690_1_, Random p_40690_2_, int p_40690_3_, int p_40690_4_, int p_40690_5_, int p_40690_6_, int p_40690_7_)
    {
        Class class1 = p_40690_0_.field_40699_a;
        Object obj = null;
        if(class1 == (net.minecraft.src.ComponentNetherBridgeStraight.class))
        {
            obj = ComponentNetherBridgeStraight.func_40029_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentNetherBridgeCrossing3.class))
        {
            obj = ComponentNetherBridgeCrossing3.func_40033_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentNetherBridgeCrossing.class))
        {
            obj = ComponentNetherBridgeCrossing.func_40028_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentNetherBridgeStairs.class))
        {
            obj = ComponentNetherBridgeStairs.func_40031_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentNetherBridgeThrone.class))
        {
            obj = ComponentNetherBridgeThrone.func_40026_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentNetherBridgeEntrance.class))
        {
            obj = ComponentNetherBridgeEntrance.func_40030_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentNetherBridgeCorridor5.class))
        {
            obj = ComponentNetherBridgeCorridor5.func_40032_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentNetherBridgeCorridor2.class))
        {
            obj = ComponentNetherBridgeCorridor2.func_40041_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentNetherBridgeCorridor.class))
        {
            obj = ComponentNetherBridgeCorridor.func_40038_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentNetherBridgeCorridor3.class))
        {
            obj = ComponentNetherBridgeCorridor3.func_40042_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentNetherBridgeCorridor4.class))
        {
            obj = ComponentNetherBridgeCorridor4.func_40039_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentNetherBridgeCrossing2.class))
        {
            obj = ComponentNetherBridgeCrossing2.func_40025_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentNetherBridgeNetherStalkRoom.class))
        {
            obj = ComponentNetherBridgeNetherStalkRoom.func_40040_a(p_40690_1_, p_40690_2_, p_40690_3_, p_40690_4_, p_40690_5_, p_40690_6_, p_40690_7_);
        }
        return ((ComponentNetherBridgePiece) (obj));
    }

    static ComponentNetherBridgePiece func_40688_a(StructureNetherBridgePieceWeight p_40688_0_, List p_40688_1_, Random p_40688_2_, int p_40688_3_, int p_40688_4_, int p_40688_5_, int p_40688_6_, int p_40688_7_)
    {
        return func_40690_b(p_40688_0_, p_40688_1_, p_40688_2_, p_40688_3_, p_40688_4_, p_40688_5_, p_40688_6_, p_40688_7_);
    }

    static StructureNetherBridgePieceWeight[] func_40689_a()
    {
        return field_40692_a;
    }

    static StructureNetherBridgePieceWeight[] func_40687_b()
    {
        return field_40691_b;
    }

    static 
    {
        field_40692_a = (new StructureNetherBridgePieceWeight[] {
            new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeStraight.class, 30, 0, true), new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeCrossing3.class, 10, 4), new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeCrossing.class, 10, 4), new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeStairs.class, 10, 3), new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeThrone.class, 5, 2), new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeEntrance.class, 5, 1)
        });
        field_40691_b = (new StructureNetherBridgePieceWeight[] {
            new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeCorridor5.class, 25, 0, true), new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeCrossing2.class, 15, 5), new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeCorridor2.class, 5, 10), new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeCorridor.class, 5, 10), new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeCorridor3.class, 10, 3, true), new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeCorridor4.class, 7, 2), new StructureNetherBridgePieceWeight(net.minecraft.src.ComponentNetherBridgeNetherStalkRoom.class, 5, 2)
        });
    }
}
