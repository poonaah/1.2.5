// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            ChunkCoordinates, Village, VillageDoorInfo, Block, 
//            BlockDoor, World

public class VillageCollection
{

    private World field_48570_a;
    private final List field_48568_b = new ArrayList();
    private final List field_48569_c = new ArrayList();
    private final List field_48566_d = new ArrayList();
    private int field_48567_e;

    public VillageCollection(World p_i1052_1_)
    {
        field_48567_e = 0;
        field_48570_a = p_i1052_1_;
    }

    public void func_48565_a(int p_48565_1_, int p_48565_2_, int p_48565_3_)
    {
        if(field_48568_b.size() > 64)
        {
            return;
        }
        if(!func_48561_d(p_48565_1_, p_48565_2_, p_48565_3_))
        {
            field_48568_b.add(new ChunkCoordinates(p_48565_1_, p_48565_2_, p_48565_3_));
        }
    }

    public void func_48558_a()
    {
        field_48567_e++;
        Village village;
        for(Iterator iterator = field_48566_d.iterator(); iterator.hasNext(); village.func_48522_a(field_48567_e))
        {
            village = (Village)iterator.next();
        }

        func_48563_c();
        func_48557_d();
        func_48560_e();
    }

    private void func_48563_c()
    {
        Iterator iterator = field_48566_d.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Village village = (Village)iterator.next();
            if(village.func_48529_g())
            {
                iterator.remove();
            }
        } while(true);
    }

    public List func_48554_b()
    {
        return field_48566_d;
    }

    public Village func_48564_a(int p_48564_1_, int p_48564_2_, int p_48564_3_, int p_48564_4_)
    {
        Village village = null;
        float f = 3.402823E+038F;
        Iterator iterator = field_48566_d.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Village village1 = (Village)iterator.next();
            float f1 = village1.func_48539_a().func_48655_c(p_48564_1_, p_48564_2_, p_48564_3_);
            if(f1 < f)
            {
                int i = p_48564_4_ + village1.func_48531_b();
                if(f1 <= (float)(i * i))
                {
                    village = village1;
                    f = f1;
                }
            }
        } while(true);
        return village;
    }

    private void func_48557_d()
    {
        if(field_48568_b.isEmpty())
        {
            return;
        } else
        {
            func_48559_a((ChunkCoordinates)field_48568_b.remove(0));
            return;
        }
    }

    private void func_48560_e()
    {
        for(int i = 0; i < field_48569_c.size(); i++)
        {
            VillageDoorInfo villagedoorinfo = (VillageDoorInfo)field_48569_c.get(i);
            boolean flag = false;
            Iterator iterator = field_48566_d.iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                Village village1 = (Village)iterator.next();
                int j = (int)village1.func_48539_a().func_27439_a(villagedoorinfo.field_48600_a, villagedoorinfo.field_48598_b, villagedoorinfo.field_48599_c);
                if(j > 32 + village1.func_48531_b())
                {
                    continue;
                }
                village1.func_48538_a(villagedoorinfo);
                flag = true;
                break;
            } while(true);
            if(!flag)
            {
                Village village = new Village(field_48570_a);
                village.func_48538_a(villagedoorinfo);
                field_48566_d.add(village);
            }
        }

        field_48569_c.clear();
    }

    private void func_48559_a(ChunkCoordinates p_48559_1_)
    {
        byte byte0 = 16;
        byte byte1 = 4;
        byte byte2 = 16;
        for(int i = p_48559_1_.field_22395_a - byte0; i < p_48559_1_.field_22395_a + byte0; i++)
        {
            for(int j = p_48559_1_.field_22394_b - byte1; j < p_48559_1_.field_22394_b + byte1; j++)
            {
                for(int k = p_48559_1_.field_22396_c - byte2; k < p_48559_1_.field_22396_c + byte2; k++)
                {
                    if(!func_48555_e(i, j, k))
                    {
                        continue;
                    }
                    VillageDoorInfo villagedoorinfo = func_48562_b(i, j, k);
                    if(villagedoorinfo == null)
                    {
                        func_48556_c(i, j, k);
                    } else
                    {
                        villagedoorinfo.field_48594_f = field_48567_e;
                    }
                }

            }

        }

    }

    private VillageDoorInfo func_48562_b(int p_48562_1_, int p_48562_2_, int p_48562_3_)
    {
        for(Iterator iterator = field_48569_c.iterator(); iterator.hasNext();)
        {
            VillageDoorInfo villagedoorinfo = (VillageDoorInfo)iterator.next();
            if(villagedoorinfo.field_48600_a == p_48562_1_ && villagedoorinfo.field_48599_c == p_48562_3_ && Math.abs(villagedoorinfo.field_48598_b - p_48562_2_) <= 1)
            {
                return villagedoorinfo;
            }
        }

        for(Iterator iterator1 = field_48566_d.iterator(); iterator1.hasNext();)
        {
            Village village = (Village)iterator1.next();
            VillageDoorInfo villagedoorinfo1 = village.func_48526_d(p_48562_1_, p_48562_2_, p_48562_3_);
            if(villagedoorinfo1 != null)
            {
                return villagedoorinfo1;
            }
        }

        return null;
    }

    private void func_48556_c(int p_48556_1_, int p_48556_2_, int p_48556_3_)
    {
        int i = ((BlockDoor)Block.field_442_aF).func_48214_g(field_48570_a, p_48556_1_, p_48556_2_, p_48556_3_);
        if(i == 0 || i == 2)
        {
            int j = 0;
            for(int l = -5; l < 0; l++)
            {
                if(field_48570_a.func_647_i(p_48556_1_ + l, p_48556_2_, p_48556_3_))
                {
                    j--;
                }
            }

            for(int i1 = 1; i1 <= 5; i1++)
            {
                if(field_48570_a.func_647_i(p_48556_1_ + i1, p_48556_2_, p_48556_3_))
                {
                    j++;
                }
            }

            if(j != 0)
            {
                field_48569_c.add(new VillageDoorInfo(p_48556_1_, p_48556_2_, p_48556_3_, j <= 0 ? 2 : -2, 0, field_48567_e));
            }
        } else
        {
            int k = 0;
            for(int j1 = -5; j1 < 0; j1++)
            {
                if(field_48570_a.func_647_i(p_48556_1_, p_48556_2_, p_48556_3_ + j1))
                {
                    k--;
                }
            }

            for(int k1 = 1; k1 <= 5; k1++)
            {
                if(field_48570_a.func_647_i(p_48556_1_, p_48556_2_, p_48556_3_ + k1))
                {
                    k++;
                }
            }

            if(k != 0)
            {
                field_48569_c.add(new VillageDoorInfo(p_48556_1_, p_48556_2_, p_48556_3_, 0, k <= 0 ? 2 : -2, field_48567_e));
            }
        }
    }

    private boolean func_48561_d(int p_48561_1_, int p_48561_2_, int p_48561_3_)
    {
        for(Iterator iterator = field_48568_b.iterator(); iterator.hasNext();)
        {
            ChunkCoordinates chunkcoordinates = (ChunkCoordinates)iterator.next();
            if(chunkcoordinates.field_22395_a == p_48561_1_ && chunkcoordinates.field_22394_b == p_48561_2_ && chunkcoordinates.field_22396_c == p_48561_3_)
            {
                return true;
            }
        }

        return false;
    }

    private boolean func_48555_e(int p_48555_1_, int p_48555_2_, int p_48555_3_)
    {
        int i = field_48570_a.func_600_a(p_48555_1_, p_48555_2_, p_48555_3_);
        return i == Block.field_442_aF.field_376_bc;
    }
}
