package M;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f431a;

    /* renamed from: b, reason: collision with root package name */
    public h f432b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f433c = true;

    public i(EditText editText) {
        this.f431a = editText;
    }

    public static void a(EditText editText, int i2) {
        int length;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.j jVarA = androidx.emoji2.text.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = editableText.length();
            }
            jVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        EditText editText = this.f431a;
        if (editText.isInEditMode() || !this.f433c || androidx.emoji2.text.j.f1111k == null || i3 > i4 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = androidx.emoji2.text.j.a().b();
        if (iB != 0) {
            if (iB == 1) {
                androidx.emoji2.text.j.a().e((Spannable) charSequence, i2, i4 + i2);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        androidx.emoji2.text.j jVarA = androidx.emoji2.text.j.a();
        if (this.f432b == null) {
            this.f432b = new h(editText);
        }
        jVarA.f(this.f432b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
