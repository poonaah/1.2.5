// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.List;
import java.util.Map;

// Referenced classes of package argo.jdom:
//            JsonNode, JsonNodeType

public final class JsonStringNode extends JsonNode
    implements Comparable
{

    private final String field_27224_a;

    JsonStringNode(String p_i439_1_)
    {
        if(p_i439_1_ == null)
        {
            throw new NullPointerException("Attempt to construct a JsonString with a null value.");
        } else
        {
            field_27224_a = p_i439_1_;
            return;
        }
    }

    public JsonNodeType func_27218_a()
    {
        return JsonNodeType.STRING;
    }

    public String func_27216_b()
    {
        return field_27224_a;
    }

    public Map func_27214_c()
    {
        throw new IllegalStateException("Attempt to get fields on a JsonNode without fields.");
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
            JsonStringNode jsonstringnode = (JsonStringNode)p_equals_1_;
            return field_27224_a.equals(jsonstringnode.field_27224_a);
        }
    }

    public int hashCode()
    {
        return field_27224_a.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("JsonStringNode value:[").append(field_27224_a).append("]").toString();
    }

    public int func_27223_a(JsonStringNode p_27223_1_)
    {
        return field_27224_a.compareTo(p_27223_1_.field_27224_a);
    }

    public int compareTo(Object p_compareTo_1_)
    {
        return func_27223_a((JsonStringNode)p_compareTo_1_);
    }
}
