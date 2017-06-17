/**
 * Created by akruti on 13/6/17.
 */

def num = System.console().readLine "Enter the number for user > "
List list1 = []
List list2 = []
List list3 = []

num = Integer.parseInt(num)
Map map = [:]

(1..num).each{
    firstName = System.console().readLine "Enter the First Name > "
    lastName = System.console().readLine "Enter the Last Name > "
    age = System.console().readLine "Enter the Age > "

    list1 << firstName
    list2 << lastName
    list3 << age

}

map["fName"] = list1
map["lName"] = list2
map["Age"] = list3
println map

def lm = []
map.each{ k, values ->
    [values].flatten().eachWithIndex { value, index ->
        lm[index] = lm[index] ?: [:]
        lm[index][k] = value
    }
}

lm.each { i ->
    println "First Name : ${i.fName}, Last Name : ${i.lName}, Age : ${i.Age}"
}