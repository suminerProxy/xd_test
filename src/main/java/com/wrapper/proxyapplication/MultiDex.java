package com.wrapper.proxyapplication;

import android.os.Build;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class MultiDex {
    static final String TAG = "MultiDex";
    static Object baseApkDexFile;
    static IOException[] dexElementsSuppressedExceptions;
    static int hasInjected;
    static int injectDexBeginIndex;
    static Object[] injectDexsObj;
    static Object[] injectFilesObj;
    static Object[] injectPathListObj;
    static Object[] injectPathsObj;
    static Object[] injectZipsObj;

    private MultiDex() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static String getprefixname(String str) {
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

    private static ArrayList<Object> installDexes(ClassLoader classLoader, String str, String str2, boolean z, boolean z2) {
        ArrayList<File> splitPaths = splitPaths(str);
        File file = new File(str2);
        try {
            try {
                try {
                    try {
                        try {
                            return V19.install(classLoader, findField(classLoader, "pathList"), splitPaths, file, z, z2);
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
        } catch (NoSuchFieldException unused2) {
            try {
                return V4.install(classLoader, findField(classLoader, "path"), splitPaths, file);
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
                return null;
            } catch (IllegalArgumentException e7) {
                e7.printStackTrace();
                return null;
            }
        }
    }

    private static ArrayList<Object> installDexes(ClassLoader classLoader, String str, String str2, int i, boolean z, boolean z2) {
        ArrayList<File> splitPaths = splitPaths(str);
        File file = new File(str2);
        try {
            try {
                try {
                    try {
                        return V19.install(classLoader, findField(classLoader, "pathList"), splitPaths, file, i, z, z2);
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
                } catch (NoSuchMethodException e4) {
                    e4.printStackTrace();
                    return null;
                }
            } catch (NoSuchFieldException unused) {
                try {
                    try {
                        return V4.install(classLoader, findField(classLoader, "path"), splitPaths, file, i);
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        return null;
                    } catch (IllegalArgumentException e6) {
                        e6.printStackTrace();
                        return null;
                    }
                } catch (IllegalAccessException e7) {
                    e7.printStackTrace();
                    return null;
                }
            }
        } catch (NoSuchFieldException unused2) {
            return null;
        }
    }

    private static void preparetoinstallDexes(ClassLoader classLoader, int i) {
        try {
            try {
                try {
                    try {
                        prepareexpandFieldArray(findField(classLoader, "pathList").get(classLoader), "dexElements", i);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                }
            } catch (NoSuchFieldException unused) {
            }
        } catch (NoSuchFieldException unused2) {
            findField(classLoader, "path");
            try {
                prepareexpandFieldArray(classLoader, "mPaths", i);
                prepareexpandFieldArray(classLoader, "mFiles", i);
                prepareexpandFieldArray(classLoader, "mZips", i);
                prepareexpandFieldArray(classLoader, "mDexs", i);
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
            }
        }
    }

    private static void finishinstallDexes(ClassLoader classLoader) {
        try {
            try {
                try {
                    try {
                        Object obj = findField(classLoader, "pathList").get(classLoader);
                        Field findField = findField(obj, "dexElements");
                        hasInjected = 1;
                        findField.set(obj, injectPathListObj);
                        if (dexElementsSuppressedExceptions != null) {
                            findField(obj, "dexElementsSuppressedExceptions").set(obj, dexElementsSuppressedExceptions);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                }
            } catch (NoSuchFieldException unused) {
            }
        } catch (NoSuchFieldException unused2) {
            try {
                Object obj2 = findField(classLoader, "path").get(classLoader);
                findField(obj2, "mPaths").set(obj2, injectPathsObj);
                findField(obj2, "mFiles").set(obj2, injectFilesObj);
                findField(obj2, "mZips").set(obj2, injectZipsObj);
                findField(obj2, "mDexs").set(obj2, injectDexsObj);
                hasInjected = 1;
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
            }
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

    /* JADX INFO: Access modifiers changed from: private */
    public static void expandFieldArray(Object obj, String str, Object[] objArr, int i) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        if (str.equals("dexElements")) {
            System.arraycopy(objArr, 0, injectPathListObj, injectDexBeginIndex + i, objArr.length);
        } else if (str.equals("mPaths")) {
            System.arraycopy(objArr, 0, injectPathsObj, injectDexBeginIndex + i, objArr.length);
        } else if (str.equals("mFiles")) {
            System.arraycopy(objArr, 0, injectFilesObj, injectDexBeginIndex + i, objArr.length);
        } else if (str.equals("mDexs")) {
            System.arraycopy(objArr, 0, injectDexsObj, injectDexBeginIndex + i, objArr.length);
        } else if (str.equals("mZips")) {
            System.arraycopy(objArr, 0, injectZipsObj, injectDexBeginIndex + i, objArr.length);
        }
    }

    private static void prepareexpandFieldArray(Object obj, String str, int i) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Object[] objArr = (Object[]) findField(obj, str).get(obj);
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + i);
        baseApkDexFile = objArr[objArr.length - 1];
        if (Build.VERSION.SDK_INT == 28 && hasInjected == 0 && objArr.length > 1) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length - 1);
            injectDexBeginIndex = objArr.length - 1;
            System.arraycopy(objArr, objArr.length - 1, objArr2, (i + objArr.length) - 1, 1);
        } else {
            System.arraycopy(objArr, 0, objArr2, i, objArr.length);
        }
        if (str.equals("dexElements")) {
            injectPathListObj = objArr2;
        } else if (str.equals("mPaths")) {
            injectPathsObj = objArr2;
        } else if (str.equals("mFiles")) {
            injectFilesObj = objArr2;
        } else if (str.equals("mZips")) {
            injectZipsObj = objArr2;
        } else if (str.equals("mDexs")) {
            injectDexsObj = objArr2;
        }
    }

    /* loaded from: classes.dex */
    private static final class V19 {
        private V19() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<Object> install(ClassLoader classLoader, Field field, List<File> list, File file, boolean z, boolean z2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
            IOException[] iOExceptionArr;
            Object obj = field.get(classLoader);
            ArrayList arrayList = new ArrayList();
            Object[] makeDexElements = makeDexElements(obj, new ArrayList(list), file, arrayList);
            if (makeDexElements == null || makeDexElements.length != list.size()) {
                return null;
            }
            ArrayList<Object> arrayList2 = new ArrayList<>();
            for (Object obj2 : makeDexElements) {
                Object obj3 = MultiDex.findField(obj2, "dexFile").get(obj2);
                Field findField = MultiDex.findField(obj3, "mCookie");
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
            MultiDex.expandFieldArray(obj, "dexElements", makeDexElements);
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field findField2 = MultiDex.findField(obj, "dexElementsSuppressedExceptions");
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
            MultiDex.hasInjected = 1;
            return arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<Object> install(ClassLoader classLoader, Field field, List<File> list, File file, int i, boolean z, boolean z2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
            Object obj = field.get(classLoader);
            ArrayList arrayList = new ArrayList();
            Object[] makeDexElements = makeDexElements(obj, new ArrayList(list), file, arrayList);
            if (makeDexElements == null || makeDexElements.length != list.size()) {
                return null;
            }
            ArrayList<Object> arrayList2 = new ArrayList<>();
            for (Object obj2 : makeDexElements) {
                Object obj3 = MultiDex.findField(obj2, "dexFile").get(obj2);
                Field findField = MultiDex.findField(obj3, "mCookie");
                if (findField.getType().getName().equals("int")) {
                    arrayList2.add(Integer.valueOf(findField.getInt(obj3)));
                } else if (findField.getType().getName().equals("long")) {
                    arrayList2.add(Long.valueOf(findField.getLong(obj3)));
                } else {
                    if (z2) {
                        arrayList2.add(obj3);
                    }
                    arrayList2.add(findField.get(obj3));
                }
            }
            MultiDex.expandFieldArray(obj, "dexElements", makeDexElements, i);
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                MultiDex.dexElementsSuppressedExceptions = (IOException[]) MultiDex.findField(obj, "dexElementsSuppressedExceptions").get(obj);
                if (MultiDex.dexElementsSuppressedExceptions == null) {
                    MultiDex.dexElementsSuppressedExceptions = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr = new IOException[arrayList.size() + MultiDex.dexElementsSuppressedExceptions.length];
                    arrayList.toArray(iOExceptionArr);
                    System.arraycopy(MultiDex.dexElementsSuppressedExceptions, 0, iOExceptionArr, arrayList.size(), MultiDex.dexElementsSuppressedExceptions.length);
                    MultiDex.dexElementsSuppressedExceptions = iOExceptionArr;
                }
            }
            return arrayList2;
        }

        private static Object[] makeDexElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            try {
                try {
                    try {
                        try {
                            try {
                                return (Object[]) MultiDex.findMethod(obj, "makeDexElements", ArrayList.class, File.class).invoke(obj, arrayList, file);
                            } catch (InvocationTargetException e) {
                                e.printStackTrace();
                                return null;
                            }
                        } catch (RuntimeException e2) {
                            e2.printStackTrace();
                            return null;
                        }
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                        return null;
                    }
                } catch (IllegalArgumentException e4) {
                    e4.printStackTrace();
                    return null;
                }
            } catch (NoSuchMethodException e5) {
                try {
                    try {
                        try {
                            try {
                                return (Object[]) MultiDex.findMethod(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
                            } catch (IllegalAccessException e6) {
                                e6.printStackTrace();
                                e5.printStackTrace();
                                return null;
                            } catch (InvocationTargetException e7) {
                                e7.printStackTrace();
                                e5.printStackTrace();
                                return null;
                            }
                        } catch (IllegalArgumentException e8) {
                            e8.printStackTrace();
                            e5.printStackTrace();
                            return null;
                        }
                    } catch (RuntimeException e9) {
                        e9.printStackTrace();
                        e5.printStackTrace();
                        return null;
                    }
                } catch (NoSuchMethodException e10) {
                    try {
                        try {
                            return (Object[]) MultiDex.findMethod(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList, file, arrayList2);
                        } catch (IllegalAccessException e11) {
                            e11.printStackTrace();
                            e10.printStackTrace();
                            e5.printStackTrace();
                            return null;
                        } catch (IllegalArgumentException e12) {
                            e12.printStackTrace();
                            e10.printStackTrace();
                            e5.printStackTrace();
                            return null;
                        } catch (InvocationTargetException e13) {
                            e13.printStackTrace();
                            e10.printStackTrace();
                            e5.printStackTrace();
                            return null;
                        }
                    } catch (NoSuchMethodException e14) {
                        e14.printStackTrace();
                    } catch (RuntimeException e15) {
                        e15.printStackTrace();
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class V4 {
        private V4() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<Object> install(ClassLoader classLoader, Field field, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            StringBuilder sb = new StringBuilder((String) field.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ArrayList<Object> arrayList = new ArrayList<>();
            ListIterator<File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                String absolutePath2 = file.getAbsolutePath();
                String str = MultiDex.getprefixname(absolutePath);
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = next;
                zipFileArr[previousIndex] = new ZipFile(next);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath2 + "/" + str + ".dex", 0);
                arrayList.add(Integer.valueOf(MultiDex.findField(dexFileArr[previousIndex], "mCookie").getInt(dexFileArr[previousIndex])));
            }
            field.set(classLoader, sb.toString());
            MultiDex.expandFieldArray(classLoader, "mPaths", strArr);
            MultiDex.expandFieldArray(classLoader, "mFiles", fileArr);
            MultiDex.expandFieldArray(classLoader, "mZips", zipFileArr);
            MultiDex.expandFieldArray(classLoader, "mDexs", dexFileArr);
            if (arrayList.size() == 0) {
                return null;
            }
            MultiDex.hasInjected = 1;
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<Object> install(ClassLoader classLoader, Field field, List<File> list, File file, int i) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            StringBuilder sb = new StringBuilder((String) field.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ArrayList<Object> arrayList = new ArrayList<>();
            ListIterator<File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                String absolutePath2 = file.getAbsolutePath();
                String str = MultiDex.getprefixname(absolutePath);
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = next;
                zipFileArr[previousIndex] = new ZipFile(next);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath2 + "/" + str + ".dex", 0);
                arrayList.add(Integer.valueOf(MultiDex.findField(dexFileArr[previousIndex], "mCookie").getInt(dexFileArr[previousIndex])));
            }
            field.set(classLoader, sb.toString());
            MultiDex.expandFieldArray(classLoader, "mPaths", strArr, i);
            MultiDex.expandFieldArray(classLoader, "mFiles", fileArr, i);
            MultiDex.expandFieldArray(classLoader, "mZips", zipFileArr, i);
            MultiDex.expandFieldArray(classLoader, "mDexs", dexFileArr, i);
            if (arrayList.size() == 0) {
                return null;
            }
            return arrayList;
        }
    }
}
