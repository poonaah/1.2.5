// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package net.minecraft.src:
//            NBTTagCompound, World, Block, TileEntityFurnace, 
//            TileEntityChest, TileEntityRecordPlayer, TileEntityDispenser, TileEntitySign, 
//            TileEntityMobSpawner, TileEntityNote, TileEntityPiston, TileEntityBrewingStand, 
//            TileEntityEnchantmentTable, TileEntityEndPortal

public class TileEntity
{

    private static Map field_820_a = new HashMap();
    private static Map field_819_b = new HashMap();
    public World field_824_e;
    public int field_823_f;
    public int field_822_g;
    public int field_821_h;
    protected boolean field_31007_h;
    public int field_35145_n;
    public Block field_35146_o;

    public TileEntity()
    {
        field_35145_n = -1;
    }

    private static void func_476_a(Class p_476_0_, String p_476_1_)
    {
        if(field_819_b.containsKey(p_476_1_))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate id: ").append(p_476_1_).toString());
        } else
        {
            field_820_a.put(p_476_1_, p_476_0_);
            field_819_b.put(p_476_0_, p_476_1_);
            return;
        }
    }

    public void func_482_a(NBTTagCompound p_482_1_)
    {
        field_823_f = p_482_1_.func_756_e("x");
        field_822_g = p_482_1_.func_756_e("y");
        field_821_h = p_482_1_.func_756_e("z");
    }

    public void func_481_b(NBTTagCompound p_481_1_)
    {
        String s = (String)field_819_b.get(getClass());
        if(s == null)
        {
            throw new RuntimeException((new StringBuilder()).append(getClass()).append(" is missing a mapping! This is a bug!").toString());
        } else
        {
            p_481_1_.func_754_a("id", s);
            p_481_1_.func_758_a("x", field_823_f);
            p_481_1_.func_758_a("y", field_822_g);
            p_481_1_.func_758_a("z", field_821_h);
            return;
        }
    }

    public void func_475_b()
    {
    }

    public static TileEntity func_477_c(NBTTagCompound p_477_0_)
    {
        TileEntity tileentity = null;
        try
        {
            Class class1 = (Class)field_820_a.get(p_477_0_.func_755_i("id"));
            if(class1 != null)
            {
                tileentity = (TileEntity)class1.newInstance();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        if(tileentity != null)
        {
            tileentity.func_482_a(p_477_0_);
        } else
        {
            System.out.println((new StringBuilder()).append("Skipping TileEntity with id ").append(p_477_0_.func_755_i("id")).toString());
        }
        return tileentity;
    }

    public int func_479_f()
    {
        if(field_35145_n == -1)
        {
            field_35145_n = field_824_e.func_602_e(field_823_f, field_822_g, field_821_h);
        }
        return field_35145_n;
    }

    public void func_474_j_()
    {
        if(field_824_e != null)
        {
            field_35145_n = field_824_e.func_602_e(field_823_f, field_822_g, field_821_h);
            field_824_e.func_698_b(field_823_f, field_822_g, field_821_h, this);
        }
    }

    public double func_480_a(double p_480_1_, double p_480_3_, double p_480_5_)
    {
        double d = ((double)field_823_f + 0.5D) - p_480_1_;
        double d1 = ((double)field_822_g + 0.5D) - p_480_3_;
        double d2 = ((double)field_821_h + 0.5D) - p_480_5_;
        return d * d + d1 * d1 + d2 * d2;
    }

    public Block func_478_g()
    {
        if(field_35146_o == null)
        {
            field_35146_o = Block.field_345_n[field_824_e.func_600_a(field_823_f, field_822_g, field_821_h)];
        }
        return field_35146_o;
    }

    public boolean func_31006_g()
    {
        return field_31007_h;
    }

    public void func_31005_i()
    {
        field_31007_h = true;
    }

    public void func_31004_j()
    {
        field_31007_h = false;
    }

    public void func_35143_b(int i, int j)
    {
    }

    public void func_35144_b()
    {
        field_35146_o = null;
        field_35145_n = -1;
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static 
    {
        func_476_a(net.minecraft.src.TileEntityFurnace.class, "Furnace");
        func_476_a(net.minecraft.src.TileEntityChest.class, "Chest");
        func_476_a(net.minecraft.src.TileEntityRecordPlayer.class, "RecordPlayer");
        func_476_a(net.minecraft.src.TileEntityDispenser.class, "Trap");
        func_476_a(net.minecraft.src.TileEntitySign.class, "Sign");
        func_476_a(net.minecraft.src.TileEntityMobSpawner.class, "MobSpawner");
        func_476_a(net.minecraft.src.TileEntityNote.class, "Music");
        func_476_a(net.minecraft.src.TileEntityPiston.class, "Piston");
        func_476_a(net.minecraft.src.TileEntityBrewingStand.class, "Cauldron");
        func_476_a(net.minecraft.src.TileEntityEnchantmentTable.class, "EnchantTable");
        func_476_a(net.minecraft.src.TileEntityEndPortal.class, "Airportal");
    }
}
