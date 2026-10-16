package R;

import G.C0037m;
import G.K;
import a.AbstractC0062a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.C0077i;
import f.AbstractC0113a;
import java.util.LinkedHashSet;
import m.AbstractC0286p0;
import m.C0290s;
import o.C0320c;
import x0.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f608a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f609b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f610c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f611e;

    /* renamed from: f, reason: collision with root package name */
    public Object f612f;

    public /* synthetic */ d(TextView textView) {
        this.f611e = null;
        this.f612f = null;
        this.f608a = false;
        this.f609b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f608a || this.f609b) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f608a) {
                    drawableMutate.setTintList((ColorStateList) this.f611e);
                }
                if (this.f609b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f612f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        C0290s c0290s = (C0290s) this.d;
        Drawable checkMarkDrawable = c0290s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f608a || this.f609b) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f608a) {
                    drawableMutate.setTintList((ColorStateList) this.f611e);
                }
                if (this.f609b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f612f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0290s.getDrawableState());
                }
                c0290s.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f609b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f611e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f611e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f611e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f611e = null;
        }
        return bundle2;
    }

    public void d(AttributeSet attributeSet, int i2) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0113a.f1507m;
        C0037m c0037mM = C0037m.m(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) c0037mM.f196b;
        K.g(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c0037mM.f196b, i2, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0062a.v(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0062a.v(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c0037mM.h(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC0286p0.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            c0037mM.r();
        }
    }

    public void e(String str, c cVar) {
        Object obj;
        g.e("provider", cVar);
        o.f fVar = (o.f) this.d;
        C0320c c0320c = fVar.f2516b;
        while (c0320c != null && !c0320c.f2511b.equals(str)) {
            c0320c = c0320c.d;
        }
        if (c0320c != null) {
            obj = c0320c.f2512c;
        } else {
            C0320c c0320c2 = new C0320c(str, cVar);
            fVar.f2518e++;
            C0320c c0320c3 = fVar.f2517c;
            if (c0320c3 == null) {
                fVar.f2516b = c0320c2;
                fVar.f2517c = c0320c2;
            } else {
                c0320c3.d = c0320c2;
                c0320c2.f2513e = c0320c3;
                fVar.f2517c = c0320c2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() throws NoSuchMethodException, SecurityException {
        if (!this.f610c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = (a) this.f612f;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f612f = aVar;
        try {
            C0077i.class.getDeclaredConstructor(null);
            a aVar2 = (a) this.f612f;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f607b).add(C0077i.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0077i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public d() {
        this.d = new o.f();
        this.f610c = true;
    }
}
