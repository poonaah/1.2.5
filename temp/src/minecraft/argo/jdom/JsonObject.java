// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.*;

// Referenced classes of package argo.jdom:
//            JsonRootNode, JsonNodeType

final class JsonObject extends JsonRootNode
{

    private final Map field_27222_a;

    JsonObject(Map p_i363_1_)
    {
        field_27222_a = new HashMap(p_i363_1_);
    }

    public Map func_27214_c()
    {
        return new HashMap(field_27222_a);
    }

    public JsonNodeType func_27218_a()
    {
        return JsonNodeType.OBJECT;
    }

    public String func_27216_b()
    {
        throw new IllegalStateException("Attempt to get text on a JsonNode without text.");
    }

    public List func_27215_d()
    {
        throw new IllegalStateException("Attempt to get elements on a JsonNode without elements.");
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
            JsonObject jsonobject = (JsonObject)p_equals_1_;
            return field_27222_a.equals(jsonobject.field_27222_a);
        }
    }

    public int hashCode()
    {
        return field_27222_a.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("JsonObject fields:[").append(field_27222_a).append("]").toString();
    }
}
