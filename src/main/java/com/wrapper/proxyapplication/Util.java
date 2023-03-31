package com.wrapper.proxyapplication;

import android.content.Context;
import android.os.Process;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class Util {
    static final int ERROR_EXCEPTION = -2;
    static final int ERROR_FALSE = 0;
    static final int ERROR_FILE_EXIST = 2;
    static final int ERROR_FILE_NOT_FOUND = -1;
    static final int ERROR_FILE_NOT_FOUND_INZIP = -3;
    static final int ERROR_SUCCESS = 1;
    public static String libname;
    public static int MAX_DEX_NUM = 300;
    public static String TAG = "Util";
    public static String CPUABI = null;
    public static String simplelibname = "tosprotection";
    public static String securename0 = "00O000ll111l.dex";
    public static String securename1 = "00O000ll111l.jar";
    public static String securename2 = "000O00ll111l.dex";
    public static String securename3 = "0000000lllll.dex";
    public static String securename4 = "000000olllll.dex";
    public static String securename5 = "0OO00l111l1l";
    public static String securename6 = "o0oooOO0ooOo.dat";
    public static String securename7 = "exportService.txt";
    public static String securename8 = ".flag00O000ll111l.dex";
    public static String securename9 = ".updateIV.dat";
    public static String versionname = "tosversion";
    public static String securename11 = ".flag00O000ll111l.vdex";
    public static String securename14 = "00O000ll111l.vdex";
    public static String securename15 = "00O000ll111l.odex";
    public static String dexname = "classes.dex";
    public static boolean ifoverwrite = true;

    static {
        libname = "";
        libname = "shell-super.2019";
    }

    public static int DeleteFile(String filepath) {
        File tmpfile = new File(filepath);
        if (tmpfile.exists()) {
            if (!tmpfile.delete()) {
                return ERROR_EXCEPTION;
            }
            return 1;
        }
        return ERROR_FILE_NOT_FOUND;
    }

    public static boolean UnzipFile(ZipFile zf, String filepathinzip, File fileinfiledir) {
        BufferedOutputStream Output_fos = null;
        BufferedInputStream bufbr = null;
        try {
            try {
                ZipEntry ze = zf.getEntry(filepathinzip);
                if (ze == null) {
                    try {
                        if (0 != 0) {
                            try {
                                Output_fos.close();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                            }
                            return false;
                        }
                        return false;
                    } catch (Throwable th) {
                        if (0 != 0) {
                            try {
                                bufbr.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                return false;
                            }
                        }
                        throw th;
                    }
                }
                BufferedOutputStream Output_fos2 = new BufferedOutputStream(new FileOutputStream(fileinfiledir));
                try {
                    byte[] buf = new byte[65536];
                    BufferedInputStream bufbr2 = new BufferedInputStream(zf.getInputStream(ze));
                    while (true) {
                        try {
                            int readlen = bufbr2.read(buf);
                            if (readlen < 0) {
                                break;
                            }
                            Output_fos2.write(buf, 0, readlen);
                        } catch (Exception e5) {
                            e = e5;
                            bufbr = bufbr2;
                            Output_fos = Output_fos2;
                            e.printStackTrace();
                            if (Output_fos != null) {
                                try {
                                    try {
                                        Output_fos.close();
                                        if (bufbr != null) {
                                            try {
                                                bufbr.close();
                                                return false;
                                            } catch (IOException e6) {
                                                e6.printStackTrace();
                                                return false;
                                            }
                                        }
                                        return false;
                                    } catch (Throwable th2) {
                                        if (bufbr != null) {
                                            try {
                                                bufbr.close();
                                            } catch (IOException e7) {
                                                e7.printStackTrace();
                                                return false;
                                            }
                                        }
                                        throw th2;
                                    }
                                } catch (IOException e8) {
                                    e8.printStackTrace();
                                    if (bufbr != null) {
                                        try {
                                            bufbr.close();
                                            return false;
                                        } catch (IOException e9) {
                                            e9.printStackTrace();
                                            return false;
                                        }
                                    }
                                    return false;
                                }
                            }
                            return false;
                        } catch (Throwable th3) {
                            th = th3;
                            bufbr = bufbr2;
                            Output_fos = Output_fos2;
                            try {
                                if (Output_fos != null) {
                                    try {
                                        Output_fos.close();
                                        if (bufbr != null) {
                                            try {
                                                bufbr.close();
                                            } catch (IOException e10) {
                                                e10.printStackTrace();
                                                return false;
                                            }
                                        }
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                        if (bufbr != null) {
                                            try {
                                                bufbr.close();
                                            } catch (IOException e12) {
                                                e12.printStackTrace();
                                            }
                                        }
                                    }
                                }
                                throw th;
                            } catch (Throwable th4) {
                                if (bufbr != null) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e13) {
                                        e13.printStackTrace();
                                        return false;
                                    }
                                }
                                throw th4;
                            }
                        }
                    }
                    if (Output_fos2 != null) {
                        try {
                            try {
                                Output_fos2.close();
                                if (bufbr2 != null) {
                                    try {
                                        bufbr2.close();
                                    } catch (IOException e14) {
                                        e14.printStackTrace();
                                        return false;
                                    }
                                }
                            } catch (Throwable th5) {
                                if (bufbr2 != null) {
                                    try {
                                        bufbr2.close();
                                    } catch (IOException e15) {
                                        e15.printStackTrace();
                                        return false;
                                    }
                                }
                                throw th5;
                            }
                        } catch (IOException e16) {
                            e16.printStackTrace();
                            if (bufbr2 != null) {
                                try {
                                    bufbr2.close();
                                } catch (IOException e17) {
                                    e17.printStackTrace();
                                    return false;
                                }
                            }
                            return false;
                        }
                    }
                    return true;
                } catch (Exception e18) {
                    e = e18;
                    Output_fos = Output_fos2;
                } catch (Throwable th6) {
                    th = th6;
                    Output_fos = Output_fos2;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e19) {
            e = e19;
        }
    }

    public static int Comparetxtinzip(ZipFile apkzf, String filepathinzip, File fileinfiledir) {
        int i;
        int i2;
        int i3;
        BufferedInputStream checkzbr = null;
        BufferedInputStream checkfbr = null;
        ZipEntry cookie_entry = apkzf.getEntry(filepathinzip);
        if (cookie_entry == null) {
            try {
                if (0 != 0) {
                    try {
                        checkzbr.close();
                        if (0 != 0) {
                            try {
                                checkfbr.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                                i = ERROR_EXCEPTION;
                            }
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        if (0 != 0) {
                            try {
                                checkfbr.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                                i = ERROR_EXCEPTION;
                            }
                        }
                        i = ERROR_EXCEPTION;
                    }
                }
                i = ERROR_FILE_NOT_FOUND_INZIP;
                return i;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        checkfbr.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return ERROR_EXCEPTION;
                    }
                }
                throw th;
            }
        }
        try {
            try {
                byte[] checkzipbuf = new byte[1024];
                byte[] checkfilebuf = new byte[1024];
                BufferedInputStream checkzbr2 = new BufferedInputStream(apkzf.getInputStream(cookie_entry));
                try {
                    int readziplen = checkzbr2.read(checkzipbuf);
                    String tmpzipstr = new String(checkzipbuf).substring(0, readziplen);
                    BufferedInputStream checkfbr2 = new BufferedInputStream(new FileInputStream(fileinfiledir));
                    try {
                        int readfilelen = checkfbr2.read(checkfilebuf);
                        String tmpfilestr = new String(checkfilebuf).substring(0, readfilelen);
                        int result = tmpfilestr.equals(tmpzipstr) ? 1 : 0;
                        if (checkzbr2 != null) {
                            try {
                                try {
                                    checkzbr2.close();
                                    if (checkfbr2 != null) {
                                        try {
                                            checkfbr2.close();
                                        } catch (IOException e5) {
                                            e5.printStackTrace();
                                            return ERROR_EXCEPTION;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    if (checkfbr2 != null) {
                                        try {
                                            checkfbr2.close();
                                        } catch (IOException e6) {
                                            e6.printStackTrace();
                                            return ERROR_EXCEPTION;
                                        }
                                    }
                                    throw th2;
                                }
                            } catch (IOException e7) {
                                e7.printStackTrace();
                                if (checkfbr2 != null) {
                                    try {
                                        checkfbr2.close();
                                    } catch (IOException e8) {
                                        e8.printStackTrace();
                                        return ERROR_EXCEPTION;
                                    }
                                }
                                return ERROR_EXCEPTION;
                            }
                        }
                        return result;
                    } catch (Exception e9) {
                        e = e9;
                        checkfbr = checkfbr2;
                        checkzbr = checkzbr2;
                        e.printStackTrace();
                        try {
                            if (checkzbr != null) {
                                try {
                                    checkzbr.close();
                                    if (checkfbr != null) {
                                        try {
                                            checkfbr.close();
                                        } catch (IOException e10) {
                                            e10.printStackTrace();
                                            i3 = ERROR_EXCEPTION;
                                            return i3;
                                        }
                                    }
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                    if (checkfbr != null) {
                                        try {
                                            checkfbr.close();
                                        } catch (IOException e12) {
                                            e12.printStackTrace();
                                            i3 = ERROR_EXCEPTION;
                                            return i3;
                                        }
                                    }
                                    i3 = ERROR_EXCEPTION;
                                }
                            }
                            i3 = ERROR_EXCEPTION;
                            return i3;
                        } catch (Throwable th3) {
                            if (checkfbr != null) {
                                try {
                                    checkfbr.close();
                                } catch (IOException e13) {
                                    e13.printStackTrace();
                                    return ERROR_EXCEPTION;
                                }
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        checkfbr = checkfbr2;
                        checkzbr = checkzbr2;
                        try {
                            if (checkzbr != null) {
                                try {
                                    checkzbr.close();
                                    if (checkfbr != null) {
                                        try {
                                            checkfbr.close();
                                        } catch (IOException e14) {
                                            e14.printStackTrace();
                                            i2 = ERROR_EXCEPTION;
                                            return i2;
                                        }
                                    }
                                } catch (IOException e15) {
                                    e15.printStackTrace();
                                    if (checkfbr != null) {
                                        try {
                                            checkfbr.close();
                                        } catch (IOException e16) {
                                            e16.printStackTrace();
                                            i2 = ERROR_EXCEPTION;
                                            return i2;
                                        }
                                    }
                                    i2 = ERROR_EXCEPTION;
                                }
                            }
                            throw th;
                        } catch (Throwable th5) {
                            if (checkfbr != null) {
                                try {
                                    checkfbr.close();
                                } catch (IOException e17) {
                                    e17.printStackTrace();
                                    return ERROR_EXCEPTION;
                                }
                            }
                            throw th5;
                        }
                    }
                } catch (Exception e18) {
                    e = e18;
                    checkzbr = checkzbr2;
                } catch (Throwable th6) {
                    th = th6;
                    checkzbr = checkzbr2;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e19) {
            e = e19;
        }
    }

    public static boolean deleteDir(File file) {
        boolean result = true;
        if (file.isDirectory()) {
            String[] children = file.list();
            for (String str : children) {
                boolean success = deleteDir(new File(file, str));
                if (!success) {
                    return false;
                }
            }
        }
        if (file.exists()) {
            result = file.delete();
        }
        return result;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:270:0x10fe -> B:433:0x02d3). Please submit an issue!!! */
    public static int PrepareSecurefiles(Context ctx, ZipFile apkzf) {
        int i;
        int i2;
        int i3;
        File Cookiefile;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        FileChannel file_channel = null;
        FileLock file_lock = null;
        RandomAccessFile raf = null;
        String Appfiledir = String.valueOf(ctx.getFilesDir().getAbsolutePath()) + "/prodexdir";
        File Appprofiledir = new File(Appfiledir);
        if (!Appprofiledir.isDirectory()) {
            Appprofiledir.mkdir();
        }
        String Cookiefilepath = String.valueOf(Appfiledir) + "/" + versionname;
        String backupfilepath = String.valueOf(Appfiledir) + "/backUp";
        String firstloadfilepath = String.valueOf(Appfiledir) + "/firstLoad";
        String Cookiefileinzip = "assets/" + versionname;
        String Libnameinapk = "libtosprotection." + CPUABI + ".so";
        try {
            try {
                RandomAccessFile raf2 = new RandomAccessFile(Cookiefilepath, "rw");
                try {
                    file_channel = raf2.getChannel();
                    file_lock = file_channel.lock();
                    Cookiefile = new File(Cookiefilepath);
                } catch (Exception e) {
                    e = e;
                    raf = raf2;
                } catch (Throwable th) {
                    th = th;
                    raf = raf2;
                }
                try {
                    if (Cookiefile.length() != 0) {
                        int compareResult = Comparetxtinzip(apkzf, Cookiefileinzip, Cookiefile);
                        if (compareResult == 1 && checkCopiedFileCrc(apkzf, "assets/" + securename5, new File(String.valueOf(Appfiledir) + "/" + securename5)) && checkCopiedFileCrc(apkzf, "assets/" + securename6, new File(String.valueOf(Appfiledir) + "/" + securename6))) {
                            ZipEntry fileUnzip = apkzf.getEntry("assets/" + Libnameinapk);
                            if (fileUnzip != null && !isFileValid(String.valueOf(Appfiledir) + "/" + libname, fileUnzip.getSize())) {
                                UnzipFile(apkzf, "assets/" + Libnameinapk, new File(String.valueOf(Appfiledir) + "/" + libname));
                            }
                            ZipEntry fileUnzip2 = apkzf.getEntry("assets/" + Libnameinapk);
                            if (fileUnzip2 != null && !isFileValid(String.valueOf(Appfiledir) + "/" + securename6, fileUnzip2.getSize())) {
                                UnzipFile(apkzf, "assets/" + securename6, new File(String.valueOf(Appfiledir) + "/" + securename6));
                            }
                            ZipEntry fileUnzip3 = apkzf.getEntry("assets/" + Libnameinapk);
                            if (fileUnzip3 != null && !isFileValid(String.valueOf(Appfiledir) + "/" + securename7, fileUnzip3.getSize())) {
                                UnzipFile(apkzf, "assets/" + securename7, new File(String.valueOf(Appfiledir) + "/" + securename7));
                            }
                            ZipEntry fileUnzip4 = apkzf.getEntry(Cookiefileinzip);
                            if (fileUnzip4 != null && !isFileValid(Cookiefilepath, fileUnzip4.getSize())) {
                                UnzipFile(apkzf, Cookiefileinzip, new File(Cookiefilepath));
                            }
                            if (file_lock != null) {
                                try {
                                    try {
                                        file_lock.release();
                                        try {
                                            if (file_channel != null) {
                                                try {
                                                    file_channel.close();
                                                    if (raf2 != null) {
                                                        try {
                                                            raf2.close();
                                                        } catch (IOException e2) {
                                                            e2.printStackTrace();
                                                            i9 = ERROR_FILE_NOT_FOUND;
                                                        }
                                                    }
                                                } catch (IOException e3) {
                                                    e3.printStackTrace();
                                                    if (raf2 != null) {
                                                        try {
                                                            raf2.close();
                                                        } catch (IOException e4) {
                                                            e4.printStackTrace();
                                                            i9 = ERROR_FILE_NOT_FOUND;
                                                        }
                                                    }
                                                    i9 = ERROR_FILE_NOT_FOUND;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            if (raf2 != null) {
                                                try {
                                                    raf2.close();
                                                } catch (IOException e5) {
                                                    e5.printStackTrace();
                                                    return ERROR_FILE_NOT_FOUND;
                                                }
                                            }
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            if (file_channel != null) {
                                                try {
                                                    file_channel.close();
                                                    if (raf2 != null) {
                                                        try {
                                                            raf2.close();
                                                        } catch (IOException e6) {
                                                            e6.printStackTrace();
                                                            i7 = ERROR_FILE_NOT_FOUND;
                                                            return i7;
                                                        }
                                                    }
                                                } catch (IOException e7) {
                                                    e7.printStackTrace();
                                                    if (raf2 != null) {
                                                        try {
                                                            raf2.close();
                                                        } catch (IOException e8) {
                                                            e8.printStackTrace();
                                                            i7 = ERROR_FILE_NOT_FOUND;
                                                            return i7;
                                                        }
                                                    }
                                                    i7 = ERROR_FILE_NOT_FOUND;
                                                }
                                            }
                                            throw th3;
                                        } catch (Throwable th4) {
                                            if (raf2 != null) {
                                                try {
                                                    raf2.close();
                                                } catch (IOException e9) {
                                                    e9.printStackTrace();
                                                    return ERROR_FILE_NOT_FOUND;
                                                }
                                            }
                                            throw th4;
                                        }
                                    }
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                    try {
                                        if (file_channel != null) {
                                            try {
                                                file_channel.close();
                                                if (raf2 != null) {
                                                    try {
                                                        raf2.close();
                                                    } catch (IOException e11) {
                                                        e11.printStackTrace();
                                                        i8 = ERROR_FILE_NOT_FOUND;
                                                        return i8;
                                                    }
                                                }
                                            } catch (IOException e12) {
                                                e12.printStackTrace();
                                                if (raf2 != null) {
                                                    try {
                                                        raf2.close();
                                                    } catch (IOException e13) {
                                                        e13.printStackTrace();
                                                        i8 = ERROR_FILE_NOT_FOUND;
                                                        return i8;
                                                    }
                                                }
                                                i8 = ERROR_FILE_NOT_FOUND;
                                            }
                                        }
                                        i8 = ERROR_FILE_NOT_FOUND;
                                        return i8;
                                    } catch (Throwable th5) {
                                        if (raf2 != null) {
                                            try {
                                                raf2.close();
                                            } catch (IOException e14) {
                                                e14.printStackTrace();
                                                return ERROR_FILE_NOT_FOUND;
                                            }
                                        }
                                        throw th5;
                                    }
                                }
                            }
                            i9 = 2;
                            return i9;
                        } else if (compareResult == ERROR_FILE_NOT_FOUND || compareResult == ERROR_FILE_NOT_FOUND_INZIP) {
                            Process.killProcess(Process.myPid());
                            System.exit(0);
                        }
                    }
                    DeleteFile(String.valueOf(Appfiledir) + "/" + libname);
                    DeleteFile(String.valueOf(Appfiledir) + "/" + securename6);
                    int file_count = 0;
                    while (file_count < MAX_DEX_NUM) {
                        int deletedexresult = DeleteFile(String.valueOf(Appfiledir) + "/" + CreatenewFileName(securename0, ".", "_" + file_count));
                        int deletejarresult = DeleteFile(String.valueOf(Appfiledir) + "/" + CreatenewFileName(securename1, ".", "_" + file_count));
                        int deleteodexresult = DeleteFile(String.valueOf(Appfiledir) + "/odexdir/" + CreatenewFileName(securename0, ".", "_" + file_count));
                        DeleteFile(String.valueOf(Appfiledir) + "/odexdir/" + CreatenewFileName(securename8, ".", "_" + file_count));
                        DeleteFile(String.valueOf(Appfiledir) + "/oat/arm/" + CreatenewFileName(securename11, ".", "_" + file_count));
                        DeleteFile(String.valueOf(Appfiledir) + "/oat/arm64/" + CreatenewFileName(securename11, ".", "_" + file_count));
                        DeleteFile(String.valueOf(Appfiledir) + "/oat/arm/" + CreatenewFileName(securename14, ".", "_" + file_count));
                        DeleteFile(String.valueOf(Appfiledir) + "/oat/arm/" + CreatenewFileName(securename15, ".", "_" + file_count));
                        DeleteFile(String.valueOf(Appfiledir) + "/oat/arm64/" + CreatenewFileName(securename14, ".", "_" + file_count));
                        DeleteFile(String.valueOf(Appfiledir) + "/oat/arm64/" + CreatenewFileName(securename15, ".", "_" + file_count));
                        if (ERROR_FILE_NOT_FOUND == deletedexresult && ERROR_FILE_NOT_FOUND == deletejarresult && ERROR_FILE_NOT_FOUND == deleteodexresult) {
                            break;
                        }
                        if (ERROR_EXCEPTION == deletedexresult || ERROR_EXCEPTION == deletejarresult || ERROR_EXCEPTION == deleteodexresult) {
                            Process.killProcess(Process.myPid());
                            System.exit(0);
                        }
                        file_count++;
                    }
                    DeleteFile(String.valueOf(Appfiledir) + "/" + securename9);
                    DeleteFile(String.valueOf(Appfiledir) + "/" + securename5);
                    UnzipFile(apkzf, "assets/" + securename5, new File(String.valueOf(Appfiledir) + "/" + securename5));
                    UnzipFile(apkzf, "assets/" + libname, new File(String.valueOf(Appfiledir) + "/" + libname));
                    UnzipFile(apkzf, "assets/" + securename6, new File(String.valueOf(Appfiledir) + "/" + securename6));
                    UnzipFile(apkzf, "assets/" + securename7, new File(String.valueOf(Appfiledir) + "/" + securename7));
                    UnzipFile(apkzf, Cookiefileinzip, new File(Cookiefilepath));
                    for (int file_count2 = 0; file_count2 < file_count; file_count2++) {
                        int deletedexresult2 = DeleteFile(String.valueOf(backupfilepath) + "/" + CreatenewFileName(securename0, ".", "_" + file_count2));
                        int deletejarresult2 = DeleteFile(String.valueOf(backupfilepath) + "/" + CreatenewFileName(securename1, ".", "_" + file_count2));
                        int deleteodexresult2 = DeleteFile(String.valueOf(backupfilepath) + "/odexdir/" + CreatenewFileName(securename0, ".", "_" + file_count2));
                        DeleteFile(String.valueOf(backupfilepath) + "/odexdir/" + CreatenewFileName(securename8, ".", "_" + file_count2));
                        DeleteFile(String.valueOf(backupfilepath) + "/oat/arm/" + CreatenewFileName(securename11, ".", "_" + file_count2));
                        DeleteFile(String.valueOf(backupfilepath) + "/oat/arm64/" + CreatenewFileName(securename11, ".", "_" + file_count2));
                        DeleteFile(String.valueOf(backupfilepath) + "/oat/arm/" + CreatenewFileName(securename14, ".", "_" + file_count2));
                        DeleteFile(String.valueOf(backupfilepath) + "/oat/arm/" + CreatenewFileName(securename15, ".", "_" + file_count2));
                        DeleteFile(String.valueOf(backupfilepath) + "/oat/arm64/" + CreatenewFileName(securename14, ".", "_" + file_count2));
                        DeleteFile(String.valueOf(backupfilepath) + "/oat/arm64/" + CreatenewFileName(securename15, ".", "_" + file_count2));
                        if (ERROR_FILE_NOT_FOUND == deletedexresult2 && ERROR_FILE_NOT_FOUND == deletejarresult2 && ERROR_FILE_NOT_FOUND == deleteodexresult2) {
                            break;
                        }
                        if (ERROR_EXCEPTION == deletedexresult2 || ERROR_EXCEPTION == deletejarresult2 || ERROR_EXCEPTION == deleteodexresult2) {
                            Process.killProcess(Process.myPid());
                            System.exit(0);
                        }
                    }
                    for (int file_count3 = 0; file_count3 < file_count; file_count3++) {
                        int deletedexresult3 = DeleteFile(String.valueOf(firstloadfilepath) + "/" + CreatenewFileName(securename0, ".", "_" + file_count3));
                        int deletejarresult3 = DeleteFile(String.valueOf(firstloadfilepath) + "/" + CreatenewFileName(securename1, ".", "_" + file_count3));
                        int deleteodexresult3 = DeleteFile(String.valueOf(firstloadfilepath) + "/odexdir/" + CreatenewFileName(securename0, ".", "_" + file_count3));
                        DeleteFile(String.valueOf(firstloadfilepath) + "/odexdir/" + CreatenewFileName(securename8, ".", "_" + file_count3));
                        DeleteFile(String.valueOf(firstloadfilepath) + "/oat/arm/" + CreatenewFileName(securename11, ".", "_" + file_count3));
                        DeleteFile(String.valueOf(firstloadfilepath) + "/oat/arm64/" + CreatenewFileName(securename11, ".", "_" + file_count3));
                        DeleteFile(String.valueOf(firstloadfilepath) + "/oat/arm/" + CreatenewFileName(securename14, ".", "_" + file_count3));
                        DeleteFile(String.valueOf(firstloadfilepath) + "/oat/arm/" + CreatenewFileName(securename15, ".", "_" + file_count3));
                        DeleteFile(String.valueOf(firstloadfilepath) + "/oat/arm64/" + CreatenewFileName(securename14, ".", "_" + file_count3));
                        DeleteFile(String.valueOf(firstloadfilepath) + "/oat/arm64/" + CreatenewFileName(securename15, ".", "_" + file_count3));
                        if (ERROR_FILE_NOT_FOUND == deletedexresult3 && ERROR_FILE_NOT_FOUND == deletejarresult3 && ERROR_FILE_NOT_FOUND == deleteodexresult3) {
                            break;
                        }
                        if (ERROR_EXCEPTION == deletedexresult3 || ERROR_EXCEPTION == deletejarresult3 || ERROR_EXCEPTION == deleteodexresult3) {
                            Process.killProcess(Process.myPid());
                            System.exit(0);
                        }
                    }
                    ZipEntry fileUnzip5 = apkzf.getEntry("assets/" + Libnameinapk);
                    if (fileUnzip5 != null && !isFileValid(String.valueOf(Appfiledir) + "/" + libname, fileUnzip5.getSize())) {
                        UnzipFile(apkzf, "assets/" + Libnameinapk, new File(String.valueOf(Appfiledir) + "/" + libname));
                    }
                    ZipEntry fileUnzip6 = apkzf.getEntry("assets/" + Libnameinapk);
                    if (fileUnzip6 != null && !isFileValid(String.valueOf(Appfiledir) + "/" + securename6, fileUnzip6.getSize())) {
                        UnzipFile(apkzf, "assets/" + securename6, new File(String.valueOf(Appfiledir) + "/" + securename6));
                    }
                    ZipEntry fileUnzip7 = apkzf.getEntry("assets/" + Libnameinapk);
                    if (fileUnzip7 != null && !isFileValid(String.valueOf(Appfiledir) + "/" + securename7, fileUnzip7.getSize())) {
                        UnzipFile(apkzf, "assets/" + securename7, new File(String.valueOf(Appfiledir) + "/" + securename7));
                    }
                    ZipEntry fileUnzip8 = apkzf.getEntry(Cookiefileinzip);
                    if (fileUnzip8 != null && !isFileValid(Cookiefilepath, fileUnzip8.getSize())) {
                        UnzipFile(apkzf, Cookiefileinzip, new File(Cookiefilepath));
                    }
                    if (file_lock != null) {
                        try {
                            try {
                                file_lock.release();
                                try {
                                    if (file_channel != null) {
                                        try {
                                            file_channel.close();
                                            if (raf2 != null) {
                                                try {
                                                    raf2.close();
                                                } catch (IOException e15) {
                                                    e15.printStackTrace();
                                                    i6 = ERROR_FILE_NOT_FOUND;
                                                }
                                            }
                                        } catch (IOException e16) {
                                            e16.printStackTrace();
                                            if (raf2 != null) {
                                                try {
                                                    raf2.close();
                                                } catch (IOException e17) {
                                                    e17.printStackTrace();
                                                    i6 = ERROR_FILE_NOT_FOUND;
                                                }
                                            }
                                            i6 = ERROR_FILE_NOT_FOUND;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    if (raf2 != null) {
                                        try {
                                            raf2.close();
                                        } catch (IOException e18) {
                                            e18.printStackTrace();
                                            return ERROR_FILE_NOT_FOUND;
                                        }
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                try {
                                    if (file_channel != null) {
                                        try {
                                            file_channel.close();
                                            if (raf2 != null) {
                                                try {
                                                    raf2.close();
                                                } catch (IOException e19) {
                                                    e19.printStackTrace();
                                                    i4 = ERROR_FILE_NOT_FOUND;
                                                    return i4;
                                                }
                                            }
                                        } catch (IOException e20) {
                                            e20.printStackTrace();
                                            if (raf2 != null) {
                                                try {
                                                    raf2.close();
                                                } catch (IOException e21) {
                                                    e21.printStackTrace();
                                                    i4 = ERROR_FILE_NOT_FOUND;
                                                    return i4;
                                                }
                                            }
                                            i4 = ERROR_FILE_NOT_FOUND;
                                        }
                                    }
                                    throw th7;
                                } catch (Throwable th8) {
                                    if (raf2 != null) {
                                        try {
                                            raf2.close();
                                        } catch (IOException e22) {
                                            e22.printStackTrace();
                                            return ERROR_FILE_NOT_FOUND;
                                        }
                                    }
                                    throw th8;
                                }
                            }
                        } catch (IOException e23) {
                            e23.printStackTrace();
                            try {
                                if (file_channel != null) {
                                    try {
                                        file_channel.close();
                                        if (raf2 != null) {
                                            try {
                                                raf2.close();
                                            } catch (IOException e24) {
                                                e24.printStackTrace();
                                                i5 = ERROR_FILE_NOT_FOUND;
                                                return i5;
                                            }
                                        }
                                    } catch (IOException e25) {
                                        e25.printStackTrace();
                                        if (raf2 != null) {
                                            try {
                                                raf2.close();
                                            } catch (IOException e26) {
                                                e26.printStackTrace();
                                                i5 = ERROR_FILE_NOT_FOUND;
                                                return i5;
                                            }
                                        }
                                        i5 = ERROR_FILE_NOT_FOUND;
                                    }
                                }
                                i5 = ERROR_FILE_NOT_FOUND;
                                return i5;
                            } catch (Throwable th9) {
                                if (raf2 != null) {
                                    try {
                                        raf2.close();
                                    } catch (IOException e27) {
                                        e27.printStackTrace();
                                        return ERROR_FILE_NOT_FOUND;
                                    }
                                }
                                throw th9;
                            }
                        }
                    }
                    i6 = 0;
                    return i6;
                } catch (Exception e28) {
                    e = e28;
                    raf = raf2;
                    e.printStackTrace();
                    ZipEntry fileUnzip9 = apkzf.getEntry("assets/" + Libnameinapk);
                    if (fileUnzip9 != null && !isFileValid(String.valueOf(Appfiledir) + "/" + libname, fileUnzip9.getSize())) {
                        UnzipFile(apkzf, "assets/" + Libnameinapk, new File(String.valueOf(Appfiledir) + "/" + libname));
                    }
                    ZipEntry fileUnzip10 = apkzf.getEntry("assets/" + Libnameinapk);
                    if (fileUnzip10 != null && !isFileValid(String.valueOf(Appfiledir) + "/" + securename6, fileUnzip10.getSize())) {
                        UnzipFile(apkzf, "assets/" + securename6, new File(String.valueOf(Appfiledir) + "/" + securename6));
                    }
                    ZipEntry fileUnzip11 = apkzf.getEntry("assets/" + Libnameinapk);
                    if (fileUnzip11 != null && !isFileValid(String.valueOf(Appfiledir) + "/" + securename7, fileUnzip11.getSize())) {
                        UnzipFile(apkzf, "assets/" + securename7, new File(String.valueOf(Appfiledir) + "/" + securename7));
                    }
                    ZipEntry fileUnzip12 = apkzf.getEntry(Cookiefileinzip);
                    if (fileUnzip12 != null && !isFileValid(Cookiefilepath, fileUnzip12.getSize())) {
                        UnzipFile(apkzf, Cookiefileinzip, new File(Cookiefilepath));
                    }
                    try {
                        if (file_lock != null) {
                            try {
                                file_lock.release();
                                try {
                                    if (file_channel != null) {
                                        try {
                                            file_channel.close();
                                            if (raf != null) {
                                                try {
                                                    raf.close();
                                                } catch (IOException e29) {
                                                    e29.printStackTrace();
                                                    i = ERROR_FILE_NOT_FOUND;
                                                    return i;
                                                }
                                            }
                                        } catch (IOException e30) {
                                            e30.printStackTrace();
                                            if (raf != null) {
                                                try {
                                                    raf.close();
                                                } catch (IOException e31) {
                                                    e31.printStackTrace();
                                                    i = ERROR_FILE_NOT_FOUND;
                                                    return i;
                                                }
                                            }
                                            i = ERROR_FILE_NOT_FOUND;
                                        }
                                    }
                                } catch (Throwable th10) {
                                    if (raf != null) {
                                        try {
                                            raf.close();
                                        } catch (IOException e32) {
                                            e32.printStackTrace();
                                            i = ERROR_FILE_NOT_FOUND;
                                            return i;
                                        }
                                    }
                                    throw th10;
                                }
                            } catch (IOException e33) {
                                e33.printStackTrace();
                                if (file_channel != null) {
                                    try {
                                        try {
                                            file_channel.close();
                                            if (raf != null) {
                                                try {
                                                    raf.close();
                                                } catch (IOException e34) {
                                                    e34.printStackTrace();
                                                    i = ERROR_FILE_NOT_FOUND;
                                                    return i;
                                                }
                                            }
                                        } catch (Throwable th11) {
                                            if (raf != null) {
                                                try {
                                                    raf.close();
                                                } catch (IOException e35) {
                                                    e35.printStackTrace();
                                                    i = ERROR_FILE_NOT_FOUND;
                                                    return i;
                                                }
                                            }
                                            throw th11;
                                        }
                                    } catch (IOException e36) {
                                        e36.printStackTrace();
                                        if (raf != null) {
                                            try {
                                                raf.close();
                                            } catch (IOException e37) {
                                                e37.printStackTrace();
                                                i = ERROR_FILE_NOT_FOUND;
                                                return i;
                                            }
                                        }
                                        i = ERROR_FILE_NOT_FOUND;
                                        return i;
                                    }
                                }
                                i = ERROR_FILE_NOT_FOUND;
                            }
                        }
                        i = ERROR_FILE_NOT_FOUND;
                        return i;
                    } catch (Throwable th12) {
                        try {
                            if (file_channel != null) {
                                try {
                                    file_channel.close();
                                    if (raf != null) {
                                        try {
                                            raf.close();
                                        } catch (IOException e38) {
                                            e38.printStackTrace();
                                            i3 = ERROR_FILE_NOT_FOUND;
                                            return i3;
                                        }
                                    }
                                } catch (IOException e39) {
                                    e39.printStackTrace();
                                    if (raf != null) {
                                        try {
                                            raf.close();
                                        } catch (IOException e40) {
                                            e40.printStackTrace();
                                            i3 = ERROR_FILE_NOT_FOUND;
                                            return i3;
                                        }
                                    }
                                    i3 = ERROR_FILE_NOT_FOUND;
                                }
                            }
                            throw th12;
                        } catch (Throwable th13) {
                            if (raf != null) {
                                try {
                                    raf.close();
                                } catch (IOException e41) {
                                    e41.printStackTrace();
                                    return ERROR_FILE_NOT_FOUND;
                                }
                            }
                            throw th13;
                        }
                    }
                } catch (Throwable th14) {
                    th = th14;
                    raf = raf2;
                    ZipEntry fileUnzip13 = apkzf.getEntry("assets/" + Libnameinapk);
                    if (fileUnzip13 != null && !isFileValid(String.valueOf(Appfiledir) + "/" + libname, fileUnzip13.getSize())) {
                        UnzipFile(apkzf, "assets/" + Libnameinapk, new File(String.valueOf(Appfiledir) + "/" + libname));
                    }
                    ZipEntry fileUnzip14 = apkzf.getEntry("assets/" + Libnameinapk);
                    if (fileUnzip14 != null && !isFileValid(String.valueOf(Appfiledir) + "/" + securename6, fileUnzip14.getSize())) {
                        UnzipFile(apkzf, "assets/" + securename6, new File(String.valueOf(Appfiledir) + "/" + securename6));
                    }
                    ZipEntry fileUnzip15 = apkzf.getEntry("assets/" + Libnameinapk);
                    if (fileUnzip15 != null && !isFileValid(String.valueOf(Appfiledir) + "/" + securename7, fileUnzip15.getSize())) {
                        UnzipFile(apkzf, "assets/" + securename7, new File(String.valueOf(Appfiledir) + "/" + securename7));
                    }
                    ZipEntry fileUnzip16 = apkzf.getEntry(Cookiefileinzip);
                    if (fileUnzip16 != null && !isFileValid(Cookiefilepath, fileUnzip16.getSize())) {
                        UnzipFile(apkzf, Cookiefileinzip, new File(Cookiefilepath));
                    }
                    try {
                        if (file_lock != null) {
                            try {
                                file_lock.release();
                                try {
                                    if (file_channel != null) {
                                        try {
                                            file_channel.close();
                                            if (raf != null) {
                                                try {
                                                    raf.close();
                                                } catch (IOException e42) {
                                                    e42.printStackTrace();
                                                    i2 = ERROR_FILE_NOT_FOUND;
                                                    return i2;
                                                }
                                            }
                                        } catch (IOException e43) {
                                            e43.printStackTrace();
                                            if (raf != null) {
                                                try {
                                                    raf.close();
                                                } catch (IOException e44) {
                                                    e44.printStackTrace();
                                                    i2 = ERROR_FILE_NOT_FOUND;
                                                    return i2;
                                                }
                                            }
                                            i2 = ERROR_FILE_NOT_FOUND;
                                        }
                                    }
                                } catch (Throwable th15) {
                                    if (raf != null) {
                                        try {
                                            raf.close();
                                        } catch (IOException e45) {
                                            e45.printStackTrace();
                                            i = ERROR_FILE_NOT_FOUND;
                                            return i;
                                        }
                                    }
                                    throw th15;
                                }
                            } catch (IOException e46) {
                                e46.printStackTrace();
                                try {
                                    if (file_channel != null) {
                                        try {
                                            file_channel.close();
                                            if (raf != null) {
                                                try {
                                                    raf.close();
                                                } catch (IOException e47) {
                                                    e47.printStackTrace();
                                                    i = ERROR_FILE_NOT_FOUND;
                                                    return i;
                                                }
                                            }
                                        } catch (IOException e48) {
                                            e48.printStackTrace();
                                            if (raf != null) {
                                                try {
                                                    raf.close();
                                                } catch (IOException e49) {
                                                    e49.printStackTrace();
                                                    i = ERROR_FILE_NOT_FOUND;
                                                    return i;
                                                }
                                            }
                                            i = ERROR_FILE_NOT_FOUND;
                                        }
                                    }
                                    i = ERROR_FILE_NOT_FOUND;
                                } catch (Throwable th16) {
                                    if (raf != null) {
                                        try {
                                            raf.close();
                                        } catch (IOException e50) {
                                            e50.printStackTrace();
                                            i = ERROR_FILE_NOT_FOUND;
                                            return i;
                                        }
                                    }
                                    throw th16;
                                }
                            }
                        }
                        throw th;
                    } catch (Throwable th17) {
                        if (file_channel != null) {
                            try {
                                try {
                                    file_channel.close();
                                    if (raf != null) {
                                        try {
                                            raf.close();
                                        } catch (IOException e51) {
                                            e51.printStackTrace();
                                            return ERROR_FILE_NOT_FOUND;
                                        }
                                    }
                                } catch (Throwable th18) {
                                    if (raf != null) {
                                        try {
                                            raf.close();
                                        } catch (IOException e52) {
                                            e52.printStackTrace();
                                            return ERROR_FILE_NOT_FOUND;
                                        }
                                    }
                                    throw th18;
                                }
                            } catch (IOException e53) {
                                e53.printStackTrace();
                                if (raf != null) {
                                    try {
                                        raf.close();
                                    } catch (IOException e54) {
                                        e54.printStackTrace();
                                        return ERROR_FILE_NOT_FOUND;
                                    }
                                }
                                return ERROR_FILE_NOT_FOUND;
                            }
                        }
                        throw th17;
                    }
                }
            } catch (Throwable th19) {
                th = th19;
            }
        } catch (Exception e55) {
            e = e55;
        }
    }

    private static boolean isFileValid(String path, long length) {
        File tmpfile = new File(path);
        return tmpfile.exists() && tmpfile.length() == length;
    }

    public static long getCRC32(File fileUri) {
        CRC32 crc32 = new CRC32();
        long crc = 0;
        try {
            BufferedInputStream bufbr = new BufferedInputStream(new FileInputStream(fileUri));
            try {
                CheckedInputStream checkedinputstream = new CheckedInputStream(bufbr, crc32);
                try {
                    byte[] buf = new byte[65536];
                    do {
                    } while (checkedinputstream.read(buf) >= 0);
                    crc = checkedinputstream.getChecksum().getValue();
                    checkedinputstream.close();
                } catch (FileNotFoundException e) {
                    e = e;
                    e.printStackTrace();
                    return crc;
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    return crc;
                }
            } catch (FileNotFoundException e3) {
                e = e3;
            } catch (IOException e4) {
                e = e4;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
        } catch (IOException e6) {
            e = e6;
        }
        return crc;
    }

    public static String CreatenewFileName(String Oldfilename, String SplitString, String InsertString) {
        int index = Oldfilename.lastIndexOf(SplitString);
        if (index >= 0) {
            return String.valueOf(Oldfilename.substring(0, index)) + InsertString + Oldfilename.substring(index, Oldfilename.length());
        }
        return null;
    }

    public static boolean SafeUnzipFile(ZipFile zf, String filepathinzip, File fileinfiledir) {
        return SafeUnzipFile(zf, filepathinzip, fileinfiledir, 0L);
    }

    public static boolean SafeUnzipFile(ZipFile zf, String filepathinzip, File fileinfiledir, long crc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        BufferedOutputStream Output_fos = null;
        BufferedInputStream bufbr = null;
        try {
            try {
                ZipEntry ze = zf.getEntry(filepathinzip);
                if (ze == null) {
                    try {
                        if (0 != 0) {
                            try {
                                Output_fos.close();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                        z2 = false;
                                    }
                                }
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                        z2 = false;
                                    }
                                }
                                z2 = false;
                            }
                        }
                        z2 = false;
                        return z2;
                    } catch (Throwable th) {
                        if (0 != 0) {
                            try {
                                bufbr.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                return false;
                            }
                        }
                        throw th;
                    }
                } else if (crc != 0 && ze.getCrc() == crc) {
                    try {
                        if (0 != 0) {
                            try {
                                Output_fos.close();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                        z4 = false;
                                    }
                                }
                            } catch (IOException e6) {
                                e6.printStackTrace();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                        z4 = false;
                                    }
                                }
                                z4 = false;
                            }
                        }
                        z4 = true;
                        return z4;
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            try {
                                bufbr.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                                return false;
                            }
                        }
                        throw th2;
                    }
                } else {
                    byte[] buf = UnzipFile(zf, ze);
                    if (1 != 0) {
                        BufferedOutputStream Output_fos2 = new BufferedOutputStream(new FileOutputStream(fileinfiledir));
                        try {
                            Output_fos2.write(buf, 0, buf.length);
                            Output_fos = Output_fos2;
                        } catch (Exception e9) {
                            e = e9;
                            Output_fos = Output_fos2;
                            e.printStackTrace();
                            try {
                                if (Output_fos != null) {
                                    try {
                                        Output_fos.close();
                                        if (0 != 0) {
                                            try {
                                                bufbr.close();
                                            } catch (IOException e10) {
                                                e10.printStackTrace();
                                                z = false;
                                                return z;
                                            }
                                        }
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                        if (0 != 0) {
                                            try {
                                                bufbr.close();
                                            } catch (IOException e12) {
                                                e12.printStackTrace();
                                                z = false;
                                                return z;
                                            }
                                        }
                                        z = false;
                                    }
                                }
                                z = false;
                                return z;
                            } catch (Throwable th3) {
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e13) {
                                        e13.printStackTrace();
                                        return false;
                                    }
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            Output_fos = Output_fos2;
                            if (Output_fos != null) {
                                try {
                                    try {
                                        Output_fos.close();
                                        if (0 != 0) {
                                            try {
                                                bufbr.close();
                                            } catch (IOException e14) {
                                                e14.printStackTrace();
                                                return false;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        if (0 != 0) {
                                            try {
                                                bufbr.close();
                                            } catch (IOException e15) {
                                                e15.printStackTrace();
                                                return false;
                                            }
                                        }
                                        throw th5;
                                    }
                                } catch (IOException e16) {
                                    e16.printStackTrace();
                                    if (0 != 0) {
                                        try {
                                            bufbr.close();
                                        } catch (IOException e17) {
                                            e17.printStackTrace();
                                            return false;
                                        }
                                    }
                                    return false;
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        if (Output_fos != null) {
                            try {
                                Output_fos.close();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e18) {
                                        e18.printStackTrace();
                                        z3 = false;
                                    }
                                }
                            } catch (IOException e19) {
                                e19.printStackTrace();
                                if (0 != 0) {
                                    try {
                                        bufbr.close();
                                    } catch (IOException e20) {
                                        e20.printStackTrace();
                                        z3 = false;
                                    }
                                }
                                z3 = false;
                            }
                        }
                        z3 = true;
                        return z3;
                    } catch (Throwable th6) {
                        if (0 != 0) {
                            try {
                                bufbr.close();
                            } catch (IOException e21) {
                                e21.printStackTrace();
                                return false;
                            }
                        }
                        throw th6;
                    }
                }
            } catch (Exception e22) {
                e = e22;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public static byte[] UnzipFile(ZipFile zf, ZipEntry ze) throws IOException {
        byte[] buf = new byte[(int) ze.getSize()];
        BufferedInputStream bufbr = new BufferedInputStream(zf.getInputStream(ze));
        int totallen = 0;
        do {
            int readlen = bufbr.read(buf, totallen, ((int) ze.getSize()) - totallen);
            if (readlen < 0) {
                break;
            }
            totallen += readlen;
        } while (totallen != ze.getSize());
        if (totallen != ((int) ze.getSize())) {
            throw new IOException("incorrect zip file size");
        }
        return buf;
    }

    private static long getFileCRC32(File file) {
        BufferedInputStream filebr;
        long result = -1;
        byte[] filebuf = new byte[(int) file.length()];
        BufferedInputStream filebr2 = null;
        CRC32 crc32 = new CRC32();
        try {
            try {
                filebr = new BufferedInputStream(new FileInputStream(file));
                int totallen = 0;
                while (true) {
                    try {
                        int readlen = filebr.read(filebuf);
                        if (readlen < 0) {
                            break;
                        }
                        crc32.update(filebuf);
                        totallen += readlen;
                    } catch (FileNotFoundException e) {
                        e1 = e;
                        filebr2 = filebr;
                        e1.printStackTrace();
                        if (filebr2 != null) {
                            try {
                                filebr2.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        return result;
                    } catch (IOException e3) {
                        e = e3;
                        filebr2 = filebr;
                        e.printStackTrace();
                        if (filebr2 != null) {
                            try {
                                filebr2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        return result;
                    } catch (Throwable th) {
                        th = th;
                        filebr2 = filebr;
                        if (filebr2 != null) {
                            try {
                                filebr2.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                result = crc32.getValue();
            } catch (FileNotFoundException e6) {
                e1 = e6;
            } catch (IOException e7) {
                e = e7;
            }
            if (filebr != null) {
                try {
                    filebr.close();
                    filebr2 = filebr;
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
                return result;
            }
            filebr2 = filebr;
            return result;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean checkCopiedFileCrc(ZipFile zf, String filepathinzip, File file) {
        long crc = getFileCRC32(file);
        if (crc == -1) {
            return false;
        }
        try {
            ZipEntry ze = zf.getEntry(filepathinzip);
            if (ze == null || crc == 0) {
                return false;
            }
            return ze.getCrc() == crc;
        } catch (Exception e) {
            return false;
        }
    }
}
