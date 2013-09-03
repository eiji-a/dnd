//
// Ability
//

sealed abstract class Ability(name: String) {
  val adjust = (sc: Int) => {
    sc match {
      case 1 => -4
      case 2 => -3
      case 3 => -3
      case 4 => -2
      case 5 => -2
      case 6 => -1
      case 7 => -1
      case 8 => -1
      case 9 =>  0
      case 10 => 0
      case 11 => 0
      case 12 => 0
      case 13 => 1
      case 14 => 1
      case 15 => 1
      case 16 => 2
      case 17 => 2
      case 18 => 3
    }
  }
}

object Ability {

  case object St extends Ability("Strength")
  case object It extends Ability("Intelligence")
  case object Ws extends Ability("Wisdom")
  case object Dx extends Ability("Dexterity")
  case object Co extends Ability("Constitution")
  case object Ch extends Ability("Charisma")

}
