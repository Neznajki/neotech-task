# neotech-task
neotech task

* task
```
Funkcionālās prasības:

Izveidot mikroservisu, kas nosaka valsti pēc ievadītā telefona numura.
Lietotājs ievada telefona numuru, sistēma to validē un atgriež valsts kodu, vai arī kļūdas ziņojumu.

Sarakstu ar valstu kodiem var iegūt šeit:
https://en.wikipedia.org/wiki/List_of_country_calling_codes
(tos nepieciešams ielādēt katru reizi, kad tiek startēts mikroserviss.)

Nefunkcionālās prasības:

Backend:
Java 8+
Spring Boot
Maven/Gradle
HTTP, RESTful сервис с JSON-форматом данных.

Frontend:
HTML
JavaScript
CSS

Izmantotās koda bibliotēkas (dependencies) ir jūsu ziņā. Nedrīkst izmantot
tās, kas ietver sevī jau gatavu šī uzdevuma risinājumu. (piemēram, Google Phone Validator utt.)
 
Piezīmes:
Programmu jāvar uzbūvēt un izpildīt no komandrindas. Tai jādarbojās uz 8080 porta.
Jābūt iespējai izpildīt testus un apskatīt to rezultātus. Visai saziņai
starp mikroservisu (REST API) un klientu (pārlūkprogrammu) jānotiek caur HTTP, izmantojot JSON kā datu formātu.
Lietotāja interfeisa vizuālais pievilcīgums ir mazsvarīgs.
Priekš REST pieprasījumiem var izmantot jebkuru frontend bibliotēku / ietvaru, kas māk darboties ar AJAX.
(piemēram, jQuery). Datu validācija un testi ir obligāti.
Uzdevuma izpildes termiņš ir 1 nedēļa kopš uzdevuma saņemšanas.
```


## timeline

* making backend functionality 8h ~
* making tests 4h ~
* making FE part 2h ~
* preparing launch docs fixing tests 2h~

## launching application
* launch web server
```shell script
java -cp out/artifacts/neotech-test.jar com.neotech.web.WebApplication
```
* execute console
```shell script
java -cp out/artifacts/neotech-test.jar com.neotech.console.Executor +455555
```

## help
* main page GUI (http://localhost:8080/)
* api path (http://localhost:8080/rest/json/check/phone?phone=%2B37121293)