

object StringInterpolation {
def main(args: Array[String]) {
val pi = 3.14
val s1 = "Scala string"
val version = 2.12
val s2 = "Scala \tString \nexample"
val s3 = raw"Scala \tString\nExample"
println("value of pi = "+pi)
println(s"value of pi = $pi")
println(s"This is $s1")
println(f"This is $s1%s, scala version is $version%2.2f")
println(s2)
println(s3)
}
}
