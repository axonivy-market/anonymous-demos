# Anonymous Demos

**Kernkonzept**  
Anstatt für jeden externen Benutzer eine separate Registrierung vorzusehen, wird der Zugriff über E-Mails mit zufällig generierten, nicht vorhersagbaren Tokens ermöglicht. Die gesamte Kommunikation mit externen Benutzern erfolgt über solche tokenbasierten E-Mail-Links. Interne Prozesse werden durch das Senden definierter Signale gestartet oder fortgeführt.

**Use Cases**
* Starte einen nicht authentifizierten Prozess aus Axon Ivy, prüfe die E-Mail-Adresse des Benutzers und stoße anschließend einen internen Axon Ivy-Prozess an.
* Starte einen nicht authentifizierten Prozess über ein beliebiges Webformular auf einer externen Webseite (über das Action-Attribut und einen POST-Request), prüfe die E-Mail-Adresse des Benutzers und stoße anschließend einen internen Axon Ivy-Prozess an.
* Kommuniziere während eines laufenden internen Prozesses per E-Mail mit dem Benutzer und verarbeite seine Antwort.
