// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityCow, EntityPlayer, InventoryPlayer, ItemStack, 
//            Item, PlayerCapabilities, ItemShears, World, 
//            EntityItem, Block, EntityAnimal

public class EntityMooshroom extends EntityCow
{

    public EntityMooshroom(World p_i491_1_)
    {
        super(p_i491_1_);
        field_9357_z = "/mob/redcow.png";
        func_371_a(0.9F, 1.3F);
    }

    public boolean func_353_a(EntityPlayer p_353_1_)
    {
        ItemStack itemstack = p_353_1_.field_778_b.func_494_a();
        if(itemstack != null && itemstack.field_1617_c == Item.field_264_C.field_291_aS && func_48123_at() >= 0)
        {
            if(itemstack.field_1615_a == 1)
            {
                p_353_1_.field_778_b.func_472_a(p_353_1_.field_778_b.field_847_d, new ItemStack(Item.field_263_D));
                return true;
            }
            if(p_353_1_.field_778_b.func_504_a(new ItemStack(Item.field_263_D)) && !p_353_1_.field_35212_aW.field_35756_d)
            {
                p_353_1_.field_778_b.func_473_a(p_353_1_.field_778_b.field_847_d, 1);
                return true;
            }
        }
        if(itemstack != null && itemstack.field_1617_c == Item.field_31001_bc.field_291_aS && func_48123_at() >= 0)
        {
            func_395_F();
            field_615_ag.func_694_a("largeexplode", field_611_ak, field_610_al + (double)(field_643_aD / 2.0F), field_609_am, 0.0D, 0.0D, 0.0D);
            if(!field_615_ag.field_1026_y)
            {
                EntityCow entitycow = new EntityCow(field_615_ag);
                entitycow.func_365_c(field_611_ak, field_610_al, field_609_am, field_605_aq, field_604_ar);
                entitycow.func_40121_k(func_40114_aH());
                entitycow.field_735_n = field_735_n;
                field_615_ag.func_674_a(entitycow);
                for(int i = 0; i < 5; i++)
                {
                    field_615_ag.func_674_a(new EntityItem(field_615_ag, field_611_ak, field_610_al + (double)field_643_aD, field_609_am, new ItemStack(Block.field_414_ah)));
                }

            }
            return true;
        } else
        {
            return super.func_353_a(p_353_1_);
        }
    }

    public EntityAnimal func_40145_a(EntityAnimal p_40145_1_)
    {
        return new EntityMooshroom(field_615_ag);
    }
}
