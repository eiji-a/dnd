//
//
//

case class SavingThrowTable {
  val value = (cls: Klass) => (level: Int) => {
    cls match {
      case Klass.Cleric => level match {
	case x if x < 1   => SavingThrowTable.Commons
	case x if x <= 4  => SavingThrowTable.Cleric01
	case x if x <= 8  => SavingThrowTable.Cleric05
	case x if x <= 12 => SavingThrowTable.Cleric09
      }
      case Klass.Fighter => level match {
	case x if x < 1   => SavingThrowTable.Commons
	case x if x <= 3  => SavingThrowTable.Fighter01
	case x if x <= 6  => SavingThrowTable.Fighter04
	case x if x <= 9  => SavingThrowTable.Fighter07
	case x if x <= 12 => SavingThrowTable.Fighter10
      }
      case Klass.Magicuser => level match {
	case x if x < 1   => SavingThrowTable.Commons
	case x if x <= 5  => SavingThrowTable.Magicuser01
	case x if x <= 10 => SavingThrowTable.Magicuser06
      }
      case Klass.Thief => level match {
	case x if x < 1   => SavingThrowTable.Commons
	case x if x <= 4  => SavingThrowTable.Thief01
	case x if x <= 8  => SavingThrowTable.Thief05
	case x if x <= 12 => SavingThrowTable.Thief09
      }
      case Klass.Dwarf => level match {
	case x if x < 1   => SavingThrowTable.Commons
	case x if x <= 3  => SavingThrowTable.Dwarf01
	case x if x <= 6  => SavingThrowTable.Dwarf04
	case x if x <= 9  => SavingThrowTable.Dwarf07
	case x if x <= 10 => SavingThrowTable.Dwarf10
      }
      case Klass.Elf => level match {
	case x if x < 1   => SavingThrowTable.Commons
	case x if x <= 3  => SavingThrowTable.Elf01
	case x if x <= 6  => SavingThrowTable.Elf04
	case x if x <= 9  => SavingThrowTable.Elf07
	case x if x == 10 => SavingThrowTable.Elf10
      }
      case Klass.Harfling => level match {
	case x if x < 1  => SavingThrowTable.Commons
	case x if x <= 3 => SavingThrowTable.Harfling01
	case x if x <= 6 => SavingThrowTable.Harfling04
	case x if x <= 8 => SavingThrowTable.Harfling07
      }
      case Klass.Druid => level match {
	case x if x < 9   => SavingThrowTable.Commons
	case x if x <= 12 => SavingThrowTable.Druid09
      }
      case Klass.Mystic => level match {
	case x if x < 1   => SavingThrowTable.Commons
	case x if x <= 3  => SavingThrowTable.Mystic01
	case x if x <= 6  => SavingThrowTable.Mystic04
	case x if x <= 9  => SavingThrowTable.Mystic07
	case x if x <= 12 => SavingThrowTable.Mystic10
      }
      case _ => SavingThrowTable.Commons
    }
  }

  val valueCleric = value(Klass.Cleric)
  val valueFighter = value(Klass.Fighter)
  val valueMagicuser = value(Klass.Magicuser)
  val valueThief = value(Klass.Thief)
  val valueDwarf = value(Klass.Dwarf)
  val valueElf = value(Klass.Elf)
  val valueHarfling = value(Klass.Harfling)
  val valueDruid = value(Klass.Druid)
  val valueMystic = value(Klass.Mystic)

}

object SavingThrowTable {

  // TABLE

  // Commons
  val Commons = Array(14, 15, 16, 17, 17)

  // Cleric
  val Cleric01 = Array(11, 12, 14, 16, 15)
  val Cleric05 = Array( 9, 10, 12, 14, 13)
  val Cleric09 = Array( 7,  8, 10, 12, 11)

  // Figher
  val Fighter01 = Array(12, 13, 14, 15, 16)
  val Fighter04 = Array(10, 11, 12, 13, 14)
  val Fighter07 = Array( 8,  9, 10, 11, 12)
  val Fighter10 = Array( 6,  7,  8,  9, 10)

  // Magic-User
  val Magicuser01 = Array(13, 14, 13, 16, 15)
  val Magicuser06 = Array(11, 12, 11, 14, 12)

  // Thief
  val Thief01 = Array(13, 14, 13, 16, 15)
  val Thief05 = Array(11, 12, 11, 14, 13)
  val Thief09 = Array( 9, 10,  9, 12, 11)

  // Dwarf
  val Dwarf01 = Array( 8,  9, 10, 13, 12)
  val Dwarf04 = Array( 6,  7,  8, 10,  9)
  val Dwarf07 = Array( 4,  5,  6,  7,  6)
  val Dwarf10 = Array( 2,  3,  4,  4,  3)

  // Elf
  val Elf01 = Array(12, 13, 13, 15, 15)
  val Elf04 = Array( 8, 10, 10, 11, 11)
  val Elf07 = Array( 4,  7,  7,  7,  7)
  val Elf10 = Array( 2,  4,  4,  3,  3)

  // Harfling
  val Harfling01 = Array( 8,  9, 10, 13, 12)
  val Harfling04 = Array( 5,  6,  7,  9,  8)
  val Harfling07 = Array( 2,  3,  4,  5,  4)

  // Druid
  val Druid09 = Array( 7,  8, 10, 12, 11)

  // Mystic
  val Mystic01 = Fighter01
  val Mystic04 = Fighter04
  val Mystic07 = Fighter07
  val Mystic10 = Fighter10


}
