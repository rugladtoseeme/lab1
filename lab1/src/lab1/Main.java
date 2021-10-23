package lab1;
import java.util.Scanner;

//import CustomList.List;

public class Main {

	public static void printArr(Array array)	
	{
		String str = array.toString();
		System.out.println(str);
	}
	
	public static void Menu()	
	{
		System.out.println("\nМЕНЮ:\n1.Добавить элемент (в конец)         2.Добавить элемент на заданную позицию");
		System.out.println("3.Удалить элемент (из конца)         4.Удалить элемент, находящийся на заданной позиции");
		System.out.println("5.Получить последний элемент         6.Получить элемент, находящийся на заданной позиции");
		System.out.println("7.Вывести массив                     0.Выход");
		System.out.println("\nВведите выбор");
	}
	
	
	
	public static void main(String[] args) 
	{
		
	Array arr = new Array();	
	Integer choice = -1;
	do
	{
		Menu();
		Scanner sc = new Scanner(System.in);
		try {
            choice = sc.nextInt();
        }
        catch (Exception ex)
        {
            System.out.println("Введенные вами данные не являются целым числом");
        }
		switch(choice)
		{
		case 1:
			{
			Integer elem = null;
			System.out.println("введите элемент");
			sc = new Scanner(System.in);
			try {
	            elem = sc.nextInt();
	        }
	        catch (Exception ex)
	        {
	            System.out.println("Введенные вами данные не являются целым числом");
	            break;
	        }
			if (!elem.equals(null)) 
				{
				try {
			        arr.addElem(elem);
			    	}
			    catch (Exception ex)
			    	{
			        System.out.println(ex.getMessage());
			    	}
				}
			break;
			}
	
		case 2:
		{
		
		Integer index = null;
		Integer elem = null;
		sc = new Scanner(System.in);
		System.out.println("введите элемент");
		try {
            elem = sc.nextInt();
        }
        catch (Exception ex)
        {
            System.out.println("Введенные вами данные не являются целым числом");
            break;
        }
		System.out.println("введите, на какую позицию вставлять элемент");
		sc = new Scanner(System.in);
		try {
            index = sc.nextInt();
        }
        catch (Exception ex)
        {
            System.out.println("Введенные вами данные не являются целым числом");
            break;
        }
		if (!index.equals(null)) 
			{
			try {
		        arr.addToPosition(index,elem);
		    	}
		    catch (Exception ex)
		    	{
		        System.out.println(ex.getMessage());
		    	}
			}
		break;
		}
		
		case 3:
		{
		
		Integer elem = null;
		
			try {
		        elem = arr.Delete();
		        System.out.println("вы удалили последний элемент массива, равный "+elem);
		    	}
		    catch (Exception ex)
		    	{
		        System.out.println(ex.getMessage());
		    	}
			
		break;
		}
		
		case 4:
		{
			System.out.println("введите, с какой позиции удалять элемент");
			Integer index = null;
			try {
	            index = sc.nextInt();
	        }  
	        catch (Exception ex)
	        {
	            System.out.println("Введенные вами данные не являются целым числом");
	            break;
	        }
			Integer elem = null;
			if (!index.equals(null)) 
				{
				try {
			        elem = arr.DeleteFromPosition(index+1);
			        System.out.println("вы удалили "+index+"-ый элемент массива, равный "+elem);
			    	}
			    catch (Exception ex)
			    	{
			        System.out.println(ex.getMessage());
			    	}
				}			
		break;
		}
		

		case 5:
		{
			
			Integer elem = null;
			
				try {
			        elem = arr.GetEnd();
			        System.out.println("последний элемент массива равен "+elem);
			    	}
			    catch (Exception ex)
			    	{
			        System.out.println(ex.getMessage());
			    	}
							
		break;
		}
		
		case 6:
		{
			System.out.println("введите, с какой позиции получить элемент");
			
			Integer index = null;
			try {
	            index = sc.nextInt();
	        }
	        catch (Exception ex)
	        {
	            System.out.println("Введенные вами данные не являются целым числом");
	            break;
	        }
			Integer elem = null;
			if (!index.equals(null)) 
				{
				try {
			        elem = arr.GetFromPosition(index);
			        System.out.println(index+"-ый элемент массива равен "+elem);
			    	}
			    catch (Exception ex)
			    	{
			        System.out.println(ex.getMessage());
			    	}
				}			
		break;
		}
		
		case 7:
		{
		printArr(arr);		
		break;
		}
		
		case 0:
		{
			System.out.println("Выход.");	
		    break;
		}
		
		default: 
		{
			System.out.println("Был введен неправильныq код");
			break;
		}
		}
	} while (!choice.equals(0));
	
	
    
   
    Array a = new Array();
    a.addElem(1);
    a.addElem(2);
    if (arr.equals(a)) System.out.println("массивы равны");
    else System.out.println("массивы Не равны");
    
    
    
    
		
		
	}

}
