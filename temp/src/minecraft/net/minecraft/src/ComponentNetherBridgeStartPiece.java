// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgeCrossing3, StructureNetherBridgePieces, StructureNetherBridgePieceWeight

public class ComponentNetherBridgeStartPiece extends ComponentNetherBridgeCrossing3
{

    public StructureNetherBridgePieceWeight field_40037_a;
    public List field_40035_b;
    public List field_40036_c;
    public ArrayList field_40034_d;

    public ComponentNetherBridgeStartPiece(Random p_i96_1_, int p_i96_2_, int p_i96_3_)
    {
        super(p_i96_1_, p_i96_2_, p_i96_3_);
        field_40034_d = new ArrayList();
        field_40035_b = new ArrayList();
        StructureNetherBridgePieceWeight astructurenetherbridgepieceweight[] = StructureNetherBridgePieces.func_40689_a();
        int i = astructurenetherbridgepieceweight.length;
        for(int j = 0; j < i; j++)
        {
            StructureNetherBridgePieceWeight structurenetherbridgepieceweight = astructurenetherbridgepieceweight[j];
            structurenetherbridgepieceweight.field_40698_c = 0;
            field_40035_b.add(structurenetherbridgepieceweight);
        }

        field_40036_c = new ArrayList();
        astructurenetherbridgepieceweight = StructureNetherBridgePieces.func_40687_b();
        i = astructurenetherbridgepieceweight.length;
        for(int k = 0; k < i; k++)
        {
            StructureNetherBridgePieceWeight structurenetherbridgepieceweight1 = astructurenetherbridgepieceweight[k];
            structurenetherbridgepieceweight1.field_40698_c = 0;
            field_40036_c.add(structurenetherbridgepieceweight1);
        }

    }
}
