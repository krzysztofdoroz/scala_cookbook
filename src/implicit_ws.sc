object implicit_ws {

implicit class MyRichString (val s : String) {
	def inc = s.map(c => (c + 1).toChar)
}

val str = "abc"                                   //> str  : String = abc

println(str.inc)                                  //> bcd
 
}