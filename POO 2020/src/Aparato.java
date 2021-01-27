
public class Aparato 
{
	String NameAparato;
	Boolean Estado;
	Boolean Uso;
	int Fecha;
	
	public Aparato(String n, Boolean e,Boolean u, int f) 
	{
		this.NameAparato=n;
		this.Estado=e;
		this.Uso=u;
		this.Fecha=f;
	}
	
	public void setNameAparato(String n) {
	NameAparato=n;}

	public String getNameAparato() {
	return this.NameAparato;}
	
	public void setEstado(Boolean e) {
	Estado=e;}

	public Boolean getEstado() {
	return this.Estado;}
	
	public void setUso(Boolean u) {
		Uso=u;}

	public Boolean getUso() {
	return this.Uso;}
	
	public void setFecha(int f) {
	Fecha=f;}

	public int getFecha() {
	return this.Fecha;}
	
}
