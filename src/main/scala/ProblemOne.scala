class ProblemOne {

  def findLastElement[A](m: List[A]): A = m.last

  def lastRecursive[A](m: List[A]): A = m match {
    case head :: Nil => head
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}

object ProblemOne {

  def apply() = new ProblemOne

}

