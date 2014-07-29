package nl.jchmb.classifiers.feature;

import nl.jchmb.classifiers.observation.Observation;

public interface Feature<T extends Observation<U>, U> {
	public float calculate(T observation);
}
