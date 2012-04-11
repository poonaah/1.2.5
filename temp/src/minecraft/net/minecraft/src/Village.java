// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            ChunkCoordinates, World, MathHelper, EntityIronGolem, 
//            Vec3D, AxisAlignedBB, EntityVillager, VillageDoorInfo, 
//            VillageAgressor, EntityLiving, Block

public class Village
{

    private final World field_48548_a;
    private final List field_48546_b = new ArrayList();
    private final ChunkCoordinates field_48547_c = new ChunkCoordinates(0, 0, 0);
    private final ChunkCoordinates field_48544_d = new ChunkCoordinates(0, 0, 0);
    private int field_48545_e;
    private int field_48542_f;
    private int field_48543_g;
    private int field_48550_h;
    private List field_48551_i;
    private int field_48549_j;

    public Village(World p_i1048_1_)
    {
        field_48545_e = 0;
        field_48542_f = 0;
        field_48543_g = 0;
        field_48550_h = 0;
        field_48551_i = new ArrayList();
        field_48549_j = 0;
        field_48548_a = p_i1048_1_;
    }

    public void func_48522_a(int p_48522_1_)
    {
        field_48543_g = p_48522_1_;
        func_48520_k();
        func_48528_j();
        if(p_48522_1_ % 20 == 0)
        {
            func_48535_i();
        }
        if(p_48522_1_ % 30 == 0)
        {
            func_48541_h();
        }
        int i = field_48550_h / 16;
        if(field_48549_j < i && field_48546_b.size() > 20 && field_48548_a.field_1037_n.nextInt(7000) == 0)
        {
            Vec3D vec3d = func_48532_a(MathHelper.func_1110_d(field_48544_d.field_22395_a), MathHelper.func_1110_d(field_48544_d.field_22394_b), MathHelper.func_1110_d(field_48544_d.field_22396_c), 2, 4, 2);
            if(vec3d != null)
            {
                EntityIronGolem entityirongolem = new EntityIronGolem(field_48548_a);
                entityirongolem.func_347_a(vec3d.field_1776_a, vec3d.field_1775_b, vec3d.field_1779_c);
                field_48548_a.func_674_a(entityirongolem);
                field_48549_j++;
            }
        }
    }

    private Vec3D func_48532_a(int p_48532_1_, int p_48532_2_, int p_48532_3_, int p_48532_4_, int p_48532_5_, int p_48532_6_)
    {
        for(int i = 0; i < 10; i++)
        {
            int j = (p_48532_1_ + field_48548_a.field_1037_n.nextInt(16)) - 8;
            int k = (p_48532_2_ + field_48548_a.field_1037_n.nextInt(6)) - 3;
            int l = (p_48532_3_ + field_48548_a.field_1037_n.nextInt(16)) - 8;
            if(func_48533_a(j, k, l) && func_48525_b(j, k, l, p_48532_4_, p_48532_5_, p_48532_6_))
            {
                return Vec3D.func_1248_b(j, k, l);
            }
        }

        return null;
    }

    private boolean func_48525_b(int p_48525_1_, int p_48525_2_, int p_48525_3_, int p_48525_4_, int p_48525_5_, int p_48525_6_)
    {
        if(!field_48548_a.func_28100_h(p_48525_1_, p_48525_2_ - 1, p_48525_3_))
        {
            return false;
        }
        int i = p_48525_1_ - p_48525_4_ / 2;
        int j = p_48525_3_ - p_48525_6_ / 2;
        for(int k = i; k < i + p_48525_4_; k++)
        {
            for(int l = p_48525_2_; l < p_48525_2_ + p_48525_5_; l++)
            {
                for(int i1 = j; i1 < j + p_48525_6_; i1++)
                {
                    if(field_48548_a.func_28100_h(k, l, i1))
                    {
                        return false;
                    }
                }

            }

        }

        return true;
    }

