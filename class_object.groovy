/**
 * Created by akruti on 14/6/17.
 */
class User {
    String firstName
    String lastName
    String email
    int age
}

//User userInstance = new User([firstName : "Iron"], [lastName : "Iron"], [age : "Iron"])
//User userInstance = new User([firstname : "Iron"])     ERROR
//In groovy by default parametrised constructors are there in which argument is passed with Map
// When an object is created, default constructor is called.
// Instance variable are initialised with the default values basede on data type



// as keyword

Map userData = [firstName: "Iron", lastName: "Man", email:"abc@gmail.com", age: 20]
User userInstance = userData as User

println userInstance.firstName
println userInstance.lastName
println userInstance.email
println userInstance.age