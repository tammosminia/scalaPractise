package practise.chapter3flatmap

import org.scalatest.FunSuite

import scala.util.Try

class Exercise5OptionsAndLists extends FunSuite {
  //Parses an integer. Returns None if it cannot parse.
  def parseInt(s: String): Option[Int] = Try(Some(Integer.parseInt(s))).getOrElse(None)

  object Exercise {
    //hint: flatMap
    def parseInts(input: List[String]): List[Int] = ???
  }
  //startAnswer
  object Answer {
    //hint: flatMap
    def parseInts(input: List[String]): List[Int] = input.flatMap(parseInt)
  }
  import Answer._
  //endAnswer

  test("parseInts - None") {
    assert(parseInts(Nil) === Nil)
  }

  test("parseInts - 1, 2, 3") {
    assert(parseInts(List("1", "2", "3")) === List(1, 2, 3))
  }

  test("parseInts - a, 1, w") {
    assert(parseInts(List("a", "1", "w")) === List(1))
  }


}
