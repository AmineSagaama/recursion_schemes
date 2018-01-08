package com.asagaama.rs

sealed trait Exp

case class IntExp(v: Int) extends Exp

case class SumExp(exp1: Exp, exp2: Exp) extends Exp

case class MultiplyExp(exp1: Exp, exp2: Exp) extends Exp

object Exp1 {

  def evaluate(exp: Exp): Int = exp match {
    case SumExp(exp1, exp2) => evaluate(exp1) + evaluate(exp2)
    case MultiplyExp(exp1, exp2) => evaluate(exp1) * evaluate(exp2)
    case IntExp(v) => v
  }

  def main(args: Array[String]): Unit = {
    val exp0 = SumExp(IntExp(1), IntExp(2))
    val exp1 = MultiplyExp(SumExp(IntExp(1), IntExp(2)), IntExp(3))
    val exp3 = SumExp(MultiplyExp(IntExp(3), IntExp(5)), IntExp(8))

    println(evaluate(exp0))
    println(evaluate(exp1))
    println(evaluate(exp3))
  }

}
