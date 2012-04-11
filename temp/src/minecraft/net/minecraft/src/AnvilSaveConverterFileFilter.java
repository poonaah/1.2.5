// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package net.minecraft.src:
//            AnvilSaveConverter

class AnvilSaveConverterFileFilter
    implements FilenameFilter
{

    final AnvilSaveConverter field_48552_a; /* synthetic field */

    AnvilSaveConverterFileFilter(AnvilSaveConverter p_i1006_1_)
    {
        field_48552_a = p_i1006_1_;
        super();
    }

    public boolean accept(File p_accept_1_, String p_accept_2_)
    {
        return p_accept_2_.endsWith(".mcr");
    }
}
