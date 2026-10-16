package U;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f649a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f650b;

    /* renamed from: c, reason: collision with root package name */
    public float f651c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f652e;

    /* renamed from: f, reason: collision with root package name */
    public float f653f;

    /* renamed from: g, reason: collision with root package name */
    public float f654g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f655i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f656j;

    /* renamed from: k, reason: collision with root package name */
    public String f657k;

    public k() {
        this.f649a = new Matrix();
        this.f650b = new ArrayList();
        this.f651c = 0.0f;
        this.d = 0.0f;
        this.f652e = 0.0f;
        this.f653f = 1.0f;
        this.f654g = 1.0f;
        this.h = 0.0f;
        this.f655i = 0.0f;
        this.f656j = new Matrix();
        this.f657k = null;
    }

    @Override // U.l
    public final boolean a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f650b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i2)).a()) {
                return true;
            }
            i2++;
        }
    }

    @Override // U.l
    public final boolean b(int[] iArr) {
        int i2 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f650b;
            if (i2 >= arrayList.size()) {
                return zB;
            }
            zB |= ((l) arrayList.get(i2)).b(iArr);
            i2++;
        }
    }

    public final void c() {
        Matrix matrix = this.f656j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f652e);
        matrix.postScale(this.f653f, this.f654g);
        matrix.postRotate(this.f651c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f655i + this.f652e);
    }

    public String getGroupName() {
        return this.f657k;
    }

    public Matrix getLocalMatrix() {
        return this.f656j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f652e;
    }

    public float getRotation() {
        return this.f651c;
    }

    public float getScaleX() {
        return this.f653f;
    }

    public float getScaleY() {
        return this.f654g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f655i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.d) {
            this.d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f652e) {
            this.f652e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f651c) {
            this.f651c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f653f) {
            this.f653f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f654g) {
            this.f654g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.f655i) {
            this.f655i = f2;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(k kVar, p.f fVar) {
        i iVar;
        this.f649a = new Matrix();
        this.f650b = new ArrayList();
        this.f651c = 0.0f;
        this.d = 0.0f;
        this.f652e = 0.0f;
        this.f653f = 1.0f;
        this.f654g = 1.0f;
        this.h = 0.0f;
        this.f655i = 0.0f;
        Matrix matrix = new Matrix();
        this.f656j = matrix;
        this.f657k = null;
        this.f651c = kVar.f651c;
        this.d = kVar.d;
        this.f652e = kVar.f652e;
        this.f653f = kVar.f653f;
        this.f654g = kVar.f654g;
        this.h = kVar.h;
        this.f655i = kVar.f655i;
        String str = kVar.f657k;
        this.f657k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(kVar.f656j);
        ArrayList arrayList = kVar.f650b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof k) {
                this.f650b.add(new k((k) obj, fVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    j jVar2 = new j(jVar);
                    jVar2.f640e = 0.0f;
                    jVar2.f642g = 1.0f;
                    jVar2.h = 1.0f;
                    jVar2.f643i = 0.0f;
                    jVar2.f644j = 1.0f;
                    jVar2.f645k = 0.0f;
                    jVar2.f646l = Paint.Cap.BUTT;
                    jVar2.f647m = Paint.Join.MITER;
                    jVar2.f648n = 4.0f;
                    jVar2.d = jVar.d;
                    jVar2.f640e = jVar.f640e;
                    jVar2.f642g = jVar.f642g;
                    jVar2.f641f = jVar.f641f;
                    jVar2.f660c = jVar.f660c;
                    jVar2.h = jVar.h;
                    jVar2.f643i = jVar.f643i;
                    jVar2.f644j = jVar.f644j;
                    jVar2.f645k = jVar.f645k;
                    jVar2.f646l = jVar.f646l;
                    jVar2.f647m = jVar.f647m;
                    jVar2.f648n = jVar.f648n;
                    iVar = jVar2;
                } else if (obj instanceof i) {
                    iVar = new i((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f650b.add(iVar);
                Object obj2 = iVar.f659b;
                if (obj2 != null) {
                    fVar.put(obj2, iVar);
                }
            }
        }
    }
}
