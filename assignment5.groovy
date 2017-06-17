//generate a new list from existing list where items multiplied by 5, using each loop.

List a = [1, 2]

List b =[]

//------------------------------------FIRST METHOD-------------------------------------//

a.each{
 b.add(it*5)
}

println b


//------------------------------------SECOND METHOD-------------------------------------//

b = a.collect{ it*5 }
println b