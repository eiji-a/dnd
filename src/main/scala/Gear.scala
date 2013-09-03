//
// Gear
//

case class Gear(name: String, enc: Double, cost: Int, am: Int = 1, own: Character = Character.NOBODY) extends Item(name, enc, cost, am, own) {

  def settle(am: Int, newowner: Character): Gear = {
    require(am < _amount)
    this.use(am)
    new Gear(this.name, this.enc, this.cost, am, newowner)
  }
  
   
}

