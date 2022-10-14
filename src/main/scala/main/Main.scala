package example

import swam.syntax.{i32, i64, Expr}
import util.Appender


object Main extends App {
  val const2 = i32.Const(2)
  val const3 = i32.Const(3)
  val add = i32.Add
  val e: Expr = Vector(const2, const3, add)

  val app = new Appender 
  app ~ const2 ~ const3 ~ add
  println(app.toString)
}

