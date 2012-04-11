package net.minecraft.src;

public class WorldType
{
    public static final WorldType worldTypes[] = new WorldType[16];

    /** Default world type. */
    public static final WorldType DEFAULT = (new WorldType(0, "default", 1)).func_48631_f();

    /** Flat world type. */
    public static final WorldType FLAT = new WorldType(1, "flat");

    /** Default (1.1) world type. */
    public static final WorldType DEFAULT_1_1 = (new WorldType(8, "default_1_1", 0)).setCanBeCreated(false);

    /** 'default' or 'flat' */
    private final String worldType;

    /** The int version of the ChunkProvider that generated this world. */
    private final int generatorVersion;

    /**
     * Whether this world type can be generated. Normally true; set to false for out-of-date generator versions.
     */
    private boolean canBeCreated;
    private boolean field_48638_h;

    public WorldType(int par1, String par2Str)
    {
        this(par1, par2Str, 0);
    }

    private WorldType(int par1, String par2Str, int par3)
    {
        worldType = par2Str;
        generatorVersion = par3;
        canBeCreated = true;
        worldTypes[par1] = this;
    }

    public String func_48628_a()
    {
        return worldType;
    }

    /**
     * Gets the translation key for the name of this world type.
     */
    public String getTranslateName()
    {
        return (new StringBuilder("generator.")).append(worldType).toString();
    }

    /**
     * Returns generatorVersion.
     */
    public int getGeneratorVersion()
    {
        return generatorVersion;
    }

    public WorldType func_48629_a(int par1)
    {
        return this != DEFAULT || par1 != 0 ? this : DEFAULT_1_1;
    }

    /**
     * Sets canBeCreated to the provided value, and returns this.
     */
    private WorldType setCanBeCreated(boolean par1)
    {
        canBeCreated = par1;
        return this;
    }

    /**
     * Gets whether this WorldType can be used to generate a new world.
     */
    public boolean getCanBeCreated()
    {
        return canBeCreated;
    }

    private WorldType func_48631_f()
    {
        field_48638_h = true;
        return this;
    }

    public boolean func_48626_e()
    {
        return field_48638_h;
    }

    public static WorldType parseWorldType(String par0Str)
    {
        for (int i = 0; i < worldTypes.length; i++)
        {
            if (worldTypes[i] != null && worldTypes[i].worldType.equalsIgnoreCase(par0Str))
            {
                return worldTypes[i];
            }
        }

        return null;
    }

    public WorldChunkManager getChunkManager(World world)
    {
        if (this == FLAT)
        {
            return new WorldChunkManagerHell(BiomeGenBase.plains, 0.5F, 0.5F);
        }
        else
        {
            return new WorldChunkManager(world);
        }
    }

    public IChunkProvider getChunkGenerator(World world)
    {
        if (this == FLAT)
        {
            return new ChunkProviderFlat(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled());
        }
        else
        {
            return new ChunkProviderGenerate(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled());
        }
    }

    public int getSeaLevel(World world)
    {
        return this != FLAT ? 64 : 4;
    }

    public boolean hasVoidParticles(boolean flag)
    {
        return this != FLAT && !flag;
    }

    public double voidFadeMagnitude()
    {
        return this != FLAT ? 0.03125D : 1.0D;
    }
}
