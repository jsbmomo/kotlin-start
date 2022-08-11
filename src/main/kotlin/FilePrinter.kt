import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException




class FilePrinter {

  // JAVA와 달리 IOException을 throws로 명시하지 않아도 컴파일 에러가 발생하지 않는다.
  // Checked Exception과 Unchecked Exception 을 구분하지 않기 때문이고,
  // 모두 Unchecked Exception 으로 취급한다.
  fun readFile() {
    val currentFile = File(".");
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file));
    println(reader.readLine())
    reader.close()
  }

  @Throws(IOException::class)
  fun readFile(path: String?) {
    BufferedReader(FileReader(path)).use {
      reader -> println(reader.readLine())
    }
  }
}