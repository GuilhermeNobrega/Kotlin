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


# 🚗 Classes com Atributos — Java vs Kotlin

Exemplo simples de **duas classes** com atributos

---

## 🟦 Código Java (referência)

```java
// Carro.java
public class Carro {
    String marca;
    int ano;

    Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    void exibir() {
        System.out.println("Marca: " + marca + ", Ano: " + ano);
    }
}
```

```java
// Principal.java
public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro("Toyota", 2022);
        c1.exibir();
    }
}
```

---

## 🧠 Questão

**Assinale a alternativa que representa o código Kotlin equivalente correto.**

---

### A)
```kotlin
class Carro(val marca: String, val ano: Int) {
    fun exibir() {
        println("Marca: $marca, Ano: $ano")
    }
}

fun main() {
    val c1 = Carro("Toyota", 2022)
    c1.exibir()
}
```

✅ **Alternativa correta**
- Usa o construtor primário (`val marca`, `val ano`).
- Cria o objeto e chama o método normalmente.

---

### B)
```kotlin
object Carro(val marca: String, val ano: Int) {
    fun exibir() {
        println("Marca: $marca, Ano: $ano")
    }
}

fun main() {
    val c1 = Carro("Toyota", 2022)
    c1.exibir()
}
```
❌ **Errada**
- `object` não aceita construtor com parâmetros.
- Não permite criar instâncias (`Carro("Toyota", 2022)` é inválido).

---

### C)
```kotlin
class Carro {
    var marca: String = ""
    var ano: Int = 0
}

fun main() {
    val c1 = Carro("Toyota", 2022)
    c1.exibir()
}
```
❌ **Errada**
- Falta construtor com parâmetros e método `exibir()`.

---

## 🧩 Resumo rápido

| Conceito | Java | Kotlin |
|-----------|-------|--------|
| Atributos | `String marca; int ano;` | `val marca: String, val ano: Int` |
| Construtor | `Carro(String m, int a)` | No cabeçalho da classe |
| Método | `void exibir()` | `fun exibir()` |
| Instância | `new Carro()` | `Carro()` |

---

> 💡 **Dica:** Kotlin elimina `new`, adiciona construtor primário e facilita acesso direto aos atributos.
