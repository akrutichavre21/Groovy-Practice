def num = System.console().readLine "Enter the number for user > "
List list = []

num = Integer.parseInt(num)


(1..num).each{
    Map map = [:]
    map.firstName = System.console().readLine "Enter the First Name > "
    map.lastName = System.console().readLine "Enter the Last Name > "
    map.age = System.console().readLine "Enter the Age > "


    list.push(map)
    //map = [:]           // this step is done to make sure all data wont copy same reference
}

println list

list.each{ i ->
    println "First Name : ${i.firstName}, Last Name : ${i.lastName}, Age : ${i.age}"
}