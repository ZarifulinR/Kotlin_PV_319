
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main()= runBlocking {
    /*  val job =scope.launch {
       repeat(10){
           delay(1000L)
           println(it)
       }
   }
  */
    launch {
        repeat(5) {
            println("Работаю в корутине")
            delay(200)

        }
    }
   repeat(5) {
       println("Работаю в майн")
       delay(200)
   }
    var asyncCor = async {
        println("Start math")
        delay(1000)
        10
    }
    println("Start")
    val result = asyncCor.await()
    println("end ${result}");
}




   /*println("Hello World!")
   val a =async {
       loadA()
   }
   val b = async {
       loadB()
   }
   val c = a.await() + b.await()
   println(c);
}
suspend fun loadA(): Int{
   delay(1000L)
   return 10
}
suspend fun loadB(): Int{
   delay(1000L)
   return 20

    */





