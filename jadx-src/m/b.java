package M;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f418a;

    /* renamed from: b, reason: collision with root package name */
    public final L.c f419b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        L.c cVar = new L.c(1);
        super(inputConnection, false);
        this.f418a = editText;
        this.f419b = cVar;
        if (androidx.emoji2.text.j.f1111k != null) {
            androidx.emoji2.text.j jVarA = androidx.emoji2.text.j.a();
            if (jVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = jVarA.f1115e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            L.b bVar = (L.b) fVar.f1107c.f1140a;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.d).getInt(iA + bVar.f137a) : 0);
            Bundle bundle2 = editorInfo.extras;
            fVar.f1105a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        Editable editableText = this.f418a.getEditableText();
        this.f419b.getClass();
        return L.c.u(this, editableText, i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        Editable editableText = this.f418a.getEditableText();
        this.f419b.getClass();
        return L.c.u(this, editableText, i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
