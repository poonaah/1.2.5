// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ItemStack, StatCollector, EnumAction, StringTranslate, 
//            EnumRarity, EntityPlayer, Vec3D, MathHelper, 
//            World, ItemSpade, EnumToolMaterial, ItemPickaxe, 
//            ItemAxe, ItemFlintAndSteel, ItemFood, ItemBow, 
//            ItemCoal, ItemSword, ItemSoup, PotionHelper, 
//            ItemHoe, ItemSeeds, Block, ItemArmor, 
//            EnumArmorMaterial, ItemPainting, ItemAppleGold, Potion, 
//            ItemSign, ItemDoor, Material, ItemBucket, 
//            ItemMinecart, ItemSaddle, ItemRedstone, ItemSnowball, 
//            ItemBoat, ItemBucketMilk, ItemReed, ItemEgg, 
//            ItemFishingRod, ItemDye, ItemBed, ItemMap, 
//            ItemShears, ItemEnderPearl, ItemPotion, ItemGlassBottle, 
//            ItemEnderEye, ItemMonsterPlacer, ItemExpBottle, ItemFireball, 
//            ItemRecord, StatList, EntityLiving, Entity, 
//            MovingObjectPosition

public class Item
{

    protected static Random field_4015_b = new Random();
    public static Item field_233_c[] = new Item[32000];
    public static Item field_232_d;
    public static Item field_231_e;
    public static Item field_230_f;
    public static Item field_4014_g = (new ItemFlintAndSteel(3)).func_20010_a(5, 0).func_20011_a("flintAndSteel");
    public static Item field_228_h = (new ItemFood(4, 4, 0.3F, false)).func_20010_a(10, 0).func_20011_a("apple");
    public static Item field_227_i = (new ItemBow(5)).func_20010_a(5, 1).func_20011_a("bow");
    public static Item field_226_j = (new Item(6)).func_20010_a(5, 2).func_20011_a("arrow");
    public static Item field_225_k = (new ItemCoal(7)).func_20010_a(7, 0).func_20011_a("coal");
    public static Item field_224_l = (new Item(8)).func_20010_a(7, 3).func_20011_a("emerald");
    public static Item field_223_m = (new Item(9)).func_20010_a(7, 1).func_20011_a("ingotIron");
    public static Item field_222_n = (new Item(10)).func_20010_a(7, 2).func_20011_a("ingotGold");
    public static Item field_221_o;
    public static Item field_220_p;
    public static Item field_219_q;
    public static Item field_218_r;
    public static Item field_217_s;
    public static Item field_216_t;
    public static Item field_215_u;
    public static Item field_214_v;
    public static Item field_213_w;
    public static Item field_212_x;
    public static Item field_211_y;
    public static Item field_210_z;
    public static Item field_268_A;
    public static Item field_266_B = (new Item(24)).func_20010_a(5, 3).func_4016_e().func_20011_a("stick");
    public static Item field_264_C = (new Item(25)).func_20010_a(7, 4).func_20011_a("bowl");
    public static Item field_263_D = (new ItemSoup(26, 8)).func_20010_a(8, 4).func_20011_a("mushroomStew");
    public static Item field_261_E;
    public static Item field_259_F;
    public static Item field_257_G;
    public static Item field_255_H;
    public static Item field_253_I = (new Item(31)).func_20010_a(8, 0).func_20011_a("string");
    public static Item field_251_J = (new Item(32)).func_20010_a(8, 1).func_20011_a("feather");
    public static Item field_250_K;
    public static Item field_249_L;
    public static Item field_248_M;
    public static Item field_247_N;
    public static Item field_246_O;
    public static Item field_245_P;
    public static Item field_244_Q;
    public static Item field_243_R = (new Item(40)).func_20010_a(9, 1).func_20011_a("wheat");
    public static Item field_242_S = (new ItemFood(41, 5, 0.6F, false)).func_20010_a(9, 2).func_20011_a("bread");
    public static Item field_241_T;
    public static Item field_240_U;
    public static Item field_239_V;
    public static Item field_238_W;
    public static Item field_237_X;
    public static Item field_236_Y;
    public static Item field_235_Z;
    public static Item field_286_aa;
    public static Item field_285_ab;
    public static Item field_284_ac;
    public static Item field_283_ad;
    public static Item field_282_ae;
    public static Item field_281_af;
    public static Item field_280_ag;
    public static Item field_279_ah;
    public static Item field_278_ai;
    public static Item field_277_aj;
    public static Item field_276_ak;
    public static Item field_275_al;
    public static Item field_274_am;
    public static Item field_273_an = (new Item(62)).func_20010_a(6, 0).func_20011_a("flint");
    public static Item field_272_ao = (new ItemFood(63, 3, 0.3F, true)).func_20010_a(7, 5).func_20011_a("porkchopRaw");
    public static Item field_4017_ap = (new ItemFood(64, 8, 0.8F, true)).func_20010_a(8, 5).func_20011_a("porkchopCooked");
    public static Item field_270_aq = (new ItemPainting(65)).func_20010_a(10, 1).func_20011_a("painting");
    public static Item field_269_ar;
    public static Item field_267_as = (new ItemSign(67)).func_20010_a(10, 2).func_20011_a("sign");
    public static Item field_265_at;
    public static Item field_262_au;
    public static Item field_4016_av;
    public static Item field_258_aw;
    public static Item field_256_ax = (new ItemMinecart(72, 0)).func_20010_a(7, 8).func_20011_a("minecart");
    public static Item field_254_ay = (new ItemSaddle(73)).func_20010_a(8, 6).func_20011_a("saddle");
    public static Item field_252_az;
    public static Item field_309_aA;
    public static Item field_308_aB = (new ItemSnowball(76)).func_20010_a(14, 0).func_20011_a("snowball");
    public static Item field_4031_aC = (new ItemBoat(77)).func_20010_a(8, 8).func_20011_a("boat");
    public static Item field_306_aD = (new Item(78)).func_20010_a(7, 6).func_20011_a("leather");
    public static Item field_305_aE;
    public static Item field_4030_aF = (new Item(80)).func_20010_a(6, 1).func_20011_a("brick");
    public static Item field_303_aG = (new Item(81)).func_20010_a(9, 3).func_20011_a("clay");
    public static Item field_302_aH;
    public static Item field_4029_aI = (new Item(83)).func_20010_a(10, 3).func_20011_a("paper");
    public static Item field_4028_aJ = (new Item(84)).func_20010_a(11, 3).func_20011_a("book");
    public static Item field_299_aK = (new Item(85)).func_20010_a(14, 1).func_20011_a("slimeball");
    public static Item field_4027_aL = (new ItemMinecart(86, 1)).func_20010_a(7, 9).func_20011_a("minecartChest");
    public static Item field_4026_aM = (new ItemMinecart(87, 2)).func_20010_a(7, 10).func_20011_a("minecartFurnace");
    public static Item field_296_aN = (new ItemEgg(88)).func_20010_a(12, 0).func_20011_a("egg");
    public static Item field_4025_aO = (new Item(89)).func_20010_a(6, 3).func_20011_a("compass");
    public static Item field_4024_aP = (new ItemFishingRod(90)).func_20010_a(5, 4).func_20011_a("fishingRod");
    public static Item field_4023_aQ = (new Item(91)).func_20010_a(6, 4).func_20011_a("clock");
    public static Item field_4022_aR;
    public static Item field_4021_aS = (new ItemFood(93, 2, 0.3F, false)).func_20010_a(9, 5).func_20011_a("fishRaw");
    public static Item field_4020_aT = (new ItemFood(94, 5, 0.6F, false)).func_20010_a(10, 5).func_20011_a("fishCooked");
    public static Item field_21021_aU = (new ItemDye(95)).func_20010_a(14, 4).func_20011_a("dyePowder");
    public static Item field_21020_aV = (new Item(96)).func_20010_a(12, 1).func_20011_a("bone").func_4016_e();
    public static Item field_21019_aW;
    public static Item field_21022_aX;
    public static Item field_22019_aY = (new ItemBed(99)).func_21009_c(1).func_20010_a(13, 2).func_20011_a("bed");
    public static Item field_22018_aZ;
    public static Item field_25010_ba = (new ItemFood(101, 1, 0.1F, false)).func_20010_a(12, 5).func_20011_a("cookie");
    public static ItemMap field_28010_bb = (ItemMap)(new ItemMap(102)).func_20010_a(12, 3).func_20011_a("map");
    public static ItemShears field_31001_bc = (ItemShears)(new ItemShears(103)).func_20010_a(13, 5).func_20011_a("shears");
    public static Item field_35421_bg = (new ItemFood(104, 2, 0.3F, false)).func_20010_a(13, 6).func_20011_a("melon");
    public static Item field_35422_bh;
    public static Item field_35423_bi;
    public static Item field_35417_bj = (new ItemFood(107, 3, 0.3F, true)).func_20010_a(9, 6).func_20011_a("beefRaw");
    public static Item field_35418_bk = (new ItemFood(108, 8, 0.8F, true)).func_20010_a(10, 6).func_20011_a("beefCooked");
    public static Item field_35419_bl;
    public static Item field_35420_bm = (new ItemFood(110, 6, 0.6F, true)).func_20010_a(10, 7).func_20011_a("chickenCooked");
    public static Item field_35415_bn;
    public static Item field_35416_bo = (new ItemEnderPearl(112)).func_20010_a(11, 6).func_20011_a("enderPearl");
    public static Item field_40417_bo = (new Item(113)).func_20010_a(12, 6).func_20011_a("blazeRod");
    public static Item field_40418_bp;
    public static Item field_40419_bq = (new Item(115)).func_20010_a(12, 7).func_20011_a("goldNugget");
    public static Item field_40414_br;
    public static ItemPotion field_40413_bs = (ItemPotion)(new ItemPotion(117)).func_20010_a(13, 8).func_20011_a("potion");
    public static Item field_40416_bt = (new ItemGlassBottle(118)).func_20010_a(12, 8).func_20011_a("glassBottle");
    public static Item field_40415_bu;
    public static Item field_40410_bv;
    public static Item field_40409_bw;
    public static Item field_40412_bx;
    public static Item field_40411_by;
    public static Item field_40408_bz;
    public static Item field_40420_bA = (new ItemEnderEye(125)).func_20010_a(11, 9).func_20011_a("eyeOfEnder");
    public static Item field_40426_bB;
    public static Item field_44019_bC = (new ItemMonsterPlacer(127)).func_20010_a(9, 9).func_20011_a("monsterPlacer");
    public static Item field_48438_bD = (new ItemExpBottle(128)).func_20010_a(11, 10).func_20011_a("expBottle");
    public static Item field_48439_bE = (new ItemFireball(129)).func_20010_a(14, 2).func_20011_a("fireball");
    public static Item field_293_aQ = (new ItemRecord(2000, "13")).func_20010_a(0, 15).func_20011_a("record");
    public static Item field_4019_aV = (new ItemRecord(2001, "cat")).func_20010_a(1, 15).func_20011_a("record");
    public static Item field_40425_bE = (new ItemRecord(2002, "blocks")).func_20010_a(2, 15).func_20011_a("record");
    public static Item field_40429_bF = (new ItemRecord(2003, "chirp")).func_20010_a(3, 15).func_20011_a("record");
    public static Item field_40430_bG = (new ItemRecord(2004, "far")).func_20010_a(4, 15).func_20011_a("record");
    public static Item field_40427_bH = (new ItemRecord(2005, "mall")).func_20010_a(5, 15).func_20011_a("record");
    public static Item field_40428_bI = (new ItemRecord(2006, "mellohi")).func_20010_a(6, 15).func_20011_a("record");
    public static Item field_40423_bJ = (new ItemRecord(2007, "stal")).func_20010_a(7, 15).func_20011_a("record");
    public static Item field_40424_bK = (new ItemRecord(2008, "strad")).func_20010_a(8, 15).func_20011_a("record");
    public static Item field_40421_bL = (new ItemRecord(2009, "ward")).func_20010_a(9, 15).func_20011_a("record");
    public static Item field_40422_bM = (new ItemRecord(2010, "11")).func_20010_a(10, 15).func_20011_a("record");
    public final int field_291_aS;
    protected int field_290_aT;
    private int field_289_aU;
    protected int field_4018_aZ;
    protected boolean field_287_aW;
    protected boolean field_21018_bf;
    private Item field_20926_a;
    private String field_39010_c;
    private String field_332_a;

