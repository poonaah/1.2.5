// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.Arrays;

// Referenced classes of package argo.jdom:
//            JsonNodeSelector, JsonNodeSelectors_String, JsonNodeSelectors_Array, JsonNodeSelectors_Object, 
//            JsonNodeFactories, JsonNodeSelectors_Field, JsonNodeSelectors_Element, ChainedFunctor, 
//            JsonStringNode

public final class JsonNodeSelectors
{

    private JsonNodeSelectors()
    {
    }

    public static JsonNodeSelector func_27349_a(Object p_27349_0_[])
    {
        return func_27352_a(p_27349_0_, new JsonNodeSelector(new JsonNodeSelectors_String()));
    }

    public static JsonNodeSelector func_27346_b(Object p_27346_0_[])
    {
        return func_27352_a(p_27346_0_, new JsonNodeSelector(new JsonNodeSelectors_Array()));
    }

    public static JsonNodeSelector func_27353_c(Object p_27353_0_[])
    {
        return func_27352_a(p_27353_0_, new JsonNodeSelector(new JsonNodeSelectors_Object()));
    }

    public static JsonNodeSelector func_27348_a(String p_27348_0_)
    {
        return func_27350_a(JsonNodeFactories.func_27316_a(p_27348_0_));
    }

    public static JsonNodeSelector func_27350_a(JsonStringNode p_27350_0_)
    {
        return new JsonNodeSelector(new JsonNodeSelectors_Field(p_27350_0_));
    }

    public static JsonNodeSelector func_27351_b(String p_27351_0_)
    {
        return func_27353_c(new Object[0]).func_27355_a(func_27348_a(p_27351_0_));
    }

    public static JsonNodeSelector func_27347_a(int p_27347_0_)
    {
        return new JsonNodeSelector(new JsonNodeSelectors_Element(p_27347_0_));
    }

    public static JsonNodeSelector func_27354_b(int p_27354_0_)
    {
        return func_27346_b(new Object[0]).func_27355_a(func_27347_a(p_27354_0_));
    }

    private static JsonNodeSelector func_27352_a(Object p_27352_0_[], JsonNodeSelector p_27352_1_)
    {
        JsonNodeSelector jsonnodeselector = p_27352_1_;
        for(int i = p_27352_0_.length - 1; i >= 0; i--)
        {
            if(p_27352_0_[i] instanceof Integer)
            {
                jsonnodeselector = func_27345_a(func_27354_b(((Integer)p_27352_0_[i]).intValue()), jsonnodeselector);
                continue;
            }
            if(p_27352_0_[i] instanceof String)
            {
                jsonnodeselector = func_27345_a(func_27351_b((String)p_27352_0_[i]), jsonnodeselector);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Element [").append(p_27352_0_[i]).append("] of path elements").append(" [").append(Arrays.toString(p_27352_0_)).append("] was of illegal type [").append(p_27352_0_[i].getClass().getCanonicalName()).append("]; only Integer and String are valid.").toString());
            }
        }

        return jsonnodeselector;
    }

    private static JsonNodeSelector func_27345_a(JsonNodeSelector p_27345_0_, JsonNodeSelector p_27345_1_)
    {
        return new JsonNodeSelector(new ChainedFunctor(p_27345_0_, p_27345_1_));
    }
}
