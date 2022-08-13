package day14;

public class Sink2 {
	public static void main(String[] args) {
		Toilet t1 = new Toilet();
		t1.start();
		t2.start();
		t3.start();
	}
}

class Toilet implements Runnable{
    private int time;
	@Override
	public void run(this) {
		// TODO Auto-generated method stub
		time = 0;
		System.out.println("화장실 입장");
		new Runnable() {
			public void run() {
				while (time < 10) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						this.equals(getClass(Toilet));
						e.printStackTrace();
					}
					sleep(1000);
				}
			}

			private void sleep (int i) {
				// TODO Auto-generated method block
				time++;
				
			}
		}
	}
}
