package m;

import G.C0029e;
import G.C0031g;
import G.InterfaceC0028d;
import G.InterfaceC0043t;
import a.AbstractC0062a;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.a7m3p9xv.t6qk2z8.app.R;

/* renamed from: m.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298w extends EditText implements InterfaceC0043t, J.l {

    /* renamed from: a, reason: collision with root package name */
    public final C0285p f2475a;

    /* renamed from: b, reason: collision with root package name */
    public final C0258b0 f2476b;

    /* renamed from: c, reason: collision with root package name */
    public final C0248D f2477c;
    public final J.k d;

    /* renamed from: e, reason: collision with root package name */
    public final C0248D f2478e;

    /* renamed from: f, reason: collision with root package name */
    public C0296v f2479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0298w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        W0.a(context);
        V0.a(this, getContext());
        C0285p c0285p = new C0285p(this);
        this.f2475a = c0285p;
        c0285p.d(attributeSet, R.attr.editTextStyle);
        C0258b0 c0258b0 = new C0258b0(this);
        this.f2476b = c0258b0;
        c0258b0.f(attributeSet, R.attr.editTextStyle);
        c0258b0.b();
        C0248D c0248d = new C0248D();
        c0248d.f2215b = this;
        this.f2477c = c0248d;
        this.d = new J.k();
        C0248D c0248d2 = new C0248D(this);
        this.f2478e = c0248d2;
        c0248d2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerA = c0248d2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private C0296v getSuperCaller() {
        if (this.f2479f == null) {
            this.f2479f = new C0296v(this);
        }
        return this.f2479f;
    }

    @Override // G.InterfaceC0043t
    public final C0031g a(C0031g c0031g) {
        this.d.getClass();
        return J.k.a(this, c0031g);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0285p c0285p = this.f2475a;
        if (c0285p != null) {
            c0285p.a();
        }
        C0258b0 c0258b0 = this.f2476b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0062a.Y(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0285p c0285p = this.f2475a;
        if (c0285p != null) {
            return c0285p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0285p c0285p = this.f2475a;
        if (c0285p != null) {
            return c0285p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2476b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2476b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0248D c0248d;
        if (Build.VERSION.SDK_INT >= 28 || (c0248d = this.f2477c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0248d.f2216c;
        return textClassifier == null ? U.a((TextView) c0248d.f2215b) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[PHI: r1
  0x0056: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x0069, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            m.b0 r1 = r7.f2476b
            r1.getClass()
            m.C0258b0.h(r8, r0, r7)
            P0.b.t(r8, r0, r7)
            if (r0 == 0) goto L76
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L76
            java.lang.String[] r2 = G.K.d(r7)
            if (r2 == 0) goto L76
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            I.a.a(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            I.d r2 = new I.d
            r2.<init>(r7)
            if (r1 < r5) goto L4c
            I.e r1 = new I.e
            r1.<init>(r0, r2)
        L4a:
            r0 = r1
            goto L76
        L4c:
            java.lang.String[] r6 = I.c.f268a
            if (r1 < r5) goto L58
            java.lang.String[] r1 = I.a.b(r8)
            if (r1 == 0) goto L6c
        L56:
            r6 = r1
            goto L6c
        L58:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5d
            goto L6c
        L5d:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L69
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L69:
            if (r1 == 0) goto L6c
            goto L56
        L6c:
            int r1 = r6.length
            if (r1 != 0) goto L70
            goto L76
        L70:
            I.f r1 = new I.f
            r1.<init>(r0, r2)
            goto L4a
        L76:
            m.D r1 = r7.f2478e
            M.b r8 = r1.c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0298w.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 || i2 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i2 = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i2 < 31 && i2 >= 24 && dragEvent.getLocalState() == null && G.K.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = AbstractC0251G.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i2) {
        InterfaceC0028d iVar;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || G.K.d(this) == null || !(i2 == 16908322 || i2 == 16908337)) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                iVar = new X.i(primaryClip, 1);
            } else {
                C0029e c0029e = new C0029e();
                c0029e.f181b = primaryClip;
                c0029e.f182c = 1;
                iVar = c0029e;
            }
            iVar.x(i2 == 16908322 ? 0 : 1);
            G.K.f(this, iVar.f());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0285p c0285p = this.f2475a;
        if (c0285p != null) {
            c0285p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0285p c0285p = this.f2475a;
        if (c0285p != null) {
            c0285p.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2476b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2476b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0062a.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f2478e.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2478e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0285p c0285p = this.f2475a;
        if (c0285p != null) {
            c0285p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0285p c0285p = this.f2475a;
        if (c0285p != null) {
            c0285p.i(mode);
        }
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0258b0 c0258b0 = this.f2476b;
        c0258b0.l(colorStateList);
        c0258b0.b();
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0258b0 c0258b0 = this.f2476b;
        c0258b0.m(mode);
        c0258b0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0258b0 c0258b0 = this.f2476b;
        if (c0258b0 != null) {
            c0258b0.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0248D c0248d;
        if (Build.VERSION.SDK_INT >= 28 || (c0248d = this.f2477c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0248d.f2216c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }
}
