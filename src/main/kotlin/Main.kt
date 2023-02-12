// 함수
fun print10Numbers() {
    for(i in 1..10) {
        println(i)
    }
}
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// class
//class Person (var name: String, val birthYear:Int)
class Person (var name: String, val birthYear:Int) {
    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}

fun main() {
    // class
    var a = Person("이름1", 1997)
    a.introduce()

    // lambda
    val lambdaList = listOf("kotlin", "is", "fun")
    val count = lambdaList.count {currentString -> currentString.length == 3 }
    println(count)

    // try catch
    val number = readLine() ?: "0"
    val parsedNumber = try {
        number.toInt()
    } catch(e: Exception) {
        0
    }
    println(parsedNumber)

    // class
    val dog = Animal("Dog")

    // function
    print10Numbers()
    isEven(10)

    // 입력
    val number1 = readLine()
    val number2 = readLine()
    var numberResult = number1!!.toInt() + number2!!.toInt();
    println(numberResult)

    val string1 = readLine()
    val string2 = readLine()
    var stringResult = "$string1 $string2"
    println(stringResult)

    // list vs mutableList
    val list = listOf<Int>(1, 2, 3)
    // list.add(4) 불변이기 때문에 오류
    val mutableList = mutableListOf<Int>(1, 2, 3)
    mutableList.add(4)
    // val convertMutableListData = list.toMutableList()

    // while
    val shoppingList = listOf<String>("item1", "item2", "item3")
    var counter = 0
    while(counter < shoppingList.size) {
     println(shoppingList[counter])
     counter++
    }

    // for
    for (shoppingItem in shoppingList) {
        println(shoppingItem)
    }
    for (i in 1..100) {
        println(i)
    }

    // when
    val x = 1
    when(x) {
        in 1..2 -> println("x is between 1 and 2")
        in 3..10 -> println("x is between 3 and 10")
        else -> {
            println("x is not in the range of 1 to 10")
        }
    }
}