//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*val myarr = arrayOf(1..10);
    for (i in 1..10 ) {
       if (i%2 == 0) {
           println(i);
       }

    }
    val myarr2 = arrayOf(-1 ,0,1,2,3,4,20)
    for (i in -1 ..20) {
       when{
            i < 0 -> println("negativr");
        }
    }

     */
    /*  val num: Array<Int> =arrayOf(1,2,3,4,5)
        val nam = arrayOfNulls<Int>(3); //пустой массив
        val i= Array(3){5}; //массив из трех пятерок
        val x=arrayOf(1,2,3,4,5);
        val n =x[1];
        x[2]=7;
        println("x [2]= ${x[2]}");
        for (num1 in x) {
        println("num1 = $num1");
         }
        println(4 in x); //есть ли в массиве 4

        println(2 !in x);//нету в массиве 2

       */
    /*som()
    som1("367")
    displayUser("Tom")
    var nums = intArrayOf(4, 5, 6)
    double(nums)
    println("${nums[0]}")
    printStrings("1", "5", "sdv")

     */
    val num: Array<Int> = arrayOf(1, 2, 3);


    valueMax(3, 6, 7, 9);
}

/*fun som() {
    println("123")
}

fun som1(name: String) {
    println(name)
}

fun displayUser(name: String, age: Int = 18, position: String = "unknown") {
    println("$name, $age");
}

fun double(numbers: IntArray) {
    numbers[0] = numbers[0] * 2;
}

fun printStrings(vararg strings: String) {
    for (str in strings) {
        println(str);
    }
}

fun sum(x: Int, y: Int): Int { //через ":" после обьявления функции пишется тип возвращаемого значения
    return x + y;           // если ничего не писать возвращается воид


}

 */
fun arrSum(s: Array<Int>): Int {
    var sum: Int = 0;
    for (i in s) {
        sum += i;

    }
    println(sum);
    return sum;
}

fun valueMax(vararg value: Int): Int {
    var max = value[0];
    for (m in value) {
        if (max < m) {
            max=m;

        }
    }
    println(max);
    return max;
}