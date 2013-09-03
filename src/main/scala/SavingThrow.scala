//
// Saving Throws
//

sealed abstract class SavingThrow(id: Int, name: String) {

}

object SavingThrow {

  val DrayID = 0
  val WandID = 1
  val ParaID = 2
  val DrgnID = 3
  val SpelID = 4

  case object DRAY extends SavingThrow(DrayID, "Death Ray / Poison")
  case object WAND extends SavingThrow(WandID, "Magic Wand")
  case object PARA extends SavingThrow(ParaID, "Paralysis / Turn to Stone")
  case object DRGN extends SavingThrow(DrgnID, "Dragon Breath")
  case object SPEL extends SavingThrow(SpelID, "Spells / Staff")


}
