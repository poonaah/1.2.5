// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, BlockGrass, WorldGenTrees, WorldGenBigTree, 
//            WorldGenForest, WorldGenSwamp, SpawnListEntry, EntitySheep, 
//            EntityPig, EntityChicken, EntityCow, EntitySpider, 
//            EntityZombie, EntitySkeleton, EntityCreeper, EntitySlime, 
//            EntityEnderman, EntitySquid, BiomeDecorator, WorldGenTallGrass, 
//            BlockTallGrass, EnumCreatureType, MathHelper, ColorizerGrass, 
//            ColorizerFoliage, BiomeGenOcean, BiomeGenPlains, BiomeGenDesert, 
//            BiomeGenHills, BiomeGenForest, BiomeGenTaiga, BiomeGenSwamp, 
//            BiomeGenRiver, BiomeGenHell, BiomeGenEnd, BiomeGenSnow, 
//            BiomeGenMushroomIsland, BiomeGenBeach, BiomeGenJungle, WorldGenerator, 
//            World

public abstract class BiomeGenBase
{

    public static final BiomeGenBase field_35486_a[] = new BiomeGenBase[256];
    public static final BiomeGenBase field_35484_b = (new BiomeGenOcean(0)).func_4123_b(112).func_4125_a("Ocean").func_35479_b(-1F, 0.4F);
    public static final BiomeGenBase field_35485_c = (new BiomeGenPlains(1)).func_4123_b(0x8db360).func_4125_a("Plains").func_35478_a(0.8F, 0.4F);
    public static final BiomeGenBase field_4249_h = (new BiomeGenDesert(2)).func_4123_b(0xfa9418).func_4125_a("Desert").func_27076_e().func_35478_a(2.0F, 0.0F).func_35479_b(0.1F, 0.2F);
    public static final BiomeGenBase field_35483_e = (new BiomeGenHills(3)).func_4123_b(0x606060).func_4125_a("Extreme Hills").func_35479_b(0.2F, 1.3F).func_35478_a(0.2F, 0.3F);
    public static final BiomeGenBase field_4253_d = (new BiomeGenForest(4)).func_4123_b(0x56621).func_4125_a("Forest").func_4124_a(0x4eba31).func_35478_a(0.7F, 0.8F);
    public static final BiomeGenBase field_4250_g = (new BiomeGenTaiga(5)).func_4123_b(0xb6659).func_4125_a("Taiga").func_4124_a(0x4eba31).func_50086_b().func_35478_a(0.05F, 0.8F).func_35479_b(0.1F, 0.4F);
    public static final BiomeGenBase field_4255_b = (new BiomeGenSwamp(6)).func_4123_b(0x7f9b2).func_4125_a("Swampland").func_4124_a(0x8baf48).func_35479_b(-0.2F, 0.1F).func_35478_a(0.8F, 0.9F);
    public static final BiomeGenBase field_35487_i = (new BiomeGenRiver(7)).func_4123_b(255).func_4125_a("River").func_35479_b(-0.5F, 0.0F);
    public static final BiomeGenBase field_4245_l = (new BiomeGenHell(8)).func_4123_b(0xff0000).func_4125_a("Hell").func_27076_e().func_35478_a(2.0F, 0.0F);
    public static final BiomeGenBase field_28057_m = (new BiomeGenEnd(9)).func_4123_b(0x8080ff).func_4125_a("Sky").func_27076_e();
    public static final BiomeGenBase field_40259_l = (new BiomeGenOcean(10)).func_4123_b(0x9090a0).func_4125_a("FrozenOcean").func_50086_b().func_35479_b(-1F, 0.5F).func_35478_a(0.0F, 0.5F);
    public static final BiomeGenBase field_40260_m = (new BiomeGenRiver(11)).func_4123_b(0xa0a0ff).func_4125_a("FrozenRiver").func_50086_b().func_35479_b(-0.5F, 0.0F).func_35478_a(0.0F, 0.5F);
    public static final BiomeGenBase field_40257_n = (new BiomeGenSnow(12)).func_4123_b(0xffffff).func_4125_a("Ice Plains").func_50086_b().func_35478_a(0.0F, 0.5F);
    public static final BiomeGenBase field_40258_o = (new BiomeGenSnow(13)).func_4123_b(0xa0a0a0).func_4125_a("Ice Mountains").func_50086_b().func_35479_b(0.2F, 1.2F).func_35478_a(0.0F, 0.5F);
    public static final BiomeGenBase field_40262_p = (new BiomeGenMushroomIsland(14)).func_4123_b(0xff00ff).func_4125_a("MushroomIsland").func_35478_a(0.9F, 1.0F).func_35479_b(0.2F, 1.0F);
    public static final BiomeGenBase field_40261_q = (new BiomeGenMushroomIsland(15)).func_4123_b(0xa000ff).func_4125_a("MushroomIslandShore").func_35478_a(0.9F, 1.0F).func_35479_b(-1F, 0.1F);
    public static final BiomeGenBase field_46050_r = (new BiomeGenBeach(16)).func_4123_b(0xfade55).func_4125_a("Beach").func_35478_a(0.8F, 0.4F).func_35479_b(0.0F, 0.1F);
    public static final BiomeGenBase field_46049_s = (new BiomeGenDesert(17)).func_4123_b(0xd25f12).func_4125_a("DesertHills").func_27076_e().func_35478_a(2.0F, 0.0F).func_35479_b(0.2F, 0.7F);
    public static final BiomeGenBase field_46048_t = (new BiomeGenForest(18)).func_4123_b(0x22551c).func_4125_a("ForestHills").func_4124_a(0x4eba31).func_35478_a(0.7F, 0.8F).func_35479_b(0.2F, 0.6F);
    public static final BiomeGenBase field_46047_u = (new BiomeGenTaiga(19)).func_4123_b(0x163933).func_4125_a("TaigaHills").func_50086_b().func_4124_a(0x4eba31).func_35478_a(0.05F, 0.8F).func_35479_b(0.2F, 0.7F);
    public static final BiomeGenBase field_46046_v = (new BiomeGenHills(20)).func_4123_b(0x72789a).func_4125_a("Extreme Hills Edge").func_35479_b(0.2F, 0.8F).func_35478_a(0.2F, 0.3F);
    public static final BiomeGenBase field_48416_w = (new BiomeGenJungle(21)).func_4123_b(0x537b09).func_4125_a("Jungle").func_4124_a(0x537b09).func_35478_a(1.2F, 0.9F).func_35479_b(0.2F, 0.4F);
    public static final BiomeGenBase field_48417_x = (new BiomeGenJungle(22)).func_4123_b(0x2c4205).func_4125_a("JungleHills").func_4124_a(0x537b09).func_35478_a(1.2F, 0.9F).func_35479_b(1.8F, 0.2F);
    public String field_6504_m;
    public int field_6503_n;
    public byte field_4242_o;
    public byte field_4241_p;
    public int field_6502_q;
    public float field_35492_q;
    public float field_35491_r;
    public float field_35490_s;
    public float field_35489_t;
    public int field_40256_A;
    public BiomeDecorator field_35488_u;
    protected List field_25066_r;
    protected List field_25065_s;
    protected List field_25064_t;
    private boolean field_27080_u;
    private boolean field_27079_v;
    public final int field_35494_y;
    protected WorldGenTrees field_35493_z;
    protected WorldGenBigTree field_35480_A;
    protected WorldGenForest field_35481_B;
    protected WorldGenSwamp field_35482_C;

