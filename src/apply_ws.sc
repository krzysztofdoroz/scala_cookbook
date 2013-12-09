object apply_ws {

case class Person(val name:String, var age : Int){
	// this only generates contructor for (String, Int)
}

object Person{
		//additional constructors provided by companion object
		def apply(name: String) = new Person(name, 12)
}

val p = Person("aaa")                             //> p  : apply_ws.Person = Person(aaa,12)

}