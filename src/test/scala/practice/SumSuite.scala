package practice

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SumSuite extends FunSuite {
  import Main.sum

  test("sum: 1,2,3") {
    assert(sum(List(1,2,3)) === 6)
  }

  test("sum: 3,3,3") {
    assert(sum(List(3,3,3)) === 9)
  }

  test("sum: 10,30,50,70,90,20,40,60,80") {
    assert(sum(List(10,30,50,70,90,20,40,60,80)) === 450)
  }

  test("sum: 7") {
    assert(sum(List(7)) === 7)
  }

  test("sum: empty") {
    assert(sum(List()) === 0)
  }
}
