// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;


// Referenced classes of package argo.jdom:
//            JsonListenerToJdomAdapter_NodeContainer, JsonFieldBuilder, JsonListenerToJdomAdapter, JsonNodeBuilder

class JsonListenerToJdomAdapter_Field
    implements JsonListenerToJdomAdapter_NodeContainer
{

    final JsonFieldBuilder field_27292_a; /* synthetic field */
    final JsonListenerToJdomAdapter field_27291_b; /* synthetic field */

    JsonListenerToJdomAdapter_Field(JsonListenerToJdomAdapter p_i41_1_, JsonFieldBuilder p_i41_2_)
    {
        field_27291_b = p_i41_1_;
        field_27292_a = p_i41_2_;
        super();
    }

    public void func_27290_a(JsonNodeBuilder p_27290_1_)
    {
        field_27292_a.func_27300_b(p_27290_1_);
    }

    public void func_27289_a(JsonFieldBuilder p_27289_1_)
    {
        throw new RuntimeException("Coding failure in Argo:  Attempt to add a field to a field.");
    }
}
