package nl.jchmb.classifiers.feature;

public interface Feature<Observation, Result> {
	public Result calculate(Observation observation);
}