    protected Item(int p_i704_1_)
    {
        field_290_aT = 64;
        field_289_aU = 0;
        field_287_aW = false;
        field_21018_bf = false;
        field_20926_a = null;
        field_39010_c = null;
        field_291_aS = 256 + p_i704_1_;
        if(field_233_c[256 + p_i704_1_] != null)
        {
            System.out.println((new StringBuilder()).append("CONFLICT @ ").append(p_i704_1_).toString());
        }
        field_233_c[256 + p_i704_1_] = this;
    }

    public Item func_4022_a(int p_4022_1_)
    {
        field_4018_aZ = p_4022_1_;
        return this;
    }

    public Item func_21009_c(int p_21009_1_)
    {
        field_290_aT = p_21009_1_;
        return this;
    }

    public Item func_20010_a(int p_20010_1_, int p_20010_2_)
    {
        field_4018_aZ = p_20010_1_ + p_20010_2_ * 16;
        return this;
    }

    public int func_27009_a(int p_27009_1_)
    {
        return field_4018_aZ;
    }

    public final int func_196_a(ItemStack p_196_1_)
    {
        return func_27009_a(p_196_1_.func_21181_i());
    }

    public boolean func_192_a(ItemStack p_192_1_, EntityPlayer p_192_2_, World p_192_3_, int i, int j, int k, int l)
    {
        return false;
    }

