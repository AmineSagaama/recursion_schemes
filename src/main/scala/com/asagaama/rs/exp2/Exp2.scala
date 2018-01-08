package com.asagaama.rs

import matryoshka._, Recursive.ops._
import scalaz._
import Scalaz._

sealed trait Exp[A]

case class IntExp[A](v: Int) extends Exp[A]

case class SumExp[A](exp1: A, exp2: A) extends Exp[A]

object Exp2 {

}
