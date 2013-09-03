//
// Money
//

case class Money(override val name: String, override val enc: Double,
  override val cost: Int, override val am: Int,
  override val own: Character = Character.NOBODY) extends Gear(name, enc, cost, am, own) {

}

object Money {

  val CP = new Money("CP", 1, Item.unitCP, 1)
  val SP = new Money("SP", 1, Item.unitSP, 1)
  val EP = new Money("EP", 1, Item.unitEP, 1)
  val GP = new Money("GP", 1, Item.unitGP, 1)
  val PP = new Money("PP", 1, Item.unitPP, 1)

}
