package com.VanillaAddon.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEnchantmentTable;
import net.minecraft.world.World;

import com.VanillaAddon.core.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEnchantmentTableOverRide extends BlockEnchantmentTable
{
    
    public BlockEnchantmentTableOverRide(int par1)
    {
        super(par1);
        
    }
    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    @Override
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.randomDisplayTick(par1World, par2, par3, par4, par5Random);

        for (int l = par2 - 2; l <= par2 + 2; ++l)
        {
            for (int i1 = par4 - 2; i1 <= par4 + 2; ++i1)
            {
                if (l > par2 - 2 && l < par2 + 2 && i1 == par4 - 1)
                {
                    i1 = par4 + 2;
                }

                if (par5Random.nextInt(16) == 0)
                {
                    for (int j1 = par3; j1 <= par3 + 1; ++j1)
                    {
                        if (par1World.getBlockId(l, j1, i1) == Block.bookShelf.blockID || par1World.getBlockId(l, j1, i1) == Blocks.NewbookShelf.blockID)
                        {
                            if (!par1World.isAirBlock((l - par2) / 2 + par2, j1, (i1 - par4) / 2 + par4))
                            {
                                break;
                            }

                            par1World.spawnParticle("enchantmenttable", (double)par2 + 0.5D, (double)par3 + 2.0D, (double)par4 + 0.5D, (double)((float)(l - par2) + par5Random.nextFloat()) - 0.5D, (double)((float)(j1 - par3) - par5Random.nextFloat() - 1.0F), (double)((float)(i1 - par4) + par5Random.nextFloat()) - 0.5D);
                        }
                    }
                }
            }
        }
    }

   
}
