package JavaRevision;

public class InterfacesRevision implements CentralTraffic, RegionalTraffic 
{
	public static void main(String[] args) 
	{
		CentralTraffic cr = new InterfacesRevision();
		cr.redStop();
		cr.yellowWait();
		cr.greenGo();
		
		InterfacesRevision ir = new InterfacesRevision();
		ir.walkAtGreenMan();
		ir.greenGo();
		ir.speedLimit();

	}

	@Override
	public void redStop() {
		System.out.println("Stop at Red light");		
	}

	@Override
	public void greenGo() {
		System.out.println("Go at Green light");
		
	}

	@Override
	public void yellowWait() {
		System.out.println("Wait at flashing yellow light");
		
	}

	public void walkAtGreenMan() {
		System.out.println("Cross only when you see the green man");		
	}

	@Override
	public void speedLimit() {
		System.out.println("The national speed limit is 60mph");
		
	}

}
