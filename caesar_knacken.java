String text = Input.readString("Gib einen Text ein");
int laenge = text.length();
int schluessel = 0;
System.out.print("Textlänge: ");
System.out.print(laenge);
System.out.println(" Zeichen");
System.out.println("-------------------------------");

int i = 0;
int j = 0;
int grossbuchstabe = 0;
while(schluessel < 26) {
   print("Für den Schlüssel ");
   print(schluessel - 26);
   println(" lautet die Entschlüsselung:");
   while(i < laenge) {
      char c = text.charAt(i);
      j = (int) c;
      if(j >= 65 && j <= 90) {
         grossbuchstabe = 1;
      }else{
         grossbuchstabe = 0;
      }
      j = j + schluessel;
      if(grossbuchstabe == 1) {
         if(j <= 90) {
            c = (char) j;
            print(c);
         }else{
            j = j - 26;
            c = (char) j;
            print(c);
         }
      }else{
         if(j <= 122) {
            if(j >= 97) {
               c = (char) j;
               print(c);
            }else{
               j = j + 26;
               c = (char) j;
               print(c);
            }
         
         }else{
            j = j - 26;
            c = (char) j;
            print(c);
         }

      }
      i = i + 1;
   }
   println(" ");
   println(" ");
   i = 0;
   schluessel = schluessel + 1;
}
