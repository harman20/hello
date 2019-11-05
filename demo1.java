import java.util.ArrayList;
	public class Demo1
	{
		public static void main(String[] args) 
		{
			ArrayList list=new ArrayList();
			
			list.add(100);
			list.add("hello");
			list.add(200.50);
		
			System.out.println(list.get(1));
			
			for(Object x : list)
			{
				System.out.println(x);
			}
			
				System.out.println("Total Elements :"+list.size());
			//System.out.println(list);

		}
	}