    protected BiomeGenBase(int p_i769_1_)
    {
        field_4242_o = (byte)Block.field_337_v.field_376_bc;
        field_4241_p = (byte)Block.field_336_w.field_376_bc;
        field_6502_q = 0x4ee031;
        field_35492_q = 0.1F;
        field_35491_r = 0.3F;
        field_35490_s = 0.5F;
        field_35489_t = 0.5F;
        field_40256_A = 0xffffff;
        field_25066_r = new ArrayList();
        field_25065_s = new ArrayList();
        field_25064_t = new ArrayList();
        field_27079_v = true;
        field_35493_z = new WorldGenTrees(false);
        field_35480_A = new WorldGenBigTree(false);
        field_35481_B = new WorldGenForest(false);
        field_35482_C = new WorldGenSwamp();
        field_35494_y = p_i769_1_;
        field_35486_a[p_i769_1_] = this;
        field_35488_u = func_35475_a();
        field_25065_s.add(new SpawnListEntry(net.minecraft.src.EntitySheep.class, 12, 4, 4));
        field_25065_s.add(new SpawnListEntry(net.minecraft.src.EntityPig.class, 10, 4, 4));
        field_25065_s.add(new SpawnListEntry(net.minecraft.src.EntityChicken.class, 10, 4, 4));
        field_25065_s.add(new SpawnListEntry(net.minecraft.src.EntityCow.class, 8, 4, 4));
        field_25066_r.add(new SpawnListEntry(net.minecraft.src.EntitySpider.class, 10, 4, 4));
        field_25066_r.add(new SpawnListEntry(net.minecraft.src.EntityZombie.class, 10, 4, 4));
        field_25066_r.add(new SpawnListEntry(net.minecraft.src.EntitySkeleton.class, 10, 4, 4));
        field_25066_r.add(new SpawnListEntry(net.minecraft.src.EntityCreeper.class, 10, 4, 4));
        field_25066_r.add(new SpawnListEntry(net.minecraft.src.EntitySlime.class, 10, 4, 4));
        field_25066_r.add(new SpawnListEntry(net.minecraft.src.EntityEnderman.class, 1, 1, 4));
        field_25064_t.add(new SpawnListEntry(net.minecraft.src.EntitySquid.class, 10, 4, 4));
    }

