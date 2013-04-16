package computedparameters;


public class PerfusionComputedSeriesParameters {

	private ComputedSeriesParameters	params;

	private PerfusionComputedSeriesParameters() {
		params = new ComputedSeriesParameters();
	}

	public static PerfusionComputedSeriesParameters create() {
		return new PerfusionComputedSeriesParameters();
	}

	public PerfusionComputedSeriesParameters endOfSignalIndex(String endOfSignalIndex) {
		params.addLongAndShortParam("endOfSignalIndex", endOfSignalIndex);
		return this;
	}

	public PerfusionComputedSeriesParameters CSFFilterMax(String CSFFilterMax) {
		params.addLongAndShortParam("CSFFilterMax", CSFFilterMax);
		return this;
	}

	public PerfusionComputedSeriesParameters formula(String CSFFilterMin) {
		params.addLongAndShortParam("CSFFilterMin", CSFFilterMin);
		return this;
	}

	public PerfusionComputedSeriesParameters acceptNeg(String noiseFilterCSF) {
		params.addLongOnlyParam("noiseFilterCSF", noiseFilterCSF);
		return this;
	}

	public ComputedSeriesParameters toResult() {
		return params;
	}
}
