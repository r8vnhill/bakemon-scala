package cl.uchile.dcc
package bakemon

import munit.FunSuite

class FireBakemonTest extends FunSuite {
  val name = "FireBakemon"
  val hp = 100
  var fireBakemon: FireBakemon = _

  override def beforeEach(context: BeforeEach): Unit = {
    fireBakemon = new FireBakemon(name, hp)
  }

  test("FireBakemon can be created with a name and hit points") {
    assertEquals(new FireBakemon(name, hp), fireBakemon)
  }

  test("The hash code of a FireBakemon is consistent with equals") {
    assertEquals(new FireBakemon(name, hp).##, fireBakemon.##)
  }

  test("FireBakemon can attack other Bakemon") {
    val grassBakemon = new GrassBakemon("GrassBakemon", 100)
    fireBakemon.attack(grassBakemon)
    assertEquals(grassBakemon.hp, 90)
  }
}