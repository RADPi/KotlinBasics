package com.radpi.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        variablesYConstantes()

//        tiposDeDatos()

//        sentenciaWhen()

//        arrays()

//        maps()

//        loops()

//        nullSafety()

//        funciones()

        classes()
    }

    private fun classes() {
        val radpi = Programmer("Rafa", 51, arrayOf(Programmer.Language.JAVA, Programmer.Language.KOTLIN))
        println(radpi.name)
//        radpi.name = "Pepe" // No se puede pq es constante (val)
        radpi.age = 50
        println(radpi.age)

        radpi.code()

        val pepe = Programmer("Pepe", 52, arrayOf(Programmer.Language.JAVASCRIPT, Programmer.Language.TYPESCRIPT), arrayOf(radpi))
        println("${pepe.friends?.first()?.name} es amigo de ${pepe.name}")

    }

    private fun funciones() {
        sayHello()
        sayMyName("Rafa")
        sayMyNameAndAge("Rafa", 51)
        println(sumTwoNumbers(1,2))
    }

    private fun sumTwoNumbers(first: Int, second: Int): Int {
        return first + second
    }

    private fun sayMyName(name: String) {
        println("Hola, mi nombre es $name")
    }

    private fun sayMyNameAndAge(name: String, age: Int) {
        println("Hola, mi nombre es $name, y tengo $age años" )
    }

    private fun sayHello() {
        println("Hola")
    }




    private fun nullSafety() {
        var myString = "RADPi"
//        myString = null Esto daría un error de compilación
        println(myString)

        var mySafetyString: String? = "nullSafety"
        mySafetyString=null
        println(mySafetyString)
//        println(mySafetyString.length) // Da error
        println(mySafetyString?.length)

        println("-----")
        mySafetyString="Nuevo valor"
        println(mySafetyString)
        println(mySafetyString?.length)

        // Safe call
        mySafetyString?.let {
            println(it)
        } ?: run {
            println(mySafetyString)
        }

    }

    private fun loops() {
        val myArray: List<String> = listOf("Pepe", "Argento", "Moni")
        val myMap: MutableMap<String, Int> = mutableMapOf("Pepe" to 1, "Argento" to 2, "Moni" to 3)

        for(myString in myArray){
            println(myString)
        }

        for(myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10) println(x)
        println("-----")

        for (x in 11 until 20) println(x)
        println("-----")

        for (x in 22 until 40 step 2) println(x)
        println("-----")

        for (x in 39 downTo 21 step 3) println(x)
        println("-----")

        val myNumericArray = (0..20 step 2)
        for(myNum in myNumericArray) println(myNum)
        println("-----")

        var x = 0

        while (x<10) println(x++)

    }

    private fun maps() {
        var myMap: Map<String, Int> = mapOf()
        println(myMap)

        myMap = mutableMapOf("Pepe" to 1, "Argento" to 2)
        println(myMap)

        myMap["Moni"] = 7
        myMap.put("Ana", 8)
        println(myMap)
        println(myMap["Ana"])

        myMap.remove("Ana")
        println(myMap)

    }

    private fun arrays() {
        val name = "Pepe"
        val surName = "Argento"
        val company = "DevFactory"
        val age = "32"

        val myArray = arrayListOf<String>()

        myArray.add(name)
        myArray.add(surName)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        myArray.addAll(listOf("Nuevos", "Datos"))
        println(myArray)
        println(myArray[0])
        println(myArray[1])
        println(myArray[2])

        myArray[3] = "33"
        println(myArray[3])

        myArray.removeAt(4)
        println(myArray)

        myArray.forEach{
            println(it)
        }

        println(myArray.count())
        myArray.clear()
        println(myArray.count())


    }

    private fun sentenciaWhen() {
        // When con String
        val country = "Argentina"

        when (country) {
            "España", "Argentina" -> println("El idioma es español")
            "EEUU" -> println("El idioma es inglés")
            else -> println("No reconocido")

        }

        // When con Int
        val age = 10

        when (age){
            0,1,2 -> println("Eres un Bebe")
            in 3..10 -> println("Eres un niño")
            in 11..17 -> println("Eres un adolecente")
            in 18..69 -> println("Eres un anciano")
            else -> println("?")
        }
    }

    private fun tiposDeDatos() {
        // String
        val myString: String = "Hola"
        val myString2 = "Pepe"
        val myString3 = "$myString $myString2"
        println(myString3)

        // Enteros (Byte, Short, Int, Long)
        val myInt : Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimales (Float, Double)
        val myFloat: Float = 1.5f
        val myDouble: Double = 1.5
        val myDouble2 = 2.5
        val myDouble3 = 3
        val myDoubleTotal = myDouble + myDouble2 + myDouble3
        println(myDoubleTotal)

        // Boolean (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        println(myBool == myBool2)


    }

    /*
        Comentarios
     */
    private fun variablesYConstantes (){
        // Variables

        var myFirstVariable = "Hello Pepe!"
        var myFirstNumber = 1

        println(myFirstVariable)

        myFirstVariable = "Saraza!"
        println(myFirstVariable)
        println(myFirstNumber)

        var mySecondVariable = "Suscribete"

        // Constantes

        val myFirstConstant = "No me pueden cambiar"
        println(myFirstConstant)

    }
}