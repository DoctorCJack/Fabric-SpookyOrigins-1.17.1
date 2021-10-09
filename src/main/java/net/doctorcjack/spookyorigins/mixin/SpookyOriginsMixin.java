package net.doctorcjack.spookyorigins.mixin;

import net.doctorcjack.spookyorigins.SpookyOrigins;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class SpookyOriginsMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		SpookyOrigins.LOGGER.info("This line is printed by the Spooky Origins mixin!");
	}
}
