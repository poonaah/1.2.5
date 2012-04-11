// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            IBlockAccess, WorldProvider, Chunk, WorldChunkManager, 
//            VillageCollection, VillageSiege, WorldInfo, MapStorage, 
//            ISaveHandler, ChunkProvider, ChunkPosition, EntityPlayer, 
//            ChunkProviderLoadOrGenerate, MathHelper, IChunkProvider, IProgressUpdate, 
//            Profiler, Material, Block, IWorldAccess, 
//            EnumSkyBlock, Vec3D, Entity, AxisAlignedBB, 
//            BiomeGenBase, NextTickListEntry, TileEntity, BlockFire, 
//            BlockFluid, Explosion, ThreadedFileIOBase, SpawnerAnimals, 
//            ChunkCoordIntPair, EntityLightningBolt, ExtendedBlockStorage, ChunkCache, 
//            PathFinder, PlayerCapabilities, ChunkCoordinates, WeightedRandom, 
//            SpawnListEntry, WorldType, WorldSettings, MovingObjectPosition, 
//            PathEntity, WorldSavedData, EnumCreatureType

public class World
    implements IBlockAccess
{

    public boolean field_4214_a;
    public List field_1050_a;
    private List field_1024_A;
    private TreeSet field_1058_B;
    private Set field_1056_C;
    public List field_1049_b;
    private List field_30900_E;
    private List field_34900_Q;
    public List field_1040_k;
    public List field_27173_e;
    private long field_1019_F;
    public int field_1046_e;
    protected int field_9437_g;
    protected final int field_9436_h = 0x3c6ef35f;
    protected float field_26901_B;
    protected float field_27171_C;
    protected float field_27170_D;
    protected float field_27169_E;
    protected int field_27168_F;
    public int field_27172_i;
    public boolean field_1043_h;
    private long field_1054_E;
    protected int field_9435_j;
    public int field_1039_l;
    public Random field_1037_n;
    public boolean field_1033_r;
    public final WorldProvider field_4209_q;
    protected List field_9434_r;
    protected IChunkProvider field_1017_H;
    protected final ISaveHandler field_22147_p;
    protected WorldInfo field_22145_q;
    public boolean field_9430_x;
    private boolean field_22146_A;
    public MapStorage field_28108_z;
    public final VillageCollection field_48465_A;
    private final VillageSiege field_48466_O;
    private ArrayList field_9428_I;
    private boolean field_31055_L;
    protected boolean field_21121_K;
    protected boolean field_21120_L;
    protected Set field_9427_K;
    private int field_9426_L;
    int field_35466_H[];
    private List field_1012_M;
    public boolean field_1026_y;

    public BiomeGenBase func_48454_a(int p_48454_1_, int p_48454_2_)
    {
        if(func_630_d(p_48454_1_, 0, p_48454_2_))
        {
            Chunk chunk = func_673_a(p_48454_1_, p_48454_2_);
            if(chunk != null)
            {
                return chunk.func_48490_a(p_48454_1_ & 0xf, p_48454_2_ & 0xf, field_4209_q.field_4215_b);
            }
        }
        return field_4209_q.field_4215_b.func_4073_a(p_48454_1_, p_48454_2_);
    }

    public WorldChunkManager func_4075_a()
    {
        return field_4209_q.field_4215_b;
    }

    public World(ISaveHandler p_i674_1_, String p_i674_2_, WorldProvider p_i674_3_, WorldSettings p_i674_4_)
    {
        field_4214_a = false;
        field_1050_a = new ArrayList();
        field_1024_A = new ArrayList();
        field_1058_B = new TreeSet();
        field_1056_C = new HashSet();
        field_1049_b = new ArrayList();
        field_30900_E = new ArrayList();
        field_34900_Q = new ArrayList();
        field_1040_k = new ArrayList();
        field_27173_e = new ArrayList();
        field_1019_F = 0xffffffL;
        field_1046_e = 0;
        field_9437_g = (new Random()).nextInt();
        field_27168_F = 0;
        field_27172_i = 0;
        field_1043_h = false;
        field_1054_E = System.currentTimeMillis();
        field_9435_j = 40;
        field_1037_n = new Random();
        field_1033_r = false;
        field_9434_r = new ArrayList();
        field_48465_A = new VillageCollection(this);
        field_48466_O = new VillageSiege(this);
        field_9428_I = new ArrayList();
        field_21121_K = true;
        field_21120_L = true;
        field_9427_K = new HashSet();
        field_9426_L = field_1037_n.nextInt(12000);
        field_35466_H = new int[32768];
        field_1012_M = new ArrayList();
        field_1026_y = false;
        field_22147_p = p_i674_1_;
        field_22145_q = new WorldInfo(p_i674_4_, p_i674_2_);
        field_4209_q = p_i674_3_;
        field_28108_z = new MapStorage(p_i674_1_);
        p_i674_3_.func_4095_a(this);
        field_1017_H = func_4081_a();
        func_644_f();
        func_27163_E();
    }

    public World(World p_i675_1_, WorldProvider p_i675_2_)
    {
        field_4214_a = false;
        field_1050_a = new ArrayList();
        field_1024_A = new ArrayList();
        field_1058_B = new TreeSet();
        field_1056_C = new HashSet();
        field_1049_b = new ArrayList();
        field_30900_E = new ArrayList();
        field_34900_Q = new ArrayList();
        field_1040_k = new ArrayList();
        field_27173_e = new ArrayList();
        field_1019_F = 0xffffffL;
        field_1046_e = 0;
        field_9437_g = (new Random()).nextInt();
        field_27168_F = 0;
        field_27172_i = 0;
        field_1043_h = false;
        field_1054_E = System.currentTimeMillis();
        field_9435_j = 40;
        field_1037_n = new Random();
        field_1033_r = false;
        field_9434_r = new ArrayList();
        field_48465_A = new VillageCollection(this);
        field_48466_O = new VillageSiege(this);
        field_9428_I = new ArrayList();
        field_21121_K = true;
        field_21120_L = true;
        field_9427_K = new HashSet();
        field_9426_L = field_1037_n.nextInt(12000);
        field_35466_H = new int[32768];
        field_1012_M = new ArrayList();
        field_1026_y = false;
        field_1054_E = p_i675_1_.field_1054_E;
        field_22147_p = p_i675_1_.field_22147_p;
        field_22145_q = new WorldInfo(p_i675_1_.field_22145_q);
        field_28108_z = new MapStorage(field_22147_p);
        field_4209_q = p_i675_2_;
        p_i675_2_.func_4095_a(this);
        field_1017_H = func_4081_a();
        func_644_f();
        func_27163_E();
    }

    public World(ISaveHandler p_i676_1_, String p_i676_2_, WorldSettings p_i676_3_)
    {
        this(p_i676_1_, p_i676_2_, p_i676_3_, ((WorldProvider) (null)));
    }

    public World(ISaveHandler p_i677_1_, String p_i677_2_, WorldSettings p_i677_3_, WorldProvider p_i677_4_)
    {
        field_4214_a = false;
        field_1050_a = new ArrayList();
        field_1024_A = new ArrayList();
        field_1058_B = new TreeSet();
        field_1056_C = new HashSet();
        field_1049_b = new ArrayList();
        field_30900_E = new ArrayList();
        field_34900_Q = new ArrayList();
        field_1040_k = new ArrayList();
        field_27173_e = new ArrayList();
        field_1019_F = 0xffffffL;
        field_1046_e = 0;
        field_9437_g = (new Random()).nextInt();
        field_27168_F = 0;
        field_27172_i = 0;
        field_1043_h = false;
        field_1054_E = System.currentTimeMillis();
        field_9435_j = 40;
        field_1037_n = new Random();
        field_1033_r = false;
        field_9434_r = new ArrayList();
        field_48465_A = new VillageCollection(this);
        field_48466_O = new VillageSiege(this);
        field_9428_I = new ArrayList();
        field_21121_K = true;
        field_21120_L = true;
        field_9427_K = new HashSet();
        field_9426_L = field_1037_n.nextInt(12000);
        field_35466_H = new int[32768];
        field_1012_M = new ArrayList();
        field_1026_y = false;
        field_22147_p = p_i677_1_;
        field_28108_z = new MapStorage(p_i677_1_);
        field_22145_q = p_i677_1_.func_22151_c();
        field_1033_r = field_22145_q == null;
        if(p_i677_4_ != null)
        {
            field_4209_q = p_i677_4_;
        } else
        if(field_22145_q != null && field_22145_q.func_22290_i() != 0)
        {
            field_4209_q = WorldProvider.func_4101_a(field_22145_q.func_22290_i());
        } else
        {
            field_4209_q = WorldProvider.func_4101_a(0);
        }
        boolean flag = false;
        if(field_22145_q == null)
        {
            field_22145_q = new WorldInfo(p_i677_3_, p_i677_2_);
            flag = true;
        } else
        {
            field_22145_q.func_22287_a(p_i677_2_);
        }
        field_4209_q.func_4095_a(this);
        field_1017_H = func_4081_a();
        if(flag)
        {
            func_25098_c();
        }
        func_644_f();
        func_27163_E();
    }

    protected IChunkProvider func_4081_a()
    {
        IChunkLoader ichunkloader = field_22147_p.func_22149_a(field_4209_q);
        return new ChunkProvider(this, ichunkloader, field_4209_q.func_4094_c());
    }

    protected void func_25098_c()
    {
        if(!field_4209_q.func_6477_d())
        {
            field_22145_q.func_22292_a(0, field_4209_q.func_46066_g(), 0);
            return;
        }
        field_9430_x = true;
        WorldChunkManager worldchunkmanager = field_4209_q.field_4215_b;
        List list = worldchunkmanager.func_35559_a();
        Random random = new Random(func_22138_q());
        ChunkPosition chunkposition = worldchunkmanager.func_35556_a(0, 0, 256, list, random);
        int i = 0;
        int j = field_4209_q.func_46066_g();
        int k = 0;
        if(chunkposition != null)
        {
            i = chunkposition.field_1111_a;
            k = chunkposition.field_1112_c;
        } else
        {
            System.out.println("Unable to find spawn biome");
        }
        int l = 0;
        do
        {
            if(field_4209_q.func_4102_a(i, k))
            {
                break;
            }
            i += random.nextInt(64) - random.nextInt(64);
            k += random.nextInt(64) - random.nextInt(64);
        } while(++l != 1000);
        field_22145_q.func_22292_a(i, j, k);
        field_9430_x = false;
    }

    public ChunkCoordinates func_40472_j()
    {
        return field_4209_q.func_40469_f();
    }

    public void func_4076_b()
    {
        if(field_22145_q.func_22295_d() <= 0)
        {
            field_22145_q.func_22308_b(64);
        }
        int i = field_22145_q.func_22293_c();
        int j = field_22145_q.func_22300_e();
        int k = 0;
        do
        {
            if(func_614_g(i, j) != 0)
            {
                break;
            }
            i += field_1037_n.nextInt(8) - field_1037_n.nextInt(8);
            j += field_1037_n.nextInt(8) - field_1037_n.nextInt(8);
        } while(++k != 10000);
        field_22145_q.func_22294_a(i);
        field_22145_q.func_22298_c(j);
    }

    public int func_614_g(int p_614_1_, int p_614_2_)
    {
        int i;
        for(i = 63; !func_20084_d(p_614_1_, i + 1, p_614_2_); i++) { }
        return func_600_a(p_614_1_, i, p_614_2_);
    }

    public void func_6464_c()
    {
    }

    public void func_608_a(EntityPlayer p_608_1_)
    {
        try
        {
            NBTTagCompound nbttagcompound = field_22145_q.func_22303_h();
            if(nbttagcompound != null)
            {
                p_608_1_.func_368_e(nbttagcompound);
                field_22145_q.func_22309_a(null);
            }
            if(field_1017_H instanceof ChunkProviderLoadOrGenerate)
            {
                ChunkProviderLoadOrGenerate chunkproviderloadorgenerate = (ChunkProviderLoadOrGenerate)field_1017_H;
                int i = MathHelper.func_1110_d((int)p_608_1_.field_611_ak) >> 4;
                int j = MathHelper.func_1110_d((int)p_608_1_.field_609_am) >> 4;
                chunkproviderloadorgenerate.func_21110_c(i, j);
            }
            func_674_a(p_608_1_);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void func_639_a(boolean p_639_1_, IProgressUpdate p_639_2_)
    {
        if(!field_1017_H.func_536_b())
        {
            return;
        }
        if(p_639_2_ != null)
        {
            p_639_2_.func_594_b("Saving level");
        }
        func_669_m();
        if(p_639_2_ != null)
        {
            p_639_2_.func_595_d("Saving chunks");
        }
        field_1017_H.func_535_a(p_639_1_, p_639_2_);
    }

    private void func_669_m()
    {
        func_663_l();
        field_22147_p.func_22148_a(field_22145_q, field_1040_k);
        field_28108_z.func_28188_a();
    }

    public boolean func_650_a(int p_650_1_)
    {
        if(!field_1017_H.func_536_b())
        {
            return true;
        }
        if(p_650_1_ == 0)
        {
            func_669_m();
        }
        return field_1017_H.func_535_a(false, null);
    }

    public int func_600_a(int p_600_1_, int p_600_2_, int p_600_3_)
    {
        if(p_600_1_ < 0xfe363c80 || p_600_3_ < 0xfe363c80 || p_600_1_ >= 0x1c9c380 || p_600_3_ >= 0x1c9c380)
        {
            return 0;
        }
        if(p_600_2_ < 0)
        {
            return 0;
        }
        if(p_600_2_ >= 256)
        {
            return 0;
        } else
        {
            return func_704_b(p_600_1_ >> 4, p_600_3_ >> 4).func_1008_a(p_600_1_ & 0xf, p_600_2_, p_600_3_ & 0xf);
        }
    }

    public int func_48462_d(int p_48462_1_, int p_48462_2_, int p_48462_3_)
    {
        if(p_48462_1_ < 0xfe363c80 || p_48462_3_ < 0xfe363c80 || p_48462_1_ >= 0x1c9c380 || p_48462_3_ >= 0x1c9c380)
        {
            return 0;
        }
        if(p_48462_2_ < 0)
        {
            return 0;
        }
        if(p_48462_2_ >= 256)
        {
            return 0;
        } else
        {
            return func_704_b(p_48462_1_ >> 4, p_48462_3_ >> 4).func_48499_b(p_48462_1_ & 0xf, p_48462_2_, p_48462_3_ & 0xf);
        }
    }

    public boolean func_20084_d(int p_20084_1_, int p_20084_2_, int p_20084_3_)
    {
        return func_600_a(p_20084_1_, p_20084_2_, p_20084_3_) == 0;
    }

    public boolean func_630_d(int p_630_1_, int p_630_2_, int p_630_3_)
    {
        if(p_630_2_ < 0 || p_630_2_ >= 256)
        {
            return false;
        } else
        {
            return func_620_h(p_630_1_ >> 4, p_630_3_ >> 4);
        }
    }

    public boolean func_21117_a(int p_21117_1_, int p_21117_2_, int p_21117_3_, int p_21117_4_)
    {
        return func_640_a(p_21117_1_ - p_21117_4_, p_21117_2_ - p_21117_4_, p_21117_3_ - p_21117_4_, p_21117_1_ + p_21117_4_, p_21117_2_ + p_21117_4_, p_21117_3_ + p_21117_4_);
    }

    public boolean func_640_a(int p_640_1_, int p_640_2_, int p_640_3_, int p_640_4_, int p_640_5_, int p_640_6_)
    {
        if(p_640_5_ < 0 || p_640_2_ >= 256)
        {
            return false;
        }
        p_640_1_ >>= 4;
        p_640_3_ >>= 4;
        p_640_4_ >>= 4;
        p_640_6_ >>= 4;
        for(int i = p_640_1_; i <= p_640_4_; i++)
        {
            for(int j = p_640_3_; j <= p_640_6_; j++)
            {
                if(!func_620_h(i, j))
                {
                    return false;
                }
            }

        }

        return true;
    }

    private boolean func_620_h(int p_620_1_, int p_620_2_)
    {
        return field_1017_H.func_537_a(p_620_1_, p_620_2_);
    }

    public Chunk func_673_a(int p_673_1_, int p_673_2_)
    {
        return func_704_b(p_673_1_ >> 4, p_673_2_ >> 4);
    }

    public Chunk func_704_b(int p_704_1_, int p_704_2_)
    {
        return field_1017_H.func_533_b(p_704_1_, p_704_2_);
    }

    public boolean func_643_a(int p_643_1_, int p_643_2_, int p_643_3_, int p_643_4_, int p_643_5_)
    {
        if(p_643_1_ < 0xfe363c80 || p_643_3_ < 0xfe363c80 || p_643_1_ >= 0x1c9c380 || p_643_3_ >= 0x1c9c380)
        {
            return false;
        }
        if(p_643_2_ < 0)
        {
            return false;
        }
        if(p_643_2_ >= 256)
        {
            return false;
        } else
        {
            Chunk chunk = func_704_b(p_643_1_ >> 4, p_643_3_ >> 4);
            boolean flag = chunk.func_1010_a(p_643_1_ & 0xf, p_643_2_, p_643_3_ & 0xf, p_643_4_, p_643_5_);
            Profiler.func_40663_a("checkLight");
            func_35463_p(p_643_1_, p_643_2_, p_643_3_);
            Profiler.func_40662_b();
            return flag;
        }
    }

    public boolean func_634_a(int p_634_1_, int p_634_2_, int p_634_3_, int p_634_4_)
    {
        if(p_634_1_ < 0xfe363c80 || p_634_3_ < 0xfe363c80 || p_634_1_ >= 0x1c9c380 || p_634_3_ >= 0x1c9c380)
        {
            return false;
        }
        if(p_634_2_ < 0)
        {
            return false;
        }
        if(p_634_2_ >= 256)
        {
            return false;
        } else
        {
            Chunk chunk = func_704_b(p_634_1_ >> 4, p_634_3_ >> 4);
            boolean flag = chunk.func_1022_a(p_634_1_ & 0xf, p_634_2_, p_634_3_ & 0xf, p_634_4_);
            Profiler.func_40663_a("checkLight");
            func_35463_p(p_634_1_, p_634_2_, p_634_3_);
            Profiler.func_40662_b();
            return flag;
        }
    }

    public Material func_599_f(int p_599_1_, int p_599_2_, int p_599_3_)
    {
        int i = func_600_a(p_599_1_, p_599_2_, p_599_3_);
        if(i == 0)
        {
            return Material.field_1337_a;
        } else
        {
            return Block.field_345_n[i].field_356_bn;
        }
    }

    public int func_602_e(int p_602_1_, int p_602_2_, int p_602_3_)
    {
        if(p_602_1_ < 0xfe363c80 || p_602_3_ < 0xfe363c80 || p_602_1_ >= 0x1c9c380 || p_602_3_ >= 0x1c9c380)
        {
            return 0;
        }
        if(p_602_2_ < 0)
        {
            return 0;
        }
        if(p_602_2_ >= 256)
        {
            return 0;
        } else
        {
            Chunk chunk = func_704_b(p_602_1_ >> 4, p_602_3_ >> 4);
            p_602_1_ &= 0xf;
            p_602_3_ &= 0xf;
            return chunk.func_1021_b(p_602_1_, p_602_2_, p_602_3_);
        }
    }

    public void func_691_b(int p_691_1_, int p_691_2_, int p_691_3_, int p_691_4_)
    {
        if(func_635_c(p_691_1_, p_691_2_, p_691_3_, p_691_4_))
        {
            int i = func_600_a(p_691_1_, p_691_2_, p_691_3_);
            if(Block.field_28032_t[i & 0xfff])
            {
                func_617_e(p_691_1_, p_691_2_, p_691_3_, i);
            } else
            {
                func_611_g(p_691_1_, p_691_2_, p_691_3_, i);
            }
        }
    }

    public boolean func_635_c(int p_635_1_, int p_635_2_, int p_635_3_, int p_635_4_)
    {
        if(p_635_1_ < 0xfe363c80 || p_635_3_ < 0xfe363c80 || p_635_1_ >= 0x1c9c380 || p_635_3_ >= 0x1c9c380)
        {
            return false;
        }
        if(p_635_2_ < 0)
        {
            return false;
        }
        if(p_635_2_ >= 256)
        {
            return false;
        } else
        {
            Chunk chunk = func_704_b(p_635_1_ >> 4, p_635_3_ >> 4);
            p_635_1_ &= 0xf;
            p_635_3_ &= 0xf;
            return chunk.func_1009_b(p_635_1_, p_635_2_, p_635_3_, p_635_4_);
        }
    }

    public boolean func_690_d(int p_690_1_, int p_690_2_, int p_690_3_, int p_690_4_)
    {
        if(func_634_a(p_690_1_, p_690_2_, p_690_3_, p_690_4_))
        {
            func_617_e(p_690_1_, p_690_2_, p_690_3_, p_690_4_);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean func_688_b(int p_688_1_, int p_688_2_, int p_688_3_, int p_688_4_, int p_688_5_)
    {
        if(func_643_a(p_688_1_, p_688_2_, p_688_3_, p_688_4_, p_688_5_))
        {
            func_617_e(p_688_1_, p_688_2_, p_688_3_, p_688_4_);
            return true;
        } else
        {
            return false;
        }
    }

    public void func_665_h(int p_665_1_, int p_665_2_, int p_665_3_)
    {
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_934_a(p_665_1_, p_665_2_, p_665_3_);
        }

    }

    public void func_617_e(int p_617_1_, int p_617_2_, int p_617_3_, int p_617_4_)
    {
        func_665_h(p_617_1_, p_617_2_, p_617_3_);
        func_611_g(p_617_1_, p_617_2_, p_617_3_, p_617_4_);
    }

    public void func_680_f(int p_680_1_, int p_680_2_, int p_680_3_, int p_680_4_)
    {
        if(p_680_3_ > p_680_4_)
        {
            int i = p_680_4_;
            p_680_4_ = p_680_3_;
            p_680_3_ = i;
        }
        if(!field_4209_q.field_6478_e)
        {
            for(int j = p_680_3_; j <= p_680_4_; j++)
            {
                func_35459_c(EnumSkyBlock.Sky, p_680_1_, j, p_680_2_);
            }

        }
        func_701_b(p_680_1_, p_680_3_, p_680_2_, p_680_1_, p_680_4_, p_680_2_);
    }

    public void func_21115_j(int p_21115_1_, int p_21115_2_, int p_21115_3_)
    {
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_937_b(p_21115_1_, p_21115_2_, p_21115_3_, p_21115_1_, p_21115_2_, p_21115_3_);
        }

    }

    public void func_701_b(int p_701_1_, int p_701_2_, int p_701_3_, int p_701_4_, int p_701_5_, int p_701_6_)
    {
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_937_b(p_701_1_, p_701_2_, p_701_3_, p_701_4_, p_701_5_, p_701_6_);
        }

    }

    public void func_611_g(int p_611_1_, int p_611_2_, int p_611_3_, int p_611_4_)
    {
        func_655_l(p_611_1_ - 1, p_611_2_, p_611_3_, p_611_4_);
        func_655_l(p_611_1_ + 1, p_611_2_, p_611_3_, p_611_4_);
        func_655_l(p_611_1_, p_611_2_ - 1, p_611_3_, p_611_4_);
        func_655_l(p_611_1_, p_611_2_ + 1, p_611_3_, p_611_4_);
        func_655_l(p_611_1_, p_611_2_, p_611_3_ - 1, p_611_4_);
        func_655_l(p_611_1_, p_611_2_, p_611_3_ + 1, p_611_4_);
    }

    private void func_655_l(int p_655_1_, int p_655_2_, int p_655_3_, int p_655_4_)
    {
        if(field_1043_h || field_1026_y)
        {
            return;
        }
        Block block = Block.field_345_n[func_600_a(p_655_1_, p_655_2_, p_655_3_)];
        if(block != null)
        {
            block.func_226_a(this, p_655_1_, p_655_2_, p_655_3_, p_655_4_);
        }
    }

    public boolean func_647_i(int p_647_1_, int p_647_2_, int p_647_3_)
    {
        return func_704_b(p_647_1_ >> 4, p_647_3_ >> 4).func_1007_c(p_647_1_ & 0xf, p_647_2_, p_647_3_ & 0xf);
    }

    public int func_28104_m(int p_28104_1_, int p_28104_2_, int p_28104_3_)
    {
        if(p_28104_2_ < 0)
        {
            return 0;
        }
        if(p_28104_2_ >= 256)
        {
            p_28104_2_ = 255;
        }
        return func_704_b(p_28104_1_ >> 4, p_28104_3_ >> 4).func_1019_c(p_28104_1_ & 0xf, p_28104_2_, p_28104_3_ & 0xf, 0);
    }

    public int func_618_j(int p_618_1_, int p_618_2_, int p_618_3_)
    {
        return func_699_a(p_618_1_, p_618_2_, p_618_3_, true);
    }

    public int func_699_a(int p_699_1_, int p_699_2_, int p_699_3_, boolean p_699_4_)
    {
        if(p_699_1_ < 0xfe363c80 || p_699_3_ < 0xfe363c80 || p_699_1_ >= 0x1c9c380 || p_699_3_ >= 0x1c9c380)
        {
            return 15;
        }
        if(p_699_4_)
        {
            int i = func_600_a(p_699_1_, p_699_2_, p_699_3_);
            if(i == Block.field_410_al.field_376_bc || i == Block.field_446_aB.field_376_bc || i == Block.field_4069_aI.field_376_bc || i == Block.field_4059_au.field_376_bc)
            {
                int j = func_699_a(p_699_1_, p_699_2_ + 1, p_699_3_, false);
                int k = func_699_a(p_699_1_ + 1, p_699_2_, p_699_3_, false);
                int l = func_699_a(p_699_1_ - 1, p_699_2_, p_699_3_, false);
                int i1 = func_699_a(p_699_1_, p_699_2_, p_699_3_ + 1, false);
                int j1 = func_699_a(p_699_1_, p_699_2_, p_699_3_ - 1, false);
                if(k > j)
                {
                    j = k;
                }
                if(l > j)
                {
                    j = l;
                }
                if(i1 > j)
                {
                    j = i1;
                }
                if(j1 > j)
                {
                    j = j1;
                }
                return j;
            }
        }
        if(p_699_2_ < 0)
        {
            return 0;
        }
        if(p_699_2_ >= 256)
        {
            p_699_2_ = 255;
        }
        Chunk chunk = func_704_b(p_699_1_ >> 4, p_699_3_ >> 4);
        p_699_1_ &= 0xf;
        p_699_3_ &= 0xf;
        return chunk.func_1019_c(p_699_1_, p_699_2_, p_699_3_, field_1046_e);
    }

    public int func_666_c(int p_666_1_, int p_666_2_)
    {
        if(p_666_1_ < 0xfe363c80 || p_666_2_ < 0xfe363c80 || p_666_1_ >= 0x1c9c380 || p_666_2_ >= 0x1c9c380)
        {
            return 0;
        }
        if(!func_620_h(p_666_1_ >> 4, p_666_2_ >> 4))
        {
            return 0;
        } else
        {
            Chunk chunk = func_704_b(p_666_1_ >> 4, p_666_2_ >> 4);
            return chunk.func_999_b(p_666_1_ & 0xf, p_666_2_ & 0xf);
        }
    }

    public int func_35457_a(EnumSkyBlock p_35457_1_, int p_35457_2_, int p_35457_3_, int p_35457_4_)
    {
        if(field_4209_q.field_6478_e && p_35457_1_ == EnumSkyBlock.Sky)
        {
            return 0;
        }
        if(p_35457_3_ < 0)
        {
            p_35457_3_ = 0;
        }
        if(p_35457_3_ >= 256)
        {
            return p_35457_1_.field_1722_c;
        }
        if(p_35457_2_ < 0xfe363c80 || p_35457_4_ < 0xfe363c80 || p_35457_2_ >= 0x1c9c380 || p_35457_4_ >= 0x1c9c380)
        {
            return p_35457_1_.field_1722_c;
        }
        int i = p_35457_2_ >> 4;
        int j = p_35457_4_ >> 4;
        if(!func_620_h(i, j))
        {
            return p_35457_1_.field_1722_c;
        }
        if(Block.field_40201_bL[func_600_a(p_35457_2_, p_35457_3_, p_35457_4_)])
        {
            int k = func_641_a(p_35457_1_, p_35457_2_, p_35457_3_ + 1, p_35457_4_);
            int l = func_641_a(p_35457_1_, p_35457_2_ + 1, p_35457_3_, p_35457_4_);
            int i1 = func_641_a(p_35457_1_, p_35457_2_ - 1, p_35457_3_, p_35457_4_);
            int j1 = func_641_a(p_35457_1_, p_35457_2_, p_35457_3_, p_35457_4_ + 1);
            int k1 = func_641_a(p_35457_1_, p_35457_2_, p_35457_3_, p_35457_4_ - 1);
            if(l > k)
            {
                k = l;
            }
            if(i1 > k)
            {
                k = i1;
            }
            if(j1 > k)
            {
                k = j1;
            }
            if(k1 > k)
            {
                k = k1;
            }
            return k;
        } else
        {
            Chunk chunk = func_704_b(i, j);
            return chunk.func_1025_a(p_35457_1_, p_35457_2_ & 0xf, p_35457_3_, p_35457_4_ & 0xf);
        }
    }

    public int func_641_a(EnumSkyBlock p_641_1_, int p_641_2_, int p_641_3_, int p_641_4_)
    {
        if(p_641_3_ < 0)
        {
            p_641_3_ = 0;
        }
        if(p_641_3_ >= 256)
        {
            p_641_3_ = 255;
        }
        if(p_641_2_ < 0xfe363c80 || p_641_4_ < 0xfe363c80 || p_641_2_ >= 0x1c9c380 || p_641_4_ >= 0x1c9c380)
        {
            return p_641_1_.field_1722_c;
        }
        int i = p_641_2_ >> 4;
        int j = p_641_4_ >> 4;
        if(!func_620_h(i, j))
        {
            return p_641_1_.field_1722_c;
        } else
        {
            Chunk chunk = func_704_b(i, j);
            return chunk.func_1025_a(p_641_1_, p_641_2_ & 0xf, p_641_3_, p_641_4_ & 0xf);
        }
    }

    public void func_664_b(EnumSkyBlock p_664_1_, int p_664_2_, int p_664_3_, int p_664_4_, int p_664_5_)
    {
        if(p_664_2_ < 0xfe363c80 || p_664_4_ < 0xfe363c80 || p_664_2_ >= 0x1c9c380 || p_664_4_ >= 0x1c9c380)
        {
            return;
        }
        if(p_664_3_ < 0)
        {
            return;
        }
        if(p_664_3_ >= 256)
        {
            return;
        }
        if(!func_620_h(p_664_2_ >> 4, p_664_4_ >> 4))
        {
            return;
        }
        Chunk chunk = func_704_b(p_664_2_ >> 4, p_664_4_ >> 4);
        chunk.func_1011_a(p_664_1_, p_664_2_ & 0xf, p_664_3_, p_664_4_ & 0xf, p_664_5_);
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_48180_b(p_664_2_, p_664_3_, p_664_4_);
        }

    }

    public void func_48464_p(int p_48464_1_, int p_48464_2_, int p_48464_3_)
    {
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_48180_b(p_48464_1_, p_48464_2_, p_48464_3_);
        }

    }

    public int func_35451_b(int p_35451_1_, int p_35451_2_, int p_35451_3_, int p_35451_4_)
    {
        int i = func_35457_a(EnumSkyBlock.Sky, p_35451_1_, p_35451_2_, p_35451_3_);
        int j = func_35457_a(EnumSkyBlock.Block, p_35451_1_, p_35451_2_, p_35451_3_);
        if(j < p_35451_4_)
        {
            j = p_35451_4_;
        }
        return i << 20 | j << 4;
    }

    public float func_28099_a(int p_28099_1_, int p_28099_2_, int p_28099_3_, int p_28099_4_)
    {
        int i = func_618_j(p_28099_1_, p_28099_2_, p_28099_3_);
        if(i < p_28099_4_)
        {
            i = p_28099_4_;
        }
        return field_4209_q.field_4219_d[i];
    }

    public float func_598_c(int p_598_1_, int p_598_2_, int p_598_3_)
    {
        return field_4209_q.field_4219_d[func_618_j(p_598_1_, p_598_2_, p_598_3_)];
    }

    public boolean func_624_b()
    {
        return field_1046_e < 4;
    }

    public MovingObjectPosition func_645_a(Vec3D p_645_1_, Vec3D p_645_2_)
    {
        return func_28105_a(p_645_1_, p_645_2_, false, false);
    }

    public MovingObjectPosition func_642_a(Vec3D p_642_1_, Vec3D p_642_2_, boolean p_642_3_)
    {
        return func_28105_a(p_642_1_, p_642_2_, p_642_3_, false);
    }

    public MovingObjectPosition func_28105_a(Vec3D p_28105_1_, Vec3D p_28105_2_, boolean p_28105_3_, boolean p_28105_4_)
    {
        if(Double.isNaN(p_28105_1_.field_1776_a) || Double.isNaN(p_28105_1_.field_1775_b) || Double.isNaN(p_28105_1_.field_1779_c))
        {
            return null;
        }
        if(Double.isNaN(p_28105_2_.field_1776_a) || Double.isNaN(p_28105_2_.field_1775_b) || Double.isNaN(p_28105_2_.field_1779_c))
        {
            return null;
        }
        int i = MathHelper.func_1108_b(p_28105_2_.field_1776_a);
        int j = MathHelper.func_1108_b(p_28105_2_.field_1775_b);
        int k = MathHelper.func_1108_b(p_28105_2_.field_1779_c);
        int l = MathHelper.func_1108_b(p_28105_1_.field_1776_a);
        int i1 = MathHelper.func_1108_b(p_28105_1_.field_1775_b);
        int j1 = MathHelper.func_1108_b(p_28105_1_.field_1779_c);
        int k1 = func_600_a(l, i1, j1);
        int i2 = func_602_e(l, i1, j1);
        Block block = Block.field_345_n[k1];
        if((!p_28105_4_ || block == null || block.func_221_d(this, l, i1, j1) != null) && k1 > 0 && block.func_224_a(i2, p_28105_3_))
        {
            MovingObjectPosition movingobjectposition = block.func_255_a(this, l, i1, j1, p_28105_1_, p_28105_2_);
            if(movingobjectposition != null)
            {
                return movingobjectposition;
            }
        }
        for(int l1 = 200; l1-- >= 0;)
        {
            if(Double.isNaN(p_28105_1_.field_1776_a) || Double.isNaN(p_28105_1_.field_1775_b) || Double.isNaN(p_28105_1_.field_1779_c))
            {
                return null;
            }
            if(l == i && i1 == j && j1 == k)
            {
                return null;
            }
            boolean flag = true;
            boolean flag1 = true;
            boolean flag2 = true;
            double d = 999D;
            double d1 = 999D;
            double d2 = 999D;
            if(i > l)
            {
                d = (double)l + 1.0D;
            } else
            if(i < l)
            {
                d = (double)l + 0.0D;
            } else
            {
                flag = false;
            }
            if(j > i1)
            {
                d1 = (double)i1 + 1.0D;
            } else
            if(j < i1)
            {
                d1 = (double)i1 + 0.0D;
            } else
            {
                flag1 = false;
            }
            if(k > j1)
            {
                d2 = (double)j1 + 1.0D;
            } else
            if(k < j1)
            {
                d2 = (double)j1 + 0.0D;
            } else
            {
                flag2 = false;
            }
            double d3 = 999D;
            double d4 = 999D;
            double d5 = 999D;
            double d6 = p_28105_2_.field_1776_a - p_28105_1_.field_1776_a;
            double d7 = p_28105_2_.field_1775_b - p_28105_1_.field_1775_b;
            double d8 = p_28105_2_.field_1779_c - p_28105_1_.field_1779_c;
            if(flag)
            {
                d3 = (d - p_28105_1_.field_1776_a) / d6;
            }
            if(flag1)
            {
                d4 = (d1 - p_28105_1_.field_1775_b) / d7;
            }
            if(flag2)
            {
                d5 = (d2 - p_28105_1_.field_1779_c) / d8;
            }
            byte byte0 = 0;
            if(d3 < d4 && d3 < d5)
            {
                if(i > l)
                {
                    byte0 = 4;
                } else
                {
                    byte0 = 5;
                }
                p_28105_1_.field_1776_a = d;
                p_28105_1_.field_1775_b += d7 * d3;
                p_28105_1_.field_1779_c += d8 * d3;
            } else
            if(d4 < d5)
            {
                if(j > i1)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 1;
                }
                p_28105_1_.field_1776_a += d6 * d4;
                p_28105_1_.field_1775_b = d1;
                p_28105_1_.field_1779_c += d8 * d4;
            } else
            {
                if(k > j1)
                {
                    byte0 = 2;
                } else
                {
                    byte0 = 3;
                }
                p_28105_1_.field_1776_a += d6 * d5;
                p_28105_1_.field_1775_b += d7 * d5;
                p_28105_1_.field_1779_c = d2;
            }
            Vec3D vec3d = Vec3D.func_1248_b(p_28105_1_.field_1776_a, p_28105_1_.field_1775_b, p_28105_1_.field_1779_c);
            l = (int)(vec3d.field_1776_a = MathHelper.func_1108_b(p_28105_1_.field_1776_a));
            if(byte0 == 5)
            {
                l--;
                vec3d.field_1776_a++;
            }
            i1 = (int)(vec3d.field_1775_b = MathHelper.func_1108_b(p_28105_1_.field_1775_b));
            if(byte0 == 1)
            {
                i1--;
                vec3d.field_1775_b++;
            }
            j1 = (int)(vec3d.field_1779_c = MathHelper.func_1108_b(p_28105_1_.field_1779_c));
            if(byte0 == 3)
            {
                j1--;
                vec3d.field_1779_c++;
            }
            int j2 = func_600_a(l, i1, j1);
            int k2 = func_602_e(l, i1, j1);
            Block block1 = Block.field_345_n[j2];
            if((!p_28105_4_ || block1 == null || block1.func_221_d(this, l, i1, j1) != null) && j2 > 0 && block1.func_224_a(k2, p_28105_3_))
            {
                MovingObjectPosition movingobjectposition1 = block1.func_255_a(this, l, i1, j1, p_28105_1_, p_28105_2_);
                if(movingobjectposition1 != null)
                {
                    return movingobjectposition1;
                }
            }
        }

        return null;
    }

    public void func_623_a(Entity p_623_1_, String p_623_2_, float p_623_3_, float p_623_4_)
    {
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_940_a(p_623_2_, p_623_1_.field_611_ak, p_623_1_.field_610_al - (double)p_623_1_.field_9292_aO, p_623_1_.field_609_am, p_623_3_, p_623_4_);
        }

    }

    public void func_684_a(double p_684_1_, double p_684_3_, double p_684_5_, String p_684_7_, 
            float p_684_8_, float p_684_9_)
    {
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_940_a(p_684_7_, p_684_1_, p_684_3_, p_684_5_, p_684_8_, p_684_9_);
        }

    }

    public void func_670_a(String p_670_1_, int p_670_2_, int p_670_3_, int p_670_4_)
    {
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_933_a(p_670_1_, p_670_2_, p_670_3_, p_670_4_);
        }

    }

    public void func_694_a(String p_694_1_, double p_694_2_, double p_694_4_, double p_694_6_, 
            double p_694_8_, double p_694_10_, double p_694_12_)
    {
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_939_a(p_694_1_, p_694_2_, p_694_4_, p_694_6_, p_694_8_, p_694_10_, p_694_12_);
        }

    }

    public boolean func_27159_a(Entity p_27159_1_)
    {
        field_27173_e.add(p_27159_1_);
        return true;
    }

    public boolean func_674_a(Entity p_674_1_)
    {
        int i = MathHelper.func_1108_b(p_674_1_.field_611_ak / 16D);
        int j = MathHelper.func_1108_b(p_674_1_.field_609_am / 16D);
        boolean flag = false;
        if(p_674_1_ instanceof EntityPlayer)
        {
            flag = true;
        }
        if(flag || func_620_h(i, j))
        {
            if(p_674_1_ instanceof EntityPlayer)
            {
                EntityPlayer entityplayer = (EntityPlayer)p_674_1_;
                field_1040_k.add(entityplayer);
                func_22140_w();
            }
            func_704_b(i, j).func_1000_a(p_674_1_);
            field_1050_a.add(p_674_1_);
            func_606_b(p_674_1_);
            return true;
        } else
        {
            return false;
        }
    }

    protected void func_606_b(Entity p_606_1_)
    {
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_941_a(p_606_1_);
        }

    }

    protected void func_678_c(Entity p_678_1_)
    {
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_938_b(p_678_1_);
        }

    }

    public void func_607_d(Entity p_607_1_)
    {
        if(p_607_1_.field_617_ae != null)
        {
            p_607_1_.field_617_ae.func_6377_h(null);
        }
        if(p_607_1_.field_616_af != null)
        {
            p_607_1_.func_6377_h(null);
        }
        p_607_1_.func_395_F();
        if(p_607_1_ instanceof EntityPlayer)
        {
            field_1040_k.remove((EntityPlayer)p_607_1_);
            func_22140_w();
        }
    }

    public void func_613_a(IWorldAccess p_613_1_)
    {
        field_9434_r.add(p_613_1_);
    }

    public void func_672_b(IWorldAccess p_672_1_)
    {
        field_9434_r.remove(p_672_1_);
    }

    public List func_697_a(Entity p_697_1_, AxisAlignedBB p_697_2_)
    {
        field_9428_I.clear();
        int i = MathHelper.func_1108_b(p_697_2_.field_1698_a);
        int j = MathHelper.func_1108_b(p_697_2_.field_1703_d + 1.0D);
        int k = MathHelper.func_1108_b(p_697_2_.field_1697_b);
        int l = MathHelper.func_1108_b(p_697_2_.field_1702_e + 1.0D);
        int i1 = MathHelper.func_1108_b(p_697_2_.field_1704_c);
        int j1 = MathHelper.func_1108_b(p_697_2_.field_1701_f + 1.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = i1; l1 < j1; l1++)
            {
                if(!func_630_d(k1, 64, l1))
                {
                    continue;
                }
                for(int i2 = k - 1; i2 < l; i2++)
                {
                    Block block = Block.field_345_n[func_600_a(k1, i2, l1)];
                    if(block != null)
                    {
                        block.func_230_a(this, k1, i2, l1, p_697_2_, field_9428_I);
                    }
                }

            }

        }

        double d = 0.25D;
        List list = func_659_b(p_697_1_, p_697_2_.func_1177_b(d, d, d));
        for(int j2 = 0; j2 < list.size(); j2++)
        {
            AxisAlignedBB axisalignedbb = ((Entity)list.get(j2)).func_372_f_();
            if(axisalignedbb != null && axisalignedbb.func_1178_a(p_697_2_))
            {
                field_9428_I.add(axisalignedbb);
            }
            axisalignedbb = p_697_1_.func_383_b_((Entity)list.get(j2));
            if(axisalignedbb != null && axisalignedbb.func_1178_a(p_697_2_))
            {
                field_9428_I.add(axisalignedbb);
            }
        }

        return field_9428_I;
    }

    public int func_671_a(float p_671_1_)
    {
        float f = func_619_c(p_671_1_);
        float f1 = 1.0F - (MathHelper.func_1114_b(f * 3.141593F * 2.0F) * 2.0F + 0.5F);
        if(f1 < 0.0F)
        {
            f1 = 0.0F;
        }
        if(f1 > 1.0F)
        {
            f1 = 1.0F;
        }
        f1 = 1.0F - f1;
        f1 = (float)((double)f1 * (1.0D - (double)(func_27162_g(p_671_1_) * 5F) / 16D));
        f1 = (float)((double)f1 * (1.0D - (double)(func_27166_f(p_671_1_) * 5F) / 16D));
        f1 = 1.0F - f1;
        return (int)(f1 * 11F);
    }

    public float func_35464_b(float p_35464_1_)
    {
        float f = func_619_c(p_35464_1_);
        float f1 = 1.0F - (MathHelper.func_1114_b(f * 3.141593F * 2.0F) * 2.0F + 0.2F);
        if(f1 < 0.0F)
        {
            f1 = 0.0F;
        }
        if(f1 > 1.0F)
        {
            f1 = 1.0F;
        }
        f1 = 1.0F - f1;
        f1 = (float)((double)f1 * (1.0D - (double)(func_27162_g(p_35464_1_) * 5F) / 16D));
        f1 = (float)((double)f1 * (1.0D - (double)(func_27166_f(p_35464_1_) * 5F) / 16D));
        return f1 * 0.8F + 0.2F;
    }

    public Vec3D func_4079_a(Entity p_4079_1_, float p_4079_2_)
    {
        float f = func_619_c(p_4079_2_);
        float f1 = MathHelper.func_1114_b(f * 3.141593F * 2.0F) * 2.0F + 0.5F;
        if(f1 < 0.0F)
        {
            f1 = 0.0F;
        }
        if(f1 > 1.0F)
        {
            f1 = 1.0F;
        }
        int i = MathHelper.func_1108_b(p_4079_1_.field_611_ak);
        int j = MathHelper.func_1108_b(p_4079_1_.field_609_am);
        BiomeGenBase biomegenbase = func_48454_a(i, j);
        float f2 = biomegenbase.func_48411_i();
        int k = biomegenbase.func_4126_a(f2);
        float f3 = (float)(k >> 16 & 0xff) / 255F;
        float f4 = (float)(k >> 8 & 0xff) / 255F;
        float f5 = (float)(k & 0xff) / 255F;
        f3 *= f1;
        f4 *= f1;
        f5 *= f1;
        float f6 = func_27162_g(p_4079_2_);
        if(f6 > 0.0F)
        {
            float f7 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.6F;
            float f9 = 1.0F - f6 * 0.75F;
            f3 = f3 * f9 + f7 * (1.0F - f9);
            f4 = f4 * f9 + f7 * (1.0F - f9);
            f5 = f5 * f9 + f7 * (1.0F - f9);
        }
        float f8 = func_27166_f(p_4079_2_);
        if(f8 > 0.0F)
        {
            float f10 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.2F;
            float f12 = 1.0F - f8 * 0.75F;
            f3 = f3 * f12 + f10 * (1.0F - f12);
            f4 = f4 * f12 + f10 * (1.0F - f12);
            f5 = f5 * f12 + f10 * (1.0F - f12);
        }
        if(field_27172_i > 0)
        {
            float f11 = (float)field_27172_i - p_4079_2_;
            if(f11 > 1.0F)
            {
                f11 = 1.0F;
            }
            f11 *= 0.45F;
            f3 = f3 * (1.0F - f11) + 0.8F * f11;
            f4 = f4 * (1.0F - f11) + 0.8F * f11;
            f5 = f5 * (1.0F - f11) + 1.0F * f11;
        }
        return Vec3D.func_1248_b(f3, f4, f5);
    }

    public float func_619_c(float p_619_1_)
    {
        return field_4209_q.func_4100_a(field_22145_q.func_22304_f(), p_619_1_);
    }

    public int func_40475_d(float p_40475_1_)
    {
        return field_4209_q.func_40470_b(field_22145_q.func_22304_f(), p_40475_1_);
    }

    public float func_35456_d(float p_35456_1_)
    {
        float f = func_619_c(p_35456_1_);
        return f * 3.141593F * 2.0F;
    }

    public Vec3D func_628_d(float p_628_1_)
    {
        float f = func_619_c(p_628_1_);
        float f1 = MathHelper.func_1114_b(f * 3.141593F * 2.0F) * 2.0F + 0.5F;
        if(f1 < 0.0F)
        {
            f1 = 0.0F;
        }
        if(f1 > 1.0F)
        {
            f1 = 1.0F;
        }
        float f2 = (float)(field_1019_F >> 16 & 255L) / 255F;
        float f3 = (float)(field_1019_F >> 8 & 255L) / 255F;
        float f4 = (float)(field_1019_F & 255L) / 255F;
        float f5 = func_27162_g(p_628_1_);
        if(f5 > 0.0F)
        {
            float f6 = (f2 * 0.3F + f3 * 0.59F + f4 * 0.11F) * 0.6F;
            float f8 = 1.0F - f5 * 0.95F;
            f2 = f2 * f8 + f6 * (1.0F - f8);
            f3 = f3 * f8 + f6 * (1.0F - f8);
            f4 = f4 * f8 + f6 * (1.0F - f8);
        }
        f2 *= f1 * 0.9F + 0.1F;
        f3 *= f1 * 0.9F + 0.1F;
        f4 *= f1 * 0.85F + 0.15F;
        float f7 = func_27166_f(p_628_1_);
        if(f7 > 0.0F)
        {
            float f9 = (f2 * 0.3F + f3 * 0.59F + f4 * 0.11F) * 0.2F;
            float f10 = 1.0F - f7 * 0.95F;
            f2 = f2 * f10 + f9 * (1.0F - f10);
            f3 = f3 * f10 + f9 * (1.0F - f10);
            f4 = f4 * f10 + f9 * (1.0F - f10);
        }
        return Vec3D.func_1248_b(f2, f3, f4);
    }

    public Vec3D func_4082_d(float p_4082_1_)
    {
        float f = func_619_c(p_4082_1_);
        return field_4209_q.func_4096_a(f, p_4082_1_);
    }

    public int func_35461_e(int p_35461_1_, int p_35461_2_)
    {
        return func_673_a(p_35461_1_, p_35461_2_).func_35840_c(p_35461_1_ & 0xf, p_35461_2_ & 0xf);
    }

    public int func_4083_e(int p_4083_1_, int p_4083_2_)
    {
        Chunk chunk = func_673_a(p_4083_1_, p_4083_2_);
        int i = chunk.func_48498_h() + 16;
        p_4083_1_ &= 0xf;
        p_4083_2_ &= 0xf;
        while(i > 0) 
        {
            int j = chunk.func_1008_a(p_4083_1_, i, p_4083_2_);
            if(j == 0 || !Block.field_345_n[j].field_356_bn.func_880_c() || Block.field_345_n[j].field_356_bn == Material.field_4265_h)
            {
                i--;
            } else
            {
                return i + 1;
            }
        }
        return -1;
    }

    public float func_679_f(float p_679_1_)
    {
        float f = func_619_c(p_679_1_);
        float f1 = 1.0F - (MathHelper.func_1114_b(f * 3.141593F * 2.0F) * 2.0F + 0.75F);
        if(f1 < 0.0F)
        {
            f1 = 0.0F;
        }
        if(f1 > 1.0F)
        {
            f1 = 1.0F;
        }
        return f1 * f1 * 0.5F;
    }

    public void func_22136_c(int p_22136_1_, int p_22136_2_, int p_22136_3_, int p_22136_4_, int p_22136_5_)
    {
        NextTickListEntry nextticklistentry = new NextTickListEntry(p_22136_1_, p_22136_2_, p_22136_3_, p_22136_4_);
        byte byte0 = 8;
        if(field_4214_a)
        {
            if(func_640_a(nextticklistentry.field_1361_a - byte0, nextticklistentry.field_1360_b - byte0, nextticklistentry.field_1366_c - byte0, nextticklistentry.field_1361_a + byte0, nextticklistentry.field_1360_b + byte0, nextticklistentry.field_1366_c + byte0))
            {
                int i = func_600_a(nextticklistentry.field_1361_a, nextticklistentry.field_1360_b, nextticklistentry.field_1366_c);
                if(i == nextticklistentry.field_1365_d && i > 0)
                {
                    Block.field_345_n[i].func_208_a(this, nextticklistentry.field_1361_a, nextticklistentry.field_1360_b, nextticklistentry.field_1366_c, field_1037_n);
                }
            }
            return;
        }
        if(func_640_a(p_22136_1_ - byte0, p_22136_2_ - byte0, p_22136_3_ - byte0, p_22136_1_ + byte0, p_22136_2_ + byte0, p_22136_3_ + byte0))
        {
            if(p_22136_4_ > 0)
            {
                nextticklistentry.func_900_a((long)p_22136_5_ + field_22145_q.func_22304_f());
            }
            if(!field_1056_C.contains(nextticklistentry))
            {
                field_1056_C.add(nextticklistentry);
                field_1058_B.add(nextticklistentry);
            }
        }
    }

    public void func_41083_e(int p_41083_1_, int p_41083_2_, int p_41083_3_, int p_41083_4_, int p_41083_5_)
    {
        NextTickListEntry nextticklistentry = new NextTickListEntry(p_41083_1_, p_41083_2_, p_41083_3_, p_41083_4_);
        if(p_41083_4_ > 0)
        {
            nextticklistentry.func_900_a((long)p_41083_5_ + field_22145_q.func_22304_f());
        }
        if(!field_1056_C.contains(nextticklistentry))
        {
            field_1056_C.add(nextticklistentry);
            field_1058_B.add(nextticklistentry);
        }
    }

    public void func_633_c()
    {
        Profiler.func_40663_a("entities");
        Profiler.func_40663_a("global");
        for(int i = 0; i < field_27173_e.size(); i++)
        {
            Entity entity = (Entity)field_27173_e.get(i);
            entity.func_370_e_();
            if(entity.field_646_aA)
            {
                field_27173_e.remove(i--);
            }
        }

        Profiler.func_40661_c("remove");
        field_1050_a.removeAll(field_1024_A);
        for(int j = 0; j < field_1024_A.size(); j++)
        {
            Entity entity1 = (Entity)field_1024_A.get(j);
            int i1 = entity1.field_657_ba;
            int k1 = entity1.field_654_bc;
            if(entity1.field_621_aZ && func_620_h(i1, k1))
            {
                func_704_b(i1, k1).func_1015_b(entity1);
            }
        }

        for(int k = 0; k < field_1024_A.size(); k++)
        {
            func_678_c((Entity)field_1024_A.get(k));
        }

        field_1024_A.clear();
        Profiler.func_40661_c("regular");
        for(int l = 0; l < field_1050_a.size(); l++)
        {
            Entity entity2 = (Entity)field_1050_a.get(l);
            if(entity2.field_616_af != null)
            {
                if(!entity2.field_616_af.field_646_aA && entity2.field_616_af.field_617_ae == entity2)
                {
                    continue;
                }
                entity2.field_616_af.field_617_ae = null;
                entity2.field_616_af = null;
            }
            if(!entity2.field_646_aA)
            {
                func_667_e(entity2);
            }
            Profiler.func_40663_a("remove");
            if(entity2.field_646_aA)
            {
                int j1 = entity2.field_657_ba;
                int l1 = entity2.field_654_bc;
                if(entity2.field_621_aZ && func_620_h(j1, l1))
                {
                    func_704_b(j1, l1).func_1015_b(entity2);
                }
                field_1050_a.remove(l--);
                func_678_c(entity2);
            }
            Profiler.func_40662_b();
        }

        Profiler.func_40661_c("tileEntities");
        field_31055_L = true;
        Iterator iterator = field_1049_b.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            TileEntity tileentity = (TileEntity)iterator.next();
            if(!tileentity.func_31006_g() && tileentity.field_824_e != null && func_630_d(tileentity.field_823_f, tileentity.field_822_g, tileentity.field_821_h))
            {
                tileentity.func_475_b();
            }
            if(tileentity.func_31006_g())
            {
                iterator.remove();
                if(func_620_h(tileentity.field_823_f >> 4, tileentity.field_821_h >> 4))
                {
                    Chunk chunk = func_704_b(tileentity.field_823_f >> 4, tileentity.field_821_h >> 4);
                    if(chunk != null)
                    {
                        chunk.func_1023_e(tileentity.field_823_f & 0xf, tileentity.field_822_g, tileentity.field_821_h & 0xf);
                    }
                }
            }
        } while(true);
        field_31055_L = false;
        if(!field_34900_Q.isEmpty())
        {
            field_1049_b.removeAll(field_34900_Q);
            field_34900_Q.clear();
        }
        Profiler.func_40661_c("pendingTileEntities");
        if(!field_30900_E.isEmpty())
        {
            Iterator iterator1 = field_30900_E.iterator();
            do
            {
                if(!iterator1.hasNext())
                {
                    break;
                }
                TileEntity tileentity1 = (TileEntity)iterator1.next();
                if(!tileentity1.func_31006_g())
                {
                    if(!field_1049_b.contains(tileentity1))
                    {
                        field_1049_b.add(tileentity1);
                    }
                    if(func_620_h(tileentity1.field_823_f >> 4, tileentity1.field_821_h >> 4))
                    {
                        Chunk chunk1 = func_704_b(tileentity1.field_823_f >> 4, tileentity1.field_821_h >> 4);
                        if(chunk1 != null)
                        {
                            chunk1.func_1005_a(tileentity1.field_823_f & 0xf, tileentity1.field_822_g, tileentity1.field_821_h & 0xf, tileentity1);
                        }
                    }
                    func_665_h(tileentity1.field_823_f, tileentity1.field_822_g, tileentity1.field_821_h);
                }
            } while(true);
            field_30900_E.clear();
        }
        Profiler.func_40662_b();
        Profiler.func_40662_b();
    }

    public void func_31054_a(Collection p_31054_1_)
    {
        if(field_31055_L)
        {
            field_30900_E.addAll(p_31054_1_);
        } else
        {
            field_1049_b.addAll(p_31054_1_);
        }
    }

    public void func_667_e(Entity p_667_1_)
    {
        func_4084_a(p_667_1_, true);
    }

    public void func_4084_a(Entity p_4084_1_, boolean p_4084_2_)
    {
        int i = MathHelper.func_1108_b(p_4084_1_.field_611_ak);
        int j = MathHelper.func_1108_b(p_4084_1_.field_609_am);
        byte byte0 = 32;
        if(p_4084_2_ && !func_640_a(i - byte0, 0, j - byte0, i + byte0, 0, j + byte0))
        {
            return;
        }
        p_4084_1_.field_638_aI = p_4084_1_.field_611_ak;
        p_4084_1_.field_637_aJ = p_4084_1_.field_610_al;
        p_4084_1_.field_636_aK = p_4084_1_.field_609_am;
        p_4084_1_.field_603_as = p_4084_1_.field_605_aq;
        p_4084_1_.field_602_at = p_4084_1_.field_604_ar;
        if(p_4084_2_ && p_4084_1_.field_621_aZ)
        {
            if(p_4084_1_.field_616_af != null)
            {
                p_4084_1_.func_350_p();
            } else
            {
                p_4084_1_.func_370_e_();
            }
        }
        Profiler.func_40663_a("chunkCheck");
        if(Double.isNaN(p_4084_1_.field_611_ak) || Double.isInfinite(p_4084_1_.field_611_ak))
        {
            p_4084_1_.field_611_ak = p_4084_1_.field_638_aI;
        }
        if(Double.isNaN(p_4084_1_.field_610_al) || Double.isInfinite(p_4084_1_.field_610_al))
        {
            p_4084_1_.field_610_al = p_4084_1_.field_637_aJ;
        }
        if(Double.isNaN(p_4084_1_.field_609_am) || Double.isInfinite(p_4084_1_.field_609_am))
        {
            p_4084_1_.field_609_am = p_4084_1_.field_636_aK;
        }
        if(Double.isNaN(p_4084_1_.field_604_ar) || Double.isInfinite(p_4084_1_.field_604_ar))
        {
            p_4084_1_.field_604_ar = p_4084_1_.field_602_at;
        }
        if(Double.isNaN(p_4084_1_.field_605_aq) || Double.isInfinite(p_4084_1_.field_605_aq))
        {
            p_4084_1_.field_605_aq = p_4084_1_.field_603_as;
        }
        int k = MathHelper.func_1108_b(p_4084_1_.field_611_ak / 16D);
        int l = MathHelper.func_1108_b(p_4084_1_.field_610_al / 16D);
        int i1 = MathHelper.func_1108_b(p_4084_1_.field_609_am / 16D);
        if(!p_4084_1_.field_621_aZ || p_4084_1_.field_657_ba != k || p_4084_1_.field_656_bb != l || p_4084_1_.field_654_bc != i1)
        {
            if(p_4084_1_.field_621_aZ && func_620_h(p_4084_1_.field_657_ba, p_4084_1_.field_654_bc))
            {
                func_704_b(p_4084_1_.field_657_ba, p_4084_1_.field_654_bc).func_1016_a(p_4084_1_, p_4084_1_.field_656_bb);
            }
            if(func_620_h(k, i1))
            {
                p_4084_1_.field_621_aZ = true;
                func_704_b(k, i1).func_1000_a(p_4084_1_);
            } else
            {
                p_4084_1_.field_621_aZ = false;
            }
        }
        Profiler.func_40662_b();
        if(p_4084_2_ && p_4084_1_.field_621_aZ && p_4084_1_.field_617_ae != null)
        {
            if(p_4084_1_.field_617_ae.field_646_aA || p_4084_1_.field_617_ae.field_616_af != p_4084_1_)
            {
                p_4084_1_.field_617_ae.field_616_af = null;
                p_4084_1_.field_617_ae = null;
            } else
            {
                func_667_e(p_4084_1_.field_617_ae);
            }
        }
    }

    public boolean func_604_a(AxisAlignedBB p_604_1_)
    {
        List list = func_659_b(null, p_604_1_);
        for(int i = 0; i < list.size(); i++)
        {
            Entity entity = (Entity)list.get(i);
            if(!entity.field_646_aA && entity.field_618_ad)
            {
                return false;
            }
        }

        return true;
    }

    public boolean func_662_b(AxisAlignedBB p_662_1_)
    {
        int i = MathHelper.func_1108_b(p_662_1_.field_1698_a);
        int j = MathHelper.func_1108_b(p_662_1_.field_1703_d + 1.0D);
        int k = MathHelper.func_1108_b(p_662_1_.field_1697_b);
        int l = MathHelper.func_1108_b(p_662_1_.field_1702_e + 1.0D);
        int i1 = MathHelper.func_1108_b(p_662_1_.field_1704_c);
        int j1 = MathHelper.func_1108_b(p_662_1_.field_1701_f + 1.0D);
        if(p_662_1_.field_1698_a < 0.0D)
        {
            i--;
        }
        if(p_662_1_.field_1697_b < 0.0D)
        {
            k--;
        }
        if(p_662_1_.field_1704_c < 0.0D)
        {
            i1--;
        }
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    Block block = Block.field_345_n[func_600_a(k1, l1, i2)];
                    if(block != null && block.field_356_bn.func_879_d())
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public boolean func_605_c(AxisAlignedBB p_605_1_)
    {
        int i = MathHelper.func_1108_b(p_605_1_.field_1698_a);
        int j = MathHelper.func_1108_b(p_605_1_.field_1703_d + 1.0D);
        int k = MathHelper.func_1108_b(p_605_1_.field_1697_b);
        int l = MathHelper.func_1108_b(p_605_1_.field_1702_e + 1.0D);
        int i1 = MathHelper.func_1108_b(p_605_1_.field_1704_c);
        int j1 = MathHelper.func_1108_b(p_605_1_.field_1701_f + 1.0D);
        if(func_640_a(i, k, i1, j, l, j1))
        {
            for(int k1 = i; k1 < j; k1++)
            {
                for(int l1 = k; l1 < l; l1++)
                {
                    for(int i2 = i1; i2 < j1; i2++)
                    {
                        int j2 = func_600_a(k1, l1, i2);
                        if(j2 == Block.field_402_as.field_376_bc || j2 == Block.field_397_D.field_376_bc || j2 == Block.field_395_E.field_376_bc)
                        {
                            return true;
                        }
                    }

                }

            }

        }
        return false;
    }

    public boolean func_682_a(AxisAlignedBB p_682_1_, Material p_682_2_, Entity p_682_3_)
    {
        int i = MathHelper.func_1108_b(p_682_1_.field_1698_a);
        int j = MathHelper.func_1108_b(p_682_1_.field_1703_d + 1.0D);
        int k = MathHelper.func_1108_b(p_682_1_.field_1697_b);
        int l = MathHelper.func_1108_b(p_682_1_.field_1702_e + 1.0D);
        int i1 = MathHelper.func_1108_b(p_682_1_.field_1704_c);
        int j1 = MathHelper.func_1108_b(p_682_1_.field_1701_f + 1.0D);
        if(!func_640_a(i, k, i1, j, l, j1))
        {
            return false;
        }
        boolean flag = false;
        Vec3D vec3d = Vec3D.func_1248_b(0.0D, 0.0D, 0.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    Block block = Block.field_345_n[func_600_a(k1, l1, i2)];
                    if(block == null || block.field_356_bn != p_682_2_)
                    {
                        continue;
                    }
                    double d1 = (float)(l1 + 1) - BlockFluid.func_288_b(func_602_e(k1, l1, i2));
                    if((double)l >= d1)
                    {
                        flag = true;
                        block.func_257_a(this, k1, l1, i2, p_682_3_, vec3d);
                    }
                }

            }

        }

        if(vec3d.func_1253_c() > 0.0D)
        {
            vec3d = vec3d.func_1252_b();
            double d = 0.014D;
            p_682_3_.field_608_an += vec3d.field_1776_a * d;
            p_682_3_.field_607_ao += vec3d.field_1775_b * d;
            p_682_3_.field_606_ap += vec3d.field_1779_c * d;
        }
        return flag;
    }

    public boolean func_689_a(AxisAlignedBB p_689_1_, Material p_689_2_)
    {
        int i = MathHelper.func_1108_b(p_689_1_.field_1698_a);
        int j = MathHelper.func_1108_b(p_689_1_.field_1703_d + 1.0D);
        int k = MathHelper.func_1108_b(p_689_1_.field_1697_b);
        int l = MathHelper.func_1108_b(p_689_1_.field_1702_e + 1.0D);
        int i1 = MathHelper.func_1108_b(p_689_1_.field_1704_c);
        int j1 = MathHelper.func_1108_b(p_689_1_.field_1701_f + 1.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    Block block = Block.field_345_n[func_600_a(k1, l1, i2)];
                    if(block != null && block.field_356_bn == p_689_2_)
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public boolean func_707_b(AxisAlignedBB p_707_1_, Material p_707_2_)
    {
        int i = MathHelper.func_1108_b(p_707_1_.field_1698_a);
        int j = MathHelper.func_1108_b(p_707_1_.field_1703_d + 1.0D);
        int k = MathHelper.func_1108_b(p_707_1_.field_1697_b);
        int l = MathHelper.func_1108_b(p_707_1_.field_1702_e + 1.0D);
        int i1 = MathHelper.func_1108_b(p_707_1_.field_1704_c);
        int j1 = MathHelper.func_1108_b(p_707_1_.field_1701_f + 1.0D);
        for(int k1 = i; k1 < j; k1++)
        {
            for(int l1 = k; l1 < l; l1++)
            {
                for(int i2 = i1; i2 < j1; i2++)
                {
                    Block block = Block.field_345_n[func_600_a(k1, l1, i2)];
                    if(block == null || block.field_356_bn != p_707_2_)
                    {
                        continue;
                    }
                    int j2 = func_602_e(k1, l1, i2);
                    double d = l1 + 1;
                    if(j2 < 8)
                    {
                        d = (double)(l1 + 1) - (double)j2 / 8D;
                    }
                    if(d >= p_707_1_.field_1697_b)
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public Explosion func_12243_a(Entity p_12243_1_, double p_12243_2_, double p_12243_4_, double p_12243_6_, 
            float p_12243_8_)
    {
        return func_12244_a(p_12243_1_, p_12243_2_, p_12243_4_, p_12243_6_, p_12243_8_, false);
    }

    public Explosion func_12244_a(Entity p_12244_1_, double p_12244_2_, double p_12244_4_, double p_12244_6_, 
            float p_12244_8_, boolean p_12244_9_)
    {
        Explosion explosion = new Explosion(this, p_12244_1_, p_12244_2_, p_12244_4_, p_12244_6_, p_12244_8_);
        explosion.field_12257_a = p_12244_9_;
        explosion.func_12248_a();
        explosion.func_12247_b(true);
        return explosion;
    }

    public float func_675_a(Vec3D p_675_1_, AxisAlignedBB p_675_2_)
    {
        double d = 1.0D / ((p_675_2_.field_1703_d - p_675_2_.field_1698_a) * 2D + 1.0D);
        double d1 = 1.0D / ((p_675_2_.field_1702_e - p_675_2_.field_1697_b) * 2D + 1.0D);
        double d2 = 1.0D / ((p_675_2_.field_1701_f - p_675_2_.field_1704_c) * 2D + 1.0D);
        int i = 0;
        int j = 0;
        for(float f = 0.0F; f <= 1.0F; f = (float)((double)f + d))
        {
            for(float f1 = 0.0F; f1 <= 1.0F; f1 = (float)((double)f1 + d1))
            {
                for(float f2 = 0.0F; f2 <= 1.0F; f2 = (float)((double)f2 + d2))
                {
                    double d3 = p_675_2_.field_1698_a + (p_675_2_.field_1703_d - p_675_2_.field_1698_a) * (double)f;
                    double d4 = p_675_2_.field_1697_b + (p_675_2_.field_1702_e - p_675_2_.field_1697_b) * (double)f1;
                    double d5 = p_675_2_.field_1704_c + (p_675_2_.field_1701_f - p_675_2_.field_1704_c) * (double)f2;
                    if(func_645_a(Vec3D.func_1248_b(d3, d4, d5), p_675_1_) == null)
                    {
                        i++;
                    }
                    j++;
                }

            }

        }

        return (float)i / (float)j;
    }

    public boolean func_48457_a(EntityPlayer p_48457_1_, int p_48457_2_, int p_48457_3_, int p_48457_4_, int p_48457_5_)
    {
        if(p_48457_5_ == 0)
        {
            p_48457_3_--;
        }
        if(p_48457_5_ == 1)
        {
            p_48457_3_++;
        }
        if(p_48457_5_ == 2)
        {
            p_48457_4_--;
        }
        if(p_48457_5_ == 3)
        {
            p_48457_4_++;
        }
        if(p_48457_5_ == 4)
        {
            p_48457_2_--;
        }
        if(p_48457_5_ == 5)
        {
            p_48457_2_++;
        }
        if(func_600_a(p_48457_2_, p_48457_3_, p_48457_4_) == Block.field_402_as.field_376_bc)
        {
            func_28107_a(p_48457_1_, 1004, p_48457_2_, p_48457_3_, p_48457_4_, 0);
            func_690_d(p_48457_2_, p_48457_3_, p_48457_4_, 0);
            return true;
        } else
        {
            return false;
        }
    }

    public Entity func_4085_a(Class p_4085_1_)
    {
        return null;
    }

    public String func_687_d()
    {
        return (new StringBuilder()).append("All: ").append(field_1050_a.size()).toString();
    }

    public String func_21119_g()
    {
        return field_1017_H.func_21109_c();
    }

    public TileEntity func_603_b(int p_603_1_, int p_603_2_, int p_603_3_)
    {
label0:
        {
            TileEntity tileentity;
label1:
            {
                if(p_603_2_ >= 256)
                {
                    return null;
                }
                Chunk chunk = func_704_b(p_603_1_ >> 4, p_603_3_ >> 4);
                if(chunk == null)
                {
                    break label0;
                }
                tileentity = chunk.func_1002_d(p_603_1_ & 0xf, p_603_2_, p_603_3_ & 0xf);
                if(tileentity != null)
                {
                    break label1;
                }
                Iterator iterator = field_30900_E.iterator();
                TileEntity tileentity1;
                do
                {
                    if(!iterator.hasNext())
                    {
                        break label1;
                    }
                    tileentity1 = (TileEntity)iterator.next();
                } while(tileentity1.func_31006_g() || tileentity1.field_823_f != p_603_1_ || tileentity1.field_822_g != p_603_2_ || tileentity1.field_821_h != p_603_3_);
                tileentity = tileentity1;
            }
            return tileentity;
        }
        return null;
    }

    public void func_654_a(int p_654_1_, int p_654_2_, int p_654_3_, TileEntity p_654_4_)
    {
        if(p_654_4_ != null && !p_654_4_.func_31006_g())
        {
            if(field_31055_L)
            {
                p_654_4_.field_823_f = p_654_1_;
                p_654_4_.field_822_g = p_654_2_;
                p_654_4_.field_821_h = p_654_3_;
                field_30900_E.add(p_654_4_);
            } else
            {
                field_1049_b.add(p_654_4_);
                Chunk chunk = func_704_b(p_654_1_ >> 4, p_654_3_ >> 4);
                if(chunk != null)
                {
                    chunk.func_1005_a(p_654_1_ & 0xf, p_654_2_, p_654_3_ & 0xf, p_654_4_);
                }
            }
        }
    }

    public void func_692_l(int p_692_1_, int p_692_2_, int p_692_3_)
    {
        TileEntity tileentity = func_603_b(p_692_1_, p_692_2_, p_692_3_);
        if(tileentity != null && field_31055_L)
        {
            tileentity.func_31005_i();
            field_30900_E.remove(tileentity);
        } else
        {
            if(tileentity != null)
            {
                field_30900_E.remove(tileentity);
                field_1049_b.remove(tileentity);
            }
            Chunk chunk = func_704_b(p_692_1_ >> 4, p_692_3_ >> 4);
            if(chunk != null)
            {
                chunk.func_1023_e(p_692_1_ & 0xf, p_692_2_, p_692_3_ & 0xf);
            }
        }
    }

    public void func_35455_a(TileEntity p_35455_1_)
    {
        field_34900_Q.add(p_35455_1_);
    }

    public boolean func_601_g(int p_601_1_, int p_601_2_, int p_601_3_)
    {
        Block block = Block.field_345_n[func_600_a(p_601_1_, p_601_2_, p_601_3_)];
        if(block == null)
        {
            return false;
        } else
        {
            return block.func_217_b();
        }
    }

    public boolean func_28100_h(int p_28100_1_, int p_28100_2_, int p_28100_3_)
    {
        return Block.func_48206_g(func_600_a(p_28100_1_, p_28100_2_, p_28100_3_));
    }

    public boolean func_41082_b(int p_41082_1_, int p_41082_2_, int p_41082_3_, boolean p_41082_4_)
    {
        if(p_41082_1_ < 0xfe363c80 || p_41082_3_ < 0xfe363c80 || p_41082_1_ >= 0x1c9c380 || p_41082_3_ >= 0x1c9c380)
        {
            return p_41082_4_;
        }
        Chunk chunk = field_1017_H.func_533_b(p_41082_1_ >> 4, p_41082_3_ >> 4);
        if(chunk == null || chunk.func_21167_h())
        {
            return p_41082_4_;
        }
        Block block = Block.field_345_n[func_600_a(p_41082_1_, p_41082_2_, p_41082_3_)];
        if(block == null)
        {
            return false;
        } else
        {
            return block.field_356_bn.func_28126_h() && block.func_242_c();
        }
    }

    public void func_651_a(IProgressUpdate p_651_1_)
    {
        func_639_a(true, p_651_1_);
        try
        {
            ThreadedFileIOBase.field_40573_a.func_40566_a();
        }
        catch(InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }

    public void func_644_f()
    {
        int i = func_671_a(1.0F);
        if(i != field_1046_e)
        {
            field_1046_e = i;
        }
    }

    public void func_21114_a(boolean p_21114_1_, boolean p_21114_2_)
    {
        field_21121_K = p_21114_1_;
        field_21120_L = p_21114_2_;
    }

    public void func_649_g()
    {
        if(func_22144_v().func_40724_s() && field_1039_l < 3)
        {
            field_1039_l = 3;
        }
        field_4209_q.field_4215_b.func_35561_b();
        func_27165_m();
        if(func_22142_y())
        {
            boolean flag = false;
            if(field_21121_K)
            {
                if(field_1039_l < 1);
            }
            if(!flag)
            {
                long l = field_22145_q.func_22304_f() + 24000L;
                field_22145_q.func_22307_a(l - l % 24000L);
                func_22141_x();
            }
        }
        Profiler.func_40663_a("mobSpawner");
        SpawnerAnimals.func_4154_a(this, field_21121_K, field_21120_L && field_22145_q.func_22304_f() % 400L == 0L);
        Profiler.func_40661_c("chunkSource");
        field_1017_H.func_532_a();
        int i = func_671_a(1.0F);
        if(i != field_1046_e)
        {
            field_1046_e = i;
        }
        long l1 = field_22145_q.func_22304_f() + 1L;
        if(l1 % (long)field_9435_j == 0L)
        {
            Profiler.func_40661_c("save");
            func_639_a(false, null);
        }
        field_22145_q.func_22307_a(l1);
        Profiler.func_40661_c("tickPending");
        func_700_a(false);
        Profiler.func_40661_c("tickTiles");
        func_4080_j();
        Profiler.func_40661_c("village");
        field_48465_A.func_48558_a();
        field_48466_O.func_48573_a();
        Profiler.func_40662_b();
    }

    private void func_27163_E()
    {
        if(field_22145_q.func_27397_o())
        {
            field_27171_C = 1.0F;
            if(field_22145_q.func_27396_m())
            {
                field_27169_E = 1.0F;
            }
        }
    }

    protected void func_27165_m()
    {
        if(field_4209_q.field_6478_e)
        {
            return;
        }
        if(field_27168_F > 0)
        {
            field_27168_F--;
        }
        int i = field_22145_q.func_27400_n();
        if(i <= 0)
        {
            if(field_22145_q.func_27396_m())
            {
                field_22145_q.func_27399_e(field_1037_n.nextInt(12000) + 3600);
            } else
            {
                field_22145_q.func_27399_e(field_1037_n.nextInt(0x29040) + 12000);
            }
        } else
        {
            i--;
            field_22145_q.func_27399_e(i);
            if(i <= 0)
            {
                field_22145_q.func_27398_a(!field_22145_q.func_27396_m());
            }
        }
        int j = field_22145_q.func_27393_p();
        if(j <= 0)
        {
            if(field_22145_q.func_27397_o())
            {
                field_22145_q.func_27395_f(field_1037_n.nextInt(12000) + 12000);
            } else
            {
                field_22145_q.func_27395_f(field_1037_n.nextInt(0x29040) + 12000);
            }
        } else
        {
            j--;
            field_22145_q.func_27395_f(j);
            if(j <= 0)
            {
                field_22145_q.func_27394_b(!field_22145_q.func_27397_o());
            }
        }
        field_26901_B = field_27171_C;
        if(field_22145_q.func_27397_o())
        {
            field_27171_C += 0.01D;
        } else
        {
            field_27171_C -= 0.01D;
        }
        if(field_27171_C < 0.0F)
        {
            field_27171_C = 0.0F;
        }
        if(field_27171_C > 1.0F)
        {
            field_27171_C = 1.0F;
        }
        field_27170_D = field_27169_E;
        if(field_22145_q.func_27396_m())
        {
            field_27169_E += 0.01D;
        } else
        {
            field_27169_E -= 0.01D;
        }
        if(field_27169_E < 0.0F)
        {
            field_27169_E = 0.0F;
        }
        if(field_27169_E > 1.0F)
        {
            field_27169_E = 1.0F;
        }
    }

    private void func_27164_F()
    {
        field_22145_q.func_27395_f(0);
        field_22145_q.func_27394_b(false);
        field_22145_q.func_27399_e(0);
        field_22145_q.func_27398_a(false);
    }

    protected void func_48461_r()
    {
        field_9427_K.clear();
        Profiler.func_40663_a("buildList");
        for(int i = 0; i < field_1040_k.size(); i++)
        {
            EntityPlayer entityplayer = (EntityPlayer)field_1040_k.get(i);
            int k = MathHelper.func_1108_b(entityplayer.field_611_ak / 16D);
            int i1 = MathHelper.func_1108_b(entityplayer.field_609_am / 16D);
            byte byte0 = 7;
            for(int l1 = -byte0; l1 <= byte0; l1++)
            {
                for(int i2 = -byte0; i2 <= byte0; i2++)
                {
                    field_9427_K.add(new ChunkCoordIntPair(l1 + k, i2 + i1));
                }

            }

        }

        Profiler.func_40662_b();
        if(field_9426_L > 0)
        {
            field_9426_L--;
        }
        Profiler.func_40663_a("playerCheckLight");
        if(!field_1040_k.isEmpty())
        {
            int j = field_1037_n.nextInt(field_1040_k.size());
            EntityPlayer entityplayer1 = (EntityPlayer)field_1040_k.get(j);
            int l = (MathHelper.func_1108_b(entityplayer1.field_611_ak) + field_1037_n.nextInt(11)) - 5;
            int j1 = (MathHelper.func_1108_b(entityplayer1.field_610_al) + field_1037_n.nextInt(11)) - 5;
            int k1 = (MathHelper.func_1108_b(entityplayer1.field_609_am) + field_1037_n.nextInt(11)) - 5;
            func_35463_p(l, j1, k1);
        }
        Profiler.func_40662_b();
    }

    protected void func_48458_a(int p_48458_1_, int p_48458_2_, Chunk p_48458_3_)
    {
        Profiler.func_40661_c("tickChunk");
        p_48458_3_.func_35841_j();
        Profiler.func_40661_c("moodSound");
        if(field_9426_L == 0)
        {
            field_9437_g = field_9437_g * 3 + 0x3c6ef35f;
            int i = field_9437_g >> 2;
            int j = i & 0xf;
            int k = i >> 8 & 0xf;
            int l = i >> 16 & 0x7f;
            int i1 = p_48458_3_.func_1008_a(j, l, k);
            j += p_48458_1_;
            k += p_48458_2_;
            if(i1 == 0 && func_28104_m(j, l, k) <= field_1037_n.nextInt(8) && func_641_a(EnumSkyBlock.Sky, j, l, k) <= 0)
            {
                EntityPlayer entityplayer = func_683_a((double)j + 0.5D, (double)l + 0.5D, (double)k + 0.5D, 8D);
                if(entityplayer != null && entityplayer.func_360_d((double)j + 0.5D, (double)l + 0.5D, (double)k + 0.5D) > 4D)
                {
                    func_684_a((double)j + 0.5D, (double)l + 0.5D, (double)k + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + field_1037_n.nextFloat() * 0.2F);
                    field_9426_L = field_1037_n.nextInt(12000) + 6000;
                }
            }
        }
        Profiler.func_40661_c("checkLight");
        p_48458_3_.func_48491_o();
    }

    protected void func_4080_j()
    {
        func_48461_r();
        int i = 0;
        int j = 0;
        for(Iterator iterator = field_9427_K.iterator(); iterator.hasNext(); Profiler.func_40662_b())
        {
            ChunkCoordIntPair chunkcoordintpair = (ChunkCoordIntPair)iterator.next();
            int k = chunkcoordintpair.field_189_a * 16;
            int l = chunkcoordintpair.field_188_b * 16;
            Profiler.func_40663_a("getChunk");
            Chunk chunk = func_704_b(chunkcoordintpair.field_189_a, chunkcoordintpair.field_188_b);
            func_48458_a(k, l, chunk);
            Profiler.func_40661_c("thunder");
            if(field_1037_n.nextInt(0x186a0) == 0 && func_27161_C() && func_27160_B())
            {
                field_9437_g = field_9437_g * 3 + 0x3c6ef35f;
                int i1 = field_9437_g >> 2;
                int k1 = k + (i1 & 0xf);
                int j2 = l + (i1 >> 8 & 0xf);
                int i3 = func_35461_e(k1, j2);
                if(func_27167_r(k1, i3, j2))
                {
                    func_27159_a(new EntityLightningBolt(this, k1, i3, j2));
                    field_27168_F = 2;
                }
            }
            Profiler.func_40661_c("iceandsnow");
            if(field_1037_n.nextInt(16) == 0)
            {
                field_9437_g = field_9437_g * 3 + 0x3c6ef35f;
                int j1 = field_9437_g >> 2;
                int l1 = j1 & 0xf;
                int k2 = j1 >> 8 & 0xf;
                int j3 = func_35461_e(l1 + k, k2 + l);
                if(func_40481_q(l1 + k, j3 - 1, k2 + l))
                {
                    func_690_d(l1 + k, j3 - 1, k2 + l, Block.field_4063_aU.field_376_bc);
                }
                if(func_27161_C() && func_40478_r(l1 + k, j3, k2 + l))
                {
                    func_690_d(l1 + k, j3, k2 + l, Block.field_428_aT.field_376_bc);
                }
            }
            Profiler.func_40661_c("tickTiles");
            ExtendedBlockStorage aextendedblockstorage[] = chunk.func_48495_i();
            int i2 = aextendedblockstorage.length;
            for(int l2 = 0; l2 < i2; l2++)
            {
                ExtendedBlockStorage extendedblockstorage = aextendedblockstorage[l2];
                if(extendedblockstorage == null || !extendedblockstorage.func_48698_b())
                {
                    continue;
                }
                for(int k3 = 0; k3 < 3; k3++)
                {
                    field_9437_g = field_9437_g * 3 + 0x3c6ef35f;
                    int l3 = field_9437_g >> 2;
                    int i4 = l3 & 0xf;
                    int j4 = l3 >> 8 & 0xf;
                    int k4 = l3 >> 16 & 0xf;
                    int l4 = extendedblockstorage.func_48703_a(i4, k4, j4);
                    j++;
                    Block block = Block.field_345_n[l4];
                    if(block != null && block.func_48203_o())
                    {
                        i++;
                        block.func_208_a(this, i4 + k, k4 + extendedblockstorage.func_48707_c(), j4 + l, field_1037_n);
                    }
                }

            }

        }

    }

    public boolean func_40471_p(int p_40471_1_, int p_40471_2_, int p_40471_3_)
    {
        return func_40476_b(p_40471_1_, p_40471_2_, p_40471_3_, false);
    }

    public boolean func_40481_q(int p_40481_1_, int p_40481_2_, int p_40481_3_)
    {
        return func_40476_b(p_40481_1_, p_40481_2_, p_40481_3_, true);
    }

    public boolean func_40476_b(int p_40476_1_, int p_40476_2_, int p_40476_3_, boolean p_40476_4_)
    {
        BiomeGenBase biomegenbase = func_48454_a(p_40476_1_, p_40476_3_);
        float f = biomegenbase.func_48411_i();
        if(f > 0.15F)
        {
            return false;
        }
        if(p_40476_2_ >= 0 && p_40476_2_ < 256 && func_641_a(EnumSkyBlock.Block, p_40476_1_, p_40476_2_, p_40476_3_) < 10)
        {
            int i = func_600_a(p_40476_1_, p_40476_2_, p_40476_3_);
            if((i == Block.field_399_C.field_376_bc || i == Block.field_401_B.field_376_bc) && func_602_e(p_40476_1_, p_40476_2_, p_40476_3_) == 0)
            {
                if(!p_40476_4_)
                {
                    return true;
                }
                boolean flag = true;
                if(flag && func_599_f(p_40476_1_ - 1, p_40476_2_, p_40476_3_) != Material.field_1332_f)
                {
                    flag = false;
                }
                if(flag && func_599_f(p_40476_1_ + 1, p_40476_2_, p_40476_3_) != Material.field_1332_f)
                {
                    flag = false;
                }
                if(flag && func_599_f(p_40476_1_, p_40476_2_, p_40476_3_ - 1) != Material.field_1332_f)
                {
                    flag = false;
                }
                if(flag && func_599_f(p_40476_1_, p_40476_2_, p_40476_3_ + 1) != Material.field_1332_f)
                {
                    flag = false;
                }
                if(!flag)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean func_40478_r(int p_40478_1_, int p_40478_2_, int p_40478_3_)
    {
        BiomeGenBase biomegenbase = func_48454_a(p_40478_1_, p_40478_3_);
        float f = biomegenbase.func_48411_i();
        if(f > 0.15F)
        {
            return false;
        }
        if(p_40478_2_ >= 0 && p_40478_2_ < 256 && func_641_a(EnumSkyBlock.Block, p_40478_1_, p_40478_2_, p_40478_3_) < 10)
        {
            int i = func_600_a(p_40478_1_, p_40478_2_ - 1, p_40478_3_);
            int j = func_600_a(p_40478_1_, p_40478_2_, p_40478_3_);
            if(j == 0 && Block.field_428_aT.func_243_a(this, p_40478_1_, p_40478_2_, p_40478_3_) && i != 0 && i != Block.field_4063_aU.field_376_bc && Block.field_345_n[i].field_356_bn.func_880_c())
            {
                return true;
            }
        }
        return false;
    }

    public void func_35463_p(int p_35463_1_, int p_35463_2_, int p_35463_3_)
    {
        if(!field_4209_q.field_6478_e)
        {
            func_35459_c(EnumSkyBlock.Sky, p_35463_1_, p_35463_2_, p_35463_3_);
        }
        func_35459_c(EnumSkyBlock.Block, p_35463_1_, p_35463_2_, p_35463_3_);
    }

    private int func_35460_a(int p_35460_1_, int p_35460_2_, int p_35460_3_, int p_35460_4_, int p_35460_5_, int p_35460_6_)
    {
        int i = 0;
        if(func_647_i(p_35460_2_, p_35460_3_, p_35460_4_))
        {
            i = 15;
        } else
        {
            if(p_35460_6_ == 0)
            {
                p_35460_6_ = 1;
            }
            int j = func_641_a(EnumSkyBlock.Sky, p_35460_2_ - 1, p_35460_3_, p_35460_4_) - p_35460_6_;
            int k = func_641_a(EnumSkyBlock.Sky, p_35460_2_ + 1, p_35460_3_, p_35460_4_) - p_35460_6_;
            int l = func_641_a(EnumSkyBlock.Sky, p_35460_2_, p_35460_3_ - 1, p_35460_4_) - p_35460_6_;
            int i1 = func_641_a(EnumSkyBlock.Sky, p_35460_2_, p_35460_3_ + 1, p_35460_4_) - p_35460_6_;
            int j1 = func_641_a(EnumSkyBlock.Sky, p_35460_2_, p_35460_3_, p_35460_4_ - 1) - p_35460_6_;
            int k1 = func_641_a(EnumSkyBlock.Sky, p_35460_2_, p_35460_3_, p_35460_4_ + 1) - p_35460_6_;
            if(j > i)
            {
                i = j;
            }
            if(k > i)
            {
                i = k;
            }
            if(l > i)
            {
                i = l;
            }
            if(i1 > i)
            {
                i = i1;
            }
            if(j1 > i)
            {
                i = j1;
            }
            if(k1 > i)
            {
                i = k1;
            }
        }
        return i;
    }

    private int func_35458_d(int p_35458_1_, int p_35458_2_, int p_35458_3_, int p_35458_4_, int p_35458_5_, int p_35458_6_)
    {
        int i = Block.field_339_t[p_35458_5_];
        int j = func_641_a(EnumSkyBlock.Block, p_35458_2_ - 1, p_35458_3_, p_35458_4_) - p_35458_6_;
        int k = func_641_a(EnumSkyBlock.Block, p_35458_2_ + 1, p_35458_3_, p_35458_4_) - p_35458_6_;
        int l = func_641_a(EnumSkyBlock.Block, p_35458_2_, p_35458_3_ - 1, p_35458_4_) - p_35458_6_;
        int i1 = func_641_a(EnumSkyBlock.Block, p_35458_2_, p_35458_3_ + 1, p_35458_4_) - p_35458_6_;
        int j1 = func_641_a(EnumSkyBlock.Block, p_35458_2_, p_35458_3_, p_35458_4_ - 1) - p_35458_6_;
        int k1 = func_641_a(EnumSkyBlock.Block, p_35458_2_, p_35458_3_, p_35458_4_ + 1) - p_35458_6_;
        if(j > i)
        {
            i = j;
        }
        if(k > i)
        {
            i = k;
        }
        if(l > i)
        {
            i = l;
        }
        if(i1 > i)
        {
            i = i1;
        }
        if(j1 > i)
        {
            i = j1;
        }
        if(k1 > i)
        {
            i = k1;
        }
        return i;
    }

    public void func_35459_c(EnumSkyBlock p_35459_1_, int p_35459_2_, int p_35459_3_, int p_35459_4_)
    {
        if(!func_21117_a(p_35459_2_, p_35459_3_, p_35459_4_, 17))
        {
            return;
        }
        int i = 0;
        int j = 0;
        Profiler.func_40663_a("getBrightness");
        int k = func_641_a(p_35459_1_, p_35459_2_, p_35459_3_, p_35459_4_);
        int i1 = 0;
        int k1 = k;
        int j2 = func_600_a(p_35459_2_, p_35459_3_, p_35459_4_);
        int i3 = func_48462_d(p_35459_2_, p_35459_3_, p_35459_4_);
        if(i3 == 0)
        {
            i3 = 1;
        }
        int l3 = 0;
        if(p_35459_1_ == EnumSkyBlock.Sky)
        {
            l3 = func_35460_a(k1, p_35459_2_, p_35459_3_, p_35459_4_, j2, i3);
        } else
        {
            l3 = func_35458_d(k1, p_35459_2_, p_35459_3_, p_35459_4_, j2, i3);
        }
        i1 = l3;
        if(i1 > k)
        {
            field_35466_H[j++] = 0x20820;
        } else
        if(i1 < k)
        {
            if(p_35459_1_ == EnumSkyBlock.Block);
            field_35466_H[j++] = 0x20820 + (k << 18);
            do
            {
                if(i >= j)
                {
                    break;
                }
                int l1 = field_35466_H[i++];
                int k2 = ((l1 & 0x3f) - 32) + p_35459_2_;
                int j3 = ((l1 >> 6 & 0x3f) - 32) + p_35459_3_;
                int i4 = ((l1 >> 12 & 0x3f) - 32) + p_35459_4_;
                int k4 = l1 >> 18 & 0xf;
                int i5 = func_641_a(p_35459_1_, k2, j3, i4);
                if(i5 == k4)
                {
                    func_664_b(p_35459_1_, k2, j3, i4, 0);
                    if(k4 > 0)
                    {
                        int l5 = k2 - p_35459_2_;
                        int j6 = j3 - p_35459_3_;
                        int l6 = i4 - p_35459_4_;
                        if(l5 < 0)
                        {
                            l5 = -l5;
                        }
                        if(j6 < 0)
                        {
                            j6 = -j6;
                        }
                        if(l6 < 0)
                        {
                            l6 = -l6;
                        }
                        if(l5 + j6 + l6 < 17)
                        {
                            int j7 = 0;
                            while(j7 < 6) 
                            {
                                int k7 = (j7 % 2) * 2 - 1;
                                int l7 = k2 + (((j7 / 2) % 3) / 2) * k7;
                                int i8 = j3 + (((j7 / 2 + 1) % 3) / 2) * k7;
                                int j8 = i4 + (((j7 / 2 + 2) % 3) / 2) * k7;
                                int j5 = func_641_a(p_35459_1_, l7, i8, j8);
                                int k8 = Block.field_341_r[func_600_a(l7, i8, j8)];
                                if(k8 == 0)
                                {
                                    k8 = 1;
                                }
                                if(j5 == k4 - k8 && j < field_35466_H.length)
                                {
                                    field_35466_H[j++] = (l7 - p_35459_2_) + 32 + ((i8 - p_35459_3_) + 32 << 6) + ((j8 - p_35459_4_) + 32 << 12) + (k4 - k8 << 18);
                                }
                                j7++;
                            }
                        }
                    }
                }
            } while(true);
            i = 0;
        }
        Profiler.func_40662_b();
        Profiler.func_40663_a("tcp < tcc");
        do
        {
            if(i >= j)
            {
                break;
            }
            int l = field_35466_H[i++];
            int j1 = ((l & 0x3f) - 32) + p_35459_2_;
            int i2 = ((l >> 6 & 0x3f) - 32) + p_35459_3_;
            int l2 = ((l >> 12 & 0x3f) - 32) + p_35459_4_;
            int k3 = func_641_a(p_35459_1_, j1, i2, l2);
            int j4 = func_600_a(j1, i2, l2);
            int l4 = Block.field_341_r[j4];
            if(l4 == 0)
            {
                l4 = 1;
            }
            int k5 = 0;
            if(p_35459_1_ == EnumSkyBlock.Sky)
            {
                k5 = func_35460_a(k3, j1, i2, l2, j4, l4);
            } else
            {
                k5 = func_35458_d(k3, j1, i2, l2, j4, l4);
            }
            if(k5 != k3)
            {
                func_664_b(p_35459_1_, j1, i2, l2, k5);
                if(k5 > k3)
                {
                    int i6 = j1 - p_35459_2_;
                    int k6 = i2 - p_35459_3_;
                    int i7 = l2 - p_35459_4_;
                    if(i6 < 0)
                    {
                        i6 = -i6;
                    }
                    if(k6 < 0)
                    {
                        k6 = -k6;
                    }
                    if(i7 < 0)
                    {
                        i7 = -i7;
                    }
                    if(i6 + k6 + i7 < 17 && j < field_35466_H.length - 6)
                    {
                        if(func_641_a(p_35459_1_, j1 - 1, i2, l2) < k5)
                        {
                            field_35466_H[j++] = (j1 - 1 - p_35459_2_) + 32 + ((i2 - p_35459_3_) + 32 << 6) + ((l2 - p_35459_4_) + 32 << 12);
                        }
                        if(func_641_a(p_35459_1_, j1 + 1, i2, l2) < k5)
                        {
                            field_35466_H[j++] = ((j1 + 1) - p_35459_2_) + 32 + ((i2 - p_35459_3_) + 32 << 6) + ((l2 - p_35459_4_) + 32 << 12);
                        }
                        if(func_641_a(p_35459_1_, j1, i2 - 1, l2) < k5)
                        {
                            field_35466_H[j++] = (j1 - p_35459_2_) + 32 + ((i2 - 1 - p_35459_3_) + 32 << 6) + ((l2 - p_35459_4_) + 32 << 12);
                        }
                        if(func_641_a(p_35459_1_, j1, i2 + 1, l2) < k5)
                        {
                            field_35466_H[j++] = (j1 - p_35459_2_) + 32 + (((i2 + 1) - p_35459_3_) + 32 << 6) + ((l2 - p_35459_4_) + 32 << 12);
                        }
                        if(func_641_a(p_35459_1_, j1, i2, l2 - 1) < k5)
                        {
                            field_35466_H[j++] = (j1 - p_35459_2_) + 32 + ((i2 - p_35459_3_) + 32 << 6) + ((l2 - 1 - p_35459_4_) + 32 << 12);
                        }
                        if(func_641_a(p_35459_1_, j1, i2, l2 + 1) < k5)
                        {
                            field_35466_H[j++] = (j1 - p_35459_2_) + 32 + ((i2 - p_35459_3_) + 32 << 6) + (((l2 + 1) - p_35459_4_) + 32 << 12);
                        }
                    }
                }
            }
        } while(true);
        Profiler.func_40662_b();
    }

    public boolean func_700_a(boolean p_700_1_)
    {
        int i = field_1058_B.size();
        if(i != field_1056_C.size())
        {
            throw new IllegalStateException("TickNextTick list out of synch");
        }
        if(i > 1000)
        {
            i = 1000;
        }
        for(int j = 0; j < i; j++)
        {
            NextTickListEntry nextticklistentry = (NextTickListEntry)field_1058_B.first();
            if(!p_700_1_ && nextticklistentry.field_1364_e > field_22145_q.func_22304_f())
            {
                break;
            }
            field_1058_B.remove(nextticklistentry);
            field_1056_C.remove(nextticklistentry);
            byte byte0 = 8;
            if(!func_640_a(nextticklistentry.field_1361_a - byte0, nextticklistentry.field_1360_b - byte0, nextticklistentry.field_1366_c - byte0, nextticklistentry.field_1361_a + byte0, nextticklistentry.field_1360_b + byte0, nextticklistentry.field_1366_c + byte0))
            {
                continue;
            }
            int k = func_600_a(nextticklistentry.field_1361_a, nextticklistentry.field_1360_b, nextticklistentry.field_1366_c);
            if(k == nextticklistentry.field_1365_d && k > 0)
            {
                Block.field_345_n[k].func_208_a(this, nextticklistentry.field_1361_a, nextticklistentry.field_1360_b, nextticklistentry.field_1366_c, field_1037_n);
            }
        }

        return field_1058_B.size() != 0;
    }

    public List func_41081_a(Chunk p_41081_1_, boolean p_41081_2_)
    {
        ArrayList arraylist = null;
        ChunkCoordIntPair chunkcoordintpair = p_41081_1_.func_40740_k();
        int i = chunkcoordintpair.field_189_a << 4;
        int j = i + 16;
        int k = chunkcoordintpair.field_188_b << 4;
        int l = k + 16;
        Iterator iterator = field_1056_C.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            NextTickListEntry nextticklistentry = (NextTickListEntry)iterator.next();
            if(nextticklistentry.field_1361_a >= i && nextticklistentry.field_1361_a < j && nextticklistentry.field_1366_c >= k && nextticklistentry.field_1366_c < l)
            {
                if(p_41081_2_)
                {
                    field_1058_B.remove(nextticklistentry);
                    iterator.remove();
                }
                if(arraylist == null)
                {
                    arraylist = new ArrayList();
                }
                arraylist.add(nextticklistentry);
            }
        } while(true);
        return arraylist;
    }

    public void func_677_m(int p_677_1_, int p_677_2_, int p_677_3_)
    {
        byte byte0 = 16;
        Random random = new Random();
        for(int i = 0; i < 1000; i++)
        {
            int j = (p_677_1_ + field_1037_n.nextInt(byte0)) - field_1037_n.nextInt(byte0);
            int k = (p_677_2_ + field_1037_n.nextInt(byte0)) - field_1037_n.nextInt(byte0);
            int l = (p_677_3_ + field_1037_n.nextInt(byte0)) - field_1037_n.nextInt(byte0);
            int i1 = func_600_a(j, k, l);
            if(i1 == 0 && field_1037_n.nextInt(8) > k && field_4209_q.func_46064_i())
            {
                func_694_a("depthsuspend", (float)j + field_1037_n.nextFloat(), (float)k + field_1037_n.nextFloat(), (float)l + field_1037_n.nextFloat(), 0.0D, 0.0D, 0.0D);
                continue;
            }
            if(i1 > 0)
            {
                Block.field_345_n[i1].func_247_b(this, j, k, l, random);
            }
        }

    }

    public List func_659_b(Entity p_659_1_, AxisAlignedBB p_659_2_)
    {
        field_1012_M.clear();
        int i = MathHelper.func_1108_b((p_659_2_.field_1698_a - 2D) / 16D);
        int j = MathHelper.func_1108_b((p_659_2_.field_1703_d + 2D) / 16D);
        int k = MathHelper.func_1108_b((p_659_2_.field_1704_c - 2D) / 16D);
        int l = MathHelper.func_1108_b((p_659_2_.field_1701_f + 2D) / 16D);
        for(int i1 = i; i1 <= j; i1++)
        {
            for(int j1 = k; j1 <= l; j1++)
            {
                if(func_620_h(i1, j1))
                {
                    func_704_b(i1, j1).func_994_a(p_659_1_, p_659_2_, field_1012_M);
                }
            }

        }

        return field_1012_M;
    }

    public List func_657_a(Class p_657_1_, AxisAlignedBB p_657_2_)
    {
        int i = MathHelper.func_1108_b((p_657_2_.field_1698_a - 2D) / 16D);
        int j = MathHelper.func_1108_b((p_657_2_.field_1703_d + 2D) / 16D);
        int k = MathHelper.func_1108_b((p_657_2_.field_1704_c - 2D) / 16D);
        int l = MathHelper.func_1108_b((p_657_2_.field_1701_f + 2D) / 16D);
        ArrayList arraylist = new ArrayList();
        for(int i1 = i; i1 <= j; i1++)
        {
            for(int j1 = k; j1 <= l; j1++)
            {
                if(func_620_h(i1, j1))
                {
                    func_704_b(i1, j1).func_1013_a(p_657_1_, p_657_2_, arraylist);
                }
            }

        }

        return arraylist;
    }

    public Entity func_48459_a(Class p_48459_1_, AxisAlignedBB p_48459_2_, Entity p_48459_3_)
    {
        List list = func_657_a(p_48459_1_, p_48459_2_);
        Entity entity = null;
        double d = 1.7976931348623157E+308D;
        Iterator iterator = list.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Entity entity1 = (Entity)iterator.next();
            if(entity1 != p_48459_3_)
            {
                double d1 = p_48459_3_.func_387_e(entity1);
                if(d1 <= d)
                {
                    entity = entity1;
                    d = d1;
                }
            }
        } while(true);
        return entity;
    }

    public List func_658_i()
    {
        return field_1050_a;
    }

    public void func_698_b(int p_698_1_, int p_698_2_, int p_698_3_, TileEntity p_698_4_)
    {
        if(func_630_d(p_698_1_, p_698_2_, p_698_3_))
        {
            func_673_a(p_698_1_, p_698_3_).func_1006_f();
        }
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_935_a(p_698_1_, p_698_2_, p_698_3_, p_698_4_);
        }

    }

    public int func_621_b(Class p_621_1_)
    {
        int i = 0;
        for(int j = 0; j < field_1050_a.size(); j++)
        {
            Entity entity = (Entity)field_1050_a.get(j);
            if(p_621_1_.isAssignableFrom(entity.getClass()))
            {
                i++;
            }
        }

        return i;
    }

    public void func_636_a(List p_636_1_)
    {
        field_1050_a.addAll(p_636_1_);
        for(int i = 0; i < p_636_1_.size(); i++)
        {
            func_606_b((Entity)p_636_1_.get(i));
        }

    }

    public void func_632_b(List p_632_1_)
    {
        field_1024_A.addAll(p_632_1_);
    }

    public void func_656_j()
    {
        while(field_1017_H.func_532_a()) ;
    }

    public boolean func_695_a(int p_695_1_, int p_695_2_, int p_695_3_, int p_695_4_, boolean p_695_5_, int p_695_6_)
    {
        int i = func_600_a(p_695_2_, p_695_3_, p_695_4_);
        Block block = Block.field_345_n[i];
        Block block1 = Block.field_345_n[p_695_1_];
        AxisAlignedBB axisalignedbb = block1.func_221_d(this, p_695_2_, p_695_3_, p_695_4_);
        if(p_695_5_)
        {
            axisalignedbb = null;
        }
        if(axisalignedbb != null && !func_604_a(axisalignedbb))
        {
            return false;
        }
        if(block != null && (block == Block.field_401_B || block == Block.field_399_C || block == Block.field_397_D || block == Block.field_395_E || block == Block.field_402_as || block.field_356_bn.func_27283_g()))
        {
            block = null;
        }
        return p_695_1_ > 0 && block == null && block1.func_28030_e(this, p_695_2_, p_695_3_, p_695_4_, p_695_6_);
    }

    public PathEntity func_48463_a(Entity p_48463_1_, Entity p_48463_2_, float p_48463_3_, boolean p_48463_4_, boolean p_48463_5_, boolean p_48463_6_, boolean p_48463_7_)
    {
        Profiler.func_40663_a("pathfind");
        int i = MathHelper.func_1108_b(p_48463_1_.field_611_ak);
        int j = MathHelper.func_1108_b(p_48463_1_.field_610_al + 1.0D);
        int k = MathHelper.func_1108_b(p_48463_1_.field_609_am);
        int l = (int)(p_48463_3_ + 16F);
        int i1 = i - l;
        int j1 = j - l;
        int k1 = k - l;
        int l1 = i + l;
        int i2 = j + l;
        int j2 = k + l;
        ChunkCache chunkcache = new ChunkCache(this, i1, j1, k1, l1, i2, j2);
        PathEntity pathentity = (new PathFinder(chunkcache, p_48463_4_, p_48463_5_, p_48463_6_, p_48463_7_)).func_1137_a(p_48463_1_, p_48463_2_, p_48463_3_);
        Profiler.func_40662_b();
        return pathentity;
    }

    public PathEntity func_48460_a(Entity p_48460_1_, int p_48460_2_, int p_48460_3_, int p_48460_4_, float p_48460_5_, boolean p_48460_6_, boolean p_48460_7_, 
            boolean p_48460_8_, boolean p_48460_9_)
    {
        Profiler.func_40663_a("pathfind");
        int i = MathHelper.func_1108_b(p_48460_1_.field_611_ak);
        int j = MathHelper.func_1108_b(p_48460_1_.field_610_al);
        int k = MathHelper.func_1108_b(p_48460_1_.field_609_am);
        int l = (int)(p_48460_5_ + 8F);
        int i1 = i - l;
        int j1 = j - l;
        int k1 = k - l;
        int l1 = i + l;
        int i2 = j + l;
        int j2 = k + l;
        ChunkCache chunkcache = new ChunkCache(this, i1, j1, k1, l1, i2, j2);
        PathEntity pathentity = (new PathFinder(chunkcache, p_48460_6_, p_48460_7_, p_48460_8_, p_48460_9_)).func_1131_a(p_48460_1_, p_48460_2_, p_48460_3_, p_48460_4_, p_48460_5_);
        Profiler.func_40662_b();
        return pathentity;
    }

    public boolean func_668_j(int p_668_1_, int p_668_2_, int p_668_3_, int p_668_4_)
    {
        int i = func_600_a(p_668_1_, p_668_2_, p_668_3_);
        if(i == 0)
        {
            return false;
        } else
        {
            return Block.field_345_n[i].func_228_c(this, p_668_1_, p_668_2_, p_668_3_, p_668_4_);
        }
    }

    public boolean func_646_n(int p_646_1_, int p_646_2_, int p_646_3_)
    {
        if(func_668_j(p_646_1_, p_646_2_ - 1, p_646_3_, 0))
        {
            return true;
        }
        if(func_668_j(p_646_1_, p_646_2_ + 1, p_646_3_, 1))
        {
            return true;
        }
        if(func_668_j(p_646_1_, p_646_2_, p_646_3_ - 1, 2))
        {
            return true;
        }
        if(func_668_j(p_646_1_, p_646_2_, p_646_3_ + 1, 3))
        {
            return true;
        }
        if(func_668_j(p_646_1_ - 1, p_646_2_, p_646_3_, 4))
        {
            return true;
        }
        return func_668_j(p_646_1_ + 1, p_646_2_, p_646_3_, 5);
    }

    public boolean func_706_k(int p_706_1_, int p_706_2_, int p_706_3_, int p_706_4_)
    {
        if(func_28100_h(p_706_1_, p_706_2_, p_706_3_))
        {
            return func_646_n(p_706_1_, p_706_2_, p_706_3_);
        }
        int i = func_600_a(p_706_1_, p_706_2_, p_706_3_);
        if(i == 0)
        {
            return false;
        } else
        {
            return Block.field_345_n[i].func_231_b(this, p_706_1_, p_706_2_, p_706_3_, p_706_4_);
        }
    }

    public boolean func_625_o(int p_625_1_, int p_625_2_, int p_625_3_)
    {
        if(func_706_k(p_625_1_, p_625_2_ - 1, p_625_3_, 0))
        {
            return true;
        }
        if(func_706_k(p_625_1_, p_625_2_ + 1, p_625_3_, 1))
        {
            return true;
        }
        if(func_706_k(p_625_1_, p_625_2_, p_625_3_ - 1, 2))
        {
            return true;
        }
        if(func_706_k(p_625_1_, p_625_2_, p_625_3_ + 1, 3))
        {
            return true;
        }
        if(func_706_k(p_625_1_ - 1, p_625_2_, p_625_3_, 4))
        {
            return true;
        }
        return func_706_k(p_625_1_ + 1, p_625_2_, p_625_3_, 5);
    }

    public EntityPlayer func_609_a(Entity p_609_1_, double p_609_2_)
    {
        return func_683_a(p_609_1_.field_611_ak, p_609_1_.field_610_al, p_609_1_.field_609_am, p_609_2_);
    }

    public EntityPlayer func_683_a(double p_683_1_, double p_683_3_, double p_683_5_, double p_683_7_)
    {
        double d = -1D;
        EntityPlayer entityplayer = null;
        for(int i = 0; i < field_1040_k.size(); i++)
        {
            EntityPlayer entityplayer1 = (EntityPlayer)field_1040_k.get(i);
            double d1 = entityplayer1.func_360_d(p_683_1_, p_683_3_, p_683_5_);
            if((p_683_7_ < 0.0D || d1 < p_683_7_ * p_683_7_) && (d == -1D || d1 < d))
            {
                d = d1;
                entityplayer = entityplayer1;
            }
        }

        return entityplayer;
    }

    public EntityPlayer func_48456_a(double p_48456_1_, double p_48456_3_, double p_48456_5_)
    {
        double d = -1D;
        EntityPlayer entityplayer = null;
        for(int i = 0; i < field_1040_k.size(); i++)
        {
            EntityPlayer entityplayer1 = (EntityPlayer)field_1040_k.get(i);
            double d1 = entityplayer1.func_360_d(p_48456_1_, entityplayer1.field_610_al, p_48456_3_);
            if((p_48456_5_ < 0.0D || d1 < p_48456_5_ * p_48456_5_) && (d == -1D || d1 < d))
            {
                d = d1;
                entityplayer = entityplayer1;
            }
        }

        return entityplayer;
    }

    public EntityPlayer func_40480_b(Entity p_40480_1_, double p_40480_2_)
    {
        return func_40473_b(p_40480_1_.field_611_ak, p_40480_1_.field_610_al, p_40480_1_.field_609_am, p_40480_2_);
    }

    public EntityPlayer func_40473_b(double p_40473_1_, double p_40473_3_, double p_40473_5_, double p_40473_7_)
    {
        double d = -1D;
        EntityPlayer entityplayer = null;
        for(int i = 0; i < field_1040_k.size(); i++)
        {
            EntityPlayer entityplayer1 = (EntityPlayer)field_1040_k.get(i);
            if(entityplayer1.field_35212_aW.field_35759_a)
            {
                continue;
            }
            double d1 = entityplayer1.func_360_d(p_40473_1_, p_40473_3_, p_40473_5_);
            if((p_40473_7_ < 0.0D || d1 < p_40473_7_ * p_40473_7_) && (d == -1D || d1 < d))
            {
                d = d1;
                entityplayer = entityplayer1;
            }
        }

        return entityplayer;
    }

    public EntityPlayer func_25099_a(String p_25099_1_)
    {
        for(int i = 0; i < field_1040_k.size(); i++)
        {
            if(p_25099_1_.equals(((EntityPlayer)field_1040_k.get(i)).field_771_i))
            {
                return (EntityPlayer)field_1040_k.get(i);
            }
        }

        return null;
    }

    public void func_660_k()
    {
    }

    public void func_663_l()
    {
        field_22147_p.func_22150_b();
    }

    public void func_648_a(long p_648_1_)
    {
        field_22145_q.func_22307_a(p_648_1_);
    }

    public long func_22138_q()
    {
        return field_22145_q.func_22288_b();
    }

    public long func_22139_r()
    {
        return field_22145_q.func_22304_f();
    }

    public ChunkCoordinates func_22137_s()
    {
        return new ChunkCoordinates(field_22145_q.func_22293_c(), field_22145_q.func_22295_d(), field_22145_q.func_22300_e());
    }

    public void func_22143_a(ChunkCoordinates p_22143_1_)
    {
        field_22145_q.func_22292_a(p_22143_1_.field_22395_a, p_22143_1_.field_22394_b, p_22143_1_.field_22396_c);
    }

    public void func_705_f(Entity p_705_1_)
    {
        int i = MathHelper.func_1108_b(p_705_1_.field_611_ak / 16D);
        int j = MathHelper.func_1108_b(p_705_1_.field_609_am / 16D);
        byte byte0 = 2;
        for(int k = i - byte0; k <= i + byte0; k++)
        {
            for(int l = j - byte0; l <= j + byte0; l++)
            {
                func_704_b(k, l);
            }

        }

        if(!field_1050_a.contains(p_705_1_))
        {
            field_1050_a.add(p_705_1_);
        }
    }

    public boolean func_6466_a(EntityPlayer p_6466_1_, int p_6466_2_, int p_6466_3_, int i)
    {
        return true;
    }

    public void func_9425_a(Entity entity, byte byte0)
    {
    }

    public void func_9424_o()
    {
        field_1050_a.removeAll(field_1024_A);
        for(int i = 0; i < field_1024_A.size(); i++)
        {
            Entity entity = (Entity)field_1024_A.get(i);
            int l = entity.field_657_ba;
            int j1 = entity.field_654_bc;
            if(entity.field_621_aZ && func_620_h(l, j1))
            {
                func_704_b(l, j1).func_1015_b(entity);
            }
        }

        for(int j = 0; j < field_1024_A.size(); j++)
        {
            func_678_c((Entity)field_1024_A.get(j));
        }

        field_1024_A.clear();
        for(int k = 0; k < field_1050_a.size(); k++)
        {
            Entity entity1 = (Entity)field_1050_a.get(k);
            if(entity1.field_616_af != null)
            {
                if(!entity1.field_616_af.field_646_aA && entity1.field_616_af.field_617_ae == entity1)
                {
                    continue;
                }
                entity1.field_616_af.field_617_ae = null;
                entity1.field_616_af = null;
            }
            if(!entity1.field_646_aA)
            {
                continue;
            }
            int i1 = entity1.field_657_ba;
            int k1 = entity1.field_654_bc;
            if(entity1.field_621_aZ && func_620_h(i1, k1))
            {
                func_704_b(i1, k1).func_1015_b(entity1);
            }
            field_1050_a.remove(k--);
            func_678_c(entity1);
        }

    }

    public IChunkProvider func_21118_q()
    {
        return field_1017_H;
    }

    public void func_21116_c(int p_21116_1_, int p_21116_2_, int p_21116_3_, int p_21116_4_, int p_21116_5_)
    {
        int i = func_600_a(p_21116_1_, p_21116_2_, p_21116_3_);
        if(i > 0)
        {
            Block.field_345_n[i].func_21024_a(this, p_21116_1_, p_21116_2_, p_21116_3_, p_21116_4_, p_21116_5_);
        }
    }

    public ISaveHandler func_40479_y()
    {
        return field_22147_p;
    }

    public WorldInfo func_22144_v()
    {
        return field_22145_q;
    }

    public void func_22140_w()
    {
        field_22146_A = !field_1040_k.isEmpty();
        Iterator iterator = field_1040_k.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            EntityPlayer entityplayer = (EntityPlayer)iterator.next();
            if(entityplayer.func_22051_K())
            {
                continue;
            }
            field_22146_A = false;
            break;
        } while(true);
    }

    protected void func_22141_x()
    {
        field_22146_A = false;
        Iterator iterator = field_1040_k.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            EntityPlayer entityplayer = (EntityPlayer)iterator.next();
            if(entityplayer.func_22051_K())
            {
                entityplayer.func_22056_a(false, false, true);
            }
        } while(true);
        func_27164_F();
    }

    public boolean func_22142_y()
    {
        if(field_22146_A && !field_1026_y)
        {
            for(Iterator iterator = field_1040_k.iterator(); iterator.hasNext();)
            {
                EntityPlayer entityplayer = (EntityPlayer)iterator.next();
                if(!entityplayer.func_22054_L())
                {
                    return false;
                }
            }

            return true;
        } else
        {
            return false;
        }
    }

    public float func_27166_f(float p_27166_1_)
    {
        return (field_27170_D + (field_27169_E - field_27170_D) * p_27166_1_) * func_27162_g(p_27166_1_);
    }

    public float func_27162_g(float p_27162_1_)
    {
        return field_26901_B + (field_27171_C - field_26901_B) * p_27162_1_;
    }

    public void func_27158_h(float p_27158_1_)
    {
        field_26901_B = p_27158_1_;
        field_27171_C = p_27158_1_;
    }

    public boolean func_27160_B()
    {
        return (double)func_27166_f(1.0F) > 0.90000000000000002D;
    }

    public boolean func_27161_C()
    {
        return (double)func_27162_g(1.0F) > 0.20000000000000001D;
    }

    public boolean func_27167_r(int p_27167_1_, int p_27167_2_, int p_27167_3_)
    {
        if(!func_27161_C())
        {
            return false;
        }
        if(!func_647_i(p_27167_1_, p_27167_2_, p_27167_3_))
        {
            return false;
        }
        if(func_35461_e(p_27167_1_, p_27167_3_) > p_27167_2_)
        {
            return false;
        }
        BiomeGenBase biomegenbase = func_48454_a(p_27167_1_, p_27167_3_);
        if(biomegenbase.func_27078_c())
        {
            return false;
        } else
        {
            return biomegenbase.func_27077_d();
        }
    }

    public boolean func_48455_z(int p_48455_1_, int p_48455_2_, int p_48455_3_)
    {
        BiomeGenBase biomegenbase = func_48454_a(p_48455_1_, p_48455_3_);
        return biomegenbase.func_48413_d();
    }

    public void func_28102_a(String p_28102_1_, WorldSavedData p_28102_2_)
    {
        field_28108_z.func_28184_a(p_28102_1_, p_28102_2_);
    }

    public WorldSavedData func_28103_a(Class p_28103_1_, String p_28103_2_)
    {
        return field_28108_z.func_28185_a(p_28103_1_, p_28103_2_);
    }

    public int func_28101_b(String p_28101_1_)
    {
        return field_28108_z.func_28186_a(p_28101_1_);
    }

    public void func_28106_e(int p_28106_1_, int p_28106_2_, int p_28106_3_, int p_28106_4_, int p_28106_5_)
    {
        func_28107_a(null, p_28106_1_, p_28106_2_, p_28106_3_, p_28106_4_, p_28106_5_);
    }

    public void func_28107_a(EntityPlayer p_28107_1_, int p_28107_2_, int p_28107_3_, int p_28107_4_, int p_28107_5_, int p_28107_6_)
    {
        for(int i = 0; i < field_9434_r.size(); i++)
        {
            ((IWorldAccess)field_9434_r.get(i)).func_28136_a(p_28107_1_, p_28107_2_, p_28107_3_, p_28107_4_, p_28107_5_, p_28107_6_);
        }

    }

    public int func_48453_b()
    {
        return 256;
    }

    public Random func_35462_u(int p_35462_1_, int p_35462_2_, int p_35462_3_)
    {
        long l = (long)p_35462_1_ * 0x4f9939f508L + (long)p_35462_2_ * 0x1ef1565bd5L + func_22144_v().func_22288_b() + (long)p_35462_3_;
        field_1037_n.setSeed(l);
        return field_1037_n;
    }

    public boolean func_6465_g()
    {
        return false;
    }

    public SpawnListEntry func_40474_a(EnumCreatureType p_40474_1_, int p_40474_2_, int p_40474_3_, int p_40474_4_)
    {
        List list = func_21118_q().func_40377_a(p_40474_1_, p_40474_2_, p_40474_3_, p_40474_4_);
        if(list == null || list.isEmpty())
        {
            return null;
        } else
        {
            return (SpawnListEntry)WeightedRandom.func_35733_a(field_1037_n, list);
        }
    }

    public ChunkPosition func_40477_b(String p_40477_1_, int p_40477_2_, int p_40477_3_, int p_40477_4_)
    {
        return func_21118_q().func_40376_a(this, p_40477_1_, p_40477_2_, p_40477_3_, p_40477_4_);
    }

    public boolean func_48452_a()
    {
        return false;
    }

    public double func_46068_G()
    {
        return field_22145_q.func_46133_t() != WorldType.field_48636_c ? 63D : 0.0D;
    }
}
