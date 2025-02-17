[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-8d59dc4de5201274e310e4c54b9627a8934c3b88527886e3b421487c677d23eb.svg)](https://classroom.github.com/a/Fn6LoUUQ)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=10701108&assignment_repo_type=AssignmentRepo)
# Battleship [![Docker Build & Push](https://github.com/softeng2223-inf-uniba/progetto2223-patterson/actions/workflows/docker_build&push.yml/badge.svg)](https://github.com/softeng2223-inf-uniba/progetto2223-patterson/actions/workflows/docker_build&push.yml)

La struttura della repository si presenta nel seguente modo:

```plaintext
|-- .github
|    |-- workflows
|    |      |-- docker_build&push.yml
|    |      |-- gradle_build.yml
|–– config
|    |–– checkstyle
|    |–– pmd
|–– docs
|    |–– img
|    |–– Assegnazione progetto.md
|    |–– CODE_OF_CONDUCT.md
|    |–– Guida per lo studente.md
|    |–– ISPIRATORE.md
|    |–– Report.md
|–– drawings
|–– gradle
|–– lib
|–– res
|–– src
|    |–– main
|    |–– test
|–– .gitattributes
|–– .gitignore
|–– Dockerfile
|–– README.md
|–– build.gradle
|–– gradlew
|–– gradlew.bat
|–– settings.gradle
```

Nel seguito si dettagliano i ruoli dei diversi componenti:

- `.github/workflows/`:
  - `docker_build&push.yml`: dettaglia le direttive per assicurare la continuous integration attraverso l’uso di GitHub Actions;
  - `gradle_build.yml`: dettaglia le direttive per assicurare la continuous integration attraverso l’uso di GitHub Actions;
- `config/`: ospita i file di configurazione. Le due configurazioni presenti sono i tool checkstyle e pmd.
- `docs/`: ospita la documentazione di progetto, incluse le figure (nella sottocartella `img/`).
  Il file `Report.md` verrà usato per redigere la relazione finale del progetto.
  La cartella raccoglie inoltre:
  - `Assegnazione progetto.md`: contenente la descrizione dettagliata del progetto assegnato;
  - `CODE_OF_CONDUCT.md`: contenente il codice di comportamento a cui cerco di aderire in un team Scrum;
  - `Guida per lo studente.md`: contenente la descrizione di tutti i passi di configurazione necessari per l'attivazione del flusso di lavoro a supporto dello sviluppo del progetto;
  - `ISPIRATORE.md`: contenente biografia e principali contributi del personaggio a cui il gruppo si è ispirato per il nome;
- `drawings/`: contiene tutti i diagrammi UML usati per descrivere il progetto.
- `gradle/`: ospita il `.jar` relativo al sistema di gestione delle dipendenze *Gradle*.
- `lib`: include eventuali librerie esterne utilizzate dal progetto.
- `res`: contiene risorse varie utilizzate dal sistema
- `src`: cartella principale del progetto, in cui scrivere tutto il codice dell’applicazione. In `main/` ci saranno i file sorgente e `test/` conterrà i test di unità previsti.
- `.gitattributes`: specifica gli attributi assegnati ai percorsi.
- `.gitignore`: specifica tutti i file che devono essere esclusi dal sistema di controllo versione.
- `Dockerfile`: specifica i comandi per costruire automaticamente l'immagine dell'applicazione.
- `build.gradle`: esplicita le direttive e la configurazione di *Gradle*.
- `gradlew` e `gradlew.bat`: eseguibili di *Gradle*, rispettivamente dedicati a Unix e Windows.
- `settings.gradle`: file di configurazione di *Gradle*.

In alcune cartelle è possibile notare la presenza di un unico file nascosto `.keep`: questo ha il solo scopo di richiedere a Git l’inclusione delle cartelle in cui è contenuto (Git esclude dal *versioning* le cartelle vuote). Pertanto, il file può essere ignorato o eventualmente cancellato nel momento in cui si inserisca almeno un altro file all’interno della cartella.
