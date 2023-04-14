package cl.uchile.dcc
package bakemon

import java.util.Objects

/** A GrassBakemon that extends AbstractBakemon and attacks other Bakemon with grass.
 *
 * @constructor Create a new GrassBakemon with the given name and hit points.
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @version 1.0
 * @since 1.0
 */
class GrassBakemon(name: String, hp: Int) extends AbstractBakemon(name, hp) with Equals {

  /// Documentation inherited from [[Bakemon]]
  override def attack(other: Bakemon): Unit = {
    println(s"$name attacks $other with grass!")
    other.hp -= 10
  }

  /// Documentation inherited from [[Equals]]
  override def canEqual(that: Any): Boolean = {
    that.isInstanceOf[GrassBakemon]
  }

  /// Documentation inherited from [[Any]]
  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[GrassBakemon]
      name == other.name && hp == other.hp
    } else {
      false
    }
  }

  /// Documentation inherited from [[Any]]
  override def hashCode: Int = {
    Objects.hash(classOf[GrassBakemon], name, hp)
  }
}
