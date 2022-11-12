package pointLine

open class Line(private var _point1 : Point, private var _point2 : Point) {

    var point1
        get() = _point1
        set(value){ _point1 = value}
    var point2
        get() = _point2
        set(value){ _point2 = value}

    override fun toString(): String {
        return "(x1, y1) = $point1, (x2, y2) = $point2"
    }


}