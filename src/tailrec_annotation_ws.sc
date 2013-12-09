import scala.annotation.tailrec

object tailrec_annotation_ws {

def fac(n : Int) : Int = {
	if (n == 1) 1
	else
		n * fac(n - 1)
}                                                 //> fac: (n: Int)Int
 
def outer(n : Int, acc : Int) : Int = {

@tailrec def facWithTailRec(n : Int, acc : Int) : Int = {
	if (n == 1) acc
	else facWithTailRec(n - 1, acc * n)
}

facWithTailRec(n, acc)

}                                                 //> outer: (n: Int, acc: Int)Int
 
fac(4)                                            //> res0: Int = 24

outer(4, 1)                                       //> res1: Int = 24
}