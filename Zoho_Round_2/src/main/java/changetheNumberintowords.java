package solving;

public class changetheNumberintowords {
	
	  public static final String [] once= {" ","one ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
	   
	  public static final String [] teens= {"Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Ninteen "};
	   
	  public static final String [] tens= {"","","Tweenty ","Thrity ","Fourty ","Fifty ","sixty ","Seventy ","Eighty ","Ninty "};
	   
	public static void main(String[] args) {
	
	    int num=950;
	    System.out.println(numberToword(num));
	   
	}
	public static String numberToword(int num)
	{
		if(num == 0)
			return "zero";
		
		String word="";
		
		if(num>=100)
		{
			word=word+once[num/100]+"Hundered ";
			num =num%100;
			if(num>0)
			{
				word=word+"and ";
			}
		}
		 if(num>=20)
		{
			word=word+tens[num/10];
			num=num%10;
			if(num>0)
			{
				word=word+once[num];
			}
		}
		else if(num>=10)
		{
			word=word+" "+teens[num%10];
		}
		else if(num>=0)
		{
			word=word+once[num];
		}
		return word;
	}

}
