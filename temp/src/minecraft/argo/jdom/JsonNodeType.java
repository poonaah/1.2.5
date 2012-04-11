// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.jdom;


public final class JsonNodeType extends Enum
{

    public static final JsonNodeType OBJECT;
    public static final JsonNodeType ARRAY;
    public static final JsonNodeType STRING;
    public static final JsonNodeType NUMBER;
    public static final JsonNodeType TRUE;
    public static final JsonNodeType FALSE;
    public static final JsonNodeType NULL;
    private static final JsonNodeType $VALUES[]; /* synthetic field */

    public static JsonNodeType[] values()
    {
        return (JsonNodeType[])$VALUES.clone();
    }

    public static JsonNodeType valueOf(String p_valueOf_0_)
    {
        return (JsonNodeType)Enum.valueOf(argo.jdom.JsonNodeType.class, p_valueOf_0_);
    }

    private JsonNodeType(String p_i615_1_, int p_i615_2_)
    {
        super(p_i615_1_, p_i615_2_);
    }

    static 
    {
        OBJECT = new JsonNodeType("OBJECT", 0);
        ARRAY = new JsonNodeType("ARRAY", 1);
        STRING = new JsonNodeType("STRING", 2);
        NUMBER = new JsonNodeType("NUMBER", 3);
        TRUE = new JsonNodeType("TRUE", 4);
        FALSE = new JsonNodeType("FALSE", 5);
        NULL = new JsonNodeType("NULL", 6);
        $VALUES = (new JsonNodeType[] {
            OBJECT, ARRAY, STRING, NUMBER, TRUE, FALSE, NULL
        });
    }
}
