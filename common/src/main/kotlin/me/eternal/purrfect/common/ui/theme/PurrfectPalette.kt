package me.eternal.purrfect.common.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

/**
 * Shared NexPatch monochrome presentation palette.
 * The navigation, routes and runtime remain unchanged; this is the visual layer.
 */
val PurrfectPalette = PurrfectColorSet(
    id = "NEXPATCH_MONO",
    isDark = true,
    backgroundGradient = Brush.verticalGradient(
        listOf(Color(0xFF030303), Color(0xFF080808))
    ),
    panelGradient = Brush.linearGradient(
        listOf(Color(0xFF151515), Color(0xFF0B0B0B))
    ),
    cardOverlay = Brush.linearGradient(
        listOf(Color(0xFF161616).copy(alpha = 0.98f), Color(0xFF0C0C0C).copy(alpha = 0.98f))
    ),
    cardOverlayColor = Color(0xFF111111).copy(alpha = 0.98f),
    glassSurface = Color(0xFF0D0D0D).copy(alpha = 0.88f),
    glassBorder = Color.White.copy(alpha = 0.10f),
    glassSpecular = Color.White.copy(alpha = 0.07f),
    blurTint = Color(0xFF030303).copy(alpha = 0.78f),
    refractiveColor = Color(0xFF111111),
    vibrancyFactor = 1.0f,
    refractionIntensity = 0.12f,
    laserBorder = Color.White.copy(alpha = 0.14f),
    specularAlpha = 0.07f,
    glowPrimary = Color(0xFFF2F2F2),
    glowSecondary = Color(0xFF8A8A8A),
    textPrimary = Color(0xFFF5F5F5),
    textSecondary = Color(0xFFAAAAAA),
    primaryButtonText = Color(0xFF050505),
    iconTint = Color(0xFFF2F2F2)
)
