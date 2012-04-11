// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import argo.format.CompactJsonFormatter;
import argo.format.JsonFormatter;

// Referenced classes of package argo.jdom:
//            JsonNodeDoesNotMatchJsonNodeSelectorException, JsonNodeDoesNotMatchChainedJsonNodeSelectorException, JsonRootNode

public final class JsonNodeDoesNotMatchPathElementsException extends JsonNodeDoesNotMatchJsonNodeSelectorException
{

    private static final JsonFormatter field_27320_a = new CompactJsonFormatter();

    static JsonNodeDoesNotMatchPathElementsException func_27319_a(JsonNodeDoesNotMatchChainedJsonNodeSelectorException p_27319_0_, Object p_27319_1_[], JsonRootNode p_27319_2_)
    {
        return new JsonNodeDoesNotMatchPathElementsException(p_27319_0_, p_27319_1_, p_27319_2_);
    }

    private JsonNodeDoesNotMatchPathElementsException(JsonNodeDoesNotMatchChainedJsonNodeSelectorException p_i611_1_, Object p_i611_2_[], JsonRootNode p_i611_3_)
    {
        super(func_27318_b(p_i611_1_, p_i611_2_, p_i611_3_));
    }

    private static String func_27318_b(JsonNodeDoesNotMatchChainedJsonNodeSelectorException p_27318_0_, Object p_27318_1_[], JsonRootNode p_27318_2_)
    {
        return (new StringBuilder()).append("Failed to find ").append(p_27318_0_.field_27326_a.toString()).append(" at [").append(JsonNodeDoesNotMatchChainedJsonNodeSelectorException.func_27324_a(p_27318_0_.field_27325_b)).append("] while resolving [").append(func_27317_a(p_27318_1_)).append("] in ").append(field_27320_a.func_27327_a(p_27318_2_)).append(".").toString();
    }

    private static String func_27317_a(Object p_27317_0_[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = true;
        Object aobj[] = p_27317_0_;
        int i = aobj.length;
        for(int j = 0; j < i; j++)
        {
            Object obj = aobj[j];
            if(!flag)
            {
                stringbuilder.append(".");
            }
            flag = false;
            if(obj instanceof String)
            {
                stringbuilder.append("\"").append(obj).append("\"");
            } else
            {
                stringbuilder.append(obj);
            }
        }

        return stringbuilder.toString();
    }

}
