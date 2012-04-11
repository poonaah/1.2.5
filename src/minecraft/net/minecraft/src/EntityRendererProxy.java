package net.minecraft.src;

import net.minecraft.client.Minecraft;

public class EntityRendererProxy extends EntityRenderer
{
    private Minecraft game;

    public EntityRendererProxy(Minecraft minecraft)
    {
        super(minecraft);
        game = minecraft;
    }

    /**
     * Will update any inputs that effect the camera angle (mouse) and then render the world and GUI
     */
    public void updateCameraAndRender(float f)
    {
        super.updateCameraAndRender(f);
        ModLoader.onTick(f, game);
    }
}
