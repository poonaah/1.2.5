// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;


// Referenced classes of package argo.jdom:
//            JsonListenerToJdomAdapter_NodeContainer, JsonArrayNodeBuilder, JsonListenerToJdomAdapter, JsonNodeBuilder, 
//            JsonFieldBuilder

class JsonListenerToJdomAdapter_Array
    implements JsonListenerToJdomAdapter_NodeContainer
{

    final JsonArrayNodeBuilder field_27294_a; /* synthetic field */
    final JsonListenerToJdomAdapter field_27293_b; /* synthetic field */

    JsonListenerToJdomAdapter_Array(JsonListenerToJdomAdapter p_i39_1_, JsonArrayNodeBuilder p_i39_2_)
    {
        field_27293_b = p_i39_1_;
        field_27294_a = p_i39_2_;
        super();
    }

    public void func_27290_a(JsonNodeBuilder p_27290_1_)
    {
        field_27294_a.func_27240_a(p_27290_1_);
    }

    public void func_27289_a(JsonFieldBuilder p_27289_1_)
    {
        throw new RuntimeException("Coding failure in Argo:  Attempt to add a field to an array.");
    }
}
