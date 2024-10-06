package proxy.album

import java.awt.Component
import java.awt.Graphics
import java.net.URL
import kotlin.properties.Delegates

class ImageIcon(
    val url: URL,
) : Icon {
    private var iconHeight by Delegates.notNull<Int>()
    private var iconWidth by Delegates.notNull<Int>()

    override fun getIconWidth(): Int {
        TODO("Not yet implemented")
    }

    override fun getIconHeight(): Int {
        TODO("Not yet implemented")
    }

    override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
        TODO("Not yet implemented")
    }
}