    protected BiomeDecorator func_35475_a()
    {
        return new BiomeDecorator(this);
    }

    private BiomeGenBase func_35478_a(float p_35478_1_, float p_35478_2_)
    {
        if(p_35478_1_ > 0.1F && p_35478_1_ < 0.2F)
        {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
        } else
        {
            field_35490_s = p_35478_1_;
            field_35489_t = p_35478_2_;
            return this;
        }
    }

    private BiomeGenBase func_35479_b(float p_35479_1_, float p_35479_2_)
    {
        field_35492_q = p_35479_1_;
        field_35491_r = p_35479_2_;
        return this;
    }

    private BiomeGenBase func_27076_e()
    {
        field_27079_v = false;
        return this;
    }

    public WorldGenerator func_21107_a(Random p_21107_1_)
    {
        if(p_21107_1_.nextInt(10) == 0)
        {
            return field_35480_A;
        } else
        {
            return field_35493_z;
        }
    }

    public WorldGenerator func_48410_b(Random p_48410_1_)
    {
        return new WorldGenTallGrass(Block.field_9257_X.field_376_bc, 1);
    }

    protected BiomeGenBase func_50086_b()
    {
        field_27080_u = true;
        return this;
    }

    protected BiomeGenBase func_4125_a(String p_4125_1_)
    {
        field_6504_m = p_4125_1_;
        return this;
    }

    protected BiomeGenBase func_4124_a(int p_4124_1_)
    {
        field_6502_q = p_4124_1_;
        return this;
    }

    protected BiomeGenBase func_4123_b(int p_4123_1_)
    {
        field_6503_n = p_4123_1_;
        return this;
    }

    public int func_4126_a(float p_4126_1_)
    {
        p_4126_1_ /= 3F;
        if(p_4126_1_ < -1F)
        {
            p_4126_1_ = -1F;
        }
        if(p_4126_1_ > 1.0F)
        {
            p_4126_1_ = 1.0F;
        }
        return java.awt.Color.getHSBColor(0.6222222F - p_4126_1_ * 0.05F, 0.5F + p_4126_1_ * 0.1F, 1.0F).getRGB();
    }

    public List func_25063_a(EnumCreatureType p_25063_1_)
    {
        if(p_25063_1_ == EnumCreatureType.monster)
        {
            return field_25066_r;
        }
        if(p_25063_1_ == EnumCreatureType.creature)
        {
            return field_25065_s;
        }
        if(p_25063_1_ == EnumCreatureType.waterCreature)
        {
            return field_25064_t;
        } else
        {
            return null;
        }
    }

    public boolean func_27078_c()
    {
        return field_27080_u;
    }

    public boolean func_27077_d()
    {
        if(field_27080_u)
        {
            return false;
        } else
        {
            return field_27079_v;
        }
    }

    public boolean func_48413_d()
    {
        return field_35489_t > 0.85F;
    }

    public float func_4119_a()
    {
        return 0.1F;
    }

    public final int func_35476_e()
    {
        return (int)(field_35489_t * 65536F);
    }

    public final int func_35474_f()
    {
        return (int)(field_35490_s * 65536F);
    }

    public final float func_48414_h()
    {
        return field_35489_t;
    }

    public final float func_48411_i()
    {
        return field_35490_s;
    }

    public void func_35477_a(World p_35477_1_, Random p_35477_2_, int p_35477_3_, int p_35477_4_)
    {
        field_35488_u.func_35881_a(p_35477_1_, p_35477_2_, p_35477_3_, p_35477_4_);
    }

    public int func_48415_j()
    {
        double d = MathHelper.func_48442_a(func_48411_i(), 0.0F, 1.0F);
        double d1 = MathHelper.func_48442_a(func_48414_h(), 0.0F, 1.0F);
        return ColorizerGrass.func_4147_a(d, d1);
    }

    public int func_48412_k()
    {
        double d = MathHelper.func_48442_a(func_48411_i(), 0.0F, 1.0F);
        double d1 = MathHelper.func_48442_a(func_48414_h(), 0.0F, 1.0F);
        return ColorizerFoliage.func_4146_a(d, d1);
    }

}
