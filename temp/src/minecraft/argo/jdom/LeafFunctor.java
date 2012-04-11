// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;


// Referenced classes of package argo.jdom:
//            Functor, JsonNodeDoesNotMatchChainedJsonNodeSelectorException

abstract class LeafFunctor
    implements Functor
{

    LeafFunctor()
    {
    }

    public final Object func_27059_b(Object p_27059_1_)
    {
        if(!func_27058_a(p_27059_1_))
        {
            throw JsonNodeDoesNotMatchChainedJsonNodeSelectorException.func_27322_a(this);
        } else
        {
            return func_27063_c(p_27059_1_);
        }
    }

    protected abstract Object func_27063_c(Object obj);
}
