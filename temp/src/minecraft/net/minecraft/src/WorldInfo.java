// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            WorldType, NBTTagCompound, WorldSettings, EntityPlayer

public class WorldInfo
{

    private long field_22320_a;
    private WorldType field_46134_b;
    private int field_22319_b;
    private int field_22318_c;
    private int field_22317_d;
    private long field_22316_e;
    private long field_22315_f;
    private long field_22314_g;
    private NBTTagCompound field_22313_h;
    private int field_22312_i;
    private String field_22311_j;
    private int field_22310_k;
    private boolean field_27404_l;
    private int field_27403_m;
    private boolean field_27402_n;
    private int field_27401_o;
    private int field_35920_p;
    private boolean field_35919_q;
    private boolean field_40725_r;

    public WorldInfo(NBTTagCompound p_i662_1_)
    {
        field_46134_b = WorldType.field_48635_b;
        field_40725_r = false;
        field_22320_a = p_i662_1_.func_764_f("RandomSeed");
        if(p_i662_1_.func_751_b("generatorName"))
        {
            String s = p_i662_1_.func_755_i("generatorName");
            field_46134_b = WorldType.func_46135_a(s);
            if(field_46134_b == null)
            {
                field_46134_b = WorldType.field_48635_b;
            } else
            if(field_46134_b.func_48626_e())
            {
                int i = 0;
                if(p_i662_1_.func_751_b("generatorVersion"))
                {
                    i = p_i662_1_.func_756_e("generatorVersion");
                }
                field_46134_b = field_46134_b.func_48629_a(i);
            }
        }
        field_35920_p = p_i662_1_.func_756_e("GameType");
        if(p_i662_1_.func_751_b("MapFeatures"))
        {
            field_35919_q = p_i662_1_.func_760_m("MapFeatures");
        } else
        {
            field_35919_q = true;
        }
        field_22319_b = p_i662_1_.func_756_e("SpawnX");
        field_22318_c = p_i662_1_.func_756_e("SpawnY");
        field_22317_d = p_i662_1_.func_756_e("SpawnZ");
        field_22316_e = p_i662_1_.func_764_f("Time");
        field_22315_f = p_i662_1_.func_764_f("LastPlayed");
        field_22314_g = p_i662_1_.func_764_f("SizeOnDisk");
        field_22311_j = p_i662_1_.func_755_i("LevelName");
        field_22310_k = p_i662_1_.func_756_e("version");
        field_27403_m = p_i662_1_.func_756_e("rainTime");
        field_27404_l = p_i662_1_.func_760_m("raining");
        field_27401_o = p_i662_1_.func_756_e("thunderTime");
        field_27402_n = p_i662_1_.func_760_m("thundering");
        field_40725_r = p_i662_1_.func_760_m("hardcore");
        if(p_i662_1_.func_751_b("Player"))
        {
            field_22313_h = p_i662_1_.func_743_k("Player");
            field_22312_i = field_22313_h.func_756_e("Dimension");
        }
    }

    public WorldInfo(WorldSettings p_i663_1_, String p_i663_2_)
    {
        field_46134_b = WorldType.field_48635_b;
        field_40725_r = false;
        field_22320_a = p_i663_1_.func_35518_a();
        field_35920_p = p_i663_1_.func_35519_b();
        field_35919_q = p_i663_1_.func_35520_c();
        field_22311_j = p_i663_2_;
        field_40725_r = p_i663_1_.func_40557_c();
        field_46134_b = p_i663_1_.func_46107_e();
    }

    public WorldInfo(WorldInfo p_i664_1_)
    {
        field_46134_b = WorldType.field_48635_b;
        field_40725_r = false;
        field_22320_a = p_i664_1_.field_22320_a;
        field_46134_b = p_i664_1_.field_46134_b;
        field_35920_p = p_i664_1_.field_35920_p;
        field_35919_q = p_i664_1_.field_35919_q;
        field_22319_b = p_i664_1_.field_22319_b;
        field_22318_c = p_i664_1_.field_22318_c;
        field_22317_d = p_i664_1_.field_22317_d;
        field_22316_e = p_i664_1_.field_22316_e;
        field_22315_f = p_i664_1_.field_22315_f;
        field_22314_g = p_i664_1_.field_22314_g;
        field_22313_h = p_i664_1_.field_22313_h;
        field_22312_i = p_i664_1_.field_22312_i;
        field_22311_j = p_i664_1_.field_22311_j;
        field_22310_k = p_i664_1_.field_22310_k;
        field_27403_m = p_i664_1_.field_27403_m;
        field_27404_l = p_i664_1_.field_27404_l;
        field_27401_o = p_i664_1_.field_27401_o;
        field_27402_n = p_i664_1_.field_27402_n;
        field_40725_r = p_i664_1_.field_40725_r;
    }

