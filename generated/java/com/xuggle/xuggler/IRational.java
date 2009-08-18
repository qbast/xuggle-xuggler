/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.37
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
/**
 * This class wraps represents a Rational number for the Xuggler.  
 * <p>  
 * Video formats often use rational numbers, and converting between 
 *  
 * them willy nilly can lead to rounding errors, and eventually, out 
 *  
 * of sync problems. Therefore we use IRational objects to pass  
 * around Rational Numbers and avoid conversion until the very last 
 * moment.  
 * </p><p>  
 * Note: There are some static convenience methods  
 * in this class that start with s*. They start with s  
 * (as opposed to overloading methods (e.g. sAdd(...) vs. add(...)). 
 *  
 * </p>  
 */
public class IRational extends RefCounted {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected IRational(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.SWIGIRationalUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected IRational(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(XugglerJNI.SWIGIRationalUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(IRational obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new IRational object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public IRational copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new IRational(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof IRational)
      equal = (((IRational)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

  /**
   * Prints the contents of this object as a fraction.
   * @return &quot;{@link #getNumerator()}/{@link #getDenominator()}&quot;
   */
   
  @Override
  public String toString()
  {
    return "" + getNumerator() + "/" + getDenominator();
  }
  /**
   * Is this number positive?
   * @return true if > 0; false if not.
   */
  public boolean isPositive()
  {
    if (getDenominator() == 0)
      return false;
    return getDouble() > 0;
  }
  /**
   * Is this number not null and positive.
   * @param num the number; may be null
   * @return true if not-null and > 0; else false;
   */
  public static boolean positive(IRational num)
  {
    if (num == null)
      return false;
    return num.isPositive();
  }
  /**
   * Is this number negative?
   * @return true if < 0; false if not.
   */
  public boolean isNegative()
  {
    if (getDenominator() == 0)
      return false;
    return getDouble() < 0;
  }
  /**
   * Is this number not null and negative.
   * @param num the number; may be null
   * @return true if not-null and < 0; else false;
   */
  public static boolean negative(IRational num)
  {
    if (num == null)
      return false;
    return num.isNegative();
  }

/**
 * Get the numerator for this rational.  
 * @return	the numerator.  
 */
  public int getNumerator() {
    return XugglerJNI.IRational_getNumerator(swigCPtr, this);
  }

/**
 * Get the denominator for this rational.  
 * @return	the denominator.  
 */
  public int getDenominator() {
    return XugglerJNI.IRational_getDenominator(swigCPtr, this);
  }

/**
 * Creates a new IRational object by copying (by value) this object. 
 *  
 * @return	the new object  
 */
  public IRational copy() {
    long cPtr = XugglerJNI.IRational_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Compare a rational to this rational  
 * @param	other second rational  
 *  
 */
  public int compareTo(IRational other) {
    return XugglerJNI.IRational_compareTo(swigCPtr, this, IRational.getCPtr(other), other);
  }

/**
 * Compare two rationals  
 * @param	a the first rational  
 * @param	b the second rational  
 * @return	0 if a==b, 1 if a>b and -1 if b<a.  
 */
  public static int sCompareTo(IRational a, IRational b) {
    return XugglerJNI.IRational_sCompareTo(IRational.getCPtr(a), a, IRational.getCPtr(b), b);
  }

/**
 * Rational to double conversion.  
 * @return	(double) a  
 */
  public double getDouble() {
    return XugglerJNI.IRational_getDouble(swigCPtr, this);
  }

/**
 * Reduce a fraction to it's lowest common denominators.  
 * This is useful for framerate calculations.  
 * @param	num the src numerator.  
 * @param	den the src denominator.  
 * @param	max the maximum allowed for nom & den in the reduced fraction. 
 *		  
 * @return	1 if exact, 0 otherwise  
 */
  public int reduce(long num, long den, long max) {
    return XugglerJNI.IRational_reduce(swigCPtr, this, num, den, max);
  }

/**
 * Reduce a fraction to it's lowest common denominators.  
 * This is useful for framerate calculations.  
 * @param	dst The destination rational  
 * @param	num the src numerator.  
 * @param	den the src denominator.  
 * @param	max the maximum allowed for nom & den in the reduced fraction. 
 *		  
 * @return	1 if exact, 0 otherwise  
 */
  public static int sReduce(IRational dst, long num, long den, long max) {
    return XugglerJNI.IRational_sReduce(IRational.getCPtr(dst), dst, num, den, max);
  }

/**
 * Multiplies this number by arg  
 * @param	arg number to mulitply by.  
 * @return	this*arg.  
 */
  public IRational multiply(IRational arg) {
    long cPtr = XugglerJNI.IRational_multiply(swigCPtr, this, IRational.getCPtr(arg), arg);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Multiples a by b.  
 * @param	a the first number  
 * @param	b the second number.  
 * @return	a*b  
 */
  public static IRational sMultiply(IRational a, IRational b) {
    long cPtr = XugglerJNI.IRational_sMultiply(IRational.getCPtr(a), a, IRational.getCPtr(b), b);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Divides this rational by arg.  
 * @param	arg The divisor to use.  
 * @return	this/arg.  
 */
  public IRational divide(IRational arg) {
    long cPtr = XugglerJNI.IRational_divide(swigCPtr, this, IRational.getCPtr(arg), arg);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Divides a by b.  
 * @param	a The first number.  
 * b The second number.  
 * @return	a/b.  
 */
  public static IRational sDivide(IRational a, IRational b) {
    long cPtr = XugglerJNI.IRational_sDivide(IRational.getCPtr(a), a, IRational.getCPtr(b), b);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Subtracts arg from this rational  
 * @param	arg The amount to subtract from this.  
 * @return	this-arg.  
 */
  public IRational subtract(IRational arg) {
    long cPtr = XugglerJNI.IRational_subtract(swigCPtr, this, IRational.getCPtr(arg), arg);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Subtracts a from b.  
 * @param	a The first number.  
 * b The second number.  
 * @return	a-b.  
 */
  public static IRational sSubtract(IRational a, IRational b) {
    long cPtr = XugglerJNI.IRational_sSubtract(IRational.getCPtr(a), a, IRational.getCPtr(b), b);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Adds arg to this rational  
 * @param	arg The amount to add to this.  
 * @return	this+arg.  
 */
  public IRational add(IRational arg) {
    long cPtr = XugglerJNI.IRational_add(swigCPtr, this, IRational.getCPtr(arg), arg);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Adds a to b.  
 * @param	a The first number.  
 * b The second number.  
 * @return	a+b.  
 */
  public static IRational sAdd(IRational a, IRational b) {
    long cPtr = XugglerJNI.IRational_sAdd(IRational.getCPtr(a), a, IRational.getCPtr(b), b);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Takes a value scaled in increments of origBase and gives the  
 * equivalent value scaled in terms of this Rational.  
 * @param	origValue The original int64_t value you care about.  
 * @param	origBase The original base Rational that origValue is scaled 
 *		 with.  
 * @return	The new integer value, scaled in units of this IRational. 
 *		  
 */
  public long rescale(long origValue, IRational origBase) {
    return XugglerJNI.IRational_rescale__SWIG_0(swigCPtr, this, origValue, IRational.getCPtr(origBase), origBase);
  }

/**
 * Takes a value scaled in increments of origBase and gives the  
 * equivalent value scaled in terms of this Rational.  
 * @param	origValue The original int64_t value you care about.  
 * @param	origBase The original base Rational that origValue is scaled 
 *		 with.  
 *  
 * @return	The new integer value, scaled in units of this IRational. 
 *		  
 */
  public static long sRescale(long origValue, IRational origBase, IRational newBase) {
    return XugglerJNI.IRational_sRescale__SWIG_0(origValue, IRational.getCPtr(origBase), origBase, IRational.getCPtr(newBase), newBase);
  }

/**
 * Get a new rational that will be set to 0/0.  
 * The rational will not have {@link #init()} called  
 * and hence will be modifiable by {@link #setValue(double)}  
 * until {@link #init()} is called.  
 * @return	a rational number object  
 */
  public static IRational make() {
    long cPtr = XugglerJNI.IRational_make__SWIG_0();
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Converts a double precision floating point number to a rational. 
 *  
 * @param	d double to convert  
 * @return	A new Rational; caller must release() when done.  
 */
  public static IRational make(double d) {
    long cPtr = XugglerJNI.IRational_make__SWIG_1(d);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Creates deep copy of a Rational from another Rational.  
 * @param	src The source Rational to copy.  
 * @return	A new Rational; Returns null  
 * if src is null.  
 */
  public static IRational make(IRational src) {
    long cPtr = XugglerJNI.IRational_make__SWIG_2(IRational.getCPtr(src), src);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Create a rational from a numerator and denominator.  
 * We will always reduce this to the lowest num/den pair  
 * we can, but never having den exceed what was passed in.  
 * @param	num The numerator of the resulting Rational  
 * @param	den The denominator of the resulting Rational  
 * @return	A new Rational;  
 */
  public static IRational make(int num, int den) {
    long cPtr = XugglerJNI.IRational_make__SWIG_3(num, den);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Takes a value scaled in increments of origBase and gives the  
 * equivalent value scaled in terms of this Rational.  
 * @param	origValue The original int64_t value you care about.  
 * @param	origBase The original base Rational that origValue is scaled 
 *		 with.  
 * @param	rounding How you want rounding to occur  
 * @return	The new integer value, scaled in units of this IRational. 
 *		  
 */
  public long rescale(long origValue, IRational origBase, IRational.Rounding rounding) {
    return XugglerJNI.IRational_rescale__SWIG_1(swigCPtr, this, origValue, IRational.getCPtr(origBase), origBase, rounding.swigValue());
  }

/**
 * Takes a value scaled in increments of origBase and gives the  
 * equivalent value scaled in terms of this Rational.  
 * @param	origValue The original int64_t value you care about.  
 * @param	origBase The original base Rational that origValue is scaled 
 *		 with.  
 *  
 * @param	rounding How you want rounding to occur  
 * @return	The new integer value, scaled in units of this IRational. 
 *		  
 */
  public static long sRescale(long origValue, IRational origBase, IRational newBase, IRational.Rounding rounding) {
    return XugglerJNI.IRational_sRescale__SWIG_1(origValue, IRational.getCPtr(origBase), origBase, IRational.getCPtr(newBase), newBase, rounding.swigValue());
  }

/**
 * Rescales a long value to another long value.  
 * <p>  
 * This method doesn't use IRational values, but  
 * instead uses numerators and denominators  
 * passed in by the caller. It will not result  
 * in any memory allocations.  
 * </p>  
 * @param	srcValue The value to rescale.  
 * @param	dstNumerator The numerator of the units  
 * you want to scale to. Must be non-zero.  
 * @param	dstDenominator The denominator of the units  
 * you want to scale to. Must be non-zero.  
 * @param	srcNumerator The numerator of the units  
 * <code>srcValue</code> is expressed in.  
 * Must be non-zero.  
 * @param	srcDenominator The denominator of the units  
 * <code>srcValue</code> is expressed in.  
 * Must be non-zero.  
 * @param	rounding How you want rounding to occur  
 * @return	The new integer value, scaled in units of  
 * dstNumerator/dstNumerator, or 0 if there  
 * is a parameter error.  
 */
  public static long rescale(long srcValue, int dstNumerator, int dstDenominator, int srcNumerator, int srcDenominator, IRational.Rounding rounding) {
    return XugglerJNI.IRational_rescale__SWIG_2(srcValue, dstNumerator, dstDenominator, srcNumerator, srcDenominator, rounding.swigValue());
  }

/**
 * Sets the numerator on this object.  
 * <p>  
 * If {@link #isFinalized} is true, then this method is ignored.  
 * </p>  
 * @since	3.2  
 */
  public void setNumerator(int value) {
    XugglerJNI.IRational_setNumerator(swigCPtr, this, value);
  }

/**
 * Sets the denominator on this object.  
 * <p>  
 * If {@link #isFinalized} is true, then this method is ignored.  
 * </p>  
 * @since	3.2  
 */
  public void setDenominator(int value) {
    XugglerJNI.IRational_setDenominator(swigCPtr, this, value);
  }

/**
 * Sets the numerator and denominator on this object by  
 * reducing the double to the closest integer numerator  
 * and denominator.  
 * <p>  
 * If {@link #isFinalized} is true, then this method is ignored.  
 * </p>  
 * @since	3.2  
 */
  public void setValue(double value) {
    XugglerJNI.IRational_setValue(swigCPtr, this, value);
  }

/**
 * An alias for {@link #getDouble()} but matching JavaBean  
 * conventions.  
 * @since	3.2  
 */
  public double getValue() {
    return XugglerJNI.IRational_getValue(swigCPtr, this);
  }

/**
 * Returns true if {@link #init()} has been called and  
 * this object is now considered finalized and immutable.  
 * @since	3.2  
 */
  public boolean isFinalized() {
    return XugglerJNI.IRational_isFinalized(swigCPtr, this);
  }

/**
 * Marks this object as finalized and immutable. Any  
 * setters called after the first {@link #init()} call  
 * will be ignored.  
 * <p>  
 * Most <code>make</code> methods will call this method  
 * automatically, with the exception of the blank factory  
 * method {@link #make()}.  
 * </p>  
 * @since	3.2  
 */
  public void init() {
    XugglerJNI.IRational_init(swigCPtr, this);
  }

  public enum Rounding {
    ROUND_ZERO(XugglerJNI.IRational_ROUND_ZERO_get()),
    ROUND_INF(XugglerJNI.IRational_ROUND_INF_get()),
    ROUND_DOWN(XugglerJNI.IRational_ROUND_DOWN_get()),
    ROUND_UP(XugglerJNI.IRational_ROUND_UP_get()),
    ROUND_NEAR_INF(XugglerJNI.IRational_ROUND_NEAR_INF_get());

    public final int swigValue() {
      return swigValue;
    }

    public static Rounding swigToEnum(int swigValue) {
      Rounding[] swigValues = Rounding.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Rounding swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Rounding.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Rounding() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Rounding(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Rounding(Rounding swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
