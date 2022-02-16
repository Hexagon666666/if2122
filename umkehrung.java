String text = Input.readString("Gib einen Text ein");
int laenge = text.length();
System.out.print("Textlänge: ");
System.out.print(laenge);
System.out.println(" Zeichen");
System.out.println("-------------------------------");
// Die Variable i gibt die Position des aktuellen Buchstabens an, dabei wird von hinten begonnen
int i = laenge - 1;
// Solange i nicht am Anfang des Wortes angekommen ist, wird der Buchstabe an der Stelle i ausgegeben und i dann um 1 verringert.
while(i >= 0) {
   char c = text.charAt(i);
   System.out.print(c);
   i = i - 1;
}
