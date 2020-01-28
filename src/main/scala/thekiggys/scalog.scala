import scala.concurrent.Future

implicit class Scalog[T](context: T){
  def log[T <: Future]
}
