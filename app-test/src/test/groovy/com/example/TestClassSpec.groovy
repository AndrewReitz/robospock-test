package com.example

import spock.lang.Specification;

class TestClassSpec extends Specification {
  def "should create and return test data"() {
    given:
    def x = new TestClass()
    def y = Mock()

    when:
    x.testStuff().subscribe(y)

    then:
    1 * y.call("Some Tests Data")
  }
}
