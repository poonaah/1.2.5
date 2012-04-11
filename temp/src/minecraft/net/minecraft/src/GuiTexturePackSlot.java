// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiSlot, GuiTexturePacks, TexturePackList, TexturePackBase, 
//            RenderEngine, Tessellator

class GuiTexturePackSlot extends GuiSlot
{

    final GuiTexturePacks field_22265_a; /* synthetic field */

    public GuiTexturePackSlot(GuiTexturePacks p_i267_1_)
    {
        field_22265_a = p_i267_1_;
        super(GuiTexturePacks.func_22124_a(p_i267_1_), p_i267_1_.field_951_c, p_i267_1_.field_950_d, 32, (p_i267_1_.field_950_d - 55) + 4, 36);
    }

    protected int func_22249_a()
    {
        List list = GuiTexturePacks.func_22126_b(field_22265_a).field_6298_C.func_6530_b();
        return list.size();
    }

    protected void func_22247_a(int p_22247_1_, boolean p_22247_2_)
    {
        List list = GuiTexturePacks.func_22119_c(field_22265_a).field_6298_C.func_6530_b();
        try
        {
            GuiTexturePacks.func_22122_d(field_22265_a).field_6298_C.func_6531_a((TexturePackBase)list.get(p_22247_1_));
            GuiTexturePacks.func_22117_e(field_22265_a).field_6315_n.func_1065_b();
        }
        catch(Exception exception)
        {
            GuiTexturePacks.func_35307_f(field_22265_a).field_6298_C.func_6531_a((TexturePackBase)list.get(0));
            GuiTexturePacks.func_35308_g(field_22265_a).field_6315_n.func_1065_b();
        }
    }

    protected boolean func_22246_a(int p_22246_1_)
    {
        List list = GuiTexturePacks.func_22118_f(field_22265_a).field_6298_C.func_6530_b();
        return GuiTexturePacks.func_22116_g(field_22265_a).field_6298_C.field_6534_a == list.get(p_22246_1_);
    }

    protected int func_22245_b()
    {
        return func_22249_a() * 36;
    }

    protected void func_22248_c()
    {
        field_22265_a.func_578_i();
    }

    protected void func_22242_a(int p_22242_1_, int p_22242_2_, int p_22242_3_, int p_22242_4_, Tessellator p_22242_5_)
    {
        TexturePackBase texturepackbase = (TexturePackBase)GuiTexturePacks.func_22121_h(field_22265_a).field_6298_C.func_6530_b().get(p_22242_1_);
        texturepackbase.func_6483_c(GuiTexturePacks.func_22123_i(field_22265_a));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        p_22242_5_.func_977_b();
        p_22242_5_.func_990_b(0xffffff);
        p_22242_5_.func_983_a(p_22242_2_, p_22242_3_ + p_22242_4_, 0.0D, 0.0D, 1.0D);
        p_22242_5_.func_983_a(p_22242_2_ + 32, p_22242_3_ + p_22242_4_, 0.0D, 1.0D, 1.0D);
        p_22242_5_.func_983_a(p_22242_2_ + 32, p_22242_3_, 0.0D, 1.0D, 0.0D);
        p_22242_5_.func_983_a(p_22242_2_, p_22242_3_, 0.0D, 0.0D, 0.0D);
        p_22242_5_.func_982_a();
        field_22265_a.func_547_b(GuiTexturePacks.func_22127_j(field_22265_a), texturepackbase.field_6487_a, p_22242_2_ + 32 + 2, p_22242_3_ + 1, 0xffffff);
        field_22265_a.func_547_b(GuiTexturePacks.func_22120_k(field_22265_a), texturepackbase.field_6486_b, p_22242_2_ + 32 + 2, p_22242_3_ + 12, 0x808080);
        field_22265_a.func_547_b(GuiTexturePacks.func_22125_l(field_22265_a), texturepackbase.field_6489_c, p_22242_2_ + 32 + 2, p_22242_3_ + 12 + 10, 0x808080);
    }
}
