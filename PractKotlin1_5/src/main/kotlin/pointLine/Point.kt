package pointLine

open class Point (private var _x : Int, private var _y: Int) {

    var x
        get() = _x
        set(value) {_x = value}
    var y
        get() = _y
        set(value) {_y = value}

    override fun toString(): String {
        return "($x;$y)"
    }
}


