//
// Item
//

abstract class Item(name: String, enc: Double, cost: Int,
  protected var _amount: Int, private var _owner: Character) {
  require(_amount >= 1)

  def hand(newowner: Character): Character = {
    _owner = newowner
    _owner
  }
  def stock(am: Int): Int = {
    _amount = _amount + am
    _amount
  }
  def use(am: Int = 1): Int = {
    _amount = _amount - am
    _amount
  }
  def owner: Character = _owner
  def amount: Int = _amount
  def weight = enc * _amount
  def value = (unit: Int) => {
    require(unit > 0)
    cost * _amount / unit.toDouble
  }
  def valueGP = value(Item.unitGP)
  
}

object Item {
  val unitCP = 1
  val unitSP = 10
  val unitEP = 50
  val unitGP = 100
  val unitPP = 500
  val valueUnit = unitGP

}
