interface PokemonState{ 
    public void alert(AlertStateContext ctx); 
} 

class AlertStateContext
{ 
    private PokemonState currentState; 

    public AlertStateContext(){ 
        currentState = Attack.getInstance(); 
    } 

    public void setState(PokemonState state){ 
        currentState = state; 
    } 

    public void alert(){ 
        currentState.alert(this); 
    } 
} 

class Attack implements PokemonState
{ 
	
	private static Attack INSTANCE = new Attack();
	
	private Attack() {}
	
	public static Attack getInstance() {
		
		if (INSTANCE == null) {
            INSTANCE = new Attack();
		}
		
		return INSTANCE;
	}
    @Override
    public void alert(AlertStateContext ctx)
    { 
         System.out.println("Attacking..."); 
    } 

} 

class Defend implements PokemonState 
{ 
	
private static Defend INSTANCE = new Defend();
	
	private Defend() {}
	
	public static Defend getInstance() {
		
		if (INSTANCE == null) {
            INSTANCE = new Defend();
		}
		
		return INSTANCE;
	}
	
    @Override
    public void alert(AlertStateContext ctx){ 
        System.out.println("Defending..."); 
    } 

} 

public class Main{ 
    public static void main(String[] args) { 
        AlertStateContext pokeStateContext = new AlertStateContext(); 
        pokeStateContext.alert(); 
        pokeStateContext.alert(); 
        pokeStateContext.setState(Defend.getInstance()); 
        pokeStateContext.alert(); 
        pokeStateContext.alert(); 
        pokeStateContext.alert();
    } 
}