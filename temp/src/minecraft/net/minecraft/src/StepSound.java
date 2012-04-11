// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class StepSound
{

    public final String field_1678_a;
    public final float field_1677_b;
    public final float field_1679_c;

    public StepSound(String p_i645_1_, float p_i645_2_, float p_i645_3_)
    {
        field_1678_a = p_i645_1_;
        field_1677_b = p_i645_2_;
        field_1679_c = p_i645_3_;
    }

    public float func_1147_b()
    {
        return field_1677_b;
    }

    public float func_1144_c()
    {
        return field_1679_c;
    }

    public String func_1146_a()
    {
        return (new StringBuilder()).append("step.").append(field_1678_a).toString();
    }

    public String func_1145_d()
    {
        return (new StringBuilder()).append("step.").append(field_1678_a).toString();
    }
}
