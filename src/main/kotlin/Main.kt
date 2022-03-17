fun main() {
    while(true){
        print("\nProject Calculator\n"+
                "\n1- Soma\n2- Subtração\n3- Divisão\n4- Multiplicação " +
                "\nEscolha a operação desejada: ")
        when(readLine()!!.toInt()) {
           1 -> {
               println("\nDigite os números:")
               val num = readLine()!!.toDouble()
               println("+")
               val num2 = readLine()!!.toDouble()
               println(Calculadora.soma(num,num2))
           }
           2 -> {
               println("\nDigite os números:")
               val num = readLine()!!.toDouble()
               println("-")
               val num2 = readLine()!!.toDouble()
               println(Calculadora.sub(num,num2))
           }
           3 -> {
               println("\nDigite os números:")
               val num = readLine()!!.toDouble()
               println("/")
               val num2 = readLine()!!.toDouble()
               println(Calculadora.div(num,num2))
           }
           4 -> {
               println("\nDigite os números:")
               val num = readLine()!!.toDouble()
               println("*")
               val num2 = readLine()!!.toDouble()
               println(Calculadora.mult(num,num2))
           }
       }
   }
}