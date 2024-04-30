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

[Kontextdiagramm.drawio](..%2F..%2FDesktop%2FKontextdiagramm.drawio)
