object calling_methods_from_traits_ws {


trait Human {
	def hello = "human trait"
}

trait Mother extends Human{
	override def hello = "mother trait"
}

trait Father extends Human{
	override def hello = "father trait"
}

class Child extends Human with Mother with Father{
	def printSuper = super.hello
	def printMother = super[Mother].hello
	def printFather = super[Father].hello
}

val c = new Child()                               //> c  : calling_methods_from_traits_ws.Child = calling_methods_from_traits_ws$C
                                                  //| hild@7722306c
c.printFather                                     //> res0: String = father trait


}