import pointLine.ColoredPoint
import pointLine.Line
import pointLine.Point

fun main(args: Array<String>) {

    val point : Point = Point(4,5)
    val point2 : Point = Point(2,5)
    val line : Line = Line(point, point2)
    val coloredPoint : ColoredPoint = ColoredPoint(4,5,"blue")
        println(point)
        println(line)
        println(coloredPoint)
}