// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureStrongholdPieceWeight, ComponentStrongholdStraight, ComponentStrongholdPrison, ComponentStrongholdLeftTurn, 
//            ComponentStrongholdRightTurn, ComponentStrongholdRoomCrossing, ComponentStrongholdStairsStraight, ComponentStrongholdStairs, 
//            ComponentStrongholdCrossing, ComponentStrongholdChestCorridor, ComponentStrongholdLibrary, ComponentStrongholdPortalRoom, 
//            ComponentStrongholdStairs2, ComponentStrongholdCorridor, StructureBoundingBox, StructureStrongholdPieceWeight2, 
//            StructureStrongholdPieceWeight3, StructureStrongholdStones, ComponentStronghold, StructureComponent

public class StructureStrongholdPieces
{

    private static final StructureStrongholdPieceWeight field_35855_b[];
    private static List field_35856_c;
    private static Class field_40752_d;
    static int field_35857_a = 0;
    private static final StructureStrongholdStones field_35854_d = new StructureStrongholdStones(null);

    public StructureStrongholdPieces()
    {
    }

    public static void func_35849_a()
    {
        field_35856_c = new ArrayList();
        StructureStrongholdPieceWeight astructurestrongholdpieceweight[] = field_35855_b;
        int i = astructurestrongholdpieceweight.length;
        for(int j = 0; j < i; j++)
        {
            StructureStrongholdPieceWeight structurestrongholdpieceweight = astructurestrongholdpieceweight[j];
            structurestrongholdpieceweight.field_35617_c = 0;
            field_35856_c.add(structurestrongholdpieceweight);
        }

        field_40752_d = null;
    }

    private static boolean func_35853_c()
    {
        boolean flag = false;
        field_35857_a = 0;
        for(Iterator iterator = field_35856_c.iterator(); iterator.hasNext();)
        {
            StructureStrongholdPieceWeight structurestrongholdpieceweight = (StructureStrongholdPieceWeight)iterator.next();
            if(structurestrongholdpieceweight.field_35615_d > 0 && structurestrongholdpieceweight.field_35617_c < structurestrongholdpieceweight.field_35615_d)
            {
                flag = true;
            }
            field_35857_a += structurestrongholdpieceweight.field_35616_b;
        }

        return flag;
    }

    private static ComponentStronghold func_35851_a(Class p_35851_0_, List p_35851_1_, Random p_35851_2_, int p_35851_3_, int p_35851_4_, int p_35851_5_, int p_35851_6_, int p_35851_7_)
    {
        Object obj = null;
        if(p_35851_0_ == (net.minecraft.src.ComponentStrongholdStraight.class))
        {
            obj = ComponentStrongholdStraight.func_35047_a(p_35851_1_, p_35851_2_, p_35851_3_, p_35851_4_, p_35851_5_, p_35851_6_, p_35851_7_);
        } else
        if(p_35851_0_ == (net.minecraft.src.ComponentStrongholdPrison.class))
        {
            obj = ComponentStrongholdPrison.func_35063_a(p_35851_1_, p_35851_2_, p_35851_3_, p_35851_4_, p_35851_5_, p_35851_6_, p_35851_7_);
        } else
        if(p_35851_0_ == (net.minecraft.src.ComponentStrongholdLeftTurn.class))
        {
            obj = ComponentStrongholdLeftTurn.func_35045_a(p_35851_1_, p_35851_2_, p_35851_3_, p_35851_4_, p_35851_5_, p_35851_6_, p_35851_7_);
        } else
        if(p_35851_0_ == (net.minecraft.src.ComponentStrongholdRightTurn.class))
        {
            obj = ComponentStrongholdRightTurn.func_35045_a(p_35851_1_, p_35851_2_, p_35851_3_, p_35851_4_, p_35851_5_, p_35851_6_, p_35851_7_);
        } else
        if(p_35851_0_ == (net.minecraft.src.ComponentStrongholdRoomCrossing.class))
        {
            obj = ComponentStrongholdRoomCrossing.func_35059_a(p_35851_1_, p_35851_2_, p_35851_3_, p_35851_4_, p_35851_5_, p_35851_6_, p_35851_7_);
        } else
        if(p_35851_0_ == (net.minecraft.src.ComponentStrongholdStairsStraight.class))
        {
            obj = ComponentStrongholdStairsStraight.func_35053_a(p_35851_1_, p_35851_2_, p_35851_3_, p_35851_4_, p_35851_5_, p_35851_6_, p_35851_7_);
        } else
        if(p_35851_0_ == (net.minecraft.src.ComponentStrongholdStairs.class))
        {
            obj = ComponentStrongholdStairs.func_35034_a(p_35851_1_, p_35851_2_, p_35851_3_, p_35851_4_, p_35851_5_, p_35851_6_, p_35851_7_);
        } else
        if(p_35851_0_ == (net.minecraft.src.ComponentStrongholdCrossing.class))
        {
            obj = ComponentStrongholdCrossing.func_35039_a(p_35851_1_, p_35851_2_, p_35851_3_, p_35851_4_, p_35851_5_, p_35851_6_, p_35851_7_);
        } else
        if(p_35851_0_ == (net.minecraft.src.ComponentStrongholdChestCorridor.class))
        {
            obj = ComponentStrongholdChestCorridor.func_40010_a(p_35851_1_, p_35851_2_, p_35851_3_, p_35851_4_, p_35851_5_, p_35851_6_, p_35851_7_);
        } else
        if(p_35851_0_ == (net.minecraft.src.ComponentStrongholdLibrary.class))
        {
            obj = ComponentStrongholdLibrary.func_35055_a(p_35851_1_, p_35851_2_, p_35851_3_, p_35851_4_, p_35851_5_, p_35851_6_, p_35851_7_);
        } else
        if(p_35851_0_ == (net.minecraft.src.ComponentStrongholdPortalRoom.class))
        {
            obj = ComponentStrongholdPortalRoom.func_40014_a(p_35851_1_, p_35851_2_, p_35851_3_, p_35851_4_, p_35851_5_, p_35851_6_, p_35851_7_);
        }
        return ((ComponentStronghold) (obj));
    }

