// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import argo.saj.JsonListener;
import java.util.Stack;

// Referenced classes of package argo.jdom:
//            JsonNodeBuilder, JsonRootNode, JsonNodeBuilders, JsonListenerToJdomAdapter_Array, 
//            JsonListenerToJdomAdapter_Object, JsonFieldBuilder, JsonListenerToJdomAdapter_NodeContainer, JsonListenerToJdomAdapter_Field

final class JsonListenerToJdomAdapter
    implements JsonListener
{

    private final Stack field_27210_a = new Stack();
    private JsonNodeBuilder field_27209_b;

    JsonListenerToJdomAdapter()
    {
    }

    JsonRootNode func_27208_a()
    {
        return (JsonRootNode)field_27209_b.func_27234_b();
    }

    public void func_27195_b()
    {
    }

    public void func_27204_c()
    {
    }

    public void func_27200_d()
    {
        JsonArrayNodeBuilder jsonarraynodebuilder = JsonNodeBuilders.func_27249_e();
        func_27207_a(jsonarraynodebuilder);
        field_27210_a.push(new JsonListenerToJdomAdapter_Array(this, jsonarraynodebuilder));
    }

    public void func_27197_e()
    {
        field_27210_a.pop();
    }

    public void func_27194_f()
    {
        JsonObjectNodeBuilder jsonobjectnodebuilder = JsonNodeBuilders.func_27253_d();
        func_27207_a(jsonobjectnodebuilder);
        field_27210_a.push(new JsonListenerToJdomAdapter_Object(this, jsonobjectnodebuilder));
    }

    public void func_27203_g()
    {
        field_27210_a.pop();
    }

    public void func_27205_a(String p_27205_1_)
    {
        JsonFieldBuilder jsonfieldbuilder = JsonFieldBuilder.func_27301_a().func_27304_a(JsonNodeBuilders.func_27254_b(p_27205_1_));
        ((JsonListenerToJdomAdapter_NodeContainer)field_27210_a.peek()).func_27289_a(jsonfieldbuilder);
        field_27210_a.push(new JsonListenerToJdomAdapter_Field(this, jsonfieldbuilder));
    }

    public void func_27199_h()
    {
        field_27210_a.pop();
    }

    public void func_27201_b(String p_27201_1_)
    {
        func_27206_b(JsonNodeBuilders.func_27250_a(p_27201_1_));
    }

    public void func_27196_i()
    {
        func_27206_b(JsonNodeBuilders.func_27251_b());
    }

    public void func_27198_c(String p_27198_1_)
    {
        func_27206_b(JsonNodeBuilders.func_27254_b(p_27198_1_));
    }

    public void func_27193_j()
    {
        func_27206_b(JsonNodeBuilders.func_27252_c());
    }

    public void func_27202_k()
    {
        func_27206_b(JsonNodeBuilders.func_27248_a());
    }

    private void func_27207_a(JsonNodeBuilder p_27207_1_)
    {
        if(field_27209_b == null)
        {
            field_27209_b = p_27207_1_;
        } else
        {
            func_27206_b(p_27207_1_);
        }
    }

    private void func_27206_b(JsonNodeBuilder p_27206_1_)
    {
        ((JsonListenerToJdomAdapter_NodeContainer)field_27210_a.peek()).func_27290_a(p_27206_1_);
    }
}
