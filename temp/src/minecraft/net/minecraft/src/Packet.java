// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            IntHashMap, PacketCount, ItemStack, Item, 
//            CompressedStreamTools, Packet0KeepAlive, Packet1Login, Packet2Handshake, 
//            Packet3Chat, Packet4UpdateTime, Packet5PlayerInventory, Packet6SpawnPosition, 
//            Packet7UseEntity, Packet8UpdateHealth, Packet9Respawn, Packet10Flying, 
//            Packet11PlayerPosition, Packet12PlayerLook, Packet13PlayerLookMove, Packet14BlockDig, 
//            Packet15Place, Packet16BlockItemSwitch, Packet17Sleep, Packet18Animation, 
//            Packet19EntityAction, Packet20NamedEntitySpawn, Packet21PickupSpawn, Packet22Collect, 
//            Packet23VehicleSpawn, Packet24MobSpawn, Packet25EntityPainting, Packet26EntityExpOrb, 
//            Packet28EntityVelocity, Packet29DestroyEntity, Packet30Entity, Packet31RelEntityMove, 
//            Packet32EntityLook, Packet33RelEntityMoveLook, Packet34EntityTeleport, Packet35EntityHeadRotation, 
//            Packet38EntityStatus, Packet39AttachEntity, Packet40EntityMetadata, Packet41EntityEffect, 
//            Packet42RemoveEntityEffect, Packet43Experience, Packet50PreChunk, Packet51MapChunk, 
//            Packet52MultiBlockChange, Packet53BlockChange, Packet54PlayNoteBlock, Packet60Explosion, 
//            Packet61DoorChange, Packet70Bed, Packet71Weather, Packet100OpenWindow, 
//            Packet101CloseWindow, Packet102WindowClick, Packet103SetSlot, Packet104WindowItems, 
//            Packet105UpdateProgressbar, Packet106Transaction, Packet107CreativeSetSlot, Packet108EnchantItem, 
//            Packet130UpdateSign, Packet131MapData, Packet132TileEntityData, Packet200Statistic, 
//            Packet201PlayerInfo, Packet202PlayerAbilities, Packet250CustomPayload, Packet254ServerPing, 
//            Packet255KickDisconnect, NetHandler, NBTTagCompound

public abstract class Packet
{

    public static IntHashMap field_471_a = new IntHashMap();
    private static Map field_470_b = new HashMap();
    private static Set field_26906_c = new HashSet();
    private static Set field_26905_d = new HashSet();
    public final long field_20018_j = System.currentTimeMillis();
    public static long field_48158_m;
    public static long field_48156_n;
    public static long field_48157_o;
    public static long field_48155_p;
    public boolean field_472_j;

    public Packet()
    {
        field_472_j = false;
    }

