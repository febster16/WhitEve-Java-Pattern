package iterators;

import java.util.Vector;

import templates.Wedding;

public class WeddingIterator<T> implements IWeddingIterator<T>{
	
	Vector<Wedding> weddingParties;
	int position;

	public WeddingIterator(Vector<Wedding> weddingParties) {
		super();
		this.weddingParties = weddingParties;
		position = 0;
	}

	@Override
	public boolean hasNext() {
		if(position >= weddingParties.size()) {
			return false;
		}
		return true;
	}

	@Override
	public Wedding next() {
		return weddingParties.get(position++);
	}


	

}
