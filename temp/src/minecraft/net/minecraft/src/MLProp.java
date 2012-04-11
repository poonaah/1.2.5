// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.lang.annotation.Annotation;

public interface MLProp
    extends Annotation
{

    public abstract String name();

    public abstract String info();

    public abstract double min();

    public abstract double max();
}
