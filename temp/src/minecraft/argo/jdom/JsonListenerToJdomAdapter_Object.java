// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;


// Referenced classes of package argo.jdom:
//            JsonListenerToJdomAdapter_NodeContainer, JsonObjectNodeBuilder, JsonListenerToJdomAdapter, JsonNodeBuilder, 
//            JsonFieldBuilder

class JsonListenerToJdomAdapter_Object
    implements JsonListenerToJdomAdapter_NodeContainer
{

    final JsonObjectNodeBuilder field_27296_a; /* synthetic field */
    final JsonListenerToJdomAdapter field_27295_b; /* synthetic field */

    JsonListenerToJdomAdapter_Object(JsonListenerToJdomAdapter p_i38_1_, JsonObjectNodeBuilder p_i38_2_)
    {
        field_27295_b = p_i38_1_;
        field_27296_a = p_i38_2_;
        super();
    }

    public void func_27290_a(JsonNodeBuilder p_27290_1_)
    {
        throw new RuntimeException("Coding failure in Argo:  Attempt to add a node to an object.");
    }

    public void func_27289_a(JsonFieldBuilder p_27289_1_)
    {
        field_27296_a.func_27237_a(p_27289_1_);
    }
}
