// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, World, EntityPlayer, Block, 
//            BlockEndPortalFrame, ItemStack, Direction, MovingObjectPosition, 
//            EnumMovingObjectType, EntityEnderEye, ChunkPosition, PlayerCapabilities

public class ItemEnderEye extends Item
{

    public ItemEnderEye(int p_i520_1_)
    {
        super(p_i520_1_);
    }

    public boolean func_192_a(ItemStack p_192_1_, EntityPlayer p_192_2_, World p_192_3_, int p_192_4_, int p_192_5_, int p_192_6_, int p_192_7_)
    {
        int i = p_192_3_.func_600_a(p_192_4_, p_192_5_, p_192_6_);
        int j = p_192_3_.func_602_e(p_192_4_, p_192_5_, p_192_6_);
        if(p_192_2_.func_35190_e(p_192_4_, p_192_5_, p_192_6_) && i == Block.field_40202_bJ.field_376_bc && !BlockEndPortalFrame.func_40212_d(j))
        {
            if(p_192_3_.field_1026_y)
            {
                return true;
            }
            p_192_3_.func_691_b(p_192_4_, p_192_5_, p_192_6_, j + 4);
            p_192_1_.field_1615_a--;
            for(int k = 0; k < 16; k++)
            {
                double d = (float)p_192_4_ + (5F + field_4015_b.nextFloat() * 6F) / 16F;
                double d1 = (float)p_192_5_ + 0.8125F;
                double d2 = (float)p_192_6_ + (5F + field_4015_b.nextFloat() * 6F) / 16F;
                double d3 = 0.0D;
                double d4 = 0.0D;
                double d5 = 0.0D;
                p_192_3_.func_694_a("smoke", d, d1, d2, d3, d4, d5);
            }

            int l = j & 3;
            int i1 = 0;
            int j1 = 0;
            boolean flag = false;
            boolean flag1 = true;
            int k1 = Direction.field_35867_f[l];
            for(int l1 = -2; l1 <= 2; l1++)
            {
                int l2 = p_192_4_ + Direction.field_35871_a[k1] * l1;
                int l3 = p_192_6_ + Direction.field_35870_b[k1] * l1;
                int l4 = p_192_3_.func_600_a(l2, p_192_5_, l3);
                if(l4 != Block.field_40202_bJ.field_376_bc)
                {
                    continue;
                }
                int l5 = p_192_3_.func_602_e(l2, p_192_5_, l3);
                if(!BlockEndPortalFrame.func_40212_d(l5))
                {
                    flag1 = false;
                    break;
                }
                if(!flag)
                {
                    i1 = l1;
                    j1 = l1;
                    flag = true;
                } else
                {
                    j1 = l1;
                }
            }

            if(flag1 && j1 == i1 + 2)
            {
                int i2 = i1;
                do
                {
                    if(i2 > j1)
                    {
                        break;
                    }
                    int i3 = p_192_4_ + Direction.field_35871_a[k1] * i2;
                    int i4 = p_192_6_ + Direction.field_35870_b[k1] * i2;
                    i3 += Direction.field_35871_a[l] * 4;
                    i4 += Direction.field_35870_b[l] * 4;
                    int i5 = p_192_3_.func_600_a(i3, p_192_5_, i4);
                    int i6 = p_192_3_.func_602_e(i3, p_192_5_, i4);
                    if(i5 != Block.field_40202_bJ.field_376_bc || !BlockEndPortalFrame.func_40212_d(i6))
                    {
                        flag1 = false;
                        break;
                    }
                    i2++;
                } while(true);
label0:
                for(int j2 = i1 - 1; j2 <= j1 + 1; j2 += 4)
                {
                    int j3 = 1;
                    do
                    {
                        if(j3 > 3)
                        {
                            continue label0;
                        }
                        int j4 = p_192_4_ + Direction.field_35871_a[k1] * j2;
                        int j5 = p_192_6_ + Direction.field_35870_b[k1] * j2;
                        j4 += Direction.field_35871_a[l] * j3;
                        j5 += Direction.field_35870_b[l] * j3;
                        int j6 = p_192_3_.func_600_a(j4, p_192_5_, j5);
                        int k6 = p_192_3_.func_602_e(j4, p_192_5_, j5);
                        if(j6 != Block.field_40202_bJ.field_376_bc || !BlockEndPortalFrame.func_40212_d(k6))
                        {
                            flag1 = false;
                            continue label0;
                        }
                        j3++;
                    } while(true);
                }

                if(flag1)
                {
                    for(int k2 = i1; k2 <= j1; k2++)
                    {
                        for(int k3 = 1; k3 <= 3; k3++)
                        {
                            int k4 = p_192_4_ + Direction.field_35871_a[k1] * k2;
                            int k5 = p_192_6_ + Direction.field_35870_b[k1] * k2;
                            k4 += Direction.field_35871_a[l] * k3;
                            k5 += Direction.field_35870_b[l] * k3;
                            p_192_3_.func_690_d(k4, p_192_5_, k5, Block.field_40209_bI.field_376_bc);
                        }

                    }

                }
            }
            return true;
        } else
        {
            return false;
        }
    }

    public ItemStack func_193_a(ItemStack p_193_1_, World p_193_2_, EntityPlayer p_193_3_)
    {
        MovingObjectPosition movingobjectposition = func_40402_a(p_193_2_, p_193_3_, false);
        if(movingobjectposition != null && movingobjectposition.field_1167_a == EnumMovingObjectType.TILE)
        {
            int i = p_193_2_.func_600_a(movingobjectposition.field_1166_b, movingobjectposition.field_1172_c, movingobjectposition.field_1171_d);
            if(i == Block.field_40202_bJ.field_376_bc)
            {
                return p_193_1_;
            }
        }
        if(!p_193_2_.field_1026_y)
        {
            ChunkPosition chunkposition = p_193_2_.func_40477_b("Stronghold", (int)p_193_3_.field_611_ak, (int)p_193_3_.field_610_al, (int)p_193_3_.field_609_am);
            if(chunkposition != null)
            {
                EntityEnderEye entityendereye = new EntityEnderEye(p_193_2_, p_193_3_.field_611_ak, (p_193_3_.field_610_al + 1.6200000000000001D) - (double)p_193_3_.field_9292_aO, p_193_3_.field_609_am);
                entityendereye.func_40090_a(chunkposition.field_1111_a, chunkposition.field_1110_b, chunkposition.field_1112_c);
                p_193_2_.func_674_a(entityendereye);
                p_193_2_.func_623_a(p_193_3_, "random.bow", 0.5F, 0.4F / (field_4015_b.nextFloat() * 0.4F + 0.8F));
                p_193_2_.func_28107_a(null, 1002, (int)p_193_3_.field_611_ak, (int)p_193_3_.field_610_al, (int)p_193_3_.field_609_am, 0);
                if(!p_193_3_.field_35212_aW.field_35756_d)
                {
                    p_193_1_.field_1615_a--;
                }
            }
        }
        return p_193_1_;
    }
}
