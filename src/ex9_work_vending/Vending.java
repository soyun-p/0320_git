package ex9_work_vending;

public class Vending {

	// List<Can> list = new ArrayList<Can>();
	private Can[] can = new Can[5];
	
	private int money;


	public Vending() {

		can[0] = new Can("fanta", 1100);
		can[1] = new Can("orange", 1200);
		can[2] = new Can("banana milk", 1000);
		can[3] = new Can("cider", 1300);
		can[4] = new Can("coke", 1400); 

	} // Vending 생성자
	
	
	public void showDrink( int money ) {
		
		this.money = money;
		
		for(int i = 0; i < can.length; i++) {
			
			if( can[i].getPrice() <= money ) {
				System.out.println(can[i].getName() + " - " + can[i].getPrice());
			} // if
		} //for
		
	} // showDrink
	
	
	
	public void dispose( String name ) {
		
		for(int i = 0; i < can.length; i++) {
			
			if( name.equals(can[i].getName()) ) {
				System.out.println(can[i].getName() + "을(를) 선택하셨습니다.");
				System.out.println( "잔돈 : " + ( money - can[i].getPrice() ) );
				
			} // if
			
		} // for
		
		
	} // dispose





















}
