package nl.jchmb.classifiers.classifier;

import nl.jchmb.classifiers.observation.Observation;

public interface Classifier<T extends Observation> {
	public Classification classify(T observation);
}
