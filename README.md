### Überblick über das Smart Home System
Dieses Dokument dient als umfassender Leitfaden für das im Rahmen meines Studiums entwickelte Smart Home System an der FHDW. Es zielt darauf ab, eine detaillierte Einsicht in die Struktur und Funktionalität des Systems zu bieten, sowie die technologischen Entscheidungen, die zur Realisierung des Projekts getroffen wurden, zu erläutern.

### Zielsetzung dieser Dokumentation
Der Hauptzweck dieses Dokuments ist es, eine klare und präzise Darstellung der Architektur des Smart Home Systems zu liefern. Es wird beschrieben, wie die einzelnen Komponenten und Module interagieren, um eine anpassungsfähige und erweiterbare Plattform für die Gebäudesteuerung zu schaffen. Weiterhin erörtere ich die Verbindungspunkte zwischen den Systemmodulen sowie die Einbindung und Erweiterungsmöglichkeiten, die das System bietet.

### Entstehungshintergrund des Smart Home Systems
Das System wurde entwickelt, um innovative Technologien in der Gebäudeautomation praktisch anzuwenden und das Lehrangebot mit realen, technischen Herausforderungen zu bereichern. Als einzelner studentischer Entwickler war es meine Aufgabe, einen funktionierenden Prototyp eines umfassenden Smart Home Systems zu erstellen, das als Basis für die Automatisierung verschiedener Gebäudefunktionen dient und die Integration zusätzlicher Komponenten erleichtert.

Die Hauptmerkmale des Systems umfassen die Bereitstellung einer Betriebsumgebung für die Gebäudeautomatisierung, die einfache Einführung neuer Sensoren und Aktoren und die effiziente Verknüpfung mit externen Systemen.

### Definition der Systemgrenzen
Innerhalb dieser Dokumentation werden die Schnittstellen und Interaktionspartner des Smart Home Systems klar abgegrenzt. Dies bezieht sich auf die Verbindungen zu Sensoren und Aktoren sowie auf die Nutzerschnittstellen durch das Command Line Interface. Diese Grenzen sind so gesetzt, dass sie die Flexibilität des Systems erhalten und gleichzeitig eine einfache Skalierbarkeit und Anpassungsfähigkeit ermöglichen.

### Fachlicher Kontext
Der fachliche Kontext des Smart Home Systems beinhaltet die Interaktionen innerhalb des Systems, das ausschließlich mit simulierten Daten und internen Steuerungslogiken arbeitet.

### Externe Kommunikationspartner
Das System nutzt keine realen externen Geräte oder Sensoren. Stattdessen verwendet es simulierte Schnittstellen, die wie folgt funktionieren:

#### Dummy-Sensoren und Aktoren: 
Das System generiert selbst Daten von simulierten Sensoren wie Temperaturfühlern, Lichtsensoren und Bewegungsdetektoren. Diese Daten werden verwendet, um Steuerbefehle an simulierte Aktoren wie Heizungen, Lichter und Türschlösser zu senden.
#### Visualisierungsinterface: 
Alle Interaktionen mit dem Nutzer erfolgen über ein einfaches Command Line Interface, das den simulierten Zustand des Systems visualisiert und Nutzerbefehle für Testszenarien entgegennimmt.

### Fachliche Schnittstellen
Die fachlichen Schnittstellen des simulierten Systems umfassen:

#### Nutzereingabe: 
Über das Terminal können Nutzer Befehle eingeben, die normalerweise die Aktoren steuern oder Informationen über die Zustände der Sensoren liefern würden.
#### Systemausgabe: 
Simulierte Antworten und Zustände des Systems werden textbasiert über das Terminal ausgegeben.
#### Simulierte Steuerbefehle und Sensorabfragen: 
Das System verwendet ein internes Regelwerk, um basierend auf simulierten Sensorwerten automatisierte Aktionen zu steuern oder auf Nutzereingaben zu reagieren.

