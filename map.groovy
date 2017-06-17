//null map
Map data

//empty map

data = [:]
println data.isEmpty()      //true

//First Example

Map userData = ["firstName": "John", "lastName": "Linen"]
println userData
println userData.firstName

userData = [firstName: "John", lastName: "Linen", age : 35]             //key can be of any class
println userData

println " First name is = ${userData.firstName}, Last Name = ${userData.lastName}, Age = ${userData.Age} "
//age is printed as null because in Map age is defined as key and we are printing userData.Age
