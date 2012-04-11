// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.format;

import argo.jdom.JsonNodeType;

class CompactJsonFormatter_JsonNodeType
{

    static final int field_27341_a[]; /* synthetic field */

    static 
    {
        field_27341_a = new int[JsonNodeType.values().length];
        try
        {
            field_27341_a[JsonNodeType.ARRAY.ordinal()] = 1;
        }
        catch(NoSuchFieldError nosuchfielderror) { }
        try
        {
            field_27341_a[JsonNodeType.OBJECT.ordinal()] = 2;
        }
        catch(NoSuchFieldError nosuchfielderror1) { }
        try
        {
            field_27341_a[JsonNodeType.STRING.ordinal()] = 3;
        }
        catch(NoSuchFieldError nosuchfielderror2) { }
        try
        {
            field_27341_a[JsonNodeType.NUMBER.ordinal()] = 4;
        }
        catch(NoSuchFieldError nosuchfielderror3) { }
        try
        {
            field_27341_a[JsonNodeType.FALSE.ordinal()] = 5;
        }
        catch(NoSuchFieldError nosuchfielderror4) { }
        try
        {
            field_27341_a[JsonNodeType.TRUE.ordinal()] = 6;
        }
        catch(NoSuchFieldError nosuchfielderror5) { }
        try
        {
            field_27341_a[JsonNodeType.NULL.ordinal()] = 7;
        }
        catch(NoSuchFieldError nosuchfielderror6) { }
    }
}
