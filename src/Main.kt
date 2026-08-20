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

    //operações (aritmeticas):
    val a: Int = 10
    val b: Double = 2.5
    val resultado = a * b //Double

    val ten = 10
    val three = 3

    println(ten + three) //13   -> soma
    println(ten - three) //7    -> subtração
    println(ten * three) //30   -> multiplicação
    println(ten / three) //3    -> divisão
    println(ten % three) //1    -> porcentagem

    //operações (lógicas):

    /*
    * ==  igual
    * !=  diferente
    * > maior
    * < menor
    * >= maior ou igual
    * <= menor ou igual
    */


    //operações (atribuição):

    /*  faz de forma resumida uma operacção maior
    *
    *   +=  valor atual mais novo valor
    *   -=   valor atual menos um novo valor
    *   *= valor atual multiplicado pelo novo valor
    *   /=    valor atual dividido pelo novo valor
    *   %= resto da divisão atual pelo novo valor
    *
    * ex: var x = 10
    * x += 5 // x = x + 5
    *
    * */

    //operações (logicas):
    //&& E
    // || ou
    // ! not
    nomeDaFuncao()
    mandaSalve("Manoel")
    mensagemParabens(idade = 28, nome = "Manoel")

    fun soma (a: Int, b: Int): Int{
        return a + b
    }
    //ou:
    //fun soma(a: Int, b: Int) = a + b
    //ou (em arrow/lamina):
    // val soma: (Int, Int) -> Int = {a, b -> a + b}

    val result = soma(10,3)
    println(result)

    exibirNota(7)

    val idade2 = 18

//    if (idade2 >= 18){
//        println("Maior de idade!")
//    }else{
//        println("Menor de idade!")
//    }


    val status = if (idade2 >= 18){
        "Maior de idade!"
        "Teste"
        println("Teste3")
    }else{
        "Menor de idade!"
    }

    println(status)

    val idade3 = 20

    //if/else podem ser utilizados como o "ternário" (que é if/else em uma linha)
    //                condicao    ? valorSeTrue : valorSeFalse
    // const result = idade >= 18 ? "Maior": "Menor"
    println(if(idade >= 18) "Maior" else "Menor")

    val dia = 3

    when (dia){
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        else -> println("Dia inválido")
    }

    val nota = 9
    when (nota){
        9,10 -> println("Excelente")
        7,8 -> println("bom")
        6 -> println("Regular")
        else -> println("Reprovado")
    }

    //Trabalhando com when e range
    val nota2 = 4

    when {
        nota2 >= 9 -> println("Excelente")
        nota2 >= 6 -> println("Regular")
        else -> println("Reprovado")
    }

    //TRABALHAR COM DADOS NULOS
    //errado:
    //    var nome: String = "joao"
    //    nome = null

    //CERTO:
    //    var nome: String? = "joao"
    //    nome =  null
    //mas para utilizar a variavel, o compilador nos obriga a realizar uma validação antes
    //    if(nome != null){
    //        println(nome.length)
    //    }
    //OU:

    //    var nome: String? = null
    //    println(nome?.length)


    //COLLECTIONS (Array - avô das collections) -> POUCO UTILIZADO
    var numeros = arrayOf(1,2, 2)

    println(numeros[0]) //1

    numeros[1] = 50
    println(numeros[1]) //50

    //List
    //mantem ordem de inserção dos elementos (acesso por índice)
    //permite repetição
    //n permite alteração (somente leitura)

    var frutas = listOf("Banana","Maçã","Maçã")

    println(frutas[0]) //Banana

    println(frutas.size) //3
    println(frutas.first()) //Banana
    println(frutas.last()) //Laranja
    println(frutas.contains("Maçã")) //true


 //    frutas.add("Limão") //não funciona
//    frutas.remove(2) // não funciona

}

//estrutura de função
fun nomeDaFuncao (){
    println("testando.....")
}

//função com parâmetro
fun mandaSalve (nome: String){
    println("Salve $nome!")
}

//função com um parâmetro pré-definido caso não venha um valor

/*
* fun mandaSalve (nome: String = "mano"){
*   println("Salve $nome!")
* }
*
* aí chama ela na main sem passar parâmetro:
* mandaSalve()
*
* */

fun mensagemParabens(nome: String, idade: Int){
    println("Parabéns $nome pelos $idade anos de vida!")
}


fun exibirNota(nota: Int){
    if(nota >= 9){
        println("Excelente")
    } else if (nota >= 6){
        println("Bom")
    } else {
        println("Reprovado")
    }
}




