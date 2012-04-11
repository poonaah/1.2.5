// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureStart, StructureVillagePieces, ComponentVillageStartPiece, World, 
//            StructureComponent, ComponentVillageRoadPiece

class StructureVillageStart extends StructureStart
{

    private boolean field_35718_c;

    public StructureVillageStart(World p_i690_1_, Random p_i690_2_, int p_i690_3_, int p_i690_4_, int p_i690_5_)
    {
        field_35718_c = false;
        int i = p_i690_5_;
        ArrayList arraylist = StructureVillagePieces.func_35705_a(p_i690_2_, i);
        ComponentVillageStartPiece componentvillagestartpiece = new ComponentVillageStartPiece(p_i690_1_.func_4075_a(), 0, p_i690_2_, (p_i690_3_ << 4) + 2, (p_i690_4_ << 4) + 2, arraylist, i);
        field_35717_a.add(componentvillagestartpiece);
        componentvillagestartpiece.func_35004_a(componentvillagestartpiece, field_35717_a, p_i690_2_);
        ArrayList arraylist1 = componentvillagestartpiece.field_35106_f;
        for(ArrayList arraylist2 = componentvillagestartpiece.field_35108_e; !arraylist1.isEmpty() || !arraylist2.isEmpty();)
        {
            if(!arraylist1.isEmpty())
            {
                int j = p_i690_2_.nextInt(arraylist1.size());
                StructureComponent structurecomponent = (StructureComponent)arraylist1.remove(j);
                structurecomponent.func_35004_a(componentvillagestartpiece, field_35717_a, p_i690_2_);
            } else
            {
                int k = p_i690_2_.nextInt(arraylist2.size());
                StructureComponent structurecomponent1 = (StructureComponent)arraylist2.remove(k);
                structurecomponent1.func_35004_a(componentvillagestartpiece, field_35717_a, p_i690_2_);
            }
        }

        func_35714_b();
        int l = 0;
        Iterator iterator = field_35717_a.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            StructureComponent structurecomponent2 = (StructureComponent)iterator.next();
            if(!(structurecomponent2 instanceof ComponentVillageRoadPiece))
            {
                l++;
            }
        } while(true);
        field_35718_c = l > 2;
    }

    public boolean func_35715_c()
    {
        return field_35718_c;
    }
}
