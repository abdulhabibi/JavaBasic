package AbstractionPractice;
public class BMW implements Car, SportCar {
	@Override
	public void brake(double speed) {
		System.out.println("BMW is stoping");
	}
	@Override
	public boolean startEngine() {
		System.out.println("BMW is starting the engine");
		return true;
	}
	@Override
	public boolean leftSignal() {
		System.out.println("BMW is going to turn to the left");
		return false;
	}
	@Override
	public boolean rightSignal() {
		System.out.println("BMW is going to turn to the Right");
		return false;
	}
	@Override
	public void adjustLeftMirror() {
		System.out.println("BMW is adjusting the left mirror");
	}
	@Override
	public void adjustRightMirror() {
		System.out.println("BMW is adjusting the right mirror");
	}
	@Override
	public void turnOnTurbo() {
	}
	public void theNewMethod() {
	}
}