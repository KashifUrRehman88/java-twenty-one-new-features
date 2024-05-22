package com.java21.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kashif Ur Rehman
 * 
 * Sequence Collections (This is not provisional feature , instead it is permanent feature which is for better sequence order mantain karnay k lye):- New Interfaces created for 
 * sequenced order . First , Second , ... (like before this, we have a list, if we have to get first element we can easily get it, then for last element we have to use index, but 
 * now with this feature we can use getFirst/getLast etc).
 * 
 * Summary :-
 * 1. List now has SequencedCollection as its immediate superinterface.
 * 2. Deque now has SequencedCollection as its immediate superinterface.
 * 3. LinkedHashSet additionally implements SequencedSet.
 * 4. SortedSet now has SequencedSet as its immediate superinterface.
 * 5. LinkedHashMap additionally implements SequencedMap.
 * 6. SortedMap now has SequencedMap as its immediate superinterface. 
 * 
 */

public class SequenceCollection {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		
		list.addFirst("First Element");
		list.addLast("Last Element");
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		
		System.out.println(list.getLast());
		
		System.out.println(list.reversed());

	}

}
