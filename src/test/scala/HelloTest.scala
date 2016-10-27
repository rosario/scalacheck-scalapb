package com.example

import org.scalacheck.{Prop, Properties, _}
import Prop.forAll
import Arbitrary.arbitrary

import org.scalacheck.Shapeless._

object HelloTest extends Properties("Hello") {
  implicitly[Arbitrary[SearchRequest]]

  property("increased") = forAll { foo: SearchRequest =>
    val tmp = Hello.increase(foo)
    tmp.pageNumber != foo.pageNumber
    tmp.query == foo.query
  }
}
