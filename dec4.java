package dec4;

class Candy
{
    public String taste()
    {
        return "tastes sweet!";
    }
    
    
}


class Chocolate extends Candy
{
    // ADD CODE HERE
	
	public String taste() {
		super.taste();
		return " tastes chocolatel ";
	}
}
//____________________________2nd problem
class Sports{
    String  getName(){
        return  "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
    	System.out.println(super.getName());
    	
        return "Soccer Class";
    }
}









public class dec4 {
	
    public static void talk()
    {
          System.out.println("hello there!");
    }
   public static void talk(String name) {
	   System.out.print(name);
   }
    public static void main(String[] args) {
    	
    
    Candy c1 = new Candy();
    System.out.println(c1.taste());
    Candy c2 = new Chocolate();
    System.out.println(c2.taste());
    
    
    Soccer obj=new Soccer();
    System.out.println(obj.getName());
    
    
   // __________________________
    talk("Matthew");
    System.out.println();
    talk();
    }
}
