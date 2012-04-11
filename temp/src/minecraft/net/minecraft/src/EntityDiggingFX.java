// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityFX, Block, Tessellator, World

public class EntityDiggingFX extends EntityFX
{

    private Block field_4082_a;

    public EntityDiggingFX(World p_i446_1_, double p_i446_2_, double p_i446_4_, double p_i446_6_, 
            double p_i446_8_, double p_i446_10_, double p_i446_12_, Block p_i446_14_, 
            int p_i446_15_, int p_i446_16_)
    {
        super(p_i446_1_, p_i446_2_, p_i446_4_, p_i446_6_, p_i446_8_, p_i446_10_, p_i446_12_);
        field_4082_a = p_i446_14_;
        func_40099_c(p_i446_14_.func_232_a(0, p_i446_16_));
        field_664_h = p_i446_14_.field_357_bm;
        field_663_i = field_662_j = field_661_k = 0.6F;
        field_665_g /= 2.0F;
    }

    public EntityDiggingFX func_4041_a(int p_4041_1_, int p_4041_2_, int p_4041_3_)
    {
        if(field_4082_a == Block.field_337_v)
        {
            return this;
        } else
        {
            int i = field_4082_a.func_207_d(field_615_ag, p_4041_1_, p_4041_2_, p_4041_3_);
            field_663_i *= (float)(i >> 16 & 0xff) / 255F;
            field_662_j *= (float)(i >> 8 & 0xff) / 255F;
            field_661_k *= (float)(i & 0xff) / 255F;
            return this;
        }
    }

    public int func_404_c()
    {
        return 1;
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
