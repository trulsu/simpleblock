package net.nittini.simpleblock.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CoolBlock extends BlockBase {
    public CoolBlock(String name, Material material) {
        super(name, material);

        // minecraftmodcustomstuff.wikia.com/wiki/Hardness
        setSoundType(SoundType.GLASS);
        setHardness(5.0F); // How hard is this to break? 
        setResistance(10.0f); // Resistance to explosives
        setHarvestLevel("pickaxe", 2); // Type of tool used to break the block. 2 = Iron or above
        setLightLevel(1.0f); // How much light your block emits
        //setLightOpacity(1); // 1 = all light, 0 = no light
        //setBlockUnbreakable(); // Only bedrock has this. Cannot be broken in any case.
    }
}