    public float func_204_a(ItemStack p_204_1_, Block p_204_2_)
    {
        return 1.0F;
    }

    public ItemStack func_193_a(ItemStack p_193_1_, World p_193_2_, EntityPlayer p_193_3_)
    {
        return p_193_1_;
    }

    public ItemStack func_35413_b(ItemStack p_35413_1_, World p_35413_2_, EntityPlayer p_35413_3_)
    {
        return p_35413_1_;
    }

    public int func_200_b()
    {
        return field_290_aT;
    }

    public int func_21012_a(int p_21012_1_)
    {
        return 0;
    }

    public boolean func_21010_e()
    {
        return field_21018_bf;
    }

    protected Item func_21015_a(boolean p_21015_1_)
    {
        field_21018_bf = p_21015_1_;
        return this;
    }

    public int func_197_c()
    {
        return field_289_aU;
    }

    protected Item func_21013_d(int p_21013_1_)
    {
        field_289_aU = p_21013_1_;
        return this;
    }

    public boolean func_25007_g()
    {
        return field_289_aU > 0 && !field_21018_bf;
    }

    public boolean func_4021_a(ItemStack p_4021_1_, EntityLiving p_4021_2_, EntityLiving p_4021_3_)
    {
        return false;
    }

    public boolean func_25008_a(ItemStack p_25008_1_, int p_25008_2_, int p_25008_3_, int i, int j, EntityLiving entityliving)
    {
        return false;
    }

