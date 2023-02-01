fun main() {

   //containsMatchIn() method
   val emailPattern = Regex("@gmail.com")
   val emailAddress = "shivamgupta@gmail.com"
   println(emailPattern.containsMatchIn(emailAddress))

   //Using RegexOption
   val animalPattern = Regex("Lion",RegexOption.IGNORE_CASE)
   val animalName = "I am a lion"
   println(animalPattern.containsMatchIn(animalName))

   

}

/**
 * This function tells whether the given phone number is valid or not
 * @param phoneNumber Phone number string
 * @return whether the phone number is valid or not
 *
 * @sample isValidPhoneNumber("333-212-555") return true
 **/

fun isValidPhoneNumber(phoneNumber: String): Boolean{
   return false
}