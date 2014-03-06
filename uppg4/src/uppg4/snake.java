package uppg4;
//klass under animal
//hämtar info om snake, ifall den är poisinous eller ej
public class snake extends Animal {

	private boolean poisonous;
	
	public snake (String latinName, boolean poisonous) {
		
		super (latinName);
		this.poisonous = poisonous;
		}
	

	@Override
	public String getInfo() {
		String s;
		if (poisonous){
			s ="" ;
		}else{
			s = " not ";
		}
		return " The snake \"" + super.getLatinName() +"\" is " + s + "poisonous." ;
	}
}
