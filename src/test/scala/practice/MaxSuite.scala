package practice

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MaxSuite extends FunSuite {
  import Main.max

  test("max: 1,2,3") {
    assert(max(List(1,2,3)) === 3)
  }

  test("max: 1,3,2") {
    assert(max(List(1,3,2)) === 3)
  }

  test("max: 3,1,2") {
    assert(max(List(3,1,2)) === 3)
  }

  test("max: 3,3,3") {
    assert(max(List(3,3,3)) === 3)
  }

  test("max: 10,30,50,70,90,20,40,60,80") {
    assert(max(List(10,30,50,70,90,20,40,60,80)) === 90)
  }

  test("max: 7") {
    assert(max(List(7)) === 7)
  }

  test("max: empty") {
    assert(max(List()) === 0)
  }
}