### Technischer Kontext
Der technische Kontext beschreibt die internen technischen Verbindungen und Schnittstellen des Systems, die ausschließlich mit simulierten Daten arbeiten.

### Technische Schnittstellen
Die technischen Schnittstellen des Smart Home Systems umfassen:

#### Terminal: 
Das Terminal dient als primäre Schnittstelle für den Endnutzer, um mit dem simulierten System zu interagieren.
#### Interne Logikverbindungen: 
Das System interagiert intern mit simulierten Netzwerkverbindungen, die es ermöglichen, Daten zwischen den simulierten Sensoren und Aktoren auszutauschen.
#### Datenverarbeitungslogik: 
Die Entscheidungsfindung basiert auf einer Reihe von definierten Regeln, die simulieren, wie das System auf Änderungen in den simulierten Sensorwerten reagieren würde.

### Kontextdiagramm

![Kontextdiagramm.png](documentation/Kontextdiagramm.png)


Das Kontextdiagramm visualisiert die Interaktionen und Datenflüsse innerhalb des Smart Home Systems, das ausschließlich mit simulierten Komponenten arbeitet. Folgende Hauptkomponenten und ihre Verbindungen sind dargestellt:

#### Mensch (Nutzer):
**Position:** Links neben der CLI (Command Line Interface).
**Beschreibung:** Der Nutzer repräsentiert die Person, die Interaktionen mit dem System über die CLI durchführt. Diese Darstellung symbolisiert die Schnittstelle, über welche Nutzereingaben erfolgen und Informationen vom System empfangen werden.
#### Command Line Interface (CLI):
**Position:** Zentral im unteren Bereich des Diagramms, direkt verbunden mit dem Menschen (Nutzer) und der internen Steuerungslogik.
**Beschreibung:** Das CLI ist die primäre Benutzerschnittstelle, über die der Nutzer Befehle eingibt und Rückmeldungen vom System erhält. Es dient als Vermittler zwischen dem Menschen und der Steuerungslogik des Smart Home Systems.
#### Smart Home System:
**Position:** Umfasst die zentrale und obere Bereiche des Diagramms.
**Beschreibung:** Innerhalb dieser Systemgrenze befinden sich die simulierten Sensoren, Aktoren, die Steuerungslogik und die Datenverarbeitung. Das gesamte System interagiert intern, um eine simulierte Gebäudeautomation zu realisieren.
#### Dummy-Sensoren:
**Position:** Innerhalb der Systemgrenze, meist im oberen Bereich.
**Beschreibung:** Diese Komponenten simulieren verschiedene Arten von Sensordaten (wie Temperatur, Licht, Bewegung), die zur Steuerungslogik gesendet werden.
#### Simulierte Aktoren:
**Position:** Ebenfalls innerhalb der Systemgrenze, nahe den Sensoren.
**Beschreibung:** Aktoren reagieren auf Befehle von der Steuerungslogik, um simulierte Aktionen wie Lichtsteuerung oder Temperaturanpassungen durchzuführen.
#### Steuerungslogik:
**Position:** Im Zentrum der Systemgrenze, direkt verbunden mit Sensoren, Aktoren und dem CLI.
**Beschreibung:** Diese Kernkomponente verarbeitet alle Eingaben von Sensoren und der CLI, trifft Entscheidungen und sendet entsprechende Befehle an die Aktoren. Sie ist das Gehirn des Systems.
#### Datenverarbeitung:
**Position:** In der Nähe der Steuerungslogik innerhalb der Systemgrenze.
**Beschreibung:** Diese Komponente handhabt interne Datenoperationen, speichert Testergebnisse und Verlaufsinformationen, die für Testszenarien innerhalb des simulierten Systems benötigt werden.

## 3. Anforderungsanalyse
### 3.1 Funktionale Anforderungen
Das Smart Home System, das für die FHDW entwickelt wird, zielt darauf ab, eine Plattform für Lehr- und Forschungszwecke zu bieten. Daher muss das System folgende funktionale Anforderungen erfüllen:

