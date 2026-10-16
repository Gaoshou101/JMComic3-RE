package m;

import G.C0029e;
import G.InterfaceC0028d;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: m.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0251G {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0028d iVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                iVar = new X.i(clipData, 3);
            } else {
                C0029e c0029e = new C0029e();
                c0029e.f181b = clipData;
                c0029e.f182c = 3;
                iVar = c0029e;
            }
            G.K.f(textView, iVar.f());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0028d iVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            iVar = new X.i(clipData, 3);
        } else {
            C0029e c0029e = new C0029e();
            c0029e.f181b = clipData;
            c0029e.f182c = 3;
            iVar = c0029e;
        }
        G.K.f(view, iVar.f());
        return true;
    }
}
