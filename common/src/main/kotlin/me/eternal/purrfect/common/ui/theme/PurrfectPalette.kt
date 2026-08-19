package me.eternal.purrfect.common.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

/**
 * Shared NexPatch presentation palette.
 * The navigation, routes and runtime remain unchanged; this is the visual layer.
 */
val PurrfectPalette = PurrfectColorSet(
    id = "NEXPATCH",
    isDark = true,
    backgroundGradient = Brush.verticalGradient(
        listOf(Color(0xFF050505), Color(0xFF090909))
    ),
    panelGradient = Brush.linearGradient(
        listOf(Color(0xFF151515), Color(0xFF0D0D0D))
    ),
    cardOverlay = Brush.linearGradient(
        listOf(Color(0xFF151515).copy(alpha = 0.98f), Color(0xFF0E0E0E).copy(alpha = 0.98f))
    ),
    cardOverlayColor = Color(0xFF101010).copy(alpha = 0.97f),
    glassSurface = Color(0xFF101010).copy(alpha = 0.82f),
    glassBorder = Color.White.copy(alpha = 0.10f),
    glassSpecular = Color.White.copy(alpha = 0.08f),
    blurTint = Color(0xFF050505).copy(alpha = 0.72f),
    refractiveColor = Color(0xFF141414),
    vibrancyFactor = 1.0f,
    refractionIntensity = 0.18f,
    laserBorder = Color(0xFFA6E63F).copy(alpha = 0.22f),
    specularAlpha = 0.08f,
    glowPrimary = Color(0xFFA6E63F),
    glowSecondary = Color(0xFFE8E8E8),
    textPrimary = Color(0xFFF7F7F7),
    textSecondary = Color(0xFFB5B5B5),
    primaryButtonText = Color(0xFF050505),
    iconTint = Color(0xFFF5F5F5)
)
