String text = Input.readString("Gib einen Text ein");
int laenge = text.length();
System.out.print("Textlänge: ");
System.out.print(laenge);
System.out.println(" Zeichen");
System.out.println("-------------------------------");
int i = laenge - 1;
while(i >= 0) {
   char c = text.charAt(i);
   System.out.print(c);
   i = i - 1;
}
