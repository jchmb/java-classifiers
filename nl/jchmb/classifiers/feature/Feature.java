package nl.jchmb.classifiers.feature;

import nl.jchmb.classifiers.Observation;

public interface Feature<T extends Observation> {
	public float calculate(T observation);
}
