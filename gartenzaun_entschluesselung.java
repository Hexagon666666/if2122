String text = Input.readString("Zu entschlüsselnden Text eingeben");
int laenge = text.length();
System.out.print("Textlänge: ");
System.out.print(laenge);
System.out.println(" Zeichen");
System.out.println("-------------------------------");
System.out.println("Der Klartext lautet:");
int i = 0;
int j = 0;
int laengeteileins = laenge / 2;
int laengeungerade = laenge % 2;
if(laengeungerade == 1) {
   laengeteileins = laengeteileins + 1;
}
int ii = laengeteileins;
String klartext = "";
while(j < laenge) {
   klartext = text.charAt(i);
   print(klartext);
   i = i + 1;
   j = j + 1;
   klartext = text.charAt(ii);
   print(klartext);
   ii = ii + 1;
   j = j + 1;
}
