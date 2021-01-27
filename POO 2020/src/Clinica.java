
public class Clinica {
		 private Aparato [] Aparatos;
		 private int size, next;
		
		 public Clinica(int n)
		 {
		 this.size=n;
		 this.Aparatos = new Aparato[size];
		 this.next=0;
		}
		
		 public void addAparato(Aparato aparato) {
		 if (!(this.next < this.size))
		 this.enlarge();
		 Aparatos[next]=aparato;
		 this.next++;
		}
		 
		 
		 public void removeAparato(String nameAparato){
			 boolean found=false;
			 int count=0;
			 Aparato aux;
			 while(!found && count<next){
			 if (Aparatos[count] != null) {
			 aux=Aparatos[count];
			 if (aux.getNameAparato().equals(nameAparato))
			 found=true;
			 }
			 count++;
			 }
			 if (found)
			 Aparatos[count-1]= null;
		 }
		 
		 public boolean searchAparato(String nameAparato){
			 boolean found=false;
			 int count=0;
			 Aparato aux;
			 while(!found && count<next) {
			 if (Aparatos[count] != null) {
			 aux=Aparatos[count];
			 if (aux.getNameAparato().equals(nameAparato))
			 found=true;
			 }
			 count++;
			 }
			 return found;
			}
		 
		 public void listAparatos() {
			 int count=0;
			 Aparato aux;
			 while(count<next) {
			 if (Aparatos[count] != null) {
			 aux=Aparatos[count];
			 System.out.println(aux.getNameAparato());
			 System.out.println(aux.getFecha());
			 boolean a=false;
			 a=aux.getEstado();
			 if(a==false) {
				 System.out.println("Estado: NO disponible");}
			 else
				 System.out.println("Estado: DISPONIBLE");
			 
			 boolean b=false;
			 b=aux.getUso();
			 if(a==false) {
				 System.out.println("Estado: LO ESTAN USANDO");}
			 else
				 System.out.println("Estado: USABLE");
			 
			 }
			 count++;
			 } 
			}
		 
		 public void cantidadAparatos() 
		 	{
			 int count=0;
			 int NoDisponibles=0;
			 int Disponibles=0;
			 int NoUsables=0;
			 int Usables=0;
			 
			 while(count<next) 
			 	{
				 if (Aparatos[count] != null) 
				 {
					 if (Aparatos[count].Estado==false) { 
						 System.out.println(Aparatos[count].getNameAparato()+" no disponible");
						 NoDisponibles++;}
						 else {
						 System.out.println(Aparatos[count].getNameAparato()+" disponible");
						 Disponibles++;}
					 
					 if (Aparatos[count].Uso==false) { 
						 System.out.println(Aparatos[count].getNameAparato()+" lo estan usando");
						 NoUsables++;}
						 else {
						 System.out.println(Aparatos[count].getNameAparato()+" usable");
						 Usables++;}
						 
					 
					 count++;
				 }
			 	}
			 System.out.println("Hay "+count+" aparatos");
			 System.out.println("Hay "+NoDisponibles+" no disponibles");
			 System.out.println("Hay "+Disponibles+" disponibles");

			 System.out.println("Hay "+NoUsables+" que estan usando");
			 System.out.println("Hay "+Usables+" usables");
			 }
		 
		 public int getAparatosDuranteElAño(int aaa) 
		 	{
			 	int año=0;
			 	int count=0;
			 	

				 while(count<next) 
				 	{
					 Aparato AparatoAux=Aparatos[count];
					 if (aaa==AparatoAux.getFecha()) {
					 			año++;}
					 count++;
				 	}
			 	
			 	return año;
			}
			 
		 
		 
		 private void enlarge() {
			 int count2=0;
			 Aparato [] aux=new Aparato[size+100];
			 for(int count1=0; count1<size; count1++)
			 if (Aparatos[count1] != null) {
			 aux[count2]=Aparatos[count1];
			 count2++;
			 }
			 this.Aparatos = aux;
			 this.next=count2;
			 this.size=size+100;
			}
}
		 
		 

