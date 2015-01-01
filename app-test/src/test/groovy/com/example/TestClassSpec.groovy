package com.example

import spock.lang.Specification

class TestClassSpec extends Specification {
  def "should create and return test data"() {
    given:
    def x = new TestClass()

    when:
    def result = x.getString()

    then:
    result == "TEST"
  }
}
