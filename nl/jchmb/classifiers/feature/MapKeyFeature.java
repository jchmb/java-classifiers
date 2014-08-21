package nl.jchmb.classifiers.feature;

import java.util.HashMap;
import java.util.Map;

public class MapKeyFeature<Key, Result> 
		extends HashMap<Key, Result> implements Feature<Map<Key, Result>, Result> {
	private static final long serialVersionUID = -2399856890927070249L;
	private Key key;
	
	public MapKeyFeature(Key key) {
		this.key = key;
	}

	@Override
	public Result calculate(Map<Key, Result> observation) {
		return observation.get(key);
	}
}
