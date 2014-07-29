package nl.jchmb.classifiers.feature;

import nl.jchmb.classifiers.observation.Observation;

public class RawFeature<T extends Observation<Float>> implements Feature<T, Float> {
	private String key;
	
	public RawFeature(String key) {
		this.key = key;
	}
	
	@Override
	public float calculate(T observation) {
		return observation.getData(key);
	}
}
