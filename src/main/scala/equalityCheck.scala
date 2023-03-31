package com.knoldus
import scala.util.{Failure, Success, Try}

object equalityCheck extends App {
  // create the instances of the case class
  val studentOne = Student("Shrasti", 21, "BTech")
  val studentTwo = Student("Reetesh", 23, "Btech")
  val studentThree = Student("Shrasti", 21, "BTech")

  // check using equals method
  val resultOne = Try(studentOne.equals(studentTwo)) match {
    case Success(result) => println(result)
    case Failure(exception) => false
  }
  val resultTwo = Try(studentOne.equals(studentThree)) match {
    case Success(result) => println(result)
    case Failure(exception) => false
  }

  // check using == operator
  val resultThree = Try(studentOne == studentTwo) match {
    case Success(result) => println(result)
    case Failure(exception) => false
  }
  val resultFour = Try(studentOne == studentThree) match {
    case Success(result) => println(result)
    case Failure(exception) => false
  }

  // check using != opertor
  val resultFive = Try(studentOne != studentTwo) match {
    case Success(result) => println(result)
    case Failure(exception) => false
  }
  val resultSix = Try(studentOne != studentThree) match {
    case Success(result) => println(result)
    case Failure(exception) => false
  }

  // check using ne method
  val resultSeven = Try(studentOne.ne(studentTwo)) match {
    case Success(result) => println(result)
    case Failure(exception) => false
  }
  val resultEight = Try(studentOne.ne(studentThree)) match {
    case Success(result) => println(result)
    case Failure(exception) => false
  }

  // using eq method
  val resultNine = Try(studentOne.eq(studentTwo)) match {
    case Success(result) => println(result)
    case Failure(exception) => false
  }
  val resultTen = Try(studentOne.eq(studentThree)) match {
    case Success(result) => println(result)
    case Failure(exception) => false
  }
}

case class Student(name: String, rollNo: Int, department: String)

