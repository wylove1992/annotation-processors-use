package io.github.wy.example.tables;

import io.github.wy.annotation.Table;

import java.util.function.Function;

/**
 * @author rycat
 * @since 2023/11/25
 */
@Table(name = "hi, this is name property", nameList = true)
public class Person {
    Integer boxInt = 41;
    byte byteType = 4;
    double doubleType = 414D;
    byte[] byteArrayType = null;
    Object objectType = null;
    Function<String, String> functionType = s->s + s;
    private byte privateByteType = 4;
    private double privateDoubleType = 414D;
    private byte[] privateByteArrayType = null;
    private Object privateObjectType = null;
    private Function<String, String> privateFunctionType = s->s + s;
    public byte publicByteType = 4;
    public double publicDoubleType = 414D;
    public byte[] publicByteArrayType = null;
    public Object publicObjectType = null;
    public Function<String, String> publicFunctionType = s->s + s;
    private static byte privateStaticByteType = 4;
    private static double privateStaticDoubleType = 414D;
    private static byte[] privateStaticByteArrayType = null;
    private static Object privateStaticObjectType = null;
    private static Function<String, String> privateStaticFunctionType = s->s + s;
    private static final byte privateStaticFinalByteType = 4;
    private static final double privateStaticFinalDoubleType = 414D;
    private static final Double privateStaticFinalBoxDoubleType = 414414D;
    private static final byte[] privateStaticFinalByteArrayType = null;
    private static final Object privateStaticFinalObjectType = null;
    private static final Function<String, String> privateStaticFinalFunctionType = s->s + s;
    final int onlyFinal = 4152;
}
