
### **Eccezioni Checked (Rey Exception)**
Queste eccezioni devono essere gestite esplicitamente con `try-catch` o dichiarate nel metodo con `throws`.

1. **IOException**
    - Classe base per eccezioni di input/output, ad esempio:
        - `FileNotFoundException`: File non trovato.
        - `EOFException`: Fine del file raggiunta inaspettatamente.

2. **SQLException**
    - Riguarda errori durante l'interazione con database tramite JDBC.

3. **ClassNotFoundException**
    - Sollevata quando una classe richiesta non viene trovata.

4. **InstantiationException**
    - Tentativo di creare un'istanza di una classe astratta o un'interfaccia.

5. **InterruptedException**
    - Sollevata quando un thread in attesa o in sospensione viene interrotto.

6. **MalformedURLException**
    - Sollevata per URL non validi.

7. **NoSuchMethodException**
    - Metodo specificato non trovato.

---

### **Eccezioni legate a variabili null**
Derivano dalla **RuntimeException** e indicano errori legati all'uso improprio di variabili non inizializzate.

1. **NullPointerException**
    - Tentativo di utilizzare un riferimento null, ad esempio:
        - Invocare un metodo su un oggetto non inizializzato.
        - Accedere a un campo di un oggetto null.

2. **IllegalArgumentException**
    - Sollevata quando un metodo riceve un argomento invalido, spesso usato per verificare argomenti null.

---

### **Eccezioni Runtime (Unchecked)**
Sono derivate da **RuntimeException** e non richiedono gestione obbligatoria.

1. **ArithmeticException**
    - Errori aritmetici, come la divisione per zero.

2. **ArrayIndexOutOfBoundsException**
    - Accesso a un indice non valido in un array.

3. **ClassCastException**
    - Tentativo di cast non valido.

4. **IllegalStateException**
    - Sollevata quando un metodo viene chiamato in uno stato non valido per l'oggetto.

5. **IndexOutOfBoundsException**
    - Classe base per eccezioni legate a indici non validi:
        - `StringIndexOutOfBoundsException`: Per operazioni su stringhe.
        - `ArrayIndexOutOfBoundsException`: Per array.

6. **NumberFormatException**
    - Sollevata quando si tenta di convertire una stringa in un numero con formato errato.

7. **UnsupportedOperationException**
    - Operazione non supportata da una classe.

---

### **Errori Critici di Runtime (Error)**
Indicano errori gravi legati al sistema.

1. **StackOverflowError**
    - Sovraccarico dello stack, spesso dovuto a ricorsione infinita.

2. **OutOfMemoryError**
    - Memoria heap insufficiente.

3. **VirtualMachineError**
    - Errori gravi del JVM, come `InternalError` e `UnknownError`.

4. **NoClassDefFoundError**
    - Classe non trovata durante l'esecuzione.

Se hai bisogno di approfondimenti su uno specifico tipo di eccezione o un esempio, fammi sapere!