// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet51MapChunk extends Packet
{

    public int field_48177_a;
    public int field_48175_b;
    public int field_48176_c;
    public int field_48173_d;
    public byte field_48174_e[];
    public boolean field_48171_f;
    private int field_48172_g;
    private int field_48178_h;
    private static byte field_48179_i[] = new byte[0];

    public Packet51MapChunk()
    {
        field_472_j = true;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_48177_a = p_327_1_.readInt();
        field_48175_b = p_327_1_.readInt();
        field_48171_f = p_327_1_.readBoolean();
        field_48176_c = p_327_1_.readShort();
        field_48173_d = p_327_1_.readShort();
        field_48172_g = p_327_1_.readInt();
        field_48178_h = p_327_1_.readInt();
        if(field_48179_i.length < field_48172_g)
        {
            field_48179_i = new byte[field_48172_g];
        }
        p_327_1_.readFully(field_48179_i, 0, field_48172_g);
        int i = 0;
        for(int j = 0; j < 16; j++)
        {
            i += field_48176_c >> j & 1;
        }

        int k = 12288 * i;
        if(field_48171_f)
        {
            k += 256;
        }
        field_48174_e = new byte[k];
        Inflater inflater = new Inflater();
        inflater.setInput(field_48179_i, 0, field_48172_g);
        try
        {
            inflater.inflate(field_48174_e);
        }
        catch(DataFormatException dataformatexception)
        {
            throw new IOException("Bad compressed data format");
        }
        finally
        {
            inflater.end();
        }
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_48177_a);
        p_322_1_.writeInt(field_48175_b);
        p_322_1_.writeBoolean(field_48171_f);
        p_322_1_.writeShort((short)(field_48176_c & 0xffff));
        p_322_1_.writeShort((short)(field_48173_d & 0xffff));
        p_322_1_.writeInt(field_48172_g);
        p_322_1_.writeInt(field_48178_h);
        p_322_1_.write(field_48174_e, 0, field_48172_g);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_48487_a(this);
    }

    public int func_329_a()
    {
        return 17 + field_48172_g;
    }

}
