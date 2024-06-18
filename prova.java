import java.util.Optional;

public final class prova{

	private static final int NUM_MAX = 10;

	public static void main(String args[]){
		final Optional<String> [] items = new Optional[NUM_MAX];
		for(int i = 0; i < NUM_MAX; i++){
			System.out.println(items[i]);
			items[i] = Optional.of("Pippo");
		}
		for(int i = 0; i < NUM_MAX; i++){
			if(items[i].isPresent()){
				System.out.println(items[i].get());
			}
		}
	}
}