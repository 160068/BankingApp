//create a class with parameters
class Client(val name: String, val surname: String) {


    var clientData : String = ""

    //create operators/logic
    init {
      clientData = "$name $surname"
 }
}

//create an object/instance for the class (probs in a different folder)
//var client1 = Client("Mpho", "Moiloa")

//insert to test the logic


