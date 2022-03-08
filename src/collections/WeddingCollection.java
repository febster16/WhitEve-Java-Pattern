package collections;

import java.util.Vector;

import iterators.IWeddingIterator;
import iterators.WeddingIterator;
import templates.Wedding;

public class WeddingCollection implements IWeddingCollection{
	
	Vector<Wedding> weddingParties;
	
	
	public Vector<Wedding> getWeddingParties() {
		return weddingParties;
	}


	public void setWeddingParties(Vector<Wedding> weddingParties) {
		this.weddingParties = weddingParties;
	}

	
	public WeddingCollection(Vector<Wedding> weddingParties) {
		super();
		this.weddingParties = weddingParties;
	}


	public void addWedding(Wedding wedding) {
		weddingParties.add(wedding);
	}

	@Override
	public IWeddingIterator createIterator() {
		return new WeddingIterator<>(weddingParties);
	}

	
}
