package a.d.a.i;

import a.d.a.i.d;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static boolean[] f53a = new boolean[3];

    public static void a(e eVar, a.d.a.e eVar2, d dVar) {
        if (eVar.C[0] != d.a.WRAP_CONTENT && dVar.C[0] == d.a.MATCH_PARENT) {
            int i = dVar.s.e;
            int h = eVar.h() - dVar.u.e;
            c cVar = dVar.s;
            cVar.i = eVar2.a(cVar);
            c cVar2 = dVar.u;
            cVar2.i = eVar2.a(cVar2);
            eVar2.a(dVar.s.i, i);
            eVar2.a(dVar.u.i, h);
            dVar.f48a = 2;
            dVar.a(i, h);
        }
        if (eVar.C[1] == d.a.WRAP_CONTENT || dVar.C[1] != d.a.MATCH_PARENT) {
            return;
        }
        int i2 = dVar.t.e;
        int c = eVar.c() - dVar.v.e;
        c cVar3 = dVar.t;
        cVar3.i = eVar2.a(cVar3);
        c cVar4 = dVar.v;
        cVar4.i = eVar2.a(cVar4);
        eVar2.a(dVar.t.i, i2);
        eVar2.a(dVar.v.i, c);
        if (dVar.Q > 0 || dVar.Y == 8) {
            c cVar5 = dVar.w;
            cVar5.i = eVar2.a(cVar5);
            eVar2.a(dVar.w.i, dVar.Q + i2);
        }
        dVar.f49b = 2;
        dVar.c(i2, c);
    }

    public static boolean a(d dVar, int i) {
        d.a[] aVarArr = dVar.C;
        if (aVarArr[i] != d.a.MATCH_CONSTRAINT) {
            return false;
        }
        if (dVar.G != 0.0f) {
            if (aVarArr[i != 0 ? (char) 0 : (char) 1] == d.a.MATCH_CONSTRAINT) {
            }
            return false;
        }
        if (i == 0) {
            if (dVar.e != 0 || dVar.h != 0 || dVar.i != 0) {
                return false;
            }
        } else if (dVar.f != 0 || dVar.k != 0 || dVar.l != 0) {
            return false;
        }
        return true;
    }

    public static void a(int i, d dVar) {
        dVar.o();
        j jVar = dVar.s.f43a;
        j jVar2 = dVar.t.f43a;
        j jVar3 = dVar.u.f43a;
        j jVar4 = dVar.v.f43a;
        boolean z = (i & 8) == 8;
        boolean z2 = dVar.C[0] == d.a.MATCH_CONSTRAINT && a(dVar, 0);
        if (jVar.h != 4 && jVar3.h != 4) {
            if (dVar.C[0] == d.a.FIXED || (z2 && dVar.Y == 8)) {
                if (dVar.s.d == null && dVar.u.d == null) {
                    jVar.h = 1;
                    jVar3.h = 1;
                    if (z) {
                        jVar3.a(jVar, 1, dVar.f());
                    } else {
                        int h = dVar.h();
                        jVar3.d = jVar;
                        jVar3.e = h;
                        jVar3.d.f54a.add(jVar3);
                    }
                } else if (dVar.s.d != null && dVar.u.d == null) {
                    jVar.h = 1;
                    jVar3.h = 1;
                    if (z) {
                        jVar3.a(jVar, 1, dVar.f());
                    } else {
                        int h2 = dVar.h();
                        jVar3.d = jVar;
                        jVar3.e = h2;
                        jVar3.d.f54a.add(jVar3);
                    }
                } else if (dVar.s.d == null && dVar.u.d != null) {
                    jVar.h = 1;
                    jVar3.h = 1;
                    jVar.d = jVar3;
                    jVar.e = -dVar.h();
                    jVar.d.f54a.add(jVar);
                    if (z) {
                        jVar.a(jVar3, -1, dVar.f());
                    } else {
                        jVar.d = jVar3;
                        jVar.e = -dVar.h();
                        jVar.d.f54a.add(jVar);
                    }
                } else if (dVar.s.d != null && dVar.u.d != null) {
                    jVar.h = 2;
                    jVar3.h = 2;
                    if (z) {
                        dVar.f().f54a.add(jVar);
                        dVar.f().f54a.add(jVar3);
                        k f = dVar.f();
                        jVar.i = jVar3;
                        jVar.l = f;
                        jVar.m = -1;
                        k f2 = dVar.f();
                        jVar3.i = jVar;
                        jVar3.l = f2;
                        jVar3.m = 1;
                    } else {
                        dVar.h();
                        jVar.i = jVar3;
                        dVar.h();
                        jVar3.i = jVar;
                    }
                }
            } else if (z2) {
                int h3 = dVar.h();
                jVar.h = 1;
                jVar3.h = 1;
                if (dVar.s.d == null && dVar.u.d == null) {
                    if (z) {
                        jVar3.a(jVar, 1, dVar.f());
                    } else {
                        jVar3.d = jVar;
                        jVar3.e = h3;
                        jVar3.d.f54a.add(jVar3);
                    }
                } else if (dVar.s.d == null || dVar.u.d != null) {
                    if (dVar.s.d != null || dVar.u.d == null) {
                        if (dVar.s.d != null && dVar.u.d != null) {
                            if (z) {
                                dVar.f().f54a.add(jVar);
                                dVar.f().f54a.add(jVar3);
                            }
                            if (dVar.G == 0.0f) {
                                jVar.h = 3;
                                jVar3.h = 3;
                                jVar.i = jVar3;
                                jVar3.i = jVar;
                            } else {
                                jVar.h = 2;
                                jVar3.h = 2;
                                jVar.i = jVar3;
                                jVar3.i = jVar;
                                dVar.f(h3);
                            }
                        }
                    } else if (z) {
                        jVar.a(jVar3, -1, dVar.f());
                    } else {
                        jVar.d = jVar3;
                        jVar.e = -h3;
                        jVar.d.f54a.add(jVar);
                    }
                } else if (z) {
                    jVar3.a(jVar, 1, dVar.f());
                } else {
                    jVar3.d = jVar;
                    jVar3.e = h3;
                    jVar3.d.f54a.add(jVar3);
                }
            }
        }
        boolean z3 = dVar.C[1] == d.a.MATCH_CONSTRAINT && a(dVar, 1);
        if (jVar2.h == 4 || jVar4.h == 4) {
            return;
        }
        if (dVar.C[1] != d.a.FIXED && (!z3 || dVar.Y != 8)) {
            if (z3) {
                int c = dVar.c();
                jVar2.h = 1;
                jVar4.h = 1;
                if (dVar.t.d == null && dVar.v.d == null) {
                    if (z) {
                        jVar4.a(jVar2, 1, dVar.e());
                        return;
                    }
                    jVar4.d = jVar2;
                    jVar4.e = c;
                    jVar4.d.f54a.add(jVar4);
                } else if (dVar.t.d != null && dVar.v.d == null) {
                    if (z) {
                        jVar4.a(jVar2, 1, dVar.e());
                        return;
                    }
                    jVar4.d = jVar2;
                    jVar4.e = c;
                    jVar4.d.f54a.add(jVar4);
                } else if (dVar.t.d == null && dVar.v.d != null) {
                    if (z) {
                        jVar2.a(jVar4, -1, dVar.e());
                        return;
                    }
                    jVar2.d = jVar4;
                    jVar2.e = -c;
                    jVar2.d.f54a.add(jVar2);
                } else if (dVar.t.d == null || dVar.v.d == null) {
                } else {
                    if (z) {
                        dVar.e().f54a.add(jVar2);
                        dVar.f().f54a.add(jVar4);
                    }
                    if (dVar.G == 0.0f) {
                        jVar2.h = 3;
                        jVar4.h = 3;
                        jVar2.i = jVar4;
                        jVar4.i = jVar2;
                        return;
                    }
                    jVar2.h = 2;
                    jVar4.h = 2;
                    jVar2.i = jVar4;
                    jVar4.i = jVar2;
                    dVar.e(c);
                    int i2 = dVar.Q;
                    if (i2 > 0) {
                        dVar.w.f43a.a(1, jVar2, i2);
                    }
                }
            }
        } else if (dVar.t.d == null && dVar.v.d == null) {
            jVar2.h = 1;
            jVar4.h = 1;
            if (z) {
                jVar4.a(jVar2, 1, dVar.e());
            } else {
                int c2 = dVar.c();
                jVar4.d = jVar2;
                jVar4.e = c2;
                jVar4.d.f54a.add(jVar4);
            }
            c cVar = dVar.w;
            if (cVar.d != null) {
                j jVar5 = cVar.f43a;
                jVar5.h = 1;
                jVar2.a(1, jVar5, -dVar.Q);
            }
        } else if (dVar.t.d != null && dVar.v.d == null) {
            jVar2.h = 1;
            jVar4.h = 1;
            if (z) {
                jVar4.a(jVar2, 1, dVar.e());
            } else {
                int c3 = dVar.c();
                jVar4.d = jVar2;
                jVar4.e = c3;
                jVar4.d.f54a.add(jVar4);
            }
            int i3 = dVar.Q;
            if (i3 > 0) {
                dVar.w.f43a.a(1, jVar2, i3);
            }
        } else if (dVar.t.d == null && dVar.v.d != null) {
            jVar2.h = 1;
            jVar4.h = 1;
            if (z) {
                jVar2.a(jVar4, -1, dVar.e());
            } else {
                jVar2.d = jVar4;
                jVar2.e = -dVar.c();
                jVar2.d.f54a.add(jVar2);
            }
            int i4 = dVar.Q;
            if (i4 > 0) {
                dVar.w.f43a.a(1, jVar2, i4);
            }
        } else if (dVar.t.d == null || dVar.v.d == null) {
        } else {
            jVar2.h = 2;
            jVar4.h = 2;
            if (z) {
                k e = dVar.e();
                jVar2.i = jVar4;
                jVar2.l = e;
                jVar2.m = -1;
                k e2 = dVar.e();
                jVar4.i = jVar2;
                jVar4.l = e2;
                jVar4.m = 1;
                dVar.e().f54a.add(jVar2);
                dVar.f().f54a.add(jVar4);
            } else {
                dVar.c();
                jVar2.i = jVar4;
                dVar.c();
                jVar4.i = jVar2;
            }
            int i5 = dVar.Q;
            if (i5 > 0) {
                dVar.w.f43a.a(1, jVar2, i5);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r7.e0 == 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r7.f0 == 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c4, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(a.d.a.i.e r22, a.d.a.e r23, int r24, int r25, a.d.a.i.b r26) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.a.i.i.a(a.d.a.i.e, a.d.a.e, int, int, a.d.a.i.b):boolean");
    }

    public static void a(d dVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        c[] cVarArr = dVar.A;
        cVarArr[i3].f43a.f = dVar.D.s.f43a;
        cVarArr[i3].f43a.g = i2;
        cVarArr[i3].f43a.f55b = 1;
        cVarArr[i4].f43a.f = cVarArr[i3].f43a;
        cVarArr[i4].f43a.g = dVar.c(i);
        dVar.A[i4].f43a.f55b = 1;
    }
}
