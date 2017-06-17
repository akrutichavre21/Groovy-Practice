List userNames = ["John", "Hulk"]

println userNames[0]

//There are three options to add items in the list

userNames.add("Donald")         //option 1
userNames.push("Iron Man")      //option 2
userNames << "Captian America"  //option 3

println userNames

//Inserting item at a specific index

userNames.add(1, "Robin")               //pushesh rest of the list. size++
userNames.putAt(1, "Batman")            //particular index me replace karega, size remains same

println userNames

//Get the value of a specific index

println "size = ${userNames.size()}"
println userNames[4]
println userNames[-1]       //captian america
println userNames[7]        //null
//println userNames[-7]       //error
//println userNames.get(7)   //error
println userNames.get(3)

println userNames.isEmpty()             //false

//To remove values of list and save it into new list

List newList = userNames.minus(["John"])
println newList

//creating new list with adding items into existing one

List ratings = [1, 2, 3, 4, 5, 6, 7]
List plusList = ratings.plus(8)
println plusList
plusList = ratings + 9
println plusList
plusList = ratings + 10
println plusList


//pop an element from the list

println "element = ${ratings.pop()}"
println "new list = ${ratings}"

println "remove element = ${ratings.remove(4)}"
println "new list = ${ratings}"

println ratings.reverse()
println "No updation in the actual list= ${ratings}"

def newListReverse = ratings.reverse()
print(newListReverse)

List unSorted = [3, 4, 9, 1, 5]
println unSorted.sort()         //ascending order
println unSorted.sort{-it}      //takes closure as argument and sort in descending order
