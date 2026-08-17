//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Comentando uma linha
/*

comentando
um
trecho
maior

 */

fun main() {
    println("Hello World !")

    var altura = 1.80
    altura = 2.0

    // Int é uma classe que possui em si o tipo primitivo int
    // também possui métodos e atributos que podemos acessar e utilizar
    var idade:  Int  = 27
    idade = 28

    val bomDia  = "Bom dia, pessoal!"
    println(bomDia)
    println(bomDia.length)
    println(bomDia.uppercase())
    println(bomDia.contains(other = "pessoal"))

    val nome = "joao"
    println("Bom dia $nome! Logo logo você fará ${idade + 1} anos!")

    val texto = """
        Texto escrito
        em várias linhas
        para teste
    """.trimIndent() //trimIndent tira os espaçamentos

    println(texto)

    val caractere = 'a'
    println(caractere::class.simpleName) //exibe o tipo de dado da variavel

    val bloqueado = false
    println(bloqueado)

    val numero = 5.000
    println(numero)

                    //o underscore separa as casas
    val populacao = 7_000_000_000L //o L deixa explicito que o valor é Long e não um Int
    println(populacao)

    //Float são pontos flutuantes / obrigatório colocar o (F ou f)
    //Representa somente até 5 casas decimais
    val peso: Float = 73.12345F
    println(peso)

    //Double armazena até 64bits
    //É mais preciso do que o float e é padrão para números decimais em kotlin
    //15 casas depois da virgula
    val double = 1.123456789123456

    val x: Int = 10
    val y: Double = x.toDouble() //obrigatório
  //val z: Double = x  //não funciona

    //cast: mudar o formato do dado - ex:transformar um double em int
}