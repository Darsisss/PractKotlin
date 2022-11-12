package pointLine

class ColoredPoint(x : Int, y : Int, private var _color : String) : Point(x, y) {
    var color
        get() = _color
        set(value) {_color = value}

    override fun toString(): String {
        return super.toString() + " color : $color"
    }
}