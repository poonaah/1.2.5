// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityFX, Item, Block, Tessellator, 
//            World

public class EntityBreakingFX extends EntityFX
{

    public EntityBreakingFX(World p_i426_1_, double p_i426_2_, double p_i426_4_, double p_i426_6_, 
            Item p_i426_8_)
    {
        super(p_i426_1_, p_i426_2_, p_i426_4_, p_i426_6_, 0.0D, 0.0D, 0.0D);
        func_40099_c(p_i426_8_.func_27009_a(0));
        field_663_i = field_662_j = field_661_k = 1.0F;
        field_664_h = Block.field_426_aV.field_357_bm;
        field_665_g /= 2.0F;
    }

    public EntityBreakingFX(World p_i427_1_, double p_i427_2_, double p_i427_4_, double p_i427_6_, 
            double p_i427_8_, double p_i427_10_, double p_i427_12_, Item p_i427_14_)
    {
        this(p_i427_1_, p_i427_2_, p_i427_4_, p_i427_6_, p_i427_14_);
        field_608_an *= 0.10000000149011612D;
        field_607_ao *= 0.10000000149011612D;
        field_606_ap *= 0.10000000149011612D;
        field_608_an += p_i427_8_;
        field_607_ao += p_i427_10_;
        field_606_ap += p_i427_12_;
    }

    public int func_404_c()
    {
        return 2;
    }

    public void func_406_a(Tessellator p_406_1_, float p_406_2_, float p_406_3_, float p_406_4_, float p_406_5_, float p_406_6_, float p_406_7_)
    {
        float f = ((float)(func_40100_q() % 16) + field_669_c / 4F) / 16F;
        float f1 = f + 0.01560938F;
        float f2 = ((float)(func_40100_q() / 16) + field_668_d / 4F) / 16F;
        float f3 = f2 + 0.01560938F;
        float f4 = 0.1F * field_665_g;
        float f5 = (float)((field_9285_at + (field_611_ak - field_9285_at) * (double)p_406_2_) - field_660_l);
        float f6 = (float)((field_9284_au + (field_610_al - field_9284_au) * (double)p_406_2_) - field_659_m);
        float f7 = (float)((field_9283_av + (field_609_am - field_9283_av) * (double)p_406_2_) - field_658_n);
        float f8 = 1.0F;
        p_406_1_.func_987_a(f8 * field_663_i, f8 * field_662_j, f8 * field_661_k);
        p_406_1_.func_983_a(f5 - p_406_3_ * f4 - p_406_6_ * f4, f6 - p_406_4_ * f4, f7 - p_406_5_ * f4 - p_406_7_ * f4, f, f3);
        p_406_1_.func_983_a((f5 - p_406_3_ * f4) + p_406_6_ * f4, f6 + p_406_4_ * f4, (f7 - p_406_5_ * f4) + p_406_7_ * f4, f, f2);
        p_406_1_.func_983_a(f5 + p_406_3_ * f4 + p_406_6_ * f4, f6 + p_406_4_ * f4, f7 + p_406_5_ * f4 + p_406_7_ * f4, f1, f2);
        p_406_1_.func_983_a((f5 + p_406_3_ * f4) - p_406_6_ * f4, f6 - p_406_4_ * f4, (f7 + p_406_5_ * f4) - p_406_7_ * f4, f1, f3);
    }
}