#### Aktoren und Sensoren Integration: 
Das System muss verschiedene Aktoren und Sensoren integrieren können. Beispiele für Aktoren sind Lichtschalter, Relais, Lüftungsregler, Heizungen, Rolladenmotoren und Türschlösser. Sensoren sollten in der Lage sein, verschiedene Umgebungsparameter wie Temperatur, Lichtstärke, Luftfeuchtigkeit, Anwesenheit von Personen und RFID-Tags zu erfassen.
#### Visualisierung: 
Eine grundlegende Visualisierungskomponente muss implementiert werden, die über ein Command Line Interface (CLI) bedienbar ist. Diese Komponente sollte die Möglichkeit bieten, eine Liste von Gebäuden, Etagen und Räumen anzuzeigen sowie aktuelle Sensorwerte pro Raum oder Sensortyp darzustellen.
#### Manuelle Ansteuerung von Aktoren: 
Benutzer sollten in der Lage sein, Aktoren manuell zu steuern, sowohl auf der Ebene einzelner Räume als auch gebäude- oder etagenweit.
#### Regelsystem: 
Es sollte möglich sein, Regeln zu definieren, die auf Klassen oder Interfaces basieren. Diese Regeln können entweder durch Sensorereignisse, zu festgelegten Zeiten oder manuell getriggert werden.
#### Einfache Erweiterbarkeit: 
Die Softwarearchitektur muss so gestaltet sein, dass sie einfach um neue Sensoren, Aktoren und Regeln erweitert werden kann.
### 3.2 Nicht-funktionale Anforderungen
Neben den funktionalen Anforderungen muss das Smart Home System auch folgende nicht-funktionale Anforderungen erfüllen:

#### Skalierbarkeit: 
Das System muss in der Lage sein, mehrere Gebäude zu unterstützen und leicht skalierbar sein, um zusätzliche Gebäude, Etagen und Räume hinzufügen zu können.
#### Benutzerfreundlichkeit: 
Die Bedienung des Systems, insbesondere das CLI, muss intuitiv und benutzerfreundlich sein, um eine effiziente Nutzung und Forschung zu ermöglichen.
#### Zuverlässigkeit und Stabilität: 
Das System muss stabil und zuverlässig laufen, insbesondere da es für Bildungs- und Forschungszwecke eingesetzt wird.
#### Wartbarkeit: 
Die Wartung des Systems sollte durch klare Dokumentation und eine modular aufgebaute Architektur vereinfacht werden

### 3.3 Benutzerrollen und Interaktionen
Im Rahmen des Entwurfs für das Smart Home System an der FHDW wird kein Unterschied zwischen verschiedenen Benutzertypen gemacht. Das System ist so konzipiert, dass es keine spezifischen Rollen mit unterschiedlichen Anforderungen oder Berechtigungen gibt. Jeder Benutzer des Systems hat Zugriff auf die gleichen Funktionen und Möglichkeiten:

#### Einheitliche Benutzerinteraktion: 
Alle Benutzer des Systems interagieren über das gleiche Command Line Interface (CLI) und haben Zugriff auf alle Funktionen des Systems. Dies umfasst die Anzeige von Gebäuden, Etagen und Räumen, das Abrufen aktueller Sensorwerte und die manuelle Ansteuerung von Aktoren.
#### Gleiche Zugriffsrechte: 
Es gibt keine differenzierten Zugriffsrechte oder unterschiedliche Benutzerebenen. Jeder Benutzer kann das System vollumfänglich nutzen, was die Bedienung vereinfacht und die Einarbeitungszeit minimiert.
#### Homogene Nutzungserfahrung: 
Die Entscheidung, keine unterschiedlichen Benutzerrollen zu implementieren, zielt darauf ab, eine homogene Nutzungserfahrung für alle Anwender zu schaffen. Dies ist besonders vorteilhaft in einem akademischen Umfeld, wo Flexibilität und einfacher Zugang zu Lehr- und Forschungstools gewünscht sind.