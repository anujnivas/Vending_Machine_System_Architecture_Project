package driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import MDAEFSM.MDAEFSM;
import OutputProcessor.OutputProcessor;
import dataStore.DS;
import factory.AbstractFactory;
import factory.CF_VM1;
import factory.CF_VM2;
import vm.VM1;
import vm.VM2;

public class testDriver {
	static Scanner scanner;
	static BufferedReader reader;
	static char menu_choice;
	public static void main(String[] args) {
		System.out.println("Welcome!!");
		System.out.println("Select the VM to run");
		System.out.println("");
		System.out.println("1- VM1");
		System.out.println("2- VM2");
		System.out.println("");
		
		scanner = new Scanner(System.in);
		reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			menu_choice = (char) reader.read();
		} catch (IOException e) {
			System.out.println("Invalid Choice. Exiting!");
			System.exit(0);
		}
		
		switch(menu_choice) {
		case '1':
			System.out.println("VM1 Selected");
			VM1_Menu();
			break;
		case '2':
			System.out.println("VM2 Selected");
			VM2_Menu();
			break;
			default:		
				System.out.println("Invalid Choice. Exiting!");
				System.exit(0);

		}
		
		System.out.println("Application Terminated! Thank you for using the application");
	}
	
	private static void VM1_Menu() {
		AbstractFactory af = new CF_VM1();
		DS ds= af.getDataStore();
		OutputProcessor op = new OutputProcessor(af, ds);
		MDAEFSM mda= new MDAEFSM(op);
		
		VM1 vm1=new VM1(mda, ds);
		float temp;
		int temp_int;
		
		while(true) {
			System.out.println("MENU of Operations");
			System.out.println("   0. create(int p)");
			System.out.println("   1. coin(float v)");
			System.out.println("   2. sugar()");
			System.out.println("   3. tea()");
			System.out.println("   4. latte()");
			System.out.println("   5. insert_cups(int n)");
			System.out.println("   6. set_price(float p)");
			System.out.println("   7. cancel()");
			System.out.println("   q. Quit the demo program");
			
		
			menu_choice = scanner.next().charAt(0);
			switch(menu_choice) {
			case '0':
				System.out.println("Option selected: 0");
				System.out.println("Enter value for p");
				temp_int=scanner.nextInt();
				vm1.create(temp_int);
				break;
			case '1':
				System.out.println("Option selected: 1");
				System.out.println("Enter value for v");
				temp=scanner.nextFloat();
				vm1.coin(temp);
				break;
			case '2':
				System.out.println("Option selected: 2");
				vm1.sugar();
				break;
			case '3':
				System.out.println("Option selected: 3");
				vm1.tea();
				break;
			case '4':
				System.out.println("Option selected: 4");
				vm1.latte();
				break;
			case '5':
				System.out.println("Option selected: 5");
				System.out.println("Enter value for n");
				temp_int=scanner.nextInt();
				vm1.insert_cups(temp_int);
				break;
			case '6':
				System.out.println("Option selected: 6");
				System.out.println("Enter value for p");
				temp=scanner.nextFloat();
				vm1.set_price(temp);
				break;
			case '7':
				System.out.println("Option selected: 7");
				vm1.cancel();
				break;
			case 'q':
				return;
				default:		
					System.out.println("Invalid Choice. Try again!");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
			}
			 
		}
		
	}
	
	private static void VM2_Menu() {
		AbstractFactory af = new CF_VM2();
		DS ds= af.getDataStore();
		OutputProcessor op = new OutputProcessor(af, ds);
		MDAEFSM mda= new MDAEFSM(op);
		
		VM2 vm2=new VM2(mda, ds);
		float temp;
		int temp_int;
		
		while(true) {
			System.out.println("MENU of Operations");
			System.out.println("   0. CREATE(float p)");
			System.out.println("   1. COIN(int v)");
			System.out.println("   2. SUGAR()");
			System.out.println("   3. CREAM()");
			System.out.println("   4. COFFEE()");
			System.out.println("   5. InsertCups(int n)");
			System.out.println("   6. SetPrice(int p)");
			System.out.println("   7. CANCEL()");
			System.out.println("   8. CARD(int x)");
			System.out.println("   q. Quit the demo program");
			
		
			menu_choice = scanner.next().charAt(0);
			switch(menu_choice) {
			case '0':
				System.out.println("Option selected: 0");
				System.out.println("Enter value for p");
				temp=scanner.nextFloat();
				vm2.create(temp);
				break;
			case '1':
				System.out.println("Option selected: 1");
				System.out.println("Enter value for v");
				temp_int=scanner.nextInt();
				vm2.coin(temp_int);
				break;
			case '2':
				System.out.println("Option selected: 2");
				vm2.sugar();
				break;
			case '3':
				System.out.println("Option selected: 3");
				vm2.cream();
				break;
			case '4':
				System.out.println("Option selected: 4");
				vm2.coffee();
				break;
			case '5':
				System.out.println("Option selected: 5");
				System.out.println("Enter value for n");
				temp_int=scanner.nextInt();
				vm2.insert_cups(temp_int);
				break;
			case '6':
				System.out.println("Option selected: 6");
				System.out.println("Enter value for p");
				temp_int=scanner.nextInt();
				vm2.set_price(temp_int);
				break;
			case '7':
				System.out.println("Option selected: 7");
				vm2.cancel();
				break;
			case '8':
				System.out.println("Option selected: 8");
				System.out.println("Enter value for card");
				temp_int=scanner.nextInt();
				vm2.card(temp_int);
				break;
			case 'q':
				return;
				default:		
					System.out.println("Invalid Choice. Try again!");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
			}
			 
		}
		
	}

}
