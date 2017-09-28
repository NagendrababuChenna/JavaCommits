package core.interfaces;

public class TestInterace {
	
	public static void main(String[] args) {

		final float PI_VALUE = 1.3f;
		VehicleParent v = new MaruthiChildToCar();
		RadioParentToCar r = new MaruthiChildToCar();
		r.playAudio();
		System.out.println();
	}

}
