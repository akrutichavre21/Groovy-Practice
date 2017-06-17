/**
 * Created by akruti on 15/6/17.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Group {
    String name
    List<Contact> contacts = []
}

class Contact {
    String firstName
    String lastName
    String phone
    Date birthDate
    Date createdAt = new Date()
}


List<Group> groupInstances = []
List groupList = ["OFFICE", "HOME", "GYM", "WORK", "MARKET"]

groupList.each { item ->
    Group groupInstance = new Group()
    groupInstance.name = item
    groupInstances.push(groupInstance)
}

println "The Groups are - \n"
groupInstances.eachWithIndex { group, index ->
    println " ${index+1} ${group.name}"
}

def choice
Map contactMap = [:]
Boolean wrongGroup = true
String groupName
def cont = 'y'
String bDate
Boolean wrongDate = true
int iVal

while(cont.equals("y")||cont.equals("Y")) {

    choice = System.console().readLine"\nWhat you want to do? \n1) Enter a new contact \n2) Print all contacts\n"
    choice = Integer.parseInt(choice)
    wrongGroup = true
    wrongDate = true

    switch (choice) {

        case 1: contactMap.firstName = System.console().readLine "Enter First Name > "
            contactMap.lastName = System.console().readLine "Enter Last Name > "
            contactMap.phone = System.console().readLine "Enter Phone Number > "

            while (wrongDate) {
                bDate = System.console().readLine "Enter BirthDate (in MM/DD/YYYY format) > "

                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                dateFormat.setLenient(false);

                try {
                    dateFormat.parse(bDate.trim());
                }

                catch (ParseException pe) {
                    println "You've entered a Wrong Date Format. Please enter in mm-dd-yyyy format"
                    wrongDate = true
                    continue
                }
                wrongDate = false
            }

            contactMap.birthDate = Date.parse('MM/dd/yyyy', bDate)

            while (wrongGroup) {
                groupName = System.console().readLine "Enter Group Name > "
                groupInstances.eachWithIndex { group, index ->
                    if(group.name.equals(groupName)) {
                        wrongGroup = false
                        iVal = index
                    }
                }

                if(wrongGroup)
                println "You have entered a wrong Group Name. Try Again."

            }

            Contact myContact = new Contact(contactMap)
            groupInstances[iVal].contacts.push(myContact)
            break


        case 2: println "\nThe Groups details - \n"
            groupInstances.eachWithIndex { group, index ->
                println "${index + 1}. Group Name > ${group.name}"
                group.contacts.each { contactName ->
                    println "   Contact Name > ${contactName.firstName} ${contactName.lastName}"
                    println "   Contact Number > ${contactName.phone}"
                    println "   Birth Date > ${contactName.birthDate}"
                    println "   Contact Creation Date  > ${contactName.createdAt}"
                }
                print "\n"
            }
            break

        default: println "WRONG CHOICE!"

    }

    cont = System.console().readLine "Do you want to Continue? (y/n)"
}


