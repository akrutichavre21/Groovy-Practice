/**
 * Created by akruti on 13/6/17.
 * using objects and classes
 */


class User {
    String firstName
    String lastName
    String age
    List userList = []

    void pushItemsInList(Map userMap) {
        userList << userMap
    }

    void inputUser() {
        firstName = System.console().readLine "Enter the First Name > "
        lastName = System.console().readLine "Enter the Last Name > "
        age = System.console().readLine "Enter the Age > "
    }

    void createMap() {
        Map userMap = [:]
        userMap.FirstName = firstName
        userMap.LastName = lastName
        userMap.Age = age
        this.pushItemsInList(userMap)
    }

    void showMyList() {
        println userList
    }

}

def num = System.console().readLine "Enter the number for user > "
User user = new User()
num = Integer.parseInt(num)
(1..num).each { userNumber ->
    println "Enter details of ${userNumber} User : "
    user.inputUser()
    user.createMap()
}
user.showMyList()