    private static ComponentStronghold func_35847_b(ComponentStrongholdStairs2 p_35847_0_, List p_35847_1_, Random p_35847_2_, int p_35847_3_, int p_35847_4_, int p_35847_5_, int p_35847_6_, int p_35847_7_)
    {
        int i;
        if(!func_35853_c())
        {
            return null;
        }
        if(field_40752_d != null)
        {
            ComponentStronghold componentstronghold = func_35851_a(field_40752_d, p_35847_1_, p_35847_2_, p_35847_3_, p_35847_4_, p_35847_5_, p_35847_6_, p_35847_7_);
            field_40752_d = null;
            if(componentstronghold != null)
            {
                return componentstronghold;
            }
        }
        i = 0;
_L2:
        int j;
        Iterator iterator;
        if(i >= 5)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        i++;
        j = p_35847_2_.nextInt(field_35857_a);
        iterator = field_35856_c.iterator();
_L4:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        StructureStrongholdPieceWeight structurestrongholdpieceweight;
        structurestrongholdpieceweight = (StructureStrongholdPieceWeight)iterator.next();
        j -= structurestrongholdpieceweight.field_35616_b;
        if(j >= 0) goto _L4; else goto _L3
_L3:
        if(structurestrongholdpieceweight.func_35613_a(p_35847_7_) && structurestrongholdpieceweight != p_35847_0_.field_35038_a) goto _L5; else goto _L2
_L5:
        ComponentStronghold componentstronghold1 = func_35851_a(structurestrongholdpieceweight.field_35618_a, p_35847_1_, p_35847_2_, p_35847_3_, p_35847_4_, p_35847_5_, p_35847_6_, p_35847_7_);
        if(componentstronghold1 == null) goto _L4; else goto _L6
_L6:
        structurestrongholdpieceweight.field_35617_c++;
        p_35847_0_.field_35038_a = structurestrongholdpieceweight;
        if(!structurestrongholdpieceweight.func_35614_a())
        {
            field_35856_c.remove(structurestrongholdpieceweight);
        }
        return componentstronghold1;
        StructureBoundingBox structureboundingbox = ComponentStrongholdCorridor.func_35051_a(p_35847_1_, p_35847_2_, p_35847_3_, p_35847_4_, p_35847_5_, p_35847_6_);
        if(structureboundingbox != null && structureboundingbox.field_35751_b > 1)
        {
            return new ComponentStrongholdCorridor(p_35847_7_, p_35847_2_, structureboundingbox, p_35847_6_);
        } else
        {
            return null;
        }
    }

    private static StructureComponent func_35848_c(ComponentStrongholdStairs2 p_35848_0_, List p_35848_1_, Random p_35848_2_, int p_35848_3_, int p_35848_4_, int p_35848_5_, int p_35848_6_, int p_35848_7_)
    {
        if(p_35848_7_ > 50)
        {
            return null;
        }
        if(Math.abs(p_35848_3_ - p_35848_0_.func_35021_b().field_35753_a) > 112 || Math.abs(p_35848_5_ - p_35848_0_.func_35021_b().field_35752_c) > 112)
        {
            return null;
        }
        ComponentStronghold componentstronghold = func_35847_b(p_35848_0_, p_35848_1_, p_35848_2_, p_35848_3_, p_35848_4_, p_35848_5_, p_35848_6_, p_35848_7_ + 1);
        if(componentstronghold != null)
        {
            p_35848_1_.add(componentstronghold);
            p_35848_0_.field_35037_b.add(componentstronghold);
        }
        return componentstronghold;
    }

    static StructureComponent func_35850_a(ComponentStrongholdStairs2 p_35850_0_, List p_35850_1_, Random p_35850_2_, int p_35850_3_, int p_35850_4_, int p_35850_5_, int p_35850_6_, int p_35850_7_)
    {
        return func_35848_c(p_35850_0_, p_35850_1_, p_35850_2_, p_35850_3_, p_35850_4_, p_35850_5_, p_35850_6_, p_35850_7_);
    }

    static Class func_40751_a(Class p_40751_0_)
    {
        return field_40752_d = p_40751_0_;
    }

    static StructureStrongholdStones func_35852_b()
    {
        return field_35854_d;
    }

    static 
    {
        field_35855_b = (new StructureStrongholdPieceWeight[] {
            new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdStraight.class, 40, 0), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdPrison.class, 5, 5), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdLeftTurn.class, 20, 0), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdRightTurn.class, 20, 0), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdRoomCrossing.class, 10, 6), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdStairsStraight.class, 5, 5), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdStairs.class, 5, 5), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdCrossing.class, 5, 4), new StructureStrongholdPieceWeight(net.minecraft.src.ComponentStrongholdChestCorridor.class, 5, 4), new StructureStrongholdPieceWeight2(net.minecraft.src.ComponentStrongholdLibrary.class, 10, 2), 
            new StructureStrongholdPieceWeight3(net.minecraft.src.ComponentStrongholdPortalRoom.class, 20, 1)
        });
    }
}
