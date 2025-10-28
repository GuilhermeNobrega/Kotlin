# 🧠 Java `static` vs Kotlin `object`

Este exemplo mostra como representar **métodos estáticos de Java** no **Kotlin**, usando `object`.

---

## 🟦 Java — classe com método `static`

```java
// Geometria.java
public class Geometria {
    public static double areaRetangulo(double base, double altura) {
        return base * altura;
    }
}
```

```java
// Principal.java
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double area = Geometria.areaRetangulo(base, altura);
        System.out.println("Área = " + area);

        sc.close();
    }
}
```

---

## 🟩 Kotlin — `object` equivalente

```kotlin
// Geometria.kt
object Geometria {
    fun areaRetangulo(base: Double, altura: Double): Double = base * altura
}
```

```kotlin
// Principal.kt
fun main() {
    print("Base: ")
    val base = readln().toDouble()
    print("Altura: ")
    val altura = readln().toDouble()
    val area = Geometria.areaRetangulo(base, altura)
    println("Área = $area")
}
```

---

## 🔍 Comparativo rápido

| Conceito | Java | Kotlin |
|-----------|-------|---------|
| Método “estático” | `static` | `object` (singleton) |
| Instanciação necessária | Não | Não |
| Acesso | `Classe.metodo()` | `Objeto.metodo()` |
| Exemplo | `Geometria.areaRetangulo()` | `Geometria.areaRetangulo()` |

---

> 💡 Dica:  
> Em Kotlin, `object` gera uma instância única automaticamente — ou seja, é o equivalente mais próximo de uma classe com métodos `static` em Java.