    public NBTTagCompound func_22299_a()
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        func_22291_a(nbttagcompound, field_22313_h);
        return nbttagcompound;
    }

    public NBTTagCompound func_22305_a(List p_22305_1_)
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        EntityPlayer entityplayer = null;
        NBTTagCompound nbttagcompound1 = null;
        if(p_22305_1_.size() > 0)
        {
            entityplayer = (EntityPlayer)p_22305_1_.get(0);
        }
        if(entityplayer != null)
        {
            nbttagcompound1 = new NBTTagCompound();
            entityplayer.func_363_d(nbttagcompound1);
        }
        func_22291_a(nbttagcompound, nbttagcompound1);
        return nbttagcompound;
    }

    private void func_22291_a(NBTTagCompound p_22291_1_, NBTTagCompound p_22291_2_)
    {
        p_22291_1_.func_750_a("RandomSeed", field_22320_a);
        p_22291_1_.func_754_a("generatorName", field_46134_b.func_48628_a());
        p_22291_1_.func_758_a("generatorVersion", field_46134_b.func_48630_c());
        p_22291_1_.func_758_a("GameType", field_35920_p);
        p_22291_1_.func_748_a("MapFeatures", field_35919_q);
        p_22291_1_.func_758_a("SpawnX", field_22319_b);
        p_22291_1_.func_758_a("SpawnY", field_22318_c);
        p_22291_1_.func_758_a("SpawnZ", field_22317_d);
        p_22291_1_.func_750_a("Time", field_22316_e);
        p_22291_1_.func_750_a("SizeOnDisk", field_22314_g);
        p_22291_1_.func_750_a("LastPlayed", System.currentTimeMillis());
        p_22291_1_.func_754_a("LevelName", field_22311_j);
        p_22291_1_.func_758_a("version", field_22310_k);
        p_22291_1_.func_758_a("rainTime", field_27403_m);
        p_22291_1_.func_748_a("raining", field_27404_l);
        p_22291_1_.func_758_a("thunderTime", field_27401_o);
        p_22291_1_.func_748_a("thundering", field_27402_n);
        p_22291_1_.func_748_a("hardcore", field_40725_r);
        if(p_22291_2_ != null)
        {
            p_22291_1_.func_763_a("Player", p_22291_2_);
        }
    }

    public long func_22288_b()
    {
        return field_22320_a;
    }

    public int func_22293_c()
    {
        return field_22319_b;
    }

    public int func_22295_d()
    {
        return field_22318_c;
    }

    public int func_22300_e()
    {
        return field_22317_d;
    }

    public long func_22304_f()
    {
        return field_22316_e;
    }

    public long func_22306_g()
    {
        return field_22314_g;
    }

    public NBTTagCompound func_22303_h()
    {
        return field_22313_h;
    }

    public int func_22290_i()
    {
        return field_22312_i;
    }

    public void func_22294_a(int p_22294_1_)
    {
        field_22319_b = p_22294_1_;
    }

    public void func_22308_b(int p_22308_1_)
    {
        field_22318_c = p_22308_1_;
    }

    public void func_22298_c(int p_22298_1_)
    {
        field_22317_d = p_22298_1_;
    }

    public void func_22307_a(long p_22307_1_)
    {
        field_22316_e = p_22307_1_;
    }

    public void func_22309_a(NBTTagCompound p_22309_1_)
    {
        field_22313_h = p_22309_1_;
    }

    public void func_22292_a(int p_22292_1_, int p_22292_2_, int p_22292_3_)
    {
        field_22319_b = p_22292_1_;
        field_22318_c = p_22292_2_;
        field_22317_d = p_22292_3_;
    }

    public String func_22302_j()
    {
        return field_22311_j;
    }

    public void func_22287_a(String p_22287_1_)
    {
        field_22311_j = p_22287_1_;
    }

    public int func_22296_k()
    {
        return field_22310_k;
    }

    public void func_22289_d(int p_22289_1_)
    {
        field_22310_k = p_22289_1_;
    }

    public long func_22301_l()
    {
        return field_22315_f;
    }

    public boolean func_27396_m()
    {
        return field_27402_n;
    }

    public void func_27398_a(boolean p_27398_1_)
    {
        field_27402_n = p_27398_1_;
    }

    public int func_27400_n()
    {
        return field_27401_o;
    }

    public void func_27399_e(int p_27399_1_)
    {
        field_27401_o = p_27399_1_;
    }

    public boolean func_27397_o()
    {
        return field_27404_l;
    }

    public void func_27394_b(boolean p_27394_1_)
    {
        field_27404_l = p_27394_1_;
    }

    public int func_27393_p()
    {
        return field_27403_m;
    }

    public void func_27395_f(int p_27395_1_)
    {
        field_27403_m = p_27395_1_;
    }

    public int func_35918_q()
    {
        return field_35920_p;
    }

    public boolean func_35917_r()
    {
        return field_35919_q;
    }

    public boolean func_40724_s()
    {
        return field_40725_r;
    }

    public WorldType func_46133_t()
    {
        return field_46134_b;
    }

    public void func_48619_a(WorldType p_48619_1_)
    {
        field_46134_b = p_48619_1_;
    }
}
