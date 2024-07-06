//delgation pattern
// Defines the interface SoundBehavior with one method
// The classes ScreamBehavior and RockAndrollBehavior implement the interface and contain their own implementation of the method.
// The classes tomAraya and ElvisPresley also implement the interface, but not the method instead,
// they delegate the method calls to the responsible implementation. The delegate object is defined after the by keyword.
// Ad oyou see, no boilerplate code is required.
// When makesound() is called on toArays of type tomAraya or elvisPresley of type ElvisPresley, the call is delegated to the
// corresponding delegate object
//interface SoundBehavior {
//    fun makeSound()
//}
//
//class ScreamBehavior(val n: String) : SoundBehavior {
//    override fun makeSound() = println("${n.uppercase()} !!!")
//}
//
//class RockAndRollBehavior(val n:String): SoundBehavior {
//    override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
//}
//
//class TomAraya(n:String) : SoundBehavior by ScreamBehavior(n)
//
//class ElvisPresley(n: String): soundBehavior by RockAndRollBehavior(n)



package org.kotlinlang.play         // 1

fun main() {                        // 2
    println("Hello, World!")        // 3
}