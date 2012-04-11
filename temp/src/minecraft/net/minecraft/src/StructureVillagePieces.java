// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureVillagePieceWeight, ComponentVillageHouse4_Garden, MathHelper, ComponentVillageChurch, 
//            ComponentVillageHouse1, ComponentVillageWoodHut, ComponentVillageHall, ComponentVillageField, 
//            ComponentVillageField2, ComponentVillageHouse2, ComponentVillageHouse3, ComponentVillageStartPiece, 
//            ComponentVillageTorch, StructureBoundingBox, StructureComponent, MapGenVillage, 
//            WorldChunkManager, ComponentVillagePathGen, ComponentVillage

public class StructureVillagePieces
{

    public StructureVillagePieces()
    {
    }

    public static ArrayList func_35705_a(Random p_35705_0_, int p_35705_1_)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageHouse4_Garden.class, 4, MathHelper.func_35598_a(p_35705_0_, 2 + p_35705_1_, 4 + p_35705_1_ * 2)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageChurch.class, 20, MathHelper.func_35598_a(p_35705_0_, 0 + p_35705_1_, 1 + p_35705_1_)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageHouse1.class, 20, MathHelper.func_35598_a(p_35705_0_, 0 + p_35705_1_, 2 + p_35705_1_)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageWoodHut.class, 3, MathHelper.func_35598_a(p_35705_0_, 2 + p_35705_1_, 5 + p_35705_1_ * 3)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageHall.class, 15, MathHelper.func_35598_a(p_35705_0_, 0 + p_35705_1_, 2 + p_35705_1_)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageField.class, 3, MathHelper.func_35598_a(p_35705_0_, 1 + p_35705_1_, 4 + p_35705_1_)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageField2.class, 3, MathHelper.func_35598_a(p_35705_0_, 2 + p_35705_1_, 4 + p_35705_1_ * 2)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageHouse2.class, 15, MathHelper.func_35598_a(p_35705_0_, 0, 1 + p_35705_1_)));
        arraylist.add(new StructureVillagePieceWeight(net.minecraft.src.ComponentVillageHouse3.class, 8, MathHelper.func_35598_a(p_35705_0_, 0 + p_35705_1_, 3 + p_35705_1_ * 2)));
        Iterator iterator = arraylist.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            if(((StructureVillagePieceWeight)iterator.next()).field_35604_d == 0)
            {
                iterator.remove();
            }
        } while(true);
        return arraylist;
    }

    private static int func_35703_a(ArrayList p_35703_0_)
    {
        boolean flag = false;
        int i = 0;
        for(Iterator iterator = p_35703_0_.iterator(); iterator.hasNext();)
        {
            StructureVillagePieceWeight structurevillagepieceweight = (StructureVillagePieceWeight)iterator.next();
            if(structurevillagepieceweight.field_35604_d > 0 && structurevillagepieceweight.field_35606_c < structurevillagepieceweight.field_35604_d)
            {
                flag = true;
            }
            i += structurevillagepieceweight.field_35605_b;
        }

        return flag ? i : -1;
    }

    private static ComponentVillage func_35699_a(StructureVillagePieceWeight p_35699_0_, List p_35699_1_, Random p_35699_2_, int p_35699_3_, int p_35699_4_, int p_35699_5_, int p_35699_6_, int p_35699_7_)
    {
        Class class1 = p_35699_0_.field_35607_a;
        Object obj = null;
        if(class1 == (net.minecraft.src.ComponentVillageHouse4_Garden.class))
        {
            obj = ComponentVillageHouse4_Garden.func_35082_a(p_35699_1_, p_35699_2_, p_35699_3_, p_35699_4_, p_35699_5_, p_35699_6_, p_35699_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageChurch.class))
        {
            obj = ComponentVillageChurch.func_35097_a(p_35699_1_, p_35699_2_, p_35699_3_, p_35699_4_, p_35699_5_, p_35699_6_, p_35699_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageHouse1.class))
        {
            obj = ComponentVillageHouse1.func_35095_a(p_35699_1_, p_35699_2_, p_35699_3_, p_35699_4_, p_35699_5_, p_35699_6_, p_35699_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageWoodHut.class))
        {
            obj = ComponentVillageWoodHut.func_35091_a(p_35699_1_, p_35699_2_, p_35699_3_, p_35699_4_, p_35699_5_, p_35699_6_, p_35699_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageHall.class))
        {
            obj = ComponentVillageHall.func_35078_a(p_35699_1_, p_35699_2_, p_35699_3_, p_35699_4_, p_35699_5_, p_35699_6_, p_35699_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageField.class))
        {
            obj = ComponentVillageField.func_35080_a(p_35699_1_, p_35699_2_, p_35699_3_, p_35699_4_, p_35699_5_, p_35699_6_, p_35699_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageField2.class))
        {
            obj = ComponentVillageField2.func_35089_a(p_35699_1_, p_35699_2_, p_35699_3_, p_35699_4_, p_35699_5_, p_35699_6_, p_35699_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageHouse2.class))
        {
            obj = ComponentVillageHouse2.func_35085_a(p_35699_1_, p_35699_2_, p_35699_3_, p_35699_4_, p_35699_5_, p_35699_6_, p_35699_7_);
        } else
        if(class1 == (net.minecraft.src.ComponentVillageHouse3.class))
        {
            obj = ComponentVillageHouse3.func_35101_a(p_35699_1_, p_35699_2_, p_35699_3_, p_35699_4_, p_35699_5_, p_35699_6_, p_35699_7_);
        }
        return ((ComponentVillage) (obj));
    }

    private static ComponentVillage func_35700_c(ComponentVillageStartPiece p_35700_0_, List p_35700_1_, Random p_35700_2_, int p_35700_3_, int p_35700_4_, int p_35700_5_, int p_35700_6_, int p_35700_7_)
    {
        int i;
        int j;
        i = func_35703_a(p_35700_0_.field_35107_d);
        if(i <= 0)
        {
            return null;
        }
        j = 0;
_L2:
        int k;
        Iterator iterator;
        if(j >= 5)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        j++;
        k = p_35700_2_.nextInt(i);
        iterator = p_35700_0_.field_35107_d.iterator();
_L4:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        StructureVillagePieceWeight structurevillagepieceweight;
        structurevillagepieceweight = (StructureVillagePieceWeight)iterator.next();
        k -= structurevillagepieceweight.field_35605_b;
        if(k >= 0) goto _L4; else goto _L3
_L3:
        if(structurevillagepieceweight.func_35602_a(p_35700_7_) && (structurevillagepieceweight != p_35700_0_.field_35110_c || p_35700_0_.field_35107_d.size() <= 1)) goto _L5; else goto _L2
_L5:
        ComponentVillage componentvillage = func_35699_a(structurevillagepieceweight, p_35700_1_, p_35700_2_, p_35700_3_, p_35700_4_, p_35700_5_, p_35700_6_, p_35700_7_);
        if(componentvillage == null) goto _L4; else goto _L6
_L6:
        structurevillagepieceweight.field_35606_c++;
        p_35700_0_.field_35110_c = structurevillagepieceweight;
        if(!structurevillagepieceweight.func_35603_a())
        {
            p_35700_0_.field_35107_d.remove(structurevillagepieceweight);
        }
        return componentvillage;
        StructureBoundingBox structureboundingbox = ComponentVillageTorch.func_35099_a(p_35700_1_, p_35700_2_, p_35700_3_, p_35700_4_, p_35700_5_, p_35700_6_);
        if(structureboundingbox != null)
        {
            return new ComponentVillageTorch(p_35700_7_, p_35700_2_, structureboundingbox, p_35700_6_);
        } else
        {
            return null;
        }
    }

    private static StructureComponent func_35702_d(ComponentVillageStartPiece p_35702_0_, List p_35702_1_, Random p_35702_2_, int p_35702_3_, int p_35702_4_, int p_35702_5_, int p_35702_6_, int p_35702_7_)
    {
        if(p_35702_7_ > 50)
        {
            return null;
        }
        if(Math.abs(p_35702_3_ - p_35702_0_.func_35021_b().field_35753_a) > 112 || Math.abs(p_35702_5_ - p_35702_0_.func_35021_b().field_35752_c) > 112)
        {
            return null;
        }
        ComponentVillage componentvillage = func_35700_c(p_35702_0_, p_35702_1_, p_35702_2_, p_35702_3_, p_35702_4_, p_35702_5_, p_35702_6_, p_35702_7_ + 1);
        if(componentvillage != null)
        {
            int i = (((StructureComponent) (componentvillage)).field_35024_g.field_35753_a + ((StructureComponent) (componentvillage)).field_35024_g.field_35749_d) / 2;
            int j = (((StructureComponent) (componentvillage)).field_35024_g.field_35752_c + ((StructureComponent) (componentvillage)).field_35024_g.field_35748_f) / 2;
            int k = ((StructureComponent) (componentvillage)).field_35024_g.field_35749_d - ((StructureComponent) (componentvillage)).field_35024_g.field_35753_a;
            int l = ((StructureComponent) (componentvillage)).field_35024_g.field_35748_f - ((StructureComponent) (componentvillage)).field_35024_g.field_35752_c;
            int i1 = k <= l ? l : k;
            if(p_35702_0_.func_35105_a().func_35562_a(i, j, i1 / 2 + 4, MapGenVillage.field_35635_a))
            {
                p_35702_1_.add(componentvillage);
                p_35702_0_.field_35108_e.add(componentvillage);
                return componentvillage;
            }
        }
        return null;
    }

    private static StructureComponent func_35698_e(ComponentVillageStartPiece p_35698_0_, List p_35698_1_, Random p_35698_2_, int p_35698_3_, int p_35698_4_, int p_35698_5_, int p_35698_6_, int p_35698_7_)
    {
        if(p_35698_7_ > 3 + p_35698_0_.field_35109_b)
        {
            return null;
        }
        if(Math.abs(p_35698_3_ - p_35698_0_.func_35021_b().field_35753_a) > 112 || Math.abs(p_35698_5_ - p_35698_0_.func_35021_b().field_35752_c) > 112)
        {
            return null;
        }
        StructureBoundingBox structureboundingbox = ComponentVillagePathGen.func_35087_a(p_35698_0_, p_35698_1_, p_35698_2_, p_35698_3_, p_35698_4_, p_35698_5_, p_35698_6_);
        if(structureboundingbox != null && structureboundingbox.field_35751_b > 10)
        {
            ComponentVillagePathGen componentvillagepathgen = new ComponentVillagePathGen(p_35698_7_, p_35698_2_, structureboundingbox, p_35698_6_);
            int i = (((StructureComponent) (componentvillagepathgen)).field_35024_g.field_35753_a + ((StructureComponent) (componentvillagepathgen)).field_35024_g.field_35749_d) / 2;
            int j = (((StructureComponent) (componentvillagepathgen)).field_35024_g.field_35752_c + ((StructureComponent) (componentvillagepathgen)).field_35024_g.field_35748_f) / 2;
            int k = ((StructureComponent) (componentvillagepathgen)).field_35024_g.field_35749_d - ((StructureComponent) (componentvillagepathgen)).field_35024_g.field_35753_a;
            int l = ((StructureComponent) (componentvillagepathgen)).field_35024_g.field_35748_f - ((StructureComponent) (componentvillagepathgen)).field_35024_g.field_35752_c;
            int i1 = k <= l ? l : k;
            if(p_35698_0_.func_35105_a().func_35562_a(i, j, i1 / 2 + 4, MapGenVillage.field_35635_a))
            {
                p_35698_1_.add(componentvillagepathgen);
                p_35698_0_.field_35106_f.add(componentvillagepathgen);
                return componentvillagepathgen;
            }
        }
        return null;
    }

    static StructureComponent func_35704_a(ComponentVillageStartPiece p_35704_0_, List p_35704_1_, Random p_35704_2_, int p_35704_3_, int p_35704_4_, int p_35704_5_, int p_35704_6_, int p_35704_7_)
    {
        return func_35702_d(p_35704_0_, p_35704_1_, p_35704_2_, p_35704_3_, p_35704_4_, p_35704_5_, p_35704_6_, p_35704_7_);
    }

    static StructureComponent func_35701_b(ComponentVillageStartPiece p_35701_0_, List p_35701_1_, Random p_35701_2_, int p_35701_3_, int p_35701_4_, int p_35701_5_, int p_35701_6_, int p_35701_7_)
    {
        return func_35698_e(p_35701_0_, p_35701_1_, p_35701_2_, p_35701_3_, p_35701_4_, p_35701_5_, p_35701_6_, p_35701_7_);
    }
}
