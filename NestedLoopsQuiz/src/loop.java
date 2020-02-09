
public class loop {
public static void go(int size, char letter) {
	if(size%2 != 0) {
		for(int i =0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i==j||j==size-i-1) {
					System.out.print(letter);
				}else {

					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}else {
		for(int i =0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(letter);
			}
			System.out.println("");
		}
	}
	System.out.println();
	}
}

