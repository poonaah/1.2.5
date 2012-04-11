// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            CanvasIsomPreview

class ThreadRunIsoClient extends Thread
{

    final CanvasIsomPreview field_1197_a; /* synthetic field */

    ThreadRunIsoClient(CanvasIsomPreview p_i495_1_)
    {
        field_1197_a = p_i495_1_;
        super();
    }

    public void run()
    {
        while(CanvasIsomPreview.func_1271_a(field_1197_a)) 
        {
            field_1197_a.func_1265_d();
            try
            {
                Thread.sleep(1L);
            }
            catch(Exception exception) { }
        }
    }
}
