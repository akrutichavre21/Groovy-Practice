/**
 * Created by akruti on 16/6/17.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.File;

class Friend {
    String firstName
    String lastName
    Long phone
    Date birthDate
}

def choice
String contd = "Y"
List<Friend> friendList = []
def file
def number
Boolean wrongNumber = true
Boolean wrongDate = true
Boolean wrongFile = true
String bDate
def fileName
int num = 1
while((contd.equals("y"))||(contd.equals("Y"))) {

    choice = System.console().readLine "Enter your choice? \n1. Enter a Friends details.\n2. Make an Excel File.\n"
    choice = Integer.parseInt(choice)
    wrongNumber = true
    wrongDate = true
    wrongFile = true

    switch (choice) {

        case 1 : Friend friendInstance = new Friend()


                 friendInstance.firstName = System                 }
    .console().readLine "Enter First Name > "
                 friendInstance.lastName = System.console().readLine "Enter Last Name > "

                 while(wrongNumber) {
                     number = System.console().readLine "Enter Phone Number > "
                     if(number.length()!=10) {
                         println "Enter a valid 10 digit number. Try again."
                         wrongNumber = true
                         continue
                     }
                     wrongNumber = false
                     number = Long.parseLong(number)
                     friendInstance.phone = number

                 while (wrongDate) {
                     bDate = System.console().readLine "Enter BirthDate (in DD/MM/YYYY format) > "
                     SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                     dateFormat.setLenient(false);

                     try {
                        dateFormat.parse(bDate.trim());
                     }

                     catch (ParseException pe) {
                         println "You've entered a Wrong Date Format. Please enter in DD/MM/YYYY format"
                         wrongDate = true
                         continue
                     }

                     friendInstance.birthDate = Date.parse('dd/MM/yyyy', bDate)
                     wrongDate = false

                 }

                 friendList.push(friendInstance)
                 break

        case 2 : while(wrongFile) {
                     file = System.console().readLine "Enter the File Name > "
                     fileName = new File("/home/akruti/" + file + ".csv")
                     if (fileName.exists()) {
                            println "File Name already exists."
                            wrongFile = true
                            continue
                     }
                    wrongFile = false
                 }
                num = 1
                fileName.write("Number,First Name,Last Name,Phone Number\n")
                friendList.each { friends ->
                    fileName.append("${num},${friends.firstName},${friends.lastName},${friends.phone}\n")
                    num++
                }



                break

        default: println "YOU HAVE ENTERED A WRONG CHOICE!!!"
    }

    contd = System.console().readLine "Do you wish to Continue? (Y/N)"
}