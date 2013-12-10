object partial_function_ws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

val div = new PartialFunction[Int,Int]{
	val CONST = 123

	def apply(a : Int) = CONST / a
	def isDefinedAt(x : Int) = x != 0
}                                                 //> div  : PartialFunction[Int,Int]{val CONST: Int} = <function1>

div(12)                                           //> res0: Int = 10
if(div.isDefinedAt(0)) div(0)                     //> res1: AnyVal = ()

val add = new PartialFunction[Int,Int]{
	val CONST = 123

	def apply(a : Int) = CONST + a
	def isDefinedAt(x : Int) = true
}                                                 //> add  : PartialFunction[Int,Int]{val CONST: Int} = <function1>

val divOrAdd = div orElse add                     //> divOrAdd  : PartialFunction[Int,Int] = <function1>

divOrAdd(0)                                       //> res2: Int = 123

val divAndAdd = div andThen add                   //> divAndAdd  : PartialFunction[Int,Int] = <function1>

divAndAdd(10)                                     //> res3: Int = 135

}