package util;

public class Conversao {
	public static final double IOF = 0.06;

	public static double Converter(double vd, double vc) {
		return vd * vc * (1.0 + IOF);
	}

}
