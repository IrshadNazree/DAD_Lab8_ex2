
public class MultiExtractApp {
	public static void main(String[] args) {
		Runnable text = new MultiExtractPrint();
		Runnable word = new MultiExtractPrint();
		
		Thread textThread = new Thread(text,"text");
		Thread wordThread = new Thread(word,"word");
		
		// Execute thread
		textThread.start();
		wordThread.start();
	}
}
