package com.knoldus
import org.scalatest.funsuite.AnyFunSuite
class EqualityCheckSpecTest extends AnyFunSuite{
  val studentOne = Student("Shrasti", 21, "BTech")
  val studentTwo = Student("Reetesh", 23, "Btech")
  val studentThree = Student("Shrasti", 21, "BTech")
  test("Test for equals method"){
    assert(studentOne.equals(studentThree))
  }

  test("Test for equals method - unequal") {
    assert(!studentOne.equals(studentTwo))
  }

  test("Test for == operator ") {
    assert(studentOne == studentThree)
  }

  test("Test for != operator ") {
    assert(studentOne != studentTwo)
  }

  test("Test for ne method ") {
    assert(studentOne.ne(studentThree))
  }

  test("Another Test for ne method"){
    assert(studentOne.ne(studentTwo))
  }

  test("Test for eq method ") {
    assert(!studentOne.eq(studentTwo))
  }

  test("Another test for eq method"){
    assert(!studentOne.eq(studentThree))
  }
}
