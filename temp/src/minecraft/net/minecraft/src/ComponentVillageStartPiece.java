// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillageWell, WorldChunkManager, StructureVillagePieceWeight

public class ComponentVillageStartPiece extends ComponentVillageWell
{

    public WorldChunkManager field_35111_a;
    public int field_35109_b;
    public StructureVillagePieceWeight field_35110_c;
    public ArrayList field_35107_d;
    public ArrayList field_35108_e;
    public ArrayList field_35106_f;

    public ComponentVillageStartPiece(WorldChunkManager p_i342_1_, int p_i342_2_, Random p_i342_3_, int p_i342_4_, int p_i342_5_, ArrayList p_i342_6_, int p_i342_7_)
    {
        super(0, p_i342_3_, p_i342_4_, p_i342_5_);
        field_35108_e = new ArrayList();
        field_35106_f = new ArrayList();
        field_35111_a = p_i342_1_;
        field_35107_d = p_i342_6_;
        field_35109_b = p_i342_7_;
    }

    public WorldChunkManager func_35105_a()
    {
        return field_35111_a;
    }
}
