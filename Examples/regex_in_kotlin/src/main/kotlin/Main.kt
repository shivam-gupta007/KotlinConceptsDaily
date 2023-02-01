fun main() {

   //containsMatchIn() method
   val emailPattern = Regex("@gmail.com")
   val emailAddress = "shivamgupta@gmail.com"
   println(emailPattern.containsMatchIn(emailAddress))

   //Using RegexOption
   val animalPattern = Regex("LION",RegexOption.IGNORE_CASE)
   val animalName = "I am a lion"
   println(animalPattern.containsMatchIn(animalName))

   //Using Character class
   val pattern = Regex("^[aieou]",RegexOption.IGNORE_CASE)
   val fruitName = "Apple"
   println(fruitName.matches(pattern))

   println(isValidPhoneNumber(phoneNumber = "11-222-3353"))
}

fun isValidPhoneNumber(phoneNumber: String): Boolean{
    val phoneNumberPattern = Regex("\\d{2}-\\d{3}-\\d{4}")
    return phoneNumber.matches(phoneNumberPattern)
}