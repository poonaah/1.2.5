// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package argo.jdom:
//            JsonNode, JsonNodeType

final class JsonNumberNode extends JsonNode
{

    private static final Pattern field_27226_a = Pattern.compile("(-?)(0|([1-9]([0-9]*)))(\\.[0-9]+)?((e|E)(\\+|-)?[0-9]+)?");
    private final String field_27225_b;

    JsonNumberNode(String p_i742_1_)
    {
        if(p_i742_1_ == null)
        {
            throw new NullPointerException("Attempt to construct a JsonNumber with a null value.");
        }
        if(!field_27226_a.matcher(p_i742_1_).matches())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Attempt to construct a JsonNumber with a String [").append(p_i742_1_).append("] that does not match the JSON number specification.").toString());
        } else
        {
            field_27225_b = p_i742_1_;
            return;
        }
    }

    public JsonNodeType func_27218_a()
    {
        return JsonNodeType.NUMBER;
    }

    public String func_27216_b()
    {
        return field_27225_b;
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
            JsonNumberNode jsonnumbernode = (JsonNumberNode)p_equals_1_;
            return field_27225_b.equals(jsonnumbernode.field_27225_b);
        }
    }

    public int hashCode()
    {
        return field_27225_b.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("JsonNumberNode value:[").append(field_27225_b).append("]").toString();
    }

}
