
package cl.uchile.dcc
package bakemon

/** An abstract class representing a Bakemon with a name and hit points.
 *
 * @constructor Create a new Bakemon with the given name and hit points.
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @version 1.0
 * @since 1.0
 */
abstract class AbstractBakemon(override val name: String, override var hp: Int)
  extends Bakemon
