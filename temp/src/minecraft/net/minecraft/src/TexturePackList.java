// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.File;
import java.io.IOException;
import java.util.*;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            TexturePackDefault, GameSettings, TexturePackBase, TexturePackCustom, 
//            TexturePackFolder

public class TexturePackList
{

    private List field_6533_b;
    private TexturePackBase field_6539_c;
    public TexturePackBase field_6534_a;
    private Map field_6538_d;
    private Minecraft field_6537_e;
    private File field_6536_f;
    private String field_6535_g;

    public TexturePackList(Minecraft p_i340_1_, File p_i340_2_)
    {
        field_6533_b = new ArrayList();
        field_6539_c = new TexturePackDefault();
        field_6538_d = new HashMap();
        field_6537_e = p_i340_1_;
        field_6536_f = new File(p_i340_2_, "texturepacks");
        if(field_6536_f.exists())
        {
            if(!field_6536_f.isDirectory())
            {
                field_6536_f.delete();
                field_6536_f.mkdirs();
            }
        } else
        {
            field_6536_f.mkdirs();
        }
        field_6535_g = p_i340_1_.field_6304_y.field_6524_j;
        func_6532_a();
        field_6534_a.func_6482_a();
    }

    public boolean func_6531_a(TexturePackBase p_6531_1_)
    {
        if(p_6531_1_ == field_6534_a)
        {
            return false;
        } else
        {
            field_6534_a.func_6480_b();
            field_6535_g = p_6531_1_.field_6487_a;
            field_6534_a = p_6531_1_;
            field_6537_e.field_6304_y.field_6524_j = field_6535_g;
            field_6537_e.field_6304_y.func_1041_b();
            field_6534_a.func_6482_a();
            return true;
        }
    }

    public void func_6532_a()
    {
        ArrayList arraylist = new ArrayList();
        field_6534_a = null;
        arraylist.add(field_6539_c);
        if(field_6536_f.exists() && field_6536_f.isDirectory())
        {
            File afile[] = field_6536_f.listFiles();
            File afile1[] = afile;
            int i = afile1.length;
            for(int j = 0; j < i; j++)
            {
                File file = afile1[j];
                if(file.isFile() && file.getName().toLowerCase().endsWith(".zip"))
                {
                    String s = (new StringBuilder()).append(file.getName()).append(":").append(file.length()).append(":").append(file.lastModified()).toString();
                    try
                    {
                        if(!field_6538_d.containsKey(s))
                        {
                            TexturePackCustom texturepackcustom = new TexturePackCustom(file);
                            texturepackcustom.field_6488_d = s;
                            field_6538_d.put(s, texturepackcustom);
                            texturepackcustom.func_6485_a(field_6537_e);
                        }
                        TexturePackBase texturepackbase1 = (TexturePackBase)field_6538_d.get(s);
                        if(texturepackbase1.field_6487_a.equals(field_6535_g))
                        {
                            field_6534_a = texturepackbase1;
                        }
                        arraylist.add(texturepackbase1);
                    }
                    catch(IOException ioexception)
                    {
                        ioexception.printStackTrace();
                    }
                    continue;
                }
                if(!file.isDirectory() || !(new File(file, "pack.txt")).exists())
                {
                    continue;
                }
                String s1 = (new StringBuilder()).append(file.getName()).append(":folder:").append(file.lastModified()).toString();
                try
                {
                    if(!field_6538_d.containsKey(s1))
                    {
                        TexturePackFolder texturepackfolder = new TexturePackFolder(file);
                        texturepackfolder.field_6488_d = s1;
                        field_6538_d.put(s1, texturepackfolder);
                        texturepackfolder.func_6485_a(field_6537_e);
                    }
                    TexturePackBase texturepackbase2 = (TexturePackBase)field_6538_d.get(s1);
                    if(texturepackbase2.field_6487_a.equals(field_6535_g))
                    {
                        field_6534_a = texturepackbase2;
                    }
                    arraylist.add(texturepackbase2);
                }
                catch(IOException ioexception1)
                {
                    ioexception1.printStackTrace();
                }
            }

        }
        if(field_6534_a == null)
        {
            field_6534_a = field_6539_c;
        }
        field_6533_b.removeAll(arraylist);
        TexturePackBase texturepackbase;
        for(Iterator iterator = field_6533_b.iterator(); iterator.hasNext(); field_6538_d.remove(texturepackbase.field_6488_d))
        {
            texturepackbase = (TexturePackBase)iterator.next();
            texturepackbase.func_6484_b(field_6537_e);
        }

        field_6533_b = arraylist;
    }

    public List func_6530_b()
    {
        return new ArrayList(field_6533_b);
    }
}
