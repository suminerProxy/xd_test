package com.wrapper.proxyapplication;

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
public class MultiDexForTinker {
    static final String TAG = "MultiDexForTinker";
    static int hasInjected = 0;
    static int injectDexBeginIndex = 0;
    static Object[] injectPathListObj = null;
    static Object[] injectPathsObj = null;
    static Object[] injectFilesObj = null;
    static Object[] injectZipsObj = null;
    static Object[] injectDexsObj = null;
    static IOException[] dexElementsSuppressedExceptions = null;

    private MultiDexForTinker() {
    }

    private static ArrayList<File> splitPaths(String searchPath) {
        String[] split;
        ArrayList<File> result = new ArrayList<>();
        if (searchPath != null) {
            for (String path : searchPath.split(File.pathSeparator)) {
                result.add(new File(path));
            }
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getprefixname(String fullname) {
        String filename;
        int preindex = fullname.lastIndexOf("/");
        if (preindex >= 0) {
            filename = fullname.substring(preindex + 1);
        } else {
            filename = fullname;
        }
        int sufindex = filename.lastIndexOf(".");
        if (sufindex >= 0) {
            String prefixname = filename.substring(0, sufindex);
            return prefixname;
        }
        String prefixname2 = filename;
        return prefixname2;
    }

    private static ArrayList<Object> openallDexes(ClassLoader loader, String jarordexpathlist, String Odexpath) {
        ArrayList<File> jarordexfilelist = splitPaths(jarordexpathlist);
        File Odexdir = new File(Odexpath);
        ArrayList<Object> objdexfilelist = null;
        try {
            Field pathListField = findField(loader, "pathList");
            try {
                Object dexPathList = pathListField.get(loader);
                try {
                    Method loadDexFileId = findMethod(dexPathList, "loadDexFile", File.class, File.class);
                    try {
                        ArrayList<Object> objdexfilelist2 = new ArrayList<>();
                        try {
                            Iterator dexfileit = jarordexfilelist.iterator();
                            while (dexfileit.hasNext()) {
                                Object objdexfile = loadDexFileId.invoke(dexPathList, dexfileit.next(), Odexdir);
                                objdexfilelist2.add(objdexfile);
                            }
                            objdexfilelist = objdexfilelist2;
                        } catch (IllegalAccessException e) {
                            e = e;
                            objdexfilelist = objdexfilelist2;
                            e.printStackTrace();
                            return objdexfilelist;
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            objdexfilelist = objdexfilelist2;
                            e.printStackTrace();
                            return objdexfilelist;
                        } catch (NoSuchFieldException e3) {
                            e = e3;
                            objdexfilelist = objdexfilelist2;
                            e.printStackTrace();
                            return objdexfilelist;
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            objdexfilelist = objdexfilelist2;
                            e.printStackTrace();
                            return objdexfilelist;
                        } catch (InvocationTargetException e5) {
                            e = e5;
                            objdexfilelist = objdexfilelist2;
                            e.printStackTrace();
                            return objdexfilelist;
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
        return objdexfilelist;
    }

    private static ArrayList<Object> installDexes(ClassLoader loader, String jarordexpathlist, String Odexpath) throws IOException {
        ArrayList<File> jarordexfilelist = splitPaths(jarordexpathlist);
        File Odexdir = new File(Odexpath);
        try {
            Field pathListField = findField(loader, "pathList");
            try {
                try {
                    return V19.install(loader, pathListField, jarordexfilelist, Odexdir);
                } catch (IOException e) {
                    throw new IOException("v19,load dex fail");
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                    return null;
                } catch (IllegalArgumentException e5) {
                    e5.printStackTrace();
                    return null;
                }
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (NoSuchFieldException e4) {
            try {
                Field pathListField2 = findField(loader, "path");
                try {
                    return V4.install(loader, pathListField2, jarordexfilelist, Odexdir);
                } catch (IOException e6) {
                    throw new IOException("v4, load dex fail");
                } catch (IllegalAccessException e22) {
                    e22.printStackTrace();
                    return null;
                } catch (IllegalArgumentException e12) {
                    e12.printStackTrace();
                    return null;
                }
            } catch (NoSuchFieldException e7) {
            }
        }
    }

    private static ArrayList<Object> installDexes(ClassLoader loader, String jarordexpathlist, String Odexpath, int index) throws IOException {
        ArrayList<File> jarordexfilelist = splitPaths(jarordexpathlist);
        File Odexdir = new File(Odexpath);
        try {
            Field pathListField = findField(loader, "pathList");
            try {
                try {
                    return V19.install(loader, pathListField, jarordexfilelist, Odexdir, index);
                } catch (IOException e) {
                    throw new IOException("v19,load dex fail");
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                    return null;
                } catch (IllegalArgumentException e5) {
                    e5.printStackTrace();
                    return null;
                }
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (NoSuchFieldException e4) {
            try {
                Field pathListField2 = findField(loader, "path");
                try {
                    return V4.install(loader, pathListField2, jarordexfilelist, Odexdir, index);
                } catch (IOException e6) {
                    throw new IOException("v4, load dex fail");
                } catch (IllegalAccessException e22) {
                    e22.printStackTrace();
                    return null;
                } catch (IllegalArgumentException e12) {
                    e12.printStackTrace();
                    return null;
                }
            } catch (NoSuchFieldException e7) {
            }
        }
    }

    private static void preparetoinstallDexes(ClassLoader loader, int dexnum) throws IOException {
        try {
            Field pathListField = findField(loader, "pathList");
            try {
                Object dexPathList = pathListField.get(loader);
                prepareexpandFieldArray(dexPathList, "dexElements", dexnum);
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            } catch (IllegalArgumentException e5) {
                e5.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            try {
                findField(loader, "path");
                try {
                    prepareexpandFieldArray(loader, "mPaths", dexnum);
                    prepareexpandFieldArray(loader, "mFiles", dexnum);
                    prepareexpandFieldArray(loader, "mZips", dexnum);
                    prepareexpandFieldArray(loader, "mDexs", dexnum);
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (IllegalArgumentException e12) {
                    e12.printStackTrace();
                }
            } catch (NoSuchFieldException e3) {
            }
        }
    }

    private static void finishinstallDexes(ClassLoader loader) {
        try {
            Field pathListField = findField(loader, "pathList");
            try {
                try {
                    Object dexPathList = pathListField.get(loader);
                    Field jlrField = findField(dexPathList, "dexElements");
                    jlrField.set(dexPathList, injectPathListObj);
                    if (dexElementsSuppressedExceptions != null) {
                        Field suppressedExceptionsField = findField(dexPathList, "dexElementsSuppressedExceptions");
                        suppressedExceptionsField.set(dexPathList, dexElementsSuppressedExceptions);
                    }
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                }
            } catch (IllegalArgumentException e5) {
                e5.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            try {
                Field pathListField2 = findField(loader, "path");
                try {
                    Object dexPathList2 = pathListField2.get(loader);
                    Field pathField = findField(dexPathList2, "mPaths");
                    pathField.set(dexPathList2, injectPathsObj);
                    Field fileField = findField(dexPathList2, "mFiles");
                    fileField.set(dexPathList2, injectFilesObj);
                    Field zipField = findField(dexPathList2, "mZips");
                    zipField.set(dexPathList2, injectZipsObj);
                    Field dexField = findField(dexPathList2, "mDexs");
                    dexField.set(dexPathList2, injectDexsObj);
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (IllegalArgumentException e12) {
                    e12.printStackTrace();
                }
            } catch (NoSuchFieldException e3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field findField(Object instance, String name) throws NoSuchFieldException {
        for (Class<?> clazz = instance.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
            try {
                Field field = clazz.getDeclaredField(name);
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                return field;
            } catch (NoSuchFieldException e) {
            }
        }
        throw new NoSuchFieldException("Field " + name + " not found in " + instance.getClass());
    }

    private static Method findMethodinClazz(Class<?> clazz, String name, Class<?>... clsArr) throws NoSuchMethodException {
        while (clazz != null) {
            try {
                Method method = clazz.getDeclaredMethod(name, clsArr);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                return method;
            } catch (NoSuchMethodException e) {
                clazz = clazz.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + name + " with parameters " + Arrays.asList(clsArr) + " not found in " + clazz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method findMethod(Object instance, String name, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> clazz = instance.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
            try {
                Method method = clazz.getDeclaredMethod(name, clsArr);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                return method;
            } catch (NoSuchMethodException e) {
            }
        }
        throw new NoSuchMethodException("Method " + name + " with parameters " + Arrays.asList(clsArr) + " not found in " + instance.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void expandFieldArray(Object instance, String fieldName, Object[] extraElements) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field jlrField = findField(instance, fieldName);
        Object[] original = (Object[]) jlrField.get(instance);
        Object[] combined = (Object[]) Array.newInstance(original.getClass().getComponentType(), original.length + extraElements.length);
        System.arraycopy(original, 0, combined, 0, original.length);
        System.arraycopy(extraElements, 0, combined, original.length, extraElements.length);
        jlrField.set(instance, combined);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void expandFieldArray(Object instance, String fieldName, Object[] extraElements, int index) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        findField(instance, fieldName);
        if (fieldName.equals("dexElements")) {
            System.arraycopy(extraElements, 0, injectPathListObj, injectDexBeginIndex + index, extraElements.length);
        } else if (fieldName.equals("mPaths")) {
            System.arraycopy(extraElements, 0, injectPathsObj, injectDexBeginIndex + index, extraElements.length);
        } else if (fieldName.equals("mFiles")) {
            System.arraycopy(extraElements, 0, injectFilesObj, injectDexBeginIndex + index, extraElements.length);
        } else if (fieldName.equals("mDexs")) {
            System.arraycopy(extraElements, 0, injectDexsObj, injectDexBeginIndex + index, extraElements.length);
        } else if (fieldName.equals("mZips")) {
            System.arraycopy(extraElements, 0, injectZipsObj, injectDexBeginIndex + index, extraElements.length);
        }
    }

    private static void prepareexpandFieldArray(Object instance, String fieldName, int dexnum) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field jlrField = findField(instance, fieldName);
        Object[] original = (Object[]) jlrField.get(instance);
        Object[] combined = (Object[]) Array.newInstance(original.getClass().getComponentType(), original.length + dexnum);
        System.arraycopy(original, 0, combined, 0, original.length);
        injectDexBeginIndex = original.length;
        if (fieldName.equals("dexElements")) {
            injectPathListObj = combined;
        } else if (fieldName.equals("mPaths")) {
            injectPathsObj = combined;
        } else if (fieldName.equals("mFiles")) {
            injectFilesObj = combined;
        } else if (fieldName.equals("mZips")) {
            injectZipsObj = combined;
        } else if (fieldName.equals("mDexs")) {
            injectDexsObj = combined;
        }
    }

    /* loaded from: classes.dex */
    private static final class V19 {
        private V19() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<Object> install(ClassLoader loader, Field pathListField, List<File> additionalClassPathEntries, File optimizedDirectory) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] dexElementsSuppressedExceptions;
            Object dexPathList = pathListField.get(loader);
            ArrayList<IOException> suppressedExceptions = new ArrayList<>();
            Object[] DexElementslist = makeDexElements(dexPathList, new ArrayList(additionalClassPathEntries), optimizedDirectory, suppressedExceptions);
            if (DexElementslist.length != additionalClassPathEntries.size()) {
                throw new IOException("load dex failed");
            }
            ArrayList<Object> objcookieordexfilelist = new ArrayList<>();
            for (Object DexElements : DexElementslist) {
                Field dexfileField = MultiDexForTinker.findField(DexElements, "dexFile");
                Object objdexfile = dexfileField.get(DexElements);
                Field cookieField = MultiDexForTinker.findField(objdexfile, "mCookie");
                if (cookieField.getType().getName().equals("int")) {
                    Integer mcookie = Integer.valueOf(cookieField.getInt(objdexfile));
                    objcookieordexfilelist.add(mcookie);
                } else if (cookieField.getType().getName().equals("long")) {
                    Long mcookie2 = Long.valueOf(cookieField.getLong(objdexfile));
                    objcookieordexfilelist.add(mcookie2);
                } else {
                    objcookieordexfilelist.add(objdexfile);
                }
            }
            MultiDexForTinker.expandFieldArray(dexPathList, "dexElements", DexElementslist);
            if (suppressedExceptions.size() > 0) {
                Iterator<IOException> it = suppressedExceptions.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                Field suppressedExceptionsField = MultiDexForTinker.findField(dexPathList, "dexElementsSuppressedExceptions");
                IOException[] dexElementsSuppressedExceptions2 = (IOException[]) suppressedExceptionsField.get(dexPathList);
                if (dexElementsSuppressedExceptions2 == null) {
                    dexElementsSuppressedExceptions = (IOException[]) suppressedExceptions.toArray(new IOException[suppressedExceptions.size()]);
                } else {
                    IOException[] combined = new IOException[suppressedExceptions.size() + dexElementsSuppressedExceptions2.length];
                    suppressedExceptions.toArray(combined);
                    System.arraycopy(dexElementsSuppressedExceptions2, 0, combined, suppressedExceptions.size(), dexElementsSuppressedExceptions2.length);
                    dexElementsSuppressedExceptions = combined;
                }
                suppressedExceptionsField.set(dexPathList, dexElementsSuppressedExceptions);
            }
            MultiDexForTinker.hasInjected = 1;
            return objcookieordexfilelist;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<Object> install(ClassLoader loader, Field pathListField, List<File> additionalClassPathEntries, File optimizedDirectory, int index) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            Object dexPathList = pathListField.get(loader);
            ArrayList<IOException> suppressedExceptions = new ArrayList<>();
            Object[] DexElementslist = makeDexElements(dexPathList, new ArrayList(additionalClassPathEntries), optimizedDirectory, suppressedExceptions);
            if (DexElementslist.length != additionalClassPathEntries.size()) {
                throw new IOException("load dex failed");
            }
            ArrayList<Object> objcookieordexfilelist = new ArrayList<>();
            for (Object DexElements : DexElementslist) {
                Field dexfileField = MultiDexForTinker.findField(DexElements, "dexFile");
                Object objdexfile = dexfileField.get(DexElements);
                Field cookieField = MultiDexForTinker.findField(objdexfile, "mCookie");
                if (cookieField.getType().getName().equals("int")) {
                    Integer mcookie = Integer.valueOf(cookieField.getInt(objdexfile));
                    objcookieordexfilelist.add(mcookie);
                } else if (cookieField.getType().getName().equals("long")) {
                    Long mcookie2 = Long.valueOf(cookieField.getLong(objdexfile));
                    objcookieordexfilelist.add(mcookie2);
                } else {
                    objcookieordexfilelist.add(objdexfile);
                }
            }
            MultiDexForTinker.expandFieldArray(dexPathList, "dexElements", DexElementslist, index);
            if (suppressedExceptions.size() > 0) {
                Iterator<IOException> it = suppressedExceptions.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                Field suppressedExceptionsField = MultiDexForTinker.findField(dexPathList, "dexElementsSuppressedExceptions");
                MultiDexForTinker.dexElementsSuppressedExceptions = (IOException[]) suppressedExceptionsField.get(dexPathList);
                if (MultiDexForTinker.dexElementsSuppressedExceptions == null) {
                    MultiDexForTinker.dexElementsSuppressedExceptions = (IOException[]) suppressedExceptions.toArray(new IOException[suppressedExceptions.size()]);
                } else {
                    IOException[] combined = new IOException[suppressedExceptions.size() + MultiDexForTinker.dexElementsSuppressedExceptions.length];
                    suppressedExceptions.toArray(combined);
                    System.arraycopy(MultiDexForTinker.dexElementsSuppressedExceptions, 0, combined, suppressedExceptions.size(), MultiDexForTinker.dexElementsSuppressedExceptions.length);
                    MultiDexForTinker.dexElementsSuppressedExceptions = combined;
                }
            }
            MultiDexForTinker.hasInjected = 1;
            return objcookieordexfilelist;
        }

        private static Object[] makeDexElements(Object dexPathList, ArrayList<File> files, File optimizedDirectory, ArrayList<IOException> suppressedExceptions) {
            try {
                Method makeDexElements = MultiDexForTinker.findMethod(dexPathList, "makeDexElements", ArrayList.class, File.class);
                try {
                    try {
                        try {
                            return (Object[]) makeDexElements.invoke(dexPathList, files, optimizedDirectory);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            return null;
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                            return null;
                        }
                    } catch (RuntimeException e3) {
                        e3.printStackTrace();
                        return null;
                    }
                } catch (IllegalArgumentException e4) {
                    e4.printStackTrace();
                    return null;
                }
            } catch (NoSuchMethodException e5) {
                try {
                    Method makeDexElements2 = MultiDexForTinker.findMethod(dexPathList, "makeDexElements", ArrayList.class, File.class, ArrayList.class);
                    try {
                        try {
                            try {
                                return (Object[]) makeDexElements2.invoke(dexPathList, files, optimizedDirectory, suppressedExceptions);
                            } catch (IllegalAccessException e1) {
                                e1.printStackTrace();
                                e5.printStackTrace();
                                return null;
                            } catch (InvocationTargetException e12) {
                                e12.printStackTrace();
                                e5.printStackTrace();
                                return null;
                            }
                        } catch (IllegalArgumentException e13) {
                            e13.printStackTrace();
                            e5.printStackTrace();
                            return null;
                        }
                    } catch (RuntimeException e14) {
                        e14.printStackTrace();
                        e5.printStackTrace();
                        return null;
                    }
                } catch (NoSuchMethodException e15) {
                    try {
                        Method makeDexElements3 = MultiDexForTinker.findMethod(dexPathList, "makePathElements", List.class, File.class, List.class);
                        try {
                            try {
                                return (Object[]) makeDexElements3.invoke(dexPathList, files, optimizedDirectory, suppressedExceptions);
                            } catch (IllegalArgumentException e22) {
                                e22.printStackTrace();
                                e15.printStackTrace();
                                e5.printStackTrace();
                                return null;
                            } catch (InvocationTargetException e23) {
                                e23.printStackTrace();
                                e15.printStackTrace();
                                e5.printStackTrace();
                                return null;
                            }
                        } catch (IllegalAccessException e24) {
                            e24.printStackTrace();
                            e15.printStackTrace();
                            e5.printStackTrace();
                            return null;
                        }
                    } catch (NoSuchMethodException e25) {
                        e25.printStackTrace();
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
        public static ArrayList<Object> install(ClassLoader loader, Field pathListField, List<File> additionalClassPathEntries, File optimizedDirectory) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int extraSize = additionalClassPathEntries.size();
            StringBuilder path = new StringBuilder((String) pathListField.get(loader));
            String[] extraPaths = new String[extraSize];
            File[] extraFiles = new File[extraSize];
            ZipFile[] extraZips = new ZipFile[extraSize];
            DexFile[] extraDexs = new DexFile[extraSize];
            if (extraDexs.length != extraSize) {
                throw new IOException("load dex failed");
            }
            ArrayList<Object> objcookielist = new ArrayList<>();
            ListIterator<File> iterator = additionalClassPathEntries.listIterator();
            while (iterator.hasNext()) {
                File additionalEntry = iterator.next();
                String entryPath = additionalEntry.getAbsolutePath();
                String odexdirPath = optimizedDirectory.getAbsolutePath();
                String odexprefix = MultiDexForTinker.getprefixname(entryPath);
                path.append(':').append(entryPath);
                int index = iterator.previousIndex();
                extraPaths[index] = entryPath;
                extraFiles[index] = additionalEntry;
                extraZips[index] = new ZipFile(additionalEntry);
                extraDexs[index] = DexFile.loadDex(entryPath, String.valueOf(odexdirPath) + "/" + odexprefix + ".dex", 0);
                Field cookieField = MultiDexForTinker.findField(extraDexs[index], "mCookie");
                Integer mcookie = Integer.valueOf(cookieField.getInt(extraDexs[index]));
                objcookielist.add(mcookie);
            }
            pathListField.set(loader, path.toString());
            MultiDexForTinker.expandFieldArray(loader, "mPaths", extraPaths);
            MultiDexForTinker.expandFieldArray(loader, "mFiles", extraFiles);
            MultiDexForTinker.expandFieldArray(loader, "mZips", extraZips);
            MultiDexForTinker.expandFieldArray(loader, "mDexs", extraDexs);
            MultiDexForTinker.hasInjected = 1;
            return objcookielist;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<Object> install(ClassLoader loader, Field pathListField, List<File> additionalClassPathEntries, File optimizedDirectory, int index) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int extraSize = additionalClassPathEntries.size();
            StringBuilder path = new StringBuilder((String) pathListField.get(loader));
            String[] extraPaths = new String[extraSize];
            File[] extraFiles = new File[extraSize];
            ZipFile[] extraZips = new ZipFile[extraSize];
            DexFile[] extraDexs = new DexFile[extraSize];
            if (extraDexs.length != extraSize) {
                throw new IOException("load dex failed");
            }
            ArrayList<Object> objcookielist = new ArrayList<>();
            ListIterator<File> iterator = additionalClassPathEntries.listIterator();
            while (iterator.hasNext()) {
                File additionalEntry = iterator.next();
                String entryPath = additionalEntry.getAbsolutePath();
                String odexdirPath = optimizedDirectory.getAbsolutePath();
                String odexprefix = MultiDexForTinker.getprefixname(entryPath);
                path.append(':').append(entryPath);
                int iteIndex = iterator.previousIndex();
                extraPaths[iteIndex] = entryPath;
                extraFiles[iteIndex] = additionalEntry;
                extraZips[iteIndex] = new ZipFile(additionalEntry);
                extraDexs[iteIndex] = DexFile.loadDex(entryPath, String.valueOf(odexdirPath) + "/" + odexprefix + ".dex", 0);
                Field cookieField = MultiDexForTinker.findField(extraDexs[iteIndex], "mCookie");
                Integer mcookie = Integer.valueOf(cookieField.getInt(extraDexs[iteIndex]));
                objcookielist.add(mcookie);
            }
            pathListField.set(loader, path.toString());
            MultiDexForTinker.expandFieldArray(loader, "mPaths", extraPaths, index);
            MultiDexForTinker.expandFieldArray(loader, "mFiles", extraFiles, index);
            MultiDexForTinker.expandFieldArray(loader, "mZips", extraZips, index);
            MultiDexForTinker.expandFieldArray(loader, "mDexs", extraDexs, index);
            MultiDexForTinker.hasInjected = 1;
            if (objcookielist.size() == 0) {
                return null;
            }
            return objcookielist;
        }
    }
}
