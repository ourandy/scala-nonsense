object ProblemThree {

  def nth[A](n: Int, ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException
    else ls(n)

  def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => nthRecursive(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

}
