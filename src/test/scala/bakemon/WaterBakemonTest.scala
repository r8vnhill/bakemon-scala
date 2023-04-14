package cl.uchile.dcc
package bakemon

import munit.FunSuite

class WaterBakemonTest extends FunSuite {
  val name = "WaterBakemon"
  val hp = 100
  var waterBakemon: WaterBakemon = _

  override def beforeEach(context: BeforeEach): Unit = {
    waterBakemon = new WaterBakemon(name, hp)
  }

  test("WaterBakemon can be created with a name and hit points") {
    assertEquals(new WaterBakemon(name, hp), waterBakemon)
  }

  test("The hash code of a WaterBakemon is consistent with equals") {
    assertEquals(new WaterBakemon(name, hp).##, waterBakemon.##)
  }

  test("WaterBakemon can attack other Bakemon") {
    val grassBakemon = new GrassBakemon("GrassBakemon", 100)
    waterBakemon.attack(grassBakemon)
    assertEquals(grassBakemon.hp, 90)
  }
}
