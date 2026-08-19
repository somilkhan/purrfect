package me.eternal.purrfect.ui.manager.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

/**
 * NexPatch visual foundation.
 *
 * The existing screen/navigation architecture stays intact; this palette is the
 * presentation layer used to give every existing screen a consistent compact,
 * monochrome treatment.
 */
object PurrfectPalette {
    // Core surfaces: near-black rather than tinted/dark-purple backgrounds.
    val background = Color(0xFF050505)
    val backgroundElevated = Color(0xFF0A0A0A)
    val surface = Color(0xFF101010)
    val surfaceElevated = Color(0xFF151515)
    val surfacePressed = Color(0xFF1B1B1B)

    // Hairline borders and subdued chrome.
    val border = Color(0xFF242424)
    val borderStrong = Color(0xFF303030)

    // Typography / icon hierarchy.
    val iconTint = Color(0xFFF5F5F5)
    val textPrimary = Color(0xFFF7F7F7)
    val textSecondary = Color(0xFFB5B5B5)
    val textTertiary = Color(0xFF777777)

    // Reserved brand signal. Keep it small; the UI remains predominantly monochrome.
    val brandGreen = Color(0xFFA6E63F)
    val brandGreenMuted = Color(0xFF7EAF30)

    // Compatibility aliases used by existing screens while they are migrated.
    val glowPrimary = brandGreen
    val glowSecondary = Color(0xFFE8E8E8)
    val cardOverlayColor = surface.copy(alpha = 0.96f)

    // Subtle surfaces; avoid the old purple luxury treatment.
    val backgroundGradient = Brush.verticalGradient(
        listOf(background, backgroundElevated)
    )

    val panelGradient = Brush.linearGradient(
        listOf(surfaceElevated, surface)
    )

    val cardOverlay = Brush.linearGradient(
        listOf(
            surfaceElevated.copy(alpha = 0.98f),
            surface.copy(alpha = 0.98f)
        )
    )
}
