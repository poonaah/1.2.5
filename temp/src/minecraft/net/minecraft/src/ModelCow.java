// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelQuadruped, ModelRenderer

public class ModelCow extends ModelQuadruped
{

    public ModelCow()
    {
        super(12, 0.0F);
        field_1266_d = new ModelRenderer(this, 0, 0);
        field_1266_d.func_923_a(-4F, -4F, -6F, 8, 8, 6, 0.0F);
        field_1266_d.func_925_a(0.0F, 4F, -8F);
        field_1266_d.func_40602_a(22, 0).func_923_a(-5F, -5F, -4F, 1, 3, 1, 0.0F);
        field_1266_d.func_40602_a(22, 0).func_923_a(4F, -5F, -4F, 1, 3, 1, 0.0F);
        field_1265_e = new ModelRenderer(this, 18, 4);
        field_1265_e.func_923_a(-6F, -10F, -7F, 12, 18, 10, 0.0F);
        field_1265_e.func_925_a(0.0F, 5F, 2.0F);
        field_1265_e.func_40602_a(52, 0).func_40604_a(-2F, 2.0F, -8F, 4, 6, 1);
        field_1264_f.field_1410_a--;
        field_1263_g.field_1410_a++;
        field_1264_f.field_1408_c += 0.0F;
        field_1263_g.field_1408_c += 0.0F;
        field_1262_h.field_1410_a--;
        field_1261_i.field_1410_a++;
        field_1262_h.field_1408_c--;
        field_1261_i.field_1408_c--;
        field_40332_n += 2.0F;
    }
}
