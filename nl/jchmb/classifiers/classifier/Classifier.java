package nl.jchmb.classifiers.classifier;

import nl.jchmb.classifiers.feature.Feature;

public interface Classifier<Observation, ClassifierClass, Result> {	
	public void addFeature(Feature<Observation, Result> feature);
	public ClassifierClass classify(Observation observation);
}
