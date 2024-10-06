package proxy.album

import java.awt.Component
import java.awt.Graphics
import java.net.URL

class ImageProxy(
    val url: URL,
    var imageIcon: ImageIcon? = null
) : Icon {
    var retrievalThread: Thread? = null
    var retrieving = false

    override fun getIconWidth(): Int {
        return imageIcon?.getIconWidth() ?: 800
    }

    override fun getIconHeight(): Int {
        return imageIcon?.getIconHeight() ?: 600

    }

    override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
        if (imageIcon != null) {
            imageIcon!!.paintIcon(c, g, x, y)
        } else {
            g.drawString("로딩 중입니다. 기다려주세요...", x + 300, y + 190)
            if (!retrieving) {
                retrieving = true
                retrievalThread = Thread {
                    imageIcon = ImageIcon(url)
                    c.repaint()
                }
                retrievalThread?.start()
            }
        }

    }
}

