package com.smashingmods.alchemistry.blocks.atomizer;

import com.smashingmods.alchemistry.Registration;
import com.smashingmods.alchemylib.container.BaseContainer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.SlotItemHandler;

public class AtomizerContainer extends BaseContainer {

    public AtomizerContainer(int id, Level world, BlockPos pos, Inventory playerInv) {
        super(Registration.ATOMIZER_CONTAINER.get(), id, world, pos, playerInv, 1);
        AtomizerTile tile = (AtomizerTile) world.getBlockEntity(pos);
        this.addSlot(new SlotItemHandler(tile.getOutput(), 0, 122, 52));
        addPlayerSlots();
     /*   trackInt(new DataSlot() {
            @Override
            public int get() {
                return tile.progressTicks;
            }

            @Override
            public void set(int value) {
                tile.progressTicks = value;
            }
        });
    }

    public int getProgressTicks() {
        return ((AtomizerTile) tile).progressTicks;
    }*/
    }

    //public IEnergyStorage getEnergy() {
    //     return ((AtomizerTile) this.tile).energy;
    //}

    @Override
    public boolean stillValid(Player player) {
        return true;
    }
}