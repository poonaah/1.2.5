// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Packet, ChunkPosition, NetHandler

public class Packet60Explosion extends Packet
{

    public double field_12236_a;
    public double field_12235_b;
    public double field_12239_c;
    public float field_12238_d;
    public Set field_12237_e;

    public Packet60Explosion()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_12236_a = p_327_1_.readDouble();
        field_12235_b = p_327_1_.readDouble();
        field_12239_c = p_327_1_.readDouble();
        field_12238_d = p_327_1_.readFloat();
        int i = p_327_1_.readInt();
        field_12237_e = new HashSet();
        int j = (int)field_12236_a;
        int k = (int)field_12235_b;
        int l = (int)field_12239_c;
        for(int i1 = 0; i1 < i; i1++)
        {
            int j1 = p_327_1_.readByte() + j;
            int k1 = p_327_1_.readByte() + k;
            int l1 = p_327_1_.readByte() + l;
            field_12237_e.add(new ChunkPosition(j1, k1, l1));
        }

    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeDouble(field_12236_a);
        p_322_1_.writeDouble(field_12235_b);
        p_322_1_.writeDouble(field_12239_c);
        p_322_1_.writeFloat(field_12238_d);
        p_322_1_.writeInt(field_12237_e.size());
        int i = (int)field_12236_a;
        int j = (int)field_12235_b;
        int k = (int)field_12239_c;
        int j1;
        for(Iterator iterator = field_12237_e.iterator(); iterator.hasNext(); p_322_1_.writeByte(j1))
        {
            ChunkPosition chunkposition = (ChunkPosition)iterator.next();
            int l = chunkposition.field_1111_a - i;
            int i1 = chunkposition.field_1110_b - j;
            j1 = chunkposition.field_1112_c - k;
            p_322_1_.writeByte(l);
            p_322_1_.writeByte(i1);
        }

    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_12245_a(this);
    }

    public int func_329_a()
    {
        return 32 + field_12237_e.size() * 3;
    }
}
