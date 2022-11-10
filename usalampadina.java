package corsoiniziodacapo;

public class usalampadina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
lampadine gewis=new lampadine ("varta","bianca");
lampadine bosh=new lampadine("bosch","rossa");
System.out.println(gewis);
bosh.stato();
gewis.stato();

System.out.println(gewis.stato);
bosh.click();
gewis.click();
System.out.println(gewis.stato);
gewis.click();
gewis.click();
gewis.click();
gewis.click();
gewis.click();
System.out.println(gewis.stato);
	System.out.println(gewis.cont);
	System.out.println(bosh.colore);
	System.out.println(bosh.stato);
	}
}
