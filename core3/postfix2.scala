// Shunting Yard Algorithm 
// including Associativity for Operators 
// =====================================

object C3b {


// type of tokens
type Toks = List[String]

// helper function for splitting strings into tokens
def split(s: String) : Toks = s.split(" ").toList

// left- and right-associativity
abstract class Assoc
case object LA extends Assoc
case object RA extends Assoc


// power is right-associative,
// everything else is left-associative
def assoc(s: String) : Assoc = s match {
  case "^" => RA
  case _ => LA
}


// the precedences of the operators
val precs = Map("+" -> 1,
  		"-" -> 1,
		"*" -> 2,
		"/" -> 2,
                "^" -> 4)

// the operations in the basic version of the algorithm
val ops = List("+", "-", "*", "/", "^")

// ADD YOUR CODE BELOW
//======================



// (3) 
def syard(toks: Toks, st: Toks = Nil, out: Toks = Nil) : Toks = ???


// test cases
// syard(split("3 + 4 * 8 / ( 5 - 1 ) ^ 2 ^ 3"))  // 3 4 8 * 5 1 - 2 3 ^ ^ / +


// (4)
def compute(toks: Toks, st: List[Int] = Nil) : Int = ???


// test cases
// compute(syard(split("3 + 4 * ( 2 - 1 )")))   // 7
// compute(syard(split("10 + 12 * 33")))       // 406
// compute(syard(split("( 5 + 7 ) * 2")))      // 24
// compute(syard(split("5 + 7 / 2")))          // 8
// compute(syard(split("5 * 7 / 2")))          // 17
// compute(syard(split("9 + 24 / ( 7 - 3 )"))) // 15
// compute(syard(split("4 ^ 3 ^ 2")))      // 262144
// compute(syard(split("4 ^ ( 3 ^ 2 )")))  // 262144
// compute(syard(split("( 4 ^ 3 ) ^ 2")))  // 4096
// compute(syard(split("( 3 + 1 ) ^ 2 ^ 3")))   // 65536

}