    static void func_321_a(int p_321_0_, boolean p_321_1_, boolean p_321_2_, Class p_321_3_)
    {
        if(field_471_a.func_35858_b(p_321_0_))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate packet id:").append(p_321_0_).toString());
        }
        if(field_470_b.containsKey(p_321_3_))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate packet class:").append(p_321_3_).toString());
        }
        field_471_a.func_1061_a(p_321_0_, p_321_3_);
        field_470_b.put(p_321_3_, Integer.valueOf(p_321_0_));
        if(p_321_1_)
        {
            field_26906_c.add(Integer.valueOf(p_321_0_));
        }
        if(p_321_2_)
        {
            field_26905_d.add(Integer.valueOf(p_321_0_));
        }
    }

    public static Packet func_325_a(int p_325_0_)
    {
        try
        {
            Class class1 = (Class)field_471_a.func_1057_a(p_325_0_);
            if(class1 == null)
            {
                return null;
            } else
            {
                return (Packet)class1.newInstance();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        System.out.println((new StringBuilder()).append("Skipping packet with id ").append(p_325_0_).toString());
        return null;
    }

    public final int func_326_b()
    {
        return ((Integer)field_470_b.get(getClass())).intValue();
    }

    public static Packet func_324_b(DataInputStream p_324_0_, boolean p_324_1_)
        throws IOException
    {
        int i = 0;
        Packet packet = null;
        try
        {
            i = p_324_0_.read();
            if(i == -1)
            {
                return null;
            }
            if(p_324_1_ && !field_26905_d.contains(Integer.valueOf(i)) || !p_324_1_ && !field_26906_c.contains(Integer.valueOf(i)))
            {
                throw new IOException((new StringBuilder()).append("Bad packet id ").append(i).toString());
            }
            packet = func_325_a(i);
            if(packet == null)
            {
                throw new IOException((new StringBuilder()).append("Bad packet id ").append(i).toString());
            }
            packet.func_327_a(p_324_0_);
            field_48158_m++;
            field_48156_n += packet.func_329_a();
        }
        catch(EOFException eofexception)
        {
            System.out.println("Reached end of stream");
            return null;
        }
        PacketCount.func_40561_a(i, packet.func_329_a());
        field_48158_m++;
        field_48156_n += packet.func_329_a();
        return packet;
    }

    public static void func_328_a(Packet p_328_0_, DataOutputStream p_328_1_)
        throws IOException
    {
        p_328_1_.write(p_328_0_.func_326_b());
        p_328_0_.func_322_a(p_328_1_);
        field_48157_o++;
        field_48155_p += p_328_0_.func_329_a();
    }

    public static void func_27049_a(String p_27049_0_, DataOutputStream p_27049_1_)
        throws IOException
    {
        if(p_27049_0_.length() > 32767)
        {
            throw new IOException("String too big");
        } else
        {
            p_27049_1_.writeShort(p_27049_0_.length());
            p_27049_1_.writeChars(p_27049_0_);
            return;
        }
    }

    public static String func_27048_a(DataInputStream p_27048_0_, int p_27048_1_)
        throws IOException
    {
        short word0 = p_27048_0_.readShort();
        if(word0 > p_27048_1_)
        {
            throw new IOException((new StringBuilder()).append("Received string length longer than maximum allowed (").append(word0).append(" > ").append(p_27048_1_).append(")").toString());
        }
        if(word0 < 0)
        {
            throw new IOException("Received string length is less than zero! Weird string!");
        }
        StringBuilder stringbuilder = new StringBuilder();
        for(int i = 0; i < word0; i++)
        {
            stringbuilder.append(p_27048_0_.readChar());
        }

        return stringbuilder.toString();
    }

    public abstract void func_327_a(DataInputStream datainputstream)
        throws IOException;

    public abstract void func_322_a(DataOutputStream dataoutputstream)
        throws IOException;

    public abstract void func_323_a(NetHandler nethandler);

    public abstract int func_329_a();

    protected ItemStack func_40187_b(DataInputStream p_40187_1_)
        throws IOException
    {
        ItemStack itemstack = null;
        short word0 = p_40187_1_.readShort();
        if(word0 >= 0)
        {
            byte byte0 = p_40187_1_.readByte();
            short word1 = p_40187_1_.readShort();
            itemstack = new ItemStack(word0, byte0, word1);
            if(Item.field_233_c[word0].func_25007_g() || Item.field_233_c[word0].func_46056_k())
            {
                itemstack.field_40715_d = func_40186_c(p_40187_1_);
            }
        }
        return itemstack;
    }

    protected void func_40188_a(ItemStack p_40188_1_, DataOutputStream p_40188_2_)
        throws IOException
    {
        if(p_40188_1_ == null)
        {
            p_40188_2_.writeShort(-1);
        } else
        {
            p_40188_2_.writeShort(p_40188_1_.field_1617_c);
            p_40188_2_.writeByte(p_40188_1_.field_1615_a);
            p_40188_2_.writeShort(p_40188_1_.func_21181_i());
            if(p_40188_1_.func_1091_a().func_25007_g() || p_40188_1_.func_1091_a().func_46056_k())
            {
                func_40189_a(p_40188_1_.field_40715_d, p_40188_2_);
            }
        }
    }

    protected NBTTagCompound func_40186_c(DataInputStream p_40186_1_)
        throws IOException
    {
        short word0 = p_40186_1_.readShort();
        if(word0 < 0)
        {
            return null;
        } else
        {
            byte abyte0[] = new byte[word0];
            p_40186_1_.readFully(abyte0);
            return CompressedStreamTools.func_40592_a(abyte0);
        }
    }

    protected void func_40189_a(NBTTagCompound p_40189_1_, DataOutputStream p_40189_2_)
        throws IOException
    {
        if(p_40189_1_ == null)
        {
            p_40189_2_.writeShort(-1);
        } else
        {
            byte abyte0[] = CompressedStreamTools.func_40591_a(p_40189_1_);
            p_40189_2_.writeShort((short)abyte0.length);
            p_40189_2_.write(abyte0);
        }
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static 
    {
        func_321_a(0, true, true, net.minecraft.src.Packet0KeepAlive.class);
        func_321_a(1, true, true, net.minecraft.src.Packet1Login.class);
        func_321_a(2, true, true, net.minecraft.src.Packet2Handshake.class);
        func_321_a(3, true, true, net.minecraft.src.Packet3Chat.class);
        func_321_a(4, true, false, net.minecraft.src.Packet4UpdateTime.class);
        func_321_a(5, true, false, net.minecraft.src.Packet5PlayerInventory.class);
        func_321_a(6, true, false, net.minecraft.src.Packet6SpawnPosition.class);
        func_321_a(7, false, true, net.minecraft.src.Packet7UseEntity.class);
        func_321_a(8, true, false, net.minecraft.src.Packet8UpdateHealth.class);
        func_321_a(9, true, true, net.minecraft.src.Packet9Respawn.class);
        func_321_a(10, true, true, net.minecraft.src.Packet10Flying.class);
        func_321_a(11, true, true, net.minecraft.src.Packet11PlayerPosition.class);
        func_321_a(12, true, true, net.minecraft.src.Packet12PlayerLook.class);
        func_321_a(13, true, true, net.minecraft.src.Packet13PlayerLookMove.class);
        func_321_a(14, false, true, net.minecraft.src.Packet14BlockDig.class);
        func_321_a(15, false, true, net.minecraft.src.Packet15Place.class);
        func_321_a(16, false, true, net.minecraft.src.Packet16BlockItemSwitch.class);
        func_321_a(17, true, false, net.minecraft.src.Packet17Sleep.class);
        func_321_a(18, true, true, net.minecraft.src.Packet18Animation.class);
        func_321_a(19, false, true, net.minecraft.src.Packet19EntityAction.class);
        func_321_a(20, true, false, net.minecraft.src.Packet20NamedEntitySpawn.class);
        func_321_a(21, true, false, net.minecraft.src.Packet21PickupSpawn.class);
        func_321_a(22, true, false, net.minecraft.src.Packet22Collect.class);
        func_321_a(23, true, false, net.minecraft.src.Packet23VehicleSpawn.class);
        func_321_a(24, true, false, net.minecraft.src.Packet24MobSpawn.class);
        func_321_a(25, true, false, net.minecraft.src.Packet25EntityPainting.class);
        func_321_a(26, true, false, net.minecraft.src.Packet26EntityExpOrb.class);
        func_321_a(28, true, false, net.minecraft.src.Packet28EntityVelocity.class);
        func_321_a(29, true, false, net.minecraft.src.Packet29DestroyEntity.class);
        func_321_a(30, true, false, net.minecraft.src.Packet30Entity.class);
        func_321_a(31, true, false, net.minecraft.src.Packet31RelEntityMove.class);
        func_321_a(32, true, false, net.minecraft.src.Packet32EntityLook.class);
        func_321_a(33, true, false, net.minecraft.src.Packet33RelEntityMoveLook.class);
        func_321_a(34, true, false, net.minecraft.src.Packet34EntityTeleport.class);
        func_321_a(35, true, false, net.minecraft.src.Packet35EntityHeadRotation.class);
        func_321_a(38, true, false, net.minecraft.src.Packet38EntityStatus.class);
        func_321_a(39, true, false, net.minecraft.src.Packet39AttachEntity.class);
        func_321_a(40, true, false, net.minecraft.src.Packet40EntityMetadata.class);
        func_321_a(41, true, false, net.minecraft.src.Packet41EntityEffect.class);
        func_321_a(42, true, false, net.minecraft.src.Packet42RemoveEntityEffect.class);
        func_321_a(43, true, false, net.minecraft.src.Packet43Experience.class);
        func_321_a(50, true, false, net.minecraft.src.Packet50PreChunk.class);
        func_321_a(51, true, false, net.minecraft.src.Packet51MapChunk.class);
        func_321_a(52, true, false, net.minecraft.src.Packet52MultiBlockChange.class);
        func_321_a(53, true, false, net.minecraft.src.Packet53BlockChange.class);
        func_321_a(54, true, false, net.minecraft.src.Packet54PlayNoteBlock.class);
        func_321_a(60, true, false, net.minecraft.src.Packet60Explosion.class);
        func_321_a(61, true, false, net.minecraft.src.Packet61DoorChange.class);
        func_321_a(70, true, false, net.minecraft.src.Packet70Bed.class);
        func_321_a(71, true, false, net.minecraft.src.Packet71Weather.class);
        func_321_a(100, true, false, net.minecraft.src.Packet100OpenWindow.class);
        func_321_a(101, true, true, net.minecraft.src.Packet101CloseWindow.class);
        func_321_a(102, false, true, net.minecraft.src.Packet102WindowClick.class);
        func_321_a(103, true, false, net.minecraft.src.Packet103SetSlot.class);
        func_321_a(104, true, false, net.minecraft.src.Packet104WindowItems.class);
        func_321_a(105, true, false, net.minecraft.src.Packet105UpdateProgressbar.class);
        func_321_a(106, true, true, net.minecraft.src.Packet106Transaction.class);
        func_321_a(107, true, true, net.minecraft.src.Packet107CreativeSetSlot.class);
        func_321_a(108, false, true, net.minecraft.src.Packet108EnchantItem.class);
        func_321_a(130, true, true, net.minecraft.src.Packet130UpdateSign.class);
        func_321_a(131, true, false, net.minecraft.src.Packet131MapData.class);
        func_321_a(132, true, false, net.minecraft.src.Packet132TileEntityData.class);
        func_321_a(200, true, false, net.minecraft.src.Packet200Statistic.class);
        func_321_a(201, true, false, net.minecraft.src.Packet201PlayerInfo.class);
        func_321_a(202, true, true, net.minecraft.src.Packet202PlayerAbilities.class);
        func_321_a(250, true, true, net.minecraft.src.Packet250CustomPayload.class);
        func_321_a(254, false, true, net.minecraft.src.Packet254ServerPing.class);
        func_321_a(255, true, true, net.minecraft.src.Packet255KickDisconnect.class);
    }
}
