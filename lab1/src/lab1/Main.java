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
		System.out.println("\n����:\n1.�������� ������� (� �����)         2.�������� ������� �� �������� �������");
		System.out.println("3.������� ������� (�� �����)         4.������� �������, ����������� �� �������� �������");
		System.out.println("5.�������� ��������� �������         6.�������� �������, ����������� �� �������� �������");
		System.out.println("7.������� ������                     0.�����");
		System.out.println("\n������� �����");
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
            System.out.println("��������� ���� ������ �� �������� ����� ������");
        }
		switch(choice)
		{
		case 1:
			{
			Integer elem = null;
			System.out.println("������� �������");
			sc = new Scanner(System.in);
			try {
	            elem = sc.nextInt();
	        }
	        catch (Exception ex)
	        {
	            System.out.println("��������� ���� ������ �� �������� ����� ������");
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
		System.out.println("������� �������");
		try {
            elem = sc.nextInt();
        }
        catch (Exception ex)
        {
            System.out.println("��������� ���� ������ �� �������� ����� ������");
            break;
        }
		System.out.println("�������, �� ����� ������� ��������� �������");
		sc = new Scanner(System.in);
		try {
            index = sc.nextInt();
        }
        catch (Exception ex)
        {
            System.out.println("��������� ���� ������ �� �������� ����� ������");
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
		        System.out.println("�� ������� ��������� ������� �������, ������ "+elem);
		    	}
		    catch (Exception ex)
		    	{
		        System.out.println(ex.getMessage());
		    	}
			
		break;
		}
		
		case 4:
		{
			System.out.println("�������, � ����� ������� ������� �������");
			Integer index = null;
			try {
	            index = sc.nextInt();
	        }  
	        catch (Exception ex)
	        {
	            System.out.println("��������� ���� ������ �� �������� ����� ������");
	            break;
	        }
			Integer elem = null;
			if (!index.equals(null)) 
				{
				try {
			        elem = arr.DeleteFromPosition(index+1);
			        System.out.println("�� ������� "+index+"-�� ������� �������, ������ "+elem);
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
			        System.out.println("��������� ������� ������� ����� "+elem);
			    	}
			    catch (Exception ex)
			    	{
			        System.out.println(ex.getMessage());
			    	}
							
		break;
		}
		
		case 6:
		{
			System.out.println("�������, � ����� ������� �������� �������");
			
			Integer index = null;
			try {
	            index = sc.nextInt();
	        }
	        catch (Exception ex)
	        {
	            System.out.println("��������� ���� ������ �� �������� ����� ������");
	            break;
	        }
			Integer elem = null;
			if (!index.equals(null)) 
				{
				try {
			        elem = arr.GetFromPosition(index);
			        System.out.println(index+"-�� ������� ������� ����� "+elem);
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
			System.out.println("�����.");	
		    break;
		}
		
		default: 
		{
			System.out.println("��� ������ �����������q ���");
			break;
		}
		}
	} while (!choice.equals(0));
	
	
    
   
    Array a = new Array();
    a.addElem(1);
    a.addElem(2);
    if (arr.equals(a)) System.out.println("������� �����");
    else System.out.println("������� �� �����");
    
    
    
    
		
		
	}

}
