//
// Gear test
//

import org.scalatest.FunSuite

class GearSuite extends FunSuite {

  test("arrow") {
    val otto = new Character(Player.NP, Campaign.Common, "otto",
      Character.Male, 173, 76, "", Klass.Commons, Character.CommonsAbility)
    val chuma = new Character(Player.NP, Campaign.Common, "chuma",
      Character.Male, 161, 45, "", Klass.Commons, Character.CommonsAbility)
    val aichan = new Character(Player.NP, Campaign.Common, "aichan",
      Character.Male, 115, 18, "", Klass.Commons, Character.CommonsAbility)
    val arrow = new Gear("arrow", 0.1, 25, 20, otto)
    assert(arrow.name === "arrow")
    assert(arrow.amount === 20)
    assert(arrow.weight === 2)
    assert(arrow.valueGP === 5)
    assert(arrow.use(2) === 18)
    assert(arrow.use() === 17)
    assert(arrow.amount === 17)
    assert(arrow.weight === 0.1 * 17)
    assert(arrow.valueGP === 25 * 17 / 100.0D)
    assert(arrow.stock(20) === 37)
    assert(arrow.weight === 0.1 * 37)
    assert(arrow.enc === 0.1)
    assert(arrow.cost === 25)
    assert(arrow.owner === otto)
    assert(arrow.hand(chuma) === chuma)
    assert(arrow.owner === chuma)
    val arrow2 = arrow.settle(15, aichan)
    assert(arrow.amount === 22)
    assert(arrow2.amount === 15)
    assert(arrow2.owner === aichan)
    assert(arrow.hashCode === 804906802)
    assert(arrow2.hashCode === 59364459)
  }

}