    private void func_48541_h()
    {
        List list = field_48548_a.func_657_a(net.minecraft.src.EntityIronGolem.class, AxisAlignedBB.func_1161_b(field_48544_d.field_22395_a - field_48545_e, field_48544_d.field_22394_b - 4, field_48544_d.field_22396_c - field_48545_e, field_48544_d.field_22395_a + field_48545_e, field_48544_d.field_22394_b + 4, field_48544_d.field_22396_c + field_48545_e));
        field_48549_j = list.size();
    }

    private void func_48535_i()
    {
        List list = field_48548_a.func_657_a(net.minecraft.src.EntityVillager.class, AxisAlignedBB.func_1161_b(field_48544_d.field_22395_a - field_48545_e, field_48544_d.field_22394_b - 4, field_48544_d.field_22396_c - field_48545_e, field_48544_d.field_22395_a + field_48545_e, field_48544_d.field_22394_b + 4, field_48544_d.field_22396_c + field_48545_e));
        field_48550_h = list.size();
    }

    public ChunkCoordinates func_48539_a()
    {
        return field_48544_d;
    }

    public int func_48531_b()
    {
        return field_48545_e;
    }

    public int func_48530_c()
    {
        return field_48546_b.size();
    }

    public int func_48523_d()
    {
        return field_48543_g - field_48542_f;
    }

    public int func_48524_e()
    {
        return field_48550_h;
    }

    public boolean func_48533_a(int p_48533_1_, int p_48533_2_, int p_48533_3_)
    {
        return field_48544_d.func_48655_c(p_48533_1_, p_48533_2_, p_48533_3_) < (float)(field_48545_e * field_48545_e);
    }

    public List func_48521_f()
    {
        return field_48546_b;
    }

