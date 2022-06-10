//Funktioniert nicht richtig, da die Überprüfung fehlt!

String geheimtext = "UVTGPIIGJGKO";
int i = 0;
int laenge = geheimtext.length();
int schluessel = 0;
while (schluessel < 26) {
      println(schluessel);
   while(i < laenge) {
      char c = geheimtext.charAt(i);
      int cAscii = (int)c;
      cAscii = cAscii + schluessel;
      c = (char)cAscii;
      print(c);
      i = i + 1;
   }
   println(" ");
   schluessel = schluessel + 1;
   i = 0;
}
