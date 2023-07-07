package example

import example.lib1.Lib1

object Hello extends Greeting with App {
    println(greeting)
    new Lib1.print()
}

trait Greeting {
    lazy val greeting: String = "Hello world"
}
