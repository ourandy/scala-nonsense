import scala.annotation.tailrec

object ProblemTwo {

  def penultimateBuiltin[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException
    else ls.init.last

  def penultimateRecursive[A](ls: List[A]): A = ls match {

    case head :: _ :: Nil => head
    case _ :: tail => penultimateRecursive(tail)
    case _ => throw new NoSuchElementException

  }

}

