// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiContainer, ContainerCreative, EntityPlayer, AchievementList, 
//            PlayerController, GuiInventory, Slot, EntityPlayerSP, 
//            InventoryPlayer, ItemStack, Container, StatCollector, 
//            FontRenderer, RenderEngine, GuiButton, GuiAchievements, 
//            GuiStats, InventoryBasic

public class GuiContainerCreative extends GuiContainer
{

    private static InventoryBasic field_35311_f = new InventoryBasic("tmp", 72);
    private float field_35312_g;
    private boolean field_35313_h;
    private boolean field_35314_i;

    public GuiContainerCreative(EntityPlayer p_i599_1_)
    {
        super(new ContainerCreative(p_i599_1_));
        field_35312_g = 0.0F;
        field_35313_h = false;
        p_i599_1_.field_20068_h = field_973_i;
        field_948_f = true;
        p_i599_1_.func_25058_a(AchievementList.field_25195_b, 1);
        field_974_h = 208;
    }

    public void func_570_g()
    {
        if(!field_945_b.field_6327_b.func_35640_h())
        {
            field_945_b.func_6272_a(new GuiInventory(field_945_b.field_6322_g));
        }
    }

    protected void func_35309_a(Slot p_35309_1_, int p_35309_2_, int p_35309_3_, boolean p_35309_4_)
    {
        if(p_35309_1_ != null)
        {
            if(p_35309_1_.field_1118_b == field_35311_f)
            {
                InventoryPlayer inventoryplayer = field_945_b.field_6322_g.field_778_b;
                ItemStack itemstack1 = inventoryplayer.func_20075_i();
                ItemStack itemstack4 = p_35309_1_.func_777_b();
                if(itemstack1 != null && itemstack4 != null && itemstack1.field_1617_c == itemstack4.field_1617_c)
                {
                    if(p_35309_3_ == 0)
                    {
                        if(p_35309_4_)
                        {
                            itemstack1.field_1615_a = itemstack1.func_1089_c();
                        } else
                        if(itemstack1.field_1615_a < itemstack1.func_1089_c())
                        {
                            itemstack1.field_1615_a++;
                        }
                    } else
                    if(itemstack1.field_1615_a <= 1)
                    {
                        inventoryplayer.func_20076_b(null);
                    } else
                    {
                        itemstack1.field_1615_a--;
                    }
                } else
                if(itemstack1 != null)
                {
                    inventoryplayer.func_20076_b(null);
                } else
                if(itemstack4 == null)
                {
                    inventoryplayer.func_20076_b(null);
                } else
                if(itemstack1 == null || itemstack1.field_1617_c != itemstack4.field_1617_c)
                {
                    inventoryplayer.func_20076_b(ItemStack.func_30010_b(itemstack4));
                    ItemStack itemstack2 = inventoryplayer.func_20075_i();
                    if(p_35309_4_)
                    {
                        itemstack2.field_1615_a = itemstack2.func_1089_c();
                    }
                }
            } else
            {
                field_973_i.func_27280_a(p_35309_1_.field_20007_a, p_35309_3_, p_35309_4_, field_945_b.field_6322_g);
                ItemStack itemstack = field_973_i.func_20118_a(p_35309_1_.field_20007_a).func_777_b();
                field_945_b.field_6327_b.func_35637_a(itemstack, (p_35309_1_.field_20007_a - field_973_i.field_20122_e.size()) + 9 + 36);
            }
        } else
        {
            InventoryPlayer inventoryplayer1 = field_945_b.field_6322_g.field_778_b;
            if(inventoryplayer1.func_20075_i() != null)
            {
                if(p_35309_3_ == 0)
                {
                    field_945_b.field_6322_g.func_48153_a(inventoryplayer1.func_20075_i());
                    field_945_b.field_6327_b.func_35639_a(inventoryplayer1.func_20075_i());
                    inventoryplayer1.func_20076_b(null);
                }
                if(p_35309_3_ == 1)
                {
                    ItemStack itemstack3 = inventoryplayer1.func_20075_i().func_1085_a(1);
                    field_945_b.field_6322_g.func_48153_a(itemstack3);
                    field_945_b.field_6327_b.func_35639_a(itemstack3);
                    if(inventoryplayer1.func_20075_i().field_1615_a == 0)
                    {
                        inventoryplayer1.func_20076_b(null);
                    }
                }
            }
        }
    }

    public void func_6448_a()
    {
        if(!field_945_b.field_6327_b.func_35640_h())
        {
            field_945_b.func_6272_a(new GuiInventory(field_945_b.field_6322_g));
        } else
        {
            super.func_6448_a();
            field_949_e.clear();
        }
    }

    protected void func_587_j()
    {
        field_6451_g.func_873_b(StatCollector.func_25200_a("container.creative"), 8, 6, 0x404040);
    }

    public void func_566_e()
    {
        super.func_566_e();
        int i = Mouse.getEventDWheel();
        if(i != 0)
        {
            int j = (((ContainerCreative)field_973_i).field_35375_a.size() / 8 - 8) + 1;
            if(i > 0)
            {
                i = 1;
            }
            if(i < 0)
            {
                i = -1;
            }
            field_35312_g -= (double)i / (double)j;
            if(field_35312_g < 0.0F)
            {
                field_35312_g = 0.0F;
            }
            if(field_35312_g > 1.0F)
            {
                field_35312_g = 1.0F;
            }
            ((ContainerCreative)field_973_i).func_35374_a(field_35312_g);
        }
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        boolean flag = Mouse.isButtonDown(0);
        int i = field_40216_e;
        int j = field_40215_f;
        int k = i + 155;
        int l = j + 17;
        int i1 = k + 14;
        int j1 = l + 160 + 2;
        if(!field_35314_i && flag && p_571_1_ >= k && p_571_2_ >= l && p_571_1_ < i1 && p_571_2_ < j1)
        {
            field_35313_h = true;
        }
        if(!flag)
        {
            field_35313_h = false;
        }
        field_35314_i = flag;
        if(field_35313_h)
        {
            field_35312_g = (float)(p_571_2_ - (l + 8)) / ((float)(j1 - l) - 16F);
            if(field_35312_g < 0.0F)
            {
                field_35312_g = 0.0F;
            }
            if(field_35312_g > 1.0F)
            {
                field_35312_g = 1.0F;
            }
            ((ContainerCreative)field_973_i).func_35374_a(field_35312_g);
        }
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
    }

    protected void func_589_a(float p_589_1_, int p_589_2_, int p_589_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        int i = field_945_b.field_6315_n.func_1070_a("/gui/allitems.png");
        field_945_b.field_6315_n.func_1076_b(i);
        int j = field_40216_e;
        int k = field_40215_f;
        func_550_b(j, k, 0, 0, field_971_a, field_974_h);
        int l = j + 155;
        int i1 = k + 17;
        int j1 = i1 + 160 + 2;
        func_550_b(j + 154, k + 17 + (int)((float)(j1 - i1 - 17) * field_35312_g), 0, 208, 16, 16);
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(p_572_1_.field_938_f == 0)
        {
            field_945_b.func_6272_a(new GuiAchievements(field_945_b.field_25001_G));
        }
        if(p_572_1_.field_938_f == 1)
        {
            field_945_b.func_6272_a(new GuiStats(this, field_945_b.field_25001_G));
        }
    }

    static InventoryBasic func_35310_g()
    {
        return field_35311_f;
    }

}