    public int func_4020_a(Entity p_4020_1_)
    {
        return 1;
    }

    public boolean func_4018_a(Block p_4018_1_)
    {
        return false;
    }

    public void func_4019_b(ItemStack itemstack, EntityLiving entityliving)
    {
    }

    public Item func_4016_e()
    {
        field_287_aW = true;
        return this;
    }

    public boolean func_4017_a()
    {
        return field_287_aW;
    }

    public boolean func_4023_b()
    {
        return false;
    }

    public Item func_20011_a(String p_20011_1_)
    {
        field_332_a = (new StringBuilder()).append("item.").append(p_20011_1_).toString();
        return this;
    }

    public String func_40400_h(ItemStack p_40400_1_)
    {
        String s = func_21011_b(p_40400_1_);
        if(s == null)
        {
            return "";
        } else
        {
            return StatCollector.func_25200_a(s);
        }
    }

    public String func_20009_a()
    {
        return field_332_a;
    }

    public String func_21011_b(ItemStack p_21011_1_)
    {
        return field_332_a;
    }

    public Item func_21017_a(Item p_21017_1_)
    {
        field_20926_a = p_21017_1_;
        return this;
    }

    public boolean func_46059_i(ItemStack p_46059_1_)
    {
        return true;
    }

    public boolean func_46056_k()
    {
        return false;
    }

