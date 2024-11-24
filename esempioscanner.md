Ecco un esempio che utilizza il metodo `nextInt()` di `Scanner` per acquisire un numero intero e gestisce eventuali eccezioni nel caso in cui l'input non sia un numero intero:

### Codice Java con `nextInt()`

```java
import java.util.Scanner;

public class InputValidationWithNextInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero:");

        try {
            int numero = scanner.nextInt(); // Acquisisce direttamente l'input come intero
            System.out.println("Hai inserito il numero: " + numero);
        } catch (Exception e) {
            System.out.println("Errore: L'input inserito non è un numero intero.");
        } finally {
            scanner.close(); // Chiude lo scanner
        }
    }
}
```

### Come funziona:
1. **Acquisizione con `nextInt`:** `scanner.nextInt()` tenta di leggere un numero intero direttamente.
2. **Gestione eccezioni:** Se l'input non è un numero intero (ad esempio una stringa o un carattere), viene lanciata un'eccezione generica (`InputMismatchException`).
3. **Blocco `finally`:** Lo scanner viene chiuso nel blocco `finally` per liberare risorse.

---

### Output di esempio:

1. **Input valido:**
    - Utente: `42`
    - Output: `Hai inserito il numero: 42`

2. **Input non valido:**
    - Utente: `abc`
    - Output: `Errore: L'input inserito non è un numero intero.`

---

### Nota:
L'uso di `nextInt()` può lasciare dati non validi nel buffer dello scanner (come `abc` o `1.23`). In tal caso, è consigliabile ripulire il buffer utilizzando `scanner.nextLine()` nel blocco `catch`, per evitare problemi con ulteriori letture.

Versione migliorata per ripulire il buffer:

```java
import java.util.Scanner;

public class InputValidationWithNextInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero:");

        try {
            int numero = scanner.nextInt(); // Acquisisce direttamente l'input come intero
            System.out.println("Hai inserito il numero: " + numero);
        } catch (Exception e) {
            System.out.println("Errore: L'input inserito non è un numero intero.");
            scanner.nextLine(); // Pulisce il buffer
        } finally {
            scanner.close(); // Chiude lo scanner
        }
    }
}
```
