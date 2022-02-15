String text = Input.readString("Gib einen Text ein");
int laenge = text.length();
System.out.print("Textlänge: ");
System.out.print(laenge);
System.out.println(" Zeichen");
System.out.println("-------------------------------");
int i = 0;
while(i < laenge) {
   char c = text.charAt(i);
   System.out.print(c);
   i = i + 2;
}
int ii = 1;
while(ii < laenge) {
   char c = text.charAt(ii);
   System.out.print(c);
   ii = ii + 2;
}
