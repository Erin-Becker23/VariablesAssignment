fun main(){
    var int: Int = 10
    var long: Long = 12345L
    var float: Float = 23.18766F
    var double: Double = 5678.4231
    var boolean: Boolean = false
    var char: Char = 'e'
    var byte: Byte = 1

var multiline = """
    Int: $int
    Long: $long
    Float: $float
    Double $double
    Boolean: $boolean
    Char: $char
    Byte: $byte 
""".trimIndent()

    print(multiline)
}