package D;

import G.B;
import G.K;
import G.O;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.emoji2.text.A;
import androidx.emoji2.text.u;
import androidx.emoji2.text.x;
import androidx.emoji2.text.y;
import g.C0146r;
import g.LayoutInflaterFactory2C0118A;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.AbstractC0225a;
import l.MenuC0238C;

/* loaded from: classes.dex */
public final class c implements I0.b, androidx.emoji2.text.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20c;

    public /* synthetic */ c(Object obj, int i2, Object obj2) {
        this.f18a = i2;
        this.f19b = obj;
        this.f20c = obj2;
    }

    @Override // androidx.emoji2.text.p
    public Object a() {
        return (A) this.f19b;
    }

    @Override // androidx.emoji2.text.p
    public boolean b(CharSequence charSequence, int i2, int i3, x xVar) {
        if ((xVar.f1149c & 4) > 0) {
            return true;
        }
        if (((A) this.f19b) == null) {
            this.f19b = new A(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((L.c) this.f20c).getClass();
        ((A) this.f19b).setSpan(new y(xVar), i2, i3, 33);
        return true;
    }

    public void c(AbstractC0225a abstractC0225a) {
        u uVar = (u) this.f19b;
        ((ActionMode.Callback) uVar.f1140a).onDestroyActionMode(uVar.c(abstractC0225a));
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) this.f20c;
        if (layoutInflaterFactory2C0118A.f1571w != null) {
            layoutInflaterFactory2C0118A.f1560l.getDecorView().removeCallbacks(layoutInflaterFactory2C0118A.x);
        }
        if (layoutInflaterFactory2C0118A.f1570v != null) {
            O o2 = layoutInflaterFactory2C0118A.f1572y;
            if (o2 != null) {
                o2.b();
            }
            O oA = K.a(layoutInflaterFactory2C0118A.f1570v);
            oA.a(0.0f);
            layoutInflaterFactory2C0118A.f1572y = oA;
            oA.d(new C0146r(2, this));
        }
        layoutInflaterFactory2C0118A.f1569u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0118A.f1526A;
        WeakHashMap weakHashMap = K.f146a;
        B.c(viewGroup);
        layoutInflaterFactory2C0118A.I();
    }

    public boolean d(AbstractC0225a abstractC0225a, l.n nVar) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0118A) this.f20c).f1526A;
        WeakHashMap weakHashMap = K.f146a;
        B.c(viewGroup);
        u uVar = (u) this.f19b;
        k.e eVarC = uVar.c(abstractC0225a);
        p.k kVar = (p.k) uVar.d;
        Menu menuC0238C = (Menu) kVar.get(nVar);
        if (menuC0238C == null) {
            menuC0238C = new MenuC0238C((Context) uVar.f1141b, nVar);
            kVar.put(nVar, menuC0238C);
        }
        return ((ActionMode.Callback) uVar.f1140a).onPrepareActionMode(eVarC, menuC0238C);
    }

    public void e(k kVar) {
        int i2 = kVar.f39b;
        q qVar = (q) this.f20c;
        X.i iVar = (X.i) this.f19b;
        if (i2 != 0) {
            qVar.execute(new b(iVar, i2));
        } else {
            qVar.execute(new a(iVar, 0, kVar.f38a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Type inference failed for: r2v4, types: [p0.g, w0.q] */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(I0.c r6, p0.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.f18a
            switch(r0) {
                case 1: goto L1f;
                default: goto L5;
            }
        L5:
            I0.l r0 = new I0.l
            java.lang.Object r1 = r5.f20c
            a0.l r1 = (a0.l) r1
            r2 = 1
            r0.<init>(r6, r1, r2)
            java.lang.Object r6 = r5.f19b
            X.i r6 = (X.i) r6
            java.lang.Object r6 = r6.o(r0, r7)
            o0.a r7 = o0.EnumC0322a.f2519b
            if (r6 != r7) goto L1c
            goto L1e
        L1c:
            k0.h r6 = k0.C0235h.f2029a
        L1e:
            return r6
        L1f:
            boolean r0 = r7 instanceof I0.i
            if (r0 == 0) goto L32
            r0 = r7
            I0.i r0 = (I0.i) r0
            int r1 = r0.f293f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L32
            int r1 = r1 - r2
            r0.f293f = r1
            goto L37
        L32:
            I0.i r0 = new I0.i
            r0.<init>(r5, r7)
        L37:
            java.lang.Object r7 = r0.f292e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f293f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L59
            if (r2 == r4) goto L51
            if (r2 != r3) goto L49
            a.AbstractC0062a.X(r7)
            goto L84
        L49:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L51:
            I0.c r6 = r0.f295i
            D.c r2 = r0.h
            a.AbstractC0062a.X(r7)
            goto L6e
        L59:
            a.AbstractC0062a.X(r7)
            r0.h = r5
            r0.f295i = r6
            r0.f293f = r4
            java.lang.Object r7 = r5.f19b
            I0.b r7 = (I0.b) r7
            java.io.Serializable r7 = a.AbstractC0062a.i(r7, r6, r0)
            if (r7 != r1) goto L6d
            goto L86
        L6d:
            r2 = r5
        L6e:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L84
            java.lang.Object r2 = r2.f20c
            p0.g r2 = (p0.g) r2
            r4 = 0
            r0.h = r4
            r0.f295i = r4
            r0.f293f = r3
            java.lang.Object r6 = r2.e(r6, r7, r0)
            if (r6 != r1) goto L84
            goto L86
        L84:
            k0.h r1 = k0.C0235h.f2029a
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D.c.o(I0.c, p0.c):java.lang.Object");
    }

    public c(Context context) {
        this.f18a = 4;
        this.f19b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(I0.b bVar, w0.q qVar) {
        this.f18a = 1;
        this.f19b = bVar;
        this.f20c = (p0.g) qVar;
    }

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f18a = 7;
        int size = arrayList.size();
        this.f19b = new int[size];
        this.f20c = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.f19b)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.f20c)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public c(int i2, int i3) {
        this.f18a = 7;
        this.f19b = new int[]{i2, i3};
        this.f20c = new float[]{0.0f, 1.0f};
    }

    public c(int i2, int i3, int i4) {
        this.f18a = 7;
        this.f19b = new int[]{i2, i3, i4};
        this.f20c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public c(EditText editText) {
        this.f18a = 3;
        this.f19b = editText;
        M.i iVar = new M.i(editText);
        this.f20c = iVar;
        editText.addTextChangedListener(iVar);
        if (M.a.f416b == null) {
            synchronized (M.a.f415a) {
                try {
                    if (M.a.f416b == null) {
                        M.a aVar = new M.a();
                        try {
                            M.a.f417c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, M.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        M.a.f416b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(M.a.f416b);
    }

    public c(LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A, u uVar) {
        this.f18a = 6;
        this.f20c = layoutInflaterFactory2C0118A;
        this.f19b = uVar;
    }
}
