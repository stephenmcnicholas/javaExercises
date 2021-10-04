package banking;

public interface IBaseRate {
	default double getBaseRate() {
		return 4.75;
	}
}
