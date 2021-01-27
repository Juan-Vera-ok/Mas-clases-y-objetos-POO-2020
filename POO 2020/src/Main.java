
public class Main {
	public static void main(String[] args) 
	{
		
		int op=0;
		
		Clinica MiClinica = new Clinica (50);
		
		do
		{
			System.out.println("Opcion 1:Agregar aparato");
			System.out.println("Opcion 2:Quitar aparato");			
			System.out.println("Opcion 3:Preguntar aparatos en tal año");
			System.out.println("Opcion 4: Lista de aparatos, estados y usos");
			
			op=Console.readInt("Ingrese opción");
			
			switch(op) 
				{
					case 1:
					{
						System.out.println("Nombre del Aparato");
						 System.out.println("-----------------");
						 String name = Console.readString("Name: ");
						 String estado=Console.readString("Ingrese nd o d(No disponible o disponible)");
						 String	auxEstado="nd";
						 Boolean estadoBooleano=true;
						 if(estado.equals(auxEstado)) 
						 		estadoBooleano = false;
						 	else
						 		estadoBooleano = true;
						 
						 
						 String Uso=Console.readString("Ingrese nu o u(No usable o usable)");
						 String auxUso="nu";
						 Boolean estadoUso=true;
						 if(Uso.equals(auxUso)) 
						 		estadoUso = false;
						 	else
						 		estadoUso = true;
						 
						 		
						 int año= Console.readInt("Año");
						 Aparato aparato1 = new Aparato(name, estadoBooleano,estadoUso,año);
						 MiClinica.addAparato(aparato1);
						 break;
					}
					case 2:
					{
						String ap= Console.readString("Ingrese aparato para eliminar");
						MiClinica.removeAparato(ap);
						break;
					}
					case 3:
					{
						System.out.println("Cantidad de aparatos en el año");
						System.out.println("-------------------");
						int a=Console.readInt("Ingrese año que le interese");
						System.out.println("Hay "+MiClinica.getAparatosDuranteElAño(a)+" del año "+a);
						

						break;
					}
					case 4:
					{
						System.out.println("Cantidad de aparatos totales, disponibles, no disponibles, usables y no usables");
						System.out.println("---------------------------");
						MiClinica.cantidadAparatos();
						break;
					}

				}
		
		
		
		
		
		
		
	}while(op!=0);
}
}
