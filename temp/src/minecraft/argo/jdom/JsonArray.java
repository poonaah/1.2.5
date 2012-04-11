// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.*;

// Referenced classes of package argo.jdom:
//            JsonRootNode, JsonNodeType, JsonArray_NodeList

final class JsonArray extends JsonRootNode
{

    private final List field_27221_a;

    JsonArray(Iterable p_i65_1_)
    {
        field_27221_a = func_27220_a(p_i65_1_);
    }

    public JsonNodeType func_27218_a()
    {
        return JsonNodeType.ARRAY;
    }

    public List func_27215_d()
    {
        return new ArrayList(field_27221_a);
    }

    public String func_27216_b()
    {
        throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
    }

    public Map func_27214_c()
    {
        throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
    }

    public boolean equals(Object p_equals_1_)
    {
        if(this == p_equals_1_)
        {
            return true;
        }
        if(p_equals_1_ == null || getClass() != p_equals_1_.getClass())
        {
            return false;
        } else
        {
            JsonArray jsonarray = (JsonArray)p_equals_1_;
            return field_27221_a.equals(jsonarray.field_27221_a);
        }
    }

    public int hashCode()
    {
        return field_27221_a.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("JsonArray elements:[").append(field_27221_a).append("]").toString();
    }

    private static List func_27220_a(Iterable p_27220_0_)
    {
        return new JsonArray_NodeList(p_27220_0_);
    }
}
