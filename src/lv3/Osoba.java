package lv3;

public class Osoba {
String ime;
String prezime;
String oib;
String adresa;
String prebivaliste;
String datum_rodenja;

public Osoba() {
ime = "";
prezime = "";
oib = "";
adresa = "";
prebivaliste ="";
datum_rodenja="";
}

public Osoba(String i, String p, String o, String a,String pr,String dr) {
ime = i;
prezime = p;
oib = o;
adresa=a;
prebivaliste=pr;
datum_rodenja=dr;
}
public static void main(String[] args) {

Osoba o1 = new Osoba();

System.out.println("Ime: " + o1.ime);
System.out.println("Prezime: " + o1.prezime);
System.out.println("OIB: " + o1.oib);
System.out.println("-----------------");
o1.ime = "Marko"; 
o1.prezime = "Maric"; 
o1.oib = "01234567891"; 
System.out.println("Ime: " + o1.ime);
System.out.println("Prezime: " + o1.prezime);
System.out.println("OIB: " + o1.oib);
System.out.println("-----------------");

Osoba o2 = new Osoba("Ivan", "Horvat", "98765432100","Matije Gupca 78/4","Virovitica","20.10.2000");
System.out.println("Ime: " + o2.ime);
System.out.println("Prezime: " + o2.prezime);
System.out.println("OIB: " + o2.oib);
System.out.println("Adresa: " + o2.adresa);
System.out.println("Prebivalište: " + o2.prebivaliste);
System.out.println("Datum rođenja: " + o2.datum_rodenja);



o2.Ispis();
o2.AzurirajAdresu("Ilica 111, 10000 Zagreb");
o2.AzurirajAdresu("");
o2.Ispis();

o2.ProvjeraDatuma(o2.datum_rodenja);

}




public void Ispis() {
System.out.println("Ime: " +ime);
System.out.println("Prezime: " + prezime);
System.out.println("OIB: " + oib);
}


public void AzurirajAdresu(String a) {
if(a != null && !a.isEmpty())
	adresa = a;
	else System.out.println("Pogresan unos!");;
}







public void ProvjeraOIB() {
try {
long l = Long.parseLong(oib);
if(l < 0) {
System.out.println("OIB ne smije biti negativan broj!");
return;
}

}
catch(NumberFormatException nfe){
System.out.println("OIB mora sadržavati samo znamenke!");
return;
}
if( oib.length()!=11) {
System.out.println("OIB mora sadržavati 11 znamenaka!");
return;
}
else {
System.out.println("OIB je ispravnog formata.");
}
}

public void ProvjeraDatuma(String datum_rodenja)
{
	
	String[] datum= datum_rodenja.split("[.]");
	if(Integer.parseInt(datum[0])>31 ||Integer.parseInt(datum[1])>12||Integer.parseInt(datum[2])<1900)
	{
		System.out.println("Datum nije ispravan");
		
	}
	else
	{
		System.out.println("Datum je ispravan");
	}		
}
private boolean ProvjeraString(String toTest)
{
	if(toTest == null || toTest.trim().isEmpty())
	{
		return false;
	}
	for(char c : toTest.toCharArray())
	{
		if(Character.isDigit(c))
		{
			return false;
		}
			
	}
	return true;

}

}


