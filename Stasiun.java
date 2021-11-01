
/*
1. Buatlah UML class diagram dari percobaan 3!
2. Apa perbedaan penentu akses privat dan publik! Berilah contoh program
untuk memperjelas penjelasan.? kalo public bisa di jalankan diluar class,
dan kalau private hanya bisa dijalankan diluar class
3. Kapan kata kunci this dipergunakan?
*/

class acaraTV {
public String StasiunTV;
public String Acara;

public String getStasiunTV() {
return StasiunTV;
}
public void setStasiunTV(String StasiunTV)
{ this.StasiunTV=StasiunTV;
}
public String getAcara() {
return Acara; }
public void setAcara(String Acara) {
this.Acara=Acara;
}
public void cetak() {
System.out.println("Acara "+Acara+"Stasiun TV "
+StasiunTV);
}
}
public class Stasiun {

public static void main(String args[])
{ acaraTV a=new acaraTV();
a.StasiunTV="TransTV";
a.Acara="Mozaik Islam ";
a.cetak();
}
}