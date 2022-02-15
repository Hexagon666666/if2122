String text = Input.readString("Zu verschlüsselnden Text eingeben");
int schluessel = Input.readInt("Schlüssel eingeben");
int laenge = text.length();
System.out.print("Textlänge: ");
System.out.print(laenge);
System.out.println(" Zeichen");
System.out.println("-------------------------------");
System.out.println("Verschlüsselter Text:");
int i = 0;
int j = 0;
while(j < schluessel) {
   while(i < laenge) {
      char ausgabe = text.charAt(i);
      i = i + schluessel;
      print(ausgabe);
   }
   j = j + 1;
   i = j;
}
