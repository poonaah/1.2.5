// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.LinkedList;
import java.util.List;

// Referenced classes of package argo.jdom:
//            JsonNodeDoesNotMatchJsonNodeSelectorException, JsonNodeSelector, Functor

public final class JsonNodeDoesNotMatchChainedJsonNodeSelectorException extends JsonNodeDoesNotMatchJsonNodeSelectorException
{

    final Functor field_27326_a;
    final List field_27325_b;

    static JsonNodeDoesNotMatchJsonNodeSelectorException func_27322_a(Functor p_27322_0_)
    {
        return new JsonNodeDoesNotMatchChainedJsonNodeSelectorException(p_27322_0_, new LinkedList());
    }

    static JsonNodeDoesNotMatchJsonNodeSelectorException func_27323_a(JsonNodeDoesNotMatchChainedJsonNodeSelectorException p_27323_0_, JsonNodeSelector p_27323_1_)
    {
        LinkedList linkedlist = new LinkedList(p_27323_0_.field_27325_b);
        linkedlist.add(p_27323_1_);
        return new JsonNodeDoesNotMatchChainedJsonNodeSelectorException(p_27323_0_.field_27326_a, linkedlist);
    }

    static JsonNodeDoesNotMatchJsonNodeSelectorException func_27321_b(JsonNodeDoesNotMatchChainedJsonNodeSelectorException p_27321_0_, JsonNodeSelector p_27321_1_)
    {
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(p_27321_1_);
        return new JsonNodeDoesNotMatchChainedJsonNodeSelectorException(p_27321_0_.field_27326_a, linkedlist);
    }

    private JsonNodeDoesNotMatchChainedJsonNodeSelectorException(Functor p_i40_1_, List p_i40_2_)
    {
        super((new StringBuilder()).append("Failed to match any JSON node at [").append(func_27324_a(p_i40_2_)).append("]").toString());
        field_27326_a = p_i40_1_;
        field_27325_b = p_i40_2_;
    }

    static String func_27324_a(List p_27324_0_)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for(int i = p_27324_0_.size() - 1; i >= 0; i--)
        {
            stringbuilder.append(((JsonNodeSelector)p_27324_0_.get(i)).func_27358_a());
            if(i != 0)
            {
                stringbuilder.append(".");
            }
        }

        return stringbuilder.toString();
    }

    public String toString()
    {
        return (new StringBuilder()).append("JsonNodeDoesNotMatchJsonNodeSelectorException{failedNode=").append(field_27326_a).append(", failPath=").append(field_27325_b).append('}').toString();
    }
}
