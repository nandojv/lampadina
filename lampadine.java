package corsoiniziodacapo;



public class lampadine {

	int cont=0;
	public String modello;
	public String colore;
	public String stato;
lampadine(String modello,String colore){
	
	this.modello=modello;
	this.colore=colore;
	this.stato="off";
	
}
public String toString() {
	return "modello:  "+this.modello+  " " +"colore:  "+colore+  " "+"stato:  "+this.stato;



}
public String stato() {
	return stato;
}
public void click() {
	
	if(cont<=5) {
		cont++;
	
	
	if (stato=="off") {
	stato="on";
	
	}
	else if(stato=="on") {
		stato="off";
	
	}
}
	 if (cont>5){
stato="rotto";
	}

}}

