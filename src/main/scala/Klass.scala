//
// Character Class
//

sealed abstract class Klass(name: String) {
  
}

object Klass {

  case object Commons extends Klass("Commons")
  case object Cleric extends Klass("Cleric")
  case object Fighter extends Klass("Fighter")
  case object Magicuser extends Klass("Magic-User")
  case object Thief extends Klass("Thief")
  case object Dwarf extends Klass("Dwarf")
  case object Elf extends Klass("Elf")
  case object Harfling extends Klass("Harfling")
  case object Druid extends Klass("Druid")
  case object Mystic extends Klass("Mystic")

}
