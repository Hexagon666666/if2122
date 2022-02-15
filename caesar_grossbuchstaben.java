String text = Input.readString("Gib einen Text ein");
int laenge = text.length();
int schluessel = Input.readInt("Schlüssel eingeben");
System.out.print("Textlänge: ");
System.out.print(laenge);
System.out.println(" Zeichen");
System.out.println("-------------------------------");
while(schluessel > 26) {
   schluessel = schluessel - 26;
}
while(schluessel < 0) {
   schluessel = schluessel + 26;
}
int i = 0;
int j = 0;
while(i < laenge) {
   char c = text.charAt(i);
   j = (int) c;
   j = j + schluessel;
   if(j <= 90) {
      c = (char) j;
      print(c);
   }else{
      j = j - 26;
      c = (char) j;
      print(c);
   }
   i = i + 1;
}
