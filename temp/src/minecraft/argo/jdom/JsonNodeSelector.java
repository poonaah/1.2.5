// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;


// Referenced classes of package argo.jdom:
//            Functor, ChainedFunctor

public final class JsonNodeSelector
{

    final Functor field_27359_a;

    JsonNodeSelector(Functor p_i762_1_)
    {
        field_27359_a = p_i762_1_;
    }

    public boolean func_27356_a(Object p_27356_1_)
    {
        return field_27359_a.func_27058_a(p_27356_1_);
    }

    public Object func_27357_b(Object p_27357_1_)
    {
        return field_27359_a.func_27059_b(p_27357_1_);
    }

    public JsonNodeSelector func_27355_a(JsonNodeSelector p_27355_1_)
    {
        return new JsonNodeSelector(new ChainedFunctor(this, p_27355_1_));
    }

    String func_27358_a()
    {
        return field_27359_a.func_27060_a();
    }

    public String toString()
    {
        return field_27359_a.toString();
    }
}
