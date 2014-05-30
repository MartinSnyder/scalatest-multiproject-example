package example.test

import org.scalatest.FunSpec
import example.ClassB

class ClassBTest extends FunSpec {
  describe("ClassB") {
    it("echoes strings!") {
      val classB = new ClassB
      assert("foo" == classB.echo("foo"))
    }
  }
}
