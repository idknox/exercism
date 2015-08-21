package grade_school
import scala.collection.mutable.ListBuffer
import scala.collection.immutable.TreeMap

class School {
  var students = collection.mutable.Map[Int, ListBuffer[String]]().withDefaultValue(ListBuffer())

  def db = {
    students
  }

  def add (name:String, grade_number:Int)= {
    if ( db.contains(grade_number) ) db(grade_number) += name
    else db += (grade_number -> ListBuffer(name) )
  }

  def grade (grade_number:Int) = db(grade_number)

  def sorted = {
    db.foreach {
      case (grade_number, students) =>
        db(grade_number) = students.sorted
    }
    TreeMap(db.toSeq:_*)
  }e
}