package proxy.album

import java.awt.Component
import java.awt.Graphics

interface Icon {
    fun getIconWidth(): Int
    fun getIconHeight(): Int
    fun paintIcon(c: Component, g: Graphics, x: Int, y: Int)
}