    public Item func_21016_h()
    {
        return field_20926_a;
    }

    public boolean func_21014_i()
    {
        return field_20926_a != null;
    }

    public String func_25009_k()
    {
        return StatCollector.func_25200_a((new StringBuilder()).append(func_20009_a()).append(".name").toString());
    }

    public int func_27010_f(int p_27010_1_, int p_27010_2_)
    {
        return 0xffffff;
    }

    public void func_28008_a(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
    }

    public void func_28009_b(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
    }

    public EnumAction func_35412_b(ItemStack p_35412_1_)
    {
        return EnumAction.none;
    }

    public int func_35411_c(ItemStack p_35411_1_)
    {
        return 0;
    }

    public void func_35414_a(ItemStack itemstack, World world, EntityPlayer entityplayer, int i)
    {
    }

    protected Item func_40407_b(String p_40407_1_)
    {
        field_39010_c = p_40407_1_;
        return this;
    }

    public String func_40405_m()
    {
        return field_39010_c;
    }

    public boolean func_40406_n()
    {
        return field_39010_c != null;
    }

    public void func_40404_a(ItemStack itemstack, List list)
    {
    }

    public String func_40397_d(ItemStack p_40397_1_)
    {
        String s = (new StringBuilder()).append("").append(StringTranslate.func_20162_a().func_20161_b(func_40400_h(p_40397_1_))).toString().trim();
        return s;
    }

    public boolean func_40403_e(ItemStack p_40403_1_)
    {
        return p_40403_1_.func_40711_u();
    }

    public EnumRarity func_40398_f(ItemStack p_40398_1_)
    {
        if(p_40398_1_.func_40711_u())
        {
            return EnumRarity.rare;
        } else
        {
            return EnumRarity.common;
        }
    }

    public boolean func_40401_i(ItemStack p_40401_1_)
    {
        return func_200_b() == 1 && func_25007_g();
    }

