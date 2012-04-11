// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            TileEntitySpecialRenderer, TileEntityMobSpawner, Entity, EntityList, 
//            RenderManager, TileEntity

public class TileEntityMobSpawnerRenderer extends TileEntitySpecialRenderer
{

    private Map field_1412_b;

    public TileEntityMobSpawnerRenderer()
    {
        field_1412_b = new HashMap();
    }

    public void func_931_a(TileEntityMobSpawner p_931_1_, double p_931_2_, double p_931_4_, double p_931_6_, 
            float p_931_8_)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_931_2_ + 0.5F, (float)p_931_4_, (float)p_931_6_ + 0.5F);
        Entity entity = (Entity)field_1412_b.get(p_931_1_.func_21099_a());
        if(entity == null)
        {
            entity = EntityList.func_1079_a(p_931_1_.func_21099_a(), null);
            field_1412_b.put(p_931_1_.func_21099_a(), entity);
        }
        if(entity != null)
        {
            entity.func_398_a(p_931_1_.field_824_e);
            float f = 0.4375F;
            GL11.glTranslatef(0.0F, 0.4F, 0.0F);
            GL11.glRotatef((float)(p_931_1_.field_830_d + (p_931_1_.field_831_c - p_931_1_.field_830_d) * (double)p_931_8_) * 10F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-30F, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.4F, 0.0F);
            GL11.glScalef(f, f, f);
            entity.func_365_c(p_931_2_, p_931_4_, p_931_6_, 0.0F, 0.0F);
            RenderManager.field_1233_a.func_853_a(entity, 0.0D, 0.0D, 0.0D, 0.0F, p_931_8_);
        }
        GL11.glPopMatrix();
    }

    public void func_930_a(TileEntity p_930_1_, double p_930_2_, double p_930_4_, double p_930_6_, 
            float p_930_8_)
    {
        func_931_a((TileEntityMobSpawner)p_930_1_, p_930_2_, p_930_4_, p_930_6_, p_930_8_);
    }
}
