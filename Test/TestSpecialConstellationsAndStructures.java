package Test;

import static com.destranix.glslang.Main.*;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;

import com.destranix.glslang.CList;
import com.destranix.glslang.CMap;
import com.destranix.glslang.CPair;
import com.destranix.glslang.CSet;
import com.destranix.glslang.CVector;
import com.destranix.glslang.EProfile;
import com.destranix.glslang.EShLanguage;
import com.destranix.glslang.Global;
import com.destranix.glslang.IntCMap;
import com.destranix.glslang.IntKeyedCMap;
import com.destranix.glslang.IntKeyedIntArrayCMap;
import com.destranix.glslang.PointerBoundObject;
import com.destranix.glslang.SpvVersionStruct;
import com.destranix.glslang.TConstUnion;
import com.destranix.glslang.TInfoSink;
import com.destranix.glslang.TIntermediate;
import com.destranix.glslang.TParseContext;
import com.destranix.glslang.TSymbolTable;

public class TestSpecialConstellationsAndStructures {

	public static void main(String[] args) throws IOException {
		boolean callInitFuncts = true;
		if(args != null &&  Arrays.asList(args).contains("-noCallInitFuncts")){
			callInitFuncts = false;
		}
		if(callInitFuncts){
			InitializeProcess();
		}
		
		
		Global.GetVersion().getMinor();
		
		TConstUnion union = new TConstUnion();
		
		union.setI64Const(BigInteger.valueOf(1234));
		
		if(!BigInteger.valueOf(1234).equals(union.getI64Const())) {throw new AssertionError("Error when handeling BigInteger!");};
		
		union.setUConst(3);
		
		if(!(union.getUConst() == 3)) {throw new AssertionError("Error when handeling unsigned values!");};
		
		union.free();
		
		TSymbolTable table = new TSymbolTable();
		TIntermediate interm = new TIntermediate(EShLanguage.EShLangVertex);
		SpvVersionStruct spvVersion = new SpvVersionStruct();
		TInfoSink sink = new TInfoSink();
		TParseContext context = new TParseContext(table, interm, false, 0, EProfile.ENoProfile, spvVersion, EShLanguage.EShLangVertex, sink);
		
		context.isEsProfile();//Supertype methods callable
		
		context.setLineCallback((int i0, int i1, boolean b0, int i2, String s0) -> {
			System.out.println("Test succeeded!");//Do anything not removed by compiler or similiar.
		});//Java function assignable
		
		context.notifyLineDirective(0, 0, true, 0, "test");//Java function callable
		
		context.free();
		sink.free();
		spvVersion.free();
		interm.free();
		table.free();
		
		//Test Structures
		TConstUnion union1 = new TConstUnion();
		TConstUnion union2 = new TConstUnion();
		
		int[] arr = new int[]{1, 2};
		
		IntKeyedIntArrayCMap map1 = new IntKeyedIntArrayCMap();
		IntKeyedCMap<TConstUnion> map2 = new IntKeyedCMap<TConstUnion>();
		IntCMap<TConstUnion> map3 = new IntCMap<TConstUnion>();
		CMap<TConstUnion, TConstUnion> map4 = new CMap<TConstUnion, TConstUnion>();
		
		CPair<TConstUnion, TConstUnion> pair = new CPair<TConstUnion, TConstUnion>();
		CList<TConstUnion> list = new CList<TConstUnion>();
		CVector<TConstUnion> vector = new CVector<TConstUnion>();
		CSet<TConstUnion> set = new CSet<TConstUnion>();
		
		if(!(map1.size() == 0)) {throw new AssertionError("size returned wrong value!");};
		if(!map1.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(map1.containsKey(0)) {throw new AssertionError("containsKey returned wrong value!");};
		if(map1.containsValue(arr)) {throw new AssertionError("containsValue returned wrong value!");};
		
		map1.put(0, arr);
		
		if(!(map1.size() == 1)) {throw new AssertionError("size returned wrong value!");};
		if(map1.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(!map1.containsKey(0)) {throw new AssertionError("containsKey returned wrong value!");};
		if(!map1.containsValue(arr)) {throw new AssertionError("containsValue returned wrong value!");};
		if(!map1.containsValue(new int[]{1, 2})) {throw new AssertionError("containsValue returned wrong value!");};
		if(!Arrays.equals(map1.get(0), arr)) {throw new AssertionError("get returned wrong value!");};
		
		if(!(map1.keySet().size() == 1 && map1.keySet().contains(0))) {throw new AssertionError("keySet returned wrong value!");};
		if(!(map1.values().size() == 1)) {throw new AssertionError("values returned wrong value!");};
		for(Entry<Integer, int[]> entry : map1.entrySet()){
			if(!(entry.getKey().intValue() == 0)) {throw new AssertionError("entrySet or getKey returned wrong value!");};
			if(!Arrays.equals(entry.getValue(), arr)) {throw new AssertionError("entrySet or getValue returned wrong value!");};
			if(!Arrays.equals(entry.setValue(arr), arr)) {throw new AssertionError("setValue returned wrong value!");};
		}
		
		if(!Arrays.equals(map1.put(0, arr), arr)) {throw new AssertionError("put returned wrong value!");};
		
		map1.put(1, arr);
		
		if(!Arrays.equals(map1.remove(0), arr)) {throw new AssertionError("remove returned wrong value!");};
		
		map1.clear();
		
		if(!map1.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		
		map1.free();
		
		if(!(map2.size() == 0)) {throw new AssertionError("size returned wrong value!");};
		if(!map2.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(map2.containsKey(0)) {throw new AssertionError("containsKey returned wrong value!");};
		if(map2.containsValue(union1)) {throw new AssertionError("containsValue returned wrong value!");};
		
		map2.put(0, union1);
		
		if(!(map2.size() == 1)) {throw new AssertionError("size returned wrong value!");};
		if(map2.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(!map2.containsKey(0)) {throw new AssertionError("containsKey returned wrong value!");};
		if(!map2.containsValue(union1)) {throw new AssertionError("containsValue returned wrong value!");};
		if(!map2.get(0).cast(TConstUnion.class).equals(union1)) {throw new AssertionError("get returned wrong value!");};
		
		if(!(map2.keySet().size() == 1 && map2.keySet().contains(0))) {throw new AssertionError("keySet returned wrong value!");};
		if(!(map2.values().size() == 1 && map2.values().contains(union1))) {throw new AssertionError("values returned wrong value!");};
		for(Entry<Integer, PointerBoundObject> entry : map2.entrySet()){
			if(!entry.getKey().equals(Integer.valueOf(0))) {throw new AssertionError("entrySet or getKey returned wrong value!");};
			if(!entry.getValue().cast(TConstUnion.class).equals(union1)) {throw new AssertionError("entrySet or getValue returned wrong value!");};
			if(!entry.setValue(union1).cast(TConstUnion.class).equals(union1)) {throw new AssertionError("setValue returned wrong value!");};
		}
		
		if(!map2.put(0, union1).cast(TConstUnion.class).equals(union1)) {throw new AssertionError("put returned wrong value!");};
		
		map2.put(1, union1);
		
		if(!map2.remove(0).cast(TConstUnion.class).equals(union1)) {throw new AssertionError("remove returned wrong value!");};
		
		map2.clear();
		
		if(!map2.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		
		map2.free();
		
		if(!(map3.size() == 0)) {throw new AssertionError("size returned wrong value!");};
		if(!map3.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(map3.containsKey(union1)) {throw new AssertionError("containsKey returned wrong value!");};
		if(map3.containsValue(0)) {throw new AssertionError("containsValue returned wrong value!");};
		
		map3.put(union1, 0);
		
		if(!(map3.size() == 1)) {throw new AssertionError("size returned wrong value!");};
		if(map3.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(!map3.containsKey(union1)) {throw new AssertionError("containsKey returned wrong value!");};
		if(!map3.containsValue(0)) {throw new AssertionError("containsValue returned wrong value!");};
		if(!(map3.getInt(union1) == 0)) {throw new AssertionError("get returned wrong value!");};
		
		if(!(map3.keySet().size() == 1 && map3.keySet().contains(union1))) {throw new AssertionError("keySet returned wrong value!");};
		if(!(map3.values().size() == 1 && map3.values().contains(Integer.valueOf(0)))) {throw new AssertionError("values returned wrong value!");};
		for(Entry<PointerBoundObject, Integer> entry : map3.entrySet()){
			if(!entry.getKey().cast(TConstUnion.class).equals(union1)) {throw new AssertionError("entrySet or getKey returned wrong value!");};
			if(!(entry.getValue().intValue() == 0)) {throw new AssertionError("entrySet or getValue returned wrong value!");};
			if(!entry.setValue(Integer.valueOf(0)).equals(Integer.valueOf(0))) {throw new AssertionError("setValue returned wrong value!");};
		}
		
		if(!(map3.putInt(union1, 0) == 0)) {throw new AssertionError("put returned wrong value!");};
		
		map3.put(union2, 1);
		
		if(!map3.remove(union1).equals(Integer.valueOf(0))) {throw new AssertionError("remove returned wrong value!");};
		
		map3.clear();
		
		if(!map3.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		
		map3.free();
		
		if(!(map4.size() == 0)) {throw new AssertionError("size returned wrong value!");};
		if(!map4.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(map4.containsKey(union1)) {throw new AssertionError("containsKey returned wrong value!");};
		if(map4.containsValue(union1)) {throw new AssertionError("containsValue returned wrong value!");};
		
		map4.put(union1, union1);
		
		if(!(map4.size() == 1)) {throw new AssertionError("size returned wrong value!");};
		if(map4.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(!map4.containsKey(union1)) {throw new AssertionError("containsKey returned wrong value!");};
		if(!map4.containsValue(union1)) {throw new AssertionError("containsValue returned wrong value!");};
		if(!map4.get(union1).cast(TConstUnion.class).equals(union1)) {throw new AssertionError("get returned wrong value!");};
		
		if(!(map4.keySet().size() == 1 && map4.keySet().contains(union1))) {throw new AssertionError("keySet returned wrong value!");};
		if(!(map4.values().size() == 1 && map4.values().contains(union1))) {throw new AssertionError("values returned wrong value!");};
		for(Entry<PointerBoundObject, PointerBoundObject> entry : map4.entrySet()){
			if(!entry.getKey().cast(TConstUnion.class).equals(union1)) {throw new AssertionError("entrySet or getKey returned wrong value!");};
			if(!entry.getValue().cast(TConstUnion.class).equals(union1)) {throw new AssertionError("entrySet or getValue returned wrong value!");};
			if(!entry.setValue(union1).cast(TConstUnion.class).equals(union1)) {throw new AssertionError("setValue returned wrong value!");};
		}
		
		if(!map4.put(union1, union1).cast(TConstUnion.class).equals(union1)) {throw new AssertionError("put returned wrong value!");};
		
		map4.put(union2, union2);
		
		if(!map4.remove(union1).cast(TConstUnion.class).equals(union1)) {throw new AssertionError("remove returned wrong value!");};
		
		map4.clear();
		
		if(!map4.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		
		map4.free();

		if(!(pair.setFirst(union1) == null)) {throw new AssertionError("setFirst returned wrong value!");};
		if(!(pair.setLast(union1) == null)) {throw new AssertionError("setLast returned wrong value!");};
		if(!pair.getFirst().cast(TConstUnion.class).equals(union1)) {throw new AssertionError("getFirst returned wrong value!");};
		if(!pair.getLast().cast(TConstUnion.class).equals(union1)) {throw new AssertionError("getLast returned wrong value!");};
		
		pair.free();
		
		if(!(list.size() == 0)) {throw new AssertionError("size returned wrong value!");};
		if(!list.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(list.contains(union1)) {throw new AssertionError("containsKey returned wrong value!");};
		
		if(!list.add(union1)) {throw new AssertionError("add returned wrong value!");};
		
		if(!(list.size() == 1)) {throw new AssertionError("size returned wrong value!");};
		if(list.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(!list.contains(union1)) {throw new AssertionError("contains returned wrong value!");};
		
		list.add(0, union2);
		
		if(!list.get(0).cast(TConstUnion.class).equals(union2)) {throw new AssertionError("get returned wrong value!");};
		if(!list.get(1).cast(TConstUnion.class).equals(union1)) {throw new AssertionError("get returned wrong value!");};
		if(!list.set(1, union2).cast(TConstUnion.class).equals(union1)) {throw new AssertionError("set returned wrong value!");};
		if(!list.remove(1).cast(TConstUnion.class).equals(union2)) {throw new AssertionError("set returned wrong value!");};
		if(!list.remove(union2)) {throw new AssertionError("set returned wrong value!");};
		
		list.clear();
		
		if(!list.add(union1)) {throw new AssertionError("add returned wrong value!");};
		if(!list.add(union1)) {throw new AssertionError("add returned wrong value!");};
		
		if(!(list.indexOf(union1) == 0)) {throw new AssertionError("indexOf returned wrong value!");};
		if(!(list.lastIndexOf(union1) == 1)) {throw new AssertionError("lastIndexOf returned wrong value!");};
		
		for(PointerBoundObject elem : list){
			if(!elem.cast(TConstUnion.class).equals(union1)) {throw new AssertionError("iterator returned wrong value!");};
		}
		
		list.add(1, union2);
		
		List<PointerBoundObject> subList = list.subList(1,3);
		
		if(!(subList.size() == 2)) {throw new AssertionError("subList or size returned wrong value!");};
		if(!subList.get(0).cast(TConstUnion.class).equals(union2)) {throw new AssertionError("subList or get returned wrong value!");};
		
		ListIterator<PointerBoundObject> listIter = list.listIterator(1);
		
		if(!listIter.hasNext()) {throw new AssertionError("hasNext returned wrong value!");};
		if(!listIter.next().cast(TConstUnion.class).equals(union2)) {throw new AssertionError("next returned wrong value!");};
		if(!listIter.hasPrevious()) {throw new AssertionError("hasPrevious returned wrong value!");};
		if(!listIter.previous().cast(TConstUnion.class).equals(union2)) {throw new AssertionError("next returned wrong value!");};
		listIter.remove();
		listIter.set(union2);
		
		list.clear();
		
		if(!list.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		
		list.free();
		
		if(!(vector.size() == 0)) {throw new AssertionError("size returned wrong value!");};
		if(!vector.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(vector.contains(union1)) {throw new AssertionError("containsKey returned wrong value!");};
		
		if(!vector.add(union1)) {throw new AssertionError("add returned wrong value!");};
		
		if(!(vector.size() == 1)) {throw new AssertionError("size returned wrong value!");};
		if(vector.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(!vector.contains(union1)) {throw new AssertionError("contains returned wrong value!");};
		
		vector.add(0, union2);
		vector.add(1, union1);
		
		if(!vector.get(0).cast(TConstUnion.class).equals(union2)) {throw new AssertionError("get returned wrong value!");};
		if(!vector.get(1).cast(TConstUnion.class).equals(union1)) {throw new AssertionError("get returned wrong value!");};
		if(!vector.set(1, union2).cast(TConstUnion.class).equals(union1)) {throw new AssertionError("set returned wrong value!");};
		if(!vector.remove(1).cast(TConstUnion.class).equals(union2)) {throw new AssertionError("set returned wrong value!");};
		if(!vector.remove(union2)) {throw new AssertionError("set returned wrong value!");};
		
		vector.clear();
		
		if(!vector.add(union1)) {throw new AssertionError("add returned wrong value!");};
		if(!vector.add(union1)) {throw new AssertionError("add returned wrong value!");};
		
		if(!(vector.indexOf(union1) == 0)) {throw new AssertionError("indexOf returned wrong value!");};
		if(!(vector.lastIndexOf(union1) == 1)) {throw new AssertionError("lastIndexOf returned wrong value!");};
		
		for(PointerBoundObject elem : vector){
			if(!elem.cast(TConstUnion.class).equals(union1)) {throw new AssertionError("iterator returned wrong value!");};
		}
		
		vector.add(1, union2);
		
		subList = vector.subList(1,3);
		
		if(!(subList.size() == 2)) {throw new AssertionError("subList or size returned wrong value!");};
		if(!subList.get(0).cast(TConstUnion.class).equals(union2)) {throw new AssertionError("subList or get returned wrong value!");};
		
		listIter = vector.listIterator(1);
		
		if(!listIter.hasNext()) {throw new AssertionError("hasNext returned wrong value!");};
		if(!listIter.next().cast(TConstUnion.class).equals(union2)) {throw new AssertionError("next returned wrong value!");};
		if(!listIter.hasPrevious()) {throw new AssertionError("hasPrevious returned wrong value!");};
		if(!listIter.previous().cast(TConstUnion.class).equals(union2)) {throw new AssertionError("next returned wrong value!");};
		listIter.remove();
		listIter.set(union2);
		
		vector.clear();
		
		if(!(set.size() == 0)) {throw new AssertionError("size returned wrong value!");};
		if(!set.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(!!set.contains(union1)) {throw new AssertionError("containsKey returned wrong value!");};
		
		if(!set.add(union1)) {throw new AssertionError("add returned wrong value!");};
		
		if(!(set.size() == 1)) {throw new AssertionError("size returned wrong value!");};
		if(!!set.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		if(!set.contains(union1)) {throw new AssertionError("contains returned wrong value!");};
		
		set.add(union2);
		
		if(!set.remove(union2)) {throw new AssertionError("set returned wrong value!");};
		
		if(set.add(union1)) {throw new AssertionError("add returned wrong value!");};
		
		for(PointerBoundObject elem : set){
			if(!elem.cast(TConstUnion.class).equals(union1)) {throw new AssertionError("iterator returned wrong value!");};
		}
		
		set.clear();
		
		if(!set.isEmpty()) {throw new AssertionError("isEmpty returned wrong value!");};
		
		set.free();
		
		union1.free();
		union2.free();
		if(callInitFuncts){
			FinalizeProcess();
		}
		
		System.out.println("Test succeeded!");
	}
	
}
