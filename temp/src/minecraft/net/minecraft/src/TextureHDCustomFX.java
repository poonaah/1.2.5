// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TextureFX, TextureHDFX, TexturePackBase

public class TextureHDCustomFX extends TextureFX
    implements TextureHDFX
{

    private TexturePackBase texturePackBase;
    private int tileWidth;

    public TextureHDCustomFX(int i, int j)
    {
        super(i);
        tileWidth = 0;
        field_1128_f = j;
        tileWidth = 16;
        field_1127_a = null;
    }

    public void setTileWidth(int i)
    {
        tileWidth = i;
    }

    public void setTexturePackBase(TexturePackBase texturepackbase)
    {
        texturePackBase = texturepackbase;
    }

    public void func_783_a()
    {
    }
}
