//
// Ability test
//

import org.scalatest.FunSuite

class AbilitySuite extends FunSuite {
  
  test("adjustment") {
    assert(Ability.St.adjust(1) === -4)
    assert(Ability.St.adjust(2) === -3)
    assert(Ability.St.adjust(3) === -3)
    assert(Ability.St.adjust(4) === -2)
    assert(Ability.St.adjust(5) === -2)
    assert(Ability.St.adjust(6) === -1)
    assert(Ability.St.adjust(7) === -1)
    assert(Ability.St.adjust(8) === -1)
    assert(Ability.St.adjust(9) === 0)
    assert(Ability.St.adjust(10) === 0)
    assert(Ability.St.adjust(11) === 0)
    assert(Ability.St.adjust(12) === 0)
    assert(Ability.St.adjust(13) === 1)
    assert(Ability.St.adjust(14) === 1)
    assert(Ability.St.adjust(15) === 1)
    assert(Ability.St.adjust(16) === 2)
    assert(Ability.St.adjust(17) === 2)
    assert(Ability.St.adjust(18) === 3)
  }

}
