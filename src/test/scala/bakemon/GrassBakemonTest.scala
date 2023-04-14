package cl.uchile.dcc
package bakemon

import munit.FunSuite

class GrassBakemonTest extends FunSuite {
val name = "GrassBakemon"
  val hp = 100
  var grassBakemon: GrassBakemon = _

  override def beforeEach(context: BeforeEach): Unit = {
    grassBakemon = new GrassBakemon(name, hp)
  }

  test("GrassBakemon can be created with a name and hit points") {
    assertEquals(new GrassBakemon(name, hp), grassBakemon)
  }

  test("The hash code of a GrassBakemon is consistent with equals") {
    assertEquals(new GrassBakemon(name, hp).##, grassBakemon.##)
  }

  test("GrassBakemon can attack other Bakemon") {
    val waterBakemon = new WaterBakemon("WaterBakemon", 100)
    grassBakemon.attack(waterBakemon)
    assertEquals(waterBakemon.hp, 90)
  }
}