// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class StructureBoundingBox
{

    public int field_35753_a;
    public int field_35751_b;
    public int field_35752_c;
    public int field_35749_d;
    public int field_35750_e;
    public int field_35748_f;

    public StructureBoundingBox()
    {
    }

    public static StructureBoundingBox func_35741_a()
    {
        return new StructureBoundingBox(0x7fffffff, 0x7fffffff, 0x7fffffff, 0x80000000, 0x80000000, 0x80000000);
    }

    public static StructureBoundingBox func_35747_a(int p_35747_0_, int p_35747_1_, int p_35747_2_, int p_35747_3_, int p_35747_4_, int p_35747_5_, int p_35747_6_, int p_35747_7_, 
            int p_35747_8_, int p_35747_9_)
    {
        switch(p_35747_9_)
        {
        default:
            return new StructureBoundingBox(p_35747_0_ + p_35747_3_, p_35747_1_ + p_35747_4_, p_35747_2_ + p_35747_5_, ((p_35747_0_ + p_35747_6_) - 1) + p_35747_3_, ((p_35747_1_ + p_35747_7_) - 1) + p_35747_4_, ((p_35747_2_ + p_35747_8_) - 1) + p_35747_5_);

        case 2: // '\002'
            return new StructureBoundingBox(p_35747_0_ + p_35747_3_, p_35747_1_ + p_35747_4_, (p_35747_2_ - p_35747_8_) + 1 + p_35747_5_, ((p_35747_0_ + p_35747_6_) - 1) + p_35747_3_, ((p_35747_1_ + p_35747_7_) - 1) + p_35747_4_, p_35747_2_ + p_35747_5_);

        case 0: // '\0'
            return new StructureBoundingBox(p_35747_0_ + p_35747_3_, p_35747_1_ + p_35747_4_, p_35747_2_ + p_35747_5_, ((p_35747_0_ + p_35747_6_) - 1) + p_35747_3_, ((p_35747_1_ + p_35747_7_) - 1) + p_35747_4_, ((p_35747_2_ + p_35747_8_) - 1) + p_35747_5_);

        case 1: // '\001'
            return new StructureBoundingBox((p_35747_0_ - p_35747_8_) + 1 + p_35747_5_, p_35747_1_ + p_35747_4_, p_35747_2_ + p_35747_3_, p_35747_0_ + p_35747_5_, ((p_35747_1_ + p_35747_7_) - 1) + p_35747_4_, ((p_35747_2_ + p_35747_6_) - 1) + p_35747_3_);

        case 3: // '\003'
            return new StructureBoundingBox(p_35747_0_ + p_35747_5_, p_35747_1_ + p_35747_4_, p_35747_2_ + p_35747_3_, ((p_35747_0_ + p_35747_8_) - 1) + p_35747_5_, ((p_35747_1_ + p_35747_7_) - 1) + p_35747_4_, ((p_35747_2_ + p_35747_6_) - 1) + p_35747_3_);
        }
    }

    public StructureBoundingBox(StructureBoundingBox p_i544_1_)
    {
        field_35753_a = p_i544_1_.field_35753_a;
        field_35751_b = p_i544_1_.field_35751_b;
        field_35752_c = p_i544_1_.field_35752_c;
        field_35749_d = p_i544_1_.field_35749_d;
        field_35750_e = p_i544_1_.field_35750_e;
        field_35748_f = p_i544_1_.field_35748_f;
    }

    public StructureBoundingBox(int p_i545_1_, int p_i545_2_, int p_i545_3_, int p_i545_4_, int p_i545_5_, int p_i545_6_)
    {
        field_35753_a = p_i545_1_;
        field_35751_b = p_i545_2_;
        field_35752_c = p_i545_3_;
        field_35749_d = p_i545_4_;
        field_35750_e = p_i545_5_;
        field_35748_f = p_i545_6_;
    }

    public StructureBoundingBox(int p_i546_1_, int p_i546_2_, int p_i546_3_, int p_i546_4_)
    {
        field_35753_a = p_i546_1_;
        field_35752_c = p_i546_2_;
        field_35749_d = p_i546_3_;
        field_35748_f = p_i546_4_;
        field_35751_b = 1;
        field_35750_e = 512;
    }

    public boolean func_35740_a(StructureBoundingBox p_35740_1_)
    {
        return field_35749_d >= p_35740_1_.field_35753_a && field_35753_a <= p_35740_1_.field_35749_d && field_35748_f >= p_35740_1_.field_35752_c && field_35752_c <= p_35740_1_.field_35748_f && field_35750_e >= p_35740_1_.field_35751_b && field_35751_b <= p_35740_1_.field_35750_e;
    }

    public boolean func_35746_a(int p_35746_1_, int p_35746_2_, int p_35746_3_, int p_35746_4_)
    {
        return field_35749_d >= p_35746_1_ && field_35753_a <= p_35746_3_ && field_35748_f >= p_35746_2_ && field_35752_c <= p_35746_4_;
    }

    public void func_35738_b(StructureBoundingBox p_35738_1_)
    {
        field_35753_a = Math.min(field_35753_a, p_35738_1_.field_35753_a);
        field_35751_b = Math.min(field_35751_b, p_35738_1_.field_35751_b);
        field_35752_c = Math.min(field_35752_c, p_35738_1_.field_35752_c);
        field_35749_d = Math.max(field_35749_d, p_35738_1_.field_35749_d);
        field_35750_e = Math.max(field_35750_e, p_35738_1_.field_35750_e);
        field_35748_f = Math.max(field_35748_f, p_35738_1_.field_35748_f);
    }

    public void func_35745_a(int p_35745_1_, int p_35745_2_, int p_35745_3_)
    {
        field_35753_a += p_35745_1_;
        field_35751_b += p_35745_2_;
        field_35752_c += p_35745_3_;
        field_35749_d += p_35745_1_;
        field_35750_e += p_35745_2_;
        field_35748_f += p_35745_3_;
    }

    public boolean func_35742_b(int p_35742_1_, int p_35742_2_, int p_35742_3_)
    {
        return p_35742_1_ >= field_35753_a && p_35742_1_ <= field_35749_d && p_35742_3_ >= field_35752_c && p_35742_3_ <= field_35748_f && p_35742_2_ >= field_35751_b && p_35742_2_ <= field_35750_e;
    }

    public int func_35744_b()
    {
        return (field_35749_d - field_35753_a) + 1;
    }

    public int func_35743_c()
    {
        return (field_35750_e - field_35751_b) + 1;
    }

    public int func_35739_d()
    {
        return (field_35748_f - field_35752_c) + 1;
    }

    public int func_40597_e()
    {
        return field_35753_a + ((field_35749_d - field_35753_a) + 1) / 2;
    }

    public int func_40596_f()
    {
        return field_35751_b + ((field_35750_e - field_35751_b) + 1) / 2;
    }

    public int func_40598_g()
    {
        return field_35752_c + ((field_35748_f - field_35752_c) + 1) / 2;
    }

    public String toString()
    {
        return (new StringBuilder()).append("(").append(field_35753_a).append(", ").append(field_35751_b).append(", ").append(field_35752_c).append("; ").append(field_35749_d).append(", ").append(field_35750_e).append(", ").append(field_35748_f).append(")").toString();
    }
}
