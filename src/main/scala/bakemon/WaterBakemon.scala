package cl.uchile.dcc
package bakemon

import java.util.Objects

/** A WaterBakemon that extends AbstractBakemon and attacks other Bakemon with water.
 *
 * @constructor Create a new WaterBakemon with the given name and hit points.
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @version 1.0
 * @since 1.0
 */
class WaterBakemon(name: String, hp: Int) extends AbstractBakemon(name, hp) with Equals {

  /// Documentation inherited from [[Bakemon]]
  override def attack(other: Bakemon): Unit = {
    println(s"$name attacks $other with water!")
    other.hp -= 10
  }

  /// Documentation inherited from [[Equals]]
  override def canEqual(that: Any): Boolean = that.isInstanceOf[WaterBakemon]

  /// Documentation inherited from [[Any]]
  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[WaterBakemon]
      name == other.name && hp == other.hp
    } else {
      false
    }
  }

  /// Documentation inherited from [[Any]]
  override def hashCode: Int = {
    Objects.hash(classOf[WaterBakemon], name, hp)
  }
}
