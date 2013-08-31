//
// Ability
//

sealed abstract class Ability(name: String) {
}

object Ability {

  case object St extends Ability("Strength")
  case object Cn extends Ability("Constitution")
  case object Dx extends Ability("Dexterity")
  case object It extends Ability("Intelligence")
  case object Ws extends Ability("Wisdom")
  case object Ch extends Ability("Charisma")

}
