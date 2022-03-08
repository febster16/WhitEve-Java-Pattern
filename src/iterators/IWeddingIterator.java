package iterators;

import templates.Wedding;

public interface IWeddingIterator<T> {
	boolean hasNext();
	Wedding next();
}
