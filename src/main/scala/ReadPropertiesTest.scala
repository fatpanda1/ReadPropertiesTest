import java.io.FileOutputStream
import java.util.Properties

import scala.collection.mutable.ListBuffer

object ReadPropertiesTest {
  def main(args: Array[String]): Unit = {
    //实例化properties对象
    val properties = new Properties()
    //获取.properties文件链接
    val path = Thread.currentThread().getContextClassLoader.getResourceAsStream("test.properties")
    //读取链接文件
    properties.load(path)

    //向.properties文件中写入数据
    properties.put("handsome","qiuping")

    //从.properties文件读取数据
    val name = properties.getProperty("name")
    val age = properties.getProperty("age")
    val project = properties.getProperty("project")
    val email = properties.getProperty("email")
    val handsome = properties.getProperty("handsome")

    val list = new ListBuffer[String]
    list += name
    list += age
    list += project
    list += email
    list += handsome

    list.foreach(println)
  }
}
