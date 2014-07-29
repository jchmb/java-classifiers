package nl.jchmb.classifiers.classifier;

import nl.jchmb.classifiers.Observation;

public interface Classifier<T extends Observation> {
	public Classification classify(T observation);
}
