package net.minecraft.src;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class ModTextureAnimation extends TextureFX
{
    private final int tickRate;
    private final byte images[][];
    private int index;
    private int ticks;

    public ModTextureAnimation(int i, int j, BufferedImage bufferedimage, int k)
    {
        this(i, 1, j, bufferedimage, k);
    }

    public ModTextureAnimation(int i, int j, int k, BufferedImage bufferedimage, int l)
    {
        super(i);
        index = 0;
        ticks = 0;
        tileSize = j;
        tileImage = k;
        tickRate = l;
        ticks = l;
        bindImage(ModLoader.getMinecraftInstance().renderEngine);
        int i1 = GL11.glGetTexLevelParameteri(GL11.GL_TEXTURE_2D, 0, GL11.GL_TEXTURE_WIDTH) / 16;
        int j1 = GL11.glGetTexLevelParameteri(GL11.GL_TEXTURE_2D, 0, GL11.GL_TEXTURE_HEIGHT) / 16;
        int k1 = bufferedimage.getWidth();
        int l1 = bufferedimage.getHeight();
        int i2 = (int)Math.floor(l1 / k1);

        if (i2 <= 0)
        {
            throw new IllegalArgumentException("source has no complete images");
        }

        images = new byte[i2][];

        if (k1 != i1)
        {
            BufferedImage bufferedimage1 = new BufferedImage(i1, j1 * i2, 6);
            Graphics2D graphics2d = bufferedimage1.createGraphics();
            graphics2d.drawImage(bufferedimage, 0, 0, i1, j1 * i2, 0, 0, k1, l1, null);
            graphics2d.dispose();
            bufferedimage = bufferedimage1;
        }

        for (int j2 = 0; j2 < i2; j2++)
        {
            int ai[] = new int[i1 * j1];
            bufferedimage.getRGB(0, j1 * j2, i1, j1, ai, 0, i1);
            images[j2] = new byte[i1 * j1 * 4];

            for (int k2 = 0; k2 < ai.length; k2++)
            {
                int l2 = ai[k2] >> 24 & 0xff;
                int i3 = ai[k2] >> 16 & 0xff;
                int j3 = ai[k2] >> 8 & 0xff;
                int k3 = ai[k2] >> 0 & 0xff;
                images[j2][k2 * 4 + 0] = (byte)i3;
                images[j2][k2 * 4 + 1] = (byte)j3;
                images[j2][k2 * 4 + 2] = (byte)k3;
                images[j2][k2 * 4 + 3] = (byte)l2;
            }
        }
    }

    public void onTick()
    {
        if (ticks >= tickRate)
        {
            index++;

            if (index >= images.length)
            {
                index = 0;
            }

            imageData = images[index];
            ticks = 0;
        }

        ticks++;
    }
}
