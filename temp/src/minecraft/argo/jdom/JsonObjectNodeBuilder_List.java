// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.*;

// Referenced classes of package argo.jdom:
//            JsonObjectNodeBuilder, JsonFieldBuilder

class JsonObjectNodeBuilder_List extends HashMap
{

    final JsonObjectNodeBuilder field_27308_a; /* synthetic field */

    JsonObjectNodeBuilder_List(JsonObjectNodeBuilder p_i425_1_)
    {
        field_27308_a = p_i425_1_;
        super();
        JsonFieldBuilder jsonfieldbuilder;
        for(Iterator iterator = JsonObjectNodeBuilder.func_27236_a(field_27308_a).iterator(); iterator.hasNext(); put(jsonfieldbuilder.func_27303_b(), jsonfieldbuilder.func_27302_c()))
        {
            jsonfieldbuilder = (JsonFieldBuilder)iterator.next();
        }

    }
}
