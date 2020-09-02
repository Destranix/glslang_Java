package com.destranix.glslang;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public abstract class CPrimitiveIterator<T, T_CONS> extends PointerBoundObject implements PrimitiveIterator<T, T_CONS> {

	public static class OfDouble extends CPrimitiveIterator<Double, DoubleConsumer>
			implements Iterator<Double>, PrimitiveIterator.OfDouble {

		private final int constructorIndex;

		protected OfDouble(PoisonClass p) {
			this.constructorIndex = -1;
		}

		protected OfDouble(byte[] ptr) {
			this.ptr = ptr;
			this.constructorIndex = -1;
		}

		@Override
		protected void load_intern() {
			if (ptr == null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
					default:
						throw new AssertionError("Reached unreachable state!");
				}
			}
		}

		@Override
		protected void free_intern() {
			if (ptr != null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_FREEABLE);
					default:
						throw new AssertionError("Reached unreachable state!");
				}
			}
		}

		@Override
		public void forEachRemaining(DoubleConsumer action) {
			while (hasNext()) {
				action.accept(next());
			}
		}

		@Override
		public boolean hasNext() {
			return Main.CPrimitiveIterator_OfDouble_hasNext(ptr);
		}

		@Override
		public Double next() {
			return Double.valueOf(nextDouble());
		}

		@Override
		public double nextDouble() {
			return Main.CPrimitiveIterator_OfDouble_next(ptr);
		}

	}

	public static class OfInt extends CPrimitiveIterator<Integer, IntConsumer>
			implements Iterator<Integer>, PrimitiveIterator.OfInt {

		private final int constructorIndex;

		protected OfInt(PoisonClass p) {
			this.constructorIndex = -1;
		}

		protected OfInt(byte[] ptr) {
			this.ptr = ptr;
			this.constructorIndex = -1;
		}

		@Override
		protected void load_intern() {
			if (ptr == null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
					default:
						throw new AssertionError("Reached unreachable state!");
				}
			}
		}

		@Override
		protected void free_intern() {
			if (ptr != null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_FREEABLE);
					default:
						throw new AssertionError("Reached unreachable state!");
				}
			}
		}

		@Override
		public void forEachRemaining(IntConsumer action) {
			while (hasNext()) {
				action.accept(next());
			}
		}

		@Override
		public boolean hasNext() {
			return Main.CPrimitiveIterator_OfInt_hasNext(ptr);
		}

		@Override
		public Integer next() {
			return Integer.valueOf(nextInt());
		}

		@Override
		public int nextInt() {
			return Main.CPrimitiveIterator_OfInt_next(ptr);
		}

	}

	public static class OfLong extends CPrimitiveIterator<Long, LongConsumer>
			implements Iterator<Long>, PrimitiveIterator.OfLong {

		private final int constructorIndex;

		protected OfLong(PoisonClass p) {
			this.constructorIndex = -1;
		}

		protected OfLong(byte[] ptr) {
			this.ptr = ptr;
			this.constructorIndex = -1;
		}

		@Override
		protected void load_intern() {
			if (ptr == null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_LOADABLE);
					default:
						throw new AssertionError("Reached unreachable state!");
				}
			}
		}

		@Override
		protected void free_intern() {
			if (ptr != null) {
				switch (constructorIndex) {
					case -1:
						throw new IllegalStateException(EXCEPTION_MSG_NOT_FREEABLE);
					default:
						throw new AssertionError("Reached unreachable state!");
				}
			}
		}

		@Override
		public void forEachRemaining(LongConsumer action) {
			while (hasNext()) {
				action.accept(next());
			}
		}

		@Override
		public boolean hasNext() {
			return Main.CPrimitiveIterator_OfLong_hasNext(ptr);
		}

		@Override
		public Long next() {
			return Long.valueOf(nextLong());
		}

		@Override
		public long nextLong() {
			return Main.CPrimitiveIterator_OfLong_next(ptr);
		}

	}

}
