//
// Dice
//

import scala.util.Random
import scala.compat.Platform

sealed abstract class Dice(face: Int) {

  val roll = (times: Int) => (adjust: Int) => () => {
    (1 to times).map(i => Dice.rd.nextInt(face) + 1).sum + adjust
  }
}

object Dice {
  val rd = new Random(Platform.currentTime)
  val list = Map(
    4 -> D4, 6 -> D6, 8 -> D8, 10 -> D10, 12 -> D12, 20 -> D20, 100 -> D100
  )

  case object D2 extends Dice(2)
  case object D4 extends Dice(4)
  case object D6 extends Dice(6)
  case object D8 extends Dice(8)
  case object D10 extends Dice(10)
  case object D12 extends Dice(12)
  case object D20 extends Dice(20)
  case object D100 extends Dice(100)

}
