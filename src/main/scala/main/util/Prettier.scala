package util

import swam.syntax.Inst
import swam.syntax.i32.{Const, Add}

class Appender {
  val sb = new StringBuilder 
  override def toString = sb.toString
  def ~(s: String): Appender = { sb ++= s; this} 
  def ~~(s: String): Appender = { sb ++= "\n"; sb ++= s; this }
  def ~(instr: Inst): Appender =
    instr match {
      case Const(v) => this ~~ v.toString
      case Add => this ~~ "i32.add" 
      case _ => ???
    } 
}

