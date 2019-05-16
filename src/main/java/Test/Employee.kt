package Test

import java.util.HashMap

data class Employee( val firstName: String, val lastName: String, val empId: Int, val salary: Int, var map: Map<String, String>)

fun main() {
    val map = mutableMapOf<String, String>()
    map["anup"] = "kumar"
    val emp = Employee("Ram", "Sham", 21, 235689, map)

    test(emp)
    println(emp)

}

private fun test(emp: Employee) {

    var empMap = emp.map.toMutableMap()
    //empMap.plus(Pair<String, String>("mauni", "maity"))
    empMap["mauni"] = "maity"
    emp.map = empMap

    println(emp)
}