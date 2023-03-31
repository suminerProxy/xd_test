package com.wrapper.proxyapplication;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MultiDexForMemoryDex {
    static final String TAG = "MultiDexForMemoryDex";
    static int hasInjected;

    private MultiDexForMemoryDex() {
    }

    private static ArrayList<File> splitPaths(String str) {
        ArrayList<File> arrayList = new ArrayList<>();
        if (str != null) {
            for (String str2 : str.split(File.pathSeparator)) {
                arrayList.add(new File(str2));
            }
        }
        return arrayList;
    }

    private static String getprefixname(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str = str.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = str.lastIndexOf(".");
        return lastIndexOf2 >= 0 ? str.substring(0, lastIndexOf2) : str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005f -> B:37:0x0071). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0064 -> B:37:0x0071). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0069 -> B:37:0x0071). Please submit an issue!!! */
    private static ArrayList<Object> openallDexes(ClassLoader classLoader, String str, String str2) {
        ArrayList<File> splitPaths = splitPaths(str);
        File file = new File(str2);
        ArrayList<Object> arrayList = null;
        try {
            try {
                Object obj = findField(classLoader, "pathList").get(classLoader);
                try {
                    Method findMethod = findMethod(obj, "loadDexFile", File.class, File.class);
                    try {
                        ArrayList<Object> arrayList2 = new ArrayList<>();
                        try {
                            Iterator<File> it = splitPaths.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(findMethod.invoke(obj, it.next(), file));
                            }
                            arrayList = arrayList2;
                        } catch (IllegalAccessException e) {
                            e = e;
                            arrayList = arrayList2;
                            e.printStackTrace();
                            return arrayList;
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            arrayList = arrayList2;
                            e.printStackTrace();
                            return arrayList;
                        } catch (NoSuchFieldException e3) {
                            e = e3;
                            arrayList = arrayList2;
                            e.printStackTrace();
                            return arrayList;
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            arrayList = arrayList2;
                            e.printStackTrace();
                            return arrayList;
                        } catch (InvocationTargetException e5) {
                            e = e5;
                            arrayList = arrayList2;
                            e.printStackTrace();
                            return arrayList;
                        }
                    } catch (InvocationTargetException e6) {
                        e = e6;
                    }
                } catch (NoSuchMethodException e7) {
                    e = e7;
                }
            } catch (IllegalAccessException e8) {
                e = e8;
            } catch (IllegalArgumentException e9) {
                e = e9;
            }
        } catch (NoSuchFieldException e10) {
            e = e10;
        }
        return arrayList;
    }

    private static ArrayList<Object> installDexes(ClassLoader classLoader, ByteBuffer[] byteBufferArr, boolean z, boolean z2) {
        try {
            try {
                try {
                    try {
                        return V26.install(classLoader, findField(classLoader, "pathList"), byteBufferArr, z, z2);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                        return null;
                    } catch (NoSuchMethodException e2) {
                        e2.printStackTrace();
                        return null;
                    }
                } catch (IllegalArgumentException e3) {
                    e3.printStackTrace();
                    return null;
                }
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
                return null;
            }
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field findField(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    private static Method findMethodinClazz(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method findMethod(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void expandFieldArray(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field findField = findField(obj, str);
        Object[] objArr2 = (Object[]) findField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        if (Build.VERSION.SDK_INT == 28 && hasInjected == 0 && objArr2.length > 1) {
            System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length - 1);
            System.arraycopy(objArr, 0, objArr3, objArr2.length - 1, objArr.length);
            System.arraycopy(objArr2, objArr2.length - 1, objArr3, (objArr.length + objArr2.length) - 1, 1);
        } else {
            System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
            System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        }
        findField.set(obj, objArr3);
    }

    /* loaded from: classes.dex */
    private static final class V26 {
        private V26() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<Object> install(ClassLoader classLoader, Field field, ByteBuffer[] byteBufferArr, boolean z, boolean z2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
            IOException[] iOExceptionArr;
            Object obj = field.get(classLoader);
            ArrayList arrayList = new ArrayList();
            Object[] makeDexElements = makeDexElements(obj, byteBufferArr, arrayList);
            if (makeDexElements == null || makeDexElements.length != byteBufferArr.length) {
                return null;
            }
            ArrayList<Object> arrayList2 = new ArrayList<>();
            for (Object obj2 : makeDexElements) {
                Object obj3 = MultiDexForMemoryDex.findField(obj2, "dexFile").get(obj2);
                Field findField = MultiDexForMemoryDex.findField(obj3, "mCookie");
                if (findField.getType().getName().equals("int")) {
                    arrayList2.add(Integer.valueOf(findField.getInt(obj3)));
                } else if (findField.getType().getName().equals("long")) {
                    arrayList2.add(Long.valueOf(findField.getLong(obj3)));
                    if (z) {
                        findField.setLong(obj3, 0L);
                    }
                } else {
                    if (z2) {
                        arrayList2.add(obj3);
                    }
                    arrayList2.add(findField.get(obj3));
                    if (z) {
                        findField.set(obj3, null);
                    }
                }
            }
            MultiDexForMemoryDex.expandFieldArray(obj, "dexElements", makeDexElements);
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field findField2 = MultiDexForMemoryDex.findField(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) findField2.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                findField2.set(obj, iOExceptionArr);
            }
            MultiDexForMemoryDex.hasInjected = 1;
            return arrayList2;
        }

        private static Object[] makeDexElements(Object obj, ByteBuffer[] byteBufferArr, List<IOException> list) {
            try {
                try {
                    try {
                        return (Object[]) MultiDexForMemoryDex.findMethod(obj, "makeInMemoryDexElements", ByteBuffer[].class, List.class).invoke(obj, byteBufferArr, list);
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                        return null;
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                        return null;
                    }
                } catch (IllegalAccessException e3) {
                    e3.printStackTrace();
                    return null;
                } catch (RuntimeException e4) {
                    e4.printStackTrace();
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
        }
    }
}
