package example.lib1

import example.lib2.Lib2

class Lib1 {
    def print() {
        println("Hello from lib1")
        Lib2.print()
    }
}
