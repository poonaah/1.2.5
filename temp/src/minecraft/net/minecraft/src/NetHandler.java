// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Packet51MapChunk, Packet, Packet255KickDisconnect, Packet1Login, 
//            Packet10Flying, Packet52MultiBlockChange, Packet14BlockDig, Packet53BlockChange, 
//            Packet50PreChunk, Packet20NamedEntitySpawn, Packet30Entity, Packet34EntityTeleport, 
//            Packet15Place, Packet16BlockItemSwitch, Packet29DestroyEntity, Packet21PickupSpawn, 
//            Packet22Collect, Packet3Chat, Packet23VehicleSpawn, Packet18Animation, 
//            Packet19EntityAction, Packet2Handshake, Packet24MobSpawn, Packet4UpdateTime, 
//            Packet6SpawnPosition, Packet28EntityVelocity, Packet40EntityMetadata, Packet39AttachEntity, 
//            Packet7UseEntity, Packet38EntityStatus, Packet8UpdateHealth, Packet9Respawn, 
//            Packet60Explosion, Packet100OpenWindow, Packet101CloseWindow, Packet102WindowClick, 
//            Packet103SetSlot, Packet104WindowItems, Packet130UpdateSign, Packet105UpdateProgressbar, 
//            Packet5PlayerInventory, Packet106Transaction, Packet25EntityPainting, Packet54PlayNoteBlock, 
//            Packet200Statistic, Packet17Sleep, Packet70Bed, Packet71Weather, 
//            Packet131MapData, Packet61DoorChange, Packet254ServerPing, Packet41EntityEffect, 
//            Packet42RemoveEntityEffect, Packet201PlayerInfo, Packet0KeepAlive, Packet43Experience, 
//            Packet107CreativeSetSlot, Packet26EntityExpOrb, Packet108EnchantItem, Packet250CustomPayload, 
//            Packet35EntityHeadRotation, Packet132TileEntityData, Packet202PlayerAbilities

public abstract class NetHandler
{

    public NetHandler()
    {
    }

    public abstract boolean func_27247_c();

    public void func_48487_a(Packet51MapChunk packet51mapchunk)
    {
    }

    public void func_4114_b(Packet packet)
    {
    }

    public void func_823_a(String s, Object aobj[])
    {
    }

    public void func_844_a(Packet255KickDisconnect p_844_1_)
    {
        func_4114_b(p_844_1_);
    }

    public void func_4115_a(Packet1Login p_4115_1_)
    {
        func_4114_b(p_4115_1_);
    }

    public void func_837_a(Packet10Flying p_837_1_)
    {
        func_4114_b(p_837_1_);
    }

    public void func_824_a(Packet52MultiBlockChange p_824_1_)
    {
        func_4114_b(p_824_1_);
    }

    public void func_821_a(Packet14BlockDig p_821_1_)
    {
        func_4114_b(p_821_1_);
    }

    public void func_822_a(Packet53BlockChange p_822_1_)
    {
        func_4114_b(p_822_1_);
    }

    public void func_826_a(Packet50PreChunk p_826_1_)
    {
        func_4114_b(p_826_1_);
    }

    public void func_820_a(Packet20NamedEntitySpawn p_820_1_)
    {
        func_4114_b(p_820_1_);
    }

    public void func_827_a(Packet30Entity p_827_1_)
    {
        func_4114_b(p_827_1_);
    }

    public void func_829_a(Packet34EntityTeleport p_829_1_)
    {
        func_4114_b(p_829_1_);
    }

    public void func_819_a(Packet15Place p_819_1_)
    {
        func_4114_b(p_819_1_);
    }

    public void func_841_a(Packet16BlockItemSwitch p_841_1_)
    {
        func_4114_b(p_841_1_);
    }

    public void func_839_a(Packet29DestroyEntity p_839_1_)
    {
        func_4114_b(p_839_1_);
    }

    public void func_832_a(Packet21PickupSpawn p_832_1_)
    {
        func_4114_b(p_832_1_);
    }

    public void func_834_a(Packet22Collect p_834_1_)
    {
        func_4114_b(p_834_1_);
    }

    public void func_4113_a(Packet3Chat p_4113_1_)
    {
        func_4114_b(p_4113_1_);
    }

    public void func_835_a(Packet23VehicleSpawn p_835_1_)
    {
        func_4114_b(p_835_1_);
    }

    public void func_825_a(Packet18Animation p_825_1_)
    {
        func_4114_b(p_825_1_);
    }

    public void func_21147_a(Packet19EntityAction p_21147_1_)
    {
        func_4114_b(p_21147_1_);
    }

    public void func_838_a(Packet2Handshake p_838_1_)
    {
        func_4114_b(p_838_1_);
    }

    public void func_828_a(Packet24MobSpawn p_828_1_)
    {
        func_4114_b(p_828_1_);
    }

    public void func_846_a(Packet4UpdateTime p_846_1_)
    {
        func_4114_b(p_846_1_);
    }

