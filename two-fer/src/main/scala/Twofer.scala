object Twofer {
  def twofer(name: Option[String] = None): String = {
    name match {
      case Some(value) => s"One for $value, one for me."
      case None => "One for you, one for me."
    }
  }

  def twofer(name: String): String = twofer(Some(name))
}

