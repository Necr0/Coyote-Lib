package dev.necro.coyotelib.client.debug.overlay.components;

import com.mojang.blaze3d.platform.PlatformDescriptors;
import dev.necro.coyotelib.api.debug.overlay.DebugOverlayTextComponent;
import dev.necro.coyotelib.api.debug.overlay.IDebugOverlayScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.util.NonNullList;

public class CPUDebugComponent extends DebugOverlayTextComponent {

    @Override
    public void addInformation(NonNullList<String> list,
                               Minecraft minecraft,
                               IDebugOverlayScreen debugOverlay) {
        list.add(String.format("CPU: %s", PlatformDescriptors.getCpuInfo()));
    }
}
