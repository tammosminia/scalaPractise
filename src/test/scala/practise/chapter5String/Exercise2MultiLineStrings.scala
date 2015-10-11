package practise.chapter5String

//Read http://downgra.de/2010/09/14/multi-line_strings_with_scala/
class Exercise2MultiLineStrings extends org.scalatest.FunSuite {
  object Exercise {
  }
  //startAnswer
  object Answer {
    val story: String =
      """bla
        |die
        |bla""".stripMargin
  }
  import Answer._
  //endAnswer

  def countLines(s: String) = s.split("\n").size
  def isLetter(c: Char) = c >= 'A' && c<= 'z'

  test("story") {
    assert(countLines(story) === 3)
  }

  test("lines start with words (not whitespace)") {
    assert(story.split("\n").toList.forall { line => isLetter(line.head) })
  }


}
