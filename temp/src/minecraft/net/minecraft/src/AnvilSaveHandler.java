// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.File;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            SaveHandler, WorldProviderHell, AnvilChunkLoader, WorldProviderEnd, 
//            WorldInfo, WorldProvider, IChunkLoader

public class AnvilSaveHandler extends SaveHandler
{

    public AnvilSaveHandler(File p_i1012_1_, String p_i1012_2_, boolean p_i1012_3_)
    {
        super(p_i1012_1_, p_i1012_2_, p_i1012_3_);
    }

    public IChunkLoader func_22149_a(WorldProvider p_22149_1_)
    {
        File file = func_22153_a();
        if(p_22149_1_ instanceof WorldProviderHell)
        {
            File file1 = new File(file, "DIM-1");
            file1.mkdirs();
            return new AnvilChunkLoader(file1);
        }
        if(p_22149_1_ instanceof WorldProviderEnd)
        {
            File file2 = new File(file, "DIM1");
            file2.mkdirs();
            return new AnvilChunkLoader(file2);
        } else
        {
            return new AnvilChunkLoader(file);
        }
    }

    public void func_22148_a(WorldInfo p_22148_1_, List p_22148_2_)
    {
        p_22148_1_.func_22289_d(19133);
        super.func_22148_a(p_22148_1_, p_22148_2_);
    }
}
