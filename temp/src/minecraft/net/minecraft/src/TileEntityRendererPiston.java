// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            TileEntitySpecialRenderer, Block, TileEntityPiston, Tessellator, 
//            RenderHelper, RenderBlocks, BlockPistonBase, BlockPistonExtension, 
//            World, TileEntity

public class TileEntityRendererPiston extends TileEntitySpecialRenderer
{

    private RenderBlocks field_31071_b;

    public TileEntityRendererPiston()
    {
    }

    public void func_31070_a(TileEntityPiston p_31070_1_, double p_31070_2_, double p_31070_4_, double p_31070_6_, 
            float p_31070_8_)
    {
        Block block = Block.field_345_n[p_31070_1_.func_31016_a()];
        if(block != null && p_31070_1_.func_31008_a(p_31070_8_) < 1.0F)
        {
            Tessellator tessellator = Tessellator.field_1512_a;
            func_6507_a("/terrain.png");
            RenderHelper.func_1159_a();
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glDisable(2884);
            if(Minecraft.func_22005_v())
            {
                GL11.glShadeModel(7425);
            } else
            {
                GL11.glShadeModel(7424);
            }
            tessellator.func_977_b();
            tessellator.func_984_b(((float)p_31070_2_ - (float)p_31070_1_.field_823_f) + p_31070_1_.func_31017_b(p_31070_8_), ((float)p_31070_4_ - (float)p_31070_1_.field_822_g) + p_31070_1_.func_31014_c(p_31070_8_), ((float)p_31070_6_ - (float)p_31070_1_.field_821_h) + p_31070_1_.func_31013_d(p_31070_8_));
            tessellator.func_979_a(1, 1, 1);
            if(block == Block.field_9269_aa && p_31070_1_.func_31008_a(p_31070_8_) < 0.5F)
            {
                field_31071_b.func_31079_a(block, p_31070_1_.field_823_f, p_31070_1_.field_822_g, p_31070_1_.field_821_h, false);
            } else
            if(p_31070_1_.func_31012_k() && !p_31070_1_.func_31015_b())
            {
                Block.field_9269_aa.func_31052_a_(((BlockPistonBase)block).func_31040_i());
                field_31071_b.func_31079_a(Block.field_9269_aa, p_31070_1_.field_823_f, p_31070_1_.field_822_g, p_31070_1_.field_821_h, p_31070_1_.func_31008_a(p_31070_8_) < 0.5F);
                Block.field_9269_aa.func_31051_a();
                tessellator.func_984_b((float)p_31070_2_ - (float)p_31070_1_.field_823_f, (float)p_31070_4_ - (float)p_31070_1_.field_822_g, (float)p_31070_6_ - (float)p_31070_1_.field_821_h);
                field_31071_b.func_31078_d(block, p_31070_1_.field_823_f, p_31070_1_.field_822_g, p_31070_1_.field_821_h);
            } else
            {
                field_31071_b.func_31075_a(block, p_31070_1_.field_823_f, p_31070_1_.field_822_g, p_31070_1_.field_821_h);
            }
            tessellator.func_984_b(0.0D, 0.0D, 0.0D);
            tessellator.func_982_a();
            RenderHelper.func_1158_b();
        }
    }

    public void func_31069_a(World p_31069_1_)
    {
        field_31071_b = new RenderBlocks(p_31069_1_);
    }

    public void func_930_a(TileEntity p_930_1_, double p_930_2_, double p_930_4_, double p_930_6_, 
            float p_930_8_)
    {
        func_31070_a((TileEntityPiston)p_930_1_, p_930_2_, p_930_4_, p_930_6_, p_930_8_);
    }
}
