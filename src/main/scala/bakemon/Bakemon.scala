package cl.uchile.dcc
package bakemon

/** A trait representing a Bakemon, which can attack other Bakemon.
 *
 * @constructor Create a new Bakemon with the given name and hit points.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @version 1.0
 * @since 1.0
 */
trait Bakemon {
  /** The name of the Bakemon. */
  val name: String
  /** The hit points of the Bakemon. */
  var hp: Int

  /** Attack another Bakemon. */
  def attack(other: Bakemon): Unit
}
