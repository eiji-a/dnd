//
// Character
//



case class Character(player: Player, camp: Campaign,
  name: String, sex: String, height: Double, weight: Double, personality: String,
  klass: Klass, ability: Map[Ability, Int]) {

  // INITIALIZE
  // scores
  var experience: Int = 0
  var level: Int = 0
  var cur_level: Int = level
  val hit_point = new Array[Int](36)
  var damage = 0
  // status
  var sleep = false
  var paralysis = false
  var poisoning = false

  override def toString = 
    "Name: " + name + "\n" +
    "Sex: " + sex + "\n" +
    "Height: " + height + "\n" +
    "Weight: " + weight + "\n" +
    "personality: " + personality + "\n"

}

object Character {

  // Sex
  val Nosex = "Nosex"
  val Male = "Male"
  val Femail = "Female"

  // Ability
  val CommonsAbility = Map[Ability, Int](
    Ability.St -> 9,
    Ability.It -> 9,
    Ability.Ws -> 9,
    Ability.Dx -> 9,
    Ability.Co -> 9,
    Ability.Ch -> 9
  )

  val NOBODY = new Character(Player.NP, Campaign.Common,
    "nobody", Nosex, 0, 0, "", Klass.Commons, CommonsAbility)

}