    public VillageDoorInfo func_48527_b(int p_48527_1_, int p_48527_2_, int p_48527_3_)
    {
        VillageDoorInfo villagedoorinfo = null;
        int i = 0x7fffffff;
        Iterator iterator = field_48546_b.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            VillageDoorInfo villagedoorinfo1 = (VillageDoorInfo)iterator.next();
            int j = villagedoorinfo1.func_48588_a(p_48527_1_, p_48527_2_, p_48527_3_);
            if(j < i)
            {
                villagedoorinfo = villagedoorinfo1;
                i = j;
            }
        } while(true);
        return villagedoorinfo;
    }

    public VillageDoorInfo func_48540_c(int p_48540_1_, int p_48540_2_, int p_48540_3_)
    {
        VillageDoorInfo villagedoorinfo = null;
        int i = 0x7fffffff;
        Iterator iterator = field_48546_b.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            VillageDoorInfo villagedoorinfo1 = (VillageDoorInfo)iterator.next();
            int j = villagedoorinfo1.func_48588_a(p_48540_1_, p_48540_2_, p_48540_3_);
            if(j > 256)
            {
                j *= 1000;
            } else
            {
                j = villagedoorinfo1.func_48587_f();
            }
            if(j < i)
            {
                villagedoorinfo = villagedoorinfo1;
                i = j;
            }
        } while(true);
        return villagedoorinfo;
    }

    public VillageDoorInfo func_48526_d(int p_48526_1_, int p_48526_2_, int p_48526_3_)
    {
        if(field_48544_d.func_48655_c(p_48526_1_, p_48526_2_, p_48526_3_) > (float)(field_48545_e * field_48545_e))
        {
            return null;
        }
        for(Iterator iterator = field_48546_b.iterator(); iterator.hasNext();)
        {
            VillageDoorInfo villagedoorinfo = (VillageDoorInfo)iterator.next();
            if(villagedoorinfo.field_48600_a == p_48526_1_ && villagedoorinfo.field_48599_c == p_48526_3_ && Math.abs(villagedoorinfo.field_48598_b - p_48526_2_) <= 1)
            {
                return villagedoorinfo;
            }
        }

        return null;
    }

    public void func_48538_a(VillageDoorInfo p_48538_1_)
    {
        field_48546_b.add(p_48538_1_);
        field_48547_c.field_22395_a += p_48538_1_.field_48600_a;
        field_48547_c.field_22394_b += p_48538_1_.field_48598_b;
        field_48547_c.field_22396_c += p_48538_1_.field_48599_c;
        func_48536_l();
        field_48542_f = p_48538_1_.field_48594_f;
    }

    public boolean func_48529_g()
    {
        return field_48546_b.isEmpty();
    }

    public void func_48534_a(EntityLiving p_48534_1_)
    {
        for(Iterator iterator = field_48551_i.iterator(); iterator.hasNext();)
        {
            VillageAgressor villageagressor = (VillageAgressor)iterator.next();
            if(villageagressor.field_48515_a == p_48534_1_)
            {
                villageagressor.field_48513_b = field_48543_g;
                return;
            }
        }

        field_48551_i.add(new VillageAgressor(this, p_48534_1_, field_48543_g));
    }

    public EntityLiving func_48537_b(EntityLiving p_48537_1_)
    {
        double d = 1.7976931348623157E+308D;
        VillageAgressor villageagressor = null;
        for(int i = 0; i < field_48551_i.size(); i++)
        {
            VillageAgressor villageagressor1 = (VillageAgressor)field_48551_i.get(i);
            double d1 = villageagressor1.field_48515_a.func_387_e(p_48537_1_);
            if(d1 <= d)
            {
                villageagressor = villageagressor1;
                d = d1;
            }
        }

        return villageagressor == null ? null : villageagressor.field_48515_a;
    }

    private void func_48528_j()
    {
        Iterator iterator = field_48551_i.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            VillageAgressor villageagressor = (VillageAgressor)iterator.next();
            if(!villageagressor.field_48515_a.func_354_B() || Math.abs(field_48543_g - villageagressor.field_48513_b) > 300)
            {
                iterator.remove();
            }
        } while(true);
    }

    private void func_48520_k()
    {
        boolean flag = false;
        boolean flag1 = field_48548_a.field_1037_n.nextInt(50) == 0;
        Iterator iterator = field_48546_b.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            VillageDoorInfo villagedoorinfo = (VillageDoorInfo)iterator.next();
            if(flag1)
            {
                villagedoorinfo.func_48585_d();
            }
            if(!func_48519_e(villagedoorinfo.field_48600_a, villagedoorinfo.field_48598_b, villagedoorinfo.field_48599_c) || Math.abs(field_48543_g - villagedoorinfo.field_48594_f) > 1200)
            {
                field_48547_c.field_22395_a -= villagedoorinfo.field_48600_a;
                field_48547_c.field_22394_b -= villagedoorinfo.field_48598_b;
                field_48547_c.field_22396_c -= villagedoorinfo.field_48599_c;
                flag = true;
                villagedoorinfo.field_48595_g = true;
                iterator.remove();
            }
        } while(true);
        if(flag)
        {
            func_48536_l();
        }
    }

    private boolean func_48519_e(int p_48519_1_, int p_48519_2_, int p_48519_3_)
    {
        int i = field_48548_a.func_600_a(p_48519_1_, p_48519_2_, p_48519_3_);
        if(i <= 0)
        {
            return false;
        } else
        {
            return i == Block.field_442_aF.field_376_bc;
        }
    }

    private void func_48536_l()
    {
        int i = field_48546_b.size();
        if(i == 0)
        {
            field_48544_d.func_48656_a(0, 0, 0);
            field_48545_e = 0;
            return;
        }
        field_48544_d.func_48656_a(field_48547_c.field_22395_a / i, field_48547_c.field_22394_b / i, field_48547_c.field_22396_c / i);
        int j = 0;
        for(Iterator iterator = field_48546_b.iterator(); iterator.hasNext();)
        {
            VillageDoorInfo villagedoorinfo = (VillageDoorInfo)iterator.next();
            j = Math.max(villagedoorinfo.func_48588_a(field_48544_d.field_22395_a, field_48544_d.field_22394_b, field_48544_d.field_22396_c), j);
        }

        field_48545_e = Math.max(32, (int)Math.sqrt(j) + 1);
    }
}