    public void func_845_a(Packet6SpawnPosition p_845_1_)
    {
        func_4114_b(p_845_1_);
    }

    public void func_6498_a(Packet28EntityVelocity p_6498_1_)
    {
        func_4114_b(p_6498_1_);
    }

    public void func_21148_a(Packet40EntityMetadata p_21148_1_)
    {
        func_4114_b(p_21148_1_);
    }

    public void func_6497_a(Packet39AttachEntity p_6497_1_)
    {
        func_4114_b(p_6497_1_);
    }

    public void func_6499_a(Packet7UseEntity p_6499_1_)
    {
        func_4114_b(p_6499_1_);
    }

    public void func_9447_a(Packet38EntityStatus p_9447_1_)
    {
        func_4114_b(p_9447_1_);
    }

    public void func_9446_a(Packet8UpdateHealth p_9446_1_)
    {
        func_4114_b(p_9446_1_);
    }

    public void func_9448_a(Packet9Respawn p_9448_1_)
    {
        func_4114_b(p_9448_1_);
    }

    public void func_12245_a(Packet60Explosion p_12245_1_)
    {
        func_4114_b(p_12245_1_);
    }

    public void func_20087_a(Packet100OpenWindow p_20087_1_)
    {
        func_4114_b(p_20087_1_);
    }

    public void func_20092_a(Packet101CloseWindow p_20092_1_)
    {
        func_4114_b(p_20092_1_);
    }

    public void func_20091_a(Packet102WindowClick p_20091_1_)
    {
        func_4114_b(p_20091_1_);
    }

    public void func_20088_a(Packet103SetSlot p_20088_1_)
    {
        func_4114_b(p_20088_1_);
    }

    public void func_20094_a(Packet104WindowItems p_20094_1_)
    {
        func_4114_b(p_20094_1_);
    }

    public void func_20093_a(Packet130UpdateSign p_20093_1_)
    {
        func_4114_b(p_20093_1_);
    }

    public void func_20090_a(Packet105UpdateProgressbar p_20090_1_)
    {
        func_4114_b(p_20090_1_);
    }

    public void func_843_a(Packet5PlayerInventory p_843_1_)
    {
        func_4114_b(p_843_1_);
    }

    public void func_20089_a(Packet106Transaction p_20089_1_)
    {
        func_4114_b(p_20089_1_);
    }

    public void func_21146_a(Packet25EntityPainting p_21146_1_)
    {
        func_4114_b(p_21146_1_);
    }

    public void func_21145_a(Packet54PlayNoteBlock p_21145_1_)
    {
        func_4114_b(p_21145_1_);
    }

    public void func_27245_a(Packet200Statistic p_27245_1_)
    {
        func_4114_b(p_27245_1_);
    }

    public void func_22186_a(Packet17Sleep p_22186_1_)
    {
        func_4114_b(p_22186_1_);
    }

    public void func_25118_a(Packet70Bed p_25118_1_)
    {
        func_4114_b(p_25118_1_);
    }

    public void func_27246_a(Packet71Weather p_27246_1_)
    {
        func_4114_b(p_27246_1_);
    }

    public void func_28116_a(Packet131MapData p_28116_1_)
    {
        func_4114_b(p_28116_1_);
    }

    public void func_28115_a(Packet61DoorChange p_28115_1_)
    {
        func_4114_b(p_28115_1_);
    }

    public void func_35782_a(Packet254ServerPing p_35782_1_)
    {
        func_4114_b(p_35782_1_);
    }

    public void func_35780_a(Packet41EntityEffect p_35780_1_)
    {
        func_4114_b(p_35780_1_);
    }

    public void func_35783_a(Packet42RemoveEntityEffect p_35783_1_)
    {
        func_4114_b(p_35783_1_);
    }

    public void func_35779_a(Packet201PlayerInfo p_35779_1_)
    {
        func_4114_b(p_35779_1_);
    }

    public void func_35784_a(Packet0KeepAlive p_35784_1_)
    {
        func_4114_b(p_35784_1_);
    }

    public void func_35777_a(Packet43Experience p_35777_1_)
    {
        func_4114_b(p_35777_1_);
    }

    public void func_35781_a(Packet107CreativeSetSlot p_35781_1_)
    {
        func_4114_b(p_35781_1_);
    }

    public void func_35778_a(Packet26EntityExpOrb p_35778_1_)
    {
        func_4114_b(p_35778_1_);
    }

    public void func_40599_a(Packet108EnchantItem packet108enchantitem)
    {
    }

    public void func_44028_a(Packet250CustomPayload packet250custompayload)
    {
    }

    public void func_48488_a(Packet35EntityHeadRotation p_48488_1_)
    {
        func_4114_b(p_48488_1_);
    }

    public void func_48489_a(Packet132TileEntityData p_48489_1_)
    {
        func_4114_b(p_48489_1_);
    }

    public void func_50100_a(Packet202PlayerAbilities p_50100_1_)
    {
        func_4114_b(p_50100_1_);
    }
}
