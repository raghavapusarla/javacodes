import java.util.*;
public class Main
{
   
    static int num;
	static List<Integer> bin = new ArrayList<>();
	static List<Integer> zero = new ArrayList<>();
	public static void main(String[] args) {

			System.out.println("Enter the input number");
			Scanner in = new Scanner(System.in);
			num=in.nextInt();
			binary(num);
			count(bin);
			System.out.println(Collections.max(zero));
			}
			static int binary(int num){
			  while(num!=0){
				  bin.add(num%2);
				  num=num/2;
			   }
			   return 0;
			}
			public static void count(List<Integer> bin){
			   
				for (int i=0;i<bin.size();i++){
				    if(bin.get(i)==1){
					   
					   int c=0,j=i+1;
					   while(j< bin.size() && bin.get(j)==0){
						   c++;
						   if(bin.get(j)==1){
								break;
						   }
						   j++;
					   }
					   zero.add(c);
				   }
				}
			}
}
