// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityFX, Material, World, MathHelper, 
//            BlockFluid

public class EntityDropParticleFX extends EntityFX
{

    private Material field_40103_a;
    private int field_40104_aw;

    public EntityDropParticleFX(World p_i334_1_, double p_i334_2_, double p_i334_4_, double p_i334_6_, 
            Material p_i334_8_)
    {
        super(p_i334_1_, p_i334_2_, p_i334_4_, p_i334_6_, 0.0D, 0.0D, 0.0D);
        field_608_an = field_607_ao = field_606_ap = 0.0D;
        if(p_i334_8_ == Material.field_1332_f)
        {
            field_663_i = 0.0F;
            field_662_j = 0.0F;
            field_661_k = 1.0F;
        } else
        {
            field_663_i = 1.0F;
            field_662_j = 0.0F;
            field_661_k = 0.0F;
        }
        func_40099_c(113);
        func_371_a(0.01F, 0.01F);
        field_664_h = 0.06F;
        field_40103_a = p_i334_8_;
        field_40104_aw = 40;
        field_666_f = (int)(64D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
        field_608_an = field_607_ao = field_606_ap = 0.0D;
    }

    public int func_35115_a(float p_35115_1_)
    {
        if(field_40103_a == Material.field_1332_f)
        {
            return super.func_35115_a(p_35115_1_);
        } else
        {
            return 257;
        }
    }

    public float func_382_a(float p_382_1_)
    {
        if(field_40103_a == Material.field_1332_f)
        {
            return super.func_382_a(p_382_1_);
        } else
        {
            return 1.0F;
        }
    }

    public void func_370_e_()
    {
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        if(field_40103_a == Material.field_1332_f)
        {
            field_663_i = 0.2F;
            field_662_j = 0.3F;
            field_661_k = 1.0F;
        } else
        {
            field_663_i = 1.0F;
            field_662_j = 16F / (float)((40 - field_40104_aw) + 16);
            field_661_k = 4F / (float)((40 - field_40104_aw) + 8);
        }
        field_607_ao -= field_664_h;
        if(field_40104_aw-- > 0)
        {
            field_608_an *= 0.02D;
            field_607_ao *= 0.02D;
            field_606_ap *= 0.02D;
            func_40099_c(113);
        } else
        {
            func_40099_c(112);
        }
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.98000001907348633D;
        field_607_ao *= 0.98000001907348633D;
        field_606_ap *= 0.98000001907348633D;
        if(field_666_f-- <= 0)
        {
            func_395_F();
        }
        if(field_9298_aH)
        {
            if(field_40103_a == Material.field_1332_f)
            {
                func_395_F();
                field_615_ag.func_694_a("splash", field_611_ak, field_610_al, field_609_am, 0.0D, 0.0D, 0.0D);
            } else
            {
                func_40099_c(114);
            }
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
        Material material = field_615_ag.func_599_f(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am));
        if(material.func_879_d() || material.func_878_a())
        {
            double d = (float)(MathHelper.func_1108_b(field_610_al) + 1) - BlockFluid.func_288_b(field_615_ag.func_602_e(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am)));
            if(field_610_al < d)
            {
                func_395_F();
            }
        }
    }
}
