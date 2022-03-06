package AssesmentPrograms;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;
	import java.util.StringTokenizer;


	public class EmployeeRecordFileHandling {

		public static void main(String[] args) {
			
			Scanner strinput=new Scanner(System.in);
			String choice,cont="y";
			while(cont.equalsIgnoreCase("y")){
				
				System.out.println("\tEmployee Information System\n\n");
				System.out.println("1====>>Add New Employee Record");
				System.out.println("2====>>View All Employee Record");
				System.out.println("3====>>Delete Employee Record");
				System.out.println("4====>>Search Specific Record");
				System.out.println("5====>>update Specific Record");
				System.out.println("\n\n");
				System.out.println("Enter Your choice:");
				choice=strinput.nextLine();
				if(choice.equals("1")){
					try{
						AddRecord();
					}
					catch(IOException e){
						e.printStackTrace();
					}
					
				}
				else if(choice.equals("2")){
					try{
						ViewAllRecord();
					}
					catch(IOException e){
						e.printStackTrace();
					}
				}
				else if(choice.equals("3")){
					try{
						DeleteRecordByID();
					}
					catch(IOException e){
						e.printStackTrace();
					}
				}
				else if(choice.equals("4")){
					try{
						searchRecordbyID();
					}
					catch(IOException e){
						e.printStackTrace();
					}
				}
				else if(choice.equals("5")){
					try{
						updateRecordbyID();
					}
					catch(IOException e){
						e.printStackTrace();
					}
				}
				System.out.println("Do you want to continue?Y/N");
				cont=strinput.nextLine();
			}

		}
		public static void AddRecord() throws IOException{
			
			BufferedWriter s=new BufferedWriter(new FileWriter("record.txt",true));
			Scanner strinput=new Scanner(System.in);
			String ID,name,age,addr;
			System.out.println("Enter the Employee ID:");
			ID=strinput.nextLine();
			System.out.println("Enter the Employee Name");
			name=strinput.nextLine();
			System.out.println("Enter the Employee Age");
			age=strinput.nextLine();
			System.out.println("Enter the Employee Address");
			addr=strinput.nextLine();
			s.write(ID+", "+name+", "+age+" ,"+addr);
			s.flush();
			s.newLine();
			s.close();
		}
		public static void ViewAllRecord()throws IOException{
			
			BufferedReader m=new BufferedReader(new FileReader("record.txt"));
			String record;
			System.out.println("-------------------------------");
			System.out.println("| ID Name age Address|");
			System.out.println("--------------------------------");
			while((record=m.readLine())!=null){
				StringTokenizer n=new StringTokenizer(record,",");
				
				System.out.println(" "+n.nextToken()+" "+n.nextToken()+" "+n.nextToken()+" "+n.nextToken());
			}
			System.out.println("--------------------------------");
			m.close();
		}
		public static void DeleteRecordByID() throws IOException{
			
			Scanner strinput= new Scanner(System.in);
			String ID,record;
			File tempAB=new File("record_temp.txt");
			File ab=new File("record.txt");
			
			BufferedReader br=new BufferedReader(new FileReader(ab));
			BufferedWriter bm=new BufferedWriter(new FileWriter(tempAB));
			System.out.println("\t\t Delete the Employee Record\n");
			System.out.println("Enter the Employee ID:");
			ID=strinput.nextLine();
			while((record=br.readLine())!= null){
				if(record.contains(ID))
					continue;
				bm.write(record);
				bm.flush();
				bm.newLine();
			}
			br.close();
			bm.close();
			ab.delete();
			tempAB.renameTo(ab);
		}
		public static void searchRecordbyID() throws IOException{
			
			String ID,record;
			Scanner strinput=new Scanner(System.in);
			
			BufferedReader as=new BufferedReader(new FileReader("record.txt"));
			System.out.println("\t\t Search Employee Record\n");
			System.out.println("Enter the Employee ID:");
			ID=strinput.nextLine();
			System.out.println("----------------------");
			System.out.println("| ID Name Age Address|");
			System.out.println("-----------------------");
			while((record=as.readLine())!=null){
				
				StringTokenizer a=new StringTokenizer(record,",");
				if(record.contains(ID)){
					
					System.out.println("|"+a.nextToken()+" "+a.nextToken()+" "+a.nextToken()+" "+a.nextToken()+"|");
				}
			}
			System.out.println("--------------------------------------");
			as.close();
		}
		public static void updateRecordbyID() throws IOException{
			String newName,newAge,newAddr,record,ID,record2;
			File db=new File("record.txt");
			File tempDB=new File("records_temp.txt");

			BufferedReader br=new BufferedReader(new FileReader(db));
			BufferedWriter bw=new BufferedWriter(new FileWriter(tempDB));
			Scanner strinput =new Scanner(System.in);
			System.out.println("\t\tUpdate Employee record\n\n");
			System.out.println("Enter the Employee ID:");
			ID=strinput.nextLine();
			System.out.println("-----------------------------");
			System.out.println("| ID name Age Address");
			System.out.println("----------------------------");
			while((record=br.readLine())!=null){
				StringTokenizer st=new StringTokenizer(record,",");
				if(record.contains(ID)){
					System.out.println("|"+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+"|");
						
				}
			}
			System.out.println("-------------------------------");	
			br.close();
			System.out.println("Enter the new Name");
			newName=strinput.nextLine();
			System.out.println("Enter the new Age");
			newAge=strinput.nextLine();
			System.out.println("Enter the new Address");
			newAddr=strinput.nextLine();
			BufferedReader br2=new BufferedReader(new FileReader(db));
			while((record2=br2.readLine())!=null){
				if(record2.contains(ID)){
				bw.write(ID+","+newName+", "+newAge+" ,"+newAddr);
			}
			else{
				bw.write(record2);
			}
			bw.flush();
			bw.newLine();
		}
			bw.close();
			br2.close();
			db.delete();
			boolean success=tempDB.renameTo(db);
			System.out.println(success);
		
		}

	}



