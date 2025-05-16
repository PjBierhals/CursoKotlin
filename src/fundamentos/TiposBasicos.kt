package fundamentos

fun main(args: Array<String>) {
    //tipos numerico inteiror
    val num1: Byte= 127;
    val num2: Short = 32767;
    val num3: Int = 2_147_483_647;
    val num4: Long = 9_223_372_036_854_775_807 //Long.MAX_VALUE
    //tipo numéricos reais
    val num5: Float = 3.14F;
    val num6: Double = 6.5;
//tipo caractere
    val char: Char = 'a';
    //tipo booleano
    val boolean: Boolean = true; //false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean));
    println(2 is Int);
    //tudo e objeto no kotlin
}