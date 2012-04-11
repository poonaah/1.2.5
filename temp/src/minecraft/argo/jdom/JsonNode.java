// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.List;
import java.util.Map;

// Referenced classes of package argo.jdom:
//            JsonNodeSelectors, JsonNodeDoesNotMatchChainedJsonNodeSelectorException, JsonNodeSelector, JsonNodeFactories, 
//            JsonNodeDoesNotMatchPathElementsException, JsonNodeType

public abstract class JsonNode
{

    JsonNode()
    {
    }

    public abstract JsonNodeType func_27218_a();

    public abstract String func_27216_b();

    public abstract Map func_27214_c();

    public abstract List func_27215_d();

    public final String func_27213_a(Object p_27213_1_[])
    {
        return (String)func_27219_a(JsonNodeSelectors.func_27349_a(p_27213_1_), this, p_27213_1_);
    }

    public final List func_27217_b(Object p_27217_1_[])
    {
        return (List)func_27219_a(JsonNodeSelectors.func_27346_b(p_27217_1_), this, p_27217_1_);
    }

    private Object func_27219_a(JsonNodeSelector p_27219_1_, JsonNode p_27219_2_, Object p_27219_3_[])
    {
        try
        {
            return p_27219_1_.func_27357_b(p_27219_2_);
        }
        catch(JsonNodeDoesNotMatchChainedJsonNodeSelectorException jsonnodedoesnotmatchchainedjsonnodeselectorexception)
        {
            throw JsonNodeDoesNotMatchPathElementsException.func_27319_a(jsonnodedoesnotmatchchainedjsonnodeselectorexception, p_27219_3_, JsonNodeFactories.func_27315_a(new JsonNode[] {
                p_27219_2_
            }));
        }
    }
}
