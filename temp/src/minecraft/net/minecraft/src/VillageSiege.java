// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            World, EntityPlayer, VillageCollection, Village, 
//            ChunkCoordinates, MathHelper, EntityZombie, Vec3D, 
//            EntityLiving, EnumCreatureType, SpawnerAnimals

public class VillageSiege
{

    private World field_48582_a;
    private boolean field_48580_b;
    private int field_48581_c;
    private int field_48578_d;
    private int field_48579_e;
    private Village field_48576_f;
    private int field_48577_g;
    private int field_48583_h;
    private int field_48584_i;

    public VillageSiege(World p_i1005_1_)
    {
        field_48580_b = false;
        field_48581_c = -1;
        field_48582_a = p_i1005_1_;
    }

    public void func_48573_a()
    {
        boolean flag = false;
        if(flag)
        {
            if(field_48581_c == 2)
            {
                field_48578_d = 100;
                return;
            }
        } else
        {
            if(field_48582_a.func_624_b())
            {
                field_48581_c = 0;
                return;
            }
            if(field_48581_c == 2)
            {
                return;
            }
            if(field_48581_c == 0)
            {
                float f = field_48582_a.func_619_c(0.0F);
                if((double)f < 0.5D || (double)f > 0.501D)
                {
                    return;
                }
                field_48581_c = field_48582_a.field_1037_n.nextInt(10) != 0 ? 2 : 1;
                field_48580_b = false;
                if(field_48581_c == 2)
                {
                    return;
                }
            }
        }
        if(!field_48580_b)
        {
            if(func_48574_b())
            {
                field_48580_b = true;
            } else
            {
                return;
            }
        }
        if(field_48579_e > 0)
        {
            field_48579_e--;
            return;
        }
        field_48579_e = 2;
        if(field_48578_d > 0)
        {
            func_48575_c();
            field_48578_d--;
        } else
        {
            field_48581_c = 2;
        }
    }

    private boolean func_48574_b()
    {
        List list = field_48582_a.field_1040_k;
        for(Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            EntityPlayer entityplayer = (EntityPlayer)iterator.next();
            field_48576_f = field_48582_a.field_48465_A.func_48564_a((int)entityplayer.field_611_ak, (int)entityplayer.field_610_al, (int)entityplayer.field_609_am, 1);
            if(field_48576_f != null && field_48576_f.func_48530_c() >= 10 && field_48576_f.func_48523_d() >= 20 && field_48576_f.func_48524_e() >= 20)
            {
                ChunkCoordinates chunkcoordinates = field_48576_f.func_48539_a();
                float f = field_48576_f.func_48531_b();
                boolean flag = false;
                int i = 0;
                do
                {
                    if(i >= 10)
                    {
                        break;
                    }
                    field_48577_g = chunkcoordinates.field_22395_a + (int)((double)(MathHelper.func_1114_b(field_48582_a.field_1037_n.nextFloat() * 3.141593F * 2.0F) * f) * 0.90000000000000002D);
                    field_48583_h = chunkcoordinates.field_22394_b;
                    field_48584_i = chunkcoordinates.field_22396_c + (int)((double)(MathHelper.func_1106_a(field_48582_a.field_1037_n.nextFloat() * 3.141593F * 2.0F) * f) * 0.90000000000000002D);
                    flag = false;
                    Iterator iterator1 = field_48582_a.field_48465_A.func_48554_b().iterator();
                    do
                    {
                        if(!iterator1.hasNext())
                        {
                            break;
                        }
                        Village village = (Village)iterator1.next();
                        if(village == field_48576_f || !village.func_48533_a(field_48577_g, field_48583_h, field_48584_i))
                        {
                            continue;
                        }
                        flag = true;
                        break;
                    } while(true);
                    if(!flag)
                    {
                        break;
                    }
                    i++;
                } while(true);
                if(flag)
                {
                    return false;
                }
                Vec3D vec3d = func_48572_a(field_48577_g, field_48583_h, field_48584_i);
                if(vec3d != null)
                {
                    field_48579_e = 0;
                    field_48578_d = 20;
                    return true;
                }
            }
        }

        return false;
    }

    private boolean func_48575_c()
    {
        Vec3D vec3d = func_48572_a(field_48577_g, field_48583_h, field_48584_i);
        if(vec3d == null)
        {
            return false;
        }
        EntityZombie entityzombie;
        try
        {
            entityzombie = new EntityZombie(field_48582_a);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
        entityzombie.func_365_c(vec3d.field_1776_a, vec3d.field_1775_b, vec3d.field_1779_c, field_48582_a.field_1037_n.nextFloat() * 360F, 0.0F);
        field_48582_a.func_674_a(entityzombie);
        ChunkCoordinates chunkcoordinates = field_48576_f.func_48539_a();
        entityzombie.func_48082_b(chunkcoordinates.field_22395_a, chunkcoordinates.field_22394_b, chunkcoordinates.field_22396_c, field_48576_f.func_48531_b());
        return true;
    }

    private Vec3D func_48572_a(int p_48572_1_, int p_48572_2_, int p_48572_3_)
    {
        for(int i = 0; i < 10; i++)
        {
            int j = (p_48572_1_ + field_48582_a.field_1037_n.nextInt(16)) - 8;
            int k = (p_48572_2_ + field_48582_a.field_1037_n.nextInt(6)) - 3;
            int l = (p_48572_3_ + field_48582_a.field_1037_n.nextInt(16)) - 8;
            if(field_48576_f.func_48533_a(j, k, l) && SpawnerAnimals.func_21203_a(EnumCreatureType.monster, field_48582_a, j, k, l))
            {
                return Vec3D.func_1248_b(j, k, l);
            }
        }

        return null;
    }
}
