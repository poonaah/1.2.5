// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import argo.saj.InvalidSyntaxException;
import argo.saj.SajParser;
import java.io.*;

// Referenced classes of package argo.jdom:
//            JsonListenerToJdomAdapter, JsonRootNode

public final class JdomParser
{

    public JdomParser()
    {
    }

    public JsonRootNode func_27366_a(Reader p_27366_1_)
        throws InvalidSyntaxException, IOException
    {
        JsonListenerToJdomAdapter jsonlistenertojdomadapter = new JsonListenerToJdomAdapter();
        (new SajParser()).func_27463_a(p_27366_1_, jsonlistenertojdomadapter);
        return jsonlistenertojdomadapter.func_27208_a();
    }

    public JsonRootNode func_27367_a(String p_27367_1_)
        throws InvalidSyntaxException
    {
        JsonRootNode jsonrootnode;
        try
        {
            jsonrootnode = func_27366_a(new StringReader(p_27367_1_));
        }
        catch(IOException ioexception)
        {
            throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", ioexception);
        }
        return jsonrootnode;
    }
}
