import scala.annotation.tailrec

object whilst_ws {

 object Whilst {
 	
 	@tailrec
 	def whilst(cond: => Boolean)(codeBlock: => Unit){
 		if (cond) {
 			codeBlock
 			whilst(cond)(codeBlock)
 		}
 	
 	}
 
 }
 
 var i = 0                                        //> i  : Int = 0
 
 Whilst.whilst(i < 5) {
 	i = i + 1
 }
 
 println(i)                                       //> 5
}