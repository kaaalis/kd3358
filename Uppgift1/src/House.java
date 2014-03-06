
//klassvariabel
public class House {
	//instansvariabel
	private int year;
	private int size;
	private static int nbrOfHouses;
	public static final int MIN_SIZE =10;
	//konstruktor
	public House(int _year,int _size){
		year= _year;
		
		if(_size>10){
			size= _size;
		}else{
			size = MIN_SIZE;
		}
		//instansmetod = något nytt
		nbrOfHouses = nbrOfHouses +1; 
		}
	//diverse kod
	//klassmetod
	public static int getNbrHouses(){
	return nbrOfHouses;
	}
	public int getYear(){
		return year;
	//diverse kod
	}
	public int getSize(){
		return size;
	//diverse kod
	}
	
}
	




