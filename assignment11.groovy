/**
 * Assignment 11
 * 1. Create a User Class with variable "firstName" and "lastName"
 * 2. Create list of maps for user data
 * 3. Create a list of User Class Objects
 * 4. Iterate user data list to create user class instance and save in list of user class objects (created in step3)
 * 5. Using list of userclass object print firstName and lastName
 */
class User {
    String firstName
    String lastName

    String setName() {
        println "${firstName}, ${lastName}"
    }
}

def num = System.console().readLine "Enter the number for user > "
List userData = []
List<User> userInstances = []           //this list contains User Type Objects

num = Integer.parseInt(num)


(1..num).each{
    Map map = [:]
    map.firstName = System.console().readLine "Enter the First Name > "
    map.lastName = System.console().readLine "Enter the Last Name > "
    User userInstance = new User(map)
    userInstances.push(userInstance)
}

userInstances.each { userInstance ->
    userInstance.setName()
}
