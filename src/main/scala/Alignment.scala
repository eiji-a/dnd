//
// Alignment
//

sealed abstract class Alignment(name: String) {
  
}

object Alignment {

  case object Law extends Alignment("Law")
  case object Chaos extends Alignment("Chaos")
  case object Neutral extends Alignment("Neutral")

}
