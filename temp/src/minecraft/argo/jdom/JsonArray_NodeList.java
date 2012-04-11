// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package argo.jdom:
//            JsonNode

final class JsonArray_NodeList extends ArrayList
{

    final Iterable field_27405_a; /* synthetic field */

    JsonArray_NodeList(Iterable p_i660_1_)
    {
        field_27405_a = p_i660_1_;
        super();
        JsonNode jsonnode;
        for(Iterator iterator = field_27405_a.iterator(); iterator.hasNext(); add(jsonnode))
        {
            jsonnode = (JsonNode)iterator.next();
        }

    }
}
