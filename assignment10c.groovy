/**
 * Created by akruti on 13/6/17.
 */
class User {
    String firstName
    String lastName
    String age
    List l1 = []
    List l2 = []
    List l3 = []

    void inputUser() {
        firstName = System.console().readLine "Enter the First Name > "
        lastName = System.console().readLine "Enter the Last Name > "
        age = System.console().readLine "Enter the Age > "
        this.listEntry()
    }

    void listEntry() {
        l1 << firstName
        l2 << lastName
        l3 << age
    }

    void mapEntry() {
        Map userMap = [:]
        userMap["FirstName"] = l1
        userMap["LastName"] = l2
        userMap["Age"] = l3

        println userMap
    }

}

def num = System.console().readLine "Enter the number for user > "
User user = new User()
num = Integer.parseInt(num)
(1..num).each { userNumber ->
    println "Enter details of ${userNumber} User : "
    user.inputUser()
}
user.mapEntry()