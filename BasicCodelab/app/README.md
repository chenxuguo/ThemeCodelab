# Kotlin
## lambda expression
```kotlin
    fun convertString(string: String) : (String) -> String = when(string){
        "UpperCase" -> { str -> str.uppercase() }
        "LowerCase" -> { str -> str.lowercase() }
        else -> { str -> str }
    }
    main(){
        print(convertString("UpperCase")("abcdefghijklmnopqrstuvwxyz"))
        print(convertString("LowerCase")("ABCDEFGHIJKLMNOPQRSTUVWXYZ"))
    }