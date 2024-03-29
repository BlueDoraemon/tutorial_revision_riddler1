package cosc250.firststeps

class TestSuite extends munit.FunSuite {

  test("rotate should correctly rotate the list to the right by the specified number of elements") {
    val list = List(1, 2, 3, 4, 5)
    val expected = List(4, 5, 1, 2, 3)
    val result = rotate(2, list)
    assertEquals(result, expected)
  }


}