    protected MovingObjectPosition func_40402_a(World p_40402_1_, EntityPlayer p_40402_2_, boolean p_40402_3_)
    {
        float f = 1.0F;
        float f1 = p_40402_2_.field_602_at + (p_40402_2_.field_604_ar - p_40402_2_.field_602_at) * f;
        float f2 = p_40402_2_.field_603_as + (p_40402_2_.field_605_aq - p_40402_2_.field_603_as) * f;
        double d = p_40402_2_.field_9285_at + (p_40402_2_.field_611_ak - p_40402_2_.field_9285_at) * (double)f;
        double d1 = (p_40402_2_.field_9284_au + (p_40402_2_.field_610_al - p_40402_2_.field_9284_au) * (double)f + 1.6200000000000001D) - (double)p_40402_2_.field_9292_aO;
        double d2 = p_40402_2_.field_9283_av + (p_40402_2_.field_609_am - p_40402_2_.field_9283_av) * (double)f;
        Vec3D vec3d = Vec3D.func_1248_b(d, d1, d2);
        float f3 = MathHelper.func_1114_b(-f2 * 0.01745329F - 3.141593F);
        float f4 = MathHelper.func_1106_a(-f2 * 0.01745329F - 3.141593F);
        float f5 = -MathHelper.func_1114_b(-f1 * 0.01745329F);
        float f6 = MathHelper.func_1106_a(-f1 * 0.01745329F);
        float f7 = f4 * f5;
        float f8 = f6;
        float f9 = f3 * f5;
        double d3 = 5D;
        Vec3D vec3d1 = vec3d.func_1257_c((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
        MovingObjectPosition movingobjectposition = p_40402_1_.func_28105_a(vec3d, vec3d1, p_40402_3_, !p_40402_3_);
        return movingobjectposition;
    }

    public int func_40399_b()
    {
        return 0;
    }

    public boolean func_46058_c()
    {
        return false;
    }

    public int func_46057_a(int p_46057_1_, int p_46057_2_)
    {
        return func_27009_a(p_46057_1_);
    }

    static 
    {
        field_232_d = (new ItemSpade(0, EnumToolMaterial.IRON)).func_20010_a(2, 5).func_20011_a("shovelIron");
        field_231_e = (new ItemPickaxe(1, EnumToolMaterial.IRON)).func_20010_a(2, 6).func_20011_a("pickaxeIron");
        field_230_f = (new ItemAxe(2, EnumToolMaterial.IRON)).func_20010_a(2, 7).func_20011_a("hatchetIron");
        field_221_o = (new ItemSword(11, EnumToolMaterial.IRON)).func_20010_a(2, 4).func_20011_a("swordIron");
        field_220_p = (new ItemSword(12, EnumToolMaterial.WOOD)).func_20010_a(0, 4).func_20011_a("swordWood");
        field_219_q = (new ItemSpade(13, EnumToolMaterial.WOOD)).func_20010_a(0, 5).func_20011_a("shovelWood");
        field_218_r = (new ItemPickaxe(14, EnumToolMaterial.WOOD)).func_20010_a(0, 6).func_20011_a("pickaxeWood");
        field_217_s = (new ItemAxe(15, EnumToolMaterial.WOOD)).func_20010_a(0, 7).func_20011_a("hatchetWood");
        field_216_t = (new ItemSword(16, EnumToolMaterial.STONE)).func_20010_a(1, 4).func_20011_a("swordStone");
        field_215_u = (new ItemSpade(17, EnumToolMaterial.STONE)).func_20010_a(1, 5).func_20011_a("shovelStone");
        field_214_v = (new ItemPickaxe(18, EnumToolMaterial.STONE)).func_20010_a(1, 6).func_20011_a("pickaxeStone");
        field_213_w = (new ItemAxe(19, EnumToolMaterial.STONE)).func_20010_a(1, 7).func_20011_a("hatchetStone");
        field_212_x = (new ItemSword(20, EnumToolMaterial.EMERALD)).func_20010_a(3, 4).func_20011_a("swordDiamond");
        field_211_y = (new ItemSpade(21, EnumToolMaterial.EMERALD)).func_20010_a(3, 5).func_20011_a("shovelDiamond");
        field_210_z = (new ItemPickaxe(22, EnumToolMaterial.EMERALD)).func_20010_a(3, 6).func_20011_a("pickaxeDiamond");
        field_268_A = (new ItemAxe(23, EnumToolMaterial.EMERALD)).func_20010_a(3, 7).func_20011_a("hatchetDiamond");
        field_261_E = (new ItemSword(27, EnumToolMaterial.GOLD)).func_20010_a(4, 4).func_20011_a("swordGold");
        field_259_F = (new ItemSpade(28, EnumToolMaterial.GOLD)).func_20010_a(4, 5).func_20011_a("shovelGold");
        field_257_G = (new ItemPickaxe(29, EnumToolMaterial.GOLD)).func_20010_a(4, 6).func_20011_a("pickaxeGold");
        field_255_H = (new ItemAxe(30, EnumToolMaterial.GOLD)).func_20010_a(4, 7).func_20011_a("hatchetGold");
        field_250_K = (new Item(33)).func_20010_a(8, 2).func_20011_a("sulphur").func_40407_b(PotionHelper.field_40373_k);
        field_249_L = (new ItemHoe(34, EnumToolMaterial.WOOD)).func_20010_a(0, 8).func_20011_a("hoeWood");
        field_248_M = (new ItemHoe(35, EnumToolMaterial.STONE)).func_20010_a(1, 8).func_20011_a("hoeStone");
        field_247_N = (new ItemHoe(36, EnumToolMaterial.IRON)).func_20010_a(2, 8).func_20011_a("hoeIron");
        field_246_O = (new ItemHoe(37, EnumToolMaterial.EMERALD)).func_20010_a(3, 8).func_20011_a("hoeDiamond");
        field_245_P = (new ItemHoe(38, EnumToolMaterial.GOLD)).func_20010_a(4, 8).func_20011_a("hoeGold");
        field_244_Q = (new ItemSeeds(39, Block.field_447_aA.field_376_bc, Block.field_446_aB.field_376_bc)).func_20010_a(9, 0).func_20011_a("seeds");
        field_241_T = (new ItemArmor(42, EnumArmorMaterial.CLOTH, 0, 0)).func_20010_a(0, 0).func_20011_a("helmetCloth");
        field_240_U = (new ItemArmor(43, EnumArmorMaterial.CLOTH, 0, 1)).func_20010_a(0, 1).func_20011_a("chestplateCloth");
        field_239_V = (new ItemArmor(44, EnumArmorMaterial.CLOTH, 0, 2)).func_20010_a(0, 2).func_20011_a("leggingsCloth");
        field_238_W = (new ItemArmor(45, EnumArmorMaterial.CLOTH, 0, 3)).func_20010_a(0, 3).func_20011_a("bootsCloth");
        field_237_X = (new ItemArmor(46, EnumArmorMaterial.CHAIN, 1, 0)).func_20010_a(1, 0).func_20011_a("helmetChain");
        field_236_Y = (new ItemArmor(47, EnumArmorMaterial.CHAIN, 1, 1)).func_20010_a(1, 1).func_20011_a("chestplateChain");
        field_235_Z = (new ItemArmor(48, EnumArmorMaterial.CHAIN, 1, 2)).func_20010_a(1, 2).func_20011_a("leggingsChain");
        field_286_aa = (new ItemArmor(49, EnumArmorMaterial.CHAIN, 1, 3)).func_20010_a(1, 3).func_20011_a("bootsChain");
        field_285_ab = (new ItemArmor(50, EnumArmorMaterial.IRON, 2, 0)).func_20010_a(2, 0).func_20011_a("helmetIron");
        field_284_ac = (new ItemArmor(51, EnumArmorMaterial.IRON, 2, 1)).func_20010_a(2, 1).func_20011_a("chestplateIron");
        field_283_ad = (new ItemArmor(52, EnumArmorMaterial.IRON, 2, 2)).func_20010_a(2, 2).func_20011_a("leggingsIron");
        field_282_ae = (new ItemArmor(53, EnumArmorMaterial.IRON, 2, 3)).func_20010_a(2, 3).func_20011_a("bootsIron");
        field_281_af = (new ItemArmor(54, EnumArmorMaterial.DIAMOND, 3, 0)).func_20010_a(3, 0).func_20011_a("helmetDiamond");
        field_280_ag = (new ItemArmor(55, EnumArmorMaterial.DIAMOND, 3, 1)).func_20010_a(3, 1).func_20011_a("chestplateDiamond");
        field_279_ah = (new ItemArmor(56, EnumArmorMaterial.DIAMOND, 3, 2)).func_20010_a(3, 2).func_20011_a("leggingsDiamond");
        field_278_ai = (new ItemArmor(57, EnumArmorMaterial.DIAMOND, 3, 3)).func_20010_a(3, 3).func_20011_a("bootsDiamond");
        field_277_aj = (new ItemArmor(58, EnumArmorMaterial.GOLD, 4, 0)).func_20010_a(4, 0).func_20011_a("helmetGold");
        field_276_ak = (new ItemArmor(59, EnumArmorMaterial.GOLD, 4, 1)).func_20010_a(4, 1).func_20011_a("chestplateGold");
        field_275_al = (new ItemArmor(60, EnumArmorMaterial.GOLD, 4, 2)).func_20010_a(4, 2).func_20011_a("leggingsGold");
        field_274_am = (new ItemArmor(61, EnumArmorMaterial.GOLD, 4, 3)).func_20010_a(4, 3).func_20011_a("bootsGold");
        field_269_ar = (new ItemAppleGold(66, 4, 1.2F, false)).func_35424_o().func_35425_a(Potion.field_35681_l.field_35670_H, 5, 0, 1.0F).func_20010_a(11, 0).func_20011_a("appleGold");
        field_265_at = (new ItemDoor(68, Material.field_1335_c)).func_20010_a(11, 2).func_20011_a("doorWood");
        field_262_au = (new ItemBucket(69, 0)).func_20010_a(10, 4).func_20011_a("bucket");
        field_4016_av = (new ItemBucket(70, Block.field_401_B.field_376_bc)).func_20010_a(11, 4).func_20011_a("bucketWater").func_21017_a(field_262_au);
        field_258_aw = (new ItemBucket(71, Block.field_397_D.field_376_bc)).func_20010_a(12, 4).func_20011_a("bucketLava").func_21017_a(field_262_au);
        field_252_az = (new ItemDoor(74, Material.field_1333_e)).func_20010_a(12, 2).func_20011_a("doorIron");
        field_309_aA = (new ItemRedstone(75)).func_20010_a(8, 3).func_20011_a("redstone").func_40407_b(PotionHelper.field_40375_i);
        field_305_aE = (new ItemBucketMilk(79)).func_20010_a(13, 4).func_20011_a("milk").func_21017_a(field_262_au);
        field_302_aH = (new ItemReed(82, Block.field_423_aY)).func_20010_a(11, 1).func_20011_a("reeds");
        field_4022_aR = (new Item(92)).func_20010_a(9, 4).func_20011_a("yellowDust").func_40407_b(PotionHelper.field_40372_j);
        field_21019_aW = (new Item(97)).func_20010_a(13, 0).func_20011_a("sugar").func_40407_b(PotionHelper.field_40365_b);
        field_21022_aX = (new ItemReed(98, Block.field_21026_bg)).func_21009_c(1).func_20010_a(13, 1).func_20011_a("cake");
        field_22018_aZ = (new ItemReed(100, Block.field_22021_bh)).func_20010_a(6, 5).func_20011_a("diode");
        field_35422_bh = (new ItemSeeds(105, Block.field_35284_bt.field_376_bc, Block.field_446_aB.field_376_bc)).func_20010_a(13, 3).func_20011_a("seeds_pumpkin");
        field_35423_bi = (new ItemSeeds(106, Block.field_35283_bu.field_376_bc, Block.field_446_aB.field_376_bc)).func_20010_a(14, 3).func_20011_a("seeds_melon");
        field_35419_bl = (new ItemFood(109, 2, 0.3F, true)).func_35425_a(Potion.field_35691_s.field_35670_H, 30, 0, 0.3F).func_20010_a(9, 7).func_20011_a("chickenRaw");
        field_35415_bn = (new ItemFood(111, 4, 0.1F, true)).func_35425_a(Potion.field_35691_s.field_35670_H, 30, 0, 0.8F).func_20010_a(11, 5).func_20011_a("rottenFlesh");
        field_40418_bp = (new Item(114)).func_20010_a(11, 7).func_20011_a("ghastTear").func_40407_b(PotionHelper.field_40366_c);
        field_40414_br = (new ItemSeeds(116, Block.field_40205_bE.field_376_bc, Block.field_4051_bd.field_376_bc)).func_20010_a(13, 7).func_20011_a("netherStalkSeeds").func_40407_b("+4");
        field_40415_bu = (new ItemFood(119, 2, 0.8F, false)).func_35425_a(Potion.field_35689_u.field_35670_H, 5, 0, 1.0F).func_20010_a(11, 8).func_20011_a("spiderEye").func_40407_b(PotionHelper.field_40363_d);
        field_40410_bv = (new Item(120)).func_20010_a(10, 8).func_20011_a("fermentedSpiderEye").func_40407_b(PotionHelper.field_40364_e);
        field_40409_bw = (new Item(121)).func_20010_a(13, 9).func_20011_a("blazePowder").func_40407_b(PotionHelper.field_40362_g);
        field_40412_bx = (new Item(122)).func_20010_a(13, 10).func_20011_a("magmaCream").func_40407_b(PotionHelper.field_40374_h);
        field_40411_by = (new ItemReed(123, Block.field_40211_bG)).func_20010_a(12, 10).func_20011_a("brewingStand");
        field_40408_bz = (new ItemReed(124, Block.field_40208_bH)).func_20010_a(12, 9).func_20011_a("cauldron");
        field_40426_bB = (new Item(126)).func_20010_a(9, 8).func_20011_a("speckledMelon").func_40407_b(PotionHelper.field_40361_f);
        StatList.func_25151_b();
    }
}
