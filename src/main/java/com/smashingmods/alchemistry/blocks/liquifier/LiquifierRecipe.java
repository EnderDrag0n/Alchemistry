package com.smashingmods.alchemistry.blocks.liquifier;

import com.smashingmods.alchemistry.Registration;
import com.smashingmods.alchemistry.misc.ProcessingRecipe;
import com.smashingmods.alchemistry.utils.IngredientStack;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.fluids.FluidStack;

public class LiquifierRecipe extends ProcessingRecipe {

    public IngredientStack input;
    public FluidStack output;

    public LiquifierRecipe(ResourceLocation id, String group, IngredientStack input, FluidStack output) {
        super(Registration.LIQUIFIER_TYPE, id, group, input.ingredient, ItemStack.EMPTY);
        this.input = input;
        this.output = output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Registration.LIQUIFIER_SERIALIZER.get();
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList temp = NonNullList.create();
        temp.add(input.ingredient);
        return temp;
    }
}