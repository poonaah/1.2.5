// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.format;

import argo.jdom.*;
import java.io.*;
import java.util.*;

// Referenced classes of package argo.format:
//            JsonFormatter, CompactJsonFormatter_JsonNodeType, JsonEscapedString

public final class CompactJsonFormatter
    implements JsonFormatter
{

    public CompactJsonFormatter()
    {
    }

    public String func_27327_a(JsonRootNode p_27327_1_)
    {
        StringWriter stringwriter = new StringWriter();
        try
        {
            func_27329_a(p_27327_1_, stringwriter);
        }
        catch(IOException ioexception)
        {
            throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", ioexception);
        }
        return stringwriter.toString();
    }

    public void func_27329_a(JsonRootNode p_27329_1_, Writer p_27329_2_)
        throws IOException
    {
        func_27328_a(p_27329_1_, p_27329_2_);
    }

    private void func_27328_a(JsonNode p_27328_1_, Writer p_27328_2_)
        throws IOException
    {
        boolean flag = true;
        switch(CompactJsonFormatter_JsonNodeType.field_27341_a[p_27328_1_.func_27218_a().ordinal()])
        {
        case 1: // '\001'
            p_27328_2_.append('[');
            JsonNode jsonnode;
            for(Iterator iterator = p_27328_1_.func_27215_d().iterator(); iterator.hasNext(); func_27328_a(jsonnode, p_27328_2_))
            {
                jsonnode = (JsonNode)iterator.next();
                if(!flag)
                {
                    p_27328_2_.append(',');
                }
                flag = false;
            }

            p_27328_2_.append(']');
            break;

        case 2: // '\002'
            p_27328_2_.append('{');
            JsonStringNode jsonstringnode;
            for(Iterator iterator1 = (new TreeSet(p_27328_1_.func_27214_c().keySet())).iterator(); iterator1.hasNext(); func_27328_a((JsonNode)p_27328_1_.func_27214_c().get(jsonstringnode), p_27328_2_))
            {
                jsonstringnode = (JsonStringNode)iterator1.next();
                if(!flag)
                {
                    p_27328_2_.append(',');
                }
                flag = false;
                func_27328_a(((JsonNode) (jsonstringnode)), p_27328_2_);
                p_27328_2_.append(':');
            }

            p_27328_2_.append('}');
            break;

        case 3: // '\003'
            p_27328_2_.append('"').append((new JsonEscapedString(p_27328_1_.func_27216_b())).toString()).append('"');
            break;

        case 4: // '\004'
            p_27328_2_.append(p_27328_1_.func_27216_b());
            break;

        case 5: // '\005'
            p_27328_2_.append("false");
            break;

        case 6: // '\006'
            p_27328_2_.append("true");
            break;

        case 7: // '\007'
            p_27328_2_.append("null");
            break;

        default:
            throw new RuntimeException((new StringBuilder()).append("Coding failure in Argo:  Attempt to format a JsonNode of unknown type [").append(p_27328_1_.func_27218_a()).append("];").toString());
        }
    }
}
