package example.test

import org.scalatest.FunSpec
import example.ClassA

class ClassATest extends FunSpec {
  describe("ClassA") {
    it("echoes integers!") {
      val classA = new ClassA
      assert(1 == classA.echo(1))
    }
  }
}
