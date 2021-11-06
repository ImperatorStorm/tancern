package tancern.tancern.mixin;

import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MathHelper.class)
public class tancern {
    @Inject(method = "sin", at=@At("HEAD"), cancellable = true)
    private static void sin(float value, CallbackInfoReturnable cir) {
        cir.setReturnValue((float)Math.tan(value));
    }
    @Inject(method = "cos", at=@At("HEAD"), cancellable = true)
    private static void cos(float value, CallbackInfoReturnable cir) {
        cir.setReturnValue((float)Math.tan(value));
    }
}
