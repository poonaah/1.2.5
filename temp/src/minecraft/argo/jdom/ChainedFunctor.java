// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;


// Referenced classes of package argo.jdom:
//            Functor, JsonNodeSelector, JsonNodeDoesNotMatchChainedJsonNodeSelectorException

final class ChainedFunctor
    implements Functor
{

    private final JsonNodeSelector field_27062_a;
    private final JsonNodeSelector field_27061_b;

    ChainedFunctor(JsonNodeSelector p_i600_1_, JsonNodeSelector p_i600_2_)
    {
        field_27062_a = p_i600_1_;
        field_27061_b = p_i600_2_;
    }

    public boolean func_27058_a(Object p_27058_1_)
    {
        return field_27062_a.func_27356_a(p_27058_1_) && field_27061_b.func_27356_a(field_27062_a.func_27357_b(p_27058_1_));
    }

    public Object func_27059_b(Object p_27059_1_)
    {
        Object obj;
        try
        {
            obj = field_27062_a.func_27357_b(p_27059_1_);
        }
        catch(JsonNodeDoesNotMatchChainedJsonNodeSelectorException jsonnodedoesnotmatchchainedjsonnodeselectorexception)
        {
            throw JsonNodeDoesNotMatchChainedJsonNodeSelectorException.func_27321_b(jsonnodedoesnotmatchchainedjsonnodeselectorexception, field_27062_a);
        }
        Object obj1;
        try
        {
            obj1 = field_27061_b.func_27357_b(obj);
        }
        catch(JsonNodeDoesNotMatchChainedJsonNodeSelectorException jsonnodedoesnotmatchchainedjsonnodeselectorexception1)
        {
            throw JsonNodeDoesNotMatchChainedJsonNodeSelectorException.func_27323_a(jsonnodedoesnotmatchchainedjsonnodeselectorexception1, field_27062_a);
        }
        return obj1;
    }

    public String func_27060_a()
    {
        return field_27061_b.func_27358_a();
    }

    public String toString()
    {
        return (new StringBuilder()).append(field_27062_a.toString()).append(", with ").append(field_27061_b.toString()).toString();
    }
}
