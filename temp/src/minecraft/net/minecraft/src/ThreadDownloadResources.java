// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import net.minecraft.client.Minecraft;
import org.w3c.dom.*;

public class ThreadDownloadResources extends Thread
{

    public File field_1768_a;
    private Minecraft field_1767_b;
    private boolean field_1769_c;

    public ThreadDownloadResources(File p_i264_1_, Minecraft p_i264_2_)
    {
        field_1769_c = false;
        field_1767_b = p_i264_2_;
        setName("Resource download thread");
        setDaemon(true);
        field_1768_a = new File(p_i264_1_, "resources/");
        if(!field_1768_a.exists() && !field_1768_a.mkdirs())
        {
            throw new RuntimeException((new StringBuilder()).append("The working directory could not be created: ").append(field_1768_a).toString());
        } else
        {
            return;
        }
    }

    public void run()
    {
        try
        {
            URL url = new URL("http://s3.amazonaws.com/MinecraftResources/");
            DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentbuilder = documentbuilderfactory.newDocumentBuilder();
            Document document = documentbuilder.parse(url.openStream());
            NodeList nodelist = document.getElementsByTagName("Contents");
            for(int i = 0; i < 2; i++)
            {
                for(int j = 0; j < nodelist.getLength(); j++)
                {
                    Node node = nodelist.item(j);
                    if(node.getNodeType() != 1)
                    {
                        continue;
                    }
                    Element element = (Element)node;
                    String s = ((Element)element.getElementsByTagName("Key").item(0)).getChildNodes().item(0).getNodeValue();
                    long l = Long.parseLong(((Element)element.getElementsByTagName("Size").item(0)).getChildNodes().item(0).getNodeValue());
                    if(l <= 0L)
                    {
                        continue;
                    }
                    func_1211_a(url, s, l, i);
                    if(field_1769_c)
                    {
                        return;
                    }
                }

            }

        }
        catch(Exception exception)
        {
            func_1209_a(field_1768_a, "");
            exception.printStackTrace();
        }
    }

    public void func_1210_a()
    {
        func_1209_a(field_1768_a, "");
    }

    private void func_1209_a(File p_1209_1_, String p_1209_2_)
    {
        File afile[] = p_1209_1_.listFiles();
        for(int i = 0; i < afile.length; i++)
        {
            if(afile[i].isDirectory())
            {
                func_1209_a(afile[i], (new StringBuilder()).append(p_1209_2_).append(afile[i].getName()).append("/").toString());
                continue;
            }
            try
            {
                field_1767_b.func_6268_a((new StringBuilder()).append(p_1209_2_).append(afile[i].getName()).toString(), afile[i]);
            }
            catch(Exception exception)
            {
                System.out.println((new StringBuilder()).append("Failed to add ").append(p_1209_2_).append(afile[i].getName()).toString());
            }
        }

    }

    private void func_1211_a(URL p_1211_1_, String p_1211_2_, long p_1211_3_, int p_1211_5_)
    {
        try
        {
            int i = p_1211_2_.indexOf("/");
            String s = p_1211_2_.substring(0, i);
            if(s.equals("sound") || s.equals("newsound"))
            {
                if(p_1211_5_ != 0)
                {
                    return;
                }
            } else
            if(p_1211_5_ != 1)
            {
                return;
            }
            File file = new File(field_1768_a, p_1211_2_);
            if(!file.exists() || file.length() != p_1211_3_)
            {
                file.getParentFile().mkdirs();
                String s1 = p_1211_2_.replaceAll(" ", "%20");
                func_1212_a(new URL(p_1211_1_, s1), file, p_1211_3_);
                if(field_1769_c)
                {
                    return;
                }
            }
            field_1767_b.func_6268_a(p_1211_2_, file);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void func_1212_a(URL p_1212_1_, File p_1212_2_, long p_1212_3_)
        throws IOException
    {
        byte abyte0[] = new byte[4096];
        DataInputStream datainputstream = new DataInputStream(p_1212_1_.openStream());
        DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(p_1212_2_));
        for(int i = 0; (i = datainputstream.read(abyte0)) >= 0;)
        {
            dataoutputstream.write(abyte0, 0, i);
            if(field_1769_c)
            {
                return;
            }
        }

        datainputstream.close();
        dataoutputstream.close();
    }

    public void func_1208_b()
    {
        field_1769_c = true;
    }
}
