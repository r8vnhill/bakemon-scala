package cl.uchile.dcc
package bakemon

import munit.FunSuite

class BakemonTest extends FunSuite {
  val name = "Bakemon"
  var bakemon: Bakemon = _
  override def beforeEach(context: BeforeEach): Unit = {
    bakemon = new Bakemon(name)
  }
  test("A Bakemon can be created with a name") {
    assertEquals(bakemon.name, name)
  }
}
