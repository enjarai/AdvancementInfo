/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.guntram.mcmod.advancementinfo.accessors;

import net.minecraft.advancement.AdvancementProgress;
import net.minecraft.advancement.PlacedAdvancement;

/**
 *
 * @author gbl
 */
public interface AdvancementWidgetAccessor {
    public AdvancementProgress getProgress();

    public PlacedAdvancement getAdvancement